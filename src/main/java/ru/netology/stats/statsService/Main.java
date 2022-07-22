package ru.netology.stats.statsService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] arr = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        System.out.println(Arrays.toString(arr));
        int sumSale = service.sumSale(arr);
        System.out.println("Сумму всех продаж:" + sumSale);
        int average = service.averageMonthlySales(arr);
        System.out.println("Средняя сумму продаж в месяц:" + average);
        int maxSales=service.maxSales(arr);
        System.out.println("Номер месяца, в котором был пик продаж:" + maxSales);
        int minSales=service.minSales(arr);
        System.out.println("Номер месяца, в котором был минимум продаж :" + minSales);
        int salesBelowAverage=service.monthSalesBelowAverage(arr);
        System.out.println("Кол-во месяцев, в которых продажи были ниже среднего:" + salesBelowAverage);
        int salesAboveAverage=service.monthSalesAboveAverage(arr);
        System.out.println("Кол-во месяцев, в которых продажи были выше среднего:" + salesAboveAverage);
    }
}

