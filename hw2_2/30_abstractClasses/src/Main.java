/*
 * Abstract (soyut) sınıflar da bir sınıftır. 
 * Ancak yapısal olarak farklılık olmasa da kullanım açısından farklar vardır. 
 * Bir sınıf sadece bir tane abstract sınıfı inherit edebilir.
 * 
 * syntax olarak bazı farklılıklar vardır.
 * 
 * */

/*
 * Bu örnekte bir oyun yazdığımızı ve oyunda kullanıcıya göre (erkek, kadın, çocuk) 
 * puan hesabı yapan bir class oluşturduğumuzu düşünüyoruz.
 * Kadın ve erkeklerin puan hesabında fark olmasın, çocuklar için farklılık olsun.
 * 
 * */

public class Main {

	public static void main(String[] args) {
		WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
		//womanGameCalculator.hesapla();
		//womanGameCalculator.gameOver();
		
		GameCalculator[] gameCalculators = new GameCalculator[] {new ManGameCalculator(), new WomanGameCalculator(), new KidsGameCalculator()};
		for (GameCalculator gameCalculator:gameCalculators) {
			gameCalculator.hesapla();
			gameCalculator.gameOver();
		}
		
		// abstract sınıflar şu şekilde oluşturulamaz:
		GameCalculator gameCalculator = new GameCalculator() {
			// burada her yeni oluşturulan class için hesapla()
			// metodunu yeniden tanımlamak gerekir. 
			// Tavsiye edilen bir yöntem değil
			@Override
			public void hesapla() {
				// TODO Auto-generated method stub
				
			}
		};
		
		// şu şekilde de class oluşturulabiilir
		GameCalculator gameCalculator2 = new WomanGameCalculator();
		
		
	}

}
