package vu.projectilemotion;

import java.util.Scanner;

public class ProjectileMotion {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Constants
        final double g = 9.8; // acceleration due to gravity (m/s^2)

        // User input
        System.out.print("Enter the initial velocity (m/s): ");
        double u = input.nextDouble();

        System.out.print("Enter the launch angle (degrees): ");
        double angleDegrees = input.nextDouble();

        // Convert angle to radians
        double angleRadians = Math.toRadians(angleDegrees);

        // Calculations using physics formulas
        double timeOfFlight = (2 * u * Math.sin(angleRadians)) / g;
        double maxHeight = (u * u * Math.pow(Math.sin(angleRadians), 2)) / (2 * g);
        double range = (u * u * Math.sin(2 * angleRadians)) / g;

        // Display results
        System.out.println("\n--- Projectile Motion Results ---");
        System.out.printf("Initial Velocity: %.2f m/s\n", u);
        System.out.printf("Launch Angle: %.2f degrees\n", angleDegrees);
        System.out.printf("Time of Flight: %.2f seconds\n", timeOfFlight);
        System.out.printf("Maximum Height: %.2f meters\n", maxHeight);
        System.out.printf("Horizontal Range: %.2f meters\n", range);

    }
}
