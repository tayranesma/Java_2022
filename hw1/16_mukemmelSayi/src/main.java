
public class main {

	public static void main(String[] args) {
		/*
		 * Mükemmel sayı: Bir tamsayının, kendinden küçük
		 * pozitif tamsayı bölenlerinin toplamı, sayının 
		 * kendisine eşitse bu sayı mükemmel sayıdır.
		 * 
		 * Örneğin 6 mükemmel sayıdır. Kendisinden küçük 
		 * pozitif tamsayı bölenleri 1,2 ve 3 olup, 
		 * bu sayıların toplamları yine 6 ya eşittir.
		 * 
		 * */

		int sayi = 496;
		int toplam = 0; 
		
		// aranan sayı 2 den küçük ise mükemmel sayı değildir. 
		if(sayi <= 2 ) {
			System.out.println(sayi+" mükemmel sayı değildir.");
			return;
		}
		
		// verilen sayının bölenlerinin toplamının bulunması
		for(int i = 1; i<sayi; i++) {
			if(sayi%i == 0) {
				toplam = toplam + i;
			}
		}
		
		// bölenlerin toplamı verlien sayıya eşitse sayı mükemmel sayıdır
		if(toplam == sayi) {
			System.out.println(sayi+" mükemmel sayıdır.");
		}else {
			System.out.println(sayi+" mükemmel sayı değildir.");
		}
		
	}

}
