
public class CustomerManager {
	// hangi veritabanından veriyi alacağımızı bilmediğimiz için
	// bir tane BaseDatabaseManager türünde nesne oluşturup, getCustomers()'da
	// hangi veritabanından veri gönderilirse, ona göre çalışacak
	
	BaseDatabaseManager databaseManager;
	
	public void getCustomers() {
		databaseManager.getData();
	}
}
