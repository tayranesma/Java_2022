
public class main {

	public static void main(String[] args) {
		
		
		String mesaj = "Bugün hava çok güzel";
		System.out.println(mesaj);
		
		// her string bir karakter dizisidir.

		// string dizisinin 5. elemanını bulalım
		System.out.println("Dizinin 5. elemanı (4 indisli eleman): "+mesaj.charAt(4));
		
		// string dizisinin uzunluğu
		System.out.println("Eleman sayısı: "+mesaj.length());
		
		// string birleştirme -- atama yapılmadığı için "mesaj" içeriğini değiştirmez
		System.out.println(mesaj.concat(" Yaşasın!"));
		
		// Mesajın belirtilen karakterlerle başlayıp başlamadığını ve bitip bitmediğini sorgulama
		System.out.println(mesaj.startsWith("B"));
		System.out.println(mesaj.endsWith("."));
		
		// stringin belli bir kısmını almak. Bu işlem için bir char dizisine ihtiyaç var
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0); //mesaj'ın 0-5(5 dahil değil) indisli kısmını, karakterler dizisine 0.indisten itibaren ekle
		System.out.println(karakterler);
		
		// bir karakterin, "mesaj" ın içinde ilk kez hangi indiste görüldüğünü bulmak
		System.out.println(mesaj.indexOf("a"));
		
		// karakter aramasını en sağdan başlayarak yapmak
		System.out.println(mesaj.lastIndexOf("a"));
		
		// bir harf grubu/kelimeyi arama
		System.out.println(mesaj.indexOf("çok"));
		
		// replace -- mesajın içeriğini değiştirmek
		// boşlukları - ile değiştirelim
		System.out.println(mesaj.replace(' ', '-'));
		
		// değişikliğin kalıcı olması için bir değişkene atanmalı
		String yeniMesaj = mesaj.replace(' ', '-');
		System.out.println(yeniMesaj);
		
		// substring -- "mesaj"ın içinden bir kısmını seçmek
		System.out.println(mesaj.substring(2)); //2.indisten itibaren ekrana yaz
		
		// substring 2
		System.out.println(mesaj.substring(2, 5)); //2.indisten 5.indise kadar (5 dahil değil) kısmını yaz
		
		// split -- bir stringin kelimelerini ayırmak
		//burada ayırma ölçütü boşluk karakteridir.
		for (String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
		}
		
		// büyük harfleri küçük harf yapmak -- arama işlemlerinde sık kullanılır
		System.out.println(mesaj.toLowerCase());
		
		// küçük harfleri büyük harf yapmak -- arama işlemlerinde sık kullanılır
		System.out.println(mesaj.toUpperCase());
		
		// trim -- stringde fazladan bulunan boşlukları silmek
		String mesaj2 = "      Merhaba!  ";
		System.out.println(mesaj2.trim());
	}

}
