/*
 * Bir bankacılık uygulamasında bir takım kredilerin olduğunu
 * düşünüp buna uygun bir program oluşturuyoruz
 * 
 * 
 * */
public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		
		// 4 metod da sorunsuz çalışır.
		// Bu yapı polymorphism yapısıdır.
		krediUI.KrediHesapla(new BaseKrediManager());
		krediUI.KrediHesapla(new OgretmenKrediManager());
		krediUI.KrediHesapla(new TarımKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager());
	}

}
