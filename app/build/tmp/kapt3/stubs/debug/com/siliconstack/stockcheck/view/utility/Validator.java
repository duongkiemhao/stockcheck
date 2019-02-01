package com.siliconstack.stockcheck.view.utility;

import java.lang.System;

/**
 * * Created by Kalpesh on 23/01/18.
 * *
 * * This class is used to validate data like email, phone, password policy, etc.
 * * It also sets error to the EditText or TextInputLayout of the EditText if needed.
 */
@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0004"}, d2 = {"Lcom/siliconstack/stockcheck/view/utility/Validator;", "", "()V", "Companion", "app_debug"})
public final class Validator {
    private static final java.lang.String PASSWORD_POLICY = null;
    private static final java.lang.String NAME_VALIDATION_MSG = "Enter a valid name";
    private static final java.lang.String EMAIL_VALIDATION_MSG = "Enter a valid email address";
    private static final java.lang.String PHONE_VALIDATION_MSG = "Enter a valid phone number";
    public static final com.siliconstack.stockcheck.view.utility.Validator.Companion Companion = null;
    
    public Validator() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0001H\u0002J\u0010\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\u0018\u0010\r\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000bJ\u0018\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000bJ\u0018\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000bJ\u0018\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\u000e\u001a\u00020\u000bJ\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/siliconstack/stockcheck/view/utility/Validator$Companion;", "", "()V", "EMAIL_VALIDATION_MSG", "", "NAME_VALIDATION_MSG", "PASSWORD_POLICY", "PHONE_VALIDATION_MSG", "getText", "data", "isDigit", "", "str", "isValidEmail", "updateUI", "isValidName", "isValidPassword", "isValidPhone", "setError", "", "error", "app_debug"})
    public static final class Companion {
        
        /**
         * * Retrieve string data from the parameter.
         *         * @param data - can be EditText or String
         *         * @return - String extracted from EditText or data if its data type is Strin.
         */
        private final java.lang.String getText(java.lang.Object data) {
            return null;
        }
        
        /**
         * * Checks if the name is valid.
         *         * @param data - can be EditText or String
         *         * @param updateUI - if true and if data is EditText, the function sets error to the EditText or its TextInputLayout
         *         * @return - true if the name is valid.
         */
        public final boolean isValidName(@org.jetbrains.annotations.NotNull()
        java.lang.Object data, boolean updateUI) {
            return false;
        }
        
        /**
         * * Checks if the email is valid.
         *         * @param data - can be EditText or String
         *         * @param updateUI - if true and if data is EditText, the function sets error to the EditText or its TextInputLayout
         *         * @return - true if the email is valid.
         */
        public final boolean isValidEmail(@org.jetbrains.annotations.NotNull()
        java.lang.Object data, boolean updateUI) {
            return false;
        }
        
        /**
         * * Checks if the phone is valid.
         *         * @param data - can be EditText or String
         *         * @param updateUI - if true and if data is EditText, the function sets error to the EditText or its TextInputLayout
         *         * @return - true if the phone is valid.
         */
        public final boolean isValidPhone(@org.jetbrains.annotations.NotNull()
        java.lang.Object data, boolean updateUI) {
            return false;
        }
        
        /**
         * * Checks if the password is valid as per the following password policy.
         *         * Password should be minimum minimum 8 characters long.
         *         * Password should contain at least one number.
         *         * Password should contain at least one capital letter.
         *         * Password should contain at least one small letter.
         *         * Password should contain at least one special character.
         *         * Allowed special characters: "~!@#$%^&*()-_=+|/,."';:{}[]<>?"
         *         *
         *         * @param data - can be EditText or String
         *         * @param updateUI - if true and if data is EditText, the function sets error to the EditText or its TextInputLayout
         *         * @return - true if the password is valid as per the password policy.
         */
        public final boolean isValidPassword(@org.jetbrains.annotations.NotNull()
        java.lang.Object data, boolean updateUI) {
            return false;
        }
        
        /**
         * * Sets error on EditText or TextInputLayout of the EditText.
         *         * @param data - Should be EditText
         *         * @param error - Message to be shown as error, can be null if no error is to be set
         */
        private final void setError(java.lang.Object data, java.lang.String error) {
        }
        
        public final boolean isDigit(@org.jetbrains.annotations.Nullable()
        java.lang.String str) {
            return false;
        }
        
        private Companion() {
            super();
        }
    }
}