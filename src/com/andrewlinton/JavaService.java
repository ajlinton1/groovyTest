package com.andrewlinton;

class JavaService {

    public JavaService()
    {
        System.out.println("const");
    }

    public int process()
    {
        System.out.println("Processing");
        helperMethod();
        return 1;
    }

    public void helperMethod()
    {
        System.out.println("Real helper method");
        int t = helperMethod1();
        System.out.println(t);
    }

    public int helperMethod1()
    {
        return 1;
    }
}
