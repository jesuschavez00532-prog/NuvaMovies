package p110e3;

import android.view.KeyEvent;
import android.view.View;
import android.widget.TextView;
import com.download.R$id;
import com.download.R$layout;
import com.download.R$string;
import com.module.bean.AudioInfoBean;
import com.module.bean.SourceBean;
import java.util.List;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import p399x9.AbstractC7527b;
import p399x9.C7531f;

/* renamed from: e3.c */
/* loaded from: classes.dex */
public final class C4125c extends AbstractC7527b {

    /* renamed from: e */
    private InterfaceC5660l f18097e;

    /* renamed from: f */
    private int f18098f;

    public C4125c() {
        super(R$layout.item_download_select_audio, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s */
    public static final void m17255s(C7531f c7531f, C4125c c4125c, View view) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c4125c, "this$0");
        if (c7531f.getAdapterPosition() == c4125c.f18098f) {
            return;
        }
        InterfaceC5660l interfaceC5660l = c4125c.f18097e;
        if (interfaceC5660l != null) {
            interfaceC5660l.mo542f(Integer.valueOf(c7531f.getAdapterPosition()));
        }
        c4125c.f18098f = c7531f.getAdapterPosition();
        c4125c.notifyDataSetChanged();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public static final boolean m17256t(C7531f c7531f, C4125c c4125c, View view, int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(c7531f, "$holder");
        AbstractC5868k.m23674f(c4125c, "this$0");
        if (i10 == 21 && c7531f.getAdapterPosition() == 0) {
            return true;
        }
        if (i10 == 22 && c7531f.getAdapterPosition() >= c4125c.getItemCount() - 1) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p399x9.AbstractC7527b
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public void mo5338e(final C7531f c7531f, SourceBean sourceBean) {
        boolean z10 = false;
        String sb2 = null;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(sourceBean, "bean");
        TextView textView = (TextView) c7531f.m28863b(R$id.mTvSource);
        TextView textView2 = (TextView) c7531f.m28863b(R$id.mTvAudios);
        View view = c7531f.itemView;
        boolean z11 = false;
        if (c7531f.getAdapterPosition() == this.f18098f) {
            z10 = true;
        } else {
            z10 = false;
        }
        view.setSelected(z10);
        textView.setText(m28850h().getString(R$string.download_source, Integer.valueOf(c7531f.getAdapterPosition() + 1)));
        StringBuilder sb3 = new StringBuilder();
        List<AudioInfoBean> audioInfoList = sourceBean.getAudioInfoList();
        int size = audioInfoList.size() - 1;
        if (size >= 0) {
            int i10 = 0;
            while (true) {
                sb3.append(audioInfoList.get(i10).getTransLanguage());
                if (i10 < sourceBean.getAudioInfoList().size() - 1) {
                    sb3.append("  ");
                }
                if (i10 == size) {
                    break;
                } else {
                    i10++;
                }
            }
        }
        if (sb3.length() == 0) {
            z11 = true;
        }
        if (z11) {
            sb2 = "";
        } else {
            StringBuilder sb4 = new StringBuilder();
            sb4.append('(');
            sb4.append((Object) sb3);
            sb4.append(')');
            sb2 = sb4.toString();
        }
        textView2.setText(sb2);
        c7531f.itemView.setOnClickListener(new View.OnClickListener() { // from class: e3.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                C4125c.m17255s(C7531f.this, this, view2);
            }
        });
        c7531f.itemView.setOnKeyListener(new View.OnKeyListener() { // from class: e3.b
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view2, int i11, KeyEvent keyEvent) {
                boolean m17256t;
                m17256t = C4125c.m17256t(C7531f.this, this, view2, i11, keyEvent);
                return m17256t;
            }
        });
    }

    /* renamed from: u */
    public final void m17258u(InterfaceC5660l interfaceC5660l) {
        this.f18097e = interfaceC5660l;
    }

    /* renamed from: v */
    public final void m17259v(int i10) {
        this.f18098f = i10;
    }
}
