package com.AlexeyPopov1984;

import java.util.Iterator;
import java.util.ListIterator;

public class PrimesGeneratorTest {
    public static void pgTest(int N) {

        PrimesGenerator pg = new PrimesGenerator(N);
        System.out.println();
        System.out.println("Pryamoy poryadok:");
        Iterator<Integer> it = pg.getIterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }

        System.out.println("\nObratniy poryadok:");
        ListIterator<Integer> lit = pg.getListIterator();
        while (lit.hasPrevious()) {
            System.out.print(lit.previous() + " ");
        }
        System.out.println();
    }
}
