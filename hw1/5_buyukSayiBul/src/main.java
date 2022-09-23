
public class main {

	public static void main(String[] args) {
		// 3 sayıdan en büyüğünü bulan program
		/*
		 * sayılar: a, b ve c olsun. 
		 * a, b ve c den büyükse en büyük sayı a'dır
		 * b, a ve c den büyükse en büyük sayı b'dir
		 * c, a ve b den büyükse en büyüksayı c'dir
		 * son olarak, tüm sayılar birbirine eşit olabilir.
		 * 
		 * */	
		int a = 10, b = -10, c = 0;
		
		if((a>b)&(a>c)) {
			System.out.println("en büyük sayı a olup, değeri: "+a+" dır.");
		}else if((b>a)&(b>c)) {
			System.out.println("en büyük sayi b olup, değeri: "+b+" dır.");
		}else if((c>a)&(c>b)){
			System.out.println("en büyük sayi c olup, değeri: "+c+" dır.");
		}else {
			System.out.println("Sayılar birbirine eşittir ve değeri: "+a+" dır.");
		}

	}

}
