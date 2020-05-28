package com.kodilla.patterns.decorator.pizza;

import java.math.BigDecimal;

public class SauceDecorator extends AbstractPizzaOrderDecorator {
    public SauceDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }

    @Override
    public BigDecimal getCost() {
        return super.getCost().add(new BigDecimal(5));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + sauce";
    }
}
