package tdd.chapterOne;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<Pair, Integer> rates = new HashMap<>();

    public void addRate(String from, String to, int rate){
        rates.put(new Pair(from, to), new Integer(rate));
    }

    public Money reduce(Expression source, String to) {
        return source.reduce(this, to);
    }

    public int rate(String from, String to){
        if (from.equals(to)) return 1;

        Integer rate = (Integer) rates.get(new Pair(from, to));
        return rate.intValue();
    }
}








