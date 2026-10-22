package com.umeng.logsdk;

import android.text.TextUtils;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.core.cache.CacheManager;
import com.efs.sdk.base.core.cache.IFileFilter;
import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.core.util.FileUtil;
import com.efs.sdk.base.core.util.Log;
import java.io.File;
import java.util.List;

/* loaded from: classes3.dex */
public class UploadFileFilterCodeLog implements IFileFilter {

    /* renamed from: a */
    private ULogConfigManager f15737a;

    /* renamed from: b */
    private C3528b f15738b;

    /* renamed from: c */
    private String f15739c;

    /* renamed from: e */
    private String f15741e;

    /* renamed from: g */
    private long f15743g;

    /* renamed from: h */
    private long f15744h;

    /* renamed from: d */
    private int f15740d = -1;

    /* renamed from: f */
    private int f15742f = -1;

    /* renamed from: a */
    private void m15153a() {
        Log.m7730i("UploadFileFilterCodeLog", "reset task.");
        this.f15738b = null;
        this.f15739c = null;
        this.f15740d = -1;
        this.f15741e = null;
        this.f15742f = -1;
        this.f15743g = 0L;
        this.f15744h = 0L;
    }

    @Override // com.efs.sdk.base.core.cache.IFileFilter
    public boolean filter(File file) {
        StringBuilder sb2;
        String sb3;
        StringBuilder sb4;
        List<C3528b> taskList;
        if (this.f15738b == null) {
            ULogConfigManager uLogConfigManager = ULogManager.getULogConfigManager();
            this.f15737a = uLogConfigManager;
            if (uLogConfigManager != null && (taskList = uLogConfigManager.getTaskList()) != null && !taskList.isEmpty()) {
                int i10 = 0;
                while (true) {
                    if (i10 >= taskList.size()) {
                        break;
                    }
                    C3528b c3528b = taskList.get(i10);
                    this.f15738b = c3528b;
                    if (c3528b != null) {
                        int i11 = c3528b.f15763b;
                        this.f15740d = i11;
                        if (i11 == 0) {
                            this.f15739c = c3528b.f15762a;
                            this.f15741e = c3528b.f15765d;
                            this.f15742f = c3528b.f15764c;
                            this.f15743g = c3528b.f15766e;
                            this.f15744h = c3528b.f15767f;
                            break;
                        }
                        m15153a();
                    }
                    i10++;
                }
            }
        }
        if (this.f15738b != null && this.f15740d == 0) {
            Log.m7730i("UploadFileFilterCodeLog", this.f15739c + ", " + this.f15741e + ", " + this.f15742f + ", " + this.f15743g + ", " + this.f15744h);
            String name = file.getName();
            LogDto createLogDtoByName = (TextUtils.isEmpty(name) || !name.startsWith(Constants.LOG_TYPE_CODELOGPERF)) ? FileUtil.createLogDtoByName(name) : FileUtil.createCodeLogDtoByName(name);
            if (createLogDtoByName == null) {
                CacheManager.getInstance().onChangeDtoError(file);
                return true;
            }
            long beginTime = createLogDtoByName.getBeginTime();
            createLogDtoByName.getEndTime();
            String did = createLogDtoByName.getDid();
            String uid = createLogDtoByName.getUid();
            if (beginTime >= this.f15743g && beginTime <= this.f15744h) {
                Log.m7730i("UploadFileFilterCodeLog", "task target type is " + this.f15742f);
                int i12 = this.f15742f;
                if (i12 == 1) {
                    if (TextUtils.isEmpty(this.f15741e) || TextUtils.isEmpty(did) || !this.f15741e.equals(did)) {
                        sb3 = "taskTarget is " + this.f15741e + ", did is " + did;
                        Log.m7730i("UploadFileFilterCodeLog", sb3);
                    } else {
                        sb4 = new StringBuilder("task is ");
                    }
                } else if (i12 == 0) {
                    if (TextUtils.isEmpty(this.f15741e) || TextUtils.isEmpty(uid) || !this.f15741e.equals(uid)) {
                        sb2 = new StringBuilder("taskTarget is ");
                        sb2.append(this.f15741e);
                        sb2.append(", uid is ");
                        sb2.append(uid);
                    } else {
                        sb4 = new StringBuilder("task is ");
                    }
                }
                sb4.append(this.f15739c);
                sb4.append(", target is ");
                sb4.append(this.f15741e);
                sb4.append(", file time is ");
                sb4.append(beginTime);
                Log.m7730i("UploadFileFilterCodeLog", sb4.toString());
                return false;
            }
            sb2 = new StringBuilder("time is ");
            sb2.append(beginTime >= this.f15743g);
            sb2.append(", is ");
            sb2.append(beginTime <= this.f15744h);
            sb3 = sb2.toString();
            Log.m7730i("UploadFileFilterCodeLog", sb3);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0033, code lost:
    
        if (r0 != null) goto L10;
     */
    @Override // com.efs.sdk.base.core.cache.IFileFilter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void finish() {
        /*
            r6 = this;
            java.lang.String r0 = "clear task."
            java.lang.String r1 = "UploadFileFilterCodeLog"
            com.efs.sdk.base.core.util.Log.m7730i(r1, r0)
            long r2 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "taskEndTime is "
            r0.<init>(r4)
            long r4 = r6.f15744h
            r0.append(r4)
            java.lang.String r4 = ", current time is "
            r0.append(r4)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.efs.sdk.base.core.util.Log.m7730i(r1, r0)
            long r4 = r6.f15744h
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 <= 0) goto L36
            java.lang.String r0 = "future task. not remove."
            com.efs.sdk.base.core.util.Log.m7730i(r1, r0)
            com.umeng.logsdk.ULogConfigManager r0 = r6.f15737a
            if (r0 == 0) goto L46
            goto L41
        L36:
            com.umeng.logsdk.ULogConfigManager r0 = r6.f15737a
            if (r0 == 0) goto L46
            java.lang.String r1 = r6.f15739c
            r0.reMoveTaskFroSP(r1)
            com.umeng.logsdk.ULogConfigManager r0 = r6.f15737a
        L41:
            com.umeng.logsdk.b r1 = r6.f15738b
            r0.removeTask(r1)
        L46:
            r6.m15153a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.logsdk.UploadFileFilterCodeLog.finish():void");
    }

    @Override // com.efs.sdk.base.core.cache.IFileFilter
    public boolean hasTask() {
        List<C3528b> taskList;
        ULogConfigManager uLogConfigManager = ULogManager.getULogConfigManager();
        if (uLogConfigManager == null || (taskList = uLogConfigManager.getTaskList()) == null || taskList.isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < taskList.size(); i10++) {
            C3528b c3528b = taskList.get(i10);
            if (c3528b != null && c3528b.f15763b == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.efs.sdk.base.core.cache.IFileFilter
    public void finish(boolean z10, boolean z11) {
    }
}
