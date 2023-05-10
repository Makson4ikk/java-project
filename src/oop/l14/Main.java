package l14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> container = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            container.add(i);
        }


        long startParallel = System.currentTimeMillis();
        container.parallelStream().forEach(element -> {

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        long endParallel = System.currentTimeMillis();
        System.out.println("Час паралельної обробки: " + (endParallel - startParallel) + " ms");

        long startSequential = System.currentTimeMillis();
        for (Integer element : container) {

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        long endSequential = System.currentTimeMillis();
        System.out.println("Час паралельної обробки: " + (endSequential - startSequential) + " ms");

        if ((endSequential - startSequential) == 0) {
            System.out.println("Послідовна обробка займала менше 1 мс, тому ефективність розпаралелювання неможливо розрахувати.");
        } else {
            double efficiency = (double) (endParallel - startParallel) / (double) (endSequential - startSequential);
            System.out.println("Ефективність розпаралелювання: " + efficiency + " разів швидше, ніж послідовна обробка.");
        }
    }
}
