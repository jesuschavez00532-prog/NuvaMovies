package okhttp3.internal.cache2;

import java.nio.channels.FileChannel;
import okio.Buffer;

/* loaded from: classes3.dex */
final class FileOperator {
    private final FileChannel fileChannel;

    /* JADX INFO: Access modifiers changed from: package-private */
    public FileOperator(FileChannel fileChannel) {
        this.fileChannel = fileChannel;
    }

    public void read(long j10, Buffer buffer, long j11) {
        if (j11 >= 0) {
            while (j11 > 0) {
                long transferTo = this.fileChannel.transferTo(j10, j11, buffer);
                j10 += transferTo;
                j11 -= transferTo;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }

    public void write(long j10, Buffer buffer, long j11) {
        if (j11 >= 0 && j11 <= buffer.size()) {
            long j12 = j10;
            long j13 = j11;
            while (j13 > 0) {
                long transferFrom = this.fileChannel.transferFrom(buffer, j12, j13);
                j12 += transferFrom;
                j13 -= transferFrom;
            }
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
