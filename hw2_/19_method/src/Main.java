
public class Main {

	public static void main(String[] args) {
		/*
		 * Yazdığımız kodun daha verimli olması için
		 * modülleri kullanırız.
		 * 
		 * Daha önce oluşturulan sayiBul() (bu çalışmada findNumber() yaptım) 
		 * metodunu çağırmak için main fonksiyonunda yazmak yeterli.
		 * 
		 * Main fonksiyonu içinde farklı satırlarda sayiBul()
		 * fonksiyonu(metodu) kullanacak olsaydık, her defasında
		 * yeniden fonksiyonu tekrar tanımlamak, değişkenleri
		 * tekrar değiştirmek gerekirdi. Ancak main classı dışında
		 * sayiBul() fonksiyonunu bir kez tanımayarak, ihtiyaç olan 
		 * her yerde yeniden tanımlama yapmaya gerek kalmadan
		 * istendiği kadar fonksiyonu kullanmak mümkün.
		 * 
		 * */		
		findNumber();
	}
	
	public static void findNumber() {

		int[] numbers = {1,2,5,7,9,0};
		int find = 3;
		boolean isThere = false;
		
		for(int i : numbers) {
			if(find == i) {
				isThere = true;
				break;
			}
		}
		
		if(isThere) {
			printMessage("Aranan sayı bulundu!" + find);
		}else {
			printMessage("Aranan sayı bu dizide yok.");
		}

	}
	/* metod içinde yazma işlemi yapmak yerine
	 * yazdırmak istediğimiz mesajı bir başka 
	 *metod ile yapalım
	*/
	public static void printMessage(String message) {
		System.out.println(message);
	}
		
}
