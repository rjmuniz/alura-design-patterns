package bridgeAndAdapters;

import java.util.Calendar;

public class RelogioDoSistema implements Relogio {
	public Calendar Hoje() {
		return Calendar.getInstance();
	}
}
