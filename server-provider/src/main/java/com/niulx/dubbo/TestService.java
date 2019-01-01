package com.niulx.dubbo;

public class TestService implements Test {
    @Override
    public String test(String str) {
        return "this is a test:" + str;
    }
}
