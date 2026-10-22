package com.taobao.accs.data;

import java.util.Comparator;

/* renamed from: com.taobao.accs.data.b */
/* loaded from: classes.dex */
class C3137b implements Comparator<Integer> {

    /* renamed from: a */
    final /* synthetic */ C3136a f12922a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3137b(C3136a c3136a) {
        this.f12922a = c3136a;
    }

    @Override // java.util.Comparator
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compare(Integer num, Integer num2) {
        return num.intValue() - num2.intValue();
    }
}
