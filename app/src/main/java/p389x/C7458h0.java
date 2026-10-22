package p389x;

import android.R;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.v4.media.session.AbstractC0272b;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.R$id;
import anet.channel.bytes.C0905a;
import anet.channel.entity.EventType;
import com.p077uc.crashsdk.export.LogType;
import com.taobao.accs.data.Message;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p331t.AbstractC6870a;
import p389x.InterfaceC7468m0;

/* renamed from: x.h0 */
/* loaded from: classes.dex */
public class C7458h0 {

    /* renamed from: d */
    private static int f27489d;

    /* renamed from: a */
    private final AccessibilityNodeInfo f27490a;

    /* renamed from: b */
    public int f27491b = -1;

    /* renamed from: c */
    private int f27492c = -1;

    /* renamed from: x.h0$a */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: A */
        public static final a f27493A;

        /* renamed from: B */
        public static final a f27494B;

        /* renamed from: C */
        public static final a f27495C;

        /* renamed from: D */
        public static final a f27496D;

        /* renamed from: E */
        public static final a f27497E;

        /* renamed from: F */
        public static final a f27498F;

        /* renamed from: G */
        public static final a f27499G;

        /* renamed from: H */
        public static final a f27500H;

        /* renamed from: I */
        public static final a f27501I;

        /* renamed from: J */
        public static final a f27502J;

        /* renamed from: K */
        public static final a f27503K;

        /* renamed from: L */
        public static final a f27504L;

        /* renamed from: M */
        public static final a f27505M;

        /* renamed from: N */
        public static final a f27506N;

        /* renamed from: O */
        public static final a f27507O;

        /* renamed from: P */
        public static final a f27508P;

        /* renamed from: Q */
        public static final a f27509Q;

        /* renamed from: e */
        public static final a f27510e = new a(1, null);

        /* renamed from: f */
        public static final a f27511f = new a(2, null);

        /* renamed from: g */
        public static final a f27512g = new a(4, null);

        /* renamed from: h */
        public static final a f27513h = new a(8, null);

        /* renamed from: i */
        public static final a f27514i = new a(16, null);

        /* renamed from: j */
        public static final a f27515j = new a(32, null);

        /* renamed from: k */
        public static final a f27516k = new a(64, null);

        /* renamed from: l */
        public static final a f27517l = new a(128, null);

        /* renamed from: m */
        public static final a f27518m = new a(256, null, InterfaceC7468m0.b.class);

        /* renamed from: n */
        public static final a f27519n = new a(512, null, InterfaceC7468m0.b.class);

        /* renamed from: o */
        public static final a f27520o = new a(EventType.AUTH_FAIL, null, InterfaceC7468m0.c.class);

        /* renamed from: p */
        public static final a f27521p = new a(2048, null, InterfaceC7468m0.c.class);

        /* renamed from: q */
        public static final a f27522q = new a(4096, null);

        /* renamed from: r */
        public static final a f27523r = new a(8192, null);

        /* renamed from: s */
        public static final a f27524s = new a(16384, null);

        /* renamed from: t */
        public static final a f27525t = new a(Message.FLAG_DATA_TYPE, null);

        /* renamed from: u */
        public static final a f27526u = new a(65536, null);

        /* renamed from: v */
        public static final a f27527v = new a(131072, null, InterfaceC7468m0.g.class);

        /* renamed from: w */
        public static final a f27528w = new a(262144, null);

        /* renamed from: x */
        public static final a f27529x = new a(C0905a.MAX_POOL_SIZE, null);

        /* renamed from: y */
        public static final a f27530y = new a(LogType.ANR, null);

        /* renamed from: z */
        public static final a f27531z = new a(2097152, null, InterfaceC7468m0.h.class);

        /* renamed from: a */
        final Object f27532a;

        /* renamed from: b */
        private final int f27533b;

        /* renamed from: c */
        private final Class f27534c;

        /* renamed from: d */
        protected final InterfaceC7468m0 f27535d;

        static {
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction27;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction28;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction29;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction30;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction31;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction32;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction33 = null;
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 23) {
                accessibilityAction32 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
                accessibilityAction = accessibilityAction32;
            } else {
                accessibilityAction = null;
            }
            f27493A = new a(accessibilityAction, R.id.accessibilityActionShowOnScreen, null, null, null);
            if (i10 >= 23) {
                accessibilityAction31 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
                accessibilityAction2 = accessibilityAction31;
            } else {
                accessibilityAction2 = null;
            }
            f27494B = new a(accessibilityAction2, R.id.accessibilityActionScrollToPosition, null, null, InterfaceC7468m0.e.class);
            if (i10 >= 23) {
                accessibilityAction30 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
                accessibilityAction3 = accessibilityAction30;
            } else {
                accessibilityAction3 = null;
            }
            f27495C = new a(accessibilityAction3, R.id.accessibilityActionScrollUp, null, null, null);
            if (i10 >= 23) {
                accessibilityAction29 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
                accessibilityAction4 = accessibilityAction29;
            } else {
                accessibilityAction4 = null;
            }
            f27496D = new a(accessibilityAction4, R.id.accessibilityActionScrollLeft, null, null, null);
            if (i10 >= 23) {
                accessibilityAction28 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
                accessibilityAction5 = accessibilityAction28;
            } else {
                accessibilityAction5 = null;
            }
            f27497E = new a(accessibilityAction5, R.id.accessibilityActionScrollDown, null, null, null);
            if (i10 >= 23) {
                accessibilityAction27 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
                accessibilityAction6 = accessibilityAction27;
            } else {
                accessibilityAction6 = null;
            }
            f27498F = new a(accessibilityAction6, R.id.accessibilityActionScrollRight, null, null, null);
            if (i10 >= 29) {
                accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
                accessibilityAction7 = accessibilityAction26;
            } else {
                accessibilityAction7 = null;
            }
            f27499G = new a(accessibilityAction7, R.id.accessibilityActionPageUp, null, null, null);
            if (i10 >= 29) {
                accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
                accessibilityAction8 = accessibilityAction25;
            } else {
                accessibilityAction8 = null;
            }
            f27500H = new a(accessibilityAction8, R.id.accessibilityActionPageDown, null, null, null);
            if (i10 >= 29) {
                accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
                accessibilityAction9 = accessibilityAction24;
            } else {
                accessibilityAction9 = null;
            }
            f27501I = new a(accessibilityAction9, R.id.accessibilityActionPageLeft, null, null, null);
            if (i10 >= 29) {
                accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
                accessibilityAction10 = accessibilityAction23;
            } else {
                accessibilityAction10 = null;
            }
            f27502J = new a(accessibilityAction10, R.id.accessibilityActionPageRight, null, null, null);
            if (i10 >= 23) {
                accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
                accessibilityAction11 = accessibilityAction22;
            } else {
                accessibilityAction11 = null;
            }
            f27503K = new a(accessibilityAction11, R.id.accessibilityActionContextClick, null, null, null);
            if (i10 >= 24) {
                accessibilityAction21 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
                accessibilityAction12 = accessibilityAction21;
            } else {
                accessibilityAction12 = null;
            }
            f27504L = new a(accessibilityAction12, R.id.accessibilityActionSetProgress, null, null, InterfaceC7468m0.f.class);
            if (i10 >= 26) {
                accessibilityAction20 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
                accessibilityAction13 = accessibilityAction20;
            } else {
                accessibilityAction13 = null;
            }
            f27505M = new a(accessibilityAction13, R.id.accessibilityActionMoveWindow, null, null, InterfaceC7468m0.d.class);
            if (i10 >= 28) {
                accessibilityAction19 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
                accessibilityAction14 = accessibilityAction19;
            } else {
                accessibilityAction14 = null;
            }
            f27506N = new a(accessibilityAction14, R.id.accessibilityActionShowTooltip, null, null, null);
            if (i10 >= 28) {
                accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
                accessibilityAction15 = accessibilityAction18;
            } else {
                accessibilityAction15 = null;
            }
            f27507O = new a(accessibilityAction15, R.id.accessibilityActionHideTooltip, null, null, null);
            if (i10 >= 30) {
                accessibilityAction17 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
                accessibilityAction16 = accessibilityAction17;
            } else {
                accessibilityAction16 = null;
            }
            f27508P = new a(accessibilityAction16, R.id.accessibilityActionPressAndHold, null, null, null);
            if (i10 >= 30) {
                accessibilityAction33 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            }
            f27509Q = new a(accessibilityAction33, R.id.accessibilityActionImeEnter, null, null, null);
        }

        public a(int i10, CharSequence charSequence) {
            this(null, i10, charSequence, null, null);
        }

        /* renamed from: a */
        public a m28639a(CharSequence charSequence, InterfaceC7468m0 interfaceC7468m0) {
            return new a(null, this.f27533b, charSequence, interfaceC7468m0, this.f27534c);
        }

        /* renamed from: b */
        public int m28640b() {
            int id2;
            if (Build.VERSION.SDK_INT >= 21) {
                id2 = AbstractC7453f.m28560a(this.f27532a).getId();
                return id2;
            }
            return 0;
        }

        /* renamed from: c */
        public CharSequence m28641c() {
            CharSequence label;
            if (Build.VERSION.SDK_INT >= 21) {
                label = AbstractC7453f.m28560a(this.f27532a).getLabel();
                return label;
            }
            return null;
        }

        /* renamed from: d */
        public boolean m28642d(View view, Bundle bundle) {
            String name;
            if (this.f27535d == null) {
                return false;
            }
            Class cls = this.f27534c;
            if (cls != null) {
                try {
                    AbstractC0272b.m941a(cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]));
                    throw null;
                } catch (Exception e10) {
                    Class cls2 = this.f27534c;
                    if (cls2 == null) {
                        name = "null";
                    } else {
                        name = cls2.getName();
                    }
                    Log.e("A11yActionCompat", "Failed to execute command with argument class ViewCommandArgument: " + name, e10);
                }
            }
            return this.f27535d.perform(view, null);
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.f27532a;
            if (obj2 == null) {
                if (aVar.f27532a != null) {
                    return false;
                }
                return true;
            }
            if (!obj2.equals(aVar.f27532a)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            Object obj = this.f27532a;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        a(Object obj) {
            this(obj, 0, null, null, null);
        }

        private a(int i10, CharSequence charSequence, Class cls) {
            this(null, i10, charSequence, null, cls);
        }

        a(Object obj, int i10, CharSequence charSequence, InterfaceC7468m0 interfaceC7468m0, Class cls) {
            this.f27533b = i10;
            this.f27535d = interfaceC7468m0;
            if (Build.VERSION.SDK_INT >= 21 && obj == null) {
                this.f27532a = new AccessibilityNodeInfo.AccessibilityAction(i10, charSequence);
            } else {
                this.f27532a = obj;
            }
            this.f27534c = cls;
        }
    }

    /* renamed from: x.h0$b */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final Object f27536a;

        b(Object obj) {
            this.f27536a = obj;
        }

        /* renamed from: a */
        public static b m28643a(int i10, int i11, boolean z10, int i12) {
            AccessibilityNodeInfo.CollectionInfo obtain;
            if (Build.VERSION.SDK_INT >= 21) {
                obtain = AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10, i12);
                return new b(obtain);
            }
            return new b(AccessibilityNodeInfo.CollectionInfo.obtain(i10, i11, z10));
        }
    }

    /* renamed from: x.h0$c */
    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        final Object f27537a;

        c(Object obj) {
            this.f27537a = obj;
        }

        /* renamed from: a */
        public static c m28644a(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
            AccessibilityNodeInfo.CollectionItemInfo obtain;
            if (Build.VERSION.SDK_INT >= 21) {
                obtain = AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10, z11);
                return new c(obtain);
            }
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i10, i11, i12, i13, z10));
        }
    }

    private C7458h0(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.f27490a = accessibilityNodeInfo;
    }

    /* renamed from: K */
    public static C7458h0 m28565K() {
        return m28578v0(AccessibilityNodeInfo.obtain());
    }

    /* renamed from: L */
    public static C7458h0 m28566L(View view) {
        return m28578v0(AccessibilityNodeInfo.obtain(view));
    }

    /* renamed from: M */
    public static C7458h0 m28567M(C7458h0 c7458h0) {
        return m28578v0(AccessibilityNodeInfo.obtain(c7458h0.f27490a));
    }

    /* renamed from: Q */
    private void m28568Q(View view) {
        SparseArray m28577u = m28577u(view);
        if (m28577u != null) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < m28577u.size(); i10++) {
                if (((WeakReference) m28577u.valueAt(i10)).get() == null) {
                    arrayList.add(Integer.valueOf(i10));
                }
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                m28577u.remove(((Integer) arrayList.get(i11)).intValue());
            }
        }
    }

    /* renamed from: S */
    private void m28569S(int i10, boolean z10) {
        Bundle m28630r = m28630r();
        if (m28630r != null) {
            int i11 = m28630r.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (i10 ^ (-1));
            if (!z10) {
                i10 = 0;
            }
            m28630r.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i10 | i11);
        }
    }

    /* renamed from: d */
    private void m28570d(ClickableSpan clickableSpan, Spanned spanned, int i10) {
        m28572g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan)));
        m28572g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan)));
        m28572g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan)));
        m28572g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i10));
    }

    /* renamed from: f */
    private void m28571f() {
        this.f27490a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        this.f27490a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        this.f27490a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        this.f27490a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
    }

    /* renamed from: g */
    private List m28572g(String str) {
        ArrayList<Integer> integerArrayList = this.f27490a.getExtras().getIntegerArrayList(str);
        if (integerArrayList == null) {
            ArrayList<Integer> arrayList = new ArrayList<>();
            this.f27490a.getExtras().putIntegerArrayList(str, arrayList);
            return arrayList;
        }
        return integerArrayList;
    }

    /* renamed from: i */
    private static String m28573i(int i10) {
        if (i10 == 1) {
            return "ACTION_FOCUS";
        }
        if (i10 == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i10) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case EventType.AUTH_FAIL /* 1024 */:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case Message.FLAG_DATA_TYPE /* 32768 */:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case C0905a.MAX_POOL_SIZE /* 524288 */:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case R.id.accessibilityActionMoveWindow:
                return "ACTION_MOVE_WINDOW";
            case R.id.accessibilityActionImeEnter:
                return "ACTION_IME_ENTER";
            default:
                switch (i10) {
                    case R.id.accessibilityActionShowOnScreen:
                        return "ACTION_SHOW_ON_SCREEN";
                    case R.id.accessibilityActionScrollToPosition:
                        return "ACTION_SCROLL_TO_POSITION";
                    case R.id.accessibilityActionScrollUp:
                        return "ACTION_SCROLL_UP";
                    case R.id.accessibilityActionScrollLeft:
                        return "ACTION_SCROLL_LEFT";
                    case R.id.accessibilityActionScrollDown:
                        return "ACTION_SCROLL_DOWN";
                    case R.id.accessibilityActionScrollRight:
                        return "ACTION_SCROLL_RIGHT";
                    case R.id.accessibilityActionContextClick:
                        return "ACTION_CONTEXT_CLICK";
                    case R.id.accessibilityActionSetProgress:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i10) {
                            case R.id.accessibilityActionShowTooltip:
                                return "ACTION_SHOW_TOOLTIP";
                            case R.id.accessibilityActionHideTooltip:
                                return "ACTION_HIDE_TOOLTIP";
                            case R.id.accessibilityActionPageUp:
                                return "ACTION_PAGE_UP";
                            case R.id.accessibilityActionPageDown:
                                return "ACTION_PAGE_DOWN";
                            case R.id.accessibilityActionPageLeft:
                                return "ACTION_PAGE_LEFT";
                            case R.id.accessibilityActionPageRight:
                                return "ACTION_PAGE_RIGHT";
                            case R.id.accessibilityActionPressAndHold:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    /* renamed from: k */
    private boolean m28574k(int i10) {
        Bundle m28630r = m28630r();
        if (m28630r == null || (m28630r.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & i10) != i10) {
            return false;
        }
        return true;
    }

    /* renamed from: p */
    public static ClickableSpan[] m28575p(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    /* renamed from: s */
    private SparseArray m28576s(View view) {
        SparseArray m28577u = m28577u(view);
        if (m28577u == null) {
            SparseArray sparseArray = new SparseArray();
            view.setTag(R$id.tag_accessibility_clickable_spans, sparseArray);
            return sparseArray;
        }
        return m28577u;
    }

    /* renamed from: u */
    private SparseArray m28577u(View view) {
        return (SparseArray) view.getTag(R$id.tag_accessibility_clickable_spans);
    }

    /* renamed from: v0 */
    public static C7458h0 m28578v0(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new C7458h0(accessibilityNodeInfo);
    }

    /* renamed from: x */
    private boolean m28579x() {
        return !m28572g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    /* renamed from: y */
    private int m28580y(ClickableSpan clickableSpan, SparseArray sparseArray) {
        if (sparseArray != null) {
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray.valueAt(i10)).get())) {
                    return sparseArray.keyAt(i10);
                }
            }
        }
        int i11 = f27489d;
        f27489d = i11 + 1;
        return i11;
    }

    /* renamed from: A */
    public boolean m28581A() {
        return this.f27490a.isChecked();
    }

    /* renamed from: B */
    public boolean m28582B() {
        return this.f27490a.isClickable();
    }

    /* renamed from: C */
    public boolean m28583C() {
        return this.f27490a.isEnabled();
    }

    /* renamed from: D */
    public boolean m28584D() {
        return this.f27490a.isFocusable();
    }

    /* renamed from: E */
    public boolean m28585E() {
        return this.f27490a.isFocused();
    }

    /* renamed from: F */
    public boolean m28586F() {
        return this.f27490a.isLongClickable();
    }

    /* renamed from: G */
    public boolean m28587G() {
        return this.f27490a.isPassword();
    }

    /* renamed from: H */
    public boolean m28588H() {
        return this.f27490a.isScrollable();
    }

    /* renamed from: I */
    public boolean m28589I() {
        return this.f27490a.isSelected();
    }

    /* renamed from: J */
    public boolean m28590J() {
        boolean isShowingHintText;
        if (Build.VERSION.SDK_INT >= 26) {
            isShowingHintText = this.f27490a.isShowingHintText();
            return isShowingHintText;
        }
        return m28574k(4);
    }

    /* renamed from: N */
    public boolean m28591N(int i10, Bundle bundle) {
        return this.f27490a.performAction(i10, bundle);
    }

    /* renamed from: O */
    public void m28592O() {
        this.f27490a.recycle();
    }

    /* renamed from: P */
    public boolean m28593P(a aVar) {
        boolean removeAction;
        if (Build.VERSION.SDK_INT >= 21) {
            removeAction = this.f27490a.removeAction(AbstractC7453f.m28560a(aVar.f27532a));
            return removeAction;
        }
        return false;
    }

    /* renamed from: R */
    public void m28594R(boolean z10) {
        this.f27490a.setAccessibilityFocused(z10);
    }

    /* renamed from: T */
    public void m28595T(Rect rect) {
        this.f27490a.setBoundsInParent(rect);
    }

    /* renamed from: U */
    public void m28596U(Rect rect) {
        this.f27490a.setBoundsInScreen(rect);
    }

    /* renamed from: V */
    public void m28597V(boolean z10) {
        this.f27490a.setCheckable(z10);
    }

    /* renamed from: W */
    public void m28598W(boolean z10) {
        this.f27490a.setChecked(z10);
    }

    /* renamed from: X */
    public void m28599X(CharSequence charSequence) {
        this.f27490a.setClassName(charSequence);
    }

    /* renamed from: Y */
    public void m28600Y(boolean z10) {
        this.f27490a.setClickable(z10);
    }

    /* renamed from: Z */
    public void m28601Z(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f27490a;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((b) obj).f27536a;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    /* renamed from: a */
    public void m28602a(int i10) {
        this.f27490a.addAction(i10);
    }

    /* renamed from: a0 */
    public void m28603a0(Object obj) {
        AccessibilityNodeInfo.CollectionItemInfo collectionItemInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f27490a;
        if (obj == null) {
            collectionItemInfo = null;
        } else {
            collectionItemInfo = (AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).f27537a;
        }
        accessibilityNodeInfo.setCollectionItemInfo(collectionItemInfo);
    }

    /* renamed from: b */
    public void m28604b(a aVar) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f27490a.addAction(AbstractC7453f.m28560a(aVar.f27532a));
        }
    }

    /* renamed from: b0 */
    public void m28605b0(CharSequence charSequence) {
        this.f27490a.setContentDescription(charSequence);
    }

    /* renamed from: c */
    public void m28606c(View view, int i10) {
        this.f27490a.addChild(view, i10);
    }

    /* renamed from: c0 */
    public void m28607c0(boolean z10) {
        this.f27490a.setContentInvalid(z10);
    }

    /* renamed from: d0 */
    public void m28608d0(boolean z10) {
        this.f27490a.setEnabled(z10);
    }

    /* renamed from: e */
    public void m28609e(CharSequence charSequence, View view) {
        if (Build.VERSION.SDK_INT < 26) {
            m28571f();
            m28568Q(view);
            ClickableSpan[] m28575p = m28575p(charSequence);
            if (m28575p != null && m28575p.length > 0) {
                m28630r().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R$id.accessibility_action_clickable_span);
                SparseArray m28576s = m28576s(view);
                for (int i10 = 0; i10 < m28575p.length; i10++) {
                    int m28580y = m28580y(m28575p[i10], m28576s);
                    m28576s.put(m28580y, new WeakReference(m28575p[i10]));
                    m28570d(m28575p[i10], (Spanned) charSequence, m28580y);
                }
            }
        }
    }

    /* renamed from: e0 */
    public void m28610e0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.f27490a.setError(charSequence);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C7458h0)) {
            return false;
        }
        C7458h0 c7458h0 = (C7458h0) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.f27490a;
        if (accessibilityNodeInfo == null) {
            if (c7458h0.f27490a != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(c7458h0.f27490a)) {
            return false;
        }
        if (this.f27492c == c7458h0.f27492c && this.f27491b == c7458h0.f27491b) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    public void m28611f0(boolean z10) {
        this.f27490a.setFocusable(z10);
    }

    /* renamed from: g0 */
    public void m28612g0(boolean z10) {
        this.f27490a.setFocused(z10);
    }

    /* renamed from: h */
    public List m28613h() {
        List list;
        if (Build.VERSION.SDK_INT >= 21) {
            list = this.f27490a.getActionList();
        } else {
            list = null;
        }
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                arrayList.add(new a(list.get(i10)));
            }
            return arrayList;
        }
        return Collections.emptyList();
    }

    /* renamed from: h0 */
    public void m28614h0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27490a.setHeading(z10);
        } else {
            m28569S(2, z10);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.f27490a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    /* renamed from: i0 */
    public void m28615i0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f27490a.setHintText(charSequence);
        } else {
            this.f27490a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    /* renamed from: j */
    public int m28616j() {
        return this.f27490a.getActions();
    }

    /* renamed from: j0 */
    public void m28617j0(CharSequence charSequence) {
        this.f27490a.setPackageName(charSequence);
    }

    /* renamed from: k0 */
    public void m28618k0(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27490a.setPaneTitle(charSequence);
        } else {
            this.f27490a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    /* renamed from: l */
    public void m28619l(Rect rect) {
        this.f27490a.getBoundsInParent(rect);
    }

    /* renamed from: l0 */
    public void m28620l0(View view) {
        this.f27491b = -1;
        this.f27490a.setParent(view);
    }

    /* renamed from: m */
    public void m28621m(Rect rect) {
        this.f27490a.getBoundsInScreen(rect);
    }

    /* renamed from: m0 */
    public void m28622m0(View view, int i10) {
        this.f27491b = i10;
        this.f27490a.setParent(view, i10);
    }

    /* renamed from: n */
    public int m28623n() {
        return this.f27490a.getChildCount();
    }

    /* renamed from: n0 */
    public void m28624n0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.f27490a.setScreenReaderFocusable(z10);
        } else {
            m28569S(1, z10);
        }
    }

    /* renamed from: o */
    public CharSequence m28625o() {
        return this.f27490a.getClassName();
    }

    /* renamed from: o0 */
    public void m28626o0(boolean z10) {
        this.f27490a.setScrollable(z10);
    }

    /* renamed from: p0 */
    public void m28627p0(boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.f27490a.setShowingHintText(z10);
        } else {
            m28569S(4, z10);
        }
    }

    /* renamed from: q */
    public CharSequence m28628q() {
        return this.f27490a.getContentDescription();
    }

    /* renamed from: q0 */
    public void m28629q0(View view, int i10) {
        this.f27492c = i10;
        this.f27490a.setSource(view, i10);
    }

    /* renamed from: r */
    public Bundle m28630r() {
        return this.f27490a.getExtras();
    }

    /* renamed from: r0 */
    public void m28631r0(CharSequence charSequence) {
        if (AbstractC6870a.m26776b()) {
            this.f27490a.setStateDescription(charSequence);
        } else {
            this.f27490a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
        }
    }

    /* renamed from: s0 */
    public void m28632s0(CharSequence charSequence) {
        this.f27490a.setText(charSequence);
    }

    /* renamed from: t */
    public CharSequence m28633t() {
        return this.f27490a.getPackageName();
    }

    /* renamed from: t0 */
    public void m28634t0(boolean z10) {
        this.f27490a.setVisibleToUser(z10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        Rect rect = new Rect();
        m28619l(rect);
        sb2.append("; boundsInParent: " + rect);
        m28621m(rect);
        sb2.append("; boundsInScreen: " + rect);
        sb2.append("; packageName: ");
        sb2.append(m28633t());
        sb2.append("; className: ");
        sb2.append(m28625o());
        sb2.append("; text: ");
        sb2.append(m28636v());
        sb2.append("; contentDescription: ");
        sb2.append(m28628q());
        sb2.append("; viewId: ");
        sb2.append(m28637w());
        sb2.append("; checkable: ");
        sb2.append(m28638z());
        sb2.append("; checked: ");
        sb2.append(m28581A());
        sb2.append("; focusable: ");
        sb2.append(m28584D());
        sb2.append("; focused: ");
        sb2.append(m28585E());
        sb2.append("; selected: ");
        sb2.append(m28589I());
        sb2.append("; clickable: ");
        sb2.append(m28582B());
        sb2.append("; longClickable: ");
        sb2.append(m28586F());
        sb2.append("; enabled: ");
        sb2.append(m28583C());
        sb2.append("; password: ");
        sb2.append(m28587G());
        sb2.append("; scrollable: " + m28588H());
        sb2.append("; [");
        if (Build.VERSION.SDK_INT >= 21) {
            List m28613h = m28613h();
            for (int i10 = 0; i10 < m28613h.size(); i10++) {
                a aVar = (a) m28613h.get(i10);
                String m28573i = m28573i(aVar.m28640b());
                if (m28573i.equals("ACTION_UNKNOWN") && aVar.m28641c() != null) {
                    m28573i = aVar.m28641c().toString();
                }
                sb2.append(m28573i);
                if (i10 != m28613h.size() - 1) {
                    sb2.append(", ");
                }
            }
        } else {
            int m28616j = m28616j();
            while (m28616j != 0) {
                int numberOfTrailingZeros = 1 << Integer.numberOfTrailingZeros(m28616j);
                m28616j &= numberOfTrailingZeros ^ (-1);
                sb2.append(m28573i(numberOfTrailingZeros));
                if (m28616j != 0) {
                    sb2.append(", ");
                }
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* renamed from: u0 */
    public AccessibilityNodeInfo m28635u0() {
        return this.f27490a;
    }

    /* renamed from: v */
    public CharSequence m28636v() {
        if (m28579x()) {
            List m28572g = m28572g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List m28572g2 = m28572g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List m28572g3 = m28572g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List m28572g4 = m28572g("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            SpannableString spannableString = new SpannableString(TextUtils.substring(this.f27490a.getText(), 0, this.f27490a.getText().length()));
            for (int i10 = 0; i10 < m28572g.size(); i10++) {
                spannableString.setSpan(new C7443a(((Integer) m28572g4.get(i10)).intValue(), this, m28630r().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer) m28572g.get(i10)).intValue(), ((Integer) m28572g2.get(i10)).intValue(), ((Integer) m28572g3.get(i10)).intValue());
            }
            return spannableString;
        }
        return this.f27490a.getText();
    }

    /* renamed from: w */
    public String m28637w() {
        return this.f27490a.getViewIdResourceName();
    }

    /* renamed from: z */
    public boolean m28638z() {
        return this.f27490a.isCheckable();
    }
}
