package homework;

public class Homework2 {

	public static void main(String[] args) {

		double angle = 10.0;
		double height;
		int initialSpeed = 30;
		double distance;
		short GRAVITATIONAL_FORCE = 10;

		height = ((initialSpeed * initialSpeed) / (2 * GRAVITATIONAL_FORCE) * Math.sin(angle) * Math.sin(angle));

		distance = ((initialSpeed * initialSpeed) / (2 * GRAVITATIONAL_FORCE) * Math.sin(2 * angle));

		System.out.println("Height : " + height);
		System.out.println("Distance: " + distance);

	}

}
