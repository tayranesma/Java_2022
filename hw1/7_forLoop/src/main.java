
public class main {

	public static void main(String[] args) {
		/*
		 * 1 den 10 a kadar (10 dahil değil) sayıları 
		 * ekrana yazdırma
		 * */
		
		for(int i=1; i<10; i++) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti.");
		
		
		/*
		 * 1 den 10 a kadar tek sayıları ekrana yazdırma
		 * */
		for(int i=1; i<10; i+=2) {
			System.out.println(i);
		}
		
		/*
		 * 0 dan 10 a kadar çift sayıları ekrana yazdırma
		 * */
		for(int i=0; i<10; i+=2) {
			System.out.println(i);
		}
		
	}

}
