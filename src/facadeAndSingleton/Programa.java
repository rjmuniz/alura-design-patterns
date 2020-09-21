package facadeAndSingleton;

public class Programa {

	public static void main(String[] args) {
		EmpresaFacade facade = EmpresaSingleton.getInstancia();
		Cliente cliente = facade.buscaCliente("123456789");
		Fatura fatura = facade.criaFatura(cliente, 400.0);
		Cobranca cobranca = facade.geraCobranca(fatura);
		facade.fazContato(cliente, cobranca);

	}

}
