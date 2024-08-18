package com.spring.service;

public class Host implements Rent {

    @Override
    public void rent() {
        System.out.println("房东上架房源");
    }

    @Override
    public void cancel() {
        System.out.println("房东下架房源");
    }
}
