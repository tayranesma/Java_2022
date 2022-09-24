
public class Main {
	/* Bazen metodların (fonksiyon/operasyon) içinde
	 * parametre kullanmamız gerekebilir
	 * 
	 * void metodlar : bir işlemin yapılması istendiğinde kullanılır.
	 * sadece istenen işlemi gerçekleştirir. Bir dönüşü olmaz. 
	 * 
	 * println() ile bir mesaj yazılması, fonksiyonun bir değer döndürdüğü
	 * anlamına gelmez!
	 * 
	 * Bir değişkene, bir void metodun sonucunu atayamayız. Çünkü bir sonuç döndürmüyor.
	 * 
	 * Variable Args -- fonksiyonun kaç tane değişken kullanacağı baştan
	 * belli değilse kullanılır.
	 * 
	 */
	
	public static void main(String[] args) {
		String mesaj = "Bugün hava çok güzel.";
		
		String yeniMesaj = sehirVer();
		System.out.println(yeniMesaj);
		
		int sayi = topla(5,3);
		System.out.println("İki sayının toplamı: "+sayi);
		
		int toplam = topla2(2,3,4,5,6,7);
		System.out.println("Sayı dizisinin toplamı: "+toplam);
	}
	
	public static void ekle() {
		System.out.println("Eklendi.");
	}
	
	public static void sil() {
		System.out.println("Silindi.");
	}
	
	public static void guncelle() {
		System.out.println("Güncellendi.");
		return; // burda bir geri dönüş değeri yok, fonksiyonu bitirdiğimizi söylüyoruz sadece
	}
	
	// bu fonksiyon int türünde bir değer döndürür
	public static int topla(int sayi1, int sayi2) {
		return sayi1 + sayi2; // fonksiyon çalışınca, toplamın sonuç değerini döndürür.
	}
	
	public static String sehirVer() {
		return "Ankara"; // dönüş değeri string olan bir fonksiyon
	}
	
	// Variable args örneği -- ... ile bunu belirtiyoruz, bir nevi
	// integer arrayini parametre olarak göndermişiz gibi oluyor
	public static int topla2(int... sayilar) {
		int toplam = 0;
		
		for(int sayi:sayilar) {
			toplam += sayi;
		}
		
		return toplam;
	}

}
