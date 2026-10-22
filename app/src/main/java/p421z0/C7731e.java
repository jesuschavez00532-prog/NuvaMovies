package p421z0;

import com.bigbee.bean.request.PlayError;
import com.bigbee.bean.request.PlayFile;
import com.bigbee.bean.request.PlayMedia;
import com.bigbee.bean.request.PlayProgram;
import com.bigbee.bean.request.SwitchPlayer;
import com.taobao.accs.common.Constants;
import com.taobao.accs.utl.BaseMonitor;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3384f;
import java.util.HashMap;
import java.util.Locale;
import ne.AbstractC5868k;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: z0.e */
/* loaded from: classes.dex */
public final class C7731e {

    /* renamed from: a */
    public static final C7731e f28446a = new C7731e();

    private C7731e() {
    }

    /* renamed from: a */
    public final void m29865a(PlayError playError, long j10, long j11) {
        AbstractC5868k.m23674f(playError, "playError");
        HashMap hashMap = new HashMap();
        String app = playError.getApp();
        AbstractC5868k.m23673e(app, "playError.app");
        hashMap.put("app", app);
        String app_ver = playError.getApp_ver();
        AbstractC5868k.m23673e(app_ver, "playError.app_ver");
        hashMap.put("app_ver", app_ver);
        String titan_ver = playError.getTitan_ver();
        AbstractC5868k.m23673e(titan_ver, "playError.titan_ver");
        hashMap.put("titan_ver", titan_ver);
        String uid = playError.getUid();
        AbstractC5868k.m23673e(uid, "playError.uid");
        hashMap.put("uid", uid);
        String sn = playError.getSn();
        AbstractC5868k.m23673e(sn, "playError.sn");
        hashMap.put("sn", sn);
        String model = playError.getModel();
        AbstractC5868k.m23673e(model, "playError.model");
        hashMap.put(Constants.KEY_MODEL, model);
        hashMap.put("sys_ver", C7737k.f28482a.m29914a().getSysVer());
        hashMap.put("instance", Integer.valueOf(playError.getInstance()));
        String program = playError.getProgram();
        AbstractC5868k.m23673e(program, "playError.program");
        hashMap.put("program", program);
        String title = playError.getTitle();
        AbstractC5868k.m23673e(title, "playError.title");
        hashMap.put("title", title);
        String episode = playError.getEpisode();
        AbstractC5868k.m23673e(episode, "playError.episode");
        hashMap.put("episode", episode);
        String buss = playError.getBuss();
        AbstractC5868k.m23673e(buss, "playError.buss");
        hashMap.put("buss", buss);
        String media = playError.getMedia();
        AbstractC5868k.m23673e(media, "playError.media");
        hashMap.put("media", media);
        String session = playError.getSession();
        AbstractC5868k.m23673e(session, "playError.session");
        hashMap.put(C3384f.f14569aC, session);
        String lang = playError.getLang();
        String str = "";
        if (lang == null) {
            lang = "";
        }
        hashMap.put("lang", lang);
        String quality = playError.getQuality();
        if (quality != null) {
            str = quality;
        }
        hashMap.put("quality", str);
        hashMap.put("size", Long.valueOf(playError.getSize()));
        hashMap.put("media_duration", Long.valueOf(playError.getMedia_duration()));
        String format = playError.getFormat();
        AbstractC5868k.m23673e(format, "playError.format");
        hashMap.put(IjkMediaMeta.IJKM_KEY_FORMAT, format);
        String vcodec = playError.getVcodec();
        AbstractC5868k.m23673e(vcodec, "playError.vcodec");
        hashMap.put("vcodec", vcodec);
        String vdecoder = playError.getVdecoder();
        AbstractC5868k.m23673e(vdecoder, "playError.vdecoder");
        hashMap.put("vdecoder", vdecoder);
        String acodec = playError.getAcodec();
        AbstractC5868k.m23673e(acodec, "playError.acodec");
        hashMap.put("acodec", acodec);
        String params = playError.getParams();
        AbstractC5868k.m23673e(params, "playError.params");
        hashMap.put("params", params);
        String rule = playError.getRule();
        AbstractC5868k.m23673e(rule, "playError.rule");
        hashMap.put("rule", rule);
        String links = playError.getLinks();
        AbstractC5868k.m23673e(links, "playError.links");
        hashMap.put("links", links);
        String proxy = playError.getProxy();
        AbstractC5868k.m23673e(proxy, "playError.proxy");
        hashMap.put("proxy", proxy);
        String net_type = playError.getNet_type();
        AbstractC5868k.m23673e(net_type, "playError.net_type");
        hashMap.put("net_type", net_type);
        String player = playError.getPlayer();
        AbstractC5868k.m23673e(player, "playError.player");
        hashMap.put("player", player);
        hashMap.put("duration", Long.valueOf(playError.getDuration()));
        hashMap.put("play_duration", Long.valueOf(playError.getPlay_duration()));
        hashMap.put("seek_count", Long.valueOf(playError.getSeek_count()));
        hashMap.put("switch_count", Long.valueOf(playError.getSwitch_count()));
        hashMap.put("link_count", Long.valueOf(playError.getLink_count()));
        hashMap.put("replay_count", Long.valueOf(playError.getReplay_count()));
        String link = playError.getLink();
        AbstractC5868k.m23673e(link, "playError.link");
        hashMap.put("link", link);
        String cdn_type = playError.getCdn_type();
        AbstractC5868k.m23673e(cdn_type, "playError.cdn_type");
        hashMap.put("cdn_type", cdn_type);
        String group = playError.getGroup();
        AbstractC5868k.m23673e(group, "playError.group");
        hashMap.put("group", group);
        String host = playError.getHost();
        AbstractC5868k.m23673e(host, "playError.host");
        hashMap.put("host", host);
        String idc = playError.getIdc();
        AbstractC5868k.m23673e(idc, "playError.idc");
        hashMap.put("idc", idc);
        String dns = playError.getDns();
        AbstractC5868k.m23673e(dns, "playError.dns");
        hashMap.put(BaseMonitor.COUNT_POINT_DNS, dns);
        String host_ip = playError.getHost_ip();
        AbstractC5868k.m23673e(host_ip, "playError.host_ip");
        hashMap.put("host_ip", host_ip);
        String protocol = playError.getProtocol();
        AbstractC5868k.m23673e(protocol, "playError.protocol");
        hashMap.put("protocol", protocol);
        hashMap.put("err", Long.valueOf(playError.getErr()));
        String codec_list = playError.getCodec_list();
        AbstractC5868k.m23673e(codec_list, "playError.codec_list");
        hashMap.put("codec_list", codec_list);
        if (playError.getReason() != null) {
            String reason = playError.getReason();
            AbstractC5868k.m23673e(reason, "playError.reason");
            hashMap.put("reason", reason);
        }
        C7730d.f28438a.m29863a("play_error", hashMap, j10, j11, false, true);
    }

    /* renamed from: b */
    public final void m29866b(PlayFile playFile, long j10, long j11) {
        AbstractC5868k.m23674f(playFile, "playFile");
        HashMap hashMap = new HashMap();
        String app = playFile.getApp();
        AbstractC5868k.m23673e(app, "playFile.app");
        hashMap.put("app", app);
        String app_ver = playFile.getApp_ver();
        AbstractC5868k.m23673e(app_ver, "playFile.app_ver");
        hashMap.put("app_ver", app_ver);
        String titan_ver = playFile.getTitan_ver();
        AbstractC5868k.m23673e(titan_ver, "playFile.titan_ver");
        hashMap.put("titan_ver", titan_ver);
        String uid = playFile.getUid();
        AbstractC5868k.m23673e(uid, "playFile.uid");
        hashMap.put("uid", uid);
        String sn = playFile.getSn();
        AbstractC5868k.m23673e(sn, "playFile.sn");
        hashMap.put("sn", sn);
        String model = playFile.getModel();
        AbstractC5868k.m23673e(model, "playFile.model");
        hashMap.put(Constants.KEY_MODEL, model);
        hashMap.put("sys_ver", C7737k.f28482a.m29914a().getSysVer());
        String program = playFile.getProgram();
        AbstractC5868k.m23673e(program, "playFile.program");
        hashMap.put("program", program);
        String media = playFile.getMedia();
        AbstractC5868k.m23673e(media, "playFile.media");
        hashMap.put("media", media);
        String title = playFile.getTitle();
        AbstractC5868k.m23673e(title, "playFile.title");
        hashMap.put("title", title);
        String buss = playFile.getBuss();
        AbstractC5868k.m23673e(buss, "playFile.buss");
        hashMap.put("buss", buss);
        String from = playFile.getFrom();
        AbstractC5868k.m23673e(from, "playFile.from");
        hashMap.put("from", from);
        hashMap.put("duration", Long.valueOf(playFile.getDuration()));
        String player = playFile.getPlayer();
        AbstractC5868k.m23673e(player, "playFile.player");
        hashMap.put("player", player);
        hashMap.put("prepare_spent", Long.valueOf(playFile.getPrepare_spent()));
        hashMap.put("caton_count", Long.valueOf(playFile.getCaton_count()));
        hashMap.put("caton_duration", Long.valueOf(playFile.getCaton_duration()));
        String net_type = playFile.getNet_type();
        AbstractC5868k.m23673e(net_type, "playFile.net_type");
        hashMap.put("net_type", net_type);
        hashMap.put("err", Long.valueOf(playFile.getErr()));
        hashMap.put("PLAYER_RESET_COUNT", Long.valueOf(playFile.getPlayer_reset_count()));
        hashMap.put("recv_cache_bytes", Long.valueOf(playFile.getRecv_cache_bytes()));
        hashMap.put("recv_peer_bytes", Long.valueOf(playFile.getRecv_peer_bytes()));
        hashMap.put("recv_origin_tcp_bytes", Long.valueOf(playFile.getRecv_origin_tcp_bytes()));
        hashMap.put("recv_origin_cdp_bytes", Long.valueOf(playFile.getRecv_origin_cdp_bytes()));
        hashMap.put("read_cache_bytes", Long.valueOf(playFile.getRead_cache_bytes()));
        hashMap.put("send_peer_bytes", Long.valueOf(playFile.getSend_peer_bytes()));
        hashMap.put("player_repeat_req_count", Long.valueOf(playFile.getPlayer_repeat_req_count()));
        C7730d.f28438a.m29863a("play_file", hashMap, j10, j11, false, true);
    }

    /* renamed from: c */
    public final void m29867c(PlayMedia playMedia, long j10, long j11) {
        AbstractC5868k.m23674f(playMedia, "playMedia");
        HashMap hashMap = new HashMap();
        String app = playMedia.getApp();
        AbstractC5868k.m23673e(app, "playMedia.app");
        hashMap.put("app", app);
        String app_ver = playMedia.getApp_ver();
        AbstractC5868k.m23673e(app_ver, "playMedia.app_ver");
        hashMap.put("app_ver", app_ver);
        String titan_ver = playMedia.getTitan_ver();
        AbstractC5868k.m23673e(titan_ver, "playMedia.titan_ver");
        hashMap.put("titan_ver", titan_ver);
        String uid = playMedia.getUid();
        AbstractC5868k.m23673e(uid, "playMedia.uid");
        hashMap.put("uid", uid);
        String sn = playMedia.getSn();
        AbstractC5868k.m23673e(sn, "playMedia.sn");
        hashMap.put("sn", sn);
        String model = playMedia.getModel();
        AbstractC5868k.m23673e(model, "playMedia.model");
        hashMap.put(Constants.KEY_MODEL, model);
        hashMap.put("sys_ver", C7737k.f28482a.m29914a().getSysVer());
        hashMap.put("instance", Integer.valueOf(playMedia.getInstance()));
        String program = playMedia.getProgram();
        AbstractC5868k.m23673e(program, "playMedia.program");
        hashMap.put("program", program);
        String title = playMedia.getTitle();
        AbstractC5868k.m23673e(title, "playMedia.title");
        hashMap.put("title", title);
        String episode = playMedia.getEpisode();
        AbstractC5868k.m23673e(episode, "playMedia.episode");
        hashMap.put("episode", episode);
        String buss = playMedia.getBuss();
        AbstractC5868k.m23673e(buss, "playMedia.buss");
        hashMap.put("buss", buss);
        String media = playMedia.getMedia();
        AbstractC5868k.m23673e(media, "playMedia.media");
        hashMap.put("media", media);
        String session = playMedia.getSession();
        AbstractC5868k.m23673e(session, "playMedia.session");
        hashMap.put(C3384f.f14569aC, session);
        String lang = playMedia.getLang();
        String str = "";
        if (lang == null) {
            lang = "";
        }
        hashMap.put("lang", lang);
        String quality = playMedia.getQuality();
        if (quality != null) {
            str = quality;
        }
        hashMap.put("quality", str);
        hashMap.put("size", Long.valueOf(playMedia.getSize()));
        hashMap.put("media_duration", Long.valueOf(playMedia.getMedia_duration()));
        String format = playMedia.getFormat();
        AbstractC5868k.m23673e(format, "playMedia.format");
        hashMap.put(IjkMediaMeta.IJKM_KEY_FORMAT, format);
        String vcodec = playMedia.getVcodec();
        AbstractC5868k.m23673e(vcodec, "playMedia.vcodec");
        hashMap.put("vcodec", vcodec);
        String vdecoder = playMedia.getVdecoder();
        AbstractC5868k.m23673e(vdecoder, "playMedia.vdecoder");
        hashMap.put("vdecoder", vdecoder);
        String acodec = playMedia.getAcodec();
        AbstractC5868k.m23673e(acodec, "playMedia.acodec");
        hashMap.put("acodec", acodec);
        String params = playMedia.getParams();
        AbstractC5868k.m23673e(params, "playMedia.params");
        hashMap.put("params", params);
        String rule = playMedia.getRule();
        AbstractC5868k.m23673e(rule, "playMedia.rule");
        hashMap.put("rule", rule);
        String links = playMedia.getLinks();
        AbstractC5868k.m23673e(links, "playMedia.links");
        hashMap.put("links", links);
        String proxy = playMedia.getProxy();
        AbstractC5868k.m23673e(proxy, "playMedia.proxy");
        hashMap.put("proxy", proxy);
        String net_type = playMedia.getNet_type();
        AbstractC5868k.m23673e(net_type, "playMedia.net_type");
        hashMap.put("net_type", net_type);
        String player = playMedia.getPlayer();
        AbstractC5868k.m23673e(player, "playMedia.player");
        hashMap.put("player", player);
        hashMap.put("duration", Long.valueOf(playMedia.getDuration()));
        hashMap.put("play_duration", Long.valueOf(playMedia.getPlay_duration()));
        hashMap.put("seek_count", Long.valueOf(playMedia.getSeek_count()));
        hashMap.put("switch_count", Long.valueOf(playMedia.getSwitch_count()));
        hashMap.put("link_count", Long.valueOf(playMedia.getLink_count()));
        hashMap.put("replay_count", Long.valueOf(playMedia.getReplay_count()));
        hashMap.put("prepare_spent", Long.valueOf(playMedia.getPrepare_spent()));
        hashMap.put("link_spent", Long.valueOf(playMedia.getLink_spent()));
        hashMap.put("index_spent", Long.valueOf(playMedia.getIndex_spent()));
        hashMap.put("media_spent", Long.valueOf(playMedia.getMedia_spent()));
        hashMap.put("render_spent", Long.valueOf(playMedia.getRender_spent()));
        hashMap.put("caton_count", Long.valueOf(playMedia.getCaton_count()));
        hashMap.put("caton_duration", Long.valueOf(playMedia.getCaton_duration()));
        hashMap.put("net_caton_duration", Long.valueOf(playMedia.getNet_caton_duration()));
        hashMap.put("local_caton_duration", Long.valueOf(playMedia.getLocal_caton_duration()));
        hashMap.put("seek_caton_duration", Long.valueOf(playMedia.getSeek_caton_duration()));
        hashMap.put("origin_caton_duration", Long.valueOf(playMedia.getOrigin_caton_duration()));
        hashMap.put(C3325bt.f14208aZ, Long.valueOf(playMedia.getLatency()));
        hashMap.put("err", Long.valueOf(playMedia.getErr()));
        hashMap.put("PLAYER_RESET_COUNT", Long.valueOf(playMedia.getPlayer_reset_count()));
        hashMap.put("recv_cache_bytes", Long.valueOf(playMedia.getRecv_cache_bytes()));
        hashMap.put("recv_peer_bytes", Long.valueOf(playMedia.getRecv_peer_bytes()));
        hashMap.put("recv_origin_tcp_bytes", Long.valueOf(playMedia.getRecv_origin_tcp_bytes()));
        hashMap.put("recv_origin_cdp_bytes", Long.valueOf(playMedia.getRecv_origin_cdp_bytes()));
        hashMap.put("read_cache_bytes", Long.valueOf(playMedia.getRead_cache_bytes()));
        hashMap.put("send_peer_bytes", Long.valueOf(playMedia.getSend_peer_bytes()));
        hashMap.put("player_repeat_req_count", Long.valueOf(playMedia.getPlayer_repeat_req_count()));
        String codec_list = playMedia.getCodec_list();
        AbstractC5868k.m23673e(codec_list, "playMedia.codec_list");
        hashMap.put("codec_list", codec_list);
        String language = Locale.getDefault().getLanguage();
        AbstractC5868k.m23673e(language, "getDefault().language");
        hashMap.put("lang", language);
        if (playMedia.getNet_type() != null) {
            hashMap.put("nat_type", Integer.valueOf(playMedia.getNat_type()));
        }
        C7730d.f28438a.m29863a("play_media", hashMap, j10, j11, false, true);
    }

    /* renamed from: d */
    public final void m29868d(PlayProgram playProgram, long j10, long j11) {
        AbstractC5868k.m23674f(playProgram, "playProgram");
        HashMap hashMap = new HashMap();
        String app = playProgram.getApp();
        AbstractC5868k.m23673e(app, "playProgram.app");
        hashMap.put("app", app);
        String app_ver = playProgram.getApp_ver();
        AbstractC5868k.m23673e(app_ver, "playProgram.app_ver");
        hashMap.put("app_ver", app_ver);
        String titan_ver = playProgram.getTitan_ver();
        AbstractC5868k.m23673e(titan_ver, "playProgram.titan_ver");
        hashMap.put("titan_ver", titan_ver);
        String uid = playProgram.getUid();
        AbstractC5868k.m23673e(uid, "playProgram.uid");
        hashMap.put("uid", uid);
        String sn = playProgram.getSn();
        AbstractC5868k.m23673e(sn, "playProgram.sn");
        hashMap.put("sn", sn);
        String model = playProgram.getModel();
        AbstractC5868k.m23673e(model, "playProgram.model");
        hashMap.put(Constants.KEY_MODEL, model);
        C7737k c7737k = C7737k.f28482a;
        hashMap.put("sys_ver", c7737k.m29914a().getSysVer());
        String macAddr = c7737k.m29914a().getMacAddr();
        String str = "";
        if (macAddr == null) {
            macAddr = "";
        }
        hashMap.put("mac", macAddr);
        String reserve1 = c7737k.m29914a().getReserve1();
        if (reserve1 != null) {
            str = reserve1;
        }
        hashMap.put("route_mac", str);
        hashMap.put("instance", Integer.valueOf(playProgram.getInstance()));
        String program = playProgram.getProgram();
        AbstractC5868k.m23673e(program, "playProgram.program");
        hashMap.put("program", program);
        String title = playProgram.getTitle();
        AbstractC5868k.m23673e(title, "playProgram.title");
        hashMap.put("title", title);
        String episode = playProgram.getEpisode();
        AbstractC5868k.m23673e(episode, "playProgram.episode");
        hashMap.put("episode", episode);
        String buss = playProgram.getBuss();
        AbstractC5868k.m23673e(buss, "playProgram.buss");
        hashMap.put("buss", buss);
        String session = playProgram.getSession();
        AbstractC5868k.m23673e(session, "playProgram.session");
        hashMap.put(C3384f.f14569aC, session);
        String cause = playProgram.getCause();
        AbstractC5868k.m23673e(cause, "playProgram.cause");
        hashMap.put("cause", cause);
        String from = playProgram.getFrom();
        AbstractC5868k.m23673e(from, "playProgram.from");
        hashMap.put("from", from);
        hashMap.put("duration", Long.valueOf(playProgram.getDuration()));
        hashMap.put("start", Long.valueOf(playProgram.getStart()));
        hashMap.put("switch_count", Long.valueOf(playProgram.getSwitch_count()));
        hashMap.put("media_duration", Long.valueOf(playProgram.getMedia_duration()));
        hashMap.put("prepare_spent", Long.valueOf(playProgram.getPrepare_spent()));
        hashMap.put("caton_count", Long.valueOf(playProgram.getCaton_count()));
        hashMap.put("caton_duration", Long.valueOf(playProgram.getCaton_duration()));
        String language = Locale.getDefault().getLanguage();
        AbstractC5868k.m23673e(language, "getDefault().language");
        hashMap.put("lang", language);
        C7730d.f28438a.m29863a("play_program", hashMap, j10, j11, false, true);
    }

    /* renamed from: e */
    public final void m29869e(SwitchPlayer switchPlayer, long j10, long j11) {
        AbstractC5868k.m23674f(switchPlayer, "switchPlayer");
        HashMap hashMap = new HashMap();
        String app = switchPlayer.getApp();
        AbstractC5868k.m23673e(app, "switchPlayer.app");
        hashMap.put("app", app);
        String app_ver = switchPlayer.getApp_ver();
        AbstractC5868k.m23673e(app_ver, "switchPlayer.app_ver");
        hashMap.put("app_ver", app_ver);
        String titan_ver = switchPlayer.getTitan_ver();
        AbstractC5868k.m23673e(titan_ver, "switchPlayer.titan_ver");
        hashMap.put("titan_ver", titan_ver);
        String uid = switchPlayer.getUid();
        AbstractC5868k.m23673e(uid, "switchPlayer.uid");
        hashMap.put("uid", uid);
        String sn = switchPlayer.getSn();
        AbstractC5868k.m23673e(sn, "switchPlayer.sn");
        hashMap.put("sn", sn);
        String model = switchPlayer.getModel();
        AbstractC5868k.m23673e(model, "switchPlayer.model");
        hashMap.put(Constants.KEY_MODEL, model);
        hashMap.put("sys_ver", C7737k.f28482a.m29914a().getSysVer());
        String program = switchPlayer.getProgram();
        AbstractC5868k.m23673e(program, "switchPlayer.program");
        hashMap.put("program", program);
        String media = switchPlayer.getMedia();
        AbstractC5868k.m23673e(media, "switchPlayer.media");
        hashMap.put("media", media);
        String title = switchPlayer.getTitle();
        AbstractC5868k.m23673e(title, "switchPlayer.title");
        hashMap.put("title", title);
        String buss = switchPlayer.getBuss();
        AbstractC5868k.m23673e(buss, "switchPlayer.buss");
        hashMap.put("buss", buss);
        String from = switchPlayer.getFrom();
        AbstractC5868k.m23673e(from, "switchPlayer.from");
        hashMap.put("from", from);
        String to = switchPlayer.getTo();
        AbstractC5868k.m23673e(to, "switchPlayer.to");
        hashMap.put("to", to);
        String format = switchPlayer.getFormat();
        AbstractC5868k.m23673e(format, "switchPlayer.format");
        hashMap.put(IjkMediaMeta.IJKM_KEY_FORMAT, format);
        String vcodec = switchPlayer.getVcodec();
        AbstractC5868k.m23673e(vcodec, "switchPlayer.vcodec");
        hashMap.put("vcodec", vcodec);
        hashMap.put("err", Long.valueOf(switchPlayer.getErr()));
        C7730d.f28438a.m29863a("switch_player", hashMap, j10, j11, false, true);
    }
}
