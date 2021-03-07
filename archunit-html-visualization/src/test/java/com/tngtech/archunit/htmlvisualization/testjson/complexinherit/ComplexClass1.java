package com.tngtech.archunit.htmlvisualization.testjson.complexinherit;

import com.tngtech.archunit.htmlvisualization.testjson.simpleinherit.sub.SimpleClass1;

@SuppressWarnings({"unused", "MismatchedReadAndWriteOfArray"})
public class ComplexClass1 implements ComplexInterface1, ComplexInterface2 {
    private String s;

    public ComplexClass1(String s) {
        this.s = s;
    }

    @Override
    public void sayHello() {
        SimpleClass1 c = new SimpleClass1(this.s);
        ComplexClass2 cc2 = new ComplexClass2("hi");
        ComplexClass2[] arr = new ComplexClass2[1];
        arr[0] = cc2;
        c.sayHi();
    }

    public void sayHi() {
        SimpleClass1 c = new SimpleClass1(this.s);
        c.sayHello(42);
    }
}
