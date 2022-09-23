
public class main {

	public static void main(String[] args) {
		//for döngüsü
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("For döngüsü bitti.");
				
		//while döngüsü -- üstteki for ile aynı çıktıyı verir
		int i=1;
		while(i<=10) {
			System.out.println(i);
			i++;
			}
		System.out.println("While döngüsü bitti.");
		
		//do-while döngüsü
		int j=1;
		do{
		   System.out.println(j);
		   j++;
		}while(j<=10);
		System.out.println("Do-While döngüsü bitti.");	
		
		/*
		 * do-while döngüsünde, şart sağlanmasa bile kod bir kez
		 * çalışır
		 * */
		int k=100;
		do{
		   System.out.println(k);
		   k++;
		}while(k<=10);
		System.out.println("Koşul sağlanmıyor, Do-While döngüsü bir kez çalıştı.");	
		System.out.println("güncel k değeri: "+k);
	}

}
