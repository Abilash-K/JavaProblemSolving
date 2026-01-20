package com.learning.general;

public class FibonacciSeries {
    private int calculateFibonacci(int n){
        int a=0;
        int b=0;
        int sum=1;
        int current=1;

        if(n<=0){
            return 0;
        }

        System.out.println(a);
        System.out.println(current);
        for(int i=2;i<=n;i++){
            a=b;
            b=current;
            current=a+b;
            sum +=current;
            System.out.println(current);
        }

        return sum;
    }
    public static void main(String[] args){
        FibonacciSeries test = new FibonacciSeries();
        int result = test.calculateFibonacci(10);

        System.out.println(result);
    }
}
