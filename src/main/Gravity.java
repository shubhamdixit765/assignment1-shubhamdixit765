/*
 * @author Divyansh Bhardwaj
 * @version 1.0
 * */
package main;

// import java.util.Scanner;
// uncomment the above line to use input in your program.

import java.util.Scanner;
public class Gravity {
	public static void main(String[] args) {
        double time;
        double speed;
        double distance;
        double GRAVITY = 9.8;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER TIME");
        time = sc.nextDouble();
        speed = GRAVITY * time;
        distance = (GRAVITY * time * time) / 2;
		/* TODO 2:
		 *   c. Calculate the result and print it to the screen.
		 * */
	}
	// P.S: Refer to the README.md file for the problem statement, input & output.
}
