package com.sonarsource.support;

//comment 1
public class Reproducer {
    public static void main(String[] args) {
        //comment 2
        String foo = "foo";
        if (foo.length() == 3) {
            System.exit(0);
        }else {
            addMethodWithMissingComments();
        }
        System.out.println(foo.length());

        int target = -5;
        int num = 3;


        /* intentionally raising java:S2757*/
        target =- num;
        target =+ num;

        System.out.println(target);
    }


    public static void addMethodWithMissingComments(){
        int a = 1;
        int b= 2;
        int c = 3;
        int d = 4;
        int e = 5;

        if (a + b +c + d + e == 42) {
            System.exit(0);
        }

    }
}
    
