package edu.AnastasiiaTkachuk;

import java.util.function.Predicate;

public class Runner {
    public static void main(String[] args) {
        Predicate<String> predicateNotNull = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s !=null;
            }
        };

        Predicate<String> predicateNotEmpty = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.length() > 0;
            }
        };

        Predicate<String> predicateNotNullEmpty = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s != null && s.length() > 0;
            }
        };
    }
}
