package com.eurotech.pages;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {


        List<String> prices = new ArrayList<>();
        prices.add("99");
        prices.add("17");
        prices.add("7");
        prices.add("22");

        List<Integer> priceDouble= new ArrayList<>();

        for (String price : prices) {
            priceDouble.add(Integer.parseInt(price));

        }
        System.out.println("minIndex(priceDouble) = " + minIndex(priceDouble));


        System.out.println("priceDouble = " + priceDouble);
    }
    public static int minIndex (List<Integer> list) {
        return list.indexOf (Collections.min(list)); }
}
