package me.hhhaiai.androidformat;

import junit.framework.TestCase;

/**
 * @Copyright © 2021 sanbo Inc. All rights reserved.
 * @Description: adb shell am instrument -w -m -e debug false -e class 'me.hhhaiai.androidformat.MainActivityTest' me.hhhaiai.androidformat.test/androidx.test.runner.AndroidJUnitRunner
 * @Version: 1.0 @Create:
 * 2021/11/1 5:16 下午
 *
 * @author: sanbo
 */
public class MainActivityTest extends TestCase {

  // adb shell am instrument -w -m    -e debug false -e class 'me.hhhaiai.androidformat.MainActivityTest#testOnCreate' me.hhhaiai.androidformat.test/androidx.test.runner.AndroidJUnitRunner
  public void testOnCreate() {
    System.out.println("onCreate");
  }
}