package ru.netology.stats.statsService;

import java.util.Arrays;

public class StatsService {
    public int sumSale(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public int averageMonthlySales(int[] arr) {
        int sumTotal = sumSale(arr);
        int averageSalesAmount = 0;
        if (arr.length > 0) ;
        averageSalesAmount = sumTotal / arr.length;
        return averageSalesAmount;
    }

    public int maxSales(int[] arr) {
        int maxMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= arr[maxMonth])
                maxMonth = i;
        }
        return maxMonth;
    }

    public int minSales(int[] arr) {
        int minMonth = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= arr[minMonth])
                minMonth = i;
        }
        return minMonth;
    }

    public int monthSalesBelowAverage(int[] arr) {
        int average = averageMonthlySales(arr);
        int belowAverage = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < average)
                belowAverage = belowAverage + 1;

        }
        return belowAverage;

    }

    public int monthSalesAboveAverage(int[] arr) {
        int average = averageMonthlySales(arr);
        int aboveAverage = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > average)
                aboveAverage = aboveAverage + 1;

        }
        return aboveAverage;
    }
}






