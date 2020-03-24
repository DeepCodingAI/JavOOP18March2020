package oop.ploymorphism;

public class ShapeCalculator {

	public int areaOfLand(int a, int b) {
		int total = a + b ;
		
		return total;
	}
	
	public int areaOfLand(int a, String name) {
		int total = a ;
		System.out.println(name);
		return total;
	}
	
	public int areaOfLand(String name, int a) {
		int total = a ;
		System.out.println(name);
		return total;
	}
	
	public final int areaOfLand(int a, int b, int c) {
		int total = a + b + c ;
		
		return total;
	}
	
	public int areaOfLand(int a, int b, int c, int d) {
		int total = a + b + c + d;
		
		return total;
	}
}
