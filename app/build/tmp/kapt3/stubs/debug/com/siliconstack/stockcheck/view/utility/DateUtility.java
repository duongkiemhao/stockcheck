package com.siliconstack.stockcheck.view.utility;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/siliconstack/stockcheck/view/utility/DateUtility;", "", "()V", "Companion", "app_debug"})
public final class DateUtility {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PATTERN_DDMMYYYY = "^.*?(\\d{2}|\\d)[.|/|-](\\d{2}|\\d{1})[.|/|-](\\d{4}|\\d{2})( \\W | )?(\\d{2}|\\d)?[.|/|-]?(\\d{2}|\\d)?[.|/|-]?(\\d{4}|\\d{2})?.*";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PATTERN_DDMMMYYYY = "^.*?(\\d{2}|\\d)[ |.|/|-]?(\\D{3}|\\D{4})[ |.|/|-]?(\\d{4}|\\d{2})( \\W | )?(\\d{2}|\\d)?[ |.|/|-]?(\\D{3}|\\D{4})?[ |.|/|-]?(\\d{4}|\\d{2})?.*";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DDMMYYYY = "ddMMyyyy";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String DDMMMYYYY = "ddMMMyyyy";
    public static final com.siliconstack.stockcheck.view.utility.DateUtility.Companion Companion = null;
    
    public DateUtility() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0010\u001a\u00020\u0004J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0004J\u001a\u0010\u0017\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000f\u001a\u00020\u00042\b\u0010\u0019\u001a\u0004\u0018\u00010\u0013J\u001e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u001e\u0010\"\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u0004X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006\u00a8\u0006#"}, d2 = {"Lcom/siliconstack/stockcheck/view/utility/DateUtility$Companion;", "", "()V", "DDMMMYYYY", "", "getDDMMMYYYY", "()Ljava/lang/String;", "DDMMYYYY", "getDDMMYYYY", "PATTERN_DDMMMYYYY", "getPATTERN_DDMMMYYYY", "PATTERN_DDMMYYYY", "getPATTERN_DDMMYYYY", "checkDOBDate", "", "pattern", "dateStr", "checkValidDate", "combineDateAndTimeStrToDate", "Ljava/util/Date;", "timeStr", "createDateFromDatePart", "createDateFromTimePart", "parseDateTimeStrToDate", "parseDateToDateTimeStr", "date", "showDatePickup", "", "calendar", "Ljava/util/Calendar;", "context", "Landroid/content/Context;", "datetimePickupListener", "Lcom/siliconstack/stockcheck/view/control/DateTimePickupListener;", "showTimePickup", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPATTERN_DDMMYYYY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPATTERN_DDMMMYYYY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDDMMYYYY() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDDMMMYYYY() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date createDateFromDatePart(@org.jetbrains.annotations.NotNull()
        java.lang.String dateStr) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date createDateFromTimePart(@org.jetbrains.annotations.NotNull()
        java.lang.String timeStr) {
            return null;
        }
        
        public final void showDatePickup(@org.jetbrains.annotations.NotNull()
        java.util.Calendar calendar, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.siliconstack.stockcheck.view.control.DateTimePickupListener datetimePickupListener) {
        }
        
        public final void showTimePickup(@org.jetbrains.annotations.NotNull()
        java.util.Calendar calendar, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        com.siliconstack.stockcheck.view.control.DateTimePickupListener datetimePickupListener) {
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date combineDateAndTimeStrToDate(@org.jetbrains.annotations.Nullable()
        java.lang.String dateStr, @org.jetbrains.annotations.Nullable()
        java.lang.String timeStr) {
            return null;
        }
        
        public final boolean checkValidDate(@org.jetbrains.annotations.NotNull()
        java.lang.String pattern, @org.jetbrains.annotations.Nullable()
        java.lang.String dateStr) {
            return false;
        }
        
        public final boolean checkDOBDate(@org.jetbrains.annotations.NotNull()
        java.lang.String pattern, @org.jetbrains.annotations.Nullable()
        java.lang.String dateStr) {
            return false;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String parseDateToDateTimeStr(@org.jetbrains.annotations.NotNull()
        java.lang.String pattern, @org.jetbrains.annotations.Nullable()
        java.util.Date date) {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.util.Date parseDateTimeStrToDate(@org.jetbrains.annotations.NotNull()
        java.lang.String pattern, @org.jetbrains.annotations.Nullable()
        java.lang.String dateStr) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}