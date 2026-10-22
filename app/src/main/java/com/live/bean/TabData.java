package com.live.bean;

import com.live.R$drawable;
import com.live.R$string;

/* loaded from: classes2.dex */
public final class TabData {
    public final int[] getImageNormal() {
        return new int[]{R$drawable.live_tab_search, R$drawable.live_tab_reservation, R$drawable.live_tab_fav, R$drawable.live_tab_channel};
    }

    public final int[] getImageSelect() {
        return new int[]{R$drawable.live_tab_search_focus, R$drawable.live_tab_reservation_focus, R$drawable.live_tab_fav_focus, R$drawable.live_tab_channel_focus};
    }

    public final int[] getTitles() {
        return new int[]{R$string.live_tab_search, R$string.live_tab_reservation, R$string.live_tab_favorite, R$string.live_tab_channel};
    }
}
