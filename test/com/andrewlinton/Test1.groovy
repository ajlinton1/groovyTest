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
        def emc = new ExpandoMetaClass(JavaService, true);
        emc.helperMethod1 = {
            -> 2
        }
        emc.initialize();
        def javaService = new JavaService();
        def result = javaService.process();
        assertEquals(1, result);
    }

}

class JavaServiceMock extends JavaService
{
    public void helperMethod()
    {
        println("Mock helper method");
    }
}