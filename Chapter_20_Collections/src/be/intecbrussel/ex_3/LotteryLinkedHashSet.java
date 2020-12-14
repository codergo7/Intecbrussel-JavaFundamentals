package be.intecbrussel.ex_3;

import java.util.*;

public class LotteryLinkedHashSet {
    public static void main(String[] args) {
        startGame();
    }

    private static void startGame() {
        Collection<Integer> lotteryGuess = lotteryScanner();

        Collection<Integer> lotteryRandom = lotteryRandom();

        checkResult(lotteryGuess,lotteryRandom);
    }

    private static void checkResult(Collection<Integer> lotteryGuess, Collection<Integer> lotteryRandom) {
        lotteryGuess.retainAll(lotteryRandom);
        System.out.printf("You guessed %d numbers.%nDraw : ", lotteryGuess.size());
        lotteryRandom.forEach(n -> System.out.print(n + " "));
    }

    private static Collection<Integer> lotteryRandom() {
        Collection<Integer> lotteryRandom = new LinkedHashSet<>();
        Random random = new Random();
        while (lotteryRandom.size() != 6) {
            lotteryRandom.add(random.nextInt(45) + 1);
        }
        return lotteryRandom;
    }

    private static Collection<Integer> lotteryScanner() {
        Collection<Integer> lottery = new LinkedHashSet();
        Scanner scanner = new Scanner(System.in);
        while (lottery.size() != 6) {
            System.out.println("Guess a number between 1-45: ");
            int number = scanner.nextInt();
            if (number <= 45 && number > 0) {
                lottery.add(number);
            }
        }
        return lottery;
    }
}
