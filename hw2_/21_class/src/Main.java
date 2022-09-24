
public class Main {
	/*
	 * sürdürülebilir yazılım için class yapısı kullanmak önemlidir.
	 * Classlar ayrı java dosyalarında oluşturur, ve main classında onları çağırırız
	 * 
	 */
		
	public static void main(String[] args) {
		/* 
		 * CustomerManager türünde bir değişken (customerManager) tanımladık. 
		 * = new CustomerManager neden yazılıyor? Yeni oluşturduğumuz customerManager nesnesi için
		 * bellekte (stack bölgesinde)yer tutuluyor ancak = new CustomerManager yazarak, (o nesneye ait
		 * işlemlerin yapılabilmesi için) belleğin heap bölgesine de bu nesnenin varlığını bildirmiş oluyoruz.
		 * 
		 */
		CustomerManager customerManager = new CustomerManager(); 
		
		/* şu şekilde de tanımlama yapılabilir. 2 farklı nesne tanımlanıyor gibi dursa da
		 * aslında stackte 2 nesne oluşur, heap kısmında ikisi de aynı nesneye (customerManager2) ait yeri gösterir.
		 * Heap'te kullanılmayan nesneyi Garbage Collector bellekten siler.
		 * Bu işlem de maliyetli olur, onun için gerekli olmayan tanımlamalar yapılmamalı.
		 * 
		 * CustomerManager customerManager;
		 * CustomerManager customerManager2 = new CustomerManager();
		 * customerManager = customerManager2;
		*/
		
		// CustomerManager classına ait tüm metodlar customerManager değişkeni için
		// otomatik olarak oluşturulmuş oluyor
		customerManager.Add();
		customerManager.Remove();
		customerManager.Update();
		
		// referans verme ile ilgili kısa örnekler:
		
		/*
		 * sayi1 ve sayi2 iki ayrı değişken olarak tanımlandı ve değer atamaları yapıldı.
		 * Ancak sonra sayi2 = sayi1 diyerek, sayi2 nin değerini değiştirmiş olduk
		 * artık güncel sayi2 değeri 10 dur. Sonrasında sayi1 = 30 ile sadece sayi1 in 
		 * değeri değiştirilmiştir. 
		 * */
		int sayi1 = 10;
		int sayi2 = 20;
		sayi2 = sayi1; 
		sayi1 = 30;
		System.out.println(sayi2); // Ekrana 10 yazar
		
		// kısa örnek-2
		
		// her ikisi de int türünde dizi tanımlama için kullanılabilir
		
		/*
		 * Bu örnek de üsttekine benziyor ama farklı bir durum var.
		 * Diziler referans tipli olduklarından onlara hafızada yer tutulur.
		 * Bu nedenler sayilar2 = sayilar1; dediğimizde artık sayilar2 dizisi sayilar1 in aynısı olur
		 * Sonrasında sayilar1 de yapılan tüm değişiklikler, sayilar2 yi de etkiler.
		 * 
		 * */
		int[] sayilar1 = {1,2,3};
		int[] sayilar2 = new int[]{4,5,6};
		
		sayilar2 = sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]+","+sayilar2[1]+","+sayilar2[2]); // Ekrana 10,2,3 yazar
		
	}

}

