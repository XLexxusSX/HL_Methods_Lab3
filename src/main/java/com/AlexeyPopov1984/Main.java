package com.AlexeyPopov1984;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int N = 15;
        Random rand = new Random();

        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = rand.nextInt(100);
        }
        System.out.println("a) Massiv iz N: " + Arrays.toString(array));

        List<Integer> list = new ArrayList<>();
        for (int num : array) {
            list.add(num);
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

        list = new ArrayList<>(new LinkedHashSet<>(list));
        System.out.println("g) Ostavil v spiske tol'ko unikal'nye: " + list);


        System.out.println("h) Spidok s dublikatami: poka net");

        Integer[] newArray = list.toArray(new Integer[0]);
        System.out.println("i) Iz spiska v massiv: " + Arrays.toString(newArray));

        Map<Integer, Integer> count = new HashMap<>();
        for (int num : newArray) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        System.out.println("j) Kolichestvo vhozhdeniy: ");
        for (Map.Entry<Integer, Integer> entry : count.entrySet()) {
            System.out.print("[" + entry.getKey() + ": " + entry.getValue() + "] ");
        }
    }
}