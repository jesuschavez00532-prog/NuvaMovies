package androidx.appcompat.widget;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import p373w.AbstractC7342g;

/* renamed from: androidx.appcompat.widget.l0 */
/* loaded from: classes.dex */
final class C0416l0 {

    /* renamed from: a */
    private TextView f1795a;

    /* renamed from: b */
    private TextClassifier f1796b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0416l0(TextView textView) {
        this.f1795a = (TextView) AbstractC7342g.m28327g(textView);
    }

    /* renamed from: a */
    public TextClassifier m1779a() {
        Object systemService;
        TextClassifier textClassifier;
        TextClassifier textClassifier2;
        TextClassifier textClassifier3 = this.f1796b;
        if (textClassifier3 == null) {
            systemService = this.f1795a.getContext().getSystemService((Class<Object>) AbstractC0396g0.m1708a());
            TextClassificationManager m1748a = AbstractC0404i0.m1748a(systemService);
            if (m1748a != null) {
                textClassifier2 = m1748a.getTextClassifier();
                return textClassifier2;
            }
            textClassifier = TextClassifier.NO_OP;
            return textClassifier;
        }
        return textClassifier3;
    }

    /* renamed from: b */
    public void m1780b(TextClassifier textClassifier) {
        this.f1796b = textClassifier;
    }
}
