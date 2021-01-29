package be.intecbrussel.ex_12;

import java.util.concurrent.Callable;

public class FactorialCalculator implements Callable {

    private long number;

    public FactorialCalculator(long number) {
        if(number<0){
            throw new IllegalArgumentException("Number should be greater than 0.");
        }
        this.number = number;
    }

    @Override
    public Long call() throws Exception {
        long result = 1;
        while (number>0){
            result *= number--;
        }
        return result;
    }
}
