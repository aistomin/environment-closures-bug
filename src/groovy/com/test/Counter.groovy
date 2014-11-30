package com.test

import java.util.concurrent.atomic.AtomicInteger

/**
 * Created by aistomin on 30.11.14.
 *
 * Class that contains counters of closures calls.
 */
class Counter {

    /**
     * Count environments {} closure calls in Config.groovy
     */
    static final def environments = new AtomicInteger(0)

    /**
     * Count environments { test{} } closure calls in Config.groovy
     */
    static final def test = new AtomicInteger(0)
}
