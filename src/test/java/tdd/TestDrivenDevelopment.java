package tdd;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestDrivenDevelopment {

    class Dollar{
        int amount;

        public Dollar(int amount){
            this.amount = amount;
        }

        Dollar times(int multiplier){
            return new Dollar(amount * multiplier);
        }
    }


    @Test
    public void testMultiplication(){
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        assertEquals(10, product.amount);
        product = five.times(3);
        assertEquals(15, product.amount);
    }
}
