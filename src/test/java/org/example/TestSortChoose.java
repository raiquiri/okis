package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.Sort.sortChoose;

public class TestSortChoose {
    @Test (groups = "positive")
    void testSortChooseInt() {
        // Arange - создание окружения
        final int[] array = new int[] {4,5,1,2,3,9,7,10,8,6};
        int[] expectedResult = new int[] {1,2,3,4,5,6,7,8,9,10};
        int[] actualResult;

        // Act - действие
        actualResult = sortChoose(array);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test (groups = "positive")
    void testSortChooseDouble() {
        // Arange - создание окружения
        final double[] array = new double[] {4.51,5.32,1.86,2.12,3.43,9.55,7.14,10.22,8.1,6.15};
        double[] expectedResult = new double[] {1.86,2.12,3.43,4.51,5.32,6.15,7.14,8.1,9.55,10.22};
        double[] actualResult;

        // Act - действие
        actualResult = sortChoose(array);

        // Assert
        Assert.assertEquals(actualResult, expectedResult);
    }
}