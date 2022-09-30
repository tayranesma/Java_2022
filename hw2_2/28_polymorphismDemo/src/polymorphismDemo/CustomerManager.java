package polymorphismDemo;

public class CustomerManager {
	/* 
	 * müşterinin eklendiğine dair sisteme log bilgisi kaydedelim
	 * Bunu DatabaseLogger ile de yapabilirdik ama çok fazla veri olduğu durumlarda
	 * ya da bir değişiklik yapılması (bir süre sonra loglamaların tutulduğu yerin email 
	 * olması istenebilir, EmailLogger türünde yeniden nesne oluşturmak zor olacaktır) 
	 * gerektiği durumlarda işler karışır. Bu kadar birbirine bağımlı sistem oluşturmaya gerek yok.
	 * Bunun yerine private BaseLogger türünde field (alan/attribute) oluştururuz.
	 */
	
	private BaseLogger baseLogger; //logger da diyebilirdik
	
	// constructor
	public CustomerManager(BaseLogger logger) {
		this.baseLogger = logger; // yukarıda logger diye tanımlanırsa, this.logger olması gerekir
	}
	
	// veri tabanına müşteri ekleyen metod:
	public void add() {
		System.out.println("Müşteri eklendi!");
		this.baseLogger.log("log mesaji");
		
	}
}
