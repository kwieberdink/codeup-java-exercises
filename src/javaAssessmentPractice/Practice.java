package javaAssessmentPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practice {

    public static void subtractTen(int num) {
        int subTen = num - 10;
        System.out.println(subTen);
    }

    public static double average(int [] numbers) {
        int size = numbers.length;
        double total = 0;
        for (double num : numbers) {
            total += num;
        }
        total /= size;
        return total;
    }


    public static void main(String[] args) {

    }

}
