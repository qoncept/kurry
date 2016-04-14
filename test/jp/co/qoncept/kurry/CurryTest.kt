package jp.co.qoncept.kurry

import curry
import org.junit.Test

import org.junit.Assert.*

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
class CurryTest {

    @Test
    @Throws(Exception::class)
    fun testCurry() {
        assertEquals(curry { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int, i: Int, j: Int, k: Int, l: Int, m: Int, n: Int, o: Int, p: Int, q: Int, r: Int, s: Int, t: Int, u: Int ->
            a + b + c + d + e + f + g + h + i + j + k + l + m + n + o + p + q + r + s + t + u
        }(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)(13)(14)(15)(16)(17)(18)(19)(20)(21), 231)
    }
}
