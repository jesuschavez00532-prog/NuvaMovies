package org.model.notice;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import cf.AbstractC1516b;

/* loaded from: classes3.dex */
public class NoticeManagerNew {
    private static final String TAG = "NoticeManagerNew";
    private static volatile NoticeManagerNew mIstance;
    private String mChannelName;
    private TextView mChannelTextView;
    private String mLastChannelNotice;
    private String mLastSysNotice;
    private NoteCallback mNoteCallback;
    private volatile NoteService mNoteService;
    private TextView mSysTextView;
    private int tvHideMode = 4;
    private HideTextViewTask mSysTextHideTask = new HideTextViewTask();
    private HideTextViewTask mChannelHideTask = new HideTextViewTask();
    private Handler mHandler = new Handler(Looper.getMainLooper()) { // from class: org.model.notice.NoticeManagerNew.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (NoticeManagerNew.this.mNoteService == null) {
                return;
            }
            int i10 = message.what;
            if (i10 != 64) {
                if (i10 == 96 && NoticeManagerNew.this.mNoteService.hasSystemNote() && NoticeManagerNew.this.mNoteService.hasChannelNote()) {
                    NoteInner channelNote = NoticeManagerNew.this.mNoteService.getChannelNote();
                    String info = channelNote.getInfo();
                    long duration = channelNote.getDuration();
                    if (!TextUtils.isEmpty(info) && !info.equals(NoticeManagerNew.this.mLastChannelNotice)) {
                        NoticeManagerNew noticeManagerNew = NoticeManagerNew.this;
                        if (noticeManagerNew.setViewVisibility(noticeManagerNew.mChannelTextView, 0)) {
                            NoticeManagerNew.this.mChannelTextView.setText(info);
                            NoticeManagerNew noticeManagerNew2 = NoticeManagerNew.this;
                            noticeManagerNew2.sendHideMesg(noticeManagerNew2.mChannelTextView, NoticeManagerNew.this.mChannelHideTask, duration);
                            NoticeManagerNew.this.mLastChannelNotice = info;
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (NoticeManagerNew.this.mNoteService.hasSystemNote()) {
                NoteInfo systemNote = NoticeManagerNew.this.mNoteService.getSystemNote();
                String info2 = systemNote.getInfo();
                AbstractC1516b.m7037a(NoticeManagerNew.TAG, "systemNote:  " + info2 + "  time : " + systemNote.getDuration() + "   mLastSysNotice : " + NoticeManagerNew.this.mLastSysNotice);
                if (!TextUtils.isEmpty(info2) && !info2.equals(NoticeManagerNew.this.mLastSysNotice)) {
                    long duration2 = systemNote.getDuration();
                    NoticeManagerNew noticeManagerNew3 = NoticeManagerNew.this;
                    if (noticeManagerNew3.setViewVisibility(noticeManagerNew3.mSysTextView, 0)) {
                        if (NoticeManagerNew.this.mNoteCallback != null) {
                            NoticeManagerNew.this.mNoteCallback.changeHomePagePosition(0);
                            NoticeManagerNew.this.mSysTextHideTask.setHideNoteCallback(new HideTextViewTask.HideNoteCallback() { // from class: org.model.notice.NoticeManagerNew.1.1
                                @Override // org.model.notice.NoticeManagerNew.HideTextViewTask.HideNoteCallback
                                public void hideNote(int i11) {
                                    NoticeManagerNew.this.mNoteCallback.changeHomePagePosition(i11);
                                }
                            });
                        }
                        NoticeManagerNew.this.mSysTextView.setText(info2);
                        NoticeManagerNew noticeManagerNew4 = NoticeManagerNew.this;
                        noticeManagerNew4.sendHideMesg(noticeManagerNew4.mSysTextView, NoticeManagerNew.this.mSysTextHideTask, duration2);
                        NoticeManagerNew.this.mLastSysNotice = info2;
                    } else {
                        NoticeManagerNew noticeManagerNew5 = NoticeManagerNew.this;
                        if (noticeManagerNew5.setViewVisibility(noticeManagerNew5.mChannelTextView, 0)) {
                            NoticeManagerNew.this.mChannelTextView.setText(info2);
                            NoticeManagerNew noticeManagerNew6 = NoticeManagerNew.this;
                            noticeManagerNew6.sendHideMesg(noticeManagerNew6.mChannelTextView, NoticeManagerNew.this.mChannelHideTask, duration2);
                            NoticeManagerNew.this.mLastSysNotice = info2;
                        }
                    }
                }
                if (NoticeManagerNew.this.mNoteService.hasChannelNote()) {
                    NoteInner channelNote2 = NoticeManagerNew.this.mNoteService.getChannelNote();
                    String info3 = channelNote2.getInfo();
                    long duration3 = channelNote2.getDuration();
                    AbstractC1516b.m7037a(NoticeManagerNew.TAG, "channel :  info  " + info3 + "  time : " + duration3 + "   mLastChannelNotice : " + NoticeManagerNew.this.mLastChannelNotice);
                    if (!TextUtils.isEmpty(info3) && !info3.equals(NoticeManagerNew.this.mLastChannelNotice)) {
                        NoticeManagerNew noticeManagerNew7 = NoticeManagerNew.this;
                        if (noticeManagerNew7.setViewVisibility(noticeManagerNew7.mChannelTextView, 0)) {
                            NoticeManagerNew.this.mChannelTextView.setText(info3);
                            NoticeManagerNew noticeManagerNew8 = NoticeManagerNew.this;
                            noticeManagerNew8.sendHideMesg(noticeManagerNew8.mChannelTextView, NoticeManagerNew.this.mChannelHideTask, duration3);
                            NoticeManagerNew.this.mLastChannelNotice = info3;
                        }
                    }
                }
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class HideTextViewTask implements Runnable {
        private HideNoteCallback mHideNoteCallback;
        private TextView mTv;
        private int mTvHideMode;

        /* loaded from: classes3.dex */
        public interface HideNoteCallback {
            void hideNote(int i10);
        }

        HideTextViewTask() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextView textView = this.mTv;
            if (textView != null) {
                textView.setVisibility(this.mTvHideMode);
                HideNoteCallback hideNoteCallback = this.mHideNoteCallback;
                if (hideNoteCallback != null) {
                    hideNoteCallback.hideNote(this.mTvHideMode);
                }
            }
        }

        public void setHideNoteCallback(HideNoteCallback hideNoteCallback) {
            this.mHideNoteCallback = hideNoteCallback;
        }

        void setTextView(TextView textView, int i10) {
            this.mTv = textView;
            this.mTvHideMode = i10;
        }
    }

    /* loaded from: classes3.dex */
    public interface NoteCallback {
        void changeHomePagePosition(int i10);
    }

    private NoticeManagerNew() {
    }

    public static NoticeManagerNew getInstance() {
        if (mIstance == null) {
            synchronized (NoticeManagerNew.class) {
                if (mIstance == null) {
                    mIstance = new NoticeManagerNew();
                }
            }
        }
        return mIstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendHideMesg(TextView textView, HideTextViewTask hideTextViewTask, long j10) {
        hideTextViewTask.setTextView(textView, this.tvHideMode);
        this.mHandler.removeCallbacks(hideTextViewTask);
        if (j10 > 0) {
            this.mHandler.postDelayed(hideTextViewTask, j10 * 1000);
            AbstractC1516b.m7037a("NoticeTextView", "sendHideMesg:");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean setViewVisibility(View view, int i10) {
        if (view != null) {
            AbstractC1516b.m7037a("NoticeTextView", "visibility:" + i10);
            view.setVisibility(i10);
        }
        if (view != null) {
            return true;
        }
        return false;
    }

    public void closeNotice() {
        if (this.mNoteService != null) {
            this.mNoteService.NoticeClose();
            this.mNoteService = null;
            this.mHandler.removeCallbacksAndMessages(null);
            this.mSysTextView = null;
            this.mChannelTextView = null;
            this.mLastSysNotice = "";
            this.mLastChannelNotice = "";
            this.mChannelName = "";
        }
    }

    public NoticeManagerNew setChannelName(String str) {
        this.mChannelName = str;
        this.mLastChannelNotice = "";
        setViewVisibility(this.mChannelTextView, this.tvHideMode);
        if (this.mNoteService != null) {
            this.mNoteService.setChannelName(this.mChannelName);
            this.mNoteService.CheckChannelNote(this.mChannelName);
            this.mHandler.sendEmptyMessage(96);
        }
        return this;
    }

    public NoticeManagerNew setChannelTextView(TextView textView, String str) {
        this.mChannelTextView = textView;
        setChannelName(str);
        return this;
    }

    public void setNoteCallback(NoteCallback noteCallback) {
        this.mNoteCallback = noteCallback;
    }

    public NoticeManagerNew setSysTextView(TextView textView) {
        this.mSysTextView = textView;
        return this;
    }

    public NoticeManagerNew setTvHidMode(int i10) {
        if (i10 != 8 && i10 != 0 && i10 != 4) {
            AbstractC1516b.m7037a(TAG, "tvHideMode user default !!");
        } else {
            this.tvHideMode = i10;
        }
        return this;
    }

    public NoticeManagerNew start(String str, int i10, String str2, String str3, String str4) {
        if (this.mNoteService == null) {
            synchronized (this) {
                if (this.mNoteService == null) {
                    this.mNoteService = new NoteService(-1, str, i10, str2, str3, str4, this.mHandler);
                    this.mNoteService.setChannelName(this.mChannelName);
                }
            }
        }
        return this;
    }
}
