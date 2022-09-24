// constructor, bir nevi classı yapan metottur

public class Product {
	
	// Main'de new Product()'a ait bir değer verilmesine gerek yok
	public Product() {
		System.out.println("Yapıcı blok çalıştı.");
	}
	
	// Main'de new Product() kısmında, Product()'a ilgili parametrelere ait değerlerin verilmesi gerekir.
	public Product(int id, String name, String description, double price, int stockAmount, String color) { 
		System.out.println("Yapıcı blok çalıştı.");
		this._id = id;
		this._name = name;
		this._description = description;
		this._price = price;
		this._stockAmount = stockAmount;
		this._color = color;
				
	}
	// Aynı işi yapan constructor'dan aynı adda iki farklı tanımlama yapmak mümkün
	// Böylece hangisinin kullanılacağının önemi olmuyor
	// bu işleme Overload denir
	
	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _code;
	private String _color;
	
	public int getId() {
		return _id;
	}
	
	// setter -- her zaman olmak zorunda değil ama olursa yazma işlemini yapmayı sağlar
	// set ise bir değer döndürmek zorunda değil, void olmalı. Ancak neyi set edeceği parametre olarak verilmeli.
	public void setId(int id) {
		_id  = id;
	}
	
	//getter ve setterları elle yazmak yerine kısace her bir field için 
	// fieldın üzerine gelip sağ tıkayıp Refactor > Encapsulate field > ok 
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

	public String getCode() {
		// kod için belirli bir ifadenin olmasını istiyoruz, onun tanımını yapalım:
		return _name.substring(0,1) + _id;
	}
	
	public String getColor() {
		return _color;
	}

	public void setColor(String _color) {
		this._color = _color;
	}

}
