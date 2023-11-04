package ru.netology.HW14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.*;


public class AviaSoulsTest {


    @Test
    public void testSeachAndSortBy() {
        Ticket ticket = new Ticket(
                "Los-Angeles",
                "New-York",
                2500,
                12,
                14);
        Ticket ticket2 = new Ticket(
                "Los-Angeles",
                "Corc",
                1500,
                20,
                23);
        Ticket ticket3 = new Ticket(
                "Bogota",
                "Saratov",
                23800,
                10,
                22);
        Ticket ticket4 = new Ticket(
                "Johannesburg",
                "Kair",
                17200,
                3,
                10);
        Ticket ticket5 = new Ticket(
                "Antwerpen",
                "Helsinki",
                1300,
                16,
                19);
        AviaSouls avia = new AviaSouls();
        avia.add(ticket);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);
        Comparator<Ticket> timeComparator = new TicketTimeComparator();

        Ticket[] expected = {ticket5};
        Ticket[] actual = avia.searchAndSortBy("Antwerpen", "Helsinki", timeComparator);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testNoSearchAndSortBy() {
        Ticket ticket = new Ticket(
                "Los-Angeles",
                "New-York",
                2500,
                12,
                14);
        Ticket ticket2 = new Ticket(
                "Los-Angeles",
                "Corc",
                1500,
                20,
                23);
        Ticket ticket3 = new Ticket(
                "Bogota",
                "Saratov",
                23800,
                10,
                22);
        Ticket ticket4 = new Ticket(
                "Johannesburg",
                "Kair",
                17200,
                3,
                10);
        Ticket ticket5 = new Ticket(
                "Antwerpen",
                "Helsinki",
                1300,
                16,
                19);
        AviaSouls avia = new AviaSouls();
        avia.add(ticket);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);
        Comparator<Ticket> timeComparator = new TicketTimeComparator();

        Ticket[] expected = {};
        Ticket[] actual = avia.searchAndSortBy("Pretoria", "Helsinki", timeComparator);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchAndSortBy2() {
        Ticket ticket = new Ticket(
                "Los-Angeles",
                "New-York",
                2500,
                12,
                14);
        Ticket ticket2 = new Ticket(
                "Los-Angeles",
                "New-York",
                1500,
                20,
                23);
        Ticket ticket3 = new Ticket(
                "Bogota",
                "Saratov",
                23800,
                10,
                22);
        Ticket ticket4 = new Ticket(
                "Johannesburg",
                "Kair",
                17200,
                3,
                10);
        Ticket ticket5 = new Ticket(
                "Los-Angeles",
                "New-York",
                1300,
                16,
                20);
        AviaSouls avia = new AviaSouls();
        avia.add(ticket);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);
        Comparator<Ticket> timeComparator = new TicketTimeComparator();

        Ticket[] expected = {ticket, ticket2, ticket5};
        Ticket[] actual = avia.searchAndSortBy("Los-Angeles", "New-York", timeComparator);
        Assertions.assertArrayEquals(expected, actual);
    }

    // search
    @Test
    public void testSearchaFew() {
        Ticket ticket = new Ticket(
                "Los-Angeles",
                "New-York",
                2500,
                12,
                14);
        Ticket ticket2 = new Ticket(
                "Los-Angeles",
                "New-York",
                1500,
                20,
                23);
        Ticket ticket3 = new Ticket(
                "Bogota",
                "Saratov",
                23800,
                10,
                22);
        Ticket ticket4 = new Ticket(
                "Johannesburg",
                "Kair",
                17200,
                3,
                10);
        Ticket ticket5 = new Ticket(
                "Los-Angeles",
                "New-York",
                1300,
                20,
                23);
        AviaSouls avia = new AviaSouls();
        avia.add(ticket);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);


        Ticket[] expected = {ticket5, ticket2, ticket};
        Ticket[] actual = avia.search("Los-Angeles", "New-York");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchNoMatch() {
        Ticket ticket = new Ticket(
                "Los-Angeles",
                "New-York",
                2500,
                12,
                14);
        Ticket ticket2 = new Ticket(
                "Los-Angeles",
                "New-York",
                1500,
                20,
                23);
        Ticket ticket3 = new Ticket(
                "Bogota",
                "Saratov",
                23800,
                10,
                22);
        Ticket ticket4 = new Ticket(
                "Johannesburg",
                "Kair",
                17200,
                3,
                10);
        Ticket ticket5 = new Ticket(
                "Los-Angeles",
                "New-York",
                1300,
                20,
                23);
        AviaSouls avia = new AviaSouls();
        avia.add(ticket);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);


        Ticket[] expected = {};
        Ticket[] actual = avia.search("Oslo", "Helsinki");
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSearchSingle() {
        Ticket ticket = new Ticket(
                "Los-Angeles",
                "New-York",
                2500,
                12,
                14);
        Ticket ticket2 = new Ticket(
                "Los-Angeles",
                "New-York",
                1500,
                20,
                23);
        Ticket ticket3 = new Ticket(
                "Bogota",
                "Saratov",
                23800,
                10,
                22);
        Ticket ticket4 = new Ticket(
                "Johannesburg",
                "Kair",
                17200,
                3,
                10);
        Ticket ticket5 = new Ticket(
                "Los-Angeles",
                "New-York",
                1300,
                20,
                23);
        AviaSouls avia = new AviaSouls();
        avia.add(ticket);
        avia.add(ticket2);
        avia.add(ticket3);
        avia.add(ticket4);
        avia.add(ticket5);


        Ticket[] expected = {ticket4};
        Ticket[] actual = avia.search("Johannesburg", "Kair");
        Assertions.assertArrayEquals(expected, actual);
    }
}
