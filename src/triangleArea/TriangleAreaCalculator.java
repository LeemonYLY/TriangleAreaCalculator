package triangleArea;

public class TriangleAreaCalculator {

	public static void main(String[] args) {
		double sideA = Double.parseDouble(args[0]);
		double sideB = Double.parseDouble(args[1]);
		double sideC = Double.parseDouble(args[2]);

		double semiPerimeter = func1(sideA, sideB, sideC);
		double area = func2(sideA, sideB, sideC, semiPerimeter);

		area = Math.round(area * 100) * 1.0 / 100;
		System.out.println(area);
	}

	// Check if the given side lengths form a valid triangle
	public static boolean isValidTriangle(double sideA, double sideB, double sideC) {
		return sideA + sideB > sideC && sideA + sideC > sideB && sideB + sideC > sideA;
	}

	// Calculate the semi-perimeter of the triangle
	public static double func1(double sideA, double sideB, double sideC) {
		return (sideA + sideB + sideC) / 2;
	}

	// Calculate the area of the triangle using Heron's formula
	public static double func2(double sideA, double sideB, double sideC, double semiPerimeter) {
		double areaSquared = semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB)
				* (semiPerimeter - sideC);
		if (areaSquared <= 0) {
			return -1.0;
		}
		return Math.sqrt(areaSquared);
	}
}
