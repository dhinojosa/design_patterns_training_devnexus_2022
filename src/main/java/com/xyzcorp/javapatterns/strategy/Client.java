package com.xyzcorp.javapatterns.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * User: Daniel Hinojosa (dhinojosa@evolutionnext.com)
 * Date: 5/30/12
 * Time: 12:54 PM
 */
public class Client {
    
    public static void main(String[] args) {
        NumberAccumulator numberAccumulator = new NumberAccumulator();
        numberAccumulator.setAccumulatorStrategy(new ProductAccumulator());
        
        List<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);

        assert numberAccumulator.accumulate(integers) == 24;
    }
}
