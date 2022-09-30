
public class CustomerManager {
	
	private ICustomerDal customerDal; // kod yazılırken (main kısmında) unutulması mümkün bir yapı
	// maindeki bu işlemlerden etkilenen satırlar (39-40 ve 44-45.satırlar) yorum yapıldı
	// unutulmasın diye şunu kullanırız:
	public CustomerManager(ICustomerDal customerDal) {
		this.customerDal = customerDal;
	}
	
	public void add() {
		// iş kodları (müşteri adı ve diğer veriler doğru mu? kontrolü)
		//OracleCustomerDal oracleCustomerDal = new OracleCustomerDal(); // kullanılırsa sistem oracle'a bağlı olur
		customerDal.Add();
	}
}
