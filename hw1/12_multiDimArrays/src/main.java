
public class main {

	public static void main(String[] args) {
		/*
		 * satır ve sütun cinsinden çoklu veri içerir.
		 * matris yapısıdır.
		 * 
		 * */
		String[][] sehirler = new String[3][3];
		sehirler[0][0] = "İstanbul";
		sehirler[0][1] = "Bursa";
		sehirler[0][2] = "Bilecik";
		sehirler[1][0] = "Ankara";
		sehirler[1][1] = "Konya";
		sehirler[1][2] = "Kayseri";
		sehirler[2][0] = "Diyarbakır";
		sehirler[2][1] = "Şanlıurfa";
		sehirler[2][2] = "Gaziantep";
		
		for(int i=0; i<3;i++) {
			System.out.println("--Satır "+i+"--");
			for(int j = 0; j<3;j++) {
				System.out.println(sehirler[i][j]);
			}
		}
		
		/*
		 * Aynı çok boyutlu dizi şu şekilde de yazılabilir:
		 * String[][] sehirler2 = {{"İstanbul","Bursa","Bilecik"},{"Ankara","Konya","Kayseri"},{"Diyarbakır","Şanlıurfa","Gaziantep"}} ;
		 * Dizinin istenen bir elemanını ekrana yazırmak için:
		 * System.out.println(sehirler2[0][2]); 
		 * kullanılabilir
		 * 
		 */
			
	}

}
