package com.jajinba.android.utils;


public class EqualUtils {

  public static boolean isEqual(Object o, Object o1) {
    if ((o == null || o.toString().equals("")) && (o1 == null || o1.toString().equals(""))) {
      return true;
    } else if (o == null && o1 != null) {
      return false;
    } else if (o != null && o1 == null) {
      return false;
    } else {
      return o.equals(o1);
    }
  }
}
