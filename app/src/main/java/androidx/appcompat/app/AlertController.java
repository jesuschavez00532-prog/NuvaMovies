package androidx.appcompat.app;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckedTextView;
import android.widget.CursorAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.R$styleable;
import androidx.appcompat.widget.AbstractC0445s1;
import androidx.core.view.AbstractC0616q0;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class AlertController {

    /* renamed from: A */
    NestedScrollView f930A;

    /* renamed from: C */
    private Drawable f932C;

    /* renamed from: D */
    private ImageView f933D;

    /* renamed from: E */
    private TextView f934E;

    /* renamed from: F */
    private TextView f935F;

    /* renamed from: G */
    private View f936G;

    /* renamed from: H */
    ListAdapter f937H;

    /* renamed from: J */
    private int f939J;

    /* renamed from: K */
    private int f940K;

    /* renamed from: L */
    int f941L;

    /* renamed from: M */
    int f942M;

    /* renamed from: N */
    int f943N;

    /* renamed from: O */
    int f944O;

    /* renamed from: P */
    private boolean f945P;

    /* renamed from: R */
    Handler f947R;

    /* renamed from: a */
    private final Context f949a;

    /* renamed from: b */
    final AbstractDialogC0312m f950b;

    /* renamed from: c */
    private final Window f951c;

    /* renamed from: d */
    private final int f952d;

    /* renamed from: e */
    private CharSequence f953e;

    /* renamed from: f */
    private CharSequence f954f;

    /* renamed from: g */
    ListView f955g;

    /* renamed from: h */
    private View f956h;

    /* renamed from: i */
    private int f957i;

    /* renamed from: j */
    private int f958j;

    /* renamed from: k */
    private int f959k;

    /* renamed from: l */
    private int f960l;

    /* renamed from: m */
    private int f961m;

    /* renamed from: o */
    Button f963o;

    /* renamed from: p */
    private CharSequence f964p;

    /* renamed from: q */
    Message f965q;

    /* renamed from: r */
    private Drawable f966r;

    /* renamed from: s */
    Button f967s;

    /* renamed from: t */
    private CharSequence f968t;

    /* renamed from: u */
    Message f969u;

    /* renamed from: v */
    private Drawable f970v;

    /* renamed from: w */
    Button f971w;

    /* renamed from: x */
    private CharSequence f972x;

    /* renamed from: y */
    Message f973y;

    /* renamed from: z */
    private Drawable f974z;

    /* renamed from: n */
    private boolean f962n = false;

    /* renamed from: B */
    private int f931B = 0;

    /* renamed from: I */
    int f938I = -1;

    /* renamed from: Q */
    private int f946Q = 0;

    /* renamed from: S */
    private final View.OnClickListener f948S = new ViewOnClickListenerC0292a();

    /* loaded from: classes.dex */
    public static class RecycleListView extends ListView {

        /* renamed from: a */
        private final int f975a;

        /* renamed from: b */
        private final int f976b;

        public RecycleListView(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f893H);
            this.f976b = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.RecycleListView_paddingBottomNoButtons, -1);
            this.f975a = obtainStyledAttributes.getDimensionPixelOffset(R$styleable.RecycleListView_paddingTopNoTitle, -1);
        }

        /* renamed from: a */
        public void m1020a(boolean z10, boolean z11) {
            int i10;
            int i11;
            if (!z11 || !z10) {
                int paddingLeft = getPaddingLeft();
                if (z10) {
                    i10 = getPaddingTop();
                } else {
                    i10 = this.f975a;
                }
                int paddingRight = getPaddingRight();
                if (z11) {
                    i11 = getPaddingBottom();
                } else {
                    i11 = this.f976b;
                }
                setPadding(paddingLeft, i10, paddingRight, i11);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$a */
    /* loaded from: classes.dex */
    class ViewOnClickListenerC0292a implements View.OnClickListener {
        ViewOnClickListenerC0292a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Message message;
            Message message2;
            Message message3;
            Message message4;
            AlertController alertController = AlertController.this;
            if (view == alertController.f963o && (message4 = alertController.f965q) != null) {
                message = Message.obtain(message4);
            } else if (view == alertController.f967s && (message3 = alertController.f969u) != null) {
                message = Message.obtain(message3);
            } else if (view == alertController.f971w && (message2 = alertController.f973y) != null) {
                message = Message.obtain(message2);
            } else {
                message = null;
            }
            if (message != null) {
                message.sendToTarget();
            }
            AlertController alertController2 = AlertController.this;
            alertController2.f947R.obtainMessage(1, alertController2.f950b).sendToTarget();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$b */
    /* loaded from: classes.dex */
    public class C0293b implements NestedScrollView.InterfaceC0656b {

        /* renamed from: a */
        final /* synthetic */ View f978a;

        /* renamed from: b */
        final /* synthetic */ View f979b;

        C0293b(View view, View view2) {
            this.f978a = view;
            this.f979b = view2;
        }

        @Override // androidx.core.widget.NestedScrollView.InterfaceC0656b
        /* renamed from: a */
        public void mo1021a(NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13) {
            AlertController.m996f(nestedScrollView, this.f978a, this.f979b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$c */
    /* loaded from: classes.dex */
    public class RunnableC0294c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f981a;

        /* renamed from: b */
        final /* synthetic */ View f982b;

        RunnableC0294c(View view, View view2) {
            this.f981a = view;
            this.f982b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m996f(AlertController.this.f930A, this.f981a, this.f982b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$d */
    /* loaded from: classes.dex */
    public class C0295d implements AbsListView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ View f984a;

        /* renamed from: b */
        final /* synthetic */ View f985b;

        C0295d(View view, View view2) {
            this.f984a = view;
            this.f985b = view2;
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
            AlertController.m996f(absListView, this.f984a, this.f985b);
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.appcompat.app.AlertController$e */
    /* loaded from: classes.dex */
    public class RunnableC0296e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ View f987a;

        /* renamed from: b */
        final /* synthetic */ View f988b;

        RunnableC0296e(View view, View view2) {
            this.f987a = view;
            this.f988b = view2;
        }

        @Override // java.lang.Runnable
        public void run() {
            AlertController.m996f(AlertController.this.f955g, this.f987a, this.f988b);
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$f */
    /* loaded from: classes.dex */
    public static class C0297f {

        /* renamed from: A */
        public int f990A;

        /* renamed from: B */
        public int f991B;

        /* renamed from: C */
        public int f992C;

        /* renamed from: D */
        public int f993D;

        /* renamed from: F */
        public boolean[] f995F;

        /* renamed from: G */
        public boolean f996G;

        /* renamed from: H */
        public boolean f997H;

        /* renamed from: J */
        public DialogInterface.OnMultiChoiceClickListener f999J;

        /* renamed from: K */
        public Cursor f1000K;

        /* renamed from: L */
        public String f1001L;

        /* renamed from: M */
        public String f1002M;

        /* renamed from: N */
        public AdapterView.OnItemSelectedListener f1003N;

        /* renamed from: a */
        public final Context f1005a;

        /* renamed from: b */
        public final LayoutInflater f1006b;

        /* renamed from: d */
        public Drawable f1008d;

        /* renamed from: f */
        public CharSequence f1010f;

        /* renamed from: g */
        public View f1011g;

        /* renamed from: h */
        public CharSequence f1012h;

        /* renamed from: i */
        public CharSequence f1013i;

        /* renamed from: j */
        public Drawable f1014j;

        /* renamed from: k */
        public DialogInterface.OnClickListener f1015k;

        /* renamed from: l */
        public CharSequence f1016l;

        /* renamed from: m */
        public Drawable f1017m;

        /* renamed from: n */
        public DialogInterface.OnClickListener f1018n;

        /* renamed from: o */
        public CharSequence f1019o;

        /* renamed from: p */
        public Drawable f1020p;

        /* renamed from: q */
        public DialogInterface.OnClickListener f1021q;

        /* renamed from: s */
        public DialogInterface.OnCancelListener f1023s;

        /* renamed from: t */
        public DialogInterface.OnDismissListener f1024t;

        /* renamed from: u */
        public DialogInterface.OnKeyListener f1025u;

        /* renamed from: v */
        public CharSequence[] f1026v;

        /* renamed from: w */
        public ListAdapter f1027w;

        /* renamed from: x */
        public DialogInterface.OnClickListener f1028x;

        /* renamed from: y */
        public int f1029y;

        /* renamed from: z */
        public View f1030z;

        /* renamed from: c */
        public int f1007c = 0;

        /* renamed from: e */
        public int f1009e = 0;

        /* renamed from: E */
        public boolean f994E = false;

        /* renamed from: I */
        public int f998I = -1;

        /* renamed from: O */
        public boolean f1004O = true;

        /* renamed from: r */
        public boolean f1022r = true;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$a */
        /* loaded from: classes.dex */
        public class a extends ArrayAdapter {

            /* renamed from: a */
            final /* synthetic */ RecycleListView f1031a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Context context, int i10, int i11, CharSequence[] charSequenceArr, RecycleListView recycleListView) {
                super(context, i10, i11, charSequenceArr);
                this.f1031a = recycleListView;
            }

            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public View getView(int i10, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i10, view, viewGroup);
                boolean[] zArr = C0297f.this.f995F;
                if (zArr != null && zArr[i10]) {
                    this.f1031a.setItemChecked(i10, true);
                }
                return view2;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$b */
        /* loaded from: classes.dex */
        public class b extends CursorAdapter {

            /* renamed from: a */
            private final int f1033a;

            /* renamed from: b */
            private final int f1034b;

            /* renamed from: c */
            final /* synthetic */ RecycleListView f1035c;

            /* renamed from: d */
            final /* synthetic */ AlertController f1036d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Context context, Cursor cursor, boolean z10, RecycleListView recycleListView, AlertController alertController) {
                super(context, cursor, z10);
                this.f1035c = recycleListView;
                this.f1036d = alertController;
                Cursor cursor2 = getCursor();
                this.f1033a = cursor2.getColumnIndexOrThrow(C0297f.this.f1001L);
                this.f1034b = cursor2.getColumnIndexOrThrow(C0297f.this.f1002M);
            }

            @Override // android.widget.CursorAdapter
            public void bindView(View view, Context context, Cursor cursor) {
                ((CheckedTextView) view.findViewById(R.id.text1)).setText(cursor.getString(this.f1033a));
                RecycleListView recycleListView = this.f1035c;
                int position = cursor.getPosition();
                boolean z10 = true;
                if (cursor.getInt(this.f1034b) != 1) {
                    z10 = false;
                }
                recycleListView.setItemChecked(position, z10);
            }

            @Override // android.widget.CursorAdapter
            public View newView(Context context, Cursor cursor, ViewGroup viewGroup) {
                return C0297f.this.f1006b.inflate(this.f1036d.f942M, viewGroup, false);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$c */
        /* loaded from: classes.dex */
        public class c implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ AlertController f1038a;

            c(AlertController alertController) {
                this.f1038a = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                C0297f.this.f1028x.onClick(this.f1038a.f950b, i10);
                if (!C0297f.this.f997H) {
                    this.f1038a.f950b.dismiss();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.appcompat.app.AlertController$f$d */
        /* loaded from: classes.dex */
        public class d implements AdapterView.OnItemClickListener {

            /* renamed from: a */
            final /* synthetic */ RecycleListView f1040a;

            /* renamed from: b */
            final /* synthetic */ AlertController f1041b;

            d(RecycleListView recycleListView, AlertController alertController) {
                this.f1040a = recycleListView;
                this.f1041b = alertController;
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
                boolean[] zArr = C0297f.this.f995F;
                if (zArr != null) {
                    zArr[i10] = this.f1040a.isItemChecked(i10);
                }
                C0297f.this.f999J.onClick(this.f1041b.f950b, i10, this.f1040a.isItemChecked(i10));
            }
        }

        public C0297f(Context context) {
            this.f1005a = context;
            this.f1006b = (LayoutInflater) context.getSystemService("layout_inflater");
        }

        /* renamed from: b */
        private void m1022b(AlertController alertController) {
            int i10;
            ListAdapter listAdapter;
            RecycleListView recycleListView = (RecycleListView) this.f1006b.inflate(alertController.f941L, (ViewGroup) null);
            if (this.f996G) {
                if (this.f1000K == null) {
                    listAdapter = new a(this.f1005a, alertController.f942M, R.id.text1, this.f1026v, recycleListView);
                } else {
                    listAdapter = new b(this.f1005a, this.f1000K, false, recycleListView, alertController);
                }
            } else {
                if (this.f997H) {
                    i10 = alertController.f943N;
                } else {
                    i10 = alertController.f944O;
                }
                int i11 = i10;
                if (this.f1000K != null) {
                    listAdapter = new SimpleCursorAdapter(this.f1005a, i11, this.f1000K, new String[]{this.f1001L}, new int[]{R.id.text1});
                } else {
                    listAdapter = this.f1027w;
                    if (listAdapter == null) {
                        listAdapter = new C0299h(this.f1005a, i11, R.id.text1, this.f1026v);
                    }
                }
            }
            alertController.f937H = listAdapter;
            alertController.f938I = this.f998I;
            if (this.f1028x != null) {
                recycleListView.setOnItemClickListener(new c(alertController));
            } else if (this.f999J != null) {
                recycleListView.setOnItemClickListener(new d(recycleListView, alertController));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f1003N;
            if (onItemSelectedListener != null) {
                recycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (this.f997H) {
                recycleListView.setChoiceMode(1);
            } else if (this.f996G) {
                recycleListView.setChoiceMode(2);
            }
            alertController.f955g = recycleListView;
        }

        /* renamed from: a */
        public void m1023a(AlertController alertController) {
            View view = this.f1011g;
            if (view != null) {
                alertController.m1012l(view);
            } else {
                CharSequence charSequence = this.f1010f;
                if (charSequence != null) {
                    alertController.m1016q(charSequence);
                }
                Drawable drawable = this.f1008d;
                if (drawable != null) {
                    alertController.m1014n(drawable);
                }
                int i10 = this.f1007c;
                if (i10 != 0) {
                    alertController.m1013m(i10);
                }
                int i11 = this.f1009e;
                if (i11 != 0) {
                    alertController.m1013m(alertController.m1006c(i11));
                }
            }
            CharSequence charSequence2 = this.f1012h;
            if (charSequence2 != null) {
                alertController.m1015o(charSequence2);
            }
            CharSequence charSequence3 = this.f1013i;
            if (charSequence3 != null || this.f1014j != null) {
                alertController.m1011k(-1, charSequence3, this.f1015k, null, this.f1014j);
            }
            CharSequence charSequence4 = this.f1016l;
            if (charSequence4 != null || this.f1017m != null) {
                alertController.m1011k(-2, charSequence4, this.f1018n, null, this.f1017m);
            }
            CharSequence charSequence5 = this.f1019o;
            if (charSequence5 != null || this.f1020p != null) {
                alertController.m1011k(-3, charSequence5, this.f1021q, null, this.f1020p);
            }
            if (this.f1026v != null || this.f1000K != null || this.f1027w != null) {
                m1022b(alertController);
            }
            View view2 = this.f1030z;
            if (view2 != null) {
                if (this.f994E) {
                    alertController.m1019t(view2, this.f990A, this.f991B, this.f992C, this.f993D);
                    return;
                } else {
                    alertController.m1018s(view2);
                    return;
                }
            }
            int i12 = this.f1029y;
            if (i12 != 0) {
                alertController.m1017r(i12);
            }
        }
    }

    /* renamed from: androidx.appcompat.app.AlertController$g */
    /* loaded from: classes.dex */
    private static final class HandlerC0298g extends Handler {

        /* renamed from: a */
        private WeakReference f1043a;

        public HandlerC0298g(DialogInterface dialogInterface) {
            this.f1043a = new WeakReference(dialogInterface);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != -3 && i10 != -2 && i10 != -1) {
                if (i10 == 1) {
                    ((DialogInterface) message.obj).dismiss();
                    return;
                }
                return;
            }
            ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) this.f1043a.get(), message.what);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.appcompat.app.AlertController$h */
    /* loaded from: classes.dex */
    public static class C0299h extends ArrayAdapter {
        public C0299h(Context context, int i10, int i11, CharSequence[] charSequenceArr) {
            super(context, i10, i11, charSequenceArr);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public boolean hasStableIds() {
            return true;
        }
    }

    public AlertController(Context context, AbstractDialogC0312m abstractDialogC0312m, Window window) {
        this.f949a = context;
        this.f950b = abstractDialogC0312m;
        this.f951c = window;
        this.f947R = new HandlerC0298g(abstractDialogC0312m);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.f910g, R$attr.alertDialogStyle, 0);
        this.f939J = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_android_layout, 0);
        this.f940K = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_buttonPanelSideLayout, 0);
        this.f941L = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_listLayout, 0);
        this.f942M = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_multiChoiceItemLayout, 0);
        this.f943N = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_singleChoiceItemLayout, 0);
        this.f944O = obtainStyledAttributes.getResourceId(R$styleable.AlertDialog_listItemLayout, 0);
        this.f945P = obtainStyledAttributes.getBoolean(R$styleable.AlertDialog_showTitle, true);
        this.f952d = obtainStyledAttributes.getDimensionPixelSize(R$styleable.AlertDialog_buttonIconDimen, 0);
        obtainStyledAttributes.recycle();
        abstractDialogC0312m.m1194d(1);
    }

    /* renamed from: a */
    static boolean m994a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (m994a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    private void m995b(Button button) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button.getLayoutParams();
        layoutParams.gravity = 1;
        layoutParams.weight = 0.5f;
        button.setLayoutParams(layoutParams);
    }

    /* renamed from: f */
    static void m996f(View view, View view2, View view3) {
        int i10;
        int i11 = 0;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            view2.setVisibility(i10);
        }
        if (view3 != null) {
            if (!view.canScrollVertically(1)) {
                i11 = 4;
            }
            view3.setVisibility(i11);
        }
    }

    /* renamed from: i */
    private ViewGroup m997i(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    /* renamed from: j */
    private int m998j() {
        int i10 = this.f940K;
        if (i10 == 0) {
            return this.f939J;
        }
        if (this.f946Q == 1) {
            return i10;
        }
        return this.f939J;
    }

    /* renamed from: p */
    private void m999p(ViewGroup viewGroup, View view, int i10, int i11) {
        View findViewById = this.f951c.findViewById(R$id.scrollIndicatorUp);
        View findViewById2 = this.f951c.findViewById(R$id.scrollIndicatorDown);
        if (Build.VERSION.SDK_INT >= 23) {
            AbstractC0616q0.m2578A0(view, i10, i11);
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
                return;
            }
            return;
        }
        if (findViewById != null && (i10 & 1) == 0) {
            viewGroup.removeView(findViewById);
            findViewById = null;
        }
        if (findViewById2 != null && (i10 & 2) == 0) {
            viewGroup.removeView(findViewById2);
            findViewById2 = null;
        }
        if (findViewById != null || findViewById2 != null) {
            if (this.f954f != null) {
                this.f930A.setOnScrollChangeListener(new C0293b(findViewById, findViewById2));
                this.f930A.post(new RunnableC0294c(findViewById, findViewById2));
                return;
            }
            ListView listView = this.f955g;
            if (listView != null) {
                listView.setOnScrollListener(new C0295d(findViewById, findViewById2));
                this.f955g.post(new RunnableC0296e(findViewById, findViewById2));
                return;
            }
            if (findViewById != null) {
                viewGroup.removeView(findViewById);
            }
            if (findViewById2 != null) {
                viewGroup.removeView(findViewById2);
            }
        }
    }

    /* renamed from: u */
    private void m1000u(ViewGroup viewGroup) {
        int i10;
        Button button = (Button) viewGroup.findViewById(R.id.button1);
        this.f963o = button;
        button.setOnClickListener(this.f948S);
        boolean z10 = true;
        if (TextUtils.isEmpty(this.f964p) && this.f966r == null) {
            this.f963o.setVisibility(8);
            i10 = 0;
        } else {
            this.f963o.setText(this.f964p);
            Drawable drawable = this.f966r;
            if (drawable != null) {
                int i11 = this.f952d;
                drawable.setBounds(0, 0, i11, i11);
                this.f963o.setCompoundDrawables(this.f966r, null, null, null);
            }
            this.f963o.setVisibility(0);
            i10 = 1;
        }
        Button button2 = (Button) viewGroup.findViewById(R.id.button2);
        this.f967s = button2;
        button2.setOnClickListener(this.f948S);
        if (TextUtils.isEmpty(this.f968t) && this.f970v == null) {
            this.f967s.setVisibility(8);
        } else {
            this.f967s.setText(this.f968t);
            Drawable drawable2 = this.f970v;
            if (drawable2 != null) {
                int i12 = this.f952d;
                drawable2.setBounds(0, 0, i12, i12);
                this.f967s.setCompoundDrawables(this.f970v, null, null, null);
            }
            this.f967s.setVisibility(0);
            i10 |= 2;
        }
        Button button3 = (Button) viewGroup.findViewById(R.id.button3);
        this.f971w = button3;
        button3.setOnClickListener(this.f948S);
        if (TextUtils.isEmpty(this.f972x) && this.f974z == null) {
            this.f971w.setVisibility(8);
        } else {
            this.f971w.setText(this.f972x);
            Drawable drawable3 = this.f974z;
            if (drawable3 != null) {
                int i13 = this.f952d;
                drawable3.setBounds(0, 0, i13, i13);
                this.f971w.setCompoundDrawables(this.f974z, null, null, null);
            }
            this.f971w.setVisibility(0);
            i10 |= 4;
        }
        if (m1005z(this.f949a)) {
            if (i10 == 1) {
                m995b(this.f963o);
            } else if (i10 == 2) {
                m995b(this.f967s);
            } else if (i10 == 4) {
                m995b(this.f971w);
            }
        }
        if (i10 == 0) {
            z10 = false;
        }
        if (!z10) {
            viewGroup.setVisibility(8);
        }
    }

    /* renamed from: v */
    private void m1001v(ViewGroup viewGroup) {
        NestedScrollView nestedScrollView = (NestedScrollView) this.f951c.findViewById(R$id.scrollView);
        this.f930A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        this.f930A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) viewGroup.findViewById(R.id.message);
        this.f935F = textView;
        if (textView == null) {
            return;
        }
        CharSequence charSequence = this.f954f;
        if (charSequence != null) {
            textView.setText(charSequence);
            return;
        }
        textView.setVisibility(8);
        this.f930A.removeView(this.f935F);
        if (this.f955g != null) {
            ViewGroup viewGroup2 = (ViewGroup) this.f930A.getParent();
            int indexOfChild = viewGroup2.indexOfChild(this.f930A);
            viewGroup2.removeViewAt(indexOfChild);
            viewGroup2.addView(this.f955g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: w */
    private void m1002w(ViewGroup viewGroup) {
        View view = this.f956h;
        boolean z10 = false;
        if (view == null) {
            if (this.f957i != 0) {
                view = LayoutInflater.from(this.f949a).inflate(this.f957i, viewGroup, false);
            } else {
                view = null;
            }
        }
        if (view != null) {
            z10 = true;
        }
        if (!z10 || !m994a(view)) {
            this.f951c.setFlags(131072, 131072);
        }
        if (z10) {
            FrameLayout frameLayout = (FrameLayout) this.f951c.findViewById(R$id.custom);
            frameLayout.addView(view, new ViewGroup.LayoutParams(-1, -1));
            if (this.f962n) {
                frameLayout.setPadding(this.f958j, this.f959k, this.f960l, this.f961m);
            }
            if (this.f955g != null) {
                ((LinearLayout.LayoutParams) ((AbstractC0445s1.a) viewGroup.getLayoutParams())).weight = 0.0f;
                return;
            }
            return;
        }
        viewGroup.setVisibility(8);
    }

    /* renamed from: x */
    private void m1003x(ViewGroup viewGroup) {
        if (this.f936G != null) {
            viewGroup.addView(this.f936G, 0, new ViewGroup.LayoutParams(-1, -2));
            this.f951c.findViewById(R$id.title_template).setVisibility(8);
            return;
        }
        this.f933D = (ImageView) this.f951c.findViewById(R.id.icon);
        if ((!TextUtils.isEmpty(this.f953e)) && this.f945P) {
            TextView textView = (TextView) this.f951c.findViewById(R$id.alertTitle);
            this.f934E = textView;
            textView.setText(this.f953e);
            int i10 = this.f931B;
            if (i10 != 0) {
                this.f933D.setImageResource(i10);
                return;
            }
            Drawable drawable = this.f932C;
            if (drawable != null) {
                this.f933D.setImageDrawable(drawable);
                return;
            } else {
                this.f934E.setPadding(this.f933D.getPaddingLeft(), this.f933D.getPaddingTop(), this.f933D.getPaddingRight(), this.f933D.getPaddingBottom());
                this.f933D.setVisibility(8);
                return;
            }
        }
        this.f951c.findViewById(R$id.title_template).setVisibility(8);
        this.f933D.setVisibility(8);
        viewGroup.setVisibility(8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    private void m1004y() {
        boolean z10;
        boolean z11;
        boolean z12;
        View findViewById;
        ListAdapter listAdapter;
        View findViewById2;
        View findViewById3;
        View findViewById4 = this.f951c.findViewById(R$id.parentPanel);
        int i10 = R$id.topPanel;
        View findViewById5 = findViewById4.findViewById(i10);
        int i11 = R$id.contentPanel;
        View findViewById6 = findViewById4.findViewById(i11);
        int i12 = R$id.buttonPanel;
        View findViewById7 = findViewById4.findViewById(i12);
        ViewGroup viewGroup = (ViewGroup) findViewById4.findViewById(R$id.customPanel);
        m1002w(viewGroup);
        View findViewById8 = viewGroup.findViewById(i10);
        View findViewById9 = viewGroup.findViewById(i11);
        View findViewById10 = viewGroup.findViewById(i12);
        ViewGroup m997i = m997i(findViewById8, findViewById5);
        ViewGroup m997i2 = m997i(findViewById9, findViewById6);
        ViewGroup m997i3 = m997i(findViewById10, findViewById7);
        m1001v(m997i2);
        m1000u(m997i3);
        m1003x(m997i);
        int i13 = 0;
        if (viewGroup.getVisibility() != 8) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (m997i != null && m997i.getVisibility() != 8) {
            z11 = 1;
        } else {
            z11 = 0;
        }
        if (m997i3 != null && m997i3.getVisibility() != 8) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (!z12 && m997i2 != null && (findViewById3 = m997i2.findViewById(R$id.textSpacerNoButtons)) != null) {
            findViewById3.setVisibility(0);
        }
        if (z11 != 0) {
            NestedScrollView nestedScrollView = this.f930A;
            if (nestedScrollView != null) {
                nestedScrollView.setClipToPadding(true);
            }
            if (this.f954f == null && this.f955g == null) {
                findViewById2 = null;
            } else {
                findViewById2 = m997i.findViewById(R$id.titleDividerNoCustom);
            }
            if (findViewById2 != null) {
                findViewById2.setVisibility(0);
            }
        } else if (m997i2 != null && (findViewById = m997i2.findViewById(R$id.textSpacerNoTitle)) != null) {
            findViewById.setVisibility(0);
        }
        ListView listView = this.f955g;
        if (listView instanceof RecycleListView) {
            ((RecycleListView) listView).m1020a(z11, z12);
        }
        if (!z10) {
            View view = this.f955g;
            if (view == null) {
                view = this.f930A;
            }
            if (view != null) {
                if (z12) {
                    i13 = 2;
                }
                m999p(m997i2, view, z11 | i13, 3);
            }
        }
        ListView listView2 = this.f955g;
        if (listView2 != null && (listAdapter = this.f937H) != null) {
            listView2.setAdapter(listAdapter);
            int i14 = this.f938I;
            if (i14 > -1) {
                listView2.setItemChecked(i14, true);
                listView2.setSelection(i14);
            }
        }
    }

    /* renamed from: z */
    private static boolean m1005z(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R$attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public int m1006c(int i10) {
        TypedValue typedValue = new TypedValue();
        this.f949a.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: d */
    public ListView m1007d() {
        return this.f955g;
    }

    /* renamed from: e */
    public void m1008e() {
        this.f950b.setContentView(m998j());
        m1004y();
    }

    /* renamed from: g */
    public boolean m1009g(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f930A;
        if (nestedScrollView != null && nestedScrollView.m2884q(keyEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m1010h(int i10, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.f930A;
        if (nestedScrollView != null && nestedScrollView.m2884q(keyEvent)) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public void m1011k(int i10, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Message message, Drawable drawable) {
        if (message == null && onClickListener != null) {
            message = this.f947R.obtainMessage(i10, onClickListener);
        }
        if (i10 != -3) {
            if (i10 != -2) {
                if (i10 == -1) {
                    this.f964p = charSequence;
                    this.f965q = message;
                    this.f966r = drawable;
                    return;
                }
                throw new IllegalArgumentException("Button does not exist");
            }
            this.f968t = charSequence;
            this.f969u = message;
            this.f970v = drawable;
            return;
        }
        this.f972x = charSequence;
        this.f973y = message;
        this.f974z = drawable;
    }

    /* renamed from: l */
    public void m1012l(View view) {
        this.f936G = view;
    }

    /* renamed from: m */
    public void m1013m(int i10) {
        this.f932C = null;
        this.f931B = i10;
        ImageView imageView = this.f933D;
        if (imageView != null) {
            if (i10 != 0) {
                imageView.setVisibility(0);
                this.f933D.setImageResource(this.f931B);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    /* renamed from: n */
    public void m1014n(Drawable drawable) {
        this.f932C = drawable;
        this.f931B = 0;
        ImageView imageView = this.f933D;
        if (imageView != null) {
            if (drawable != null) {
                imageView.setVisibility(0);
                this.f933D.setImageDrawable(drawable);
            } else {
                imageView.setVisibility(8);
            }
        }
    }

    /* renamed from: o */
    public void m1015o(CharSequence charSequence) {
        this.f954f = charSequence;
        TextView textView = this.f935F;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: q */
    public void m1016q(CharSequence charSequence) {
        this.f953e = charSequence;
        TextView textView = this.f934E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* renamed from: r */
    public void m1017r(int i10) {
        this.f956h = null;
        this.f957i = i10;
        this.f962n = false;
    }

    /* renamed from: s */
    public void m1018s(View view) {
        this.f956h = view;
        this.f957i = 0;
        this.f962n = false;
    }

    /* renamed from: t */
    public void m1019t(View view, int i10, int i11, int i12, int i13) {
        this.f956h = view;
        this.f957i = 0;
        this.f962n = true;
        this.f958j = i10;
        this.f959k = i11;
        this.f960l = i12;
        this.f961m = i13;
    }
}
