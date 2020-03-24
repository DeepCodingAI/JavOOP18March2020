package oop.inheritance;

public class Parents extends GrandParents{
	public String familyName;
	public final String firstName = "Mohammad";
	
	public Parents() {}
	
	public Parents(String familyName) {
		this.familyName = familyName;
	}
	
	public void displayName() {
		System.out.println(this.familyName);
	}
	public String color = "semi-white";
	public int height = 6;
	
	public void skinColor() {
		System.out.println(color);
	}

	public void familyHeight() {
		System.out.println(height);
	}
}
