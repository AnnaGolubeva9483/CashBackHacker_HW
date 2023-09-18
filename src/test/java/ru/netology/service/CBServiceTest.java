package ru.netology.service;

import org.testng.Assert;

public class CBServiceTest {

    @org.testng.annotations.Test
    public void amountIsBoundary() {
        CBService service = new CBService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void amountLessBoundary() {
        CBService service = new CBService();
        int amount = 600;
        int actual = service.remain(amount);
        int expected = 400;
        Assert.assertEquals(actual, expected);
    }

}
