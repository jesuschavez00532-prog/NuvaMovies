package p043ce;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import ne.AbstractC5868k;
import re.C6575c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ce.l */
/* loaded from: classes3.dex */
public abstract class AbstractC1500l extends AbstractC1499k {
    /* renamed from: c */
    public static ArrayList m6984c(Object... objArr) {
        AbstractC5868k.m23674f(objArr, "elements");
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C1486c(objArr, true));
    }

    /* renamed from: d */
    public static List m6985d() {
        return C1510v.f5684a;
    }

    /* renamed from: e */
    public static C6575c m6986e(Collection collection) {
        AbstractC5868k.m23674f(collection, "<this>");
        return new C6575c(0, collection.size() - 1);
    }

    /* renamed from: f */
    public static int m6987f(List list) {
        AbstractC5868k.m23674f(list, "<this>");
        return list.size() - 1;
    }

    /* renamed from: g */
    public static List m6988g(Object... objArr) {
        List m6985d;
        List m6948a;
        AbstractC5868k.m23674f(objArr, "elements");
        if (objArr.length > 0) {
            m6948a = AbstractC1494g.m6948a(objArr);
            return m6948a;
        }
        m6985d = m6985d();
        return m6985d;
    }

    /* renamed from: h */
    public static List m6989h(Object... objArr) {
        AbstractC5868k.m23674f(objArr, "elements");
        if (objArr.length == 0) {
            return new ArrayList();
        }
        return new ArrayList(new C1486c(objArr, true));
    }

    /* renamed from: i */
    public static List m6990i(List list) {
        List m6985d;
        List m6983b;
        AbstractC5868k.m23674f(list, "<this>");
        int size = list.size();
        if (size == 0) {
            m6985d = m6985d();
            return m6985d;
        }
        if (size == 1) {
            m6983b = AbstractC1499k.m6983b(list.get(0));
            return m6983b;
        }
        return list;
    }

    /* renamed from: j */
    public static void m6991j() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
