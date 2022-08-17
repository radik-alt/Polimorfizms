package com.company.Builder;

public class WebSite {

    private String siteName;
    private CMS cms;
    private int price;

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    public void setCms(CMS cms) {
        this.cms = cms;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "WebSite{" +
                "siteName='" + siteName + '\'' +
                ", cms=" + cms +
                ", price=" + price +
                '}';
    }
}
