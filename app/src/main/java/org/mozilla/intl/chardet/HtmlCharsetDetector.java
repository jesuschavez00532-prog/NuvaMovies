package org.mozilla.intl.chardet;

import anet.channel.entity.EventType;
import java.io.BufferedInputStream;
import java.io.PrintStream;
import java.net.URL;

/* loaded from: classes3.dex */
public class HtmlCharsetDetector {
    public static boolean found;

    public static void main(String[] strArr) {
        int i10;
        if (strArr.length != 1 && strArr.length != 2) {
            System.out.println("Usage: HtmlCharsetDetector <url> [<languageHint>]");
            System.out.println("");
            System.out.println("Where <url> is http://...");
            System.out.println("For optional <languageHint>. Use following...");
            System.out.println("\t\t1 => Japanese");
            System.out.println("\t\t2 => Chinese");
            System.out.println("\t\t3 => Simplified Chinese");
            System.out.println("\t\t4 => Traditional Chinese");
            System.out.println("\t\t5 => Korean");
            System.out.println("\t\t6 => Dont know (default)");
            return;
        }
        if (strArr.length == 2) {
            i10 = Integer.parseInt(strArr[1]);
        } else {
            i10 = 0;
        }
        nsDetector nsdetector = new nsDetector(i10);
        nsdetector.Init(new nsICharsetDetectionObserver() { // from class: org.mozilla.intl.chardet.HtmlCharsetDetector.1
            @Override // org.mozilla.intl.chardet.nsICharsetDetectionObserver
            public void Notify(String str) {
                HtmlCharsetDetector.found = true;
                PrintStream printStream = System.out;
                StringBuffer stringBuffer = new StringBuffer("CHARSET = ");
                stringBuffer.append(str);
                printStream.println(stringBuffer.toString());
            }
        });
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new URL(strArr[0]).openStream());
        byte[] bArr = new byte[EventType.AUTH_FAIL];
        boolean z10 = true;
        boolean z11 = false;
        while (true) {
            int read = bufferedInputStream.read(bArr, 0, EventType.AUTH_FAIL);
            if (read == -1) {
                break;
            }
            if (z10) {
                z10 = nsdetector.isAscii(bArr, read);
            }
            if (!z10 && !z11) {
                z11 = nsdetector.DoIt(bArr, read, false);
            }
        }
        nsdetector.DataEnd();
        if (z10) {
            System.out.println("CHARSET = ASCII");
            found = true;
        }
        if (!found) {
            for (String str : nsdetector.getProbableCharsets()) {
                PrintStream printStream = System.out;
                StringBuffer stringBuffer = new StringBuffer("Probable Charset = ");
                stringBuffer.append(str);
                printStream.println(stringBuffer.toString());
            }
        }
    }
}
