// ürün eklenecek class
public class ProductManager {
	public void add(Product product) {
		
		// statik yapıyla oluşturmak için:
		if(ProductValidator.isValid(product)) { // isValid()i kullanmak için de, bu metodun olduğu classı static yapmak lazım
			// Veritabanına eklenmiş ve onay mesajı gelmiş varsayıyoruz
			System.out.println("Eklendi");
		}else {
			System.out.println("Ürün bilgileri geçersizdir.");
		}
		
		/*
		 * Static olan yapılar bir kez oluşturulur. Ve tüm kullanıcılar için aynı nesne kullanılır.
		 * 
		 */
		
		// statik olmayan bisey() metodunu çağıracağız:
		ProductValidator productValidator = new ProductValidator();
		productValidator.bisey();
		
	}
}
