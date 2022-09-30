
public class BaseKrediManager {
	// override edilebilir fonksiyon
	public double hesapla(double tutar) {
		return tutar * 1.18;
	}
	
	// override edilemez fonksiyon. Tüm classlar için aynı, değişmez olsun istenen durum
	public final String krediTürü(String mesaj) {
		return mesaj;
	}
}
