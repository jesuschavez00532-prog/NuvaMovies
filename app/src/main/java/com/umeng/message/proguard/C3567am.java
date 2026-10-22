package com.umeng.message.proguard;

import android.text.TextUtils;
import com.umeng.message.api.UPushInAppMessageHandler;
import com.umeng.message.common.UPLog;
import com.umeng.message.entity.UMessage;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* renamed from: com.umeng.message.proguard.am */
/* loaded from: classes3.dex */
public final class C3567am {

    /* renamed from: b */
    Future<?> f15944b;

    /* renamed from: c */
    private final LinkedList<C3570ap> f15945c = new LinkedList<>();

    /* renamed from: a */
    transient boolean f15943a = true;

    /* renamed from: c */
    private void m15325c() {
        Future<?> future = this.f15944b;
        if (future != null && !future.isDone() && !future.isCancelled()) {
            UPLog.m15198i("Pop", "cancel cache task", Boolean.valueOf(future.cancel(false)));
        }
        final LinkedList linkedList = new LinkedList();
        synchronized (this.f15945c) {
            if (!this.f15945c.isEmpty()) {
                linkedList.addAll(this.f15945c);
            }
        }
        this.f15943a = linkedList.isEmpty();
        UPLog.m15198i("Pop", "save task", Integer.valueOf(linkedList.size()));
        this.f15944b = C3581b.m15371a(new Runnable() { // from class: com.umeng.message.proguard.am.2
            @Override // java.lang.Runnable
            public final void run() {
                C3567am.this.f15944b = null;
                File m15441a = C3598bp.m15441a(C3706y.m15840a());
                if (!linkedList.isEmpty()) {
                    C3598bp.m15443a(linkedList, m15441a);
                    UPLog.m15198i("Pop", "save", linkedList);
                } else if (m15441a.exists()) {
                    m15441a.delete();
                    UPLog.m15198i("Pop", "clear");
                }
            }
        }, 1L, TimeUnit.SECONDS);
    }

    /* renamed from: a */
    public final void m15328a(C3570ap c3570ap) {
        synchronized (this.f15945c) {
            this.f15945c.addFirst(c3570ap);
            if (this.f15945c.size() > 1) {
                Collections.sort(this.f15945c, new Comparator<C3570ap>() { // from class: com.umeng.message.proguard.am.1
                    @Override // java.util.Comparator
                    public final /* synthetic */ int compare(C3570ap c3570ap2, C3570ap c3570ap3) {
                        return Long.signum(c3570ap2.f15961a.getMsgTime() - c3570ap3.f15961a.getMsgTime()) * (-1);
                    }
                });
            }
            int i10 = C3565ak.m15312a().mo15323c().f15950b;
            while (this.f15945c.size() > i10) {
                C3570ap removeLast = this.f15945c.removeLast();
                try {
                    UPLog.m15198i("Pop", "add unShow msgId", removeLast.f15961a.getMsgId());
                    UPushInAppMessageHandler inAppMessageHandler = C3703v.m15825a().getInAppMessageHandler();
                    if (inAppMessageHandler != null) {
                        inAppMessageHandler.onMessageIgnored(C3706y.m15840a(), removeLast.f15961a);
                    }
                } catch (Throwable th) {
                    UPLog.m15196e("Pop", th);
                }
            }
            m15325c();
        }
    }

    /* renamed from: b */
    public final boolean m15330b(C3570ap c3570ap) {
        boolean remove;
        synchronized (this.f15945c) {
            remove = this.f15945c.remove(c3570ap);
        }
        if (remove) {
            m15325c();
        }
        return remove;
    }

    /* renamed from: b */
    public final void m15329b() {
        LinkedList linkedList = (LinkedList) C3598bp.m15442a(C3598bp.m15441a(C3706y.m15840a()));
        if (linkedList != null && !linkedList.isEmpty()) {
            synchronized (this.f15945c) {
                this.f15945c.clear();
                this.f15945c.addAll(linkedList);
            }
            this.f15943a = false;
        }
        if (this.f15943a) {
            return;
        }
        UPLog.m15198i("Pop", "load", linkedList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00e2, code lost:
    
        m15325c();
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.umeng.message.proguard.C3570ap m15326a() {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.message.proguard.C3567am.m15326a():com.umeng.message.proguard.ap");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final C3570ap m15327a(String str) {
        synchronized (this.f15945c) {
            Iterator<C3570ap> it = this.f15945c.iterator();
            while (it.hasNext()) {
                C3570ap next = it.next();
                UMessage uMessage = next.f15961a;
                if (uMessage != null && TextUtils.equals(str, uMessage.getMsgId())) {
                    return next;
                }
            }
            return null;
        }
    }
}
