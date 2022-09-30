package polymorphismDemo;

/*
 * polymorphism -- çok biçimlilik
 * aralarında inheritance bağı olan referans tiplerinin 
 * birbirinin referanslarını tutmaları durumudur.
 * 
 * Bu çalışmada log işlemleri üzerinde çalışacağız.
 * 
 * */
public class Main {

	public static void main(String[] args) {
		
		//EmailLogger logger = new EmailLogger();
		//logger.log("Log mesaji");
		
		// BaseLogger türünde array oluşturme
		/*
		 * BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new
		 * DatabaseLogger(), new EmailLogger(), new ConsoleLogger()}; for (BaseLogger
		 * logger:loggers) { logger.log("Log mesaji"); }
		 */
		
		// CustomerManager içinde oluşturulan constructora göre
		// burada polymorphism ile istenen türde log oluşturup, ilgili yere kaydedilmesi yapılacak
		CustomerManager customerManager = new CustomerManager(new DatabaseLogger()); // bir süre sonra EmailLogger() olması istenirse, sadece bu kısmın değişmesi yeterli olacaktır.
		customerManager.add();
		
	}

}
