package com.siliconstack.stockcheck.view.ui.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 13}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0006H&\u00a8\u0006\n"}, d2 = {"Lcom/siliconstack/stockcheck/view/ui/search/ListViewFragmentListener;", "", "deleteGroup", "", "items", "", "Lcom/siliconstack/stockcheck/model/MainDTO;", "deleteItem", "mainDTO", "onItemClick", "app_debug"})
public abstract interface ListViewFragmentListener {
    
    public abstract void deleteItem(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.MainDTO mainDTO);
    
    public abstract void deleteGroup(@org.jetbrains.annotations.NotNull()
    java.util.List<? extends com.siliconstack.stockcheck.model.MainDTO> items);
    
    public abstract void onItemClick(@org.jetbrains.annotations.NotNull()
    com.siliconstack.stockcheck.model.MainDTO mainDTO);
}