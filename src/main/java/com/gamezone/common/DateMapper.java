package com.gamezone.common;

public class DateMapper {

    public static java.sql.Date toSqlDate(java.util.Date date){
        if(date != null){
            return new java.sql.Date(date.getTime());
        }
        return null;
    }
}
