package org.example;

public class Recursion {
    static int sum(int n) {
        if (n <= 10) {
            return n + sum(n + 1);
        }
        return 0;
    }

    public static void main(String[] args) {
        int i = sum(1);
        System.out.println(i);

    }
}


/*
public class Recursion{
 static int Factorial(int n){
  if(n>0){
   return n*Factorial(n-1);
  }
  return 0;
 }
 public static void main(String args[]){
  int i = Factorial(5);
  System.out.println(i);
 }
}
 */
