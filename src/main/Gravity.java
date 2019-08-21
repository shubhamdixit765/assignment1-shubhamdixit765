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
        System.out.println("The speed of the object at " + time" seconds after its release is " + speed" and the distance the object has travelled in the " + time" seconds after the relase is " + distance);
        sc.close();
    }
}

}
