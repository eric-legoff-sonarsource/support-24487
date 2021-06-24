package com.sonarsource.support;

    //comment 1
    public class Reproducer {
    public static void main(String[] args) {
        //comment 2
       String foo = "foo";
        if (foo.length() == 3) {
            System.exit(0);
        }
    }
}
    
