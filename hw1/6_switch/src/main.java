
public class main {

	public static void main(String[] args) {
		//örnek 1
		char grade = 'H';
		
		switch(grade) {
	   	case 'A':
			System.out.println("Mükemmel : Geçtiniz.");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz.");
			break;
		case 'C':
			System.out.println("İyi : Geçtiniz.");
			break;
		case 'D':
			System.out.println("Fena Değil : Geçtiniz.");
			break;
		case 'F':
			System.out.println("Kaldınız.");
			break;
		default: 
			System.out.println("Geçersiz not girdiniz!");
		
	}
		
		// örnek 2
		/*
		 * A+ ve A durumlarında aynı sonucun dönmesini istiyoruz
		 * o halde kod şu şekilde olur:
		 * */
		
		String grade2 = "A+";
		
		switch(grade2) {
		    case "A+":
			case "A":
				System.out.println("Mükemmel : Geçtiniz.");
				break;
			case "B":
				System.out.println("Çok Güzel : Geçtiniz.");
				break;
			case "C":
				System.out.println("İyi : Geçtiniz.");
				break;
			case "D":
				System.out.println("Fena Değil : Geçtiniz.");
				break;
			case "F":
				System.out.println("Kaldınız.");
				break;
			default: 
				System.out.println("Geçersiz not girdiniz!");
			
		}
		
	}

}
