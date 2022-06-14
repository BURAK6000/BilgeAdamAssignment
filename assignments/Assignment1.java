package assignments;

public class Assignment1 {

	public static void main(String[] args) {

		short sidesLength = 30;

		short sidesNumber = 6;
		float PI_NUMBER = 3.14f;

		double area;
		area = (sidesNumber * sidesLength / 2) / (4 * Math.tan(PI_NUMBER / sidesNumber));

		System.out.println("Area of hexagon: " + area);

	}

}
