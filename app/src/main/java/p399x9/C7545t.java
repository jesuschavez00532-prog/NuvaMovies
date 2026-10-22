package p399x9;

import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.module.R$id;
import com.module.R$layout;
import me.InterfaceC5660l;
import ne.AbstractC5868k;

/* renamed from: x9.t */
/* loaded from: classes2.dex */
public final class C7545t extends AbstractC7527b {

    /* renamed from: e */
    private final InterfaceC5660l f27727e;

    public C7545t(InterfaceC5660l interfaceC5660l) {
        super(R$layout.layout_item_selection_interval, null, 2, null);
        this.f27727e = interfaceC5660l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: r */
    public static final boolean m28911r(C7545t c7545t, C7531f c7531f, View view, MotionEvent motionEvent) {
        InterfaceC5660l interfaceC5660l;
        AbstractC5868k.m23674f(c7545t, "this$0");
        AbstractC5868k.m23674f(c7531f, "$holder");
        if (motionEvent.getAction() == 1 && (interfaceC5660l = c7545t.f27727e) != null) {
            interfaceC5660l.mo542f(Integer.valueOf(c7531f.getAdapterPosition()));
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, String str) {
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(str, "bean");
        TextView textView = (TextView) c7531f.m28863b(R$id.mTextTitle);
        textView.setText(str);
        textView.setOnTouchListener(new View.OnTouchListener() { // from class: x9.s
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                boolean m28911r;
                m28911r = C7545t.m28911r(C7545t.this, c7531f, view, motionEvent);
                return m28911r;
            }
        });
    }
}
