package p212kd;

import android.content.Context;
import android.content.res.Resources;
import android.text.Html;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.module.p069db.UmengPush;
import com.vod.R$id;
import com.vod.R$layout;
import com.vod.R$mipmap;
import com.vod.R$string;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ne.AbstractC5868k;
import ne.C5881x;
import p359ue.AbstractC7167u;
import p399x9.AbstractC7526a;
import p399x9.C7532g;

/* renamed from: kd.z0 */
/* loaded from: classes3.dex */
public final class C5250z0 extends AbstractC7526a {
    public C5250z0() {
        super(R$layout.item_message_list, null, 2, null);
    }

    @Override // p399x9.AbstractC7526a
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void mo21036b(C7532g c7532g, UmengPush umengPush) {
        Resources resources;
        String title = null;
        Resources resources2;
        String str = null;
        Resources resources3;
        String string = null;
        List m27748R;
        Resources resources4;
        AbstractC5868k.m23674f(c7532g, "holder");
        AbstractC5868k.m23674f(umengPush, "bean");
        String str2 = null;
        String str3 = "";
        if (AbstractC5868k.m23669a(umengPush.getMessageType(), UmengPush.TYPE_UPGRADE)) {
            int i10 = R$id.mTextMessageTitle;
            Context m28842e = m28842e();
            if (m28842e != null && (resources4 = m28842e.getResources()) != null) {
                str2 = resources4.getString(R$string.push_update_title);
            }
            c7532g.m28872e(i10, str2);
            C5881x c5881x = C5881x.f23415a;
            Context m28842e2 = m28842e();
            AbstractC5868k.m23671c(m28842e2);
            String string2 = m28842e2.getString(R$string.push_update_text);
            AbstractC5868k.m23673e(string2, "mContext!!.getString(R.string.push_update_text)");
            Object[] objArr = new Object[1];
            String title2 = umengPush.getTitle();
            if (title2 == null) {
                title2 = "";
            }
            objArr[0] = title2;
            title = String.format(string2, Arrays.copyOf(objArr, 1));
            AbstractC5868k.m23673e(title, "format(format, *args)");
        } else {
            if (AbstractC5868k.m23669a(umengPush.getType(), "1")) {
                int i11 = R$id.mTextMessageTitle;
                Context m28842e3 = m28842e();
                if (m28842e3 != null && (resources2 = m28842e3.getResources()) != null) {
                    str2 = resources2.getString(R$string.push_program_title);
                }
                c7532g.m28872e(i11, str2);
            } else {
                int i12 = R$id.mTextMessageTitle;
                Context m28842e4 = m28842e();
                if (m28842e4 != null && (resources = m28842e4.getResources()) != null) {
                    str2 = resources.getString(R$string.push_dram_title);
                }
                c7532g.m28872e(i12, str2);
            }
            title = umengPush.getTitle();
            if (title == null) {
                title = "";
            }
        }
        int i13 = R$id.mTextMessageContent;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(title);
        String text = umengPush.getText();
        if (text == null) {
            text = "";
        }
        sb2.append(text);
        c7532g.m28872e(i13, sb2.toString());
        if (umengPush.getMessageTime() == null) {
            str = "";
        } else {
            String messageTime = umengPush.getMessageTime();
            AbstractC5868k.m23673e(messageTime, "bean.messageTime");
            m27748R = AbstractC7167u.m27748R(messageTime, new String[]{" "}, false, 0, 6, null);
            if (m27748R.size() >= 2) {
                str = ((String) m27748R.get(0)) + "  " + ((String) m27748R.get(1));
            } else {
                String messageTime2 = umengPush.getMessageTime();
                AbstractC5868k.m23673e(messageTime2, "bean.messageTime");
                str = messageTime2;
            }
        }
        c7532g.m28872e(R$id.mTextMessageTime, str);
        if (AbstractC5868k.m23669a(UmengPush.ALREADY_READ, umengPush.getStatus())) {
            int i14 = R$id.mIvStatus;
            c7532g.m28873f(i14, true);
            ((ImageView) c7532g.m28870c(i14)).setImageResource(R$mipmap.bg_message_read_flag);
        } else {
            c7532g.m28873f(R$id.mIvStatus, false);
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("<font color='#c4c4c4'>[</font><font color='#ffaa00'>ok</font><font color='#c4c4c4'>]</font><font color='#c4c4c4'>");
        Context m28842e5 = m28842e();
        if (m28842e5 != null && (resources3 = m28842e5.getResources()) != null && (string = resources3.getString(R$string.more_char)) != null) {
            str3 = string;
        }
        sb3.append(str3);
        sb3.append("</font>");
        ((TextView) c7532g.m28870c(R$id.mTextMoreHint)).setText(Html.fromHtml(sb3.toString()));
    }

    /* renamed from: h */
    public final int m21154h() {
        Iterator it = m28840c().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (!AbstractC5868k.m23669a(UmengPush.ALREADY_READ, ((UmengPush) it.next()).getStatus())) {
                i10++;
            }
        }
        return i10;
    }

    /* renamed from: i */
    public final void m21155i(ListView listView, int i10) {
        AbstractC5868k.m23674f(listView, "listView");
        ((UmengPush) getItem(i10)).setStatus(UmengPush.ALREADY_READ);
        int firstVisiblePosition = listView.getFirstVisiblePosition();
        int lastVisiblePosition = listView.getLastVisiblePosition();
        boolean z10 = false;
        if (firstVisiblePosition <= i10 && i10 <= lastVisiblePosition) {
            z10 = true;
        }
        if (z10) {
            Object tag = listView.getChildAt(i10 - firstVisiblePosition).getTag();
            AbstractC5868k.m23672d(tag, "null cannot be cast to non-null type com.module.adapter.ListItemViewHolder");
            C7532g c7532g = (C7532g) tag;
            int i11 = R$id.mIvStatus;
            c7532g.m28873f(i11, true);
            ((ImageView) c7532g.m28870c(i11)).setImageResource(R$mipmap.bg_message_read_flag);
        }
    }
}
