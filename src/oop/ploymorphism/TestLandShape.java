package oop.ploymorphism;

public class TestLandShape {

	public static void main(String[] args) {
		ShapeCalculator cal = new ShapeCalculator();
		int resultOfLine = cal.areaOfLand(5, 8);
		System.out.println(resultOfLine);
		int resultOfTriangle = cal.areaOfLand(5, 8, 10);
		System.out.println(resultOfTriangle);
		int resultOfRectangle = cal.areaOfLand(5, 8, 10,20);
		System.out.println("Measurement from Traditional Cal of Rec: " + resultOfRectangle);
		
		ModernShapeCalculator mCal = new ModernShapeCalculator();
		int resultOfMCRectangle = mCal.areaOfLand(5, 8, 10,20);
		System.out.println("Measurement from Modern Cal of Rec: " + resultOfMCRectangle);
		

	}

}
