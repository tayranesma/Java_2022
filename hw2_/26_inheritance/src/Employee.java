/*// tekrarlı ifadelerle Employee classı oluiturmak yerine
public class Employee {
	int id;
	String firstName;
	String lastName;
	int age;
	double salary;
}*/

// Person classından ortak olan fieldları (attribute, özellik) inherit alarak
// (miras yoluyla) Employee classını oluşturalım:
public class Employee extends Person{
	double salary;
}