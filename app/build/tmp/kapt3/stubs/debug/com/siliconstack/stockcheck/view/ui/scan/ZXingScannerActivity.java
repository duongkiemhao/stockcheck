package com.siliconstack.stockcheck.view.ui.scan;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0012\u0010\n\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010\r\u001a\u00020\u0007H\u0016J\b\u0010\u000e\u001a\u00020\u0007H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/siliconstack/stockcheck/view/ui/scan/ZXingScannerActivity;", "Landroid/app/Activity;", "Lme/dm7/barcodescanner/zxing/ZXingScannerView$ResultHandler;", "()V", "mScannerView", "Lme/dm7/barcodescanner/zxing/ZXingScannerView;", "handleResult", "", "rawResult", "Lcom/google/zxing/Result;", "onCreate", "state", "Landroid/os/Bundle;", "onPause", "onResume", "app_debug"})
public final class ZXingScannerActivity extends android.app.Activity implements me.dm7.barcodescanner.zxing.ZXingScannerView.ResultHandler {
    private me.dm7.barcodescanner.zxing.ZXingScannerView mScannerView;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle state) {
    }
    
    @java.lang.Override()
    public void onResume() {
    }
    
    @java.lang.Override()
    public void onPause() {
    }
    
    @java.lang.Override()
    public void handleResult(@org.jetbrains.annotations.NotNull()
    com.google.zxing.Result rawResult) {
    }
    
    public ZXingScannerActivity() {
        super();
    }
}