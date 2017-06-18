package com.jajinba.android.utils;


import org.junit.Assert;
import org.junit.Test;

public class EqualUtilsUnitTest {

  @Test
  public void isEqual_Array_isCorrect() throws Exception {
    // null
    Assert.assertTrue(EqualUtils.isEqual(null, null));
    Assert.assertEquals(false, EqualUtils.isEqual(1, null));
    Assert.assertEquals(false, EqualUtils.isEqual("string", null));

    // char and String
    Assert.assertEquals(false, EqualUtils.isEqual('a', "a"));
    Assert.assertEquals(false, EqualUtils.isEqual("a", "abc"));
    Assert.assertTrue(EqualUtils.isEqual("a", "a"));
    Assert.assertTrue(EqualUtils.isEqual("abc", "abc"));

    // numbers
    Assert.assertEquals(false, EqualUtils.isEqual(0, 0f));
    Assert.assertTrue(EqualUtils.isEqual(0, 0));
    Assert.assertTrue(EqualUtils.isEqual(-0, 0));
  }
}
