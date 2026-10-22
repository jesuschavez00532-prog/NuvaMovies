package p099d8;

import cc.C1455h;
import com.google.gson.stream.JsonReader;
import com.request.bean.ChannelEpg;
import java.io.File;
import java.io.FileReader;

/* renamed from: d8.b */
/* loaded from: classes2.dex */
public class C3965b {
    /* renamed from: a */
    private ChannelEpg m16822a(JsonReader jsonReader) {
        ChannelEpg m16814e = C3964a.m16814e();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("channelCode")) {
                if (!nextName.equals("programList")) {
                    jsonReader.skipValue();
                } else {
                    m16823b(jsonReader, m16814e);
                }
            } else {
                m16814e.setChannelCode(jsonReader.nextString());
            }
        }
        jsonReader.endObject();
        return m16814e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        switch(r4) {
            case 0: goto L40;
            case 1: goto L39;
            case 2: goto L38;
            case 3: goto L37;
            default: goto L42;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x005d, code lost:
    
        r1.setProgramName(r6.nextString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        r1.setRemark(r6.nextString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006d, code lost:
    
        r1.setEndTime(r6.nextString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0075, code lost:
    
        r1.setStartTime(r6.nextString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0059, code lost:
    
        r6.skipValue();
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void m16823b(com.google.gson.stream.JsonReader r6, com.request.bean.ChannelEpg r7) {
        /*
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.beginArray()
        L8:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L84
            r6.beginObject()
            com.request.bean.EpgProgram r1 = p099d8.C3966c.m16826e()
        L15:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L7d
            java.lang.String r2 = r6.nextName()
            r2.hashCode()
            int r3 = r2.hashCode()
            r4 = -1
            switch(r3) {
                case -2129294769: goto L4c;
                case -1607243192: goto L41;
                case -934624384: goto L36;
                case 1010379567: goto L2b;
                default: goto L2a;
            }
        L2a:
            goto L56
        L2b:
            java.lang.String r3 = "programName"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L34
            goto L56
        L34:
            r4 = 3
            goto L56
        L36:
            java.lang.String r3 = "remark"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L3f
            goto L56
        L3f:
            r4 = 2
            goto L56
        L41:
            java.lang.String r3 = "endTime"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L4a
            goto L56
        L4a:
            r4 = 1
            goto L56
        L4c:
            java.lang.String r3 = "startTime"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L55
            goto L56
        L55:
            r4 = 0
        L56:
            switch(r4) {
                case 0: goto L75;
                case 1: goto L6d;
                case 2: goto L65;
                case 3: goto L5d;
                default: goto L59;
            }
        L59:
            r6.skipValue()
            goto L15
        L5d:
            java.lang.String r2 = r6.nextString()
            r1.setProgramName(r2)
            goto L15
        L65:
            java.lang.String r2 = r6.nextString()
            r1.setRemark(r2)
            goto L15
        L6d:
            java.lang.String r2 = r6.nextString()
            r1.setEndTime(r2)
            goto L15
        L75:
            java.lang.String r2 = r6.nextString()
            r1.setStartTime(r2)
            goto L15
        L7d:
            r0.add(r1)
            r6.endObject()
            goto L8
        L84:
            r6.endArray()
            r7.setProgramList(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p099d8.C3965b.m16823b(com.google.gson.stream.JsonReader, com.request.bean.ChannelEpg):void");
    }

    /* renamed from: c */
    public void m16824c(File file, InterfaceC3967d interfaceC3967d) {
        JsonReader jsonReader;
        JsonReader jsonReader2 = null;
        try {
            try {
                jsonReader = new JsonReader(new FileReader(file));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Exception e10) {
            e = e10;
        }
        try {
            jsonReader.beginArray();
            while (jsonReader.hasNext()) {
                ChannelEpg m16822a = m16822a(jsonReader);
                if (m16822a != null && interfaceC3967d != null) {
                    interfaceC3967d.mo6578a(m16822a);
                }
            }
            jsonReader.endArray();
            C1455h.f5573a.m6759a(jsonReader);
        } catch (Exception e11) {
            e = e11;
            jsonReader2 = jsonReader;
            e.printStackTrace();
            C1455h.f5573a.m6759a(jsonReader2);
        } catch (Throwable th2) {
            th = th2;
            jsonReader2 = jsonReader;
            C1455h.f5573a.m6759a(jsonReader2);
            throw th;
        }
    }
}
