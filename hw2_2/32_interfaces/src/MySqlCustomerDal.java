/*
 * burada extends yerine implements kullanılır
 * yine bizim oluşturmamız gereken operasyonlar olduğu için
 * sol tarfta kızma oldu. Aynı abstracttaki gibi çift tıklamayla
 * oluşturmak mümkün.
 * 
 */
public class MySqlCustomerDal implements ICustomerDal, IRepository{
// bir de bir classın extends edilmesi durumu varsa class şöyle olur:
	//public class MySqlCustomerDal extends OracleCustomerDal implements ICustomerDal, IRepository{

	@Override
	public void Add() {
		System.out.println("My sql eklendi");
		
	}

}
