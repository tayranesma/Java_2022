// Her zaman çalışan sınıf

public class Main {

	public static void main(String[] args) {
		Product product = new Product();
		/* public bir field tanım olsaydı bu şekilde ilk atamaları yapardık
		 *	product._name = "Laptop";
		 *	product._id = 1;
		 *	product._description = "Asus Laptop";
		 *	product._price = 5000;
		 *	product._stockAmount = 3;
		 *	product._renk = " ";
		*/
		
		// private bir field tanımı olduğu için getter ve setter kullanarak ilk atamaları yaparız
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(5000);
		product.setStockAmount(3);
		// set ile kodu tanımlamıyorduk, o otomatik olarak tanımlandı.
		
		ProductManager productManager = new ProductManager();
		productManager.Add(product);
		// tanımlanan kodu görelim:
		System.out.println(product.getKod());
		
	}

}
