package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldRemainByAmount0() {
        int actual = this.service.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainByAmount300() {
        int actual = this.service.remain(300);
        int expected = 700;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainByAmount1000() {
        int actual = this.service.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldRemainByAmount1400() {
        int actual = this.service.remain(1400);
        int expected = 600;
        assertEquals(actual, expected);
    }
}