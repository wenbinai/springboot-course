package edu.nefu.springbootexample.component;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculateComponentTest {
    @Autowired
    private CalculateComponent calculateComponent;

    @Test
    public void test_add() {
        Assertions.assertEquals(3, calculateComponent.add(1, 1));
    }
}