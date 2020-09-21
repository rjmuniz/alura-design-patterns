package singleton;

public class MySingletonImplementation {

	private static MySingletonImplementation instance;

	private MySingletonImplementation() {
	}

	public static MySingletonImplementation getInstance() {
		if (instance == null) {
			synchronized (MySingletonImplementation.class) {
				if (instance == null) {
					instance = new MySingletonImplementation();
				}
			}
		}
		return instance;
	}
	
	
	
	
	private String Username;
	private String Password;
	private String DataSource;
	private String InitialCatalog;

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getDataSource() {
		return DataSource;
	}

	public void setDataSource(String dataSource) {
		DataSource = dataSource;
	}

	public String getInitialCatalog() {
		return InitialCatalog;
	}

	public void setInitialCatalog(String initialCatalog) {
		InitialCatalog = initialCatalog;
	}
	
	

}