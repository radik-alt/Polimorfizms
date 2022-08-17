package com.company.Builder;

public class BuilderApp {

    public static void main(String[] args) {
        Director director = new Director();
        director.setWebsite(new EntepriceWebSite());
        System.out.println(director.buildWebSite());
    }
}
