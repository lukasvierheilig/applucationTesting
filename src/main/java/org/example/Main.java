package org.example;

public class Main {
    public static void main(String[] args) {
        String hello = "hello";


        TestHelper testHelper = new TestHelper(new TestHelper2());

        System.out.println(testHelper.greet("Ana"));
    }
}
