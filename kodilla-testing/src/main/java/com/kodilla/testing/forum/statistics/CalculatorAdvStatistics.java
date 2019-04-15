package com.kodilla.testing.forum.statistics;

import java.math.BigDecimal;
import java.util.ArrayList;

public class CalculatorAdvStatistics {
    Statistics statistics;
  // private BigDecimal postsAverage;
   //private BigDecimal commentsAverage;
   //private BigDecimal commentsForPostAverage;
   //double result ;


    public ArrayList<BigDecimal> calculateAdvStatistics( Statistics statistics ) {
        ArrayList<BigDecimal> result = new ArrayList<>();
        double usersNumber = statistics.usersNames().size();
        double postsNumber = statistics.postsCount();
        double commentsNumber = statistics.commentsCount();
        if (usersNumber > 0 && postsNumber > 0) {
            BigDecimal postsAverage = BigDecimal.valueOf(postsNumber).divide(BigDecimal.valueOf(usersNumber));
            result.add(postsAverage);
            BigDecimal commentsAverage = BigDecimal.valueOf(commentsNumber).divide(BigDecimal.valueOf(usersNumber));
            result.add(commentsAverage);
            BigDecimal commentsForPostAverage =  BigDecimal.valueOf(commentsNumber).divide(BigDecimal.valueOf(postsNumber));
            result.add(commentsForPostAverage);
        } else {
            BigDecimal X = BigDecimal.valueOf(0.0);
            result.add(X);
        }
        return  result;
    }
}
