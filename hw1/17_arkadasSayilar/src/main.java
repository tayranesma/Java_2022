
public class main {

	public static void main(String[] args) {
		/*
		 * Arkadaş sayılar: iki pozitif tamsayıdan birincisinin
		 * kendisi hariç pozitif tamsayı bölenlerinin toplamı 
		 * ikinci sayıya eşit ve ikinci sayının kendisi hariç
		 * pozitif tamsayı bölenlerinin toplamı birinci sayıya eşit
		 * ise bu iki sayıya arkadaş sayılar denir.
		 * 
		 * Örneğin: 220 ve 284 arkadaş sayılardır
		 * 220:1+2+4+5+10+11+20+22+44+55+110=284
		 * 284:1+2+4+71+142=220
		 * 
		 * */
		
		int sayi1 = 1184;
		int sayi2 = 1210;
		
		int toplam1 = 0;
		int toplam2 = 0;
		
		//birinci sayı için pozitif bölenlerinin toplamı
		for(int i = 1; i<sayi1; i++) {
			if(sayi1%i == 0) {
				toplam1 = toplam1 + i;
			}
		}
		//ikinci sayı için pozitif bölenlerinin toplamı		
		for(int i = 1; i<sayi2; i++) {
			if(sayi2%i == 0) {
				toplam2 = toplam2 + i;
			}
		}
		
		if((toplam1 == sayi2)&(toplam2 == sayi1)) {
			System.out.println(sayi1+" ve "+sayi2+" arkadaş sayılardır.");
		}else {
			System.out.println(sayi1+" ve "+sayi2+" arkadaş sayılar değillerdir.");
		}

	}

}
