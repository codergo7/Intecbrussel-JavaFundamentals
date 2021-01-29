package be.intecbrussel.ex_12;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorApp {

    public static void main(String[] args) {

        FactorialCalculator fc = new FactorialCalculator(4);

        ExecutorService es = Executors.newSingleThreadScheduledExecutor();

        Future<Long> longFuture = es.submit(fc);

        while (!longFuture.isDone()){
            System.out.println("Waiting");
        }

        try {
            System.out.println(fc.call().longValue());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
