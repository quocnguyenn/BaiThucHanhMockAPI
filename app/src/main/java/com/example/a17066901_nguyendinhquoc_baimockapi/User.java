package com.example.a17066901_nguyendinhquoc_baimockapi;

public class User {
    private String id;
    private String name;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public User(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
