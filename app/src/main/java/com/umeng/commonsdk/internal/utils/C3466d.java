package com.umeng.commonsdk.internal.utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStream;

/* renamed from: com.umeng.commonsdk.internal.utils.d */
/* loaded from: classes3.dex */
public class C3466d {

    /* renamed from: com.umeng.commonsdk.internal.utils.d$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        public String f15325a;

        /* renamed from: b */
        public String f15326b;

        /* renamed from: c */
        public int f15327c;

        /* renamed from: d */
        public String f15328d;

        /* renamed from: e */
        public String f15329e;

        /* renamed from: f */
        public String f15330f;

        /* renamed from: g */
        public String f15331g;

        /* renamed from: h */
        public String f15332h;

        /* renamed from: i */
        public String f15333i;

        /* renamed from: j */
        public String f15334j;

        /* renamed from: k */
        public String f15335k;

        /* renamed from: l */
        public String f15336l;
    }

    /* JADX WARN: Removed duplicated region for block: B:114:0x0144 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0134 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x012d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.umeng.commonsdk.internal.utils.C3466d.a m14672a() {
        /*
            Method dump skipped, instructions count: 331
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.internal.utils.C3466d.m14672a():com.umeng.commonsdk.internal.utils.d$a");
    }

    /* renamed from: b */
    public static String m14673b() {
        String str = "";
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
        } catch (Exception unused) {
        }
        return str.trim();
    }

    /* renamed from: c */
    public static String m14674c() {
        String str = "";
        try {
            InputStream inputStream = new ProcessBuilder("/system/bin/cat", "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq").start().getInputStream();
            byte[] bArr = new byte[24];
            while (inputStream.read(bArr) != -1) {
                str = str + new String(bArr);
            }
            inputStream.close();
        } catch (Exception unused) {
        }
        return str.trim();
    }

    /* renamed from: d */
    public static String m14675d() {
        BufferedReader bufferedReader;
        Throwable th;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"));
            try {
                String trim = bufferedReader.readLine().trim();
                try {
                    bufferedReader.close();
                    return trim;
                } catch (Throwable unused) {
                    return trim;
                }
            } catch (Exception unused2) {
                bufferedReader2 = bufferedReader;
                if (bufferedReader2 != null) {
                    try {
                        bufferedReader2.close();
                    } catch (Throwable unused3) {
                    }
                }
                return "";
            } catch (Throwable th2) {
                th = th2;
                if (bufferedReader != null) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
        } catch (Throwable th3) {
            bufferedReader = null;
            th = th3;
        }
    }
}
