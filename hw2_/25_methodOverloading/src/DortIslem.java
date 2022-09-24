/* DortIslem classında önceden var olan 2 parametreli topla()
 * metodunu değiştirip 3 parametreli hale getirmek yerine, aynı isimde
 * 3 parametre kabul eden bir başka metod oluşturup, hangisi isteniyorsa onu çalıştırabiliriz.
 * Tıpkı stringlerde kullanılan substring() metodounun
 * sadece beginIndex alan hali ve hem beginIndex hem de endIndex alan halinin olması gibi.
 * 
 */


public class DortIslem {
	public int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	
	public int topla(int sayi1, int sayi2, int sayi3) {
		return sayi1+sayi2+sayi3;
	}
	
	
}


