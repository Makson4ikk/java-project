package l13;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int timeout = 3000;
        int number_of_threads = 3;


        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10000000; i++) {
            numbers.add(random.nextInt(100));
        }


        List<Thread> threads = new ArrayList<>();
        List<AverageCalculator> calculators = new ArrayList<>();
        int chunkSize = numbers.size() / number_of_threads;
        for (int i = 0; i < number_of_threads; i++) {
            int start = i * chunkSize;
            int end = (i == number_of_threads - 1) ? numbers.size() : (i + 1) * chunkSize;
            List<Integer> chunk = numbers.subList(start, end);
            AverageCalculator calculator = new AverageCalculator(chunk);
            Thread thread = new Thread(calculator);
            threads.add(thread);
            calculators.add(calculator);
            thread.start();
        }


        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {

        }


        for (Thread thread : threads) {
            thread.interrupt();
        }


        int count = 0;
        double sum = 0;
        for (AverageCalculator calculator : calculators) {
            count += calculator.getCount();
            sum += calculator.getSum();
        }
        double average = sum / count;


        System.out.println("Average: " + average);
    }
}
