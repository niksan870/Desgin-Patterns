package com.company;

class Counter {
    private static Counter instance = new Counter();

    public int counter;
    // write your code here
    private Counter () {

    }

    public static Counter getInstance() {
        return instance;
    }
}
