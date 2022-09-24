// Ürünlere ait bilgilerin tutulduğu sınıf
// Burada, bu ürünlerle yapılabilecek işlemleri tutmuyoruz, bu işlem
// için ProductManager classını oluşturduk.

public class Product {
	
	// Product class'ının field veya attribute'ları: 
	private int _id; // niye id değil de _id yazdık? karışıklık olmasın diye.
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _kod;
	
	/*
	 * Burada tanımlanan attribute'lar varsayılan olarak publictir.
	 * Bu ise bu attributelara her yerden erişimi sağlar ama bu güvenli değildir.
	 * Daha güvenli hale getirmek için, private yapıp get ve set yapılarını kullanarak
	 * attributeları kullanırız.
	 * 
	 * Örneğin, ürünlerimize birer kod verilsin ama bunlar elle yazılmasın veya veritabanından çekilmesin.
	 * kod, ürünün baş harfi ve id sinin birleşiminden oluşsun istiyoruz. Bu durumda kullanıcının müdehale
	 * edemediği bu durumlar için (kodu read only yapmak için) get ve set fonksiyonlarını kullanırız.
	 * */
	
	// getter -- sadece bu olursa read only olur.
	// get ise bir değer döndürmeli, onun için void dışında bir veri tipi olmalı
	public int getId() {
		return _id; // id yi okuyabilir ama id ye değer atayamaz
	}
	
	// setter -- her zaman olmak zorunda değil ama olursa yazma işlemini yapmayı sağlar
	// set ise bir değer döndürmek zorunda değil, void olmalı. Ancak neyi set edeceği parametre olarak verilmeli.
	public void setId(int id) {
		_id  = id; // _id --> product'ın id si, = id ise set edilecek id değeri
		/* eğer attribute, _id değil de id olarak tanımlı olsaydı
		 * _id yerine this.id de kullanılabilirdi. (hem attribute hem de değişken id olunca karışmasın diye) 
		 */
	}
	
	//getter ve setterları elle yazmak yerine kısace her bir field için 
	// fiealdın üzerine gelip sağ tıkayıp Refactor > Encapsulate field > ok 
	// ile her bir field için get ve set fonksiyonları oluşturulabilir
	// Ayrıca, isimlerde değişiklik yapmak mümkün.
	
	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		this._name = _name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String _description) {
		this._description = _description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double _price) {
		this._price = _price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int _stockAmount) {
		this._stockAmount = _stockAmount;
	}

	public String getKod() {
		// kod için belirli bir ifadenin olmasını istiyoruz, onun tanımını yapalım:
		return _name.substring(0,1) + _id;
		// bu geri dönüş ifadesi koda karşılık gelecek.
	}
	/* kodun yazılabilir olmasını istemediğimiz için setKod() metodunu sildik
	 * 
	 *public void setKod(String _kod) {
	 *	this._kod = _kod;
	 *}
	 */
	
}
