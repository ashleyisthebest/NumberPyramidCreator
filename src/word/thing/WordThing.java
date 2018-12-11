package word.thing;

import java.util.Scanner;

public class WordThing {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = scanner.nextInt();

        int max = 0;
        int counter;

        do {
            counter = 1;
            max++;
            do {
                System.out.print(counter);
                counter++;
            } while (counter <= max);
            System.out.println();
        } while (max < num);

        do {
            counter = 1;
            max--;
            do {
                System.out.print(counter);
                counter++;
            } while (counter <= max);
            System.out.println();
        } while (max > 0);

        //I am very proud of myself for figuring this out
        
    }
