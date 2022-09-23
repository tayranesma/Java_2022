
public class main {

	public static void main(String[] args) {
		/* 
		 * double bir dizi oluşturup elemanlarını ekrana yazdıralım
		 * dizinin elemanlarının toplamını bulalım
		 * dizinin en büyük elemanını bulalım
		 *
		 */
		double[] myList = {1.2, 1.3, 4.3, 5.6, 2.2};
		double total = 0;
		double max = myList[0];
		for(double number:myList) {
			System.out.println(number);
			total = total + number;
			
			if(max < number) {
				max = number;
			}
		}
		System.out.println("Dizinin elemanlarının toplamı: "+total);
		System.out.println("Dizinin en büyük elemanı: "+max);
	}

}
