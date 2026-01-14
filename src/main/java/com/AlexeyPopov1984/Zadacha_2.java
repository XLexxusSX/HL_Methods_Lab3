package com.AlexeyPopov1984;


import java.util.Scanner;

public class Zadacha_2 {

    public static void prostyeChisla() {

        Scanner scanner = new Scanner(System.in);
        Integer N = 0;
        String input = "";

        System.out.println("\nLaba 3. RESHENIE ZADACHI 2:");


        while (true) {
            System.out.print("Vvedite kolichestvo prostyh chisel (ot 1 do 1000): ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("q"))
                return;
            try {
                N = Integer.parseInt(input);
                if (N > 0 && N <= 1000) {
                    break;
                } else System.out.println("Uslovie ne vypolneno: 0 < Kolichestvo chisel < 1000. Poprobuyte snova.\n");
            } catch (NumberFormatException e) {
                System.out.print("Neverniy vvod, poprobuyte snova. ");
            }
        }

        PrimesGeneratorTest.pgTest(N);
    }
}
