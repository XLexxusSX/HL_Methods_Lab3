package com.AlexeyPopov1984;

import java.util.*;

class PrimesGenerator {
    private List<Integer> primes;
    private int N;

    public PrimesGenerator(int N) {
        this.N = N;
        this.primes = new ArrayList<>();
        generatePrimes();
    }

    private void generatePrimes() {
        int num = 2;
        while (primes.size() < N) {
            if (isPrime(num)) {
                primes.add(num);
            }
            num++;
        }
    }

    private boolean isPrime(int num) {
        if (num <= 1) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public Iterator<Integer> getIterator() {
        return primes.iterator();
    }

    public ListIterator<Integer> getListIterator() {
        return primes.listIterator(primes.size());
    }
}