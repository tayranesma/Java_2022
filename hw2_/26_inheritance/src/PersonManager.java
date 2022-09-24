// Bu classta ise hem EmployeeManager hem de CustomerManager classlarında
// ortak olan metodları bu classta oluşturup deiğer classlarda da kullanılmasını sağlıyoruz.

public class PersonManager {
	public void List() {
		System.out.println("Listelendi.");
	}
	
	public void Add() {
		System.out.println("Eklendi.");
	}
}
