package com.module.bean;

import android.content.Context;
import android.text.TextUtils;
import anet.channel.strategy.dispatch.DispatchConstants;
import com.lzy.okgo.cache.CacheEntity;
import com.module.R$string;
import com.umeng.analytics.pro.C3325bt;
import java.util.HashMap;
import ne.AbstractC5868k;
import p170i2.C4842a;
import p287pb.AbstractApplicationC6253c;
import p359ue.AbstractC7167u;
import p400xa.C7577i1;

/* loaded from: classes2.dex */
public final class AudioInfoUtil {
    public static final int SUBTITLE_COLOR_BLACK = 3;
    public static final int SUBTITLE_COLOR_WHITE = 2;
    public static final int SUBTITLE_COLOR_YELLOW = 1;
    public static final int SUBTITLE_SIZE_BIG = 2;
    public static final int SUBTITLE_SIZE_NORMAL = 1;
    public static final int SUBTITLE_SIZE_SMALL = 3;
    public static final AudioInfoUtil INSTANCE = new AudioInfoUtil();
    private static boolean SUBTITLE_SWITCH = true;
    private static final HashMap<String, Boolean> recordSubtitleSwitch = new HashMap<>();
    private static final HashMap<String, RecordAudioInfoBean> recordAudioMap = new HashMap<>();
    private static final HashMap<String, RecordSubtitleInfoBean> recordSubTitleMap = new HashMap<>();
    private static final HashMap<String, Integer> recordSubtitleColorMap = new HashMap<>();
    private static final HashMap<String, Integer> recordSubtitleSizeMap = new HashMap<>();
    private static final HashMap<String, String> recordRealAudioMap = new HashMap<>();

    private AudioInfoUtil() {
    }

    public final void clearRealAudioMap() {
        recordRealAudioMap.clear();
    }

    public final void clearSelectAudio() {
        recordAudioMap.clear();
    }

    public final void clearSelectSubTitle() {
        recordSubTitleMap.clear();
    }

    public final void clearSelectSwitch() {
        recordSubtitleSwitch.clear();
    }

    public final void clearSubtitleColor() {
        recordSubtitleColorMap.clear();
    }

    public final void clearSubtitleSize() {
        recordSubtitleSizeMap.clear();
    }

    public final RecordAudioInfoBean getAduioRecord(String str) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        return recordAudioMap.get(str);
    }

    public final int getGlobalSettingSubtitle() {
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
                    return 2;
                }
                return -1;
            }
            return 1;
        }
        return 0;
    }

    public final String getRealAudioMap(String str) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        return recordRealAudioMap.get(str);
    }

    public final HashMap<String, String> getRecordRealAudioMap() {
        return recordRealAudioMap;
    }

    public final boolean getSUBTITLE_SWITCH() {
        return SUBTITLE_SWITCH;
    }

    public final RecordSubtitleInfoBean getSelectSubtitle(String str) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        return recordSubTitleMap.get(str);
    }

    public final Boolean getSelectSwitch(String str) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        return recordSubtitleSwitch.get(str);
    }

    public final Integer getSubtitleColor(String str) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        return recordSubtitleColorMap.get(str);
    }

    public final Integer getSubtitleSize(String str) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        return recordSubtitleSizeMap.get(str);
    }

    public final String getTranslateString(String str) {
        AbstractC5868k.m23674f(str, "language");
        Context m24887a = AbstractApplicationC6253c.f24484b.m24887a();
        if (AbstractC5868k.m23669a(str, "zh_HK")) {
            String string = m24887a.getString(R$string.language_zh_HK);
            AbstractC5868k.m23673e(string, "mContext.getString(R.string.language_zh_HK)");
            return string;
        }
        if (AbstractC5868k.m23669a(str, "hi") ? true : AbstractC5868k.m23669a(str, "hin")) {
            String string2 = m24887a.getString(R$string.language_hi);
            AbstractC5868k.m23673e(string2, "mContext.getString(R.string.language_hi)");
            return string2;
        }
        if (AbstractC5868k.m23669a(str, "ms")) {
            String string3 = m24887a.getString(R$string.language_ms);
            AbstractC5868k.m23673e(string3, "mContext.getString(R.string.language_ms)");
            return string3;
        }
        if (AbstractC5868k.m23669a(str, "chi") ? true : AbstractC5868k.m23669a(str, "zh")) {
            String string4 = m24887a.getString(R$string.audio_zh);
            AbstractC5868k.m23673e(string4, "mContext.getString(R.string.audio_zh)");
            return string4;
        }
        if (AbstractC5868k.m23669a(str, "por") ? true : AbstractC5868k.m23669a(str, "pt")) {
            String string5 = m24887a.getString(R$string.language_pt);
            AbstractC5868k.m23673e(string5, "mContext.getString(R.string.language_pt)");
            return string5;
        }
        if (AbstractC5868k.m23669a(str, "eng") ? true : AbstractC5868k.m23669a(str, "en")) {
            String string6 = m24887a.getString(R$string.language_en);
            AbstractC5868k.m23673e(string6, "mContext.getString(R.string.language_en)");
            return string6;
        }
        if (AbstractC5868k.m23669a(str, "spa") ? true : AbstractC5868k.m23669a(str, "es")) {
            String string7 = m24887a.getString(R$string.language_es);
            AbstractC5868k.m23673e(string7, "mContext.getString(R.string.language_es)");
            return string7;
        }
        int hashCode = str.hashCode();
        if ((hashCode == -609604910 ? str.equals("fra (t)") : hashCode == 3276 ? str.equals("fr") : hashCode == 101657 && str.equals("fre")) ? true : AbstractC5868k.m23669a(str, "fre (b)")) {
            String string8 = m24887a.getString(R$string.language_fr);
            AbstractC5868k.m23673e(string8, "mContext.getString(R.string.language_fr)");
            return string8;
        }
        if (AbstractC5868k.m23669a(str, "ara") ? true : AbstractC5868k.m23669a(str, "ar")) {
            String string9 = m24887a.getString(R$string.audio_ara);
            AbstractC5868k.m23673e(string9, "mContext.getString(R.string.audio_ara)");
            return string9;
        }
        if (AbstractC5868k.m23669a(str, "ita") ? true : AbstractC5868k.m23669a(str, "it")) {
            String string10 = m24887a.getString(R$string.audio_ita);
            AbstractC5868k.m23673e(string10, "mContext.getString(R.string.audio_ita)");
            return string10;
        }
        if (AbstractC5868k.m23669a(str, "dut")) {
            String string11 = m24887a.getString(R$string.audio_dut);
            AbstractC5868k.m23673e(string11, "mContext.getString(R.string.audio_dut)");
            return string11;
        }
        if (AbstractC5868k.m23669a(str, "ger") ? true : AbstractC5868k.m23669a(str, "ger (b)")) {
            String string12 = m24887a.getString(R$string.audio_ger);
            AbstractC5868k.m23673e(string12, "mContext.getString(R.string.audio_ger)");
            return string12;
        }
        if (AbstractC5868k.m23669a(str, "heb") ? true : AbstractC5868k.m23669a(str, "he")) {
            String string13 = m24887a.getString(R$string.audio_heb);
            AbstractC5868k.m23673e(string13, "mContext.getString(R.string.audio_heb)");
            return string13;
        }
        if (AbstractC5868k.m23669a(str, "jpn") ? true : AbstractC5868k.m23669a(str, "ja")) {
            String string14 = m24887a.getString(R$string.audio_jpn);
            AbstractC5868k.m23673e(string14, "mContext.getString(R.string.audio_jpn)");
            return string14;
        }
        if (AbstractC5868k.m23669a(str, "aar") ? true : AbstractC5868k.m23669a(str, "aa")) {
            return "Afar";
        }
        if (AbstractC5868k.m23669a(str, "abk") ? true : AbstractC5868k.m23669a(str, "ab")) {
            return "Abkhazian";
        }
        if (AbstractC5868k.m23669a(str, "ace")) {
            return "Achinese";
        }
        if (AbstractC5868k.m23669a(str, "ach")) {
            return "Acoli";
        }
        if (AbstractC5868k.m23669a(str, "ada")) {
            return "Adangme";
        }
        if (AbstractC5868k.m23669a(str, "ady")) {
            return "Adyghe";
        }
        if (AbstractC5868k.m23669a(str, "afa")) {
            return "Afro-Asiatic";
        }
        if (AbstractC5868k.m23669a(str, "afh")) {
            return "Afrihili";
        }
        if (AbstractC5868k.m23669a(str, "afr") ? true : AbstractC5868k.m23669a(str, "af")) {
            return "Afrikaans";
        }
        if (AbstractC5868k.m23669a(str, "ain")) {
            return "Ainu";
        }
        if (AbstractC5868k.m23669a(str, "aka") ? true : AbstractC5868k.m23669a(str, "ak")) {
            return "Akan";
        }
        if (AbstractC5868k.m23669a(str, "akk")) {
            return "Akkadian";
        }
        if (!(AbstractC5868k.m23669a(str, "alb") ? true : AbstractC5868k.m23669a(str, "sq"))) {
            if (AbstractC5868k.m23669a(str, "ale")) {
                return "Aleut";
            }
            if (AbstractC5868k.m23669a(str, "alg")) {
                return "Algonquian languages";
            }
            if (AbstractC5868k.m23669a(str, "alt")) {
                return "Southern Altai";
            }
            if (AbstractC5868k.m23669a(str, "amh") ? true : AbstractC5868k.m23669a(str, "am")) {
                return "Amharic";
            }
            if (AbstractC5868k.m23669a(str, "ang")) {
                return "Old English";
            }
            if (AbstractC5868k.m23669a(str, "anp")) {
                return "Angika";
            }
            if (AbstractC5868k.m23669a(str, "apa")) {
                return "Apache languages";
            }
            if (AbstractC5868k.m23669a(str, "arc")) {
                return "Official Aramaic";
            }
            if (AbstractC5868k.m23669a(str, "arg") ? true : AbstractC5868k.m23669a(str, "an")) {
                return "Aragonese";
            }
            if (AbstractC5868k.m23669a(str, "arm (b)") ? true : AbstractC5868k.m23669a(str, "hy") ? true : AbstractC5868k.m23669a(str, "arm")) {
                return "Armenian";
            }
            if (AbstractC5868k.m23669a(str, "arn")) {
                return "Mapudungun";
            }
            if (AbstractC5868k.m23669a(str, "arp")) {
                return "Arapaho";
            }
            if (AbstractC5868k.m23669a(str, "art (r)") ? true : AbstractC5868k.m23669a(str, "art")) {
                return "Artificial";
            }
            if (AbstractC5868k.m23669a(str, "arw")) {
                return "Arawak";
            }
            if (AbstractC5868k.m23669a(str, "asm") ? true : AbstractC5868k.m23669a(str, "as")) {
                return "Assamese";
            }
            if (AbstractC5868k.m23669a(str, "ast")) {
                return "Asturian";
            }
            if (AbstractC5868k.m23669a(str, "ath (g)") ? true : AbstractC5868k.m23669a(str, "ath")) {
                return "Athapascan languages";
            }
            if (AbstractC5868k.m23669a(str, "aus (g)") ? true : AbstractC5868k.m23669a(str, "aus")) {
                return "Australian languages";
            }
            if (AbstractC5868k.m23669a(str, "ava") ? true : AbstractC5868k.m23669a(str, "av")) {
                return "Avaric";
            }
            if (AbstractC5868k.m23669a(str, "ave") ? true : AbstractC5868k.m23669a(str, "ae")) {
                return "Avestan";
            }
            if (AbstractC5868k.m23669a(str, "awa")) {
                return "Awadhi";
            }
            if (AbstractC5868k.m23669a(str, "aym") ? true : AbstractC5868k.m23669a(str, "ay")) {
                return "Aymara";
            }
            if (AbstractC5868k.m23669a(str, "aze") ? true : AbstractC5868k.m23669a(str, "az")) {
                return "Azerbaijani";
            }
            if (AbstractC5868k.m23669a(str, "bad (c)") ? true : AbstractC5868k.m23669a(str, "bad")) {
                return "Banda languages";
            }
            if (AbstractC5868k.m23669a(str, "bai (g)") ? true : AbstractC5868k.m23669a(str, "bai")) {
                return "Bamileke languages";
            }
            if (AbstractC5868k.m23669a(str, "bak") ? true : AbstractC5868k.m23669a(str, "ba")) {
                return "Bashkir";
            }
            if (AbstractC5868k.m23669a(str, "bal")) {
                return "Baluchi";
            }
            if (AbstractC5868k.m23669a(str, "bam") ? true : AbstractC5868k.m23669a(str, "bm")) {
                return "Bambara";
            }
            if (AbstractC5868k.m23669a(str, "ban")) {
                return "Balinese";
            }
            String str2 = "Basque";
            if (!(AbstractC5868k.m23669a(str, "baq (b)") ? true : AbstractC5868k.m23669a(str, "eu") ? true : AbstractC5868k.m23669a(str, "baq"))) {
                if (AbstractC5868k.m23669a(str, "bas")) {
                    return "Basa (Cameroon)";
                }
                if (AbstractC5868k.m23669a(str, "bat (r)") ? true : AbstractC5868k.m23669a(str, "bat")) {
                    return "Baltic";
                }
                if (AbstractC5868k.m23669a(str, "bej")) {
                    return "Beja";
                }
                if (AbstractC5868k.m23669a(str, "bel") ? true : AbstractC5868k.m23669a(str, "be")) {
                    return "Belarusian";
                }
                if (AbstractC5868k.m23669a(str, "bem")) {
                    return "Bemba";
                }
                if (AbstractC5868k.m23669a(str, "ben") ? true : AbstractC5868k.m23669a(str, "bn")) {
                    return "Bengali";
                }
                if (AbstractC5868k.m23669a(str, "ber (r)") ? true : AbstractC5868k.m23669a(str, "ber")) {
                    return "Berber";
                }
                if (AbstractC5868k.m23669a(str, "bho")) {
                    return "Bhojpuri";
                }
                if (AbstractC5868k.m23669a(str, "bih (c)") ? true : AbstractC5868k.m23669a(str, "bh") ? true : AbstractC5868k.m23669a(str, "bih")) {
                    return "Bihari";
                }
                if (AbstractC5868k.m23669a(str, "bik")) {
                    return "Bikol";
                }
                if (AbstractC5868k.m23669a(str, "bin")) {
                    return "Bini";
                }
                if (AbstractC5868k.m23669a(str, "bis") ? true : AbstractC5868k.m23669a(str, "bi")) {
                    return "Bislama";
                }
                if (AbstractC5868k.m23669a(str, "bla")) {
                    return "Siksika";
                }
                if (AbstractC5868k.m23669a(str, "bnt (r)") ? true : AbstractC5868k.m23669a(str, "bnt")) {
                    return "Bantu";
                }
                if (!(AbstractC5868k.m23669a(str, "bod (t)") ? true : AbstractC5868k.m23669a(str, "bo") ? true : AbstractC5868k.m23669a(str, "bod"))) {
                    if (AbstractC5868k.m23669a(str, "bos") ? true : AbstractC5868k.m23669a(str, "bs")) {
                        return "Bosnian";
                    }
                    if (AbstractC5868k.m23669a(str, "bra")) {
                        return "Braj";
                    }
                    if (AbstractC5868k.m23669a(str, "bre") ? true : AbstractC5868k.m23669a(str, "br")) {
                        return "Breton";
                    }
                    if (AbstractC5868k.m23669a(str, "btk (c)")) {
                        return "Batak languages";
                    }
                    if (AbstractC5868k.m23669a(str, "bua")) {
                        return "Buriat";
                    }
                    if (AbstractC5868k.m23669a(str, "bug")) {
                        return "Buginese";
                    }
                    if (AbstractC5868k.m23669a(str, "bul") ? true : AbstractC5868k.m23669a(str, "bg")) {
                        return "Bulgarian";
                    }
                    String str3 = "Burmese";
                    if (!(AbstractC5868k.m23669a(str, "bur (b)") ? true : AbstractC5868k.m23669a(str, "my"))) {
                        if (AbstractC5868k.m23669a(str, "byn")) {
                            return "Bilin";
                        }
                        if (AbstractC5868k.m23669a(str, "cad")) {
                            return "Caddo";
                        }
                        if (AbstractC5868k.m23669a(str, "cai (r)")) {
                            return "Central American Indian";
                        }
                        if (AbstractC5868k.m23669a(str, "car")) {
                            return "Galibi Carib";
                        }
                        if (AbstractC5868k.m23669a(str, "cat") ? true : AbstractC5868k.m23669a(str, "ca")) {
                            return "Catalan";
                        }
                        if (AbstractC5868k.m23669a(str, "cau (r)")) {
                            return "Caucasian";
                        }
                        if (AbstractC5868k.m23669a(str, "ceb")) {
                            return "Cebuano";
                        }
                        if (AbstractC5868k.m23669a(str, "cel (r)")) {
                            return "Celtic";
                        }
                        String str4 = "Czech";
                        if (!(AbstractC5868k.m23669a(str, "ces (t)") ? true : AbstractC5868k.m23669a(str, "cs"))) {
                            if (AbstractC5868k.m23669a(str, "cha") ? true : AbstractC5868k.m23669a(str, "ch")) {
                                return "Chamorro";
                            }
                            if (AbstractC5868k.m23669a(str, "chb")) {
                                return "Chibcha";
                            }
                            if (AbstractC5868k.m23669a(str, "che") ? true : AbstractC5868k.m23669a(str, "ce")) {
                                return "Chechen";
                            }
                            if (AbstractC5868k.m23669a(str, "chg")) {
                                return "Chagatai";
                            }
                            if (AbstractC5868k.m23669a(str, "chk")) {
                                return "Chuukese";
                            }
                            if (AbstractC5868k.m23669a(str, "chm")) {
                                return "Mari";
                            }
                            if (AbstractC5868k.m23669a(str, "chn")) {
                                return "Chinook jargon";
                            }
                            if (AbstractC5868k.m23669a(str, "cho")) {
                                return "Choctaw";
                            }
                            if (AbstractC5868k.m23669a(str, "chp")) {
                                return "Chipewyan";
                            }
                            if (AbstractC5868k.m23669a(str, "chr")) {
                                return "Cherokee";
                            }
                            if (AbstractC5868k.m23669a(str, "chu") ? true : AbstractC5868k.m23669a(str, "cu")) {
                                return "Church Slavic";
                            }
                            if (AbstractC5868k.m23669a(str, "chv") ? true : AbstractC5868k.m23669a(str, DispatchConstants.CONFIG_VERSION)) {
                                return "Chuvash";
                            }
                            if (AbstractC5868k.m23669a(str, "chy")) {
                                return "Cheyenne";
                            }
                            if (AbstractC5868k.m23669a(str, "cmc (g)")) {
                                return "Chamic languages";
                            }
                            if (AbstractC5868k.m23669a(str, "cop")) {
                                return "Coptic";
                            }
                            if (AbstractC5868k.m23669a(str, "cor") ? true : AbstractC5868k.m23669a(str, "kw")) {
                                return "Cornish";
                            }
                            if (AbstractC5868k.m23669a(str, "cos") ? true : AbstractC5868k.m23669a(str, "co")) {
                                return "Corsican";
                            }
                            if (AbstractC5868k.m23669a(str, "cpe (r)")) {
                                return "Creoles and pidgins, English based";
                            }
                            if (AbstractC5868k.m23669a(str, "cpf (r)")) {
                                return "Creoles and pidgins, French-based";
                            }
                            if (AbstractC5868k.m23669a(str, "cpp (r)")) {
                                return "Creoles and pidgins, Portuguese-based";
                            }
                            if (AbstractC5868k.m23669a(str, "cre") ? true : AbstractC5868k.m23669a(str, "cr")) {
                                return "Cree";
                            }
                            if (AbstractC5868k.m23669a(str, "crh")) {
                                return "Crimean Tatar";
                            }
                            if (AbstractC5868k.m23669a(str, "crp (r)")) {
                                return "Creoles and pidgins";
                            }
                            if (AbstractC5868k.m23669a(str, "csb")) {
                                return "Kashubian";
                            }
                            if (AbstractC5868k.m23669a(str, "cus (r)")) {
                                return "Cushitic (Other)";
                            }
                            if (!(AbstractC5868k.m23669a(str, "cym (t)") ? true : AbstractC5868k.m23669a(str, "cy"))) {
                                if (!AbstractC5868k.m23669a(str, "cze (b)")) {
                                    if (AbstractC5868k.m23669a(str, "dak")) {
                                        return "Dakota";
                                    }
                                    if (AbstractC5868k.m23669a(str, "dan") ? true : AbstractC5868k.m23669a(str, "da")) {
                                        return "Danish";
                                    }
                                    if (AbstractC5868k.m23669a(str, "dar")) {
                                        return "Dargwa";
                                    }
                                    if (AbstractC5868k.m23669a(str, "day (c)")) {
                                        return "Land Dayak languages";
                                    }
                                    if (AbstractC5868k.m23669a(str, "del")) {
                                        return "Delaware";
                                    }
                                    if (AbstractC5868k.m23669a(str, "den")) {
                                        return "Slave";
                                    }
                                    if (AbstractC5868k.m23669a(str, "deu (t)") ? true : AbstractC5868k.m23669a(str, "de")) {
                                        return "German";
                                    }
                                    if (AbstractC5868k.m23669a(str, "dgr")) {
                                        return "Dogrib";
                                    }
                                    if (AbstractC5868k.m23669a(str, "din")) {
                                        return "Dinka";
                                    }
                                    if (AbstractC5868k.m23669a(str, "div") ? true : AbstractC5868k.m23669a(str, "dv")) {
                                        return "Dhivehi";
                                    }
                                    if (AbstractC5868k.m23669a(str, "doi")) {
                                        return "Dogri (macrolanguage)";
                                    }
                                    if (AbstractC5868k.m23669a(str, "dra (r)")) {
                                        return "Dravidian";
                                    }
                                    if (AbstractC5868k.m23669a(str, "dsb")) {
                                        return "Lower Sorbian";
                                    }
                                    if (AbstractC5868k.m23669a(str, "dua")) {
                                        return "Duala";
                                    }
                                    if (AbstractC5868k.m23669a(str, "dum")) {
                                        return "Middle Dutch";
                                    }
                                    str4 = "Dutch";
                                    if (!(AbstractC5868k.m23669a(str, "dut (b)") ? true : AbstractC5868k.m23669a(str, "nl"))) {
                                        if (AbstractC5868k.m23669a(str, "dyu")) {
                                            return "Dyula";
                                        }
                                        if (AbstractC5868k.m23669a(str, "dzo") ? true : AbstractC5868k.m23669a(str, "dz")) {
                                            return "Dzongkha";
                                        }
                                        if (AbstractC5868k.m23669a(str, "efi")) {
                                            return "Efik";
                                        }
                                        if (AbstractC5868k.m23669a(str, "egy")) {
                                            return "Egyptian";
                                        }
                                        if (AbstractC5868k.m23669a(str, "eka")) {
                                            return "Ekajuk";
                                        }
                                        String str5 = "Modern Greek";
                                        if (!(AbstractC5868k.m23669a(str, "ell (t)") ? true : AbstractC5868k.m23669a(str, "el"))) {
                                            if (AbstractC5868k.m23669a(str, "elx")) {
                                                return "Elamite";
                                            }
                                            if (AbstractC5868k.m23669a(str, "enm")) {
                                                return "Middle English ";
                                            }
                                            if (AbstractC5868k.m23669a(str, "epo") ? true : AbstractC5868k.m23669a(str, "eo")) {
                                                return "Esperanto";
                                            }
                                            if (AbstractC5868k.m23669a(str, "est") ? true : AbstractC5868k.m23669a(str, "et")) {
                                                return "Estonian";
                                            }
                                            if (!(AbstractC5868k.m23669a(str, "eus (t)") ? true : AbstractC5868k.m23669a(str, "eus"))) {
                                                if (AbstractC5868k.m23669a(str, "ewe") ? true : AbstractC5868k.m23669a(str, "ee")) {
                                                    return "Ewe";
                                                }
                                                if (AbstractC5868k.m23669a(str, "ewo")) {
                                                    return "Ewondo";
                                                }
                                                if (AbstractC5868k.m23669a(str, "fan")) {
                                                    return "Fang";
                                                }
                                                if (AbstractC5868k.m23669a(str, "fao") ? true : AbstractC5868k.m23669a(str, "fo")) {
                                                    return "Faroese";
                                                }
                                                str2 = "Persian";
                                                if (!(AbstractC5868k.m23669a(str, "fas (t)") ? true : AbstractC5868k.m23669a(str, "fa"))) {
                                                    if (AbstractC5868k.m23669a(str, "fat")) {
                                                        return "Fanti";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "fij") ? true : AbstractC5868k.m23669a(str, "fj")) {
                                                        return "Fijian";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "fil")) {
                                                        return "Filipino";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "fin") ? true : AbstractC5868k.m23669a(str, "fi")) {
                                                        return "Finnish";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "fiu (r)")) {
                                                        return "Finno-Ugrian";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "fon")) {
                                                        return "Fon";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "frm")) {
                                                        return "Middle French";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "fro")) {
                                                        return "Old French";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "frr")) {
                                                        return "Northern Frisian";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "frs")) {
                                                        return "Eastern Frisian";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "fry") ? true : AbstractC5868k.m23669a(str, "fy")) {
                                                        return "Western Frisian";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "ful") ? true : AbstractC5868k.m23669a(str, "ff")) {
                                                        return "Fulah";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "fur")) {
                                                        return "Friulian";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "gaa")) {
                                                        return "Ga";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "gay")) {
                                                        return "Gayo";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "gba")) {
                                                        return "Gbaya";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "gem (r)")) {
                                                        return "Germanic";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "geo (b)") ? true : AbstractC5868k.m23669a(str, "ka") ? true : AbstractC5868k.m23669a(str, "kat (t)")) {
                                                        return "Georgian";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "gez")) {
                                                        return "Geez";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "gil")) {
                                                        return "Gilbertese";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "gla") ? true : AbstractC5868k.m23669a(str, "gd")) {
                                                        return "Scottish Gaelic";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "gle") ? true : AbstractC5868k.m23669a(str, "ga")) {
                                                        return "Irish";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "glg") ? true : AbstractC5868k.m23669a(str, "gl")) {
                                                        return "Galician";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "glv") ? true : AbstractC5868k.m23669a(str, "gv")) {
                                                        return "Manx";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "gmh")) {
                                                        return "Middle High German";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "goh")) {
                                                        return "Old High German ";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "gon")) {
                                                        return "Gondi";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "gor")) {
                                                        return "Gorontalo";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "got")) {
                                                        return "Gothic";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "grb")) {
                                                        return "Grebo";
                                                    }
                                                    if (AbstractC5868k.m23669a(str, "grc")) {
                                                        return "Ancient Greek (to 1453)";
                                                    }
                                                    if (!AbstractC5868k.m23669a(str, "gre (b)")) {
                                                        if (AbstractC5868k.m23669a(str, "grn") ? true : AbstractC5868k.m23669a(str, "gn")) {
                                                            return "Guarani";
                                                        }
                                                        if (AbstractC5868k.m23669a(str, "gsw")) {
                                                            return "Swiss German";
                                                        }
                                                        if (AbstractC5868k.m23669a(str, "guj") ? true : AbstractC5868k.m23669a(str, "gu")) {
                                                            return "Gujarati";
                                                        }
                                                        if (AbstractC5868k.m23669a(str, "gwi")) {
                                                            return "Gwichʼin";
                                                        }
                                                        if (AbstractC5868k.m23669a(str, "hai")) {
                                                            return "Haida";
                                                        }
                                                        if (AbstractC5868k.m23669a(str, "hat") ? true : AbstractC5868k.m23669a(str, "ht")) {
                                                            return "Haitian";
                                                        }
                                                        if (AbstractC5868k.m23669a(str, "hau") ? true : AbstractC5868k.m23669a(str, "ha")) {
                                                            return "Hausa";
                                                        }
                                                        if (AbstractC5868k.m23669a(str, "haw")) {
                                                            return "Hawaiian";
                                                        }
                                                        if (AbstractC5868k.m23669a(str, "her") ? true : AbstractC5868k.m23669a(str, "hz")) {
                                                            return "Herero";
                                                        }
                                                        if (AbstractC5868k.m23669a(str, "hil")) {
                                                            return "Hiligaynon";
                                                        }
                                                        if (AbstractC5868k.m23669a(str, "him (c)")) {
                                                            return "Himachali";
                                                        }
                                                        if (AbstractC5868k.m23669a(str, "hit")) {
                                                            return "Hittite";
                                                        }
                                                        if (AbstractC5868k.m23669a(str, "hmn")) {
                                                            return "Hmong";
                                                        }
                                                        if (AbstractC5868k.m23669a(str, "hmo") ? true : AbstractC5868k.m23669a(str, "ho")) {
                                                            return "Hiri Motu";
                                                        }
                                                        str5 = "Croatian";
                                                        if (!(AbstractC5868k.m23669a(str, "hrv (t)") ? true : AbstractC5868k.m23669a(str, "hr"))) {
                                                            if (AbstractC5868k.m23669a(str, "hsb")) {
                                                                return "Upper Sorbian";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "hun") ? true : AbstractC5868k.m23669a(str, "hu")) {
                                                                return "Hungarian";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "hup")) {
                                                                return "Hupa";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "iba")) {
                                                                return "Iban";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "ibo") ? true : AbstractC5868k.m23669a(str, "ig")) {
                                                                return "Igbo";
                                                            }
                                                            int hashCode2 = str.hashCode();
                                                            if ((hashCode2 == 3370 ? !str.equals(C3325bt.f14213ae) : hashCode2 == 1627162394 ? !str.equals("ice (b)") : !(hashCode2 == 2091694015 && str.equals("isl (t)"))) ? AbstractC5868k.m23669a(str, "isl") : true) {
                                                                return "Icelandic";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "ido") ? true : AbstractC5868k.m23669a(str, "io")) {
                                                                return "Ido";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "iii") ? true : AbstractC5868k.m23669a(str, "ii")) {
                                                                return "Sichuan Yi";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "ijo (c)")) {
                                                                return "Ijo languages";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "iku") ? true : AbstractC5868k.m23669a(str, "iu")) {
                                                                return "Inuktitut";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "ile") ? true : AbstractC5868k.m23669a(str, "ie")) {
                                                                return "Interlingue";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "ilo")) {
                                                                return "Iloko";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "ina") ? true : AbstractC5868k.m23669a(str, "ia")) {
                                                                return "Interlingua ";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "inc (r)")) {
                                                                return "Indic ";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "ind") ? true : AbstractC5868k.m23669a(str, "id")) {
                                                                return "Indonesian";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "ine (r)")) {
                                                                return "Indo-European";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "inh")) {
                                                                return "Ingush";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "ipk") ? true : AbstractC5868k.m23669a(str, "ik")) {
                                                                return "Inupiaq";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "ira (r)")) {
                                                                return "Iranian (Other)";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "iro (g)")) {
                                                                return "Iroquoian languages";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "jav") ? true : AbstractC5868k.m23669a(str, "jv")) {
                                                                return "Javanese";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "jbo")) {
                                                                return "Lojban";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "jpr")) {
                                                                return "Judeo-Persian";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "jrb")) {
                                                                return "Judeo-Arabic";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kaa")) {
                                                                return "Kara-Kalpak";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kab")) {
                                                                return "Kabyle";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kac")) {
                                                                return "Kachin";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kal") ? true : AbstractC5868k.m23669a(str, "kl")) {
                                                                return "Kalaallisut";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kam")) {
                                                                return "Kamba (Kenya)";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kan") ? true : AbstractC5868k.m23669a(str, "kn")) {
                                                                return "Kannada";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kar (c)")) {
                                                                return "Karen languages";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kas") ? true : AbstractC5868k.m23669a(str, "ks")) {
                                                                return "Kashmiri";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kau") ? true : AbstractC5868k.m23669a(str, "kr")) {
                                                                return "Kanuri";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kaw")) {
                                                                return "Kawi";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kaz") ? true : AbstractC5868k.m23669a(str, "kk")) {
                                                                return "Kazakh";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kbd")) {
                                                                return "Kabardian";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kha")) {
                                                                return "Khasi";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "khi (r)")) {
                                                                return "Khoisan (Other)";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "khm") ? true : AbstractC5868k.m23669a(str, "km")) {
                                                                return "Central Khmer";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kho")) {
                                                                return "Khotanese";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kik") ? true : AbstractC5868k.m23669a(str, "ki")) {
                                                                return "Kikuyu";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kin") ? true : AbstractC5868k.m23669a(str, "rw")) {
                                                                return "Kinyarwanda";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kir") ? true : AbstractC5868k.m23669a(str, "ky")) {
                                                                return "Kirghiz";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kmb")) {
                                                                return "Kimbundu";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kok")) {
                                                                return "Konkani (macrolanguage)";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kom") ? true : AbstractC5868k.m23669a(str, "kv")) {
                                                                return "Komi";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kon") ? true : AbstractC5868k.m23669a(str, "kg")) {
                                                                return "Kongo";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kor") ? true : AbstractC5868k.m23669a(str, "ko")) {
                                                                return "Korean";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kos")) {
                                                                return "Kosraean";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kpe")) {
                                                                return "Kpelle";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "krc")) {
                                                                return "Karachay-Balkar";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "krl")) {
                                                                return "Karelian";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kro (c)")) {
                                                                return "Kru languages";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kru")) {
                                                                return "Kurukh";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kua") ? true : AbstractC5868k.m23669a(str, "kj")) {
                                                                return "Kuanyama";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kum")) {
                                                                return "Kumyk";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kur") ? true : AbstractC5868k.m23669a(str, "ku")) {
                                                                return "Kurdish";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "kut")) {
                                                                return "Kutenai";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "lad")) {
                                                                return "Ladino";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "lah")) {
                                                                return "Lahnda";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "lam")) {
                                                                return "Lamba";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "lao") ? true : AbstractC5868k.m23669a(str, "lo")) {
                                                                return "Lao";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "lat") ? true : AbstractC5868k.m23669a(str, "la")) {
                                                                return "Latin";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "lav") ? true : AbstractC5868k.m23669a(str, "lv")) {
                                                                return "Latvian";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "lez")) {
                                                                return "Lezghian";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "lim") ? true : AbstractC5868k.m23669a(str, "li")) {
                                                                return "Limburgan";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "lin") ? true : AbstractC5868k.m23669a(str, "ln")) {
                                                                return "Lingala";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "lit") ? true : AbstractC5868k.m23669a(str, "lt")) {
                                                                return "Lithuanian";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "lol")) {
                                                                return "Mongo";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "loz")) {
                                                                return "Lozi";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "ltz") ? true : AbstractC5868k.m23669a(str, "lb")) {
                                                                return "Luxembourgish";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "lua")) {
                                                                return "Luba-Lulua";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "lub") ? true : AbstractC5868k.m23669a(str, "lu")) {
                                                                return "Luba-Katanga";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "lug") ? true : AbstractC5868k.m23669a(str, "lg")) {
                                                                return "Ganda";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "lui")) {
                                                                return "Luiseno";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "lun")) {
                                                                return "Lunda";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "luo")) {
                                                                return "Luo (Kenya and Tanzania)";
                                                            }
                                                            if (AbstractC5868k.m23669a(str, "lus")) {
                                                                return "Lushai";
                                                            }
                                                            if (!(AbstractC5868k.m23669a(str, "mac (b)") ? true : AbstractC5868k.m23669a(str, "mk"))) {
                                                                if (AbstractC5868k.m23669a(str, "mad")) {
                                                                    return "Madurese";
                                                                }
                                                                if (AbstractC5868k.m23669a(str, "mag")) {
                                                                    return "Magahi";
                                                                }
                                                                if (AbstractC5868k.m23669a(str, "mah") ? true : AbstractC5868k.m23669a(str, "mh")) {
                                                                    return "Marshallese";
                                                                }
                                                                if (AbstractC5868k.m23669a(str, "mai")) {
                                                                    return "Maithili";
                                                                }
                                                                if (AbstractC5868k.m23669a(str, "mak")) {
                                                                    return "Makasar";
                                                                }
                                                                if (AbstractC5868k.m23669a(str, "mal") ? true : AbstractC5868k.m23669a(str, "ml")) {
                                                                    return "Malayalam";
                                                                }
                                                                if (AbstractC5868k.m23669a(str, "man")) {
                                                                    return "Mandingo";
                                                                }
                                                                if (!(AbstractC5868k.m23669a(str, "mao (b)") ? true : AbstractC5868k.m23669a(str, "mi"))) {
                                                                    if (AbstractC5868k.m23669a(str, "map (r)")) {
                                                                        return "Austronesian (Other)";
                                                                    }
                                                                    if (AbstractC5868k.m23669a(str, "mar") ? true : AbstractC5868k.m23669a(str, "mr")) {
                                                                        return "Marathi";
                                                                    }
                                                                    if (AbstractC5868k.m23669a(str, "mas")) {
                                                                        return "Masai";
                                                                    }
                                                                    if (!AbstractC5868k.m23669a(str, "may (b)")) {
                                                                        if (AbstractC5868k.m23669a(str, "mdf")) {
                                                                            return "Moksha";
                                                                        }
                                                                        if (AbstractC5868k.m23669a(str, "mdr")) {
                                                                            return "Mandar";
                                                                        }
                                                                        if (AbstractC5868k.m23669a(str, "men")) {
                                                                            return "Mende (Sierra Leone)";
                                                                        }
                                                                        if (AbstractC5868k.m23669a(str, "mga")) {
                                                                            return "Middle Irish (900-1200)";
                                                                        }
                                                                        if (AbstractC5868k.m23669a(str, "mic")) {
                                                                            return "Mi'kmaq";
                                                                        }
                                                                        if (AbstractC5868k.m23669a(str, "min")) {
                                                                            return "Minangkabau";
                                                                        }
                                                                        if (AbstractC5868k.m23669a(str, "mis")) {
                                                                            return "Uncoded languages";
                                                                        }
                                                                        if (!AbstractC5868k.m23669a(str, "mkd (t)")) {
                                                                            if (AbstractC5868k.m23669a(str, "mkh (r)")) {
                                                                                return "Mon-Khmer (Other)";
                                                                            }
                                                                            if (AbstractC5868k.m23669a(str, "mlg") ? true : AbstractC5868k.m23669a(str, "mg")) {
                                                                                return "Malagasy";
                                                                            }
                                                                            if (AbstractC5868k.m23669a(str, "mlt") ? true : AbstractC5868k.m23669a(str, "mt")) {
                                                                                return "Maltese";
                                                                            }
                                                                            if (AbstractC5868k.m23669a(str, DispatchConstants.MNC)) {
                                                                                return "Manchu";
                                                                            }
                                                                            if (AbstractC5868k.m23669a(str, "mni")) {
                                                                                return "Manipuri";
                                                                            }
                                                                            if (AbstractC5868k.m23669a(str, "mno (g)")) {
                                                                                return "Manobo languages";
                                                                            }
                                                                            if (AbstractC5868k.m23669a(str, "moh")) {
                                                                                return "Mohawk";
                                                                            }
                                                                            if (AbstractC5868k.m23669a(str, "mol") ? true : AbstractC5868k.m23669a(str, "mo")) {
                                                                                return "Moldavian";
                                                                            }
                                                                            if (AbstractC5868k.m23669a(str, "mon") ? true : AbstractC5868k.m23669a(str, "mn")) {
                                                                                return "Mongolian";
                                                                            }
                                                                            if (AbstractC5868k.m23669a(str, "mos")) {
                                                                                return "Mossi";
                                                                            }
                                                                            if (!AbstractC5868k.m23669a(str, "mri (t)")) {
                                                                                if (!AbstractC5868k.m23669a(str, "msa (t)")) {
                                                                                    if (AbstractC5868k.m23669a(str, "mul")) {
                                                                                        return "Multiple languages";
                                                                                    }
                                                                                    if (AbstractC5868k.m23669a(str, "mun (g)")) {
                                                                                        return "Munda languages";
                                                                                    }
                                                                                    if (AbstractC5868k.m23669a(str, "mus")) {
                                                                                        return "Creek";
                                                                                    }
                                                                                    if (AbstractC5868k.m23669a(str, "mwl")) {
                                                                                        return "Mirandese";
                                                                                    }
                                                                                    if (AbstractC5868k.m23669a(str, "mwr")) {
                                                                                        return "Marwari";
                                                                                    }
                                                                                    if (!AbstractC5868k.m23669a(str, "mya (t)")) {
                                                                                        if (AbstractC5868k.m23669a(str, "myn (g)")) {
                                                                                            return "Mayan languages";
                                                                                        }
                                                                                        if (AbstractC5868k.m23669a(str, "myv")) {
                                                                                            return "Erzya";
                                                                                        }
                                                                                        if (AbstractC5868k.m23669a(str, "nah (c)")) {
                                                                                            return "Nahuatl languages";
                                                                                        }
                                                                                        if (AbstractC5868k.m23669a(str, "nai (r)")) {
                                                                                            return "North American Indian";
                                                                                        }
                                                                                        if (AbstractC5868k.m23669a(str, "nap")) {
                                                                                            return "Neapolitan";
                                                                                        }
                                                                                        if (AbstractC5868k.m23669a(str, "nau") ? true : AbstractC5868k.m23669a(str, "na")) {
                                                                                            return "Nauru";
                                                                                        }
                                                                                        if (AbstractC5868k.m23669a(str, "nav") ? true : AbstractC5868k.m23669a(str, "nv")) {
                                                                                            return "Navajo";
                                                                                        }
                                                                                        if (AbstractC5868k.m23669a(str, "nbl") ? true : AbstractC5868k.m23669a(str, "nr")) {
                                                                                            return "South Ndebele";
                                                                                        }
                                                                                        if (AbstractC5868k.m23669a(str, "nde") ? true : AbstractC5868k.m23669a(str, "nd")) {
                                                                                            return "North Ndebele";
                                                                                        }
                                                                                        if (AbstractC5868k.m23669a(str, "ndo") ? true : AbstractC5868k.m23669a(str, "ng")) {
                                                                                            return "Ndonga";
                                                                                        }
                                                                                        if (AbstractC5868k.m23669a(str, "nds")) {
                                                                                            return "Low German";
                                                                                        }
                                                                                        if (AbstractC5868k.m23669a(str, "nep") ? true : AbstractC5868k.m23669a(str, "ne")) {
                                                                                            return "Nepali";
                                                                                        }
                                                                                        if (AbstractC5868k.m23669a(str, "new")) {
                                                                                            return "Newari";
                                                                                        }
                                                                                        if (AbstractC5868k.m23669a(str, "nia")) {
                                                                                            return "Nias";
                                                                                        }
                                                                                        if (AbstractC5868k.m23669a(str, "nic (r)")) {
                                                                                            return "Niger-Kordofanian";
                                                                                        }
                                                                                        if (AbstractC5868k.m23669a(str, "niu")) {
                                                                                            return "Niuean";
                                                                                        }
                                                                                        if (!AbstractC5868k.m23669a(str, "nld (t)")) {
                                                                                            if (AbstractC5868k.m23669a(str, "nno") ? true : AbstractC5868k.m23669a(str, "nn")) {
                                                                                                return "Norwegian Nynorsk";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "nob") ? true : AbstractC5868k.m23669a(str, "nb")) {
                                                                                                return "Norwegian Bokmål";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "nog")) {
                                                                                                return "Nogai";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "non")) {
                                                                                                return "Old Norse";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "nor") ? true : AbstractC5868k.m23669a(str, "no")) {
                                                                                                return "Norwegian";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "nqo")) {
                                                                                                return "N'Ko";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "nso")) {
                                                                                                return "Pedi";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "nub (g)")) {
                                                                                                return "Nubian languages";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "nwc")) {
                                                                                                return "Classical Newari";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "nya") ? true : AbstractC5868k.m23669a(str, "ny")) {
                                                                                                return "Nyanja";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "nym")) {
                                                                                                return "Nyamwezi";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "nyn")) {
                                                                                                return "Nyankole";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "nyo")) {
                                                                                                return "Nyoro";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "nzi")) {
                                                                                                return "Nzima";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "oci") ? true : AbstractC5868k.m23669a(str, "oc")) {
                                                                                                return "Occitan ";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "oji") ? true : AbstractC5868k.m23669a(str, "oj")) {
                                                                                                return "Ojibwa";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "ori") ? true : AbstractC5868k.m23669a(str, "or")) {
                                                                                                return "Oriya";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "orm") ? true : AbstractC5868k.m23669a(str, "om")) {
                                                                                                return "Oromo";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "osa")) {
                                                                                                return "Osage";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "oss") ? true : AbstractC5868k.m23669a(str, "os")) {
                                                                                                return "Ossetian";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "ota")) {
                                                                                                return "Ottoman Turkish (1500-1928)";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "oto (g)")) {
                                                                                                return "Otomian languages";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "paa (r)")) {
                                                                                                return "Papuan (Other)";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "pag")) {
                                                                                                return "Pangasinan";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "pal")) {
                                                                                                return "Pahlavi";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "pam")) {
                                                                                                return "Pampanga";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "pan") ? true : AbstractC5868k.m23669a(str, "pa")) {
                                                                                                return "Panjabi";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "pap")) {
                                                                                                return "Papiamento";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "pau")) {
                                                                                                return "Palauan";
                                                                                            }
                                                                                            if (AbstractC5868k.m23669a(str, "peo")) {
                                                                                                return "Old Persian (ca. 600-400 B.C.)";
                                                                                            }
                                                                                            if (!AbstractC5868k.m23669a(str, "per (b)")) {
                                                                                                if (AbstractC5868k.m23669a(str, "phi (r)")) {
                                                                                                    return "Philippine (Other)";
                                                                                                }
                                                                                                if (AbstractC5868k.m23669a(str, "phn")) {
                                                                                                    return "Phoenician";
                                                                                                }
                                                                                                if (AbstractC5868k.m23669a(str, "pli") ? true : AbstractC5868k.m23669a(str, "pi")) {
                                                                                                    return "Pali";
                                                                                                }
                                                                                                if (AbstractC5868k.m23669a(str, "pol") ? true : AbstractC5868k.m23669a(str, C3325bt.f14188aF)) {
                                                                                                    return "Polish";
                                                                                                }
                                                                                                if (AbstractC5868k.m23669a(str, "pon")) {
                                                                                                    return "Pohnpeian";
                                                                                                }
                                                                                                if (AbstractC5868k.m23669a(str, "pra (g)")) {
                                                                                                    return "Prakrit languages";
                                                                                                }
                                                                                                if (AbstractC5868k.m23669a(str, "pro")) {
                                                                                                    return "Old Provençal (to 1500)";
                                                                                                }
                                                                                                if (AbstractC5868k.m23669a(str, "pus") ? true : AbstractC5868k.m23669a(str, "ps")) {
                                                                                                    return "Pushto";
                                                                                                }
                                                                                                if (AbstractC5868k.m23669a(str, "qaa-qtz")) {
                                                                                                    return "Reserved for local use";
                                                                                                }
                                                                                                if (AbstractC5868k.m23669a(str, "que") ? true : AbstractC5868k.m23669a(str, "qu")) {
                                                                                                    return "Quechua";
                                                                                                }
                                                                                                if (AbstractC5868k.m23669a(str, "raj")) {
                                                                                                    return "Rajasthani";
                                                                                                }
                                                                                                if (AbstractC5868k.m23669a(str, "rap")) {
                                                                                                    return "Rapanui";
                                                                                                }
                                                                                                if (AbstractC5868k.m23669a(str, "rar")) {
                                                                                                    return "Rarotongan";
                                                                                                }
                                                                                                if (AbstractC5868k.m23669a(str, "roa (r)")) {
                                                                                                    return "Romance (Other)";
                                                                                                }
                                                                                                if (AbstractC5868k.m23669a(str, "roh") ? true : AbstractC5868k.m23669a(str, "rm")) {
                                                                                                    return "Romansh";
                                                                                                }
                                                                                                if (AbstractC5868k.m23669a(str, "rom")) {
                                                                                                    return "Romany";
                                                                                                }
                                                                                                str2 = "Romanian";
                                                                                                if (!(AbstractC5868k.m23669a(str, "ron (t)") ? true : AbstractC5868k.m23669a(str, "ro")) && !AbstractC5868k.m23669a(str, "rum (b)")) {
                                                                                                    if (AbstractC5868k.m23669a(str, "run") ? true : AbstractC5868k.m23669a(str, "rn")) {
                                                                                                        return "Rundi";
                                                                                                    }
                                                                                                    if (AbstractC5868k.m23669a(str, "rup")) {
                                                                                                        return "Macedo Romanian";
                                                                                                    }
                                                                                                    if (AbstractC5868k.m23669a(str, "rus") ? true : AbstractC5868k.m23669a(str, "ru")) {
                                                                                                        return "Russian";
                                                                                                    }
                                                                                                    if (AbstractC5868k.m23669a(str, "sad")) {
                                                                                                        return "Sandawe";
                                                                                                    }
                                                                                                    if (AbstractC5868k.m23669a(str, "sag") ? true : AbstractC5868k.m23669a(str, "sg")) {
                                                                                                        return "Sango";
                                                                                                    }
                                                                                                    if (AbstractC5868k.m23669a(str, "sah")) {
                                                                                                        return "Yakut";
                                                                                                    }
                                                                                                    if (AbstractC5868k.m23669a(str, "sai (r)")) {
                                                                                                        return "South American Indian (Other)";
                                                                                                    }
                                                                                                    if (AbstractC5868k.m23669a(str, "sal (g)")) {
                                                                                                        return "Salishan languages";
                                                                                                    }
                                                                                                    if (AbstractC5868k.m23669a(str, "sam")) {
                                                                                                        return "Samaritan Aramaic";
                                                                                                    }
                                                                                                    if (AbstractC5868k.m23669a(str, "san") ? true : AbstractC5868k.m23669a(str, "sa")) {
                                                                                                        return "Sanskrit";
                                                                                                    }
                                                                                                    if (AbstractC5868k.m23669a(str, "sas")) {
                                                                                                        return "Sasak";
                                                                                                    }
                                                                                                    if (AbstractC5868k.m23669a(str, "sat")) {
                                                                                                        return "Santali";
                                                                                                    }
                                                                                                    str2 = "Serbian";
                                                                                                    if (!(AbstractC5868k.m23669a(str, "scc (b)(d)") ? true : AbstractC5868k.m23669a(str, "sr"))) {
                                                                                                        if (AbstractC5868k.m23669a(str, "scn")) {
                                                                                                            return "Sicilian";
                                                                                                        }
                                                                                                        if (AbstractC5868k.m23669a(str, "sco")) {
                                                                                                            return "Scots";
                                                                                                        }
                                                                                                        if (!AbstractC5868k.m23669a(str, "scr (b)(d)")) {
                                                                                                            if (AbstractC5868k.m23669a(str, "sel")) {
                                                                                                                return "Selkup";
                                                                                                            }
                                                                                                            if (AbstractC5868k.m23669a(str, "sem (r)")) {
                                                                                                                return "Semitic (Other)";
                                                                                                            }
                                                                                                            if (AbstractC5868k.m23669a(str, "sga")) {
                                                                                                                return "Old Irish (to 900)";
                                                                                                            }
                                                                                                            if (AbstractC5868k.m23669a(str, "sgn (g)")) {
                                                                                                                return "Sign Languages";
                                                                                                            }
                                                                                                            if (AbstractC5868k.m23669a(str, "shn")) {
                                                                                                                return "Shan";
                                                                                                            }
                                                                                                            if (AbstractC5868k.m23669a(str, "sid")) {
                                                                                                                return "Sidamo";
                                                                                                            }
                                                                                                            if (AbstractC5868k.m23669a(str, "sin") ? true : AbstractC5868k.m23669a(str, "si")) {
                                                                                                                return "Sinhala";
                                                                                                            }
                                                                                                            if (AbstractC5868k.m23669a(str, "sio (g)")) {
                                                                                                                return "Siouan languages";
                                                                                                            }
                                                                                                            if (AbstractC5868k.m23669a(str, "sit (r)")) {
                                                                                                                return "Sino-Tibetan (Other)";
                                                                                                            }
                                                                                                            if (AbstractC5868k.m23669a(str, "sla (r)")) {
                                                                                                                return "Slavic (Other)";
                                                                                                            }
                                                                                                            str3 = "Slovak";
                                                                                                            if (!(AbstractC5868k.m23669a(str, "slk (t)") ? true : AbstractC5868k.m23669a(str, "sk")) && !AbstractC5868k.m23669a(str, "slo (b)")) {
                                                                                                                if (AbstractC5868k.m23669a(str, "slv") ? true : AbstractC5868k.m23669a(str, "sl")) {
                                                                                                                    return "Slovenian";
                                                                                                                }
                                                                                                                if (AbstractC5868k.m23669a(str, "sma")) {
                                                                                                                    return "Southern Sami";
                                                                                                                }
                                                                                                                if (AbstractC5868k.m23669a(str, "sme") ? true : AbstractC5868k.m23669a(str, "se")) {
                                                                                                                    return "Northern Sami";
                                                                                                                }
                                                                                                                if (AbstractC5868k.m23669a(str, "smi (r)")) {
                                                                                                                    return "Sami languages (Other)";
                                                                                                                }
                                                                                                                if (AbstractC5868k.m23669a(str, "smj")) {
                                                                                                                    return "Lule Sami";
                                                                                                                }
                                                                                                                if (AbstractC5868k.m23669a(str, "smn")) {
                                                                                                                    return "Inari Sami";
                                                                                                                }
                                                                                                                if (AbstractC5868k.m23669a(str, "smo") ? true : AbstractC5868k.m23669a(str, "sm")) {
                                                                                                                    return "Samoan";
                                                                                                                }
                                                                                                                if (AbstractC5868k.m23669a(str, "sms")) {
                                                                                                                    return "Skolt Sami";
                                                                                                                }
                                                                                                                if (AbstractC5868k.m23669a(str, "sna") ? true : AbstractC5868k.m23669a(str, "sn")) {
                                                                                                                    return "Shona";
                                                                                                                }
                                                                                                                if (AbstractC5868k.m23669a(str, "snd") ? true : AbstractC5868k.m23669a(str, "sd")) {
                                                                                                                    return "Sindhi";
                                                                                                                }
                                                                                                                if (AbstractC5868k.m23669a(str, "snk")) {
                                                                                                                    return "Soninke";
                                                                                                                }
                                                                                                                if (AbstractC5868k.m23669a(str, "sog")) {
                                                                                                                    return "Sogdian";
                                                                                                                }
                                                                                                                if (AbstractC5868k.m23669a(str, "som") ? true : AbstractC5868k.m23669a(str, "so")) {
                                                                                                                    return "Somali";
                                                                                                                }
                                                                                                                if (AbstractC5868k.m23669a(str, "son (c)")) {
                                                                                                                    return "Songhai languages";
                                                                                                                }
                                                                                                                if (AbstractC5868k.m23669a(str, "sot") ? true : AbstractC5868k.m23669a(str, "st")) {
                                                                                                                    return "Southern Sotho";
                                                                                                                }
                                                                                                                if (!AbstractC5868k.m23669a(str, "sqi (t)")) {
                                                                                                                    if (AbstractC5868k.m23669a(str, "srd") ? true : AbstractC5868k.m23669a(str, "sc")) {
                                                                                                                        return "Sardinian";
                                                                                                                    }
                                                                                                                    if (AbstractC5868k.m23669a(str, "srn")) {
                                                                                                                        return "Sranan Tongo";
                                                                                                                    }
                                                                                                                    if (!AbstractC5868k.m23669a(str, "srp (t)")) {
                                                                                                                        if (AbstractC5868k.m23669a(str, "srr")) {
                                                                                                                            return "Serer";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "ssa (r)")) {
                                                                                                                            return "Nilo-Saharan (Other)";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "ssw") ? true : AbstractC5868k.m23669a(str, "ss")) {
                                                                                                                            return "Swati";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "suk")) {
                                                                                                                            return "Sukuma";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "sun") ? true : AbstractC5868k.m23669a(str, "su")) {
                                                                                                                            return "Sundanese";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "sus")) {
                                                                                                                            return "Susu";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "sux")) {
                                                                                                                            return "Sumerian";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "swa") ? true : AbstractC5868k.m23669a(str, "sw")) {
                                                                                                                            return "Swahili (macrolanguage)";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "swe") ? true : AbstractC5868k.m23669a(str, "sv")) {
                                                                                                                            return "Swedish";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "syc")) {
                                                                                                                            return "Classical Syriac";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "syr")) {
                                                                                                                            return "Syriac";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "tah") ? true : AbstractC5868k.m23669a(str, "ty")) {
                                                                                                                            return "Tahitian";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "tai (r)")) {
                                                                                                                            return "Tai (Other)";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "tam") ? true : AbstractC5868k.m23669a(str, "ta")) {
                                                                                                                            return "Tamil";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "tat") ? true : AbstractC5868k.m23669a(str, "tt")) {
                                                                                                                            return "Tatar";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "tel") ? true : AbstractC5868k.m23669a(str, "te")) {
                                                                                                                            return "Telugu";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "tem")) {
                                                                                                                            return "Timne";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "ter")) {
                                                                                                                            return "Tereno";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "tet")) {
                                                                                                                            return "Tetum";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "tgk") ? true : AbstractC5868k.m23669a(str, "tg")) {
                                                                                                                            return "Tajik";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "tgl") ? true : AbstractC5868k.m23669a(str, "tl")) {
                                                                                                                            return "Tagalog";
                                                                                                                        }
                                                                                                                        if (AbstractC5868k.m23669a(str, "tha") ? true : AbstractC5868k.m23669a(str, "th")) {
                                                                                                                            return "Thai";
                                                                                                                        }
                                                                                                                        if (!AbstractC5868k.m23669a(str, "tib (b)")) {
                                                                                                                            if (AbstractC5868k.m23669a(str, "tig")) {
                                                                                                                                return "Tigre";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "tir") ? true : AbstractC5868k.m23669a(str, "ti")) {
                                                                                                                                return "Tigrinya";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "tiv")) {
                                                                                                                                return "Tiv";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "tkl")) {
                                                                                                                                return "Tokelau";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "tlh")) {
                                                                                                                                return "Klingon";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "tli")) {
                                                                                                                                return "Tlingit";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "tmh")) {
                                                                                                                                return "Tamashek";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "tog")) {
                                                                                                                                return "Tonga (Nyasa)";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "ton") ? true : AbstractC5868k.m23669a(str, "to")) {
                                                                                                                                return "Tonga (Tonga Islands)";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "tpi")) {
                                                                                                                                return "Tok Pisin";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "tsi")) {
                                                                                                                                return "Tsimshian";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "tsn") ? true : AbstractC5868k.m23669a(str, "tn")) {
                                                                                                                                return "Tswana";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "tso") ? true : AbstractC5868k.m23669a(str, "ts")) {
                                                                                                                                return "Tsonga";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "tuk") ? true : AbstractC5868k.m23669a(str, "tk")) {
                                                                                                                                return "Turkmen";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "tum")) {
                                                                                                                                return "Tumbuka";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "tup (g)")) {
                                                                                                                                return "Tupi languages";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "tur") ? true : AbstractC5868k.m23669a(str, "tr")) {
                                                                                                                                return "Turkish";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "tut (r)")) {
                                                                                                                                return "Altaic (Other)";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "tvl")) {
                                                                                                                                return "Tuvalu";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "twi") ? true : AbstractC5868k.m23669a(str, "tw")) {
                                                                                                                                return "Twi";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "tyv")) {
                                                                                                                                return "Tuvinian";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "udm")) {
                                                                                                                                return "Udmurt";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "uga")) {
                                                                                                                                return "Ugaritic";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "uig") ? true : AbstractC5868k.m23669a(str, "ug")) {
                                                                                                                                return "Uighur";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "ukr") ? true : AbstractC5868k.m23669a(str, "uk")) {
                                                                                                                                return "Ukrainian";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "umb")) {
                                                                                                                                return "Umbundu";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "und")) {
                                                                                                                                return "Undetermined";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "urd") ? true : AbstractC5868k.m23669a(str, "ur")) {
                                                                                                                                return "Urdu";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "uzb") ? true : AbstractC5868k.m23669a(str, "uz")) {
                                                                                                                                return "Uzbek";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "vai")) {
                                                                                                                                return "Vai";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "ven") ? true : AbstractC5868k.m23669a(str, "ve")) {
                                                                                                                                return "Venda";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "vie") ? true : AbstractC5868k.m23669a(str, "vi")) {
                                                                                                                                return "Vietnamese";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "vol") ? true : AbstractC5868k.m23669a(str, "vo")) {
                                                                                                                                return "Volapük";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "vot")) {
                                                                                                                                return "Votic";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "wak (g)")) {
                                                                                                                                return "Wakashan languages";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "wal")) {
                                                                                                                                return "Wolaytta";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "war")) {
                                                                                                                                return "Waray (Philippines)";
                                                                                                                            }
                                                                                                                            if (AbstractC5868k.m23669a(str, "was")) {
                                                                                                                                return "Washo";
                                                                                                                            }
                                                                                                                            if (!AbstractC5868k.m23669a(str, "wel (b)")) {
                                                                                                                                if (AbstractC5868k.m23669a(str, "wen (g)")) {
                                                                                                                                    return "Sorbian languages";
                                                                                                                                }
                                                                                                                                if (AbstractC5868k.m23669a(str, "wln") ? true : AbstractC5868k.m23669a(str, "wa")) {
                                                                                                                                    return "Walloon";
                                                                                                                                }
                                                                                                                                if (AbstractC5868k.m23669a(str, "wol") ? true : AbstractC5868k.m23669a(str, "wo")) {
                                                                                                                                    return "Wolof";
                                                                                                                                }
                                                                                                                                if (AbstractC5868k.m23669a(str, "xal")) {
                                                                                                                                    return "Kalmyk";
                                                                                                                                }
                                                                                                                                if (AbstractC5868k.m23669a(str, "xho") ? true : AbstractC5868k.m23669a(str, "xh")) {
                                                                                                                                    return "Xhosa";
                                                                                                                                }
                                                                                                                                if (AbstractC5868k.m23669a(str, "yao")) {
                                                                                                                                    return "Yao";
                                                                                                                                }
                                                                                                                                if (AbstractC5868k.m23669a(str, "yap")) {
                                                                                                                                    return "Yapese";
                                                                                                                                }
                                                                                                                                if (AbstractC5868k.m23669a(str, "yid") ? true : AbstractC5868k.m23669a(str, "yi")) {
                                                                                                                                    return "Yiddish";
                                                                                                                                }
                                                                                                                                if (AbstractC5868k.m23669a(str, "yor") ? true : AbstractC5868k.m23669a(str, "yo")) {
                                                                                                                                    return "Yoruba";
                                                                                                                                }
                                                                                                                                if (AbstractC5868k.m23669a(str, "ypk (g)")) {
                                                                                                                                    return "Yupik languages";
                                                                                                                                }
                                                                                                                                if (AbstractC5868k.m23669a(str, "zap")) {
                                                                                                                                    return "Zapotec";
                                                                                                                                }
                                                                                                                                if (AbstractC5868k.m23669a(str, "zbl")) {
                                                                                                                                    return "Blissymbols";
                                                                                                                                }
                                                                                                                                if (AbstractC5868k.m23669a(str, "zen")) {
                                                                                                                                    return "Zenaga";
                                                                                                                                }
                                                                                                                                if (AbstractC5868k.m23669a(str, "zha") ? true : AbstractC5868k.m23669a(str, "za")) {
                                                                                                                                    return "Zhuang";
                                                                                                                                }
                                                                                                                                if (AbstractC5868k.m23669a(str, "znd (c)")) {
                                                                                                                                    return "Zande languages";
                                                                                                                                }
                                                                                                                                if (AbstractC5868k.m23669a(str, "zul") ? true : AbstractC5868k.m23669a(str, "zu")) {
                                                                                                                                    return "Zulu";
                                                                                                                                }
                                                                                                                                if (AbstractC5868k.m23669a(str, "zun")) {
                                                                                                                                    return "Zuni";
                                                                                                                                }
                                                                                                                                if (AbstractC5868k.m23669a(str, "zxx")) {
                                                                                                                                    return "No linguistic content";
                                                                                                                                }
                                                                                                                                int i10 = R$string.language_null;
                                                                                                                                if (!AbstractC5868k.m23669a(str, m24887a.getString(i10))) {
                                                                                                                                    return str;
                                                                                                                                }
                                                                                                                                String string15 = m24887a.getString(i10);
                                                                                                                                AbstractC5868k.m23673e(string15, "mContext.getString(R.string.language_null)");
                                                                                                                                return string15;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    return "Malay (macrolanguage)";
                                                                }
                                                                return "Maori";
                                                            }
                                                            return "Macedonian";
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        return str5;
                                    }
                                }
                            }
                            return "Welsh";
                        }
                        return str4;
                    }
                    return str3;
                }
                return "Tibetan";
            }
            return str2;
        }
        return "Albanian";
    }

    public final void putAduioRecord(String str, DefinitionBean definitionBean) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        AbstractC5868k.m23674f(definitionBean, "definitionBean");
        SourceBean selectSource = definitionBean.getSelectSource();
        if (selectSource.getSelectAudio() < 0 || selectSource.getSelectAudio() >= selectSource.getAudioInfoList().size()) {
            return;
        }
        putAduioRecord(str, definitionBean.getSelectSourceIndex(), selectSource.getAudioInfoList().get(selectSource.getSelectAudio()).getLanguage(), selectSource.getSelectAudio());
    }

    public final void putRealAudioMap(String str, String str2) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        AbstractC5868k.m23674f(str2, "realAudio");
        recordRealAudioMap.put(str, str2);
    }

    public final void putSelectSubtitle(String str, int i10, String str2) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        AbstractC5868k.m23674f(str2, "subTitleLanguage");
        if (!TextUtils.isEmpty(str) && i10 >= 0) {
            HashMap<String, RecordSubtitleInfoBean> hashMap = recordSubTitleMap;
            RecordSubtitleInfoBean recordSubtitleInfoBean = hashMap.get(str);
            if (recordSubtitleInfoBean == null) {
                hashMap.put(str, new RecordSubtitleInfoBean(i10, str2));
            } else {
                recordSubtitleInfoBean.setSubtitleIndex(i10);
                recordSubtitleInfoBean.setSubTitleLanguage(str2);
            }
        }
    }

    public final void putSubtitleColor(String str, int i10) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        recordSubtitleColorMap.put(str, Integer.valueOf(i10));
    }

    public final void putSubtitleSize(String str, int i10) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        recordSubtitleSizeMap.put(str, Integer.valueOf(i10));
    }

    public final void putSubtitleSwitch(String str, boolean z10) {
        AbstractC5868k.m23674f(str, CacheEntity.KEY);
        recordSubtitleSwitch.put(str, Boolean.valueOf(z10));
    }

    public final void setSUBTITLE_SWITCH(boolean z10) {
        SUBTITLE_SWITCH = z10;
    }

    private final void putAduioRecord(String str, int i10, String str2, int i11) {
        if (TextUtils.isEmpty(str) || i10 < 0 || i11 < 0) {
            return;
        }
        HashMap<String, RecordAudioInfoBean> hashMap = recordAudioMap;
        RecordAudioInfoBean recordAudioInfoBean = hashMap.get(str);
        if (recordAudioInfoBean == null) {
            hashMap.put(str, new RecordAudioInfoBean(i10, str2, i11));
            return;
        }
        recordAudioInfoBean.setSourceIndex(i10);
        recordAudioInfoBean.setAudio(str2);
        recordAudioInfoBean.setAudioIndex(i11);
    }
}
