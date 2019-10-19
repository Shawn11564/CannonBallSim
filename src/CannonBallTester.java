import java.util.Scanner;

public class CannonBallTester {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the starting velocity (m/2^2)");
		double velocity = scan.nextDouble();
		System.out.println("Please enter the number of seconds to simulate");
		int seconds = scan.nextInt();

		CannonBall cb = new CannonBall(velocity, seconds);
		cb.run();

	}

}
