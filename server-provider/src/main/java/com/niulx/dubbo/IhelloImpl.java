package com.niulx.dubbo;

public class IhelloImpl implements Ihello {
    @Override
    public String sayHello(String str) {
        return "hello," + str;
    }
}
