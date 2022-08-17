package com.company.Builder;

import com.company.Builder.WebSite;

public abstract class WebSiteBuilder {

    WebSite webSite;

    void createWebSite () {
        webSite = new WebSite();
    }

    abstract void buildName();
    abstract void buildCMS();
    abstract void buildPrice();

    public WebSite getWebSite(){
        return webSite;
    }

}
