package com.example.designpatterns.templatemethod.abstractdemo;

/**
 * @author huangquan
 * @date 2022/8/15
 **/
public abstract class BaseAbstract {

        public final void templateMethod1() {
            //...
            method1();
            //...
            method2();
            //...
        }

        public final void templateMethod2() {
            //...
            method3();
            //...
            method4();
            //...
        }

        protected void method1(){ throw new UnsupportedOperationException();}
        protected abstract void method2();
        protected abstract void method3();
        protected abstract void method4();

}
