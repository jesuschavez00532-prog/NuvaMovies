package com.request.result;

import ne.AbstractC5868k;

/* loaded from: classes.dex */
public final class MatchPromotion {
    private MatchPromotion left;
    private String leftLogo;
    private String leftName;
    private MatchPromotion right;
    private String rightLogo;
    private String rightName;
    private String score;
    private String leftScore = "-1";
    private String rightScore = "-1";

    public MatchPromotion(String str, String str2, String str3, String str4, String str5, MatchPromotion matchPromotion, MatchPromotion matchPromotion2) {
        this.score = str;
        this.leftName = str2;
        this.rightName = str3;
        this.leftLogo = str4;
        this.rightLogo = str5;
        this.left = matchPromotion;
        this.right = matchPromotion2;
    }

    public static /* synthetic */ MatchPromotion copy$default(MatchPromotion matchPromotion, String str, String str2, String str3, String str4, String str5, MatchPromotion matchPromotion2, MatchPromotion matchPromotion3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = matchPromotion.score;
        }
        if ((i10 & 2) != 0) {
            str2 = matchPromotion.leftName;
        }
        String str6 = str2;
        if ((i10 & 4) != 0) {
            str3 = matchPromotion.rightName;
        }
        String str7 = str3;
        if ((i10 & 8) != 0) {
            str4 = matchPromotion.leftLogo;
        }
        String str8 = str4;
        if ((i10 & 16) != 0) {
            str5 = matchPromotion.rightLogo;
        }
        String str9 = str5;
        if ((i10 & 32) != 0) {
            matchPromotion2 = matchPromotion.left;
        }
        MatchPromotion matchPromotion4 = matchPromotion2;
        if ((i10 & 64) != 0) {
            matchPromotion3 = matchPromotion.right;
        }
        return matchPromotion.copy(str, str6, str7, str8, str9, matchPromotion4, matchPromotion3);
    }

    public final String component1() {
        return this.score;
    }

    public final String component2() {
        return this.leftName;
    }

    public final String component3() {
        return this.rightName;
    }

    public final String component4() {
        return this.leftLogo;
    }

    public final String component5() {
        return this.rightLogo;
    }

    public final MatchPromotion component6() {
        return this.left;
    }

    public final MatchPromotion component7() {
        return this.right;
    }

    public final MatchPromotion copy(String str, String str2, String str3, String str4, String str5, MatchPromotion matchPromotion, MatchPromotion matchPromotion2) {
        return new MatchPromotion(str, str2, str3, str4, str5, matchPromotion, matchPromotion2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MatchPromotion)) {
            return false;
        }
        MatchPromotion matchPromotion = (MatchPromotion) obj;
        return AbstractC5868k.m23669a(this.score, matchPromotion.score) && AbstractC5868k.m23669a(this.leftName, matchPromotion.leftName) && AbstractC5868k.m23669a(this.rightName, matchPromotion.rightName) && AbstractC5868k.m23669a(this.leftLogo, matchPromotion.leftLogo) && AbstractC5868k.m23669a(this.rightLogo, matchPromotion.rightLogo) && AbstractC5868k.m23669a(this.left, matchPromotion.left) && AbstractC5868k.m23669a(this.right, matchPromotion.right);
    }

    public final MatchPromotion getLeft() {
        return this.left;
    }

    public final String getLeftLogo() {
        return this.leftLogo;
    }

    public final String getLeftName() {
        return this.leftName;
    }

    public final String getLeftScore() {
        return this.leftScore;
    }

    public final MatchPromotion getRight() {
        return this.right;
    }

    public final String getRightLogo() {
        return this.rightLogo;
    }

    public final String getRightName() {
        return this.rightName;
    }

    public final String getRightScore() {
        return this.rightScore;
    }

    public final String getScore() {
        return this.score;
    }

    public int hashCode() {
        String str = this.score;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.leftName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.rightName;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.leftLogo;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.rightLogo;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        MatchPromotion matchPromotion = this.left;
        int hashCode6 = (hashCode5 + (matchPromotion == null ? 0 : matchPromotion.hashCode())) * 31;
        MatchPromotion matchPromotion2 = this.right;
        return hashCode6 + (matchPromotion2 != null ? matchPromotion2.hashCode() : 0);
    }

    public final void setLeft(MatchPromotion matchPromotion) {
        this.left = matchPromotion;
    }

    public final void setLeftLogo(String str) {
        this.leftLogo = str;
    }

    public final void setLeftName(String str) {
        this.leftName = str;
    }

    public final void setLeftScore(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.leftScore = str;
    }

    public final void setRight(MatchPromotion matchPromotion) {
        this.right = matchPromotion;
    }

    public final void setRightLogo(String str) {
        this.rightLogo = str;
    }

    public final void setRightName(String str) {
        this.rightName = str;
    }

    public final void setRightScore(String str) {
        AbstractC5868k.m23674f(str, "<set-?>");
        this.rightScore = str;
    }

    public final void setScore(String str) {
        this.score = str;
    }

    public String toString() {
        return "MatchPromotion(score=" + this.score + ", leftName=" + this.leftName + ", rightName=" + this.rightName + ", leftLogo=" + this.leftLogo + ", rightLogo=" + this.rightLogo + ", left=" + this.left + ", right=" + this.right + ')';
    }
}
