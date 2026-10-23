package p251n9;

import android.view.KeyEvent;
import android.view.View;
import android.widget.ImageView;
import com.mine.R$id;
import com.mine.R$layout;
import com.module.bean.AudioInfoUtil;
import com.zhy.autolayout.AutoFrameLayout;
import com.zhy.autolayout.AutoLinearLayout;
import java.util.LinkedHashMap;
import java.util.Map;
import ne.AbstractC5868k;
import p153h2.AbstractC4509b;
import p160h9.InterfaceC4745u;
import p160h9.InterfaceC4746v;
import p170i2.C4842a;
import p192j9.C5040w;
import p359ue.AbstractC7167u;
import p400xa.C7577i1;

/* renamed from: n9.f0 */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC5784f0 extends AbstractC5774c<InterfaceC4745u> implements InterfaceC4746v, View.OnClickListener {

    /* renamed from: B0 */
    private boolean f23177B0;

    /* renamed from: C0 */
    public Map f23178C0 = new LinkedHashMap();

    /* renamed from: W0 */
    private final void m23341W0() {
        m23349la();
        m23359ia();
        m23361ka();
    }

    /* renamed from: aa */
    private final void m23342aa(int i10) {
        m23348ga(i10);
        C7577i1.f fVar = C7577i1.f27838b;
        fVar.m29085d().m29076h("key_setting_subtitle_size", Integer.valueOf(i10));
        AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
        audioInfoUtil.clearSubtitleSize();
        audioInfoUtil.clearSelectSwitch();
        fVar.m29085d().m29076h("key_setting_subtitle_switch", Boolean.TRUE);
    }

    /* renamed from: ba */
    private final void m23343ba(int i10) {
        m23345da(i10);
        C7577i1.f fVar = C7577i1.f27838b;
        fVar.m29085d().m29076h("key_setting_subtitle_color", Integer.valueOf(i10));
        AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
        audioInfoUtil.clearSubtitleColor();
        audioInfoUtil.clearSelectSwitch();
        fVar.m29085d().m29076h("key_setting_subtitle_switch", Boolean.TRUE);
    }

    /* renamed from: ca */
    private final void m23344ca() {
        m23345da(((Number) C7577i1.f27838b.m29085d().m29074f("key_setting_subtitle_color", 2)).intValue());
    }

    /* renamed from: da */
    private final void m23345da(int i10) {
        int i11 = 0;
        int i12 = 0;
        ImageView imageView = (ImageView) m23350S9(R$id.ivSubtitleColorBlack);
        int i13 = 0;
        if (imageView != null) {
            if (i10 == 3) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            imageView.setVisibility(i12);
        }
        ImageView imageView2 = (ImageView) m23350S9(R$id.ivSubtitleColorYellow);
        if (imageView2 != null) {
            if (i10 == 1) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView2.setVisibility(i11);
        }
        ImageView imageView3 = (ImageView) m23350S9(R$id.ivSubtitleColorWhite);
        if (imageView3 != null) {
            if (i10 != 2) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
        }
    }

    /* renamed from: ea */
    private final void m23346ea(boolean z10) {
        if (z10) {
            AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23350S9(R$id.mLayoutLanguage);
            if (autoLinearLayout != null) {
                autoLinearLayout.setVisibility(0);
            }
            AutoLinearLayout autoLinearLayout2 = (AutoLinearLayout) m23350S9(R$id.mLayoutSize);
            if (autoLinearLayout2 != null) {
                autoLinearLayout2.setVisibility(0);
            }
            AutoLinearLayout autoLinearLayout3 = (AutoLinearLayout) m23350S9(R$id.mLayoutStyle);
            if (autoLinearLayout3 != null) {
                autoLinearLayout3.setVisibility(0);
                return;
            }
            return;
        }
        AutoLinearLayout autoLinearLayout4 = (AutoLinearLayout) m23350S9(R$id.mLayoutLanguage);
        if (autoLinearLayout4 != null) {
            autoLinearLayout4.setVisibility(8);
        }
        AutoLinearLayout autoLinearLayout5 = (AutoLinearLayout) m23350S9(R$id.mLayoutSize);
        if (autoLinearLayout5 != null) {
            autoLinearLayout5.setVisibility(8);
        }
        AutoLinearLayout autoLinearLayout6 = (AutoLinearLayout) m23350S9(R$id.mLayoutStyle);
        if (autoLinearLayout6 != null) {
            autoLinearLayout6.setVisibility(8);
        }
    }

    /* renamed from: fa */
    private final void m23347fa() {
        m23348ga(((Number) C7577i1.f27838b.m29085d().m29074f("key_setting_subtitle_size", 1)).intValue());
    }

    /* renamed from: ga */
    private final void m23348ga(int i10) {
        int i11 = 0;
        int i12 = 0;
        ImageView imageView = (ImageView) m23350S9(R$id.ivSubtitleSizeBig);
        int i13 = 0;
        if (imageView != null) {
            if (i10 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            imageView.setVisibility(i12);
        }
        ImageView imageView2 = (ImageView) m23350S9(R$id.ivSubtitleSizeSmall);
        if (imageView2 != null) {
            if (i10 == 3) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            imageView2.setVisibility(i11);
        }
        ImageView imageView3 = (ImageView) m23350S9(R$id.ivSubtitleSizeNormal);
        if (imageView3 != null) {
            if (i10 != 1) {
                i13 = 8;
            }
            imageView3.setVisibility(i13);
        }
    }

    /* renamed from: la */
    private final void m23349la() {
        boolean booleanValue = ((Boolean) C7577i1.f27838b.m29085d().m29074f("key_setting_subtitle_switch", Boolean.valueOf(AudioInfoUtil.INSTANCE.getSUBTITLE_SWITCH()))).booleanValue();
        AbstractC4509b.m18869b("showPlaySettingSubtitle", "subtitleSwitch:" + booleanValue, new Object[0]);
        ImageView imageView = (ImageView) m23350S9(R$id.mIvSwitch);
        if (imageView != null) {
            imageView.setSelected(booleanValue);
        }
        m23346ea(booleanValue);
    }

    @Override // ba.AbstractC1196d
    /* renamed from: A9 */
    public int mo5451A9() {
        return R$layout.fragment_playsetting;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: H9 */
    protected boolean mo23232H9() {
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = false;
        AutoFrameLayout autoFrameLayout = (AutoFrameLayout) m23350S9(R$id.playback_setting_full_screen);
        if (autoFrameLayout != null && autoFrameLayout.hasFocus()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return true;
        }
        AutoFrameLayout autoFrameLayout2 = (AutoFrameLayout) m23350S9(R$id.playback_setting_audio_es);
        if (autoFrameLayout2 != null && autoFrameLayout2.hasFocus()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z11) {
            return true;
        }
        ImageView imageView = (ImageView) m23350S9(R$id.mIvSwitch);
        if (imageView != null && imageView.hasFocus()) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z12) {
            return true;
        }
        AutoFrameLayout autoFrameLayout3 = (AutoFrameLayout) m23350S9(R$id.playback_setting_subtitle_western);
        if (autoFrameLayout3 != null && autoFrameLayout3.hasFocus()) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z13) {
            return true;
        }
        AutoFrameLayout autoFrameLayout4 = (AutoFrameLayout) m23350S9(R$id.flSubtitleSizeNormal);
        if (autoFrameLayout4 != null && autoFrameLayout4.hasFocus()) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (z14) {
            return true;
        }
        AutoFrameLayout autoFrameLayout5 = (AutoFrameLayout) m23350S9(R$id.flSubtitleColorWhite);
        if (autoFrameLayout5 != null && autoFrameLayout5.hasFocus()) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (z15) {
            return true;
        }
        return false;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: J9 */
    public boolean mo23244J9() {
        View view;
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23350S9(R$id.llContainer);
        if (autoLinearLayout != null) {
            view = autoLinearLayout.getFocusedChild();
        } else {
            view = null;
        }
        if (view != null) {
            return true;
        }
        return false;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: L9 */
    public boolean mo23233L9() {
        AutoLinearLayout autoLinearLayout = (AutoLinearLayout) m23350S9(R$id.llContainer);
        if (autoLinearLayout == null || autoLinearLayout.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    @Override // p251n9.AbstractC5774c
    /* renamed from: O9 */
    public void mo23245O9() {
        AutoFrameLayout autoFrameLayout = (AutoFrameLayout) m23350S9(R$id.playback_setting_full_screen);
        if (autoFrameLayout != null) {
            autoFrameLayout.requestFocus();
        }
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c, p164hd.AbstractC4817b, androidx.fragment.app.Fragment
    /* renamed from: S7 */
    public /* synthetic */ void mo3123S7() {
        super.mo3123S7();
        mo5459m9();
    }

    /* renamed from: S9 */
    public View m23350S9(int i10) {
        View findViewById;
        Map map = this.f23178C0;
        View view = (View) map.get(Integer.valueOf(i10));
        if (view != null) {
            return view;
        }
        View m3182n7 = m3182n7();
        if (m3182n7 == null || (findViewById = m3182n7.findViewById(i10)) == null) {
            return null;
        }
        map.put(Integer.valueOf(i10), findViewById);
        return findViewById;
    }

    /* renamed from: T9 */
    public final void m23351T9() {
        ImageView imageView = (ImageView) m23350S9(R$id.playback_image_audio_pt);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = (ImageView) m23350S9(R$id.playback_image_audio_es);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = (ImageView) m23350S9(R$id.playback_image_audio_en);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
    }

    /* renamed from: U9 */
    public final void m23352U9() {
        ImageView imageView = (ImageView) m23350S9(R$id.playback_image_full_screen);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = (ImageView) m23350S9(R$id.playback_image_normal);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = (ImageView) m23350S9(R$id.playback_image_16_9);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
        ImageView imageView4 = (ImageView) m23350S9(R$id.playback_image_4_3);
        if (imageView4 != null) {
            imageView4.setVisibility(8);
        }
    }

    /* renamed from: V9 */
    public final void m23353V9() {
        ImageView imageView = (ImageView) m23350S9(R$id.playback_image_subtitle_portugues);
        if (imageView != null) {
            imageView.setVisibility(8);
        }
        ImageView imageView2 = (ImageView) m23350S9(R$id.playback_image_subtitle_western);
        if (imageView2 != null) {
            imageView2.setVisibility(8);
        }
        ImageView imageView3 = (ImageView) m23350S9(R$id.playback_image_subtitle_english);
        if (imageView3 != null) {
            imageView3.setVisibility(8);
        }
    }

    @Override // ba.AbstractC1196d
    /* renamed from: W9, reason: merged with bridge method [inline-methods] */
    public InterfaceC4745u mo5465y9() {
        return new C5040w(this, this);
    }

    /* renamed from: X9 */
    public final void m23355X9(int i10) {
        String str = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    str = C4842a.f20329a.m19920a().mo19964m();
                } else {
                    str = "en";
                }
            } else {
                str = "es";
            }
        } else {
            str = "pt";
        }
        AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
        audioInfoUtil.clearRealAudioMap();
        audioInfoUtil.clearSelectAudio();
        C7577i1.f27838b.m29085d().m29076h("key_setting_play_audio", str);
    }

    /* renamed from: Y9 */
    public final void m23356Y9(int i10) {
        C7577i1.f27838b.m29085d().m29076h("play_ratio", Integer.valueOf(i10));
    }

    /* renamed from: Z9 */
    public final void m23357Z9(int i10) {
        String str = null;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    str = C4842a.f20329a.m19920a().mo19964m();
                } else {
                    str = "en";
                }
            } else {
                str = "es";
            }
        } else {
            str = "pt";
        }
        AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
        audioInfoUtil.clearSelectSubTitle();
        audioInfoUtil.clearSelectSwitch();
        C7577i1.f fVar = C7577i1.f27838b;
        fVar.m29085d().m29076h("key_setting_subtitle_switch", Boolean.TRUE);
        fVar.m29085d().m29076h("key_setting_subtitle", str);
    }

    /* renamed from: ha */
    public final void m23358ha(View view) {
        AbstractC5868k.m23674f(view, "v");
        view.setVisibility(0);
    }

    /* renamed from: ia */
    public final void m23359ia() {
        boolean m27763v;
        boolean m27763v2;
        boolean m27763v3;
        boolean m27763v4;
        boolean m27763v5;
        boolean m27763v6;
        String str = (String) C7577i1.f27838b.m29085d().m29074f("key_setting_play_audio", C4842a.f20329a.m19920a().mo19964m());
        AbstractC4509b.m18869b("AudioItemAdapter", "play_ratio:" + str, new Object[0]);
        m27763v = AbstractC7167u.m27763v(str, "pt", false, 2, null);
        if (!m27763v) {
            m27763v2 = AbstractC7167u.m27763v(str, "por", false, 2, null);
            if (!m27763v2) {
                m27763v3 = AbstractC7167u.m27763v(str, "es", false, 2, null);
                if (!m27763v3) {
                    m27763v4 = AbstractC7167u.m27763v(str, "spa", false, 2, null);
                    if (!m27763v4) {
                        m27763v5 = AbstractC7167u.m27763v(str, "en", false, 2, null);
                        if (!m27763v5) {
                            m27763v6 = AbstractC7167u.m27763v(str, "eng", false, 2, null);
                            if (!m27763v6) {
                                return;
                            }
                        }
                        ImageView imageView = (ImageView) m23350S9(R$id.playback_image_audio_en);
                        AbstractC5868k.m23673e(imageView, "playback_image_audio_en");
                        m23358ha(imageView);
                        return;
                    }
                }
                ImageView imageView2 = (ImageView) m23350S9(R$id.playback_image_audio_es);
                AbstractC5868k.m23673e(imageView2, "playback_image_audio_es");
                m23358ha(imageView2);
                return;
            }
        }
        ImageView imageView3 = (ImageView) m23350S9(R$id.playback_image_audio_pt);
        AbstractC5868k.m23673e(imageView3, "playback_image_audio_pt");
        m23358ha(imageView3);
    }

    /* renamed from: ja */
    public final void m23360ja() {
        int intValue = ((Number) C7577i1.f27838b.m29085d().m29074f("play_ratio", 0)).intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue == 3) {
                        ImageView imageView = (ImageView) m23350S9(R$id.playback_image_4_3);
                        AbstractC5868k.m23673e(imageView, "playback_image_4_3");
                        m23358ha(imageView);
                        return;
                    }
                    return;
                }
                ImageView imageView2 = (ImageView) m23350S9(R$id.playback_image_16_9);
                AbstractC5868k.m23673e(imageView2, "playback_image_16_9");
                m23358ha(imageView2);
                return;
            }
            ImageView imageView3 = (ImageView) m23350S9(R$id.playback_image_full_screen);
            AbstractC5868k.m23673e(imageView3, "playback_image_full_screen");
            m23358ha(imageView3);
            return;
        }
        ImageView imageView4 = (ImageView) m23350S9(R$id.playback_image_normal);
        AbstractC5868k.m23673e(imageView4, "playback_image_normal");
        m23358ha(imageView4);
    }

    /* renamed from: ka */
    public final void m23361ka() {
        boolean m27763v;
        boolean m27763v2;
        boolean m27763v3;
        String str = (String) C7577i1.f27838b.m29085d().m29074f("key_setting_subtitle", C4842a.f20329a.m19920a().mo19964m());
        m27763v = AbstractC7167u.m27763v(str, "pt", false, 2, null);
        if (!m27763v) {
            m27763v2 = AbstractC7167u.m27763v(str, "es", false, 2, null);
            if (!m27763v2) {
                m27763v3 = AbstractC7167u.m27763v(str, "en", false, 2, null);
                if (m27763v3) {
                    ImageView imageView = (ImageView) m23350S9(R$id.playback_image_subtitle_english);
                    AbstractC5868k.m23673e(imageView, "playback_image_subtitle_english");
                    m23358ha(imageView);
                    return;
                }
                return;
            }
            ImageView imageView2 = (ImageView) m23350S9(R$id.playback_image_subtitle_western);
            AbstractC5868k.m23673e(imageView2, "playback_image_subtitle_western");
            m23358ha(imageView2);
            return;
        }
        ImageView imageView3 = (ImageView) m23350S9(R$id.playback_image_subtitle_portugues);
        AbstractC5868k.m23673e(imageView3, "playback_image_subtitle_portugues");
        m23358ha(imageView3);
    }

    @Override // p251n9.AbstractC5774c, ba.AbstractC1196d, p430z9.AbstractC7765c
    /* renamed from: m9 */
    public void mo5459m9() {
        this.f23178C0.clear();
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: n9 */
    public void mo5460n9() {
        ((AutoFrameLayout) m23350S9(R$id.playback_setting_audio_pt)).setOnClickListener(this);
        ((AutoFrameLayout) m23350S9(R$id.playback_setting_audio_es)).setOnClickListener(this);
        ((AutoFrameLayout) m23350S9(R$id.playback_setting_audio_en)).setOnClickListener(this);
        ((ImageView) m23350S9(R$id.mIvSwitch)).setOnClickListener(this);
        ((AutoFrameLayout) m23350S9(R$id.playback_setting_full_screen)).setOnClickListener(this);
        ((AutoFrameLayout) m23350S9(R$id.playback_setting_normal)).setOnClickListener(this);
        ((AutoFrameLayout) m23350S9(R$id.playback_setting_16_9)).setOnClickListener(this);
        ((AutoFrameLayout) m23350S9(R$id.playback_setting_4_3)).setOnClickListener(this);
        ((AutoFrameLayout) m23350S9(R$id.playback_setting_subtitle_portugues)).setOnClickListener(this);
        ((AutoFrameLayout) m23350S9(R$id.playback_setting_subtitle_western)).setOnClickListener(this);
        ((AutoFrameLayout) m23350S9(R$id.playback_setting_subtitle_english)).setOnClickListener(this);
        ((AutoFrameLayout) m23350S9(R$id.flSubtitleSizeNormal)).setOnClickListener(this);
        ((AutoFrameLayout) m23350S9(R$id.flSubtitleSizeBig)).setOnClickListener(this);
        ((AutoFrameLayout) m23350S9(R$id.flSubtitleSizeSmall)).setOnClickListener(this);
        ((AutoFrameLayout) m23350S9(R$id.flSubtitleColorWhite)).setOnClickListener(this);
        ((AutoFrameLayout) m23350S9(R$id.flSubtitleColorYellow)).setOnClickListener(this);
        ((AutoFrameLayout) m23350S9(R$id.flSubtitleColorBlack)).setOnClickListener(this);
        m23360ja();
        m23359ia();
        m23347fa();
        m23344ca();
        m23341W0();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        Integer num;
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        int i10 = R$id.playback_setting_audio_pt;
        if (num != null && num.intValue() == i10) {
            m23355X9(0);
            m23351T9();
            ImageView imageView = (ImageView) m23350S9(R$id.playback_image_audio_pt);
            AbstractC5868k.m23673e(imageView, "playback_image_audio_pt");
            m23358ha(imageView);
            return;
        }
        int i11 = R$id.playback_setting_audio_es;
        if (num != null && num.intValue() == i11) {
            m23355X9(1);
            m23351T9();
            ImageView imageView2 = (ImageView) m23350S9(R$id.playback_image_audio_es);
            AbstractC5868k.m23673e(imageView2, "playback_image_audio_es");
            m23358ha(imageView2);
            return;
        }
        int i12 = R$id.playback_setting_audio_en;
        if (num != null && num.intValue() == i12) {
            m23355X9(2);
            m23351T9();
            ImageView imageView3 = (ImageView) m23350S9(R$id.playback_image_audio_en);
            AbstractC5868k.m23673e(imageView3, "playback_image_audio_en");
            m23358ha(imageView3);
            return;
        }
        int i13 = R$id.mIvSwitch;
        if (num != null && num.intValue() == i13) {
            AudioInfoUtil audioInfoUtil = AudioInfoUtil.INSTANCE;
            C7577i1.f fVar = C7577i1.f27838b;
            audioInfoUtil.setSUBTITLE_SWITCH(((Boolean) fVar.m29085d().m29074f("key_setting_subtitle_switch", Boolean.valueOf(audioInfoUtil.getSUBTITLE_SWITCH()))).booleanValue());
            AbstractC4509b.m18869b("showPlaySettingSubtitle", "AudioInfoUtil.SUBTITLE_SWITCH " + audioInfoUtil.getSUBTITLE_SWITCH(), new Object[0]);
            audioInfoUtil.setSUBTITLE_SWITCH(true ^ audioInfoUtil.getSUBTITLE_SWITCH());
            ((ImageView) m23350S9(i13)).setSelected(audioInfoUtil.getSUBTITLE_SWITCH());
            AbstractC4509b.m18869b("showPlaySettingSubtitle", "mIvSwitch.isSelected " + audioInfoUtil.getSUBTITLE_SWITCH(), new Object[0]);
            fVar.m29085d().m29076h("key_setting_subtitle_switch", Boolean.valueOf(audioInfoUtil.getSUBTITLE_SWITCH()));
            audioInfoUtil.clearSelectSwitch();
            m23346ea(audioInfoUtil.getSUBTITLE_SWITCH());
            return;
        }
        int i14 = R$id.playback_setting_full_screen;
        if (num != null && num.intValue() == i14) {
            m23356Y9(1);
            m23352U9();
            ImageView imageView4 = (ImageView) m23350S9(R$id.playback_image_full_screen);
            AbstractC5868k.m23673e(imageView4, "playback_image_full_screen");
            m23358ha(imageView4);
            return;
        }
        int i15 = R$id.playback_setting_normal;
        if (num != null && num.intValue() == i15) {
            m23356Y9(0);
            m23352U9();
            ImageView imageView5 = (ImageView) m23350S9(R$id.playback_image_normal);
            AbstractC5868k.m23673e(imageView5, "playback_image_normal");
            m23358ha(imageView5);
            return;
        }
        int i16 = R$id.playback_setting_16_9;
        if (num != null && num.intValue() == i16) {
            m23356Y9(2);
            m23352U9();
            ImageView imageView6 = (ImageView) m23350S9(R$id.playback_image_16_9);
            AbstractC5868k.m23673e(imageView6, "playback_image_16_9");
            m23358ha(imageView6);
            return;
        }
        int i17 = R$id.playback_setting_4_3;
        if (num != null && num.intValue() == i17) {
            m23356Y9(3);
            m23352U9();
            ImageView imageView7 = (ImageView) m23350S9(R$id.playback_image_4_3);
            AbstractC5868k.m23673e(imageView7, "playback_image_4_3");
            m23358ha(imageView7);
            return;
        }
        int i18 = R$id.playback_setting_subtitle_portugues;
        if (num != null && num.intValue() == i18) {
            m23357Z9(0);
            m23353V9();
            ImageView imageView8 = (ImageView) m23350S9(R$id.playback_image_subtitle_portugues);
            AbstractC5868k.m23673e(imageView8, "playback_image_subtitle_portugues");
            m23358ha(imageView8);
            return;
        }
        int i19 = R$id.playback_setting_subtitle_western;
        if (num != null && num.intValue() == i19) {
            m23357Z9(1);
            m23353V9();
            ImageView imageView9 = (ImageView) m23350S9(R$id.playback_image_subtitle_western);
            AbstractC5868k.m23673e(imageView9, "playback_image_subtitle_western");
            m23358ha(imageView9);
            return;
        }
        int i20 = R$id.playback_setting_subtitle_english;
        if (num != null && num.intValue() == i20) {
            m23357Z9(2);
            m23353V9();
            ImageView imageView10 = (ImageView) m23350S9(R$id.playback_image_subtitle_english);
            AbstractC5868k.m23673e(imageView10, "playback_image_subtitle_english");
            m23358ha(imageView10);
            return;
        }
        int i21 = R$id.flSubtitleSizeNormal;
        if (num != null && num.intValue() == i21) {
            m23342aa(1);
            return;
        }
        int i22 = R$id.flSubtitleSizeBig;
        if (num != null && num.intValue() == i22) {
            m23342aa(2);
            return;
        }
        int i23 = R$id.flSubtitleSizeSmall;
        if (num != null && num.intValue() == i23) {
            m23342aa(3);
            return;
        }
        int i24 = R$id.flSubtitleColorWhite;
        if (num != null && num.intValue() == i24) {
            m23343ba(2);
            return;
        }
        int i25 = R$id.flSubtitleColorYellow;
        if (num != null && num.intValue() == i25) {
            m23343ba(1);
            return;
        }
        int i26 = R$id.flSubtitleColorBlack;
        if (num != null && num.intValue() == i26) {
            m23343ba(3);
        }
    }

    @Override // p251n9.AbstractC5774c
    public boolean onKeyDown(int i10, KeyEvent keyEvent) {
        AbstractC5868k.m23674f(keyEvent, "event");
        return super.onKeyDown(i10, keyEvent);
    }

    @Override // p430z9.AbstractC7765c
    /* renamed from: q9 */
    protected void mo5463q9() {
    }

    @Override // ba.AbstractC1196d
    /* renamed from: x9 */
    public boolean mo5464x9() {
        return this.f23177B0;
    }
}
