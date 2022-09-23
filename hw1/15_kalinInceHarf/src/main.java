
public class main {

	public static void main(String[] args) {
		/*
		 * Verilen harf kalın sesli harf mi ince sesli harf mi bulan program
		 * 
		 * Önce verilen harf sesli mi kontrolü yapılır.
		 * Sonra switch case ile ince-kalın ses kontrolü yapılır.
		 * En son olarak sonuç ekrana yazdırılır.
		 * 
		 * */
		
		//benim kodum bu, çalışmıyor.
		char harf = 'e';
		char[] sesliler = {'a','e','ı','i','o','ö','u','ü'};
		
		// aranan harf sesli mi kontrolü
		for (char c : sesliler) {
			if(c == harf) {
				System.out.println(harf+" sesli harftir.");
				return;
			}else {
			System.out.println(harf+" sesli harf degildir.");
				return;
			}
			}
			
		//hocanın kodu bu, çalışıyor
		char harf2 = 'I';
		
		switch (harf2) {
		case 'A': 
		case 'I':
		case 'O':
		case 'U': 
			System.out.println(harf2+" kalın sesli harftir.");
			break;
		default:
			System.out.println(harf2+" ince sesli harftir.");
		}
	}
}
