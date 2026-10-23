package ae;

import android.support.v4.media.session.AbstractC0272b;
import anet.channel.request.Request;
import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.HttpConstant;
import com.lzy.okgo.cookie.SerializableCookie;
import com.lzy.okgo.model.HttpHeaders;
import com.lzy.okgo.model.Progress;
import com.raizlabs.android.dbflow.sql.language.Operator;
import com.umeng.ccg.C3419c;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.SSLException;
import okhttp3.internal.http.StatusLine;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* renamed from: ae.a */
/* loaded from: classes3.dex */
public abstract class AbstractC0234a {

    /* renamed from: h */
    private static final Pattern f638h = Pattern.compile("([ |\t]*Content-Disposition[ |\t]*:)(.*)", 2);

    /* renamed from: i */
    private static final Pattern f639i = Pattern.compile("([ |\t]*content-type[ |\t]*:)(.*)", 2);

    /* renamed from: j */
    private static final Pattern f640j = Pattern.compile("[ |\t]*([a-zA-Z]*)[ |\t]*=[ |\t]*['|\"]([^\"^']*)['|\"]");

    /* renamed from: k */
    private static final Logger f641k = Logger.getLogger(AbstractC0234a.class.getName());

    /* renamed from: a */
    private final String f642a;

    /* renamed from: b */
    private final int f643b;

    /* renamed from: c */
    private volatile ServerSocket f644c;

    /* renamed from: d */
    private p f645d;

    /* renamed from: e */
    private Thread f646e;

    /* renamed from: f */
    protected b f647f;

    /* renamed from: g */
    private r f648g;

    /* renamed from: ae.a$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo846a(c cVar);

        /* renamed from: b */
        void mo847b(c cVar);
    }

    /* renamed from: ae.a$c */
    /* loaded from: classes3.dex */
    public class c implements Runnable {

        /* renamed from: a */
        private final InputStream f649a;

        /* renamed from: b */
        private final Socket f650b;

        public c(InputStream inputStream, Socket socket) {
            this.f649a = inputStream;
            this.f650b = socket;
        }

        @Override // java.lang.Runnable
        public void run() {
            OutputStream outputStream = null;
            try {
                try {
                    outputStream = this.f650b.getOutputStream();
                    j jVar = new j(AbstractC0234a.this.f648g.mo854a(), this.f649a, outputStream, this.f650b.getInetAddress());
                    while (!this.f650b.isClosed()) {
                        jVar.m861f();
                    }
                } catch (Exception e10) {
                    if ((!(e10 instanceof SocketException) || !"NanoHttpd Shutdown".equals(e10.getMessage())) && !(e10 instanceof SocketTimeoutException)) {
                        AbstractC0234a.f641k.log(Level.SEVERE, "Communication with the client broken, or an bug in the handler code", (Throwable) e10);
                    }
                }
            } finally {
                AbstractC0234a.m836o(outputStream);
                AbstractC0234a.m836o(this.f649a);
                AbstractC0234a.m836o(this.f650b);
                AbstractC0234a.this.f647f.mo847b(this);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: ae.a$d */
    /* loaded from: classes3.dex */
    public static class d {

        /* renamed from: e */
        private static final Pattern f652e = Pattern.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);

        /* renamed from: f */
        private static final Pattern f653f = Pattern.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

        /* renamed from: g */
        private static final Pattern f654g = Pattern.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);

        /* renamed from: a */
        private final String f655a;

        /* renamed from: b */
        private final String f656b;

        /* renamed from: c */
        private final String f657c;

        /* renamed from: d */
        private final String f658d;

        public d(String str) {
            this.f655a = str;
            if (str != null) {
                this.f656b = m848b(str, f652e, "", 1);
                this.f657c = m848b(str, f653f, null, 2);
            } else {
                this.f656b = "";
                this.f657c = Request.DEFAULT_CHARSET;
            }
            if ("multipart/form-data".equalsIgnoreCase(this.f656b)) {
                this.f658d = m848b(str, f654g, null, 2);
            } else {
                this.f658d = null;
            }
        }

        /* renamed from: b */
        private String m848b(String str, Pattern pattern, String str2, int i10) {
            Matcher matcher = pattern.matcher(str);
            if (matcher.find()) {
                return matcher.group(i10);
            }
            return str2;
        }

        /* renamed from: a */
        public String m849a() {
            return this.f655a;
        }

        /* renamed from: c */
        public String m850c() {
            String str = this.f657c;
            if (str == null) {
                return "US-ASCII";
            }
            return str;
        }

        /* renamed from: d */
        public d m851d() {
            if (this.f657c == null) {
                return new d(this.f655a + "; charset=UTF-8");
            }
            return this;
        }
    }

    /* renamed from: ae.a$e */
    /* loaded from: classes3.dex */
    public class e implements Iterable {

        /* renamed from: a */
        private final HashMap f659a = new HashMap();

        /* renamed from: b */
        private final ArrayList f660b = new ArrayList();

        public e(Map map) {
            String str = (String) map.get(SerializableCookie.COOKIE);
            if (str != null) {
                for (String str2 : str.split(";")) {
                    String[] split = str2.trim().split(Operator.Operation.EQUALS);
                    if (split.length == 2) {
                        this.f659a.put(split[0], split[1]);
                    }
                }
            }
        }

        /* renamed from: c */
        public void m852c(m mVar) {
            Iterator it = this.f660b.iterator();
            if (!it.hasNext()) {
                return;
            }
            AbstractC0272b.m941a(it.next());
            throw null;
        }

        @Override // java.lang.Iterable
        public Iterator iterator() {
            return this.f659a.keySet().iterator();
        }
    }

    /* renamed from: ae.a$f */
    /* loaded from: classes3.dex */
    public static class f implements b {

        /* renamed from: a */
        private long f662a;

        /* renamed from: b */
        private final List f663b = Collections.synchronizedList(new ArrayList());

        @Override // ae.AbstractC0234a.b
        /* renamed from: a */
        public void mo846a(c cVar) {
            this.f662a++;
            Thread thread = new Thread(cVar);
            thread.setDaemon(true);
            thread.setName("NanoHttpd Request Processor (#" + this.f662a + ")");
            this.f663b.add(cVar);
            thread.start();
        }

        @Override // ae.AbstractC0234a.b
        /* renamed from: b */
        public void mo847b(c cVar) {
            this.f663b.remove(cVar);
        }
    }

    /* renamed from: ae.a$g */
    /* loaded from: classes3.dex */
    public static class g implements p {
        @Override // ae.AbstractC0234a.p
        /* renamed from: a */
        public ServerSocket mo853a() {
            return new ServerSocket();
        }
    }

    /* renamed from: ae.a$h */
    /* loaded from: classes3.dex */
    public static class h implements q {

        /* renamed from: a */
        private final File f664a;

        /* renamed from: b */
        private final List f665b;

        public h() {
            File file = new File(System.getProperty("java.io.tmpdir"));
            this.f664a = file;
            if (!file.exists()) {
                file.mkdirs();
            }
            this.f665b = new ArrayList();
        }

        @Override // ae.AbstractC0234a.q
        public void clear() {
            Iterator it = this.f665b.iterator();
            while (it.hasNext()) {
                AbstractC0272b.m941a(it.next());
                try {
                    throw null;
                    break;
                } catch (Exception e10) {
                    AbstractC0234a.f641k.log(Level.WARNING, "could not delete file ", (Throwable) e10);
                }
            }
            this.f665b.clear();
        }
    }

    /* renamed from: ae.a$i */
    /* loaded from: classes3.dex */
    private class i implements r {
        private i() {
        }

        @Override // ae.AbstractC0234a.r
        /* renamed from: a */
        public q mo854a() {
            return new h();
        }
    }

    /* renamed from: ae.a$j */
    /* loaded from: classes3.dex */
    protected class j implements k {

        /* renamed from: a */
        private final q f667a;

        /* renamed from: b */
        private final OutputStream f668b;

        /* renamed from: c */
        private final BufferedInputStream f669c;

        /* renamed from: d */
        private int f670d;

        /* renamed from: e */
        private int f671e;

        /* renamed from: f */
        private String f672f;

        /* renamed from: g */
        private l f673g;

        /* renamed from: h */
        private Map f674h;

        /* renamed from: i */
        private Map f675i;

        /* renamed from: j */
        private e f676j;

        /* renamed from: k */
        private String f677k;

        /* renamed from: l */
        private String f678l;

        /* renamed from: m */
        private String f679m;

        /* renamed from: n */
        private String f680n;

        public j(q qVar, InputStream inputStream, OutputStream outputStream, InetAddress inetAddress) {
            String str = null;
            String str2 = null;
            this.f667a = qVar;
            this.f669c = new BufferedInputStream(inputStream, 8192);
            this.f668b = outputStream;
            if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
                str = inetAddress.getHostAddress().toString();
            } else {
                str = "127.0.0.1";
            }
            this.f678l = str;
            if (!inetAddress.isLoopbackAddress() && !inetAddress.isAnyLocalAddress()) {
                str2 = inetAddress.getHostName().toString();
            } else {
                str2 = "localhost";
            }
            this.f679m = str2;
            this.f675i = new HashMap();
        }

        /* renamed from: d */
        private void m855d(BufferedReader bufferedReader, Map map, Map map2, Map map3) {
            String m832i = null;
            try {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    return;
                }
                StringTokenizer stringTokenizer = new StringTokenizer(readLine);
                if (stringTokenizer.hasMoreTokens()) {
                    map.put("method", stringTokenizer.nextToken());
                    if (stringTokenizer.hasMoreTokens()) {
                        String nextToken = stringTokenizer.nextToken();
                        int indexOf = nextToken.indexOf(63);
                        if (indexOf >= 0) {
                            m856e(nextToken.substring(indexOf + 1), map2);
                            m832i = AbstractC0234a.m832i(nextToken.substring(0, indexOf));
                        } else {
                            m832i = AbstractC0234a.m832i(nextToken);
                        }
                        if (stringTokenizer.hasMoreTokens()) {
                            this.f680n = stringTokenizer.nextToken();
                        } else {
                            this.f680n = "HTTP/1.1";
                            AbstractC0234a.f641k.log(Level.FINE, "no protocol version specified, strange. Assuming HTTP/1.1.");
                        }
                        String readLine2 = bufferedReader.readLine();
                        while (readLine2 != null && !readLine2.trim().isEmpty()) {
                            int indexOf2 = readLine2.indexOf(58);
                            if (indexOf2 >= 0) {
                                map3.put(readLine2.substring(0, indexOf2).trim().toLowerCase(Locale.US), readLine2.substring(indexOf2 + 1).trim());
                            }
                            readLine2 = bufferedReader.readLine();
                        }
                        map.put("uri", m832i);
                        return;
                    }
                    throw new n(m.d.BAD_REQUEST, "BAD REQUEST: Missing URI. Usage: GET /example/file.html");
                }
                throw new n(m.d.BAD_REQUEST, "BAD REQUEST: Syntax error. Usage: GET /example/file.html");
            } catch (IOException e10) {
                throw new n(m.d.INTERNAL_ERROR, "SERVER INTERNAL ERROR: IOException: " + e10.getMessage(), e10);
            }
        }

        /* renamed from: e */
        private void m856e(String str, Map map) {
            String trim = null;
            String str2 = null;
            if (str == null) {
                this.f677k = "";
                return;
            }
            this.f677k = str;
            StringTokenizer stringTokenizer = new StringTokenizer(str, DispatchConstants.SIGN_SPLIT_SYMBOL);
            while (stringTokenizer.hasMoreTokens()) {
                String nextToken = stringTokenizer.nextToken();
                int indexOf = nextToken.indexOf(61);
                if (indexOf >= 0) {
                    trim = AbstractC0234a.m832i(nextToken.substring(0, indexOf)).trim();
                    str2 = AbstractC0234a.m832i(nextToken.substring(indexOf + 1));
                } else {
                    trim = AbstractC0234a.m832i(nextToken).trim();
                    str2 = "";
                }
                List list = (List) map.get(trim);
                if (list == null) {
                    list = new ArrayList();
                    map.put(trim, list);
                }
                list.add(str2);
            }
        }

        /* renamed from: g */
        private int m857g(byte[] bArr, int i10) {
            int i11 = 0;
            int i12 = 0;
            while (true) {
                int i13 = i12 + 1;
                if (i13 >= i10) {
                    return 0;
                }
                byte b10 = bArr[i12];
                if (b10 == 13 && bArr[i13] == 10 && (i11 = i12 + 3) < i10 && bArr[i12 + 2] == 13 && bArr[i11] == 10) {
                    return i12 + 4;
                }
                if (b10 == 10 && bArr[i13] == 10) {
                    return i12 + 2;
                }
                i12 = i13;
            }
        }

        @Override // ae.AbstractC0234a.k
        /* renamed from: a */
        public final Map mo858a() {
            return this.f674h;
        }

        @Override // ae.AbstractC0234a.k
        /* renamed from: b */
        public final l mo859b() {
            return this.f673g;
        }

        @Override // ae.AbstractC0234a.k
        /* renamed from: c */
        public final String mo860c() {
            return this.f672f;
        }

        /* renamed from: f */
        public void m861f() {
            byte[] bArr;
            boolean z10 = false;
            boolean z11 = false;
            m mVar = null;
            try {
                try {
                    try {
                        try {
                            try {
                                bArr = new byte[8192];
                                z10 = false;
                                this.f670d = 0;
                                this.f671e = 0;
                                this.f669c.mark(8192);
                            } catch (IOException e10) {
                                AbstractC0234a.m834m(m.d.INTERNAL_ERROR, "text/plain", "SERVER INTERNAL ERROR: IOException: " + e10.getMessage()).m871f(this.f668b);
                                AbstractC0234a.m836o(this.f668b);
                            }
                        } catch (n e11) {
                            AbstractC0234a.m834m(e11.m880a(), "text/plain", e11.getMessage()).m871f(this.f668b);
                            AbstractC0234a.m836o(this.f668b);
                        }
                    } catch (SocketException e12) {
                        throw e12;
                    }
                } catch (SocketTimeoutException e13) {
                    throw e13;
                } catch (SSLException e14) {
                    AbstractC0234a.m834m(m.d.INTERNAL_ERROR, "text/plain", "SSL PROTOCOL FAILURE: " + e14.getMessage()).m871f(this.f668b);
                    AbstractC0234a.m836o(this.f668b);
                }
                try {
                    int read = this.f669c.read(bArr, 0, 8192);
                    if (read == -1) {
                        AbstractC0234a.m836o(this.f669c);
                        AbstractC0234a.m836o(this.f668b);
                        throw new SocketException("NanoHttpd Shutdown");
                    }
                    while (read > 0) {
                        int i10 = this.f671e + read;
                        this.f671e = i10;
                        int m857g = m857g(bArr, i10);
                        this.f670d = m857g;
                        if (m857g > 0) {
                            break;
                        }
                        BufferedInputStream bufferedInputStream = this.f669c;
                        int i11 = this.f671e;
                        read = bufferedInputStream.read(bArr, i11, 8192 - i11);
                    }
                    if (this.f670d < this.f671e) {
                        this.f669c.reset();
                        this.f669c.skip(this.f670d);
                    }
                    this.f674h = new HashMap();
                    Map map = this.f675i;
                    if (map == null) {
                        this.f675i = new HashMap();
                    } else {
                        map.clear();
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr, 0, this.f671e)));
                    HashMap hashMap = new HashMap();
                    m855d(bufferedReader, hashMap, this.f674h, this.f675i);
                    String str = this.f678l;
                    if (str != null) {
                        this.f675i.put("remote-addr", str);
                        this.f675i.put("http-client-ip", this.f678l);
                    }
                    l m862a = l.m862a((String) hashMap.get("method"));
                    this.f673g = m862a;
                    if (m862a != null) {
                        this.f672f = (String) hashMap.get("uri");
                        this.f676j = new e(this.f675i);
                        String str2 = (String) this.f675i.get("connection");
                        if ("HTTP/1.1".equals(this.f680n) && (str2 == null || !str2.matches("(?i).*close.*"))) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        mVar = AbstractC0234a.this.mo841p(this);
                        if (mVar != null) {
                            String str3 = (String) this.f675i.get("accept-encoding");
                            this.f676j.m852c(mVar);
                            mVar.m876t(this.f673g);
                            if (AbstractC0234a.this.m845t(mVar) && str3 != null && str3.contains("gzip")) {
                                z10 = true;
                            }
                            mVar.m874r(z10);
                            mVar.m875s(z11);
                            mVar.m871f(this.f668b);
                            if (!z11 || mVar.m869d()) {
                                throw new SocketException("NanoHttpd Shutdown");
                            }
                            return;
                        }
                        throw new n(m.d.INTERNAL_ERROR, "SERVER INTERNAL ERROR: Serve() returned a null response.");
                    }
                    throw new n(m.d.BAD_REQUEST, "BAD REQUEST: Syntax error. HTTP verb " + ((String) hashMap.get("method")) + " unhandled.");
                } catch (SSLException e15) {
                    throw e15;
                } catch (IOException unused) {
                    AbstractC0234a.m836o(this.f669c);
                    AbstractC0234a.m836o(this.f668b);
                    throw new SocketException("NanoHttpd Shutdown");
                }
            } finally {
                AbstractC0234a.m836o(null);
                this.f667a.clear();
            }
        }
    }

    /* renamed from: ae.a$k */
    /* loaded from: classes3.dex */
    public interface k {
        /* renamed from: a */
        Map mo858a();

        /* renamed from: b */
        l mo859b();

        /* renamed from: c */
        String mo860c();
    }

    /* renamed from: ae.a$l */
    /* loaded from: classes3.dex */
    public enum l {
        GET,
        PUT,
        POST,
        DELETE,
        HEAD,
        OPTIONS,
        TRACE,
        CONNECT,
        PATCH,
        PROPFIND,
        PROPPATCH,
        MKCOL,
        MOVE,
        COPY,
        LOCK,
        UNLOCK;

        /* renamed from: a */
        static l m862a(String str) {
            if (str == null) {
                return null;
            }
            try {
                return valueOf(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    /* renamed from: ae.a$m */
    /* loaded from: classes3.dex */
    public static class m implements Closeable {

        /* renamed from: a */
        private c f699a;

        /* renamed from: b */
        private String f700b;

        /* renamed from: c */
        private InputStream f701c;

        /* renamed from: d */
        private long f702d;

        /* renamed from: e */
        private final Map f703e = new a();

        /* renamed from: f */
        private final Map f704f = new HashMap();

        /* renamed from: g */
        private l f705g;

        /* renamed from: h */
        private boolean f706h;

        /* renamed from: i */
        private boolean f707i;

        /* renamed from: j */
        private boolean f708j;

        /* renamed from: ae.a$m$a */
        /* loaded from: classes3.dex */
        class a extends HashMap {
            a() {
            }

            @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String put(String str, String str2) {
                String lowerCase = null;
                Map map = m.this.f704f;
                if (str == null) {
                    lowerCase = str;
                } else {
                    lowerCase = str.toLowerCase();
                }
                map.put(lowerCase, str2);
                return (String) super.put(str, str2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: ae.a$m$b */
        /* loaded from: classes3.dex */
        public static class b extends FilterOutputStream {
            public b(OutputStream outputStream) {
                super(outputStream);
            }

            /* renamed from: a */
            public void m878a() {
                ((FilterOutputStream) this).out.write("0\r\n\r\n".getBytes());
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i10) throws java.io.IOException {
                write(new byte[]{(byte) i10}, 0, 1);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr) throws java.io.IOException {
                write(bArr, 0, bArr.length);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) throws java.io.IOException {
                if (i11 == 0) {
                    return;
                }
                ((FilterOutputStream) this).out.write(String.format("%x\r\n", Integer.valueOf(i11)).getBytes());
                ((FilterOutputStream) this).out.write(bArr, i10, i11);
                ((FilterOutputStream) this).out.write("\r\n".getBytes());
            }
        }

        /* renamed from: ae.a$m$c */
        /* loaded from: classes3.dex */
        public interface c {
            /* renamed from: a */
            String mo879a();
        }

        /* renamed from: ae.a$m$d */
        /* loaded from: classes3.dex */
        public enum d implements c {
            SWITCH_PROTOCOL(101, "Switching Protocols"),
            OK(200, "OK"),
            CREATED(201, "Created"),
            ACCEPTED(C3419c.f15024m, "Accepted"),
            NO_CONTENT(204, "No Content"),
            PARTIAL_CONTENT(HttpConstant.SC_PARTIAL_CONTENT, "Partial Content"),
            MULTI_STATUS(207, "Multi-Status"),
            REDIRECT(C3419c.f15026o, "Moved Permanently"),
            FOUND(302, "Found"),
            REDIRECT_SEE_OTHER(303, "See Other"),
            NOT_MODIFIED(304, "Not Modified"),
            TEMPORARY_REDIRECT(StatusLine.HTTP_TEMP_REDIRECT, "Temporary Redirect"),
            BAD_REQUEST(400, "Bad Request"),
            UNAUTHORIZED(401, "Unauthorized"),
            FORBIDDEN(403, "Forbidden"),
            NOT_FOUND(404, "Not Found"),
            METHOD_NOT_ALLOWED(405, "Method Not Allowed"),
            NOT_ACCEPTABLE(406, "Not Acceptable"),
            REQUEST_TIMEOUT(408, "Request Timeout"),
            CONFLICT(409, "Conflict"),
            GONE(410, "Gone"),
            LENGTH_REQUIRED(411, "Length Required"),
            PRECONDITION_FAILED(412, "Precondition Failed"),
            PAYLOAD_TOO_LARGE(413, "Payload Too Large"),
            UNSUPPORTED_MEDIA_TYPE(415, "Unsupported Media Type"),
            RANGE_NOT_SATISFIABLE(HttpConstant.SC_REQUESTED_RANGE_NOT_SATISFIABLE, "Requested Range Not Satisfiable"),
            EXPECTATION_FAILED(417, "Expectation Failed"),
            TOO_MANY_REQUESTS(429, "Too Many Requests"),
            INTERNAL_ERROR(500, "Internal Server Error"),
            NOT_IMPLEMENTED(501, "Not Implemented"),
            SERVICE_UNAVAILABLE(503, "Service Unavailable"),
            UNSUPPORTED_HTTP_VERSION(505, "HTTP Version Not Supported");


            /* renamed from: a */
            private final int f743a;

            /* renamed from: b */
            private final String f744b;

            d(int i10, String str) {
                this.f743a = i10;
                this.f744b = str;
            }

            @Override // ae.AbstractC0234a.m.c
            /* renamed from: a */
            public String mo879a() {
                return "" + this.f743a + " " + this.f744b;
            }
        }

        protected m(c cVar, String str, InputStream inputStream, long j10) {
            this.f699a = cVar;
            this.f700b = str;
            if (inputStream == null) {
                this.f701c = new ByteArrayInputStream(new byte[0]);
                this.f702d = 0L;
            } else {
                this.f701c = inputStream;
                this.f702d = j10;
            }
            this.f706h = this.f702d < 0;
            this.f708j = true;
        }

        /* renamed from: h */
        private void m864h(OutputStream outputStream, long j10) {
            boolean z10 = false;
            long min;
            byte[] bArr = new byte[(int) IjkMediaMeta.AV_CH_TOP_FRONT_RIGHT];
            if (j10 == -1) {
                z10 = true;
            } else {
                z10 = false;
            }
            while (true) {
                if (j10 > 0 || z10) {
                    if (z10) {
                        min = 16384;
                    } else {
                        min = Math.min(j10, IjkMediaMeta.AV_CH_TOP_FRONT_RIGHT);
                    }
                    int read = this.f701c.read(bArr, 0, (int) min);
                    if (read <= 0) {
                        return;
                    }
                    outputStream.write(bArr, 0, read);
                    if (!z10) {
                        j10 -= read;
                    }
                } else {
                    return;
                }
            }
        }

        /* renamed from: l */
        private void m865l(OutputStream outputStream, long j10) {
            if (this.f707i) {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                m864h(gZIPOutputStream, -1L);
                gZIPOutputStream.finish();
                return;
            }
            m864h(outputStream, j10);
        }

        /* renamed from: m */
        private void m866m(OutputStream outputStream, long j10) {
            if (this.f705g != l.HEAD && this.f706h) {
                b bVar = new b(outputStream);
                m865l(bVar, -1L);
                bVar.m878a();
                return;
            }
            m865l(outputStream, j10);
        }

        /* renamed from: b */
        public String m867b(String str) {
            return (String) this.f704f.get(str.toLowerCase());
        }

        /* renamed from: c */
        public String m868c() {
            return this.f700b;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws java.io.IOException {
            InputStream inputStream = this.f701c;
            if (inputStream != null) {
                inputStream.close();
            }
        }

        /* renamed from: d */
        public boolean m869d() {
            return HttpHeaders.HEAD_VALUE_CONNECTION_CLOSE.equals(m867b("connection"));
        }

        /* renamed from: e */
        protected void m870e(PrintWriter printWriter, String str, String str2) {
            printWriter.append((CharSequence) str).append(": ").append((CharSequence) str2).append("\r\n");
        }

        /* renamed from: f */
        protected void m871f(OutputStream outputStream) {
            long j10;
            String str = null;
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E, d MMM yyyy HH:mm:ss 'GMT'", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
            try {
                if (this.f699a != null) {
                    PrintWriter printWriter = new PrintWriter((Writer) new BufferedWriter(new OutputStreamWriter(outputStream, new d(this.f700b).m850c())), false);
                    printWriter.append("HTTP/1.1 ").append((CharSequence) this.f699a.mo879a()).append(" \r\n");
                    String str2 = this.f700b;
                    if (str2 != null) {
                        m870e(printWriter, "Content-Type", str2);
                    }
                    if (m867b(Progress.DATE) == null) {
                        m870e(printWriter, HttpHeaders.HEAD_KEY_DATE, simpleDateFormat.format(new Date()));
                    }
                    for (Map.Entry entry : this.f703e.entrySet()) {
                        m870e(printWriter, (String) entry.getKey(), (String) entry.getValue());
                    }
                    if (m867b("connection") == null) {
                        if (this.f708j) {
                            str = HttpHeaders.HEAD_VALUE_CONNECTION_KEEP_ALIVE;
                        } else {
                            str = HttpHeaders.HEAD_VALUE_CONNECTION_CLOSE;
                        }
                        m870e(printWriter, HttpHeaders.HEAD_KEY_CONNECTION, str);
                    }
                    if (m867b("content-length") != null) {
                        this.f707i = false;
                    }
                    if (this.f707i) {
                        m870e(printWriter, "Content-Encoding", "gzip");
                        m873q(true);
                    }
                    if (this.f701c != null) {
                        j10 = this.f702d;
                    } else {
                        j10 = 0;
                    }
                    if (this.f705g != l.HEAD && this.f706h) {
                        m870e(printWriter, "Transfer-Encoding", "chunked");
                    } else if (!this.f707i) {
                        j10 = m872n(printWriter, j10);
                    }
                    printWriter.append("\r\n");
                    printWriter.flush();
                    m866m(outputStream, j10);
                    outputStream.flush();
                    AbstractC0234a.m836o(this.f701c);
                    return;
                }
                throw new Error("sendResponse(): Status can't be null.");
            } catch (IOException e10) {
                AbstractC0234a.f641k.log(Level.SEVERE, "Could not send response to the client", (Throwable) e10);
            }
        }

        /* renamed from: n */
        protected long m872n(PrintWriter printWriter, long j10) {
            String m867b = m867b("content-length");
            if (m867b != null) {
                try {
                    j10 = Long.parseLong(m867b);
                } catch (NumberFormatException unused) {
                    AbstractC0234a.f641k.severe("content-length was no number " + m867b);
                }
            }
            printWriter.print("Content-Length: " + j10 + "\r\n");
            return j10;
        }

        /* renamed from: q */
        public void m873q(boolean z10) {
            this.f706h = z10;
        }

        /* renamed from: r */
        public void m874r(boolean z10) {
            this.f707i = z10;
        }

        /* renamed from: s */
        public void m875s(boolean z10) {
            this.f708j = z10;
        }

        /* renamed from: t */
        public void m876t(l lVar) {
            this.f705g = lVar;
        }
    }

    /* renamed from: ae.a$o */
    /* loaded from: classes3.dex */
    public class o implements Runnable {

        /* renamed from: a */
        private final int f746a;

        /* renamed from: b */
        private IOException f747b;

        /* renamed from: c */
        private boolean f748c = false;

        public o(int i10) {
            this.f746a = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            InetSocketAddress inetSocketAddress;
            try {
                ServerSocket serverSocket = AbstractC0234a.this.f644c;
                if (AbstractC0234a.this.f642a != null) {
                    inetSocketAddress = new InetSocketAddress(AbstractC0234a.this.f642a, AbstractC0234a.this.f643b);
                } else {
                    inetSocketAddress = new InetSocketAddress(AbstractC0234a.this.f643b);
                }
                serverSocket.bind(inetSocketAddress);
                this.f748c = true;
                do {
                    try {
                        Socket accept = AbstractC0234a.this.f644c.accept();
                        int i10 = this.f746a;
                        if (i10 > 0) {
                            accept.setSoTimeout(i10);
                        }
                        InputStream inputStream = accept.getInputStream();
                        AbstractC0234a abstractC0234a = AbstractC0234a.this;
                        abstractC0234a.f647f.mo846a(abstractC0234a.m837g(accept, inputStream));
                    } catch (IOException e10) {
                        AbstractC0234a.f641k.log(Level.FINE, "Communication with the client broken", (Throwable) e10);
                    }
                } while (!AbstractC0234a.this.f644c.isClosed());
            } catch (IOException e11) {
                this.f747b = e11;
            }
        }
    }

    /* renamed from: ae.a$p */
    /* loaded from: classes3.dex */
    public interface p {
        /* renamed from: a */
        ServerSocket mo853a();
    }

    /* renamed from: ae.a$q */
    /* loaded from: classes3.dex */
    public interface q {
        void clear();
    }

    /* renamed from: ae.a$r */
    /* loaded from: classes3.dex */
    public interface r {
        /* renamed from: a */
        q mo854a();
    }

    public AbstractC0234a(int i10) {
        this(null, i10);
    }

    /* renamed from: i */
    protected static String m832i(String str) {
        try {
            return URLDecoder.decode(str, "UTF8");
        } catch (UnsupportedEncodingException e10) {
            f641k.log(Level.WARNING, "Encoding not supported, ignored", (Throwable) e10);
            return null;
        }
    }

    /* renamed from: l */
    public static m m833l(m.c cVar, String str, InputStream inputStream, long j10) {
        return new m(cVar, str, inputStream, j10);
    }

    /* renamed from: m */
    public static m m834m(m.c cVar, String str, String str2) {
        byte[] bArr;
        d dVar = new d(str);
        if (str2 == null) {
            return m833l(cVar, str, new ByteArrayInputStream(new byte[0]), 0L);
        }
        try {
            if (!Charset.forName(dVar.m850c()).newEncoder().canEncode(str2)) {
                dVar = dVar.m851d();
            }
            bArr = str2.getBytes(dVar.m850c());
        } catch (UnsupportedEncodingException e10) {
            f641k.log(Level.SEVERE, "encoding problem, responding nothing", (Throwable) e10);
            bArr = new byte[0];
        }
        return m833l(cVar, dVar.m849a(), new ByteArrayInputStream(bArr), bArr.length);
    }

    /* renamed from: n */
    public static m m835n(String str) {
        return m834m(m.d.OK, "text/html", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o */
    public static final void m836o(Object obj) {
        if (obj != null) {
            try {
                if (obj instanceof Closeable) {
                    ((Closeable) obj).close();
                } else if (obj instanceof Socket) {
                    ((Socket) obj).close();
                } else {
                    if (obj instanceof ServerSocket) {
                        ((ServerSocket) obj).close();
                        return;
                    }
                    throw new IllegalArgumentException("Unknown object to close");
                }
            } catch (IOException e10) {
                f641k.log(Level.SEVERE, "Could not close", (Throwable) e10);
            }
        }
    }

    /* renamed from: g */
    protected c m837g(Socket socket, InputStream inputStream) {
        return new c(inputStream, socket);
    }

    /* renamed from: h */
    protected o m838h(int i10) {
        return new o(i10);
    }

    /* renamed from: j */
    public final int m839j() {
        if (this.f644c == null) {
            return -1;
        }
        return this.f644c.getLocalPort();
    }

    /* renamed from: k */
    public p m840k() {
        return this.f645d;
    }

    /* renamed from: p */
    public abstract m mo841p(k kVar);

    /* renamed from: q */
    public void m842q(b bVar) {
        this.f647f = bVar;
    }

    /* renamed from: r */
    public void m843r(r rVar) {
        this.f648g = rVar;
    }

    /* renamed from: s */
    public void m844s(int i10, boolean z10) {
        this.f644c = m840k().mo853a();
        this.f644c.setReuseAddress(true);
        o m838h = m838h(i10);
        Thread thread = new Thread(m838h);
        this.f646e = thread;
        thread.setDaemon(z10);
        this.f646e.setName("NanoHttpd Main Listener");
        this.f646e.start();
        while (!m838h.f748c && m838h.f747b == null) {
            try {
                Thread.sleep(10L);
            } catch (Throwable unused) {
            }
        }
        if (m838h.f747b == null) {
        } else {
            throw m838h.f747b;
        }
    }

    /* renamed from: t */
    protected boolean m845t(m mVar) {
        if (mVar.m868c() != null && (mVar.m868c().toLowerCase().contains("text/") || mVar.m868c().toLowerCase().contains("/json"))) {
            return true;
        }
        return false;
    }

    /* renamed from: ae.a$n */
    /* loaded from: classes3.dex */
    public static final class n extends Exception {

        /* renamed from: a */
        private final m.d f745a;

        public n(m.d dVar, String str) {
            super(str);
            this.f745a = dVar;
        }

        /* renamed from: a */
        public m.d m880a() {
            return this.f745a;
        }

        public n(m.d dVar, String str, Exception exc) {
            super(str, exc);
            this.f745a = dVar;
        }
    }

    public AbstractC0234a(String str, int i10) {
        this.f645d = new g();
        this.f642a = str;
        this.f643b = i10;
        m843r(new i());
        m842q(new f());
    }
}
