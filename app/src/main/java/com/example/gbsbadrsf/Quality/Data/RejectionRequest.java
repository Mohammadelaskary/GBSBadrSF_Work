package com.example.gbsbadrsf.Quality.Data;

import android.os.Parcel;
import android.os.Parcelable;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class RejectionRequest implements Parcelable {

    @SerializedName("rejectionRequestId")
    @Expose
    private Integer rejectionRequestId;
    @SerializedName("basketCode")
    @Expose
    private String basketCode;
    @SerializedName("rejectionQty")
    @Expose
    private Integer rejectionQty;
    @SerializedName("departmentId")
    @Expose
    private String departmentEnName;
    @SerializedName("userIdAdd")
    @Expose
    private Integer userIdAdd;
    @SerializedName("dateAdd")
    @Expose
    private String dateAdd;
    @SerializedName("isApproved")
    @Expose
    private Object isApproved;

    protected RejectionRequest(Parcel in) {
        if (in.readByte() == 0) {
            rejectionRequestId = null;
        } else {
            rejectionRequestId = in.readInt();
        }
        basketCode = in.readString();
        if (in.readByte() == 0) {
            rejectionQty = null;
        } else {
            rejectionQty = in.readInt();
        }
        departmentEnName = in.readString();
        if (in.readByte() == 0) {
            userIdAdd = null;
        } else {
            userIdAdd = in.readInt();
        }
        dateAdd = in.readString();
    }

    public static final Creator<RejectionRequest> CREATOR = new Creator<RejectionRequest>() {
        @Override
        public RejectionRequest createFromParcel(Parcel in) {
            return new RejectionRequest(in);
        }

        @Override
        public RejectionRequest[] newArray(int size) {
            return new RejectionRequest[size];
        }
    };

    public Integer getRejectionRequestId() {
        return rejectionRequestId;
    }

    public void setRejectionRequestId(Integer rejectionRequestId) {
        this.rejectionRequestId = rejectionRequestId;
    }

    public String getBasketCode() {
        return basketCode;
    }

    public void setBasketCode(String basketCode) {
        this.basketCode = basketCode;
    }

    public Integer getRejectionQty() {
        return rejectionQty;
    }

    public void setRejectionQty(Integer rejectionQty) {
        this.rejectionQty = rejectionQty;
    }

    public String getDepartmentEnName() {
        return departmentEnName;
    }

    public void setDepartmentEnName(String departmentEnName) {
        this.departmentEnName = departmentEnName;
    }

    public Integer getUserIdAdd() {
        return userIdAdd;
    }

    public void setUserIdAdd(Integer userIdAdd) {
        this.userIdAdd = userIdAdd;
    }

    public String getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(String dateAdd) {
        this.dateAdd = dateAdd;
    }

    public Object getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(Object isApproved) {
        this.isApproved = isApproved;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        if (rejectionRequestId == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(rejectionRequestId);
        }
        parcel.writeString(basketCode);
        if (rejectionQty == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(rejectionQty);
        }
        parcel.writeString(departmentEnName);
        if (userIdAdd == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(userIdAdd);
        }
        parcel.writeString(dateAdd);
    }
}
