package com.AlexeyPopov1984;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("\nLaba 3. ZADACHI: ");
            System.out.println("1. Rabota nad spiskom.");
            System.out.println("2. Klass PrimesGenerator.");
            System.out.println("3. ...");
            System.out.println("4. Podschet slov");
            System.out.println("5. ...\n");
            System.out.print("Vvedite nomer zadachi (ot 1 do 5) ili 'q' dlya vyhoda: ");

            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q"))
                break;
            else if (input.equals("1"))
                Zadacha_1.rabotaNadSpiskom();
            else if (input.equals("2"))
                Zadacha_2.prostyeChisla();
//            else if (input.equals("3"))
//                Zadacha_3.dataEntryTask_3();
            else if (input.equals("4"))
                Zadacha_4.wordCount();
//            else if (input.equals("5"))
//                Zadacha_5.dataEntryTask_5();
            else
                System.out.println("\nNeverniy vvod. Poprobuyte snova");
        } while (true);
    }
}