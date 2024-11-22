import java.util.Scanner;
public class Lab02 {
	public static final double a = 9.8;
	
	public static void main(String[] args) {
		Scanner key =  new Scanner(System.in);
		System.out.println("Enter the initial velocity of the ball (in meters per second) at point A:");
		double intialvelocity = key.nextDouble();
		
		System.out.println("How much time (in seconds) does the ball take to reach point B?");
		double time= key.nextDouble();
		
		double velocity = intialvelocity + a * time;
		double distance = intialvelocity * time + 0.5 * a * time * time;
		
		System.out.println("Final Velocity of the ball = " + velocity + " m/s");
		System.out.println("Distance traveled by the ball (S) = " + distance + " meters");
	}
}
