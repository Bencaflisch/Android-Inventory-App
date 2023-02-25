package com.example.inventorybuddyone;

/**
 * Preliminary non-secure Model for app user
 *
 *
 */

public class UserModel {

    int userId;
    String userPhone;
    String userEmail;
    String userName;
    String userPassword;

//Constructor
    public UserModel(int userId, String userPhone, String userEmail, String userName, String userPassword) {
        this.userId = userId;
        this.userPhone = userPhone;
        this.userEmail = userEmail;
        this.userName = userName;
        this.userPassword = userPassword;
    }

    //Getters and Setters

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
}
