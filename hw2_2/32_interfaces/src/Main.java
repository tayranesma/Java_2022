/*
 * uygulamalarda bağımlılığın yönetildiği yapılardandır.
 * OOP için önemli 3 yapı: classes-abstract classes- interfaces
 * interfaces, bir class yapısında olmasa da classlar (ve abstract classlar) 
 * gibi referans tutabilen bir yapıdadırlar.
 * 
 * classda --> tüm operasyonlar tanımlanmış olmalı
 * abstract classda --> tüm operasyonlar tanımlanmış olmak zorunda değil. 
 * Ancak onu inherit eden operasyonları tanımlamalı.
 * interfacede --> tamamlanmamış operasyonlar içerir.
 * 
 * interfaceleri operasyonu implemente edilmesi istenen durumlarda kullanılır.
 * yani kullanıcı isteğine göre operasyonları tanımlayacaksa interface kullanılır.
 * 
 * Data Access Layer - İş katmanı (Manager- kontrol aşaması) - Arayüz katmanları arasında 
 * interfaceler ile geçiş yaparız. (bir katman diğerine bağımlı olmasın diye interface kullanımı yapılır.)
 * 
 * bir class birden fazla interface'i implement edebilir. Bu classlarda olmayan bir durumdu.
 * */

public class Main {

	public static void main(String[] args) {
		/*
		 * // abstractlar gibi interfaceler de new yapılamıyoralr ICustomerDal
		 * customerDal = new ICustomerDal() {
		 * 
		 * @Override public void Add() { // TODO Auto-generated method stub
		 * 
		 * } };
		 */
		/*
		 * // şu şekilde yapmak mümkün: ICustomerDal customerDal = new
		 * OracleCustomerDal(); //interfaceler onu implemente eden classın referansını
		 * tutar (bu da polymorphism oldu)
		 */
		
		CustomerManager customerManager = new CustomerManager(new OracleCustomerDal()); // değişikliklerden dolayı parametreli oldu
		//CustomerManager customerManager = new CustomerManager();
		//customerManager.customerDal = new OracleCustomerDal(); // unutulabilen yapı
		customerManager.add();
		
		CustomerManager customerManager2 = new CustomerManager(new MySqlCustomerDal()); // değişikliklerden dolayı parametreli oldu
		//CustomerManager customerManager2 = new CustomerManager();
		//customerManager2.customerDal = new MySqlCustomerDal(); // unutulabilen yapı
		customerManager2.add();
	}

}
