package com.example.OCB.services;

public class Conrol {
    static String pass = "25042003";
    static String login = "kirill";

    public static boolean check(String newPass, String newLogin){
        boolean fl = pass.equals(newPass)&&login.equals(newLogin);
        return fl;
    }
}
