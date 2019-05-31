package assistant;

import java.util.Scanner;

public class PersonalAssistant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! My name is Aid.");
        System.out.println("I was created in 2019");

        //name
        System.out.println("Please, remind me your name.");
        String yourName = scanner.nextLine();
        System.out.printf("What a great name you have, %s !\n", yourName);

        //age
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int r1 = scanner.nextInt();
        int r2 = scanner.nextInt();
        int r3 = scanner.nextInt();
        System.out.printf("Your age is %d; that's a good time to start programming!\n", (r1 * 70 + r2 * 21 + r3 * 15) % 105);

        //count
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = scanner.nextInt();
        int counter = 0;
        while (counter <= number){
            System.out.println(counter + "!");
            counter++;
        }

        //quiz
        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?\n1. To repeat a statement multiple times.\n2. To decompose a program into several small subroutines.\n" +
                "3. To determine the execution time of a program.\n4. To interrupt the execution of a program.");
        int correct = 2;
        int answer = scanner.nextInt();
        while (true) {
            if (answer == correct) {
                System.out.println("Congratulations, have a nice day!");
                break;
            } else {
                System.out.println("Please, try again.");
                answer = scanner.nextInt();
            }
        }
    }
}