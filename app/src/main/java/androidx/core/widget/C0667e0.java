package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import androidx.core.view.C0559c;
import androidx.core.view.InterfaceC0592k0;

/* renamed from: androidx.core.widget.e0 */
/* loaded from: classes.dex */
public final class C0667e0 implements InterfaceC0592k0 {

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.widget.e0$a */
    /* loaded from: classes.dex */
    public static final class a {
        /* renamed from: a */
        static CharSequence m2955a(Context context, ClipData.Item item, int i10) {
            if ((i10 & 1) != 0) {
                CharSequence coerceToText = item.coerceToText(context);
                if (coerceToText instanceof Spanned) {
                    return coerceToText.toString();
                }
                return coerceToText;
            }
            return item.coerceToStyledText(context);
        }
    }

    /* renamed from: b */
    private static CharSequence m2953b(Context context, ClipData.Item item, int i10) {
        return a.m2955a(context, item, i10);
    }

    /* renamed from: c */
    private static void m2954c(Editable editable, CharSequence charSequence) {
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        int max = Math.max(0, Math.min(selectionStart, selectionEnd));
        int max2 = Math.max(0, Math.max(selectionStart, selectionEnd));
        Selection.setSelection(editable, max2);
        editable.replace(max, max2, charSequence);
    }

    @Override // androidx.core.view.InterfaceC0592k0
    /* renamed from: a */
    public C0559c mo2495a(View view, C0559c c0559c) {
        if (Log.isLoggable("ReceiveContent", 3)) {
            Log.d("ReceiveContent", "onReceive: " + c0559c);
        }
        if (c0559c.m2417d() == 2) {
            return c0559c;
        }
        ClipData m2415b = c0559c.m2415b();
        int m2416c = c0559c.m2416c();
        TextView textView = (TextView) view;
        Editable editable = (Editable) textView.getText();
        Context context = textView.getContext();
        boolean z10 = false;
        for (int i10 = 0; i10 < m2415b.getItemCount(); i10++) {
            CharSequence m2953b = m2953b(context, m2415b.getItemAt(i10), m2416c);
            if (m2953b != null) {
                if (!z10) {
                    m2954c(editable, m2953b);
                    z10 = true;
                } else {
                    editable.insert(Selection.getSelectionEnd(editable), "\n");
                    editable.insert(Selection.getSelectionEnd(editable), m2953b);
                }
            }
        }
        return null;
    }
}
