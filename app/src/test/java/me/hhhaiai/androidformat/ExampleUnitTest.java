package me.hhhaiai.androidformat;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 *
 * adb shell am instrument -w -m  -e debug false -e class 'me.hhhaiai.androidformat.ExampleInstrumentedTest' me.hhhaiai.androidformat.test/androidx.test.runner.AndroidJUnitRunner
 */
public class ExampleUnitTest {
    //adb shell am instrument -w -m    -e debug false -e class 'me.hhhaiai.androidformat.ExampleInstrumentedTest#useAppContext' me.hhhaiai.androidformat.test/androidx.test.runner.AndroidJUnitRunner
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }
}