package com.itheilv.miaosha.base;


/**
 * @author WSQ
 * @since 2020-09-28
 */
public class BaseModelSearch<Record extends BaseModel> {

    private Record record;

    public BaseModelSearch() {
    }

    public BaseModelSearch(Record record) {
        this.record = record;
    }
}
