package com.siliconstack.stockcheck.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u0006\n\u0002\b\u0018\n\u0002\u0010\t\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 X2\u0012\u0012\u0004\u0012\u00020\u00000\u0001j\b\u0012\u0004\u0012\u00020\u0000`\u00022\u00020\u0003:\u0001XB\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u000f\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tB\u0005\u00a2\u0006\u0002\u0010\nJ\u001c\u0010Q\u001a\u00020\u001b2\b\u0010R\u001a\u0004\u0018\u00010\u00002\b\u0010S\u001a\u0004\u0018\u00010\u0000H\u0016J\b\u0010T\u001a\u00020\u001bH\u0016J\u0018\u0010U\u001a\u00020V2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010W\u001a\u00020\u001bH\u0016R \u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0016\u0010\u0010R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\"\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010!\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010R\"\u0010$\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR\u001c\u0010\'\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000e\"\u0004\b)\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010*\"\u0004\b+\u0010\u0006R\u001a\u0010,\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010*\"\u0004\b-\u0010\u0006R\u001e\u0010.\u001a\u0004\u0018\u00010/X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001e\u00105\u001a\u0004\u0018\u00010/X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u00104\u001a\u0004\b6\u00101\"\u0004\b7\u00103R\"\u00108\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b9\u0010\u001d\"\u0004\b:\u0010\u001fR \u0010;\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\u000e\"\u0004\b=\u0010\u0010R\"\u0010>\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\b?\u0010\u001d\"\u0004\b@\u0010\u001fR \u0010A\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bB\u0010\u000e\"\u0004\bC\u0010\u0010R \u0010D\u001a\u0004\u0018\u00010\f8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u000e\"\u0004\bF\u0010\u0010R\"\u0010G\u001a\u0004\u0018\u00010H8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0002\u0010M\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u001e\u0010N\u001a\u0004\u0018\u00010\u001bX\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010 \u001a\u0004\bO\u0010\u001d\"\u0004\bP\u0010\u001f\u00a8\u0006Y"}, d2 = {"Lcom/siliconstack/stockcheck/model/MainDTO;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "Landroid/os/Parcelable;", "isDesc", "", "(Z)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "()V", "bayNumber", "", "getBayNumber", "()Ljava/lang/String;", "setBayNumber", "(Ljava/lang/String;)V", "compareTime", "getCompareTime", "setCompareTime", "compareTimeFullStr", "getCompareTimeFullStr", "setCompareTimeFullStr", "dateString", "getDateString", "setDateString", "floorID", "", "getFloorID", "()Ljava/lang/Integer;", "setFloorID", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "floorName", "getFloorName", "setFloorName", "id", "getId", "setId", "image", "getImage", "setImage", "()Z", "setDesc", "isSelected", "setSelected", "lat", "", "getLat", "()Ljava/lang/Double;", "setLat", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "lng", "getLng", "setLng", "locationID", "getLocationID", "setLocationID", "locationName", "getLocationName", "setLocationName", "operatorID", "getOperatorID", "setOperatorID", "operatorName", "getOperatorName", "setOperatorName", "scanText", "getScanText", "setScanText", "timestamp", "", "getTimestamp", "()Ljava/lang/Long;", "setTimestamp", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "type", "getType", "setType", "compare", "o1", "o2", "describeContents", "writeToParcel", "", "flags", "CREATOR", "app_debug"})
public class MainDTO implements java.util.Comparator<com.siliconstack.stockcheck.model.MainDTO>, android.os.Parcelable {
    private boolean isDesc;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Id")
    private java.lang.Integer id;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "ScanText")
    private java.lang.String scanText;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Timestamp")
    private java.lang.Long timestamp;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer type;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "LocationId")
    private java.lang.Integer locationID;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Location")
    private java.lang.String locationName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "FloorId")
    private java.lang.Integer floorID;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Floor")
    private java.lang.String floorName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "OperatorId")
    private java.lang.Integer operatorID;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "Operator")
    private java.lang.String operatorName;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "BayNumber")
    private java.lang.String bayNumber;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String dateString;
    private boolean isSelected;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String compareTime;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String compareTimeFullStr;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String image;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double lat;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Double lng;
    public static final com.siliconstack.stockcheck.model.MainDTO.CREATOR CREATOR = null;
    
    @java.lang.Override()
    public int compare(@org.jetbrains.annotations.Nullable()
    com.siliconstack.stockcheck.model.MainDTO o1, @org.jetbrains.annotations.Nullable()
    com.siliconstack.stockcheck.model.MainDTO o2) {
        return 0;
    }
    
    public final boolean isDesc() {
        return false;
    }
    
    public final void setDesc(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getScanText() {
        return null;
    }
    
    public final void setScanText(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getTimestamp() {
        return null;
    }
    
    public final void setTimestamp(@org.jetbrains.annotations.Nullable()
    java.lang.Long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getLocationID() {
        return null;
    }
    
    public final void setLocationID(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocationName() {
        return null;
    }
    
    public final void setLocationName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFloorID() {
        return null;
    }
    
    public final void setFloorID(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFloorName() {
        return null;
    }
    
    public final void setFloorName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getOperatorID() {
        return null;
    }
    
    public final void setOperatorID(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOperatorName() {
        return null;
    }
    
    public final void setOperatorName(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBayNumber() {
        return null;
    }
    
    public final void setBayNumber(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDateString() {
        return null;
    }
    
    public final void setDateString(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean isSelected() {
        return false;
    }
    
    public final void setSelected(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCompareTime() {
        return null;
    }
    
    public final void setCompareTime(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCompareTimeFullStr() {
        return null;
    }
    
    public final void setCompareTimeFullStr(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLat() {
        return null;
    }
    
    public final void setLat(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Double getLng() {
        return null;
    }
    
    public final void setLng(@org.jetbrains.annotations.Nullable()
    java.lang.Double p0) {
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    public MainDTO() {
        super();
    }
    
    public MainDTO(boolean isDesc) {
        super();
    }
    
    public MainDTO(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u001d\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016\u00a2\u0006\u0002\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lcom/siliconstack/stockcheck/model/MainDTO$CREATOR;", "Landroid/os/Parcelable$Creator;", "Lcom/siliconstack/stockcheck/model/MainDTO;", "()V", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/siliconstack/stockcheck/model/MainDTO;", "app_debug"})
    public static final class CREATOR implements android.os.Parcelable.Creator<com.siliconstack.stockcheck.model.MainDTO> {
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.siliconstack.stockcheck.model.MainDTO createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel parcel) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public com.siliconstack.stockcheck.model.MainDTO[] newArray(int size) {
            return null;
        }
        
        private CREATOR() {
            super();
        }
    }
}