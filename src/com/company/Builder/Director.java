package com.company.Builder;

public class Director {

    WebSiteBuilder builder;

    public void setWebsite(WebSiteBuilder builder){
        this.builder = builder;
    }

    public WebSite buildWebSite (){
        builder.createWebSite();
        builder.buildName();
        builder.buildCMS();
        builder.buildPrice();

        WebSite webSite = builder.getWebSite();
        return webSite;
    }

}
