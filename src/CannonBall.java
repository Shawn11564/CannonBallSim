public class CannonBall {

	private final double gravity = 9.81;
	private final double deltaT = 0.01;
	private double velocity;
	private double position;
	private int seconds;

	public CannonBall(double velocity, int seconds) {
		this.velocity = velocity;
		this.seconds = seconds;
	}

	public void run() {
		for (int i = 0; i < seconds; i++) {
			for (int j = 0; j < 100; j++) {
				updatePos();
				updateVel();
			}
			print(i);
		}
	}

	public void updatePos() {
		position = position + velocity * deltaT;
	}

	public void updateVel() {
		velocity = velocity - gravity * deltaT;
	}

	public double getExact() {
		return -0.5 * gravity * Math.pow(deltaT, 2) + velocity * deltaT;
	}

	public void print(int second) {
		System.out.println("\nCurrent Second: " + second + 1);
		System.out.println("Position: " + position);
		System.out.println("Velocity: " + velocity);
		System.out.println("Exact: " + getExact());
	}

}
