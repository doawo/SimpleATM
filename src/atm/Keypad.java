package atm;

import java.util.Scanner;

public class Keypad {
    public int getInput(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your pin: ");

        int pin = sc.nextInt();

        return pin;
    }
}
