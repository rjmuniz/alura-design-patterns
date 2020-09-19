package observer;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class NotaFiscalBuilder {
	private String razaoSocial;
	private String cnpj;
	private double valorBruto;
	private double impostos;
	private String observacoes;
	private Calendar data;

	private List<ItemDaNota> todosItens = new ArrayList<ItemDaNota>();
	
	private List<AcaoAposGerarNotaFiscal> todasAcoesASeremExecutadas;
	
	public NotaFiscalBuilder() {
		this.data = Calendar.getInstance();
		todasAcoesASeremExecutadas = new ArrayList<AcaoAposGerarNotaFiscal>();
	}

	public NotaFiscalBuilder AdicionaAcao(AcaoAposGerarNotaFiscal acao) {
		this.todasAcoesASeremExecutadas.add(acao);
		return this;
	}
	
	public NotaFiscalBuilder paraEmpresa(String razaoSocial) {
		this.razaoSocial = razaoSocial;
		return this;
	}

	public NotaFiscalBuilder comCnpj(String cnpj) {
		this.cnpj = cnpj;
		return this;
	}

	public NotaFiscalBuilder comItem(ItemDaNota item) {
		this.todosItens.add(item);
		this.valorBruto += item.getValor();
		this.impostos = item.getValor() * 0.05;
		return this;
	}

	public NotaFiscalBuilder comObservacoes(String observacoes) {
		this.observacoes = observacoes;
		return this;
	}

	public NotaFiscalBuilder naData(Calendar data) {
		this.data = data;
		return this;
	}

	public NotaFiscal build() {
		NotaFiscal nf = new NotaFiscal(razaoSocial, cnpj, data, valorBruto, impostos, todosItens, observacoes);

		
		for(AcaoAposGerarNotaFiscal acao : todasAcoesASeremExecutadas) {
			acao.executa(nf);
		}

		return nf;
	}

}
