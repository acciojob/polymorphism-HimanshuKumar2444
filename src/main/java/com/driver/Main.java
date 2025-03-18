package com.driver;

public class Main {

    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
    public static void main(String[] args) {
        System.out.println("hello world ");
        Product p=new Product();
        System.out.println(p.product(2,4));
        System.out.println(p.product(3,4,5));
        System.out.println(p.product(23.344,45.23));





    }

}