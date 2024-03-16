package com.shopx2.basket.util;

import lombok.experimental.UtilityClass;

@UtilityClass
public final class Constants {

    public static final String API = "api";
    public static final String V1 = "v1";
    public static final String BACKSLASH = "/";
    public static final String BASKETS = "baskets";
    public static final String API_VERSION =  API + BACKSLASH + V1;
    public static final String BASE_URL = API_VERSION + BACKSLASH + BASKETS+BACKSLASH;
}
