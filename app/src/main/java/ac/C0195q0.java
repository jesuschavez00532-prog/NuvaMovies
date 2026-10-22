package ac;

import be.C1328x;
import com.request.result.AssetData;
import com.request.result.GetItemDataResult;
import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import me.InterfaceC5660l;
import ne.AbstractC5868k;
import ne.AbstractC5869l;
import p030bc.C1224f;
import p301qb.InterfaceC6393i0;
import p317rb.AbstractC6567a;
import p317rb.AbstractC6570d;
import p343tb.AbstractC6929a;
import p348u2.AbstractC7029f;
import p359ue.AbstractC7166t;

/* renamed from: ac.q0 */
/* loaded from: classes2.dex */
public final class C0195q0 extends AbstractC0166j {

    /* renamed from: b */
    private final String f546b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ac.q0$a */
    /* loaded from: classes2.dex */
    public static final class a extends AbstractC5869l implements InterfaceC5660l {
        a() {
            super(1);
        }

        /* renamed from: a */
        public final void m708a(GetItemDataResult getItemDataResult) {
            String str;
            String str2;
            String str3;
            if (getItemDataResult.getData().getAssetData() != null) {
                AssetData assetData = getItemDataResult.getData().getAssetData();
                String str4 = null;
                if (assetData != null) {
                    C0195q0 c0195q0 = C0195q0.this;
                    AssetData assetData2 = getItemDataResult.getData().getAssetData();
                    if (assetData2 != null) {
                        str3 = assetData2.getTags();
                    } else {
                        str3 = null;
                    }
                    assetData.setTags(c0195q0.m705d(str3));
                }
                AssetData assetData3 = getItemDataResult.getData().getAssetData();
                if (assetData3 != null) {
                    C0195q0 c0195q02 = C0195q0.this;
                    AssetData assetData4 = getItemDataResult.getData().getAssetData();
                    if (assetData4 != null) {
                        str2 = assetData4.getDirector();
                    } else {
                        str2 = null;
                    }
                    assetData3.setDirector(c0195q02.m705d(str2));
                }
                AssetData assetData5 = getItemDataResult.getData().getAssetData();
                if (assetData5 != null) {
                    C0195q0 c0195q03 = C0195q0.this;
                    AssetData assetData6 = getItemDataResult.getData().getAssetData();
                    if (assetData6 != null) {
                        str = assetData6.getActorDisplay();
                    } else {
                        str = null;
                    }
                    assetData5.setActorDisplay(c0195q03.m705d(str));
                }
                AssetData assetData7 = getItemDataResult.getData().getAssetData();
                if (assetData7 != null) {
                    C0195q0 c0195q04 = C0195q0.this;
                    AssetData assetData8 = getItemDataResult.getData().getAssetData();
                    if (assetData8 != null) {
                        str4 = assetData8.getDescription();
                    }
                    assetData7.setDescriptionCompt(c0195q04.m705d(str4));
                }
            }
        }

        @Override // me.InterfaceC5660l
        /* renamed from: f */
        public /* bridge */ /* synthetic */ Object mo542f(Object obj) {
            m708a((GetItemDataResult) obj);
            return C1328x.f4998a;
        }
    }

    /* renamed from: ac.q0$b */
    /* loaded from: classes2.dex */
    public static final class b extends AbstractC6929a {
        b() {
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(GetItemDataResult getItemDataResult) {
            AbstractC5868k.m23674f(getItemDataResult, "t");
            super.onNext(getItemDataResult);
            if (getItemDataResult.getData().getAssetData() != null) {
                ((InterfaceC6393i0) C0195q0.this.m618a()).mo20718I3(getItemDataResult);
            } else {
                ((InterfaceC6393i0) C0195q0.this.m618a()).mo20726r1("portal100022");
            }
        }

        @Override // p343tb.AbstractC6929a, io.reactivex.Observer
        public void onError(Throwable th) {
            AbstractC5868k.m23674f(th, "e");
            super.onError(th);
            ((InterfaceC6393i0) C0195q0.this.m618a()).mo20726r1(AbstractC6570d.m25644a(th, "eb2", "500", "500"));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0195q0(InterfaceC6393i0 interfaceC6393i0) {
        super(interfaceC6393i0);
        AbstractC5868k.m23674f(interfaceC6393i0, "view");
        this.f546b = C0195q0.class.getSimpleName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public final String m705d(String str) {
        String m27728o;
        if (str != null) {
            m27728o = AbstractC7166t.m27728o(str, "\n", "", false, 4, null);
            return m27728o;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m706f(InterfaceC5660l interfaceC5660l, Object obj) {
        AbstractC5868k.m23674f(interfaceC5660l, "$tmp0");
        interfaceC5660l.mo542f(obj);
    }

    /* renamed from: e */
    public final void m707e(String str, String str2, String str3) {
        AbstractC5868k.m23674f(str, "contentId");
        AbstractC5868k.m23674f(str2, "type");
        Observable m25631a = AbstractC6567a.m25631a(C1224f.f4816e.m5631a().m5562K(str, str2, str3), ((InterfaceC6393i0) m618a()).mo523N3());
        final a aVar = new a();
        m25631a.doOnNext(new Consumer() { // from class: ac.p0
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                C0195q0.m706f(InterfaceC5660l.this, obj);
            }
        }).compose(AbstractC7029f.m27121b()).subscribe(new b());
    }
}
