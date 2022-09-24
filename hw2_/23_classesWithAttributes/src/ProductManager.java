// Ürünlerin (Product) yönetileceği, kullanılacağı sınıf 
// Oluşturulan ürünlere ait yapılabilecek tüm işlemler 
// burada tanımlanıyor.

public class ProductManager {
	/*
	 * Add() metodu, Product türünde productları alarak
	 * ilgili yere (şimdi yapmadığımız veritabanına (JDBC kodlarını kullanacağız)) 
	 * eklenmelerini sağlıyor.
	 * 
	 * */
	public void Add(Product product) {
		// System.out.println("Ürün eklendi. " + product._name ); // getter setter kullanılmazsa
		System.out.println("Ürün eklendi. " + product.getName() );  // getter setter kullanılırsa
	}
	/* Add() metodunu, (int id, String name, String description, int stockAmount, double price)
	 * şeklinde de tanımlamak mümkün ama bu durumda, ürün özelliklerine
	 * ekleme (veya çıkarma) durumunuda fonksiyonun aldığı parametrelerde oluşan değişiklik
	 * elle düzeltilmeli ama bu da çok zaman alıcı bir durum. 
	 * 
	 **/
}
