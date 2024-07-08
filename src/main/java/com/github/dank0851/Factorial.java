package com.github.dank0851;

public class Factorial {


        public static void main( String[] args )
        {

        }

        public static long factorial(long n) {
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        }

}
