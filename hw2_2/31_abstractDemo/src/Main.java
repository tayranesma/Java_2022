/*
 * Bir müşterinin veritabanına eklenmesi işlemini gerçekleştirelim.
 * 
 * Farklı veritabanı sistemiyle (oracla, mssql, mysql vs) çalışılabileceği için
 * ve bunun hangisi olduğunu bilmediğimiz için, abstract yapısıyla classları
 * oluşturup, kullanıcının hangi veritabanını kullanıyorsa ona ait sql sorgusu yazmasını
 * mümkün kılacağız.
 * 
 * */

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager();
		//customerManager.databaseManager = new OracleDatabaseManager(); // oracle ile çalışmak için -- başka biryeri değiştirmeye gerek yok
		//customerManager.databaseManager = new SqlServerDatabaseManager(); // Sql Server ile çalışmak için -- başka biryeri değiştirmeye gerek yok
		customerManager.databaseManager = new MySqlDatabaseManager(); // MySql ile çalışmak için -- başka biryeri değiştirmeye gerek yok
		customerManager.getCustomers();

	}

}
