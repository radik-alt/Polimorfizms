package com.company.Proxy;

public class RealProject implements Project{
    private String url;

    public RealProject(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Load project from url...");
    }

    @Override
    public void run() {
        System.out.println("Run project from" + url + "...");
    }
}
