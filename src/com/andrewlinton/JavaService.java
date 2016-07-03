package com.andrewlinton;

class JavaService {

    public JavaService()
    {
        System.out.println("const");
    }

    public int process()
    {
        System.out.println("Processing");
        int ret = helperMethod();
        return ret;
    }

    public int helperMethod()
    {
        System.out.println("Real helper method");
        int t = helperMethod1();
        System.out.println(t);
        return t;
    }

    public int helperMethod1()
    {
        return 1;
    }
}
