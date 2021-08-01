package com.onemount;

/**
 * Hello world!
 */
public class App {
  public static int sum(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    System.out.println("Hello World!");

    int a = 6;
    int b = 9;
    System.out.format("%d + %d = %d\n", a, b, sum(a, b));
  }
}
