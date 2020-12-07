package be.intecbrussel.ex_4;

import be.intecbrussel.ex_1.Duo;

public class ComparableDuo<E extends Number & Comparable<E>> extends Duo<E> {

    public ComparableDuo(E first, E second) {
        super(first, second);
    }

    public E getHighest(){
        return getFirst().compareTo(getSecond())>=0 ? getFirst():getSecond();
    }

    public E getLowest(){

        return getFirst().compareTo(getLowest()) >= 0 ? getSecond() : getFirst();
    }
}
