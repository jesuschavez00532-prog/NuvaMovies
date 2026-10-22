package com.umeng.commonsdk.statistics.proto;

import com.umeng.analytics.pro.AbstractC3366dg;
import com.umeng.analytics.pro.AbstractC3376dq;
import com.umeng.analytics.pro.AbstractC3377dr;
import com.umeng.analytics.pro.C3325bt;
import com.umeng.analytics.pro.C3337ce;
import com.umeng.analytics.pro.C3346cn;
import com.umeng.analytics.pro.C3352ct;
import com.umeng.analytics.pro.C3353cu;
import com.umeng.analytics.pro.C3357cy;
import com.umeng.analytics.pro.C3360da;
import com.umeng.analytics.pro.C3361db;
import com.umeng.analytics.pro.C3367dh;
import com.umeng.analytics.pro.C3369dj;
import com.umeng.analytics.pro.C3371dl;
import com.umeng.analytics.pro.C3372dm;
import com.umeng.analytics.pro.C3378ds;
import com.umeng.analytics.pro.InterfaceC3340ch;
import com.umeng.analytics.pro.InterfaceC3347co;
import com.umeng.analytics.pro.InterfaceC3374do;
import com.umeng.analytics.pro.InterfaceC3375dp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes3.dex */
public class Response implements InterfaceC3340ch<Response, EnumC3511e>, Serializable, Cloneable {
    private static final int __RESP_CODE_ISSET_ID = 0;
    public static final Map<EnumC3511e, C3352ct> metaDataMap;
    private static final Map<Class<? extends InterfaceC3374do>, InterfaceC3375dp> schemes;
    private static final long serialVersionUID = -4549277923241195391L;
    private byte __isset_bitfield;
    public C3515d imprint;
    public String msg;
    private EnumC3511e[] optionals;
    public int resp_code;
    private static final C3371dl STRUCT_DESC = new C3371dl("Response");
    private static final C3361db RESP_CODE_FIELD_DESC = new C3361db("resp_code", (byte) 8, 1);
    private static final C3361db MSG_FIELD_DESC = new C3361db("msg", (byte) 11, 2);
    private static final C3361db IMPRINT_FIELD_DESC = new C3361db(C3325bt.f14179X, (byte) 12, 3);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$a */
    /* loaded from: classes3.dex */
    public static class C3507a extends AbstractC3376dq<Response> {
        private C3507a() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo13973b(AbstractC3366dg abstractC3366dg, Response response) {
            abstractC3366dg.mo14160j();
            while (true) {
                C3361db mo14162l = abstractC3366dg.mo14162l();
                byte b10 = mo14162l.f14486b;
                if (b10 == 0) {
                    break;
                }
                short s10 = mo14162l.f14487c;
                if (s10 != 1) {
                    if (s10 != 2) {
                        if (s10 != 3) {
                            C3369dj.m14213a(abstractC3366dg, b10);
                        } else if (b10 == 12) {
                            C3515d c3515d = new C3515d();
                            response.imprint = c3515d;
                            c3515d.read(abstractC3366dg);
                            response.setImprintIsSet(true);
                        } else {
                            C3369dj.m14213a(abstractC3366dg, b10);
                        }
                    } else if (b10 == 11) {
                        response.msg = abstractC3366dg.mo14176z();
                        response.setMsgIsSet(true);
                    } else {
                        C3369dj.m14213a(abstractC3366dg, b10);
                    }
                } else if (b10 == 8) {
                    response.resp_code = abstractC3366dg.mo14173w();
                    response.setResp_codeIsSet(true);
                } else {
                    C3369dj.m14213a(abstractC3366dg, b10);
                }
                abstractC3366dg.mo14163m();
            }
            abstractC3366dg.mo14161k();
            if (response.isSetResp_code()) {
                response.validate();
                return;
            }
            throw new C3367dh("Required field 'resp_code' was not found in serialized data! Struct: " + toString());
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13971a(AbstractC3366dg abstractC3366dg, Response response) {
            response.validate();
            abstractC3366dg.mo14144a(Response.STRUCT_DESC);
            abstractC3366dg.mo14139a(Response.RESP_CODE_FIELD_DESC);
            abstractC3366dg.mo14137a(response.resp_code);
            abstractC3366dg.mo14151c();
            if (response.msg != null && response.isSetMsg()) {
                abstractC3366dg.mo14139a(Response.MSG_FIELD_DESC);
                abstractC3366dg.mo14145a(response.msg);
                abstractC3366dg.mo14151c();
            }
            if (response.imprint != null && response.isSetImprint()) {
                abstractC3366dg.mo14139a(Response.IMPRINT_FIELD_DESC);
                response.imprint.write(abstractC3366dg);
                abstractC3366dg.mo14151c();
            }
            abstractC3366dg.mo14153d();
            abstractC3366dg.mo14150b();
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$b */
    /* loaded from: classes3.dex */
    private static class C3508b implements InterfaceC3375dp {
        private C3508b() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3375dp
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3507a mo13975b() {
            return new C3507a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$c */
    /* loaded from: classes3.dex */
    public static class C3509c extends AbstractC3377dr<Response> {
        private C3509c() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo13971a(AbstractC3366dg abstractC3366dg, Response response) {
            C3372dm c3372dm = (C3372dm) abstractC3366dg;
            c3372dm.mo14137a(response.resp_code);
            BitSet bitSet = new BitSet();
            if (response.isSetMsg()) {
                bitSet.set(0);
            }
            if (response.isSetImprint()) {
                bitSet.set(1);
            }
            c3372dm.m14217a(bitSet, 2);
            if (response.isSetMsg()) {
                c3372dm.mo14145a(response.msg);
            }
            if (response.isSetImprint()) {
                response.imprint.write(c3372dm);
            }
        }

        @Override // com.umeng.analytics.pro.InterfaceC3374do
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo13973b(AbstractC3366dg abstractC3366dg, Response response) {
            C3372dm c3372dm = (C3372dm) abstractC3366dg;
            response.resp_code = c3372dm.mo14173w();
            response.setResp_codeIsSet(true);
            BitSet m14218b = c3372dm.m14218b(2);
            if (m14218b.get(0)) {
                response.msg = c3372dm.mo14176z();
                response.setMsgIsSet(true);
            }
            if (m14218b.get(1)) {
                C3515d c3515d = new C3515d();
                response.imprint = c3515d;
                c3515d.read(c3372dm);
                response.setImprintIsSet(true);
            }
        }
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$d */
    /* loaded from: classes3.dex */
    private static class C3510d implements InterfaceC3375dp {
        private C3510d() {
        }

        @Override // com.umeng.analytics.pro.InterfaceC3375dp
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C3509c mo13975b() {
            return new C3509c();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        schemes = hashMap;
        hashMap.put(AbstractC3376dq.class, new C3508b());
        hashMap.put(AbstractC3377dr.class, new C3510d());
        EnumMap enumMap = new EnumMap(EnumC3511e.class);
        enumMap.put((EnumMap) EnumC3511e.RESP_CODE, (EnumC3511e) new C3352ct("resp_code", (byte) 1, new C3353cu((byte) 8)));
        enumMap.put((EnumMap) EnumC3511e.MSG, (EnumC3511e) new C3352ct("msg", (byte) 2, new C3353cu((byte) 11)));
        enumMap.put((EnumMap) EnumC3511e.IMPRINT, (EnumC3511e) new C3352ct(C3325bt.f14179X, (byte) 2, new C3357cy((byte) 12, C3515d.class)));
        Map<EnumC3511e, C3352ct> unmodifiableMap = Collections.unmodifiableMap(enumMap);
        metaDataMap = unmodifiableMap;
        C3352ct.m14126a(Response.class, unmodifiableMap);
    }

    public Response() {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new EnumC3511e[]{EnumC3511e.MSG, EnumC3511e.IMPRINT};
    }

    private void readObject(ObjectInputStream objectInputStream) {
        try {
            this.__isset_bitfield = (byte) 0;
            read(new C3360da(new C3378ds(objectInputStream)));
        } catch (C3346cn e10) {
            throw new IOException(e10.getMessage());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        try {
            write(new C3360da(new C3378ds(objectOutputStream)));
        } catch (C3346cn e10) {
            throw new IOException(e10.getMessage());
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void clear() {
        setResp_codeIsSet(false);
        this.resp_code = 0;
        this.msg = null;
        this.imprint = null;
    }

    public C3515d getImprint() {
        return this.imprint;
    }

    public String getMsg() {
        return this.msg;
    }

    public int getResp_code() {
        return this.resp_code;
    }

    public boolean isSetImprint() {
        if (this.imprint != null) {
            return true;
        }
        return false;
    }

    public boolean isSetMsg() {
        if (this.msg != null) {
            return true;
        }
        return false;
    }

    public boolean isSetResp_code() {
        return C3337ce.m14040a(this.__isset_bitfield, 0);
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void read(AbstractC3366dg abstractC3366dg) {
        schemes.get(abstractC3366dg.mo14209D()).mo13975b().mo13973b(abstractC3366dg, this);
    }

    public Response setImprint(C3515d c3515d) {
        this.imprint = c3515d;
        return this;
    }

    public void setImprintIsSet(boolean z10) {
        if (!z10) {
            this.imprint = null;
        }
    }

    public Response setMsg(String str) {
        this.msg = str;
        return this;
    }

    public void setMsgIsSet(boolean z10) {
        if (!z10) {
            this.msg = null;
        }
    }

    public Response setResp_code(int i10) {
        this.resp_code = i10;
        setResp_codeIsSet(true);
        return this;
    }

    public void setResp_codeIsSet(boolean z10) {
        this.__isset_bitfield = C3337ce.m14032a(this.__isset_bitfield, 0, z10);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Response(");
        sb2.append("resp_code:");
        sb2.append(this.resp_code);
        if (isSetMsg()) {
            sb2.append(", ");
            sb2.append("msg:");
            String str = this.msg;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
        }
        if (isSetImprint()) {
            sb2.append(", ");
            sb2.append("imprint:");
            C3515d c3515d = this.imprint;
            if (c3515d == null) {
                sb2.append("null");
            } else {
                sb2.append(c3515d);
            }
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void unsetImprint() {
        this.imprint = null;
    }

    public void unsetMsg() {
        this.msg = null;
    }

    public void unsetResp_code() {
        this.__isset_bitfield = C3337ce.m14044b(this.__isset_bitfield, 0);
    }

    public void validate() {
        C3515d c3515d = this.imprint;
        if (c3515d != null) {
            c3515d.m15063l();
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public void write(AbstractC3366dg abstractC3366dg) {
        schemes.get(abstractC3366dg.mo14209D()).mo13975b().mo13971a(abstractC3366dg, this);
    }

    /* renamed from: com.umeng.commonsdk.statistics.proto.Response$e */
    /* loaded from: classes3.dex */
    public enum EnumC3511e implements InterfaceC3347co {
        RESP_CODE(1, "resp_code"),
        MSG(2, "msg"),
        IMPRINT(3, C3325bt.f14179X);


        /* renamed from: d */
        private static final Map<String, EnumC3511e> f15503d = new HashMap();

        /* renamed from: e */
        private final short f15505e;

        /* renamed from: f */
        private final String f15506f;

        static {
            Iterator it = EnumSet.allOf(EnumC3511e.class).iterator();
            while (it.hasNext()) {
                EnumC3511e enumC3511e = (EnumC3511e) it.next();
                f15503d.put(enumC3511e.mo13983b(), enumC3511e);
            }
        }

        EnumC3511e(short s10, String str) {
            this.f15505e = s10;
            this.f15506f = str;
        }

        /* renamed from: a */
        public static EnumC3511e m14925a(int i10) {
            if (i10 == 1) {
                return RESP_CODE;
            }
            if (i10 == 2) {
                return MSG;
            }
            if (i10 != 3) {
                return null;
            }
            return IMPRINT;
        }

        /* renamed from: b */
        public static EnumC3511e m14927b(int i10) {
            EnumC3511e m14925a = m14925a(i10);
            if (m14925a != null) {
                return m14925a;
            }
            throw new IllegalArgumentException("Field " + i10 + " doesn't exist!");
        }

        @Override // com.umeng.analytics.pro.InterfaceC3347co
        /* renamed from: b */
        public String mo13983b() {
            return this.f15506f;
        }

        /* renamed from: a */
        public static EnumC3511e m14926a(String str) {
            return f15503d.get(str);
        }

        @Override // com.umeng.analytics.pro.InterfaceC3347co
        /* renamed from: a */
        public short mo13982a() {
            return this.f15505e;
        }
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public InterfaceC3340ch<Response, EnumC3511e> deepCopy() {
        return new Response(this);
    }

    @Override // com.umeng.analytics.pro.InterfaceC3340ch
    public EnumC3511e fieldForId(int i10) {
        return EnumC3511e.m14925a(i10);
    }

    public Response(int i10) {
        this();
        this.resp_code = i10;
        setResp_codeIsSet(true);
    }

    public Response(Response response) {
        this.__isset_bitfield = (byte) 0;
        this.optionals = new EnumC3511e[]{EnumC3511e.MSG, EnumC3511e.IMPRINT};
        this.__isset_bitfield = response.__isset_bitfield;
        this.resp_code = response.resp_code;
        if (response.isSetMsg()) {
            this.msg = response.msg;
        }
        if (response.isSetImprint()) {
            this.imprint = new C3515d(response.imprint);
        }
    }
}
