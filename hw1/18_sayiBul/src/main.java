
public class main {

	public static void main(String[] args) {
		/*
		 * Bir dizi içindeki elemanlardan belirli bir
		 * elemanın bulunması işlemi.
		 * 
		 * */
		
		int[] numbers = {1,2,5,7,9,0};
		int find = 3;
		boolean isThere = false;
		
		for(int i : numbers) {
			if(find == i) {
				isThere = true;
				break;
			}
		}
		
		if(isThere) {
			System.out.println("Aranan sayı bulundu!");
		}else {
			System.out.println("Aranan sayı bu dizide yok.");
		}

	}

}
