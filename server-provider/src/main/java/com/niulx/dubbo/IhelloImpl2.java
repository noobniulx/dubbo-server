package com.niulx.dubbo;

public class IhelloImpl2 implements Ihello {
    @Override
    public String sayHello(String str) {
        return "hello2," + str;
    }
}
