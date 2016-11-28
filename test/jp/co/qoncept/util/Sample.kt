package jp.co.qoncept.util

import org.testng.Assert.*
import org.testng.annotations.Test

class Sample {
    @Test
    fun sample() {
        val foo = curry(::Foo)(42)(true)("ABC")

        assertEquals(foo, Foo(42, true, "ABC"))
    }

}

data class Foo(val i: Int, val b: Boolean, val s: String) {}
