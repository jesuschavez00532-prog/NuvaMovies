package androidx.appcompat.view.menu;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.R$layout;
import androidx.appcompat.view.menu.InterfaceC0330j;
import androidx.appcompat.view.menu.InterfaceC0331k;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.view.menu.c */
/* loaded from: classes.dex */
public class C0323c implements InterfaceC0330j, AdapterView.OnItemClickListener {

    /* renamed from: a */
    Context f1310a;

    /* renamed from: b */
    LayoutInflater f1311b;

    /* renamed from: c */
    C0325e f1312c;

    /* renamed from: d */
    ExpandedMenuView f1313d;

    /* renamed from: e */
    int f1314e;

    /* renamed from: f */
    int f1315f;

    /* renamed from: g */
    int f1316g;

    /* renamed from: h */
    private InterfaceC0330j.a f1317h;

    /* renamed from: i */
    a f1318i;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.view.menu.c$a */
    /* loaded from: classes.dex */
    public class a extends BaseAdapter {

        /* renamed from: a */
        private int f1319a = -1;

        public a() {
            m1316a();
        }

        /* renamed from: a */
        void m1316a() {
            C0327g m1373v = C0323c.this.f1312c.m1373v();
            if (m1373v != null) {
                ArrayList m1377z = C0323c.this.f1312c.m1377z();
                int size = m1377z.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (((C0327g) m1377z.get(i10)) == m1373v) {
                        this.f1319a = i10;
                        return;
                    }
                }
            }
            this.f1319a = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C0327g getItem(int i10) {
            ArrayList m1377z = C0323c.this.f1312c.m1377z();
            int i11 = i10 + C0323c.this.f1314e;
            int i12 = this.f1319a;
            if (i12 >= 0 && i11 >= i12) {
                i11++;
            }
            return (C0327g) m1377z.get(i11);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = C0323c.this.f1312c.m1377z().size() - C0323c.this.f1314e;
            if (this.f1319a < 0) {
                return size;
            }
            return size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                C0323c c0323c = C0323c.this;
                view = c0323c.f1311b.inflate(c0323c.f1316g, viewGroup, false);
            }
            ((InterfaceC0331k.a) view).mo1264e(getItem(i10), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            m1316a();
            super.notifyDataSetChanged();
        }
    }

    public C0323c(Context context, int i10) {
        this(i10, 0);
        this.f1310a = context;
        this.f1311b = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: a */
    public void mo1277a(C0325e c0325e, boolean z10) {
        InterfaceC0330j.a aVar = this.f1317h;
        if (aVar != null) {
            aVar.mo1162a(c0325e, z10);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: b */
    public void mo1278b(boolean z10) {
        a aVar = this.f1318i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: c */
    public boolean mo1300c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: d */
    public boolean mo1279d(C0325e c0325e, C0327g c0327g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: e */
    public boolean mo1280e(C0325e c0325e, C0327g c0327g) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: f */
    public void mo1281f(InterfaceC0330j.a aVar) {
        this.f1317h = aVar;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: g */
    public void mo1282g(Context context, C0325e c0325e) {
        if (this.f1315f != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1315f);
            this.f1310a = contextThemeWrapper;
            this.f1311b = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1310a != null) {
            this.f1310a = context;
            if (this.f1311b == null) {
                this.f1311b = LayoutInflater.from(context);
            }
        }
        this.f1312c = c0325e;
        a aVar = this.f1318i;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: h */
    public ListAdapter m1314h() {
        if (this.f1318i == null) {
            this.f1318i = new a();
        }
        return this.f1318i;
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0330j
    /* renamed from: i */
    public boolean mo1284i(SubMenuC0333m subMenuC0333m) {
        if (!subMenuC0333m.hasVisibleItems()) {
            return false;
        }
        new DialogInterfaceOnKeyListenerC0326f(subMenuC0333m).m1379d(null);
        InterfaceC0330j.a aVar = this.f1317h;
        if (aVar != null) {
            aVar.mo1163b(subMenuC0333m);
            return true;
        }
        return true;
    }

    /* renamed from: j */
    public InterfaceC0331k m1315j(ViewGroup viewGroup) {
        if (this.f1313d == null) {
            this.f1313d = (ExpandedMenuView) this.f1311b.inflate(R$layout.abc_expanded_menu_layout, viewGroup, false);
            if (this.f1318i == null) {
                this.f1318i = new a();
            }
            this.f1313d.setAdapter((ListAdapter) this.f1318i);
            this.f1313d.setOnItemClickListener(this);
        }
        return this.f1313d;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        this.f1312c.m1341M(this.f1318i.getItem(i10), this, 0);
    }

    public C0323c(int i10, int i11) {
        this.f1316g = i10;
        this.f1315f = i11;
    }
}
