package com.umeng.commonsdk.internal.utils;

import android.os.Build;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;

/* renamed from: com.umeng.commonsdk.internal.utils.e */
/* loaded from: classes3.dex */
public class C3467e {

    /* renamed from: com.umeng.commonsdk.internal.utils.e$a */
    /* loaded from: classes3.dex */
    public enum a {
        check_su_binary(new String[]{"/system/xbin/which", "su"});


        /* renamed from: b */
        String[] f15339b;

        a(String[] strArr) {
            this.f15339b = strArr;
        }
    }

    /* renamed from: a */
    public ArrayList m14676a(a aVar) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT > 28) {
            return arrayList;
        }
        try {
            Process exec = Runtime.getRuntime().exec(aVar.f15339b);
            new BufferedWriter(new OutputStreamWriter(exec.getOutputStream()));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
            while (true) {
                try {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    arrayList.add(readLine);
                } catch (Exception unused) {
                }
            }
            return arrayList;
        } catch (Exception unused2) {
            return null;
        }
    }
}
