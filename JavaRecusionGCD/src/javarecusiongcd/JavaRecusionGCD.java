/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javarecusiongcd;

/**
 *
 * @author GUERRA_CPE113
 */
import java.util.Scanner;

public class JavaRecusionGCD {

    public static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("  Pls Input Two Numbers  ");
        System.out.println("Input First Number...");
        int a = input.nextInt();
        System.out.println("Input the second Numbers...");
        int b = input.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("the GCD is undefined");
        } else {
            System.out.println("The sum of both numbers is " + gcd(a, b));
        }

    }

}
