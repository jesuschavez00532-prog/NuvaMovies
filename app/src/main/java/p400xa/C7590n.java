package p400xa;

import android.widget.EditText;
import ne.AbstractC5868k;

/* renamed from: xa.n */
/* loaded from: classes2.dex */
public final class C7590n {

    /* renamed from: a */
    public static final C7590n f27938a;

    /* renamed from: b */
    private static final String f27939b;

    static {
        C7590n c7590n = new C7590n();
        f27938a = c7590n;
        f27939b = c7590n.getClass().getSimpleName();
    }

    private C7590n() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0031, code lost:
    
        if (r0 <= r5.length()) goto L8;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m29185a(android.widget.EditText r3, android.widget.EditText r4, java.lang.String r5) {
        /*
            r2 = this;
            java.lang.String r0 = "mEditText"
            ne.AbstractC5868k.m23674f(r3, r0)
            java.lang.String r0 = "et_lock_time_one"
            ne.AbstractC5868k.m23674f(r4, r0)
            android.text.Editable r0 = r3.getText()
            java.lang.String r0 = r0.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L7f
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L33
            android.text.Editable r0 = r3.getText()
            java.lang.String r0 = r0.toString()
            int r0 = r0.length()
            ne.AbstractC5868k.m23671c(r5)
            int r5 = r5.length()
            if (r0 > r5) goto L41
        L33:
            android.text.Editable r4 = r4.getText()
            java.lang.String r4 = r4.toString()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L7f
        L41:
            android.text.Editable r4 = r3.getText()
            java.lang.String r4 = r4.toString()
            int r4 = r4.length()
            int r5 = r2.m29186b(r3)
            r0 = 5
            if (r4 <= r0) goto L7f
            if (r4 < r5) goto L7f
            r0 = 1
            if (r5 != 0) goto L62
            android.text.Editable r4 = r3.getText()
            r5 = 2
            r4.delete(r0, r5)
            goto L7c
        L62:
            if (r5 != r4) goto L71
            int r1 = r5 + (-2)
            if (r1 < 0) goto L71
            android.text.Editable r4 = r3.getText()
            int r5 = r5 - r0
            r4.delete(r1, r5)
            goto L7c
        L71:
            int r0 = r5 + 1
            if (r0 > r4) goto L7c
            android.text.Editable r4 = r3.getText()
            r4.delete(r5, r0)
        L7c:
            r3.invalidate()
        L7f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p400xa.C7590n.m29185a(android.widget.EditText, android.widget.EditText, java.lang.String):void");
    }

    /* renamed from: b */
    public final int m29186b(EditText editText) {
        AbstractC5868k.m23674f(editText, "mEditText");
        return editText.getSelectionStart();
    }

    /* renamed from: c */
    public final void m29187c(EditText editText, String str) {
        AbstractC5868k.m23674f(editText, "mEditText");
        AbstractC5868k.m23674f(str, "mText");
        editText.getText().insert(2, str);
    }
}
