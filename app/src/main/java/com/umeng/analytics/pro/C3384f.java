package com.umeng.analytics.pro;

import com.lzy.okgo.model.Progress;
import org.android.agoo.common.AgooConstants;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

/* renamed from: com.umeng.analytics.pro.f */
/* loaded from: classes3.dex */
public class C3384f {

    /* renamed from: A */
    public static final String f14540A = "ts";

    /* renamed from: B */
    public static final String f14541B = "locations";

    /* renamed from: C */
    public static final String f14542C = "lat";

    /* renamed from: D */
    public static final String f14543D = "lng";

    /* renamed from: E */
    public static final String f14544E = "ts";

    /* renamed from: F */
    public static final String f14545F = "traffic";

    /* renamed from: G */
    public static final String f14546G = "upload_traffic";

    /* renamed from: H */
    public static final String f14547H = "download_traffic";

    /* renamed from: I */
    public static final String f14548I = "activate_msg";

    /* renamed from: J */
    public static final String f14549J = "ts";

    /* renamed from: K */
    public static final String f14550K = "group_info";

    /* renamed from: L */
    public static final String f14551L = "active_user";

    /* renamed from: M */
    public static final String f14552M = "provider";

    /* renamed from: N */
    public static final String f14553N = "puid";

    /* renamed from: O */
    public static final String f14554O = "_$!mobile";

    /* renamed from: P */
    public static final String f14555P = "_$!email";

    /* renamed from: Q */
    public static final String f14556Q = "_#$$$";

    /* renamed from: R */
    public static final String f14557R = "up";

    /* renamed from: S */
    public static final String f14558S = "pk";

    /* renamed from: T */
    public static final String f14559T = "pv";

    /* renamed from: U */
    public static final String f14560U = "error";

    /* renamed from: V */
    public static final String f14561V = "ts";

    /* renamed from: W */
    public static final String f14562W = "error_source";

    /* renamed from: X */
    public static final String f14563X = "context";

    /* renamed from: Y */
    public static final String f14564Y = "ekv";

    /* renamed from: Z */
    public static final String f14565Z = "gkv";

    /* renamed from: a */
    public static final String f14566a = "appkey";

    /* renamed from: aB */
    public static final String f14568aB = "_$pp";

    /* renamed from: aC */
    public static final String f14569aC = "session";

    /* renamed from: aD */
    public static final String f14570aD = "pageview";

    /* renamed from: aE */
    public static final String f14571aE = "versioncode";

    /* renamed from: aF */
    public static final String f14572aF = "versionname";

    /* renamed from: aG */
    public static final String f14573aG = "userlevel";

    /* renamed from: aH */
    public static final String f14574aH = "eof";

    /* renamed from: aI */
    public static final String f14575aI = "exception";

    /* renamed from: aa */
    public static final String f14581aa = "id";

    /* renamed from: ab */
    public static final String f14582ab = "ts";

    /* renamed from: ad */
    public static final String f14584ad = "userlevel";

    /* renamed from: af */
    public static final String f14586af = "dplus";

    /* renamed from: ag */
    public static final String f14587ag = "analytics";

    /* renamed from: ah */
    public static final String f14588ah = "push";

    /* renamed from: ai */
    public static final String f14589ai = "share";

    /* renamed from: aj */
    public static final String f14590aj = "content";

    /* renamed from: ak */
    public static final String f14591ak = "header";

    /* renamed from: al */
    public static final String f14592al = "ds";

    /* renamed from: am */
    public static final String f14593am = "pn";

    /* renamed from: an */
    public static final String f14594an = "pro_ver";

    /* renamed from: ao */
    public static final String f14595ao = "1.0.0";

    /* renamed from: ap */
    public static final String f14596ap = "atm";

    /* renamed from: aq */
    public static final String f14597aq = "st";

    /* renamed from: at */
    public static final String f14600at = "ekv_bl_ver";

    /* renamed from: au */
    public static final String f14601au = "ekv_wl_ver";

    /* renamed from: av */
    public static final String f14602av = "$ekv_bl_ver";

    /* renamed from: aw */
    public static final String f14603aw = "$ekv_wl_ver";

    /* renamed from: ax */
    public static final String f14604ax = "events";

    /* renamed from: b */
    public static final String f14607b = "channel";

    /* renamed from: c */
    public static final String f14608c = "secret";

    /* renamed from: d */
    public static final String f14609d = "app_version";

    /* renamed from: e */
    public static final String f14610e = "version_code";

    /* renamed from: f */
    public static final String f14611f = "wrapper_type";

    /* renamed from: g */
    public static final String f14612g = "wrapper_version";

    /* renamed from: h */
    public static final String f14613h = "sdk_version";

    /* renamed from: i */
    public static final String f14614i = "vertical_type";

    /* renamed from: j */
    public static final String f14615j = "device_id";

    /* renamed from: k */
    public static final String f14616k = "device_model";

    /* renamed from: l */
    public static final String f14617l = "$pr_ve";

    /* renamed from: m */
    public static final String f14618m = "$ud_da";

    /* renamed from: n */
    public static final String f14619n = "sessions";

    /* renamed from: o */
    public static final String f14620o = "id";

    /* renamed from: p */
    public static final String f14621p = "start_time";

    /* renamed from: q */
    public static final String f14622q = "end_time";

    /* renamed from: r */
    public static final String f14623r = "duration";

    /* renamed from: s */
    public static final String f14624s = "duration_old";

    /* renamed from: t */
    public static final String f14625t = "pages";

    /* renamed from: u */
    public static final String f14626u = "autopages";

    /* renamed from: v */
    public static final String f14627v = "page_name";

    /* renamed from: w */
    public static final String f14628w = "duration";

    /* renamed from: x */
    public static final String f14629x = "page_start";

    /* renamed from: y */
    public static final String f14630y = "type";

    /* renamed from: z */
    public static final String f14631z = "$page_num";

    /* renamed from: ar */
    public static final String f14598ar = C3309bd.m13860b().m13863b(C3309bd.f14113t);

    /* renamed from: as */
    public static final String f14599as = C3309bd.m13860b().m13863b(C3309bd.f14114u);

    /* renamed from: aJ */
    public static final String f14576aJ = "_$!deep_link";

    /* renamed from: aK */
    public static final String f14577aK = "_$!link";

    /* renamed from: aL */
    public static final String[] f14578aL = {f14576aJ, f14577aK};

    /* renamed from: ac */
    public static final String f14583ac = "du";

    /* renamed from: ae */
    public static final String f14585ae = "$st_fl";

    /* renamed from: aA */
    public static final String f14567aA = "_$sp";

    /* renamed from: aM */
    public static final String[] f14579aM = {"id", "ts", f14583ac, f14585ae, "ds", "pn", f14567aA};

    /* renamed from: ay */
    public static final String f14605ay = "_$!ts";

    /* renamed from: az */
    public static final String f14606az = "_$!id";

    /* renamed from: aN */
    public static final String[] f14580aN = {f14605ay, f14606az, "_$!du", "_$!c", f14585ae, "_$!sp", "event_name", "token", AgooConstants.MESSAGE_TIME, IjkMediaPlayer.OnNativeInvokeListener.ARG_IP, C3325bt.f14170O, "region", "city", "browser", "os", C3325bt.f14161F, "device_version", C3325bt.f14217ai, "screen_width", "screen_height", "referrer", "referrer_domain", "initial_referrer", "initial_referrer_domain", "initial_view_time", "search_engine", "keyword", "ali_lib", "utm_source", "utm_medium", "utm_term", "utm_content", "utm_campaign", Progress.DATE, "hour", "minute", "app_version", "sp"};
}
