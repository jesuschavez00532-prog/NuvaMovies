package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.InterfaceC0331k;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.d */
/* loaded from: classes.dex */
public class C0324d extends BaseAdapter {

    /* renamed from: a */
    C0325e f1321a;

    /* renamed from: b */
    private int f1322b = -1;

    /* renamed from: c */
    private boolean f1323c;

    /* renamed from: d */
    private final boolean f1324d;

    /* renamed from: e */
    private final LayoutInflater f1325e;

    /* renamed from: f */
    private final int f1326f;

    public C0324d(C0325e c0325e, LayoutInflater layoutInflater, boolean z10, int i10) {
        this.f1324d = z10;
        this.f1325e = layoutInflater;
        this.f1321a = c0325e;
        this.f1326f = i10;
        m1318a();
    }

    /* renamed from: a */
    void m1318a() {
        C0327g m1373v = this.f1321a.m1373v();
        if (m1373v != null) {
            ArrayList m1377z = this.f1321a.m1377z();
            int size = m1377z.size();
            for (int i10 = 0; i10 < size; i10++) {
                if (((C0327g) m1377z.get(i10)) == m1373v) {
                    this.f1322b = i10;
                    return;
                }
            }
        }
        this.f1322b = -1;
    }

    /* renamed from: b */
    public C0325e m1319b() {
        return this.f1321a;
    }

    @Override // android.widget.Adapter
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public C0327g getItem(int i10) {
        ArrayList m1333E;
        if (this.f1324d) {
            m1333E = this.f1321a.m1377z();
        } else {
            m1333E = this.f1321a.m1333E();
        }
        int i11 = this.f1322b;
        if (i11 >= 0 && i10 >= i11) {
            i10++;
        }
        return (C0327g) m1333E.get(i10);
    }

    /* renamed from: d */
    public void m1321d(boolean z10) {
        this.f1323c = z10;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        ArrayList m1333E;
        if (this.f1324d) {
            m1333E = this.f1321a.m1377z();
        } else {
            m1333E = this.f1321a.m1333E();
        }
        if (this.f1322b < 0) {
            return m1333E.size();
        }
        return m1333E.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        boolean z10;
        if (view == null) {
            view = this.f1325e.inflate(this.f1326f, viewGroup, false);
        }
        int groupId = getItem(i10).getGroupId();
        int i12 = i10 - 1;
        if (i12 >= 0) {
            i11 = getItem(i12).getGroupId();
        } else {
            i11 = groupId;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.f1321a.mo1334F() && groupId != i11) {
            z10 = true;
        } else {
            z10 = false;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        InterfaceC0331k.a aVar = (InterfaceC0331k.a) view;
        if (this.f1323c) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.mo1264e(getItem(i10), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        m1318a();
        super.notifyDataSetChanged();
    }
}
