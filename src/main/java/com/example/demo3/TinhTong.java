package com.example.demo3;

public class TinhTong {
    public static Integer sumArray(Integer[] arr) {
        if(arr == null){
            throw new IllegalArgumentException("Mang kh dc de ttrong");
        }
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }
}
