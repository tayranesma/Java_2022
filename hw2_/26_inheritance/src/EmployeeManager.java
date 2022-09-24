// Hem EmployeeManager'da hem de CustomerManager'da ortak olan bazı metodlar var

public class EmployeeManager extends PersonManager{
	// sadece bu classa özgü olan metod bulunsa yeter
	public void BestEmployee() {
		System.out.println("Ayın elemanı getirildi.");
	}
}
