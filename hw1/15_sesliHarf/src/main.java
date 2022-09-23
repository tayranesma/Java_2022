
public class main {

	public static void main(String[] args) {
		/*
		 * Verilen harf kalın sesli harf mi ince sesli harf mi bulan program
		 * 
		 * Switch case ile ince ve kalın olan sesli harflerin kontrolü yapılır.
		 * Uygun olan case'e göre harfin ince/kalın sesli harf olması veya
		 * sesli harf olmaması yazdırılır.
		 * 
		 * */
		
		char harf = 'B';
		
		switch (harf) {
			// harf kalın sesli harf ise:
			case 'A':
			case 'a':
			case 'I':
			case 'ı':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				System.out.println(harf+" kalın sesli harftir.");
				break;
			// harf ince sesli harf ise:
			case 'E':
			case 'e':
			case 'İ':
			case 'i':
			case 'Ö':
			case 'ö':
			case 'Ü':
			case 'ü':
				System.out.println(harf+" ince sesli harftir.");
				break;
			// harf sessiz harf ise:
			default:
				System.out.println(harf+" sesli harf değildir.");
				break;
			}
	}

}
