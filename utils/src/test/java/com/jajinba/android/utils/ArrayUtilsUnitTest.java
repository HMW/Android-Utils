package com.jajinba.android.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ArrayUtilsUnitTest {

  private Integer[] intArraySizeOne = {0};
  private Integer[] intArraySizeFive = {0, 1, 2, 3, 4};
  private List<Integer> intListSizeOne = new ArrayList<>();
  private List<Integer> intListSizeFive = new ArrayList<>();

  @Before
  public void setUp() throws Exception {
    intListSizeOne.add(0);
    for (int i = 0; i < 5; i++) {
      intListSizeFive.add(i);
    }
  }

  @Test
  public void getLengthSafe_Array_isCorrect() throws Exception {
    // null
    assertEquals(0, ArrayUtils.getLengthSafe((Object[]) null));
    assertEquals(1, ArrayUtils.getLengthSafe(intArraySizeOne));
    assertEquals(5, ArrayUtils.getLengthSafe(intArraySizeFive));
  }

  @Test
  public void getLengthSafe_Collection_isCorrect() throws Exception {
    // null
    assertEquals(0, ArrayUtils.getLengthSafe((Collection<?>) null));
    assertEquals(1, ArrayUtils.getLengthSafe(intListSizeOne));
    assertEquals(5, ArrayUtils.getLengthSafe(intListSizeFive));
  }
}