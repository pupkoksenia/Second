package com.bsu.by;

import org.junit.jupiter.api.Test;

import static com.bsu.by.Main.createMatrix;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MainTest {


    @Test
    void testCreateMatrix() {
        int[][] firstArray = new int[][]{{1, 3}, {5, 7}};
        int[][] secondArray = new int[][]{{2, 4}, {6, 8}};
        int[][] expectedArray = new int[][]{{9, 51}, {13, 55}};
        int[][] actualArray = createMatrix(firstArray, secondArray, 2);
        for (int i = 0; i < 2; i++) {
            assertArrayEquals(expectedArray[i], actualArray[i]);
        }
    }
}







