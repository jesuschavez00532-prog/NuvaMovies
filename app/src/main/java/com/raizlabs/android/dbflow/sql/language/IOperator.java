package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.language.Operator;
import java.util.Collection;

/* loaded from: classes2.dex */
public interface IOperator<T> extends Query, IConditional {
    Operator.Between<T> between(T t10);

    Operator<T> concatenate(T t10);

    Operator<T> div(T t10);

    /* renamed from: eq */
    Operator<T> mo12643eq(T t10);

    Operator<T> greaterThan(T t10);

    Operator<T> greaterThanOrEq(T t10);

    /* renamed from: in */
    Operator.C3094In<T> mo12644in(T t10, T... tArr);

    /* renamed from: in */
    Operator.C3094In<T> mo12645in(Collection<T> collection);

    /* renamed from: is */
    Operator<T> mo12646is(T t10);

    Operator<T> isNot(T t10);

    Operator<T> lessThan(T t10);

    Operator<T> lessThanOrEq(T t10);

    Operator<T> minus(T t10);

    Operator<T> notEq(T t10);

    Operator.C3094In<T> notIn(T t10, T... tArr);

    Operator.C3094In<T> notIn(Collection<T> collection);

    Operator<T> plus(T t10);

    Operator<T> rem(T t10);

    Operator<T> times(T t10);
}
