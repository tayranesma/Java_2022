
public class main {

	public static void main(String[] args) {
		/*
		 * Verilen sayının asal sayı olup olmadığını bulan program 
		 * 
		 * Bunun için 30 dan küçük asal sayıların olduğu "prime"
		 * isimli bir dizi oluşturuldu.
		 * 
		 * Bug'sız bir kod için:
		 * ilk önce sayının 2 den büyük olup olmadığı kontrol ediliyor.
		 * Sayı 2 den küçük kod çalışmıyor.
		 * Sayı 2 den büyük veya ona eşit ise 
		 * "verilen sayı prime dizisindeki sayılardan herhangi 
		 * birine bölünüyorsa asal sayı değildir"
		 * mantığıyla kod çalışıyor.
		 * 
		 * Verilen sayı, prime dizisindeki sayılardan 
		 * birine eşitse asal sayıdır.
		 * 
		 * isPrime ile sayının asal olup olmadığına dair sonucu tutuyoruz
		 */
		int number = 191;//-123, 3, 39281 için kodun çalışması denenebilir

		int[] prime = {2,3,5,7,11,13,17,19,23,29};
		boolean isPrime = true;
			
		//sayının asal sayı olup olmadığının kontrolü
		if(number < 2) {
			System.out.println("2 den küçük sayılar asal sayı olamaz!");
			return;
		}else {
			for (int i : prime ) {
				if(number == i) {
					isPrime = true;
				}else if(number % i == 0) {
					isPrime = false;
				}
			}
		}
		
		// sayının asal sayı olup olmadığının sonucunu ekrana yazdırma
		if(isPrime) {
			System.out.println(number+" asaldır.");
		}else {
			System.out.println(number+" asal değildir.");
		}
		
		
		
		
	}

}
