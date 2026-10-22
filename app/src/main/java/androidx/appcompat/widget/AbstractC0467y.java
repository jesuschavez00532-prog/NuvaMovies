package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.os.Bundle;
import android.text.Selection;
import android.text.Spannable;
import android.util.Log;
import android.view.DragEvent;
import android.view.View;
import android.view.inputmethod.InputContentInfo;
import android.widget.TextView;
import androidx.core.view.AbstractC0616q0;
import androidx.core.view.C0559c;
import p405y.AbstractC7654d;
import p405y.C7655e;

/* renamed from: androidx.appcompat.widget.y */
/* loaded from: classes.dex */
abstract class AbstractC0467y {

    /* renamed from: androidx.appcompat.widget.y$a */
    /* loaded from: classes.dex */
    class a implements AbstractC7654d.c {

        /* renamed from: a */
        final /* synthetic */ View f2016a;

        a(View view) {
            this.f2016a = view;
        }

        @Override // p405y.AbstractC7654d.c
        /* renamed from: a */
        public boolean mo2033a(C7655e c7655e, int i10, Bundle bundle) {
            if (Build.VERSION.SDK_INT >= 25 && (i10 & 1) != 0) {
                try {
                    c7655e.m29454d();
                    InputContentInfo m2024a = AbstractC0463x.m2024a(c7655e.m29455e());
                    if (bundle == null) {
                        bundle = new Bundle();
                    } else {
                        bundle = new Bundle(bundle);
                    }
                    bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", m2024a);
                } catch (Exception e10) {
                    Log.w("ReceiveContent", "Can't insert content from IME; requestPermission() failed", e10);
                    return false;
                }
            }
            if (AbstractC0616q0.m2616d0(this.f2016a, new C0559c.a(new ClipData(c7655e.m29452b(), new ClipData.Item(c7655e.m29451a())), 2).m2422d(c7655e.m29453c()).m2420b(bundle).m2419a()) != null) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.y$b */
    /* loaded from: classes.dex */
    private static final class b {
        /* renamed from: a */
        static boolean m2034a(DragEvent dragEvent, TextView textView, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
            textView.beginBatchEdit();
            try {
                Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
                AbstractC0616q0.m2616d0(textView, new C0559c.a(dragEvent.getClipData(), 3).m2419a());
                textView.endBatchEdit();
                return true;
            } catch (Throwable th) {
                textView.endBatchEdit();
                throw th;
            }
        }

        /* renamed from: b */
        static boolean m2035b(DragEvent dragEvent, View view, Activity activity) {
            activity.requestDragAndDropPermissions(dragEvent);
            AbstractC0616q0.m2616d0(view, new C0559c.a(dragEvent.getClipData(), 3).m2419a());
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC7654d.c m2029a(View view) {
        return new a(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static boolean m2030b(View view, DragEvent dragEvent) {
        if (Build.VERSION.SDK_INT >= 24 && dragEvent.getLocalState() == null && AbstractC0616q0.m2585E(view) != null) {
            Activity m2032d = m2032d(view);
            if (m2032d == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + view);
                return false;
            }
            if (dragEvent.getAction() == 1) {
                return !(view instanceof TextView);
            }
            if (dragEvent.getAction() == 3) {
                if (view instanceof TextView) {
                    return b.m2034a(dragEvent, (TextView) view, m2032d);
                }
                return b.m2035b(dragEvent, view, m2032d);
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static boolean m2031c(TextView textView, int i10) {
        ClipData primaryClip;
        int i11 = 0;
        if ((i10 != 16908322 && i10 != 16908337) || AbstractC0616q0.m2585E(textView) == null) {
            return false;
        }
        ClipboardManager clipboardManager = (ClipboardManager) textView.getContext().getSystemService("clipboard");
        if (clipboardManager == null) {
            primaryClip = null;
        } else {
            primaryClip = clipboardManager.getPrimaryClip();
        }
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            C0559c.a aVar = new C0559c.a(primaryClip, 1);
            if (i10 != 16908322) {
                i11 = 1;
            }
            AbstractC0616q0.m2616d0(textView, aVar.m2421c(i11).m2419a());
        }
        return true;
    }

    /* renamed from: d */
    static Activity m2032d(View view) {
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }
}
