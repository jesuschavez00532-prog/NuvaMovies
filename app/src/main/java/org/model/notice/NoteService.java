package org.model.notice;

import android.os.Handler;
import android.text.TextUtils;
import cf.AbstractC1516b;
import com.dcs.bean.DomainInfo;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import p179ib.AbstractC4926c;
import p363v2.C7197a;

/* loaded from: classes3.dex */
public class NoteService {
    public static final int MSG_HIDE_NOTICE = 80;
    public static final int MSG_SHOW_CHANNEL_NOTICE = 96;
    public static final int MSG_SHOW_NOTICE = 64;
    public static DomainInfo NOTICE = null;
    public static String NOTICE_SERVER = null;
    public static String NOTICE_SERVER_MAIN = null;
    public static String NOTICE_SERVER_SECOND = null;
    public static final String NOTICE_URL = "http://%s/notice/api/get_notice?pkg=%s&v=%s&sn=%s&userId=%s";
    public static final String NOTICE_URL_EN = "http://%s/notice/api/get_notice?pkg=%s&v=%s&language=en";
    public static final String TEST_SERVER = "192.168.1.16:7000";
    public static Timer mTimer;
    private int mAppVerCode;
    private String mChannelName;
    private String mDefaultLanguage;
    private Handler mHandler;
    public int mLoopTime;
    private String mPackageName;
    private String mSn;
    private String mUserId;
    public final String TAG = "NoteService";
    private NoteInfo noteInfo = new NoteInfo();
    private NoteInner CurChannelNotice = null;
    private boolean isChangeServer = true;

    /* loaded from: classes3.dex */
    public interface OnNoteInfoDataListener {
        void OnNoteInfoDataReceived(NoteInfo noteInfo);
    }

    public NoteService(int i10, String str, int i11, String str2, String str3, String str4, Handler handler) {
        this.mLoopTime = 20;
        this.mHandler = null;
        this.mPackageName = str;
        this.mAppVerCode = i11;
        this.mSn = str2;
        this.mUserId = str3;
        this.mDefaultLanguage = str4;
        DomainInfo m27845b = C7197a.f26917a.m27845b(AbstractC4926c.m20240g().first.toString(), AbstractC4926c.m20240g().second.toString(), "key_notice");
        NOTICE = m27845b;
        NOTICE_SERVER_MAIN = m27845b.getFirst();
        NOTICE_SERVER_SECOND = NOTICE.getSecond();
        NOTICE_SERVER = NOTICE_SERVER_MAIN;
        this.mHandler = handler;
        if (i10 > 0) {
            this.mLoopTime = i10;
        }
        mTimer = new Timer();
        mTimer.schedule(new TimerTask() { // from class: org.model.notice.NoteService.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                NoteService noteService = NoteService.this;
                noteService.setRequsetUrl(noteService.mPackageName, NoteService.this.mAppVerCode, NoteService.this.mSn, NoteService.this.mUserId);
            }
        }, 0L, this.mLoopTime * 60 * 1000);
    }

    private void downloadNoteInfo(String str) {
    }

    private void executeInfo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRequsetUrl(String str, int i10, String str2, String str3) {
        String str4;
        String language = Locale.getDefault().getLanguage();
        if (language == null || language.isEmpty()) {
            language = this.mDefaultLanguage;
        }
        if (!TextUtils.isEmpty(language)) {
            str4 = "http://%s/notice/api/get_notice?pkg=%s&v=%s&sn=%s&userId=%s&language=" + language;
        } else {
            str4 = null;
        }
        String format = String.format(Locale.US, str4, NOTICE_SERVER, str, Integer.valueOf(i10), str2, str3);
        AbstractC1516b.m7037a("NoteService", "url: " + format);
        downloadNoteInfo(format);
    }

    public void CheckChannelNote(String str) {
        NoteInfo noteInfo;
        List<NoteInner> inner;
        if (!TextUtils.isEmpty(str) && (noteInfo = this.noteInfo) != null && (inner = noteInfo.getInner()) != null) {
            for (int i10 = 0; i10 < inner.size(); i10++) {
                List<String> channels = inner.get(i10).getChannels();
                if (channels != null && channels.size() > 0) {
                    String[] strArr = new String[channels.size()];
                    for (int i11 = 0; i11 < channels.size(); i11++) {
                        strArr[i11] = channels.get(i11);
                    }
                    Arrays.sort(strArr);
                    if (Arrays.binarySearch(strArr, str) >= 0) {
                        this.CurChannelNotice = inner.get(i10);
                    } else {
                        this.CurChannelNotice = null;
                    }
                }
            }
        }
    }

    public void NoticeClose() {
        Timer timer = mTimer;
        if (timer != null) {
            timer.cancel();
            mTimer = null;
        }
        this.noteInfo = null;
        this.CurChannelNotice = null;
    }

    public NoteInner getChannelNote() {
        return this.CurChannelNotice;
    }

    public NoteInfo getSystemNote() {
        return this.noteInfo;
    }

    public boolean hasChannelNote() {
        if (this.CurChannelNotice != null) {
            return true;
        }
        return false;
    }

    public boolean hasSystemNote() {
        return false;
    }

    public void setChannelName(String str) {
        this.mChannelName = str;
    }
}
