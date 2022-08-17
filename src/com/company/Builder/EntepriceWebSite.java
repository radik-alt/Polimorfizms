package com.company.Builder;

public class EntepriceWebSite extends WebSiteBuilder {


    @Override
    void buildName() {
        webSite.setSiteName("Enterprice");
    }

    @Override
    void buildCMS() {
        webSite.setCms(CMS.Wordpress);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(10000);
    }
}
