package p405y;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import p373w.AbstractC7338c;

/* renamed from: y.d */
/* loaded from: classes.dex */
public abstract class AbstractC7654d {

    /* renamed from: y.d$a */
    /* loaded from: classes.dex */
    class a extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ c f28088a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(InputConnection inputConnection, boolean z10, c cVar) {
            super(inputConnection, z10);
            this.f28088a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean commitContent(InputContentInfo inputContentInfo, int i10, Bundle bundle) {
            if (this.f28088a.mo2033a(C7655e.m29450f(inputContentInfo), i10, bundle)) {
                return true;
            }
            return super.commitContent(inputContentInfo, i10, bundle);
        }
    }

    /* renamed from: y.d$b */
    /* loaded from: classes.dex */
    class b extends InputConnectionWrapper {

        /* renamed from: a */
        final /* synthetic */ c f28089a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InputConnection inputConnection, boolean z10, c cVar) {
            super(inputConnection, z10);
            this.f28089a = cVar;
        }

        @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
        public boolean performPrivateCommand(String str, Bundle bundle) {
            if (AbstractC7654d.m29449b(str, bundle, this.f28089a)) {
                return true;
            }
            return super.performPrivateCommand(str, bundle);
        }
    }

    /* renamed from: y.d$c */
    /* loaded from: classes.dex */
    public interface c {
        /* renamed from: a */
        boolean mo2033a(C7655e c7655e, int i10, Bundle bundle);
    }

    /* renamed from: a */
    public static InputConnection m29448a(InputConnection inputConnection, EditorInfo editorInfo, c cVar) {
        AbstractC7338c.m28319c(inputConnection, "inputConnection must be non-null");
        AbstractC7338c.m28319c(editorInfo, "editorInfo must be non-null");
        AbstractC7338c.m28319c(cVar, "onCommitContentListener must be non-null");
        if (Build.VERSION.SDK_INT >= 25) {
            return new a(inputConnection, false, cVar);
        }
        if (AbstractC7653c.m29439a(editorInfo).length == 0) {
            return inputConnection;
        }
        return new b(inputConnection, false, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* renamed from: b */
    static boolean m29449b(String str, Bundle bundle, c cVar) {
        boolean z10;
        String str2;
        ResultReceiver resultReceiver;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        Object r02 = 0;
        r02 = 0;
        if (bundle == null) {
            return false;
        }
        if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
            z10 = false;
        } else {
            if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", str)) {
                return false;
            }
            z10 = true;
        }
        if (z10) {
            str2 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
        } else {
            str2 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
        }
        try {
            resultReceiver = (ResultReceiver) bundle.getParcelable(str2);
            if (z10) {
                str3 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            } else {
                str3 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
            }
            try {
                Uri uri = (Uri) bundle.getParcelable(str3);
                if (z10) {
                    str4 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                } else {
                    str4 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
                }
                ClipDescription clipDescription = (ClipDescription) bundle.getParcelable(str4);
                if (z10) {
                    str5 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                } else {
                    str5 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
                }
                Uri uri2 = (Uri) bundle.getParcelable(str5);
                if (z10) {
                    str6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                } else {
                    str6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
                }
                int i10 = bundle.getInt(str6);
                if (z10) {
                    str7 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                } else {
                    str7 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
                }
                Bundle bundle2 = (Bundle) bundle.getParcelable(str7);
                if (uri != null && clipDescription != null) {
                    r02 = cVar.mo2033a(new C7655e(uri, clipDescription, uri2), i10, bundle2);
                }
                if (resultReceiver != 0) {
                    resultReceiver.send(r02, null);
                }
                return r02;
            } catch (Throwable th) {
                th = th;
                if (resultReceiver != 0) {
                    resultReceiver.send(0, null);
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            resultReceiver = 0;
        }
    }
}
