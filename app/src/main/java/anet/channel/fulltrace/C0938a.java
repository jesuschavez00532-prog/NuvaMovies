package anet.channel.fulltrace;

import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;

/* renamed from: anet.channel.fulltrace.a */
/* loaded from: classes.dex */
public class C0938a {

    /* renamed from: a */
    private static volatile IFullTraceAnalysis f3889a = new a(null);

    /* renamed from: b */
    private static boolean f3890b = false;

    /* renamed from: anet.channel.fulltrace.a$a */
    /* loaded from: classes.dex */
    private static class a implements IFullTraceAnalysis {

        /* renamed from: a */
        private IFullTraceAnalysis f3891a;

        a(IFullTraceAnalysis iFullTraceAnalysis) {
            this.f3891a = iFullTraceAnalysis;
            boolean unused = C0938a.f3890b = true;
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysis
        public void commitRequest(String str, RequestStatistic requestStatistic) {
            IFullTraceAnalysis iFullTraceAnalysis;
            if (C0938a.f3890b && (iFullTraceAnalysis = this.f3891a) != null) {
                try {
                    iFullTraceAnalysis.commitRequest(str, requestStatistic);
                } catch (Throwable th) {
                    boolean unused = C0938a.f3890b = false;
                    ALog.m4786e("anet.AnalysisFactory", "fulltrace commit fail.", null, th, new Object[0]);
                }
            }
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysis
        public String createRequest() {
            IFullTraceAnalysis iFullTraceAnalysis;
            if (!C0938a.f3890b || (iFullTraceAnalysis = this.f3891a) == null) {
                return null;
            }
            try {
                return iFullTraceAnalysis.createRequest();
            } catch (Throwable th) {
                boolean unused = C0938a.f3890b = false;
                ALog.m4786e("anet.AnalysisFactory", "createRequest fail.", null, th, new Object[0]);
                return null;
            }
        }

        @Override // anet.channel.fulltrace.IFullTraceAnalysis
        public C0939b getSceneInfo() {
            IFullTraceAnalysis iFullTraceAnalysis;
            if (!C0938a.f3890b || (iFullTraceAnalysis = this.f3891a) == null) {
                return null;
            }
            try {
                return iFullTraceAnalysis.getSceneInfo();
            } catch (Throwable th) {
                boolean unused = C0938a.f3890b = false;
                ALog.m4786e("anet.AnalysisFactory", "getSceneInfo fail", null, th, new Object[0]);
                return null;
            }
        }
    }

    /* renamed from: a */
    public static IFullTraceAnalysis m4580a() {
        return f3889a;
    }

    /* renamed from: a */
    public static void m4581a(IFullTraceAnalysis iFullTraceAnalysis) {
        f3889a = new a(iFullTraceAnalysis);
    }
}
