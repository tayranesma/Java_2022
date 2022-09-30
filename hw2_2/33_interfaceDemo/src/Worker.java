// şirket çalışanlarının classı

// şirket çalışanlarına yemek veriliyor, IEatable de implement edildi
// şirket çalışanına maaş ödenecek, IPayable implement edildi.
public class Worker implements IWorkable, IEatable, IPayable{

	//şirket çalışanlarına ait iş kuralları
	@Override
	public void work() {
		
	}

	@Override
	public void eat() {
				
	}

	@Override
	public void pay() {
				
	}
	
}
