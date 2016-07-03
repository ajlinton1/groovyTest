package com.andrewlinton

import org.apache.tools.ant.taskdefs.Java

class Test1 extends GroovyTestCase
{
    void test1()
    {
        log.info("Starting test1");
        def javaService = new JavaService();
        def result = javaService.process();
        assertEquals(1, result);
    }

    void test2()
    {
        log.info("Starting test2");
    }

    void testMock()
    {
        def javaService = new JavaServiceMock();
        def result = javaService.process();
        assertEquals(1, result);
    }

    void testExpando()
    {
        def ret = 3;
        def emc = new ExpandoMetaClass(JavaServiceMock, true);
        emc.helperMethod1 = {
            println("Expando helper method1");
            return ret;
        }
        emc.initialize();
        def javaService = new JavaServiceMock();
        def result = javaService.process();
        assertEquals(ret, result);
    }

    void testExpando1()
    {
        def ret = 4;
        def javaService = new JavaServiceMock();
        javaService.metaClass.helperMethod1 = {
            println("Expando helper method1");
            return ret;
        }
        def result = javaService.process();
        assertEquals(ret, result);
    }

}

class JavaServiceMock extends JavaService
{
    public int helperMethod()
    {
        println("Mock helper method");
        return helperMethod1();
    }
}