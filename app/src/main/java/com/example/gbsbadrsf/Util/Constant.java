package com.example.gbsbadrsf.Util;

public class Constant {
    //web service urls
    public static final String BASE_URL = "http://45.241.58.79:97/api/GBSShopFloor/";
    //Keys
    public static final String LANG = "LANGUAGE";
    public static final String SCREEN_MODE = "SCREEN_MODEL";
    public static final String PASSED_OBJECT = "PASSED_OBJECT";
    public static int totalQtyVar;

    public final int getTotalQtyVar() {
        return totalQtyVar;
    }

    public void setTotalQty(int totalQty) {
        this.totalQtyVar = totalQty;
    }

    public void incrementTotalQty(int totalQty) {
        try {
            this.totalQtyVar= this.totalQtyVar + totalQty;
        }catch (Exception e){
            this.totalQtyVar = 0;
            this.totalQtyVar= this.totalQtyVar + totalQty;
        }
    }
}
