/*Assign and print the roll number, phone number and address of two students having names "Sam"
and "John" respectively by creating two objects of class 'Student'.*/

class Stud{
	
	int rollnumber;
	long phonno;
	String name;
	String address;
	
	
}
public class ClassQ2 {

	public static void main(String[] args) {
		Stud s1=new Stud();
		s1.rollnumber=1;
		s1.name="Sam";
		s1.phonno=99666996658L;
		s1.address="Pune";
		System.out.println(s1.rollnumber+" "+s1.name+" "+s1.phonno+" "+s1.address);
		
		
		Stud s2=new Stud ();
		s2.rollnumber=2;
		s2.name="John";
		s2.phonno=8888660066L;
		s2.address="Mumbai";
		System.out.println(s2.rollnumber+" "+s2.name+" "+s2.phonno+" "+s2.address);
		

	}

}
