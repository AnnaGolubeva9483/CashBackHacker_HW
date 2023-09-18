package ru.netology.service;

import org.junit.Assert;

public class CBServiceTest {

    @org.junit.Test
    public void amountIsBoundary() {
        CBService service = new CBService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        Assert.assertEquals(expected, actual);
    }

    @org.junit.Test
    public void amountLessBoundary() {
        CBService service = new CBService();
        int amount = 600;
        int actual = service.remain(amount);
        int expected = 400;
        Assert.assertEquals(expected, actual);
    }

}