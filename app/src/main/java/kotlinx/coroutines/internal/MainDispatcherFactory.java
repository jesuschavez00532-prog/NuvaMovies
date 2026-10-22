package kotlinx.coroutines.internal;

import java.util.List;
import ve.AbstractC7292k1;

/* loaded from: classes3.dex */
public interface MainDispatcherFactory {
    AbstractC7292k1 createDispatcher(List list);

    int getLoadPriority();

    String hintOnError();
}
