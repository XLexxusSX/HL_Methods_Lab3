package com.AlexeyPopov1984;

import java.util.*;

public class Zadacha_1 {
    public static void rabotaNadSpiskom() {
        int N = 20;
        Random rand = new Random();

        System.out.println("\nLaba 3. RESHENIE ZADACHI 1:");

        final int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = rand.nextInt(101);
        }
        System.out.println("a) Massiv iz N: " + Arrays.toString(array));

        List<Integer> list = new ArrayList<>();
        List<Integer> listOrigin = new ArrayList<>();
        List<Integer> listUnikal = new ArrayList<>();
        Map<Integer, Integer> countDubl = new HashMap<>();

        for (int num : array) {
            list.add(num);
            listOrigin.add(num);
        }
        System.out.println("b) Spisok: " + list);

        Collections.sort(list);
        System.out.println("c) Otsortirovanniy spisok po vozrastaniyu: " + list);

        Collections.reverse(list);
        System.out.println("d) Otsortirovanniy spisok po ubyvaniyu: " + list);

        Collections.shuffle(list);
        System.out.println("e) Spisok peremeshan: " + list);

        Collections.rotate(list, -1);
        System.out.println("f) Sdvig na 1 vpravo: " + list);

        listUnikal = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println("g) Ostavil v spiske tol'ko unikal'nye: " + listUnikal);

        List<Integer> dubl = new ArrayList<>();
        for (Integer num : list) {
            if (Collections.frequency(list, num) > 1 && !dubl.contains(num)) {
                dubl.add(num);
            }
        }
        if (dubl.size() > 0) {
            System.out.println("h) Spisok dublikatov.");
            System.out.println("Ishodniy spisok: " + list);
            System.out.println("Spisok dublikataov: " + dubl);
        } else {
            System.out.println("Spisok dublikatov.");
            System.out.println("h) Ishodniy spisok: " + list);
            System.out.println("Diblikatov v etom spiske net");
        }

        Object[] arrayFromList = list.toArray();
        System.out.println("i) Iz spiska v massiv: " + Arrays.toString(arrayFromList));

        List<Integer> sortedList = new ArrayList<>(list);
        List<String> newList = new ArrayList<>();
        Collections.sort(sortedList);
        int i = 0;
        while (i < sortedList.size()) {
            Integer current = sortedList.get(i);
            int count = 0;
            while (i < sortedList.size()) {
                if (sortedList.get(i).equals(current)) {
                    count++;
                    i++;
                } else {
                    newList.add(sortedList.get(i-1) + ": " + count);
                    break;
                }
            }
        }
        System.out.println("j) Kolichestvo vhozhdeniy.");
        System.out.println("Ishodniy spisok: " + list);
        System.out.print("Spisok otsortirovan (element: kolichestvo): ");
        System.out.println(newList);
    }
}