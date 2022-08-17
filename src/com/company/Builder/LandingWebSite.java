package com.company.Builder;

public class LandingWebSite extends WebSiteBuilder {

    @Override
    void buildName() {
        webSite.setSiteName("Landing Page");
    }

    @Override
    void buildCMS() {
        webSite.setCms(CMS.Jumla);
    }

    @Override
    void buildPrice() {
        webSite.setPrice(500);
    }
}
