package be.intecbrussel.ex_5;

import java.util.Collection;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class BurgerOrderApp {

    public static void main(String[] args) {

        //testLinkedList();

        testPriorityQueue();
    }

    private static void testPriorityQueue() {

        Queue<BurgerOrder> orders = new PriorityQueue<>();
        int order =1;
        char name ='A';
        orders.add(new BurgerOrder(String.valueOf(name++),order++));
        orders.add(new BurgerOrder(String.valueOf(name++),10));
        orders.add(new BurgerOrder(String.valueOf(name++),order++));
        orders.add(new BurgerOrder(String.valueOf(name++),50));
        orders.add(new BurgerOrder(String.valueOf(name++),order++));
        orders.add(new BurgerOrder(String.valueOf(name++),order++));
        orders.add(new BurgerOrder(String.valueOf(name++),order++));

        while (!orders.isEmpty()){
            System.out.println(orders.poll());
        }
    }

    private static void testLinkedList() {
        Queue<BurgerOrder> orders = new LinkedList<>();
        int order =1;
        char name ='A';
        orders.offer(new BurgerOrder(String.valueOf(name++),order++));
        orders.offer(new BurgerOrder(String.valueOf(name++),order++));
        orders.offer(new BurgerOrder(String.valueOf(name++),order++));
        orders.offer(new BurgerOrder(String.valueOf(name++),order++));
        orders.offer(new BurgerOrder(String.valueOf(name++),order++));
        orders.offer(new BurgerOrder(String.valueOf(name++),order++));


        while (!orders.isEmpty()){
            System.out.println(orders.poll());
        }

    }


}
