package oop.inheritance;

public class Children extends Parents {

	public Children() {}
	
	public Children(String lastName) {
		super(lastName);
		System.out.println(lastName);
	}
	
	
	public void atheleticSkills() {
		super.educationLevel();
		System.out.println("Childrens are more athletic than their parents");
	}
}
