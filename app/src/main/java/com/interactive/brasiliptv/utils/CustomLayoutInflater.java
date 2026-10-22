package com.interactive.brasiliptv.utils;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.C0313n;
import com.core.sysopt.mark.vod.detail.VodDetailRootView;
import com.module.childlock.view.MarqueTextView;
import com.module.view.FixGifImageView;
import com.module.view.LoadingView;
import com.module.view.net.NetSpeedTextView;
import com.open.leanback.widget.HorizontalGridView;
import com.open.leanback.widget.VerticalGridView;
import com.widget.custom.MemoryListView;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoLinearLayout;
import com.zhy.autolayout.AutoRelativeLayout;
import mc.C5634i;
import p217l2.InterfaceC5341b;
import p217l2.InterfaceC5345f;

/* loaded from: classes2.dex */
public final class CustomLayoutInflater extends C0313n {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.appcompat.app.C0313n
    public View createView(Context context, String str, AttributeSet attributeSet) {
        if (context != null && attributeSet != null) {
            if (str != null) {
                switch (str.hashCode()) {
                    case -2094840285:
                        if (str.equals("com.zhy.autolayout.AutoFrameLayout")) {
                            return new AutoFrameLayout(context, attributeSet);
                        }
                        break;
                    case -2028715637:
                        if (str.equals("com.vod.view.PosterView")) {
                            InterfaceC5345f interfaceC5345f = (InterfaceC5345f) C5634i.m22844e(InterfaceC5345f.class, new Object[0]);
                            if (interfaceC5345f == null) {
                                return null;
                            }
                            return interfaceC5345f.mo21629b(context, attributeSet);
                        }
                        break;
                    case -1886410239:
                        if (str.equals("com.module.view.net.NetSpeedTextView")) {
                            return new NetSpeedTextView(context, attributeSet);
                        }
                        break;
                    case -1822770707:
                        if (str.equals("com.module.view.LoadingView")) {
                            return new LoadingView(context, attributeSet);
                        }
                        break;
                    case -1469986237:
                        if (str.equals("com.vod.view.VodPlayerWindow")) {
                            InterfaceC5345f interfaceC5345f2 = (InterfaceC5345f) C5634i.m22844e(InterfaceC5345f.class, new Object[0]);
                            if (interfaceC5345f2 == null) {
                                return null;
                            }
                            return interfaceC5345f2.mo21632e(context, attributeSet);
                        }
                        break;
                    case -1367281405:
                        if (str.equals("com.zhy.autolayout.AutoLinearLayout")) {
                            return new AutoLinearLayout(context, attributeSet);
                        }
                        break;
                    case -1365822142:
                        if (str.equals("com.vod.view.VodDetailMenuPanel")) {
                            InterfaceC5345f interfaceC5345f3 = (InterfaceC5345f) C5634i.m22844e(InterfaceC5345f.class, new Object[0]);
                            if (interfaceC5345f3 == null) {
                                return null;
                            }
                            return interfaceC5345f3.mo21633f(context, attributeSet);
                        }
                        break;
                    case -1202560096:
                        if (str.equals("com.vod.view.VodDetailBottomScrollView")) {
                            InterfaceC5345f interfaceC5345f4 = (InterfaceC5345f) C5634i.m22844e(InterfaceC5345f.class, new Object[0]);
                            if (interfaceC5345f4 == null) {
                                return null;
                            }
                            return interfaceC5345f4.mo21628a(context, attributeSet);
                        }
                        break;
                    case -1136558486:
                        if (str.equals("com.zhy.autolayout.AutoRelativeLayout")) {
                            return new AutoRelativeLayout(context, attributeSet);
                        }
                        break;
                    case -764354865:
                        if (str.equals("com.vod.view.NotificationBar")) {
                            InterfaceC5345f interfaceC5345f5 = (InterfaceC5345f) C5634i.m22844e(InterfaceC5345f.class, new Object[0]);
                            if (interfaceC5345f5 == null) {
                                return null;
                            }
                            return interfaceC5345f5.mo21631d(context, attributeSet);
                        }
                        break;
                    case -526931486:
                        if (str.equals("com.module.childlock.view.MarqueTextView")) {
                            return new MarqueTextView(context, attributeSet);
                        }
                        break;
                    case -443652810:
                        if (str.equals("RelativeLayout")) {
                            return new RelativeLayout(context, attributeSet);
                        }
                        break;
                    case 248176815:
                        if (str.equals("com.open.leanback.widget.HorizontalGridView")) {
                            return new HorizontalGridView(context, attributeSet);
                        }
                        break;
                    case 1004413441:
                        if (str.equals("com.open.leanback.widget.VerticalGridView")) {
                            return new VerticalGridView(context, attributeSet);
                        }
                        break;
                    case 1127291599:
                        if (str.equals("LinearLayout")) {
                            return new LinearLayout(context, attributeSet);
                        }
                        break;
                    case 1197625662:
                        if (str.equals("com.live.view.MonitorKeyView")) {
                            InterfaceC5341b interfaceC5341b = (InterfaceC5341b) C5634i.m22844e(InterfaceC5341b.class, new Object[0]);
                            if (interfaceC5341b == null) {
                                return null;
                            }
                            return interfaceC5341b.mo20172c(context, attributeSet);
                        }
                        break;
                    case 1310765783:
                        if (str.equals("FrameLayout")) {
                            return new FrameLayout(context, attributeSet);
                        }
                        break;
                    case 1761475037:
                        if (str.equals("com.module.view.FixGifImageView")) {
                            return new FixGifImageView(context, attributeSet, 0, 4, null);
                        }
                        break;
                    case 1841022756:
                        if (str.equals("com.core.sysopt.mark.vod.detail.VodDetailRootView")) {
                            return new VodDetailRootView(context, attributeSet);
                        }
                        break;
                    case 1888950756:
                        if (str.equals("com.widget.custom.MemoryListView")) {
                            return new MemoryListView(context, attributeSet);
                        }
                        break;
                    case 1902908314:
                        if (str.equals("com.vod.view.VodDetailLeftPanel")) {
                            InterfaceC5345f interfaceC5345f6 = (InterfaceC5345f) C5634i.m22844e(InterfaceC5345f.class, new Object[0]);
                            if (interfaceC5345f6 == null) {
                                return null;
                            }
                            return interfaceC5345f6.mo21630c(context, attributeSet);
                        }
                        break;
                }
            }
            return super.createView(context, str, attributeSet);
        }
        return super.createView(context, str, attributeSet);
    }
}
