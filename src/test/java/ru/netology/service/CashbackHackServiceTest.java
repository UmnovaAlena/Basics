package ru.netology.service;
import static org.testng.Assert.assertEquals;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount =1000;
        int actual = service.remain(amount);
        int expected =0;
        assertEquals (actual, expected);
    }
    @org.testng.annotations.Test
    public void testRemain100WithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount =900;
        int actual = service.remain(amount);
        int expected =100;
        assertEquals (actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemain1WithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount =999;
        int actual = service.remain(amount);
        int expected =1;
        assertEquals (actual, expected);
    }

    @org.testng.annotations.Test
    public void testRemain999WithCashback() {
        CashbackHackService service = new CashbackHackService();
        int amount =1001;
        int actual = service.remain(amount);
        int expected =999;
        assertEquals (actual, expected);
    }
}
