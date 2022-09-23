
public class main {

	public static void main(String[] args) {
		//for döngüsü
		for(int i=1; i<10; i++) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti.");
		
		//while döngüsü -- üstteki for ile aynı çıktıyı verir
		int i=1;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		System.out.println("While döngüsü bitti.");
		
		//while döngüsü -- 50 den küçük olan 2'nin kuvvetlerini döndürür 
		int j=1;
		while(j<50) {
			System.out.println(j);
			j*=2;
		}
		System.out.println("While döngüsü bitti.");
	}

}
