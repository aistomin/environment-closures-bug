package com.test

/**
 * Created by aistomin on 30.11.14.
 */
class CounterTest extends GroovyTestCase {


    void testWithClosures() {
        assertEquals(Counter.environments.get(), Counter.test.get())
    }
}
