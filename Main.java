package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double num;
        System.out.println("Please enter an integer number: ");

        Scanner scan = new Scanner(System.in);

        ///double num;
        ///System.out.println("Please enter an integer number: ");

        num = scan.nextDouble();

        if(num%2 == 0){
            System.out.println("This is an even number.");
        } else{
            System.out.println("This is an odd number.");

            scan.close();
        }

    }

}
