package com.jajinba.android.utils;


import java.util.Collection;

public class ArrayUtils {

  public static int getLengthSafe(Object[] array) {
    return array == null ? 0 : array.length;
  }

  public static int getLengthSafe(Collection<?> list) {
    return list == null ? 0 : list.size();
  }
}
