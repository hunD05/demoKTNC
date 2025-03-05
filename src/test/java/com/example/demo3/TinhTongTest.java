package com.example.demo3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TinhTongTest {

    @Test
    void sumArray() {
        int arr[] = {1,2,3,4,5};
        int result = Arrays.stream(arr).sum();
        int ex = 2;
        assertEquals(ex, result);
    }

    @Test
    void tongAm() {
        int arr[] = {-1,-2,-3,-4,-5};
        int result = Arrays.stream(arr).sum();
        int ex = 2;
        assertEquals(ex, result);
    }

    @Test
    void max() {
        int arr[] = {Integer.MAX_VALUE, Integer.MIN_VALUE};
        int result = Arrays.stream(arr).sum();
        int ex = -1;
        assertEquals(ex, result);
    }

    @Test
    void canMax() {
        int arr[] = {Integer.MAX_VALUE - 1, Integer.MIN_VALUE};
        int result = Arrays.stream(arr).sum();
        int ex = -2;
        assertEquals(ex, result);
    }

    @Test
    void vuotMax() {
        int arr[] = {Integer.MAX_VALUE + 1, Integer.MIN_VALUE};
        int result = Arrays.stream(arr).sum();
        int ex = 0;
        assertEquals(ex, result);
    }

    @Test
    void testNull(){
        int arr[] = {};
        int result = Arrays.stream(arr).sum();
        int ex = 0;
        assertEquals(ex, result);
    }
}