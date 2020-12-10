package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {

  @Test
  void findMaxFirst() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
    long expected = 12;

    long actual = service.findMax(incomesInBillions);

    assertEquals(expected, actual);
  }

  @Test
  void findMaxSecond() {
    StatisticsService service = new StatisticsService();

    long[] incomesInBillions = {10, 5, 8, 4, 5, 3, 8, 6, 15, 11, 12};
    long expected = 15;

    long actual = service.findMax(incomesInBillions);

    assertEquals(expected, actual);
  }
}