package be.intecbrussel.ex_2;

import java.math.BigDecimal;

@FunctionalInterface
public interface NumberParser {

    BigDecimal parse(String s);
}
