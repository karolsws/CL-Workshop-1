package pl.coderlab.game1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        numberGen();
    }

    public static void numberGen() {
        Random generator = new Random();
        int number = generator.nextInt(100);
        boolean wynik = false;
        while (wynik == false) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Zgadnij liczbe: ");
            while (!scan.hasNextInt()) {
                scan.next();
                System.out.println("To nie jest liczba");
            }
            int check = scan.nextInt();

            if (number == check) {
                System.out.println("Zgadłeś");
                wynik = true;
            } else if (number > check) {
                System.out.println("za mało");
                wynik = false;
            } else {
                System.out.println("za duzo");
            }




        }
    }
}