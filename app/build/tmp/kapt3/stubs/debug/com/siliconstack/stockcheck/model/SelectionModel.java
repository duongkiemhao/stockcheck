package com.siliconstack.stockcheck.model;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001Bg\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003\u00a2\u0006\u0002\u0010\u0011J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003H\u00c6\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u00c6\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u0003H\u00c6\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003H\u00c6\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H\u00c6\u0003Jy\u0010!\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0003H\u00c6\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010%\u001a\u00020&H\u00d6\u0001J\t\u0010\'\u001a\u00020(H\u00d6\u0001R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0013R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013\u00a8\u0006)"}, d2 = {"Lcom/siliconstack/stockcheck/model/SelectionModel;", "", "stores", "", "Lcom/siliconstack/stockcheck/model/Store;", "departments", "Lcom/siliconstack/stockcheck/model/Department;", "printer", "Lcom/siliconstack/stockcheck/model/Printer;", "salutation", "Lcom/siliconstack/stockcheck/model/Salutation;", "privacyCode", "Lcom/siliconstack/stockcheck/model/PrivacyCode;", "contactType", "Lcom/siliconstack/stockcheck/model/ContactType;", "transportOption", "Lcom/siliconstack/stockcheck/model/TransportOption;", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getContactType", "()Ljava/util/List;", "getDepartments", "getPrinter", "getPrivacyCode", "getSalutation", "getStores", "getTransportOption", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class SelectionModel {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Stores")
    private final java.util.List<com.siliconstack.stockcheck.model.Store> stores = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Departments")
    private final java.util.List<com.siliconstack.stockcheck.model.Department> departments = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Printers")
    private final java.util.List<com.siliconstack.stockcheck.model.Printer> printer = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "Salutations")
    private final java.util.List<com.siliconstack.stockcheck.model.Salutation> salutation = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "PrivacyCodes")
    private final java.util.List<com.siliconstack.stockcheck.model.PrivacyCode> privacyCode = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "ContactTypes")
    private final java.util.List<com.siliconstack.stockcheck.model.ContactType> contactType = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "TransportOptions")
    private final java.util.List<com.siliconstack.stockcheck.model.TransportOption> transportOption = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.siliconstack.stockcheck.model.Store> getStores() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.siliconstack.stockcheck.model.Department> getDepartments() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.siliconstack.stockcheck.model.Printer> getPrinter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.siliconstack.stockcheck.model.Salutation> getSalutation() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.siliconstack.stockcheck.model.PrivacyCode> getPrivacyCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.siliconstack.stockcheck.model.ContactType> getContactType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.siliconstack.stockcheck.model.TransportOption> getTransportOption() {
        return null;
    }
    
    public SelectionModel(@org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconstack.stockcheck.model.Store> stores, @org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconstack.stockcheck.model.Department> departments, @org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconstack.stockcheck.model.Printer> printer, @org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconstack.stockcheck.model.Salutation> salutation, @org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconstack.stockcheck.model.PrivacyCode> privacyCode, @org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconstack.stockcheck.model.ContactType> contactType, @org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconstack.stockcheck.model.TransportOption> transportOption) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.siliconstack.stockcheck.model.Store> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.siliconstack.stockcheck.model.Department> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.siliconstack.stockcheck.model.Printer> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.siliconstack.stockcheck.model.Salutation> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.siliconstack.stockcheck.model.PrivacyCode> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.siliconstack.stockcheck.model.ContactType> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.siliconstack.stockcheck.model.TransportOption> component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.siliconstack.stockcheck.model.SelectionModel copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconstack.stockcheck.model.Store> stores, @org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconstack.stockcheck.model.Department> departments, @org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconstack.stockcheck.model.Printer> printer, @org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconstack.stockcheck.model.Salutation> salutation, @org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconstack.stockcheck.model.PrivacyCode> privacyCode, @org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconstack.stockcheck.model.ContactType> contactType, @org.jetbrains.annotations.NotNull()
    java.util.List<com.siliconstack.stockcheck.model.TransportOption> transportOption) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}