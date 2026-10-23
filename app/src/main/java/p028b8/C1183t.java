package p028b8;

import android.widget.ImageView;
import android.widget.TextView;
import com.live.R$drawable;
import com.live.R$id;
import com.live.R$layout;
import com.request.result.TeamEvent;
import com.titans.entity.CdnType;
import ne.AbstractC5868k;
import p399x9.AbstractC7527b;
import p399x9.C7531f;

/* renamed from: b8.t */
/* loaded from: classes2.dex */
public final class C1183t extends AbstractC7527b {
    public C1183t() {
        super(R$layout.item_match_event_content_item, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p399x9.AbstractC7527b
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo5338e(C7531f c7531f, TeamEvent teamEvent) {
        int i10 = 0;
        AbstractC5868k.m23674f(c7531f, "holder");
        AbstractC5868k.m23674f(teamEvent, "bean");
        String eventType = teamEvent.getEventType();
        if (eventType != null) {
            switch (eventType.hashCode()) {
                case 49:
                    if (eventType.equals("1")) {
                        i10 = R$drawable.icon_match_event_goal;
                        break;
                    }
                    break;
                case 50:
                    if (eventType.equals("2")) {
                        i10 = R$drawable.icon_match_yellow_card;
                        break;
                    }
                    break;
                case 51:
                    if (eventType.equals("3")) {
                        i10 = R$drawable.icon_match_red_card;
                        break;
                    }
                    break;
                case 52:
                    if (eventType.equals("4")) {
                        i10 = R$drawable.icon_match_event_enter;
                        break;
                    }
                    break;
                case 53:
                    if (eventType.equals(CdnType.DIGITAL_TYPE_PCDN)) {
                        i10 = R$drawable.icon_match_event_leave;
                        break;
                    }
                    break;
            }
            ((ImageView) c7531f.m28863b(R$id.ivIcon)).setImageResource(i10);
            ((TextView) c7531f.m28863b(R$id.tvName)).setText(teamEvent.getEventName());
        }
        i10 = R$drawable.shape_match_event_default;
        ((ImageView) c7531f.m28863b(R$id.ivIcon)).setImageResource(i10);
        ((TextView) c7531f.m28863b(R$id.tvName)).setText(teamEvent.getEventName());
    }
}
