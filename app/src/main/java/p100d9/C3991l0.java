package p100d9;

import android.util.Log;
import androidx.fragment.app.AbstractActivityC0712e;
import androidx.fragment.app.AbstractC0729o;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.mine.R$string;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import ne.AbstractC5868k;
import p251n9.AbstractC5774c;
import p251n9.C5768a;
import p251n9.C5772b0;
import p251n9.C5781e0;
import p251n9.C5786g;
import p251n9.C5810q;
import p251n9.C5826y;
import p251n9.C5827y0;
import p251n9.ViewOnClickListenerC5771b;
import p251n9.ViewOnClickListenerC5784f0;
import p251n9.ViewOnClickListenerC5797j1;

/* renamed from: d9.l0 */
/* loaded from: classes2.dex */
public final class C3991l0 extends FragmentStateAdapter {

    /* renamed from: a */
    private final AbstractActivityC0712e f17718a;

    /* renamed from: b */
    private List f17719b;

    /* renamed from: c */
    private HashSet f17720c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3991l0(AbstractActivityC0712e abstractActivityC0712e) {
        super(abstractActivityC0712e);
        AbstractC5868k.m23674f(abstractActivityC0712e, "activity");
        this.f17718a = abstractActivityC0712e;
        this.f17719b = new ArrayList();
        this.f17720c = new HashSet();
    }

    /* renamed from: a */
    public final boolean m16880a(int i10) {
        Fragment fragment;
        AbstractC0729o m3294d4;
        if (i10 < this.f17719b.size()) {
            AbstractActivityC0712e abstractActivityC0712e = this.f17718a;
            if (abstractActivityC0712e != null && (m3294d4 = abstractActivityC0712e.m3294d4()) != null) {
                fragment = m3294d4.m3523h0("f" + getItemId(i10));
            } else {
                fragment = null;
            }
            if (fragment != null && ((AbstractC5774c) fragment).mo23233L9()) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public final AbstractC5774c m16881b(int i10) {
        if (i10 < this.f17719b.size()) {
            Fragment m3523h0 = this.f17718a.m3294d4().m3523h0("f" + getItemId(i10));
            if (m3523h0 != null) {
                return (AbstractC5774c) m3523h0;
            }
            return null;
        }
        return null;
    }

    /* renamed from: c */
    public final boolean m16882c(int i10) {
        if (i10 < this.f17719b.size()) {
            Fragment m3523h0 = this.f17718a.m3294d4().m3523h0("f" + getItemId(i10));
            if (m3523h0 != null) {
                AbstractC5774c abstractC5774c = (AbstractC5774c) m3523h0;
                if (!abstractC5774c.mo23244J9()) {
                    abstractC5774c.mo23245O9();
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public boolean containsItem(long j10) {
        return this.f17720c.contains(Long.valueOf(j10));
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public Fragment createFragment(int i10) {
        Fragment c5781e0;
        String m16953e = ((C4011w) this.f17719b.get(i10)).m16953e();
        if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.personal_my_account))) {
            c5781e0 = new ViewOnClickListenerC5771b();
        } else if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.personal_my_subscribe))) {
            c5781e0 = new C5772b0();
        } else if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.personal_share_app))) {
            c5781e0 = new C5827y0();
        } else if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.personal_lock))) {
            c5781e0 = new C5786g();
        } else if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.personal_playback_settings))) {
            c5781e0 = new ViewOnClickListenerC5784f0();
        } else if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.personal_feedback))) {
            c5781e0 = new C5810q();
        } else if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.about_me))) {
            c5781e0 = new C5768a();
        } else if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.personal_set_up))) {
            c5781e0 = new ViewOnClickListenerC5797j1();
        } else if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.personal_member_center))) {
            c5781e0 = new C5826y();
        } else if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.personal_order_history))) {
            c5781e0 = new C5781e0();
        } else {
            throw new IllegalArgumentException("未知标题: " + ((C4011w) this.f17719b.get(i10)).m16953e());
        }
        Log.i("test", "createFragment: " + i10 + ", fragment: " + c5781e0);
        this.f17720c.add(Long.valueOf(getItemId(i10)));
        return c5781e0;
    }

    /* renamed from: d */
    public final void m16883d(List list) {
        if (list != null) {
            this.f17719b = list;
        }
        notifyDataSetChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public int getItemCount() {
        return this.f17719b.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.AbstractC0789h
    public long getItemId(int i10) {
        String m16953e = ((C4011w) this.f17719b.get(i10)).m16953e();
        if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.personal_my_account))) {
            return 201L;
        }
        if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.personal_my_subscribe))) {
            return 202L;
        }
        if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.personal_share_app))) {
            return 203L;
        }
        if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.personal_lock))) {
            return 204L;
        }
        if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.personal_playback_settings))) {
            return 205L;
        }
        if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.personal_feedback))) {
            return 206L;
        }
        if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.about_me))) {
            return 207L;
        }
        if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.personal_set_up))) {
            return 208L;
        }
        if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.personal_member_center))) {
            return 209L;
        }
        if (AbstractC5868k.m23669a(m16953e, this.f17718a.getResources().getString(R$string.personal_order_history))) {
            return 210L;
        }
        throw new IllegalArgumentException("未知标题: " + ((C4011w) this.f17719b.get(i10)).m16953e());
    }
}
