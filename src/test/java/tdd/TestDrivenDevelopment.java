package tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDrivenDevelopment {

    class Dollar{
        int amount;

        public Dollar(int amount){
            this.amount = amount;
        }

        void times(int multiplier){
            amount *= multiplier;
        }
    }


    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        five.times(2);
        assertEquals(10, five.amount);
    }
}
