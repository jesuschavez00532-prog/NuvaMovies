package okio;

import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class Options extends AbstractList<ByteString> implements RandomAccess {
    final ByteString[] byteStrings;
    final int[] trie;

    private Options(ByteString[] byteStringArr, int[] iArr) {
        this.byteStrings = byteStringArr;
        this.trie = iArr;
    }

    private static void buildTrieRecursive(long j10, Buffer buffer, int i10, List<ByteString> list, int i11, int i12, List<Integer> list2) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        Buffer buffer2;
        if (i11 < i12) {
            for (int i18 = i11; i18 < i12; i18++) {
                if (list.get(i18).size() < i10) {
                    throw new AssertionError();
                }
            }
            ByteString byteString = list.get(i11);
            ByteString byteString2 = list.get(i12 - 1);
            if (i10 == byteString.size()) {
                int i19 = i11 + 1;
                i14 = i19;
                i13 = list2.get(i11).intValue();
                byteString = list.get(i19);
            } else {
                i13 = -1;
                i14 = i11;
            }
            if (byteString.getByte(i10) != byteString2.getByte(i10)) {
                int i20 = 1;
                for (int i21 = i14 + 1; i21 < i12; i21++) {
                    if (list.get(i21 - 1).getByte(i10) != list.get(i21).getByte(i10)) {
                        i20++;
                    }
                }
                long intCount = j10 + intCount(buffer) + 2 + (i20 * 2);
                buffer.writeInt(i20);
                buffer.writeInt(i13);
                for (int i22 = i14; i22 < i12; i22++) {
                    byte b10 = list.get(i22).getByte(i10);
                    if (i22 == i14 || b10 != list.get(i22 - 1).getByte(i10)) {
                        buffer.writeInt(b10 & 255);
                    }
                }
                Buffer buffer3 = new Buffer();
                int i23 = i14;
                while (i23 < i12) {
                    byte b11 = list.get(i23).getByte(i10);
                    int i24 = i23 + 1;
                    int i25 = i24;
                    while (true) {
                        if (i25 < i12) {
                            if (b11 != list.get(i25).getByte(i10)) {
                                i16 = i25;
                                break;
                            }
                            i25++;
                        } else {
                            i16 = i12;
                            break;
                        }
                    }
                    if (i24 == i16 && i10 + 1 == list.get(i23).size()) {
                        buffer.writeInt(list2.get(i23).intValue());
                        i17 = i16;
                        buffer2 = buffer3;
                    } else {
                        buffer.writeInt((int) ((intCount(buffer3) + intCount) * (-1)));
                        i17 = i16;
                        buffer2 = buffer3;
                        buildTrieRecursive(intCount, buffer3, i10 + 1, list, i23, i16, list2);
                    }
                    buffer3 = buffer2;
                    i23 = i17;
                }
                Buffer buffer4 = buffer3;
                buffer.write(buffer4, buffer4.size());
                return;
            }
            int min = Math.min(byteString.size(), byteString2.size());
            int i26 = 0;
            for (int i27 = i10; i27 < min && byteString.getByte(i27) == byteString2.getByte(i27); i27++) {
                i26++;
            }
            long intCount2 = 1 + j10 + intCount(buffer) + 2 + i26;
            buffer.writeInt(-i26);
            buffer.writeInt(i13);
            int i28 = i10;
            while (true) {
                i15 = i10 + i26;
                if (i28 >= i15) {
                    break;
                }
                buffer.writeInt(byteString.getByte(i28) & 255);
                i28++;
            }
            if (i14 + 1 == i12) {
                if (i15 == list.get(i14).size()) {
                    buffer.writeInt(list2.get(i14).intValue());
                    return;
                }
                throw new AssertionError();
            }
            Buffer buffer5 = new Buffer();
            buffer.writeInt((int) ((intCount(buffer5) + intCount2) * (-1)));
            buildTrieRecursive(intCount2, buffer5, i15, list, i14, i12, list2);
            buffer.write(buffer5, buffer5.size());
            return;
        }
        throw new AssertionError();
    }

    private static int intCount(Buffer buffer) {
        return (int) (buffer.size() / 4);
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ba, code lost:
    
        continue;
     */
    /* renamed from: of */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static okio.Options m24177of(okio.ByteString... r11) {
        /*
            Method dump skipped, instructions count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: okio.Options.m24177of(okio.ByteString[]):okio.Options");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.byteStrings.length;
    }

    @Override // java.util.AbstractList, java.util.List
    public ByteString get(int i10) {
        return this.byteStrings[i10];
    }
}
