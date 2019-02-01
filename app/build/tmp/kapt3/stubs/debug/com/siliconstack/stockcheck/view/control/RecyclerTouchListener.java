package com.siliconstack.stockcheck.view.control;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\u0002\u0010\bJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000fH\u0016J\u0018\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\t\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/siliconstack/stockcheck/view/control/RecyclerTouchListener;", "Landroid/support/v7/widget/RecyclerView$OnItemTouchListener;", "context", "Landroid/content/Context;", "recyclerView", "Landroid/support/v7/widget/RecyclerView;", "clickListener", "Lcom/siliconstack/stockcheck/view/control/RecyclerTouchListener$ClickListener;", "(Landroid/content/Context;Landroid/support/v7/widget/RecyclerView;Lcom/siliconstack/stockcheck/view/control/RecyclerTouchListener$ClickListener;)V", "SWIPE_THRESHOLD", "", "SWIPE_VELOCITY_THRESHOLD", "gestureDetector", "Landroid/view/GestureDetector;", "onInterceptTouchEvent", "", "rv", "e", "Landroid/view/MotionEvent;", "onRequestDisallowInterceptTouchEvent", "", "disallowIntercept", "onTouchEvent", "ClickListener", "app_debug"})
public final class RecyclerTouchListener implements android.support.v7.widget.RecyclerView.OnItemTouchListener {
    private final android.view.GestureDetector gestureDetector = null;
    private final int SWIPE_THRESHOLD = 100;
    private final int SWIPE_VELOCITY_THRESHOLD = 100;
    private final com.siliconstack.stockcheck.view.control.RecyclerTouchListener.ClickListener clickListener = null;
    
    @java.lang.Override()
    public boolean onInterceptTouchEvent(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView rv, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e) {
        return false;
    }
    
    @java.lang.Override()
    public void onTouchEvent(@org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView rv, @org.jetbrains.annotations.NotNull()
    android.view.MotionEvent e) {
    }
    
    @java.lang.Override()
    public void onRequestDisallowInterceptTouchEvent(boolean disallowIntercept) {
    }
    
    public RecyclerTouchListener(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.support.v7.widget.RecyclerView recyclerView, @org.jetbrains.annotations.Nullable()
    com.siliconstack.stockcheck.view.control.RecyclerTouchListener.ClickListener clickListener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u0003H&J\b\u0010\u000e\u001a\u00020\u0003H&\u00a8\u0006\u000f"}, d2 = {"Lcom/siliconstack/stockcheck/view/control/RecyclerTouchListener$ClickListener;", "", "onClick", "", "view", "Landroid/view/View;", "position", "", "onTouch", "rv", "Landroid/support/v7/widget/RecyclerView;", "e", "Landroid/view/MotionEvent;", "toSwipeLeft", "toSwipeRight", "app_debug"})
    public static abstract interface ClickListener {
        
        public abstract void onClick(@org.jetbrains.annotations.NotNull()
        android.view.View view, int position);
        
        public abstract void onTouch(@org.jetbrains.annotations.NotNull()
        android.support.v7.widget.RecyclerView rv, @org.jetbrains.annotations.NotNull()
        android.view.MotionEvent e);
        
        public abstract void toSwipeRight();
        
        public abstract void toSwipeLeft();
    }
}