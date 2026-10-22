package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.sa */
/* loaded from: classes.dex */
abstract class AbstractC2119sa {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m8913a(AbstractC1873c8 abstractC1873c8) {
        StringBuilder sb2 = new StringBuilder(abstractC1873c8.mo8182i());
        for (int i10 = 0; i10 < abstractC1873c8.mo8182i(); i10++) {
            byte mo8180c = abstractC1873c8.mo8180c(i10);
            if (mo8180c != 34) {
                if (mo8180c != 39) {
                    if (mo8180c != 92) {
                        switch (mo8180c) {
                            case 7:
                                sb2.append("\\a");
                                break;
                            case 8:
                                sb2.append("\\b");
                                break;
                            case 9:
                                sb2.append("\\t");
                                break;
                            case 10:
                                sb2.append("\\n");
                                break;
                            case 11:
                                sb2.append("\\v");
                                break;
                            case 12:
                                sb2.append("\\f");
                                break;
                            case 13:
                                sb2.append("\\r");
                                break;
                            default:
                                if (mo8180c >= 32 && mo8180c <= 126) {
                                    sb2.append((char) mo8180c);
                                    break;
                                } else {
                                    sb2.append('\\');
                                    sb2.append((char) (((mo8180c >>> 6) & 3) + 48));
                                    sb2.append((char) (((mo8180c >>> 3) & 7) + 48));
                                    sb2.append((char) ((mo8180c & 7) + 48));
                                    break;
                                }
                                break;
                        }
                    } else {
                        sb2.append("\\\\");
                    }
                } else {
                    sb2.append("\\'");
                }
            } else {
                sb2.append("\\\"");
            }
        }
        return sb2.toString();
    }
}
