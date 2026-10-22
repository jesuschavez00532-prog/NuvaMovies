package com.google.android.gms.measurement.internal;

import android.accounts.Account;
import android.accounts.AccountManager;
import android.accounts.AuthenticatorException;
import android.accounts.OperationCanceledException;
import androidx.core.content.AbstractC0547a;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.io.IOException;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.p */
/* loaded from: classes.dex */
public final class C2399p extends AbstractC2350k5 {

    /* renamed from: c */
    private long f8907c;

    /* renamed from: d */
    private String f8908d;

    /* renamed from: e */
    private AccountManager f8909e;

    /* renamed from: f */
    private Boolean f8910f;

    /* renamed from: g */
    private long f8911g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2399p(C2415q4 c2415q4) {
        super(c2415q4);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2350k5
    /* renamed from: j */
    protected final boolean mo9430j() {
        Calendar calendar = Calendar.getInstance();
        this.f8907c = TimeUnit.MINUTES.convert(calendar.get(15) + calendar.get(16), TimeUnit.MILLISECONDS);
        Locale locale = Locale.getDefault();
        String language = locale.getLanguage();
        Locale locale2 = Locale.ENGLISH;
        this.f8908d = language.toLowerCase(locale2) + Operator.Operation.MINUS + locale.getCountry().toLowerCase(locale2);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public final long m9959o() {
        mo9428h();
        return this.f8911g;
    }

    /* renamed from: p */
    public final long m9960p() {
        m9731k();
        return this.f8907c;
    }

    /* renamed from: q */
    public final String m9961q() {
        m9731k();
        return this.f8908d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public final void m9962r() {
        mo9428h();
        this.f8910f = null;
        this.f8911g = 0L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public final boolean m9963s() {
        Account[] result;
        mo9428h();
        long mo24747a = this.f8714a.mo9578c().mo24747a();
        if (mo24747a - this.f8911g > 86400000) {
            this.f8910f = null;
        }
        Boolean bool = this.f8910f;
        if (bool == null) {
            if (AbstractC0547a.m2319a(this.f8714a.mo9584f(), "android.permission.GET_ACCOUNTS") != 0) {
                this.f8714a.mo9577b().m9807y().m9699a("Permission error checking for dasher/unicorn accounts");
                this.f8911g = mo24747a;
                this.f8910f = Boolean.FALSE;
                return false;
            }
            if (this.f8909e == null) {
                this.f8909e = AccountManager.get(this.f8714a.mo9584f());
            }
            try {
                result = this.f8909e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_HOSTED"}, null, null).getResult();
            } catch (AuthenticatorException | OperationCanceledException | IOException e10) {
                this.f8714a.mo9577b().m9802t().m9700b("Exception checking account types", e10);
            }
            if (result != null && result.length > 0) {
                this.f8910f = Boolean.TRUE;
                this.f8911g = mo24747a;
                return true;
            }
            Account[] result2 = this.f8909e.getAccountsByTypeAndFeatures("com.google", new String[]{"service_uca"}, null, null).getResult();
            if (result2 != null && result2.length > 0) {
                this.f8910f = Boolean.TRUE;
                this.f8911g = mo24747a;
                return true;
            }
            this.f8911g = mo24747a;
            this.f8910f = Boolean.FALSE;
            return false;
        }
        return bool.booleanValue();
    }
}
