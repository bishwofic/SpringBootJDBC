package com.fsboot.dao;

public interface UserSqlQueries {
    String INSERTQUERY = "INSERT INTO user(name,address) VALUES(?,?)";
    String SELECTQUERY = "SELECT * FROM USER";
    String SELECTONEBYIDQUERY = "SELECT * FROM user WHERE id=?";
    String UPDATEQUERY = "UPDATE user SET name=?,address=? WHERE id=?";
    String DELETEQUERY="DELETE FROM user WHERE id =?";

}
