package com.kodilla.patterns.decorator.pizza;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithToppingsGetCost() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new VegetablesDecorator(theOrder);
        theOrder = new SauceDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(35), theCost);
    }

    @Test
    public void testPizzaWithToppingsGetDescription() {
        //Given
        PizzaOrder theOrder = new BasicPizzaOrder();
        theOrder = new CheeseDecorator(theOrder);
        theOrder = new HamDecorator(theOrder);
        theOrder = new VegetablesDecorator(theOrder);
        theOrder = new SauceDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("Pizza dough + cheese + ham + vegetables + sauce", description);

    }
}
