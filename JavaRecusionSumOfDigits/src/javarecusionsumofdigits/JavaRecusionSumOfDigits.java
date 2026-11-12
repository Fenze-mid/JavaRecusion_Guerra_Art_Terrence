/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javarecusionsumofdigits;

/**
 *
 * @author GUERRA_CPE113
 */
import java.util.Scanner;

public class JavaRecusionSumOfDigits {

    public static int sumofdigits(int number) {
        if (number == 0) {
            return 0;
        } else {
            return (number % 10) + sumofdigits(number / 10);
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pls Input Your Numbers");
        int n = input.nextInt();

        System.out.println("result: " + sumofdigits(n));
    }
}
