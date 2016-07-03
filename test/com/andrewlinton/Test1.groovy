package com.andrewlinton

class Test1 extends GroovyTestCase
{
    void test1()
    {
        println("Starting test1");
        def javaService = new JavaService();
        javaService.process();
    }

    void test2()
    {
        println("Starting test2");
    }
}
