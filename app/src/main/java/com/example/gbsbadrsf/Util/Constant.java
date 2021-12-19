package com.example.gbsbadrsf.Util;

public class Constant {
    //web service urls
    public static final String BASE_URL = "http://196.221.166.86:97/api/GBSShopFloor/";
    //Keys
    public static final String LANG = "LANGUAGE";
    public static final String SCREEN_MODE = "SCREEN_MODEL";
    public static final String PASSED_OBJECT = "PASSED_OBJECT";
    public Integer totalQtyVar;

    public final Integer getTotalQtyVar() {
        return totalQtyVar;
    }

    public void setTotalQty(Integer totalQty) {
        this.totalQtyVar = totalQty;
    }

    public void incrementTotalQty(Integer totalQty) {
        try {
            this.totalQtyVar= this.totalQtyVar + totalQty;
        }catch (Exception e){
            this.totalQtyVar = 0;
            this.totalQtyVar= this.totalQtyVar + totalQty;
        }
    }
}
