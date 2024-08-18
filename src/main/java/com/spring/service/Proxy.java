package com.spring.service;

public class Proxy implements Rent{
    private final Host host;

    public Proxy(Host host) {
        this.host = host;
    }

    @Override
    public void rent() {
        beforeRent();
        host.rent();
        afterRent();
    }

    @Override
    public void cancel() {
        System.out.println("中介下架房源");
    }

    public void beforeRent() {
        System.out.println("中介看房");
    }

    public void afterRent() {
        System.out.println("中介定房");
    }
}
