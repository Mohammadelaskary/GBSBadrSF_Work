package com.example.gbsbadrsf.Manfacturing.machinesignoff;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Basketcodelst {
    //
    public Basketcodelst(String basketcode) {
        this.basketcode = basketcode;
    }
    @SerializedName("BasketCode")
    @Expose
    private String basketcode;

    public String getBasketcode() {
        return basketcode;
    }

    public void setBasketcode(String basketcode) {
        this.basketcode = basketcode;
    }


}
