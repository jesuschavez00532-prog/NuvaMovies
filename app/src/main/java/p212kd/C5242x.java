package p212kd;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vod.R$drawable;
import com.vod.R$layout;
import com.vod.p089ui.activity.KidsCategoryActivity;
import java.util.ArrayList;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p225ld.C5549c;
import p400xa.C7554b;
import p400xa.C7594o0;

/* renamed from: kd.x */
/* loaded from: classes3.dex */
public final class C5242x extends RecyclerView.AbstractC0789h {

    /* renamed from: a */
    private Context f21401a;

    /* renamed from: b */
    private InterfaceC5660l f21402b;

    /* renamed from: c */
    private String f21403c;

    /* renamed from: d */
    private ArrayList f21404d;

    /* renamed from: e */
    private final C7554b f21405e;

    public C5242x(Context context, InterfaceC5660l interfaceC5660l) {
        AbstractC5868k.m23674f(context, "mContext");
        AbstractC5868k.m23674f(interfaceC5660l, "mPressUpListener");
        this.f21401a = context;
        this.f21402b = interfaceC5660l;
        this.f21403c = "";
        this.f21404d = new ArrayList();
        this.f21405e = new C7554b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m21109f(C5242x c5242x, C5549c c5549c, View view) {
        int i10 = 0;
        String str = null;
        AbstractC5868k.m23674f(c5242x, "this$0");
        AbstractC5868k.m23674f(c5549c, "$data");
        KidsCategoryActivity.C3809a c3809a = KidsCategoryActivity.f17235s0;
        Context context = c5242x.f21401a;
        Integer m22494c = c5549c.m22494c();
        if (m22494c != null) {
            i10 = m22494c.intValue();
        } else {
            i10 = 0;
        }
        String m22495d = c5549c.m22495d();
        if (m22495d == null) {
            m22495d = "";
        }
        String str2 = c5242x.f21403c;
        String str3 = "home_vod" + c5549c.m22492a();
        List m22497f = c5549c.m22497f();
        String m22492a = c5549c.m22492a();
        if (m22492a == null) {
            str = "";
        } else {
            str = m22492a;
        }
        c3809a.m16269a(context, i10, m22495d, str2, str3, m22497f, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final boolean m21110g(C5242x c5242x, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c5242x, "this$0");
        if (keyEvent.getAction() == 0 && i10 == 19) {
            InterfaceC5660l interfaceC5660l = c5242x.f21402b;
            AbstractC5868k.m23673e(keyEvent, "event");
            if (((Boolean) interfaceC5660l.mo542f(keyEvent)).booleanValue()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m21111h(C5242x c5242x, View view, boolean z10) {
        AbstractC5868k.m23674f(c5242x, "this$0");
        if (z10) {
            C7554b c7554b = c5242x.f21405e;
            AbstractC5868k.m23673e(view, "v");
            C7554b.m28939e(c7554b, view, 0.0f, 2, null);
        } else {
            C7554b c7554b2 = c5242x.f21405e;
            AbstractC5868k.m23673e(view, "v");
            C7554b.m28940h(c7554b2, view, 0.0f, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i */
    public static final boolean m21112i(C5222s c5222s, View view, MotionEvent motionEvent) {
        AbstractC5868k.m23674f(c5222s, "$holder");
        if (motionEvent.getAction() == 1) {
            c5222s.m21063b().callOnClick();
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(final C5222s c5222s, int i10) {
        AbstractC5868k.m23674f(c5222s, "holder");
        Object obj = this.f21404d.get(i10);
        AbstractC5868k.m23673e(obj, "mDatas[position]");
        final C5549c c5549c = (C5549c) obj;
        C7594o0.m29205p(C7594o0.f27942a, c5549c.m22497f(), C7594o0.a.Poster, c5222s.m21063b(), this.f21401a, R$drawable.bg_placehoder, 0, 32, null);
        c5222s.m21063b().setOnClickListener(new View.OnClickListener() { // from class: kd.t
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5242x.m21109f(C5242x.this, c5549c, view);
            }
        });
        c5222s.m21063b().setOnKeyListener(new View.OnKeyListener() { // from class: kd.u
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i11, KeyEvent keyEvent) {
                boolean m21110g;
                m21110g = C5242x.m21110g(C5242x.this, view, i11, keyEvent);
                return m21110g;
            }
        });
        c5222s.m21063b().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: kd.v
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z10) {
                C5242x.m21111h(C5242x.this, view, z10);
            }
        });
        c5222s.m21063b().setOnTouchListener(new View.OnTouchListener() { // from class: kd.w
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m21112i;
                m21112i = C5242x.m21112i(C5222s.this, view, motionEvent);
                return m21112i;
            }
        });
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return this.f21404d.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public C5222s onCreateViewHolder(ViewGroup viewGroup, int i10) {
        AbstractC5868k.m23674f(viewGroup, "parent");
        View inflate = LayoutInflater.from(this.f21401a).inflate(R$layout.item_column_person, viewGroup, false);
        AbstractC5868k.m23673e(inflate, "inflater.inflate(R.layou…mn_person, parent, false)");
        return new C5222s(inflate);
    }

    /* renamed from: k */
    public final void m21115k(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.f21403c = str;
    }

    /* renamed from: l */
    public final void m21116l(List list) {
        AbstractC5868k.m23674f(list, "beans");
        if (!AbstractC5868k.m23669a(this.f21404d, list)) {
            this.f21404d.clear();
            this.f21404d.addAll(list);
            notifyDataSetChanged();
        }
    }
}
