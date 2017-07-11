package lk.dinuka;

import java.util.Scanner;

public class App {
    public static void add(int numOne, int numTwo) {
        int result = numOne + numTwo;
        System.out.println(numOne + " + " + numTwo + " = " + result);
    }
    public static void subtract(int numOne, int numTwo) {
        int result = numOne - numTwo;
        System.out.println(numOne + " - " + numTwo + " = " + result);
    }
    public static void multiply(int numOne, int numTwo) {
        int result = numOne * numTwo;
        System.out.println(numOne + " * " + numTwo + " = " + result);
    }
    public static void divide(int numOne, int numTwo) {
        int result = numOne / numTwo;
        System.out.println(numOne + " / " + numTwo + " = " + result);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number  : ");
        int numOne = scanner.nextInt();
        System.out.print("Enter second number : ");
        int numTwo = scanner.nextInt();

        add(numOne, numTwo);
        subtract(numOne, numTwo);
        multiply(numOne, numTwo);
        divide(numOne, numTwo);
    }

}