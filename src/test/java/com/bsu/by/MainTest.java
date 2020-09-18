package com.bsu.by;

import static com.bsu.by.Main.createMatrix;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MainTest {


    @org.junit.jupiter.api.Test
    void testCreateMatrix() {
        int[][] firstArray = new int[][]{{1,3},{5,7}};
        int[][] secondArray = new int[][]{{2,4},{6,8}};
        int[][] expextedArray=new int[][]{{9,51},{13,55}};
        int[][] actualArray = createMatrix(firstArray,secondArray,2);
        for (int i = 0; i < 2; i++) {
           assertArrayEquals(expextedArray[i], actualArray[i]);
        }
            }
    }







