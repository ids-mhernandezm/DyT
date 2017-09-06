package com.bancomer.dyt.controllers;

/**
 * Created by idsbeca on 05/09/17.
 */

public class LoginViewController {

    public static boolean isUserValid(String user) {
        //TODO: Replace this with your own logic
        return user.length()>4;
    }

    public static boolean isPasswordValid(String password) {
        //TODO: Replace this with your own logic
        return password.length() > 4;
    }

}
