package com.google.android.gms.measurement.internal;

import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.measurement.internal.b */
/* loaded from: classes.dex */
public final class C2245b extends AbstractC2485w8 {

    /* renamed from: d */
    private String f8370d;

    /* renamed from: e */
    private Set f8371e;

    /* renamed from: f */
    private Map f8372f;

    /* renamed from: g */
    private Long f8373g;

    /* renamed from: h */
    private Long f8374h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2245b(C2310g9 c2310g9) {
        super(c2310g9);
    }

    /* renamed from: n */
    private final C2486w9 m9452n(Integer num) {
        if (this.f8372f.containsKey(num)) {
            return (C2486w9) this.f8372f.get(num);
        }
        C2486w9 c2486w9 = new C2486w9(this, this.f8370d, null);
        this.f8372f.put(num, c2486w9);
        return c2486w9;
    }

    /* renamed from: o */
    private final boolean m9453o(int i10, int i11) {
        C2486w9 c2486w9 = (C2486w9) this.f8372f.get(Integer.valueOf(i10));
        if (c2486w9 == null) {
            return false;
        }
        return C2486w9.m10102b(c2486w9).get(i11);
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC2485w8
    /* renamed from: l */
    protected final boolean mo9454l() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Can't wrap try/catch for region: R(15:(6:19|20|21|22|23|(19:(7:25|26|27|28|(1:30)(3:505|(1:507)(1:509)|508)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:471|(6:472|473|474|475|476|(1:479)(1:478))|480)|44|(1:46)(6:281|(12:283|284|285|286|287|(6:457|295|296|(3:391|(6:394|(1:453)(2:398|(4:404|405|(7:407|(4:410|(2:412|413)(1:415)|414|408)|416|417|(4:420|(3:422|423|424)(1:426)|425|418)|427|428)(6:432|(4:435|(2:437|438)(1:440)|439|433)|441|442|(4:445|(2:447|448)(1:450)|449|443)|451)|429)(4:400|401|402|403))|430|431|403|392)|455)|298|299)|(3:289|(1:291)|292)|295|296|(0)|298|299)(1:470)|300|(10:303|(3:307|(4:310|(5:312|313|(1:315)(1:319)|316|317)(1:320)|318|308)|321)|322|(3:326|(4:329|(3:334|335|336)|337|327)|340)|341|(3:343|(6:346|(2:348|(3:350|351|352))(1:355)|353|354|352|344)|356)|357|(3:366|(8:369|(1:371)|372|(1:374)|375|(3:377|378|379)(1:381)|380|367)|382)|383|301)|389|390)|47|(3:169|(4:172|(10:174|175|(1:177)(1:278)|178|(13:180|181|182|183|184|185|186|187|188|189|190|(3:192|(11:193|194|195|196|197|198|199|(3:201|202|203)(1:251)|204|205|(1:208)(1:207))|209)(3:257|258|259)|210)(1:277)|211|(4:214|(3:232|233|234)(4:216|217|(2:218|(2:220|(1:222)(2:223|224))(1:231))|(3:226|227|228)(1:230))|229|212)|235|236|237)(1:279)|238|170)|280)|49|50|(3:52|(6:55|(9:57|58|59|60|61|(4:128|129|124|76)|(9:63|64|65|66|67|68|(1:70)|71|72)|75|76)(1:144)|77|(2:78|(2:80|(3:114|115|116)(8:82|(2:83|(4:85|(3:87|(1:89)(1:91)|90)|92|(1:1)(2:96|(1:98)(2:99|100)))(1:113))|107|(1:109)(1:111)|110|102|103|104))(0))|117|53)|145)|146|(9:149|150|151|152|153|154|(2:156|157)(1:159)|158|147)|167|168)(2:513|514))|39|40|(0)(0)|44|(0)(0)|47|(0)|49|50|(0)|146|(1:147)|167|168) */
    /* JADX WARN: Can't wrap try/catch for region: R(25:1|(2:2|(2:4|(2:6|7)(1:528))(2:529|530))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(19:(7:25|26|27|28|(1:30)(3:505|(1:507)(1:509)|508)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:471|(6:472|473|474|475|476|(1:479)(1:478))|480)|44|(1:46)(6:281|(12:283|284|285|286|287|(6:457|295|296|(3:391|(6:394|(1:453)(2:398|(4:404|405|(7:407|(4:410|(2:412|413)(1:415)|414|408)|416|417|(4:420|(3:422|423|424)(1:426)|425|418)|427|428)(6:432|(4:435|(2:437|438)(1:440)|439|433)|441|442|(4:445|(2:447|448)(1:450)|449|443)|451)|429)(4:400|401|402|403))|430|431|403|392)|455)|298|299)|(3:289|(1:291)|292)|295|296|(0)|298|299)(1:470)|300|(10:303|(3:307|(4:310|(5:312|313|(1:315)(1:319)|316|317)(1:320)|318|308)|321)|322|(3:326|(4:329|(3:334|335|336)|337|327)|340)|341|(3:343|(6:346|(2:348|(3:350|351|352))(1:355)|353|354|352|344)|356)|357|(3:366|(8:369|(1:371)|372|(1:374)|375|(3:377|378|379)(1:381)|380|367)|382)|383|301)|389|390)|47|(3:169|(4:172|(10:174|175|(1:177)(1:278)|178|(13:180|181|182|183|184|185|186|187|188|189|190|(3:192|(11:193|194|195|196|197|198|199|(3:201|202|203)(1:251)|204|205|(1:208)(1:207))|209)(3:257|258|259)|210)(1:277)|211|(4:214|(3:232|233|234)(4:216|217|(2:218|(2:220|(1:222)(2:223|224))(1:231))|(3:226|227|228)(1:230))|229|212)|235|236|237)(1:279)|238|170)|280)|49|50|(3:52|(6:55|(9:57|58|59|60|61|(4:128|129|124|76)|(9:63|64|65|66|67|68|(1:70)|71|72)|75|76)(1:144)|77|(2:78|(2:80|(3:114|115|116)(8:82|(2:83|(4:85|(3:87|(1:89)(1:91)|90)|92|(1:1)(2:96|(1:98)(2:99|100)))(1:113))|107|(1:109)(1:111)|110|102|103|104))(0))|117|53)|145)|146|(9:149|150|151|152|153|154|(2:156|157)(1:159)|158|147)|167|168)(2:513|514))|527|36|37|38|39|40|(0)(0)|44|(0)(0)|47|(0)|49|50|(0)|146|(1:147)|167|168|(4:(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0a58, code lost:
    
        if (r8 != false) goto L478;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x0939, code lost:
    
        if (r9 == null) goto L358;
     */
    /* JADX WARN: Code restructure failed: missing block: B:460:0x02de, code lost:
    
        if (r5 == null) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x021c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x021d, code lost:
    
        r20 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:501:0x0224, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:502:0x0225, code lost:
    
        r20 = "audience_id";
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:503:0x0220, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:504:0x0221, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x0174, code lost:
    
        if (r5 == null) goto L55;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x05f6  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x07c9  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x07a5  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x07af  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:391:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b5 A[Catch: SQLiteException -> 0x021c, all -> 0x0b14, TRY_LEAVE, TryCatch #8 {SQLiteException -> 0x021c, blocks: (B:40:0x01af, B:42:0x01b5, B:471:0x01c1, B:472:0x01c6, B:474:0x01d0, B:475:0x01e0, B:489:0x01ed), top: B:39:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:464:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x01c1 A[Catch: SQLiteException -> 0x021c, all -> 0x0b14, TRY_ENTER, TryCatch #8 {SQLiteException -> 0x021c, blocks: (B:40:0x01af, B:42:0x01b5, B:471:0x01c1, B:472:0x01c6, B:474:0x01d0, B:475:0x01e0, B:489:0x01ed), top: B:39:0x01af }] */
    /* JADX WARN: Removed duplicated region for block: B:521:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x085c  */
    /* JADX WARN: Type inference failed for: r0v197, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r4v29, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v63, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List m9455m(java.lang.String r64, java.util.List r65, java.util.List r66, java.lang.Long r67, java.lang.Long r68) {
        /*
            Method dump skipped, instructions count: 2846
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C2245b.m9455m(java.lang.String, java.util.List, java.util.List, java.lang.Long, java.lang.Long):java.util.List");
    }
}
