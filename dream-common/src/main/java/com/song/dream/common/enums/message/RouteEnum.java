package com.song.dream.common.enums.message;


import lombok.extern.slf4j.Slf4j;


@Slf4j
public enum RouteEnum {

    MATTER_DETAIL_ROUTE(
            "事项详情页面",
            "value-creation-identification-pc/eva-details?cvId=%d&activeTab=2&isPermission=true",
            "value-creation-identification-pc/eva-details?cvId=%d&activeTab=2&isPermission=true");

    private final String name;
    private final String appUrl;
    private final String pcUrl;

    RouteEnum(String name, String appUrl, String pcUrl) {
        this.name = name;
        this.appUrl = appUrl;
        this.pcUrl = pcUrl;
    }

    public String getName() {
        return name;
    }

    public String getAppUrl() {
        return appUrl;
    }

    public String getPcUrl() {
        return pcUrl;
    }
}
