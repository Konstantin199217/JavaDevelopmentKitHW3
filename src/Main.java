import task1.Calculator;
import task2.Program;
import task3.Pair;

import java.sql.Array;

public class Main {
    public static void main(String[] args) {
        System.out.println(Calculator.sum(2,3));
        System.out.println(Calculator.divide(19,1));
        System.out.println(Calculator.subtract(4,2));
        System.out.println(Calculator.multiply(2,2));

        int [] arr1 = new int []{1,2,3};
        int [] arr2 = new int []{1,2,3};

        Pair p = new Pair<>(1, "Wow");
        System.out.println(p.toString());
    }
}