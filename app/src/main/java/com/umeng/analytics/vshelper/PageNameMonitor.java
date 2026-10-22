package com.umeng.analytics.vshelper;

/* loaded from: classes3.dex */
public class PageNameMonitor implements InterfaceC3415a {
    private static String currentActivity;
    private static String currentCustomPage;
    private static Object lock = new Object();

    /* renamed from: com.umeng.analytics.vshelper.PageNameMonitor$a */
    /* loaded from: classes3.dex */
    private static class C3414a {

        /* renamed from: a */
        private static final PageNameMonitor f14974a = new PageNameMonitor();

        private C3414a() {
        }
    }

    public static PageNameMonitor getInstance() {
        return C3414a.f14974a;
    }

    @Override // com.umeng.analytics.vshelper.InterfaceC3415a
    public void activityPause(String str) {
        synchronized (lock) {
            currentActivity = null;
        }
    }

    @Override // com.umeng.analytics.vshelper.InterfaceC3415a
    public void activityResume(String str) {
        synchronized (lock) {
            currentActivity = str;
        }
    }

    @Override // com.umeng.analytics.vshelper.InterfaceC3415a
    public void customPageBegin(String str) {
        synchronized (lock) {
            currentCustomPage = str;
        }
    }

    @Override // com.umeng.analytics.vshelper.InterfaceC3415a
    public void customPageEnd(String str) {
        synchronized (lock) {
            currentCustomPage = null;
        }
    }

    public String getCurrenPageName() {
        synchronized (lock) {
            String str = currentCustomPage;
            if (str != null) {
                return str;
            }
            String str2 = currentActivity;
            if (str2 != null) {
                return str2;
            }
            return null;
        }
    }

    public String getCurrentActivityName() {
        String str;
        synchronized (lock) {
            str = currentActivity;
        }
        return str;
    }

    private PageNameMonitor() {
    }
}
