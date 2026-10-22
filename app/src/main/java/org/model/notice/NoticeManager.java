package org.model.notice;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.widget.TextView;
import cf.AbstractC1516b;

/* loaded from: classes3.dex */
public class NoticeManager {
    public static final String TAG = "NoticeManager";
    private TextView mLiveTextView;
    private NoticeLinstener mNoticeListener;
    NoteService notice;
    private long time;
    private TextView tv_notice;
    private int tvHideMode = 4;
    Handler mHandler = new Handler() { // from class: org.model.notice.NoticeManager.1
        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 64) {
                if (i10 == 80) {
                    if (NoticeManager.this.tv_notice != null) {
                        NoticeManager.this.tv_notice.setVisibility(NoticeManager.this.tvHideMode);
                    }
                    if (NoticeManager.this.mLiveTextView != null) {
                        NoticeManager.this.mLiveTextView.setVisibility(NoticeManager.this.tvHideMode);
                        return;
                    }
                    return;
                }
                return;
            }
            NoteService noteService = NoticeManager.this.notice;
            if (noteService != null && noteService.hasSystemNote()) {
                if (NoticeManager.this.tv_notice != null) {
                    NoticeManager.this.tv_notice.setVisibility(0);
                }
                if (NoticeManager.this.mLiveTextView != null) {
                    NoticeManager.this.mLiveTextView.setVisibility(0);
                }
                if (NoticeManager.this.notice.hasChannelNote()) {
                    NoteInner channelNote = NoticeManager.this.notice.getChannelNote();
                    if (channelNote != null && !channelNote.getInfo().equals("")) {
                        if (NoticeManager.this.tv_notice != null) {
                            NoticeManager.this.tv_notice.setText(channelNote.getInfo());
                        }
                        if (NoticeManager.this.mLiveTextView != null) {
                            NoticeManager.this.mLiveTextView.setText(channelNote.getInfo());
                        }
                        NoticeManager.this.time = channelNote.getDuration();
                    } else {
                        if (NoticeManager.this.tv_notice != null) {
                            NoticeManager.this.tv_notice.setVisibility(NoticeManager.this.tvHideMode);
                        }
                        if (NoticeManager.this.mLiveTextView != null) {
                            NoticeManager.this.mLiveTextView.setVisibility(NoticeManager.this.tvHideMode);
                        }
                    }
                } else {
                    if (NoticeManager.this.mLiveTextView != null) {
                        NoticeManager.this.mLiveTextView.setVisibility(NoticeManager.this.tvHideMode);
                    }
                    NoteService noteService2 = NoticeManager.this.notice;
                    if (noteService2 != null && noteService2.getSystemNote() != null && NoticeManager.this.notice.getSystemNote().getInfo() != null && !NoticeManager.this.notice.getSystemNote().getInfo().equals("")) {
                        AbstractC1516b.m7037a(NoticeManager.TAG, "显示公告");
                        if (NoticeManager.this.tv_notice != null) {
                            NoticeManager.this.tv_notice.setText(NoticeManager.this.notice.getSystemNote().getInfo());
                            NoticeManager noticeManager = NoticeManager.this;
                            noticeManager.time = noticeManager.notice.getSystemNote().getDuration();
                        } else if (NoticeManager.this.notice.getSystemNote().getType() != null && !NoticeManager.this.notice.getSystemNote().getType().equals("") && NoticeManager.this.mNoticeListener != null) {
                            NoticeManager.this.mNoticeListener.notice(NoticeManager.this.notice.getSystemNote().getInfo(), NoticeManager.this.notice.getSystemNote().getDuration(), NoticeManager.this.notice.getSystemNote().getType());
                        }
                    } else {
                        AbstractC1516b.m7037a(NoticeManager.TAG, "不显示公告");
                        if (NoticeManager.this.tv_notice != null) {
                            NoticeManager.this.tv_notice.setVisibility(NoticeManager.this.tvHideMode);
                        }
                    }
                }
                if (NoticeManager.this.time > 0) {
                    NoticeManager noticeManager2 = NoticeManager.this;
                    noticeManager2.mHandler.removeCallbacks(noticeManager2.runnable);
                    NoticeManager noticeManager3 = NoticeManager.this;
                    noticeManager3.mHandler.postDelayed(noticeManager3.runnable, noticeManager3.time * 1000);
                    return;
                }
                return;
            }
            if (NoticeManager.this.tv_notice != null) {
                NoticeManager.this.tv_notice.setVisibility(NoticeManager.this.tvHideMode);
            }
            if (NoticeManager.this.mLiveTextView != null) {
                NoticeManager.this.mLiveTextView.setVisibility(NoticeManager.this.tvHideMode);
            }
        }
    };
    Runnable runnable = new Runnable() { // from class: org.model.notice.NoticeManager.2
        @Override // java.lang.Runnable
        public void run() {
            try {
                NoticeManager.this.mHandler.sendMessage(NoticeManager.this.mHandler.obtainMessage(80));
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    };

    /* loaded from: classes3.dex */
    public interface NoticeLinstener {
        void notice(String str, long j10, String str2);
    }

    public NoticeManager(Context context, TextView textView, String str, int i10, TextView textView2, String str2) {
        this.notice = null;
        this.tv_notice = textView;
        this.mLiveTextView = textView2;
        this.notice = new NoteService(-1, str, i10, str2, "", "", this.mHandler);
    }

    public void CheckChannelNotice(String str) {
        NoteService noteService = this.notice;
        if (noteService != null) {
            noteService.CheckChannelNote(str);
        }
    }

    public void CloseNotice() {
        NoteService noteService = this.notice;
        if (noteService != null) {
            noteService.NoticeClose();
            this.notice = null;
            this.mHandler = null;
        }
    }

    public void addNoticeLinstener(NoticeLinstener noticeLinstener) {
        this.mNoticeListener = noticeLinstener;
    }

    public void setTvHidMode(int i10) {
        if (i10 != 8 && i10 != 0 && i10 != 4) {
            AbstractC1516b.m7037a(TAG, "tvHideMode user default !!");
        } else {
            this.tvHideMode = i10;
        }
    }
}
