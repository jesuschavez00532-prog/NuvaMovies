package com.module.view;

import android.content.Context;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.module.R$color;
import com.module.R$id;
import com.module.R$layout;
import com.module.view.AutoCompleteEditView;
import com.zhy.autolayout.AutoRelativeLayout;
import java.util.ArrayList;
import java.util.List;
import me.jessyan.autosize.utils.AutoSizeUtils;

/* loaded from: classes2.dex */
public class AutoEmailCompleteRecyclerView extends RecyclerView {

    /* renamed from: a */
    private List f12133a;

    /* renamed from: b */
    private C2996d f12134b;

    /* renamed from: c */
    private AutoCompleteEditView f12135c;

    /* renamed from: d */
    private int f12136d;

    /* renamed from: e */
    private InputMethodManager f12137e;

    /* renamed from: f */
    private Window f12138f;

    /* renamed from: com.module.view.AutoEmailCompleteRecyclerView$a */
    /* loaded from: classes2.dex */
    class C2993a implements AutoCompleteEditView.InterfaceC2992a {

        /* renamed from: a */
        private boolean f12139a = false;

        C2993a() {
        }

        @Override // com.module.view.AutoCompleteEditView.InterfaceC2992a
        /* renamed from: a */
        public boolean mo12062a(int i10, KeyEvent keyEvent) {
            if (i10 == 4 && keyEvent.getAction() == 0) {
                if (AutoEmailCompleteRecyclerView.this.m12068f()) {
                    AutoEmailCompleteRecyclerView.this.f12137e.hideSoftInputFromWindow(AutoEmailCompleteRecyclerView.this.getWindowToken(), 0);
                    this.f12139a = true;
                    return true;
                }
                if (AutoEmailCompleteRecyclerView.this.getVisibility() == 0) {
                    AutoEmailCompleteRecyclerView.this.setVisibility(8);
                    this.f12139a = true;
                    return true;
                }
                if (keyEvent.getRepeatCount() != 0) {
                    return true;
                }
            }
            if (!this.f12139a) {
                return false;
            }
            this.f12139a = false;
            return true;
        }
    }

    /* renamed from: com.module.view.AutoEmailCompleteRecyclerView$b */
    /* loaded from: classes2.dex */
    class C2994b implements TextWatcher {
        C2994b() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            AutoEmailCompleteRecyclerView autoEmailCompleteRecyclerView = AutoEmailCompleteRecyclerView.this;
            autoEmailCompleteRecyclerView.m12070h(autoEmailCompleteRecyclerView.f12135c.getText().toString());
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        }
    }

    /* renamed from: com.module.view.AutoEmailCompleteRecyclerView$c */
    /* loaded from: classes2.dex */
    class ViewOnKeyListenerC2995c implements View.OnKeyListener {
        ViewOnKeyListenerC2995c() {
        }

        @Override // android.view.View.OnKeyListener
        public boolean onKey(View view, int i10, KeyEvent keyEvent) {
            if (i10 == 20 && AutoEmailCompleteRecyclerView.this.getVisibility() == 0 && !AutoEmailCompleteRecyclerView.this.m12068f()) {
                AutoEmailCompleteRecyclerView.this.requestFocus();
                return true;
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.module.view.AutoEmailCompleteRecyclerView$d */
    /* loaded from: classes2.dex */
    public class C2996d extends RecyclerView.AbstractC0789h {

        /* renamed from: a */
        private LayoutInflater f12143a;

        /* renamed from: b */
        private String f12144b = "";

        /* renamed from: c */
        private List f12145c = new ArrayList();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.module.view.AutoEmailCompleteRecyclerView$d$a */
        /* loaded from: classes2.dex */
        public class a implements View.OnClickListener {

            /* renamed from: a */
            final /* synthetic */ d f12147a;

            a(d dVar) {
                this.f12147a = dVar;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AutoEmailCompleteRecyclerView.this.m12067e(this.f12147a.f12153a.getText().toString());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.module.view.AutoEmailCompleteRecyclerView$d$b */
        /* loaded from: classes2.dex */
        public class b implements View.OnKeyListener {

            /* renamed from: a */
            final /* synthetic */ int f12149a;

            b(int i10) {
                this.f12149a = i10;
            }

            @Override // android.view.View.OnKeyListener
            public boolean onKey(View view, int i10, KeyEvent keyEvent) {
                C2996d c2996d = C2996d.this;
                return AutoEmailCompleteRecyclerView.this.m12069g(view, i10, keyEvent, this.f12149a, c2996d.getItemCount());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.module.view.AutoEmailCompleteRecyclerView$d$c */
        /* loaded from: classes2.dex */
        public class c implements View.OnFocusChangeListener {

            /* renamed from: a */
            final /* synthetic */ d f12151a;

            c(d dVar) {
                this.f12151a = dVar;
            }

            @Override // android.view.View.OnFocusChangeListener
            public void onFocusChange(View view, boolean z10) {
                if (z10) {
                    this.f12151a.f12153a.setBackgroundColor(AutoEmailCompleteRecyclerView.this.getResources().getColor(R$color.color_main));
                } else {
                    this.f12151a.f12153a.setBackgroundColor(AutoEmailCompleteRecyclerView.this.getResources().getColor(R$color.color_ffffffff));
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.module.view.AutoEmailCompleteRecyclerView$d$d */
        /* loaded from: classes2.dex */
        public class d extends RecyclerView.AbstractC0787f0 {

            /* renamed from: a */
            private TextView f12153a;

            public d(View view) {
                super(view);
                TextView textView = (TextView) view.findViewById(R$id.mEmailInfo);
                this.f12153a = textView;
                textView.setBackgroundColor(AutoEmailCompleteRecyclerView.this.getResources().getColor(R$color.color_ffffffff));
            }
        }

        public C2996d(Context context) {
            this.f12143a = null;
            this.f12143a = LayoutInflater.from(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(d dVar, int i10) {
            dVar.f12153a.setText(this.f12144b + ((String) this.f12145c.get(i10)));
            dVar.f12153a.setOnClickListener(new a(dVar));
            dVar.f12153a.setOnKeyListener(new b(i10));
            dVar.f12153a.setOnFocusChangeListener(new c(dVar));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new d(this.f12143a.inflate(R$layout.item_email, viewGroup, false));
        }

        /* renamed from: c */
        public void m12073c(List list) {
            this.f12145c.clear();
            this.f12145c.addAll(list);
            notifyDataSetChanged();
        }

        /* renamed from: d */
        public void m12074d(String str) {
            this.f12144b = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
        public int getItemCount() {
            return this.f12145c.size();
        }
    }

    public AutoEmailCompleteRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12133a = new ArrayList();
    }

    /* renamed from: i */
    private void m12065i() {
        AutoCompleteEditView autoCompleteEditView;
        if (getVisibility() != 0 && (autoCompleteEditView = this.f12135c) != null) {
            int[] iArr = new int[2];
            autoCompleteEditView.getLocationInWindow(iArr);
            if (getParent() instanceof AutoRelativeLayout) {
                AutoRelativeLayout.C3912a c3912a = (AutoRelativeLayout.C3912a) getLayoutParams();
                ((RelativeLayout.LayoutParams) c3912a).leftMargin = iArr[0];
                ((RelativeLayout.LayoutParams) c3912a).topMargin = iArr[1] + this.f12135c.getMeasuredHeight() + AutoSizeUtils.dp2px(getContext(), 1.0f);
                setLayoutParams(c3912a);
            }
            setVisibility(0);
        }
    }

    /* renamed from: d */
    public void m12066d(Window window, AutoCompleteEditView autoCompleteEditView) {
        this.f12138f = window;
        if (window != null) {
            Rect rect = new Rect();
            this.f12138f.getDecorView().getWindowVisibleDisplayFrame(rect);
            this.f12136d = rect.bottom;
        }
        this.f12137e = (InputMethodManager) getContext().getSystemService("input_method");
        this.f12135c = autoCompleteEditView;
        autoCompleteEditView.setOnKeyPreImeListener(new C2993a());
        this.f12135c.addTextChangedListener(new C2994b());
        this.f12135c.setOnKeyListener(new ViewOnKeyListenerC2995c());
    }

    /* renamed from: e */
    public void m12067e(String str) {
        AutoCompleteEditView autoCompleteEditView = this.f12135c;
        if (autoCompleteEditView != null) {
            autoCompleteEditView.setText(str);
            this.f12135c.setSelection(str.length());
            this.f12135c.requestFocus();
            setVisibility(8);
        }
    }

    /* renamed from: f */
    public boolean m12068f() {
        if (this.f12138f == null) {
            return false;
        }
        Rect rect = new Rect();
        this.f12138f.getDecorView().getWindowVisibleDisplayFrame(rect);
        if (this.f12136d - rect.bottom == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: g */
    public boolean m12069g(View view, int i10, KeyEvent keyEvent, int i11, int i12) {
        if (i10 != 4) {
            switch (i10) {
                case 19:
                    if (i11 == 0) {
                        if (this.f12135c != null && keyEvent.getRepeatCount() == 0 && keyEvent.getAction() == 0) {
                            this.f12135c.requestFocus();
                        }
                        return true;
                    }
                    return false;
                case 20:
                    if (i11 == i12 - 1) {
                        return true;
                    }
                    return false;
                case 21:
                case 22:
                    return true;
                default:
                    return false;
            }
        }
        AutoCompleteEditView autoCompleteEditView = this.f12135c;
        if (autoCompleteEditView != null) {
            autoCompleteEditView.requestFocus();
        }
        setVisibility(8);
        return true;
    }

    /* renamed from: h */
    protected void m12070h(String str) {
        if (this.f12134b != null && !this.f12133a.isEmpty() && !TextUtils.isEmpty(str) && str.contains("@") && str.indexOf("@") == str.lastIndexOf("@")) {
            if (str.endsWith("@")) {
                this.f12134b.m12074d(str.substring(0, str.length() - 1));
                this.f12134b.m12073c(this.f12133a);
                m12065i();
                return;
            }
            String[] split = str.toLowerCase().split("@");
            String str2 = "@" + split[1];
            int size = this.f12133a.size();
            ArrayList arrayList = new ArrayList();
            for (int i10 = 0; i10 < size; i10++) {
                String str3 = (String) this.f12133a.get(i10);
                if (str3.toLowerCase().startsWith(str2)) {
                    arrayList.add(str3);
                }
            }
            if (arrayList.isEmpty()) {
                setVisibility(8);
                return;
            }
            this.f12134b.m12074d(split[0]);
            this.f12134b.m12073c(arrayList);
            m12065i();
            return;
        }
        setVisibility(8);
    }

    public void setCompleteList(List<String> list) {
        this.f12133a.clear();
        this.f12133a.addAll(list);
        C2996d c2996d = new C2996d(getContext());
        this.f12134b = c2996d;
        setAdapter(c2996d);
    }
}
