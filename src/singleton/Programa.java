package singleton;

public class Programa {

	public static void main(String[] args) {
		var config = MySingletonImplementation.getInstance();
		System.out.println(config.toString());

	}

}
