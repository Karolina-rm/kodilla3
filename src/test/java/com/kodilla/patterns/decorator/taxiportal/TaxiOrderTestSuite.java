package com.kodilla.patterns.decorator.taxiportal;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class TaxiOrderTestSuite {

    @Test
    public void testBasicTaxiOrderGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //When
        BigDecimal calculatedCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(5), calculatedCost);
    }

    @Test
    public void testBasicTaxiOrderGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("Drive a course", description);
    }

    @Test
    public void testTaxiNetworkGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(40), theCost);
    }

    @Test
    public void testTaxiNetworkGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("Drive a course by Taxi Network", description);

    }

    @Test
    public void testMyTaxiWithChildSeatGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(37), theCost);

    }

    @Test
    public void testMyTaxiWithChildSeatGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new MyTaxiNetworkOrderDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("Drive a course by MyTaxi Network + child seat", description);

    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetCost() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        theOrder = new ExpressDecorator(theOrder);
        //When
        BigDecimal theCost = theOrder.getCost();
        //Then
        Assert.assertEquals(new BigDecimal(57), theCost);
    }

    @Test
    public void testVipTaxiWithChildSeatExpressGetDescription() {
        //Given
        TaxiOrder theOrder = new BasicTaxiOrder();
        theOrder = new TaxiNetworkOrderDecorator(theOrder);
        theOrder = new VipDecorator(theOrder);
        theOrder = new ChildSeatDecorator(theOrder);
        //When
        String description = theOrder.getDescription();
        //Then
        Assert.assertEquals("Drive a course by Taxi Network variant VIP + child seat", description);
    }
}
