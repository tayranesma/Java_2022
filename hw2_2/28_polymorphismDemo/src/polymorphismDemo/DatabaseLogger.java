package polymorphismDemo;

// veri tabanına loglayan class
public class DatabaseLogger extends BaseLogger{
	/*
	 *  BaseLogger içindeki Log() metodunu buradaki metod override eder,
	 *  üzerine yazar. EmailLogger classından oluşturulan nesne için, BaseLogger'daki
	 *  Log() metodu değil de EmailLoggerdaki Log() metodu çalışır.
	 */
	
	public void log(String message) {
		System.out.println("Logged to database: "+ message);
	}
}
