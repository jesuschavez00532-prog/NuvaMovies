package com.raizlabs.android.dbflow.sql.language;

import com.raizlabs.android.dbflow.sql.Query;
import com.raizlabs.android.dbflow.sql.QueryBuilder;
import com.raizlabs.android.dbflow.sql.language.property.IProperty;
import com.raizlabs.android.dbflow.sql.language.property.Property;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public class Case<TReturn> implements Query {
    private IProperty caseColumn;
    private List<CaseCondition<TReturn>> caseConditions;
    private String columnName;
    private boolean efficientCase;
    private boolean elseSpecified;
    private TReturn elseValue;
    private boolean endSpecified;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Case() {
        this.caseConditions = new ArrayList();
        this.elseSpecified = false;
        this.efficientCase = false;
        this.endSpecified = false;
    }

    public Case<TReturn> _else(TReturn treturn) {
        this.elseValue = treturn;
        this.elseSpecified = true;
        return this;
    }

    public Property<Case<TReturn>> end(String str) {
        this.endSpecified = true;
        if (str != null) {
            this.columnName = QueryBuilder.quoteIfNeeded(str);
        }
        return new Property<>((Class<?>) null, NameAlias.rawBuilder(getQuery()).build());
    }

    public Operator endAsOperator() {
        return Operator.m12656op(end().getNameAlias());
    }

    @Override // com.raizlabs.android.dbflow.sql.Query
    public String getQuery() {
        QueryBuilder queryBuilder = new QueryBuilder(" CASE");
        if (isEfficientCase()) {
            queryBuilder.append(" " + BaseOperator.convertValueToString(this.caseColumn, false));
        }
        String str = "";
        queryBuilder.append(QueryBuilder.join("", this.caseConditions));
        if (this.elseSpecified) {
            queryBuilder.append(" ELSE ").append(BaseOperator.convertValueToString(this.elseValue, false));
        }
        if (this.endSpecified) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(" END ");
            String str2 = this.columnName;
            if (str2 != null) {
                str = str2;
            }
            sb2.append(str);
            queryBuilder.append(sb2.toString());
        }
        return queryBuilder.getQuery();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean isEfficientCase() {
        return this.efficientCase;
    }

    public CaseCondition<TReturn> when(SQLOperator sQLOperator) {
        if (!this.efficientCase) {
            CaseCondition<TReturn> caseCondition = new CaseCondition<>((Case) this, sQLOperator);
            this.caseConditions.add(caseCondition);
            return caseCondition;
        }
        throw new IllegalStateException("When using the efficient CASE method,you must pass in value only, not condition.");
    }

    public Property<Case<TReturn>> end() {
        return end(null);
    }

    public CaseCondition<TReturn> when(TReturn treturn) {
        if (this.efficientCase) {
            CaseCondition<TReturn> caseCondition = new CaseCondition<>(this, treturn);
            this.caseConditions.add(caseCondition);
            return caseCondition;
        }
        throw new IllegalStateException("When not using the efficient CASE method, you must pass in the SQLOperator as a parameter");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Case(IProperty iProperty) {
        this.caseConditions = new ArrayList();
        this.elseSpecified = false;
        this.efficientCase = false;
        this.endSpecified = false;
        this.caseColumn = iProperty;
        if (iProperty != null) {
            this.efficientCase = true;
        }
    }

    public CaseCondition<TReturn> when(IProperty iProperty) {
        if (this.efficientCase) {
            CaseCondition<TReturn> caseCondition = new CaseCondition<>((Case) this, iProperty);
            this.caseConditions.add(caseCondition);
            return caseCondition;
        }
        throw new IllegalStateException("When not using the efficient CASE method, you must pass in the SQLOperator as a parameter");
    }
}
