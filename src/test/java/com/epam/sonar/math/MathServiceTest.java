package com.epam.sonar.math;

import com.epam.sonar.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@ContextConfiguration(classes = Application.class)
public class MathServiceTest extends AbstractTestNGSpringContextTests {

    @Autowired
    private MathService mathService;

    @Test
    public void sortingTest() {
        //Given
        int[] input = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        //When
        mathService.bubbleSort(input);
        //Then
        for (int i = 0; i < 10; i++) {
            assertEquals(input[i], i+1);
        }
    }
}
