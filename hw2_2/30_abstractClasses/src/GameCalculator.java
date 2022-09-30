// base-temel classımız bu

/*public class GameCalculator {
	public void hesapla() {
		System.out.println("Puanınız: 100");
	}
	
	public void gameOver() {
		System.err.println("Oyun bitti.");
	}
}*/

// üstteki classın abstract hali
public abstract class GameCalculator {
	// bu metodun bir default değeri olmasın istiyoruz
	public abstract void hesapla();
	
	// bir abstract sınıfta abstract metod olmak zorunda değil.
	
	public final void gameOver() {
		System.out.println("Oyun bitti.");
	}
	
	/*
	 * GameCalculator classını kullanan kullanıcı, 
	 * gameOver metodunu olduğu gibi kullanmak zorunda, değişiklik yapamaz.
	 * Ancak hesapla() metodunu her class(kullanıcı classları) için override
	 * etmeli, kendi hesapla() metodu olmalı.
	 * */
}
