package com.efs.sdk.base.core.cache;

import android.text.TextUtils;
import com.efs.sdk.base.Constants;
import com.efs.sdk.base.core.config.remote.C1698b;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.model.LogDto;
import com.efs.sdk.base.core.p050a.C1666a;
import com.efs.sdk.base.core.p055d.C1704b;
import com.efs.sdk.base.core.p055d.C1708f;
import com.efs.sdk.base.core.util.C1713a;
import com.efs.sdk.base.core.util.FileUtil;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.ProcessUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* loaded from: classes.dex */
public class CacheManager {

    /* renamed from: a */
    private boolean f7071a;

    /* renamed from: b */
    private boolean f7072b;

    /* renamed from: c */
    private C1690a f7073c;

    /* renamed from: d */
    private C1688a f7074d;

    /* renamed from: e */
    private List<File> f7075e;

    /* renamed from: com.efs.sdk.base.core.cache.CacheManager$a */
    /* loaded from: classes.dex */
    public static class C1688a implements Comparator<File> {
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(File file, File file2) {
            long lastModified = file.lastModified() - file2.lastModified();
            if (lastModified > 0) {
                return 1;
            }
            if (lastModified == 0) {
                return 0;
            }
            return -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.efs.sdk.base.core.cache.CacheManager$b */
    /* loaded from: classes.dex */
    public static class C1689b {

        /* renamed from: a */
        private static final CacheManager f7076a = new CacheManager(0);
    }

    /* synthetic */ CacheManager(byte b10) {
        this();
    }

    /* renamed from: a */
    private void m7652a() {
        String[] list;
        LogDto createLogDtoByName;
        File m7746d = C1713a.m7746d(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (!m7746d.exists() || !m7746d.isDirectory() || (list = m7746d.list()) == null || list.length <= 0) {
            return;
        }
        for (String str : list) {
            if (!ProcessUtil.isProcessExist(ControllerCenter.getGlobalEnvStruct().mAppContext, str)) {
                File file = new File(m7746d, str);
                List<File> listFiles = FileUtil.listFiles(file);
                if (!listFiles.isEmpty()) {
                    for (File file2 : listFiles) {
                        if (m7654a(file2.getName())) {
                            m7653a(file2);
                        } else {
                            String name = file2.getName();
                            if (!TextUtils.isEmpty(name) && name.startsWith(Constants.LOG_TYPE_CODELOGPERF)) {
                                createLogDtoByName = FileUtil.createCodeLogDtoByName(name);
                            } else {
                                createLogDtoByName = FileUtil.createLogDtoByName(name);
                            }
                            if (createLogDtoByName == null) {
                                onChangeDtoError(file2);
                            } else {
                                InterfaceC1693d m7657a = this.f7073c.m7657a(createLogDtoByName.getLogProtocol());
                                if (m7657a == null) {
                                    onChangeDtoError(file2);
                                } else {
                                    m7657a.mo7661a(file2);
                                }
                            }
                        }
                    }
                }
                FileUtil.delete(file);
            }
        }
    }

    /* renamed from: b */
    private void m7655b() {
        String[] list;
        LogDto createLogDtoByName;
        File m7747e = C1713a.m7747e(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (m7747e.exists() && m7747e.isDirectory() && (list = m7747e.list()) != null && list.length > 0) {
            for (String str : list) {
                if (!ProcessUtil.isProcessExist(ControllerCenter.getGlobalEnvStruct().mAppContext, str)) {
                    File file = new File(m7747e, str);
                    List<File> listFiles = FileUtil.listFiles(file);
                    if (!listFiles.isEmpty()) {
                        for (File file2 : listFiles) {
                            if (m7654a(file2.getName())) {
                                m7653a(file2);
                            } else {
                                String name = file2.getName();
                                if (!TextUtils.isEmpty(name) && name.startsWith(Constants.LOG_TYPE_CODELOGPERF)) {
                                    createLogDtoByName = FileUtil.createCodeLogDtoByName(name);
                                } else {
                                    createLogDtoByName = FileUtil.createLogDtoByName(name);
                                }
                                if (createLogDtoByName == null) {
                                    onChangeDtoError(file2);
                                } else {
                                    InterfaceC1693d m7657a = this.f7073c.m7657a(createLogDtoByName.getLogProtocol());
                                    if (m7657a == null) {
                                        onChangeDtoError(file2);
                                    } else {
                                        m7657a.mo7661a(file2);
                                    }
                                }
                            }
                        }
                    }
                    FileUtil.delete(file);
                }
            }
        }
    }

    public static CacheManager getInstance() {
        return C1689b.f7076a;
    }

    public LogDto changeLogDto(File file) {
        LogDto createLogDtoByName;
        try {
            if (!file.exists()) {
                return null;
            }
            if (m7654a(file.getName())) {
                m7653a(file);
                return null;
            }
            String name = file.getName();
            if (!TextUtils.isEmpty(name) && name.startsWith(Constants.LOG_TYPE_CODELOGPERF)) {
                createLogDtoByName = FileUtil.createCodeLogDtoByName(name);
            } else {
                createLogDtoByName = FileUtil.createLogDtoByName(name);
            }
            if (createLogDtoByName == null) {
                onChangeDtoError(file);
                return null;
            }
            InterfaceC1693d m7657a = this.f7073c.m7657a(createLogDtoByName.getLogProtocol());
            if (m7657a == null) {
                onChangeDtoError(file);
                return null;
            }
            if (!m7657a.mo7663a(file, createLogDtoByName)) {
                onChangeDtoError(file);
                return null;
            }
            return createLogDtoByName;
        } catch (Throwable th) {
            Log.m7740w("efs.cache", th);
            onChangeDtoError(file);
            return null;
        }
    }

    public void flushImmediately(byte b10, String str) {
        InterfaceC1693d m7657a = this.f7073c.m7657a(b10);
        if (m7657a == null) {
            return;
        }
        m7657a.mo7662a(str);
    }

    public List<File> getCodeLogList() {
        return this.f7075e;
    }

    public List<File> getFileList(int i10, IFileFilter iFileFilter) {
        C1708f c1708f;
        m7652a();
        File m7750h = C1713a.m7750h(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
        if (!m7750h.exists()) {
            return Collections.emptyList();
        }
        List<File> listFiles = FileUtil.listFiles(m7750h);
        if (this.f7072b) {
            c1708f = C1708f.a.f7163a;
            int size = listFiles.size();
            if (c1708f.f7160b != null && ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
                C1704b c1704b = new C1704b("efs_core", "log_lag", c1708f.f7159a.f7153c);
                c1704b.put("cnt", Integer.valueOf(size));
                c1708f.f7160b.send(c1704b);
            }
            this.f7072b = false;
        }
        Collections.sort(listFiles, this.f7074d);
        ArrayList arrayList = new ArrayList(i10);
        for (int size2 = listFiles.size() - 1; size2 >= 0 && arrayList.size() < i10; size2--) {
            File file = listFiles.get(size2);
            if (file.exists() && (iFileFilter == null || !iFileFilter.filter(file))) {
                arrayList.add(file);
            }
        }
        return arrayList;
    }

    public List<File> getFileListCodeLog(int i10, IFileFilter iFileFilter) {
        m7655b();
        List<File> list = this.f7075e;
        if (list == null || list.isEmpty()) {
            File m7751i = C1713a.m7751i(ControllerCenter.getGlobalEnvStruct().mAppContext, ControllerCenter.getGlobalEnvStruct().getAppid());
            if (!m7751i.exists()) {
                return Collections.emptyList();
            }
            List<File> listFiles = FileUtil.listFiles(m7751i);
            this.f7075e = listFiles;
            Collections.sort(listFiles, this.f7074d);
        }
        ArrayList arrayList = new ArrayList(i10);
        for (int size = this.f7075e.size() - 1; size >= 0 && arrayList.size() < i10; size--) {
            File file = this.f7075e.get(size);
            if (file.exists()) {
                if (iFileFilter != null && iFileFilter.filter(file)) {
                    Log.m7730i("efs.cache", "[--xx] filter file is " + file.getName());
                } else {
                    Log.m7730i("efs.cache", "[-->>] add file is " + file.getName());
                    arrayList.add(file);
                }
            }
        }
        return arrayList;
    }

    public List<LogDto> getLogDto(int i10, IFileFilter iFileFilter) {
        m7652a();
        List<File> fileList = getFileList(i10, iFileFilter);
        ArrayList arrayList = new ArrayList(i10);
        for (File file : fileList) {
            LogDto changeLogDto = changeLogDto(file);
            if (changeLogDto == null) {
                Log.m7738w("efs.cache", "file upload error, name is " + file.getName());
            } else {
                arrayList.add(changeLogDto);
            }
        }
        return arrayList;
    }

    public List<LogDto> getLogDtoCodeLog(int i10, IFileFilter iFileFilter) {
        m7655b();
        List<File> fileListCodeLog = getFileListCodeLog(i10, iFileFilter);
        ArrayList arrayList = new ArrayList(i10);
        for (File file : fileListCodeLog) {
            LogDto changeLogDto = changeLogDto(file);
            if (changeLogDto == null) {
                Log.m7738w("efs.cache", "file upload error, name is " + file.getName());
            } else {
                arrayList.add(changeLogDto);
            }
        }
        return arrayList;
    }

    public void onChangeDtoError(File file) {
        C1708f c1708f;
        if (!file.getName().startsWith("wa_")) {
            c1708f = C1708f.a.f7163a;
            c1708f.f7161c.f7155c.incrementAndGet();
        }
        FileUtil.delete(file);
    }

    public void put(LogDto logDto) {
        InterfaceC1693d m7657a;
        C1708f c1708f;
        if (!"wa".equals(logDto.getLogType()) && !Constants.LOG_TYPE_CODELOGPERF.equals(logDto.getLogType()) && !HandlerC1691b.m7658a().f7078a) {
            if (!this.f7071a) {
                c1708f = C1708f.a.f7163a;
                int i10 = C1698b.m7679a().f7118d.mConfigVersion;
                if (c1708f.f7160b != null || ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
                    c1708f.f7160b.send(c1708f.m7714a("disk_limit", i10));
                }
            }
            this.f7071a = true;
            return;
        }
        if (Constants.LOG_TYPE_CODELOGPERF.equals(logDto.getLogType()) && !HandlerC1691b.m7658a().f7079b) {
            return;
        }
        if ((logDto.getLogBodyType() == 0 && (logDto.getData() == null || logDto.getData().length == 0)) || (m7657a = this.f7073c.m7657a(logDto.getLogProtocol())) == null) {
            return;
        }
        m7657a.mo7660a(logDto);
    }

    private CacheManager() {
        this.f7071a = false;
        this.f7072b = true;
        this.f7073c = new C1690a();
        this.f7074d = new C1688a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static boolean m7654a(String str) {
        long parseLong;
        try {
            if (str.startsWith(Constants.LOG_TYPE_CODELOGPERF)) {
                parseLong = Long.parseLong(str.substring(str.lastIndexOf("_") + 1));
            } else {
                parseLong = Long.parseLong(str.substring(str.lastIndexOf("_") + 1));
            }
            C1666a.m7610a();
            return Math.abs(C1666a.m7613b() - parseLong) >= 604800000;
        } catch (Throwable unused) {
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m7653a(File file) {
        C1708f c1708f;
        StringBuilder sb2 = new StringBuilder("file is expire: ");
        sb2.append(file.getName());
        sb2.append(", now is ");
        C1666a.m7610a();
        sb2.append(C1666a.m7613b());
        Log.m7730i("efs.cache", sb2.toString());
        if (!file.getName().startsWith("wa_")) {
            c1708f = C1708f.a.f7163a;
            c1708f.f7161c.m7712d();
        }
        FileUtil.delete(file);
    }
}
