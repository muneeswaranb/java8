package com.bsj.java8.samples;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateSample {
    Predicate<Integer> predicate=i->(i<18);
    BiPredicate<Integer,String> biPredicate= (i,s)->(i<18)&&s.equalsIgnoreCase("Ram");
    public static void main(String[] args) {
        PredicateSample predicateSample = new PredicateSample();
        System.out.println("Predicate with 20 : "+predicateSample.predicate.test(17));
        System.out.println("Predicate with 20 : "+predicateSample.biPredicate.test(17,"Ram"));
    }
}
