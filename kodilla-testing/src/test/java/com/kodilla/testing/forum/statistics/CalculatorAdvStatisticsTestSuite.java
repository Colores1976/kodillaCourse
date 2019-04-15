package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculatorAdvStatisticsTestSuite {
    @Test
    public void testCalculatorAdvStatisticsWithMock1(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String>usersNames1 = new ArrayList<>();
        int postsNumbers1 = 0;
        int commentsNumbers1 = 0;
        when(statisticsMock.usersNames()).thenReturn(usersNames1);
        when(statisticsMock.postsCount()).thenReturn(postsNumbers1);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumbers1);
        CalculatorAdvStatistics calculatorAdvStatistics = new CalculatorAdvStatistics();
        //when
        BigDecimal A = BigDecimal.valueOf(0.0);
        ArrayList<BigDecimal> fine = new ArrayList<>();
        fine.add(A);
        //then
        Assert.assertEquals(fine, calculatorAdvStatistics.calculateAdvStatistics(statisticsMock));
    }
    @Test
    public void testCalculatorAdvStatisticsWithMock2(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String>usersNames1 = new ArrayList<>(100);
            for(int i = 0; i<99; i++){
                usersNames1.add("Adam");
            }
        int postsNumbers1 = 1000;
        int commentsNumbers1 = 2000;
        when(statisticsMock.usersNames()).thenReturn(usersNames1);
        when(statisticsMock.postsCount()).thenReturn(postsNumbers1);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumbers1);
        CalculatorAdvStatistics calculatorAdvStatistics = new CalculatorAdvStatistics();
        //when
        BigDecimal A = BigDecimal.valueOf(10.0);
        BigDecimal B = BigDecimal.valueOf(20.0);
        BigDecimal C = BigDecimal.valueOf(2.0);
        ArrayList<BigDecimal> fine = new ArrayList<>();
        fine.add(A);
        fine.add(B);
        fine.add(C);
        //then
        Assert.assertEquals(fine, calculatorAdvStatistics.calculateAdvStatistics(statisticsMock));
    }
    @Test
    public void testCalculatorAdvStatisticsWithMock3(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String>usersNames1 = new ArrayList<>(100);
        for(int i = 0; i<99; i++){
            usersNames1.add("Adam");
        }
        int postsNumbers1 = 2000;
        int commentsNumbers1 = 1000;
        when(statisticsMock.usersNames()).thenReturn(usersNames1);
        when(statisticsMock.postsCount()).thenReturn(postsNumbers1);
        when(statisticsMock.commentsCount()).thenReturn(commentsNumbers1);
        CalculatorAdvStatistics calculatorAdvStatistics = new CalculatorAdvStatistics();
        //when
        BigDecimal A = BigDecimal.valueOf(20.00);
        BigDecimal B = BigDecimal.valueOf(10.00);
        BigDecimal C = BigDecimal.valueOf(0.50);
        ArrayList<BigDecimal> fine = new ArrayList<>();
        fine.add(A);
        fine.add(B);
        fine.add(C);
        //then
        Assert.assertEquals(fine, calculatorAdvStatistics.calculateAdvStatistics(statisticsMock));
    }
}
