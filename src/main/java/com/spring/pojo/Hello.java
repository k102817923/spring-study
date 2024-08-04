package com.spring.pojo;

public class Hello {
    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Hello{" +
                "title='" + title + '\'' +
                '}';
    }
}
