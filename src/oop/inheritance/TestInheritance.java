package oop.inheritance;

public class TestInheritance {

	public static void main(String[] args) {
		Parents father = new Parents();
		father.familyHeight();
		father.skinColor();
		father.educationLevel();
		
		Parents mather = new Parents("Khan");
		mather.displayName();
		
		
		Children child1 = new Children();
		child1.familyHeight();
		child1.skinColor();
		child1.atheleticSkills();
		child1.educationLevel();
		
		Children child2 = new Children("My Last Name");
		child2.atheleticSkills();
        
	}

}
