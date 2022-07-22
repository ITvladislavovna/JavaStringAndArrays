package ru.netology.stats.statsService;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void sumSale() {
        StatsService service = new StatsService();
        int[] arr = {0, 0, 0, 0, 0, 0};
        int expectedSumSale = 0;
        int actualSumSale = service.sumSale(arr);
        Assertions.assertEquals(expectedSumSale, actualSumSale);
    }

    @Test
    public void averageMonthlySales() {
        StatsService service = new StatsService();
        int[] arr = {123, 123, 123, 123, 123, 123};
        int expectedAverageSalesAmount = 123;
        int actualAverageSalesAmount = service.averageMonthlySales(arr);
        Assertions.assertEquals(expectedAverageSalesAmount, actualAverageSalesAmount);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();
        int[] arr = {5_000, 5_000, 20, 123, 123, 2_000};
        int expectedMaxSales = 1;
        int actualMaxSales = service.maxSales(arr);
        Assertions.assertEquals(expectedMaxSales, actualMaxSales);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();
        int[] arr = {5_000, 200, 20, 123, 123, 2_000};
        int expectedMinSales = 2;
        int actualMinSales = service.minSales(arr);
        Assertions.assertEquals(expectedMinSales, actualMinSales);
    }

    @Test
    public void monthSalesBelowAverage() {
        StatsService service = new StatsService();
        int[] arr = {5_000, 200, 20, 123, 123, 2_000};
        int expectedMonthSalesBelowAverage = 4;
        int actualMonthSalesBelowAverage = service.monthSalesBelowAverage(arr);
        Assertions.assertEquals(expectedMonthSalesBelowAverage, actualMonthSalesBelowAverage);
    }
    @Test
    public void monthSalesAboveAverage() {
        StatsService service = new StatsService();
        int[] arr = {100, 100, 100, 100, 100, 100};
        int expectedMonthSalesAboveAverage = 0;
        int actualMonthSalesAboveAverage = service.monthSalesAboveAverage(arr);
        Assertions.assertEquals(expectedMonthSalesAboveAverage, actualMonthSalesAboveAverage);
    }
}

