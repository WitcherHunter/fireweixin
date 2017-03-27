package com.yeejoin.util;

/**
 * Created by Administrator on 2017/3/27.
 */
public class SplitScanCodeUtil {

    public static String isRfid(String s) {
        if (s.length() < 12) {
            return "";
        }
        int indexOf = s.indexOf("01yeejoin10");
        if (indexOf < 0) {
            return "";
        } else {
            s = s.substring(11 + indexOf, s.length());
        }
        int j = s.indexOf("#");
        if (j > 0) {
            s = s.substring(0, j);
        }
        return s;
    }

//    public static void main(String[] args) {
//        String a = "01yeejoin1010290#8888888888888";
//        isRfid(a);
//       System.out.println("-------"+isRfid(a));
//    }
}
