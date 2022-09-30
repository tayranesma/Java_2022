/* Bir ürünü kaydederken veya güncellerken, 
 * ürünün kurallara uygun olup olmadığının incelendiği class
 */
public class ProductValidator {
	
	// static constructor-- birden fazla oluşturulabilir
	static {
		System.out.println("Statik yapıcı blok çalıştı.");
	}
	
	// constructor
	public ProductValidator() {
		System.out.println("Yapıcı blok çalıştı");
	}
	
	public static boolean isValid(Product product) {
		if(product.price>0 && !product.name.isEmpty()) {
			return true;
		}else {
			return false;
		}
	}
	
	// bisey() metodunu çağırabilmek için ProuctValidation'ı new ile oluşturmak gerekir
	public void bisey() {
		
	}
	
	// inner class
	public static class BaskaBirClass {
		public static void Sil() {
			
		}
	}
}
