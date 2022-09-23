
public class main {

	public static void main(String[] args) {
				
		/*
		 * 3 elemanlı bir String dizisi oluşturalım.
		 * indeksler 0 dan başlıyor
		*/
		String[] ogrenciler = new String[3]; 
		ogrenciler[0] = "Hale";
		ogrenciler[1] = "Lale";
		ogrenciler[2] = "Jale";
		//ogrenciler[3] = "Nil"; 
		//dizi 4 elemandan oluşsun dediğimiz için bu elemanı kabul etmez
 
		//ogrenciler dizisini ekrana yazdıralım
		for(int i=0; i<3; i++) {
			System.out.println(ogrenciler[i]);
		}
		
		System.out.println(""); //boş satır için
		
		//elemanları ekrana yazdırmak için başka bir yöntem
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
