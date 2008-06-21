/*
 * Copyright 2004-2008 H2 Group. Multiple-Licensed under the H2 License, 
 * Version 1.0, and under the Eclipse Public License, Version 1.0
 * (http://h2database.com/html/license.html).
 * Initial Developer: H2 Group
 */
package org.h2.jaqu;

/**
 * This class represents a query with an incomplete condition.
 *
 * @param <T> the return type of the query
 * @param <A> the incomplete condition data type
 */
/*## Java 1.6 begin ##
public class QueryCondition<T, A> {
    
    private Query<T> query;
    private A x;

    public QueryCondition(Query<T> query, A x) {
        this.query = query;
        this.x = x;
    }

    public QueryWhere<T> is(A y) {
        query.addConditionToken(new Condition<A>(query, x, y, CompareType.EQUAL));
        return new QueryWhere<T>(query);
    }

    public QueryWhere<T> isBigger(A y) {
        query.addConditionToken(new Condition<A>(query, x, y, CompareType.BIGGER));
        return new QueryWhere<T>(query);
    }

    public QueryWhere<T> isSmaller(A y) {
        query.addConditionToken(new Condition<A>(query, x, y, CompareType.SMALLER));
        return new QueryWhere<T>(query);
    }

}
## Java 1.6 end ##*/
