package p263o8;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.live.R$id;
import com.live.R$layout;
import me.InterfaceC5660l;
import ne.AbstractC5868k;

/* renamed from: o8.m */
/* loaded from: classes2.dex */
public final class ViewOnFocusChangeListenerC5935m implements View.OnFocusChangeListener, View.OnClickListener {

    /* renamed from: a */
    private Context f23605a;

    /* renamed from: b */
    private ViewGroup f23606b;

    /* renamed from: c */
    private final String f23607c;

    /* renamed from: d */
    private ViewGroup f23608d;

    /* renamed from: e */
    private View f23609e;

    /* renamed from: f */
    private View f23610f;

    /* renamed from: g */
    private View f23611g;

    /* renamed from: h */
    private View f23612h;

    /* renamed from: i */
    private InterfaceC5660l f23613i;

    /* renamed from: j */
    private InterfaceC5660l f23614j;

    /* renamed from: k */
    private InterfaceC5660l f23615k;

    public ViewOnFocusChangeListenerC5935m(Context context, ViewGroup viewGroup) {
        AbstractC5868k.m23674f(context, "mContext");
        AbstractC5868k.m23674f(viewGroup, "mParent");
        this.f23605a = context;
        this.f23606b = viewGroup;
        this.f23607c = "LiveMosaicoBorder";
        View inflate = LayoutInflater.from(context).inflate(R$layout.layout_mosaico_border, this.f23606b, false);
        AbstractC5868k.m23672d(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
        ViewGroup viewGroup2 = (ViewGroup) inflate;
        this.f23608d = viewGroup2;
        View findViewById = viewGroup2.findViewById(R$id.topLeftFocus);
        AbstractC5868k.m23673e(findViewById, "mRootView.findViewById(R.id.topLeftFocus)");
        this.f23609e = findViewById;
        View findViewById2 = this.f23608d.findViewById(R$id.bottomLeftFocus);
        AbstractC5868k.m23673e(findViewById2, "mRootView.findViewById(R.id.bottomLeftFocus)");
        this.f23610f = findViewById2;
        View findViewById3 = this.f23608d.findViewById(R$id.topRightFocus);
        AbstractC5868k.m23673e(findViewById3, "mRootView.findViewById(R.id.topRightFocus)");
        this.f23611g = findViewById3;
        View findViewById4 = this.f23608d.findViewById(R$id.bottomRightFocus);
        AbstractC5868k.m23673e(findViewById4, "mRootView.findViewById(R.id.bottomRightFocus)");
        this.f23612h = findViewById4;
        this.f23609e.setOnFocusChangeListener(this);
        this.f23610f.setOnFocusChangeListener(this);
        this.f23611g.setOnFocusChangeListener(this);
        this.f23612h.setOnFocusChangeListener(this);
        this.f23609e.setOnClickListener(this);
        this.f23610f.setOnClickListener(this);
        this.f23611g.setOnClickListener(this);
        this.f23612h.setOnClickListener(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m24032c(int i10, ViewOnFocusChangeListenerC5935m viewOnFocusChangeListenerC5935m) {
        AbstractC5868k.m23674f(viewOnFocusChangeListenerC5935m, "this$0");
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        viewOnFocusChangeListenerC5935m.f23609e.requestFocus();
                        return;
                    } else {
                        viewOnFocusChangeListenerC5935m.f23612h.requestFocus();
                        return;
                    }
                }
                viewOnFocusChangeListenerC5935m.f23610f.requestFocus();
                return;
            }
            viewOnFocusChangeListenerC5935m.f23611g.requestFocus();
            return;
        }
        viewOnFocusChangeListenerC5935m.f23609e.requestFocus();
    }

    /* renamed from: b */
    public final void m24033b(final int i10) {
        ViewGroup viewGroup;
        ViewParent parent = this.f23608d.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null && !AbstractC5868k.m23669a(viewGroup, this.f23606b)) {
            viewGroup.removeView(this.f23608d);
        }
        if (!AbstractC5868k.m23669a(viewGroup, this.f23606b)) {
            this.f23606b.addView(this.f23608d);
        }
        this.f23606b.post(new Runnable() { // from class: o8.l
            @Override // java.lang.Runnable
            public final void run() {
                ViewOnFocusChangeListenerC5935m.m24032c(i10, this);
            }
        });
    }

    /* renamed from: d */
    public final boolean m24034d() {
        ViewGroup viewGroup;
        ViewParent parent = this.f23608d.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null && AbstractC5868k.m23669a(viewGroup, this.f23606b) && this.f23608d.getFocusedChild() != null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final boolean m24035e(int i10, KeyEvent keyEvent) {
        Boolean bool;
        AbstractC5868k.m23674f(keyEvent, "event");
        if (!m24034d() || i10 == 4) {
            return false;
        }
        if (i10 != 66 && i10 != 82) {
            switch (i10) {
                case 19:
                    if (this.f23610f.hasFocus()) {
                        this.f23609e.requestFocus();
                    } else {
                        if (!this.f23612h.hasFocus()) {
                            return false;
                        }
                        this.f23611g.requestFocus();
                    }
                    return true;
                case 20:
                    if (this.f23609e.hasFocus()) {
                        this.f23610f.requestFocus();
                    } else {
                        if (!this.f23611g.hasFocus()) {
                            return false;
                        }
                        this.f23612h.requestFocus();
                    }
                    return true;
                case 21:
                    if (this.f23612h.hasFocus()) {
                        this.f23610f.requestFocus();
                    } else if (this.f23611g.hasFocus()) {
                        this.f23609e.requestFocus();
                    } else {
                        if (!this.f23610f.hasFocus() && !this.f23609e.hasFocus()) {
                            return false;
                        }
                        InterfaceC5660l interfaceC5660l = this.f23615k;
                        if (interfaceC5660l != null) {
                            bool = (Boolean) interfaceC5660l.mo542f(17);
                        } else {
                            bool = null;
                        }
                        AbstractC5868k.m23669a(bool, Boolean.TRUE);
                        return true;
                    }
                    return true;
                case 22:
                    if (this.f23610f.hasFocus()) {
                        this.f23612h.requestFocus();
                    } else {
                        if (!this.f23609e.hasFocus()) {
                            return false;
                        }
                        this.f23611g.requestFocus();
                    }
                    return true;
                case 23:
                    break;
                default:
                    return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public final void m24036f(InterfaceC5660l interfaceC5660l) {
        this.f23615k = interfaceC5660l;
    }

    /* renamed from: g */
    public final void m24037g(InterfaceC5660l interfaceC5660l) {
        this.f23614j = interfaceC5660l;
    }

    /* renamed from: h */
    public final void m24038h(InterfaceC5660l interfaceC5660l) {
        this.f23613i = interfaceC5660l;
    }

    /* renamed from: i */
    public final void m24039i() {
        ViewGroup viewGroup;
        ViewParent parent = this.f23608d.getParent();
        if (parent instanceof ViewGroup) {
            viewGroup = (ViewGroup) parent;
        } else {
            viewGroup = null;
        }
        if (viewGroup != null) {
            viewGroup.removeView(this.f23608d);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i10 = 0;
        if (!AbstractC5868k.m23669a(view, this.f23609e)) {
            if (AbstractC5868k.m23669a(view, this.f23611g)) {
                i10 = 1;
            } else if (AbstractC5868k.m23669a(view, this.f23610f)) {
                i10 = 2;
            } else if (AbstractC5868k.m23669a(view, this.f23612h)) {
                i10 = 3;
            }
        }
        InterfaceC5660l interfaceC5660l = this.f23614j;
        if (interfaceC5660l != null) {
            interfaceC5660l.mo542f(Integer.valueOf(i10));
        }
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(View view, boolean z10) {
        if (z10) {
            int i10 = 0;
            if (!AbstractC5868k.m23669a(view, this.f23609e)) {
                if (AbstractC5868k.m23669a(view, this.f23611g)) {
                    i10 = 1;
                } else if (AbstractC5868k.m23669a(view, this.f23610f)) {
                    i10 = 2;
                } else if (AbstractC5868k.m23669a(view, this.f23612h)) {
                    i10 = 3;
                }
            }
            InterfaceC5660l interfaceC5660l = this.f23613i;
            if (interfaceC5660l != null) {
                interfaceC5660l.mo542f(Integer.valueOf(i10));
            }
        }
    }
}
