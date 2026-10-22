package antlr.collections.impl;

import antlr.CharFormatter;
import com.raizlabs.android.dbflow.sql.language.Operator;

/* loaded from: classes.dex */
public class BitSet implements Cloneable {
    protected static final int BITS = 64;
    protected static final int LOG_BITS = 6;
    protected static final int MOD_MASK = 63;
    protected static final int NIBBLE = 4;
    protected long[] bits;

    public BitSet() {
        this(64);
    }

    private static final long bitMask(int i10) {
        return 1 << (i10 & 63);
    }

    public static Vector getRanges(int[] iArr) {
        if (iArr.length == 0) {
            return null;
        }
        int i10 = 0;
        int i11 = iArr[0];
        int i12 = iArr[iArr.length - 1];
        if (iArr.length <= 2) {
            return null;
        }
        Vector vector = new Vector(5);
        while (i10 < iArr.length - 2) {
            int length = iArr.length - 1;
            int i13 = i10 + 1;
            int i14 = i13;
            while (true) {
                if (i14 >= iArr.length) {
                    break;
                }
                int i15 = i14 - 1;
                if (iArr[i14] != iArr[i15] + 1) {
                    length = i15;
                    break;
                }
                i14++;
            }
            if (length - i10 > 2) {
                vector.appendElement(new IntRange(iArr[i10], iArr[length]));
            }
            i10 = i13;
        }
        return vector;
    }

    private final int numWordsToHold(int i10) {
        return (i10 >> 6) + 1;
    }

    /* renamed from: of */
    public static BitSet m4822of(int i10) {
        BitSet bitSet = new BitSet(i10 + 1);
        bitSet.add(i10);
        return bitSet;
    }

    private void setSize(int i10) {
        long[] jArr = new long[i10];
        System.arraycopy(this.bits, 0, jArr, 0, Math.min(i10, this.bits.length));
        this.bits = jArr;
    }

    private static final int wordNumber(int i10) {
        return i10 >> 6;
    }

    public void add(int i10) {
        int wordNumber = wordNumber(i10);
        if (wordNumber >= this.bits.length) {
            growToInclude(i10);
        }
        long[] jArr = this.bits;
        jArr[wordNumber] = jArr[wordNumber] | bitMask(i10);
    }

    public BitSet and(BitSet bitSet) {
        BitSet bitSet2 = (BitSet) clone();
        bitSet2.andInPlace(bitSet);
        return bitSet2;
    }

    public void andInPlace(BitSet bitSet) {
        int min = Math.min(this.bits.length, bitSet.bits.length);
        for (int i10 = min - 1; i10 >= 0; i10--) {
            long[] jArr = this.bits;
            jArr[i10] = jArr[i10] & bitSet.bits[i10];
        }
        while (true) {
            long[] jArr2 = this.bits;
            if (min < jArr2.length) {
                jArr2[min] = 0;
                min++;
            } else {
                return;
            }
        }
    }

    public void clear() {
        for (int length = this.bits.length - 1; length >= 0; length--) {
            this.bits[length] = 0;
        }
    }

    public Object clone() {
        try {
            BitSet bitSet = (BitSet) super.clone();
            long[] jArr = new long[this.bits.length];
            bitSet.bits = jArr;
            long[] jArr2 = this.bits;
            System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
            return bitSet;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public int degree() {
        int i10 = 0;
        for (int length = this.bits.length - 1; length >= 0; length--) {
            long j10 = this.bits[length];
            if (j10 != 0) {
                for (int i11 = 63; i11 >= 0; i11--) {
                    if (((1 << i11) & j10) != 0) {
                        i10++;
                    }
                }
            }
        }
        return i10;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BitSet)) {
            return false;
        }
        BitSet bitSet = (BitSet) obj;
        int min = Math.min(this.bits.length, bitSet.bits.length);
        int i10 = min;
        while (true) {
            int i11 = i10 - 1;
            if (i10 > 0) {
                if (this.bits[i11] != bitSet.bits[i11]) {
                    return false;
                }
                i10 = i11;
            } else {
                long[] jArr = this.bits;
                if (jArr.length > min) {
                    int length = jArr.length;
                    while (true) {
                        int i12 = length - 1;
                        if (length > min) {
                            if (this.bits[i12] != 0) {
                                return false;
                            }
                            length = i12;
                        } else {
                            return true;
                        }
                    }
                } else {
                    long[] jArr2 = bitSet.bits;
                    if (jArr2.length > min) {
                        int length2 = jArr2.length;
                        while (true) {
                            int i13 = length2 - 1;
                            if (length2 > min) {
                                if (bitSet.bits[i13] != 0) {
                                    return false;
                                }
                                length2 = i13;
                            } else {
                                return true;
                            }
                        }
                    } else {
                        return true;
                    }
                }
            }
        }
    }

    public void growToInclude(int i10) {
        long[] jArr = new long[Math.max(this.bits.length << 1, numWordsToHold(i10))];
        long[] jArr2 = this.bits;
        System.arraycopy(jArr2, 0, jArr, 0, jArr2.length);
        this.bits = jArr;
    }

    public int lengthInLongWords() {
        return this.bits.length;
    }

    public boolean member(int i10) {
        int wordNumber = wordNumber(i10);
        long[] jArr = this.bits;
        if (wordNumber >= jArr.length || (jArr[wordNumber] & bitMask(i10)) == 0) {
            return false;
        }
        return true;
    }

    public boolean nil() {
        for (int length = this.bits.length - 1; length >= 0; length--) {
            if (this.bits[length] != 0) {
                return false;
            }
        }
        return true;
    }

    public BitSet not() {
        BitSet bitSet = (BitSet) clone();
        bitSet.notInPlace();
        return bitSet;
    }

    public void notInPlace() {
        for (int length = this.bits.length - 1; length >= 0; length--) {
            long[] jArr = this.bits;
            jArr[length] = jArr[length] ^ (-1);
        }
    }

    /* renamed from: or */
    public BitSet m4823or(BitSet bitSet) {
        BitSet bitSet2 = (BitSet) clone();
        bitSet2.orInPlace(bitSet);
        return bitSet2;
    }

    public void orInPlace(BitSet bitSet) {
        long[] jArr = bitSet.bits;
        if (jArr.length > this.bits.length) {
            setSize(jArr.length);
        }
        for (int min = Math.min(this.bits.length, bitSet.bits.length) - 1; min >= 0; min--) {
            long[] jArr2 = this.bits;
            jArr2[min] = jArr2[min] | bitSet.bits[min];
        }
    }

    public void remove(int i10) {
        int wordNumber = wordNumber(i10);
        if (wordNumber >= this.bits.length) {
            growToInclude(i10);
        }
        long[] jArr = this.bits;
        jArr[wordNumber] = jArr[wordNumber] & (bitMask(i10) ^ (-1));
    }

    public int size() {
        return this.bits.length << 6;
    }

    public boolean subset(BitSet bitSet) {
        if (bitSet != null) {
            return and(bitSet).equals(this);
        }
        return false;
    }

    public void subtractInPlace(BitSet bitSet) {
        if (bitSet == null) {
            return;
        }
        int i10 = 0;
        while (true) {
            long[] jArr = this.bits;
            if (i10 < jArr.length) {
                long[] jArr2 = bitSet.bits;
                if (i10 < jArr2.length) {
                    jArr[i10] = jArr[i10] & (jArr2[i10] ^ (-1));
                    i10++;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public int[] toArray() {
        int[] iArr = new int[degree()];
        int i10 = 0;
        for (int i11 = 0; i11 < (this.bits.length << 6); i11++) {
            if (member(i11)) {
                iArr[i10] = i11;
                i10++;
            }
        }
        return iArr;
    }

    public long[] toPackedArray() {
        return this.bits;
    }

    public String toString() {
        return toString(",");
    }

    public String toStringOfHalfWords() {
        String str = new String();
        for (int i10 = 0; i10 < this.bits.length; i10++) {
            if (i10 != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(", ");
                str = stringBuffer.toString();
            }
            long j10 = this.bits[i10] & 4294967295L;
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(str);
            stringBuffer2.append(j10);
            stringBuffer2.append("UL");
            String stringBuffer3 = stringBuffer2.toString();
            StringBuffer stringBuffer4 = new StringBuffer();
            stringBuffer4.append(stringBuffer3);
            stringBuffer4.append(", ");
            String stringBuffer5 = stringBuffer4.toString();
            long j11 = (this.bits[i10] >>> 32) & 4294967295L;
            StringBuffer stringBuffer6 = new StringBuffer();
            stringBuffer6.append(stringBuffer5);
            stringBuffer6.append(j11);
            stringBuffer6.append("UL");
            str = stringBuffer6.toString();
        }
        return str;
    }

    public String toStringOfWords() {
        String str = new String();
        for (int i10 = 0; i10 < this.bits.length; i10++) {
            if (i10 != 0) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str);
                stringBuffer.append(", ");
                str = stringBuffer.toString();
            }
            StringBuffer stringBuffer2 = new StringBuffer();
            stringBuffer2.append(str);
            stringBuffer2.append(this.bits[i10]);
            stringBuffer2.append("L");
            str = stringBuffer2.toString();
        }
        return str;
    }

    public String toStringWithRanges(String str, CharFormatter charFormatter) {
        int[] array = toArray();
        String str2 = "";
        if (array.length == 0) {
            return "";
        }
        int i10 = 0;
        while (i10 < array.length) {
            int i11 = 0;
            for (int i12 = i10 + 1; i12 < array.length && array[i12] == array[i12 - 1] + 1; i12++) {
                i11 = i12;
            }
            if (str2.length() > 0) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append(str2);
                stringBuffer.append(str);
                str2 = stringBuffer.toString();
            }
            if (i11 - i10 >= 2) {
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(str2);
                stringBuffer2.append(charFormatter.literalChar(array[i10]));
                String stringBuffer3 = stringBuffer2.toString();
                StringBuffer stringBuffer4 = new StringBuffer();
                stringBuffer4.append(stringBuffer3);
                stringBuffer4.append("..");
                String stringBuffer5 = stringBuffer4.toString();
                StringBuffer stringBuffer6 = new StringBuffer();
                stringBuffer6.append(stringBuffer5);
                stringBuffer6.append(charFormatter.literalChar(array[i11]));
                str2 = stringBuffer6.toString();
                i10 = i11;
            } else {
                StringBuffer stringBuffer7 = new StringBuffer();
                stringBuffer7.append(str2);
                stringBuffer7.append(charFormatter.literalChar(array[i10]));
                str2 = stringBuffer7.toString();
            }
            i10++;
        }
        return str2;
    }

    public BitSet(long[] jArr) {
        this.bits = jArr;
    }

    public String toString(String str) {
        String str2 = "";
        for (int i10 = 0; i10 < (this.bits.length << 6); i10++) {
            if (member(i10)) {
                if (str2.length() > 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(str2);
                    stringBuffer.append(str);
                    str2 = stringBuffer.toString();
                }
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(str2);
                stringBuffer2.append(i10);
                str2 = stringBuffer2.toString();
            }
        }
        return str2;
    }

    public void clear(int i10) {
        int wordNumber = wordNumber(i10);
        if (wordNumber >= this.bits.length) {
            growToInclude(i10);
        }
        long[] jArr = this.bits;
        jArr[wordNumber] = jArr[wordNumber] & (bitMask(i10) ^ (-1));
    }

    public void notInPlace(int i10) {
        notInPlace(0, i10);
    }

    public BitSet(int i10) {
        this.bits = new long[((i10 - 1) >> 6) + 1];
    }

    public void notInPlace(int i10, int i11) {
        growToInclude(i11);
        while (i10 <= i11) {
            int wordNumber = wordNumber(i10);
            long[] jArr = this.bits;
            jArr[wordNumber] = jArr[wordNumber] ^ bitMask(i10);
            i10++;
        }
    }

    public String toString(String str, CharFormatter charFormatter) {
        String str2 = "";
        for (int i10 = 0; i10 < (this.bits.length << 6); i10++) {
            if (member(i10)) {
                if (str2.length() > 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(str2);
                    stringBuffer.append(str);
                    str2 = stringBuffer.toString();
                }
                StringBuffer stringBuffer2 = new StringBuffer();
                stringBuffer2.append(str2);
                stringBuffer2.append(charFormatter.literalChar(i10));
                str2 = stringBuffer2.toString();
            }
        }
        return str2;
    }

    public String toString(String str, Vector vector) {
        if (vector == null) {
            return toString(str);
        }
        String str2 = "";
        for (int i10 = 0; i10 < (this.bits.length << 6); i10++) {
            if (member(i10)) {
                if (str2.length() > 0) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append(str2);
                    stringBuffer.append(str);
                    str2 = stringBuffer.toString();
                }
                if (i10 >= vector.size()) {
                    StringBuffer stringBuffer2 = new StringBuffer();
                    stringBuffer2.append(str2);
                    stringBuffer2.append("<bad element ");
                    stringBuffer2.append(i10);
                    stringBuffer2.append(Operator.Operation.GREATER_THAN);
                    str2 = stringBuffer2.toString();
                } else if (vector.elementAt(i10) == null) {
                    StringBuffer stringBuffer3 = new StringBuffer();
                    stringBuffer3.append(str2);
                    stringBuffer3.append(Operator.Operation.LESS_THAN);
                    stringBuffer3.append(i10);
                    stringBuffer3.append(Operator.Operation.GREATER_THAN);
                    str2 = stringBuffer3.toString();
                } else {
                    StringBuffer stringBuffer4 = new StringBuffer();
                    stringBuffer4.append(str2);
                    stringBuffer4.append((String) vector.elementAt(i10));
                    str2 = stringBuffer4.toString();
                }
            }
        }
        return str2;
    }
}
