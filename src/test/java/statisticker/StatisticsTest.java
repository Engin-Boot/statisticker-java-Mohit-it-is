package com.codbind;

import static org.junit.Assert.*;
import jdk.nashorn.internal.AssertsEnabled;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.junit.Test;

public class StatisticsTest 
{
    @Test
    public void reportsAverageMinMaxx()
    {
        Float[] numbers = {1.5f, 8.9f, 3.2f, 4.5f};
        List<Float> numberList = Arrays.asList(numbers);

        Stats s = Statistics.getStatistics(numberList);

        float epsilon = 0.001f;
        assertTrue(Math.abs(s.average-4.525f)<epsilon);
        assertTrue(Math.abs(s.min - 1.5f)<epsilon);
        assertTrue(Math.abs(s.max - 8.9f)<epsilon);
    }
    
    @Test
    public void reportsNaNForEmptyInput()
    {
        List<Float> emptyList = new ArrayList<Float>();

        Stats s = Statistics.getStatistics(emptyList);
        
        assertTrue(s.min.isNaN() == true);
        assertTrue(s.max.isNaN() == true);
        assertTrue(s.average.isNaN() == true);
        
    }
    
    
}
