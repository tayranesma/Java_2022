
public class Main {

	public static void main(String[] args) {
		// Contructor parametresiz ise
		Product product = new Product();		
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		product.setColor("Black");
			
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		System.out.println(product.getCode());

		//Constructor parametreli ise
		Product product2 = new Product(2,"Tablet","Asus Tablet",5000,3,"Black");
		// code  otomatik oluşturuluyor.
		ProductManager productManager2 = new ProductManager();
		productManager2.Add(product2);
		System.out.println(product2.getCode());
	}

}
