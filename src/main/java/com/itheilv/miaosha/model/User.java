package com.itheilv.miaosha.model;

import java.time.LocalDateTime;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author WSQ
 * @since 2020-10-16
 */
public class User implements Serializable {

    private static final long serialVersionUID=1L;

    private String id;

    private String name;

    private LocalDateTime create_date;

    private LocalDateTime update_date;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCreate_date() {
        return create_date;
    }

    public void setCreate_date(LocalDateTime create_date) {
        this.create_date = create_date;
    }

    public LocalDateTime getUpdate_date() {
        return update_date;
    }

    public void setUpdate_date(LocalDateTime update_date) {
        this.update_date = update_date;
    }

    @Override
    public String toString() {
        return "User{" +
        "id=" + id +
        ", name=" + name +
        ", create_date=" + create_date +
        ", update_date=" + update_date +
        "}";
    }
}
