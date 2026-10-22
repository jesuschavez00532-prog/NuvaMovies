package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.NameAlias;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.PropertyFactory;
import com.raizlabs.android.dbflow.sql.queriable.ModelQueriable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public class Join<TModel, TFromModel> implements Query {
    private NameAlias alias;
    private From<TFromModel> from;
    private OperatorGroup onGroup;
    private final Class<TModel> table;
    private JoinType type;
    private List<IProperty> using = new ArrayList();

    /* loaded from: classes2.dex */
    public enum JoinType {
        LEFT_OUTER,
        INNER,
        CROSS,
        NATURAL
    }

    public Join(From<TFromModel> from, Class<TModel> cls, JoinType joinType) {
        this.from = from;
        this.table = cls;
        this.type = joinType;
        this.alias = new NameAlias.Builder(FlowManager.getTableName(cls)).build();
    }

    private void checkNatural() {
        if (!JoinType.NATURAL.equals(this.type)) {
        } else {
            throw new IllegalArgumentException("Cannot specify a clause for this join if its NATURAL. Specifying a clause would have no effect. Call end() to continue the query.");
        }
    }

    /* renamed from: as */
    public Join<TModel, TFromModel> m12650as(String str) {
        this.alias = this.alias.newBuilder().m12655as(str).build();
        return this;
    }

    public From<TFromModel> end() {
        return this.from;
    }

    @Override // com.raizlabs.android.dbflow.sql.Query
    public String getQuery() {
        QueryBuilder queryBuilder = new QueryBuilder();
        queryBuilder.append(this.type.name().replace("_", " ")).appendSpace();
        queryBuilder.append("JOIN").appendSpace().append(this.alias.getFullQuery()).appendSpace();
        if (!JoinType.NATURAL.equals(this.type)) {
            if (this.onGroup != null) {
                queryBuilder.append("ON").appendSpace().append(this.onGroup.getQuery()).appendSpace();
            } else if (!this.using.isEmpty()) {
                queryBuilder.append("USING (").appendList(this.using).append(")").appendSpace();
            }
        }
        return queryBuilder.getQuery();
    }

    public Class<TModel> getTable() {
        return this.table;
    }

    /* renamed from: on */
    public From<TFromModel> m12651on(SQLOperator... sQLOperatorArr) {
        checkNatural();
        OperatorGroup nonGroupingClause = OperatorGroup.nonGroupingClause();
        this.onGroup = nonGroupingClause;
        nonGroupingClause.andAll(sQLOperatorArr);
        return this.from;
    }

    public From<TFromModel> using(IProperty... iPropertyArr) {
        checkNatural();
        Collections.addAll(this.using, iPropertyArr);
        return this.from;
    }

    public Join(From<TFromModel> from, JoinType joinType, ModelQueriable<TModel> modelQueriable) {
        this.table = modelQueriable.getTable();
        this.from = from;
        this.type = joinType;
        this.alias = PropertyFactory.from((ModelQueriable) modelQueriable).getNameAlias();
    }
}
