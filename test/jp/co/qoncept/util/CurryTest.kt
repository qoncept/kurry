package jp.co.qoncept.util

import org.testng.Assert.*
import org.testng.annotations.Test

class CurryTest {
    @Test
    fun testCurry1() {
        assertEquals(curry { a: Int -> a }(1), 1)
    }
    @Test
    fun testCurry2() {
        assertEquals(curry { a: Int, b: Int ->
            a + b
        }(1)(2), 3)
    }
    @Test
    fun testCurry3() {
        assertEquals(curry { a: Int, b: Int, c: Int ->
            a + b + c
        }(1)(2)(3), 6)
    }
    @Test
    fun testCurry4() {
        assertEquals(curry { a: Int, b: Int, c: Int, d: Int ->
            a + b + c + d
        }(1)(2)(3)(4), 10)
    }
    @Test
    fun testCurry5() {
        assertEquals(curry { a: Int, b: Int, c: Int, d: Int, e: Int ->
            a + b + c + d + e
        }(1)(2)(3)(4)(5), 15)
    }
    @Test
    fun testCurry6() {
        assertEquals(curry { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int ->
            a + b + c + d + e + f
        }(1)(2)(3)(4)(5)(6), 21)
    }
    @Test
    fun testCurry7() {
        assertEquals(curry { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int ->
            a + b + c + d + e + f + g
        }(1)(2)(3)(4)(5)(6)(7), 28)
    }
    @Test
    fun testCurry8() {
        assertEquals(curry { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int ->
            a + b + c + d + e + f + g + h
        }(1)(2)(3)(4)(5)(6)(7)(8), 36)
    }
    @Test
    fun testCurry9() {
        assertEquals(curry { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int, i: Int ->
            a + b + c + d + e + f + g + h + i
        }(1)(2)(3)(4)(5)(6)(7)(8)(9), 45)
    }
    @Test
    fun testCurry10() {
        assertEquals(curry { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int, i: Int, j: Int ->
            a + b + c + d + e + f + g + h + i + j
        }(1)(2)(3)(4)(5)(6)(7)(8)(9)(10), 55)
    }
    @Test
    fun testCurry11() {
        assertEquals(curry { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int, i: Int, j: Int, k: Int ->
            a + b + c + d + e + f + g + h + i + j + k
        }(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11), 66)
    }
    @Test
    fun testCurry12() {
        assertEquals(curry { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int, i: Int, j: Int, k: Int, l: Int ->
            a + b + c + d + e + f + g + h + i + j + k + l
        }(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12), 78)
    }
    @Test
    fun testCurry13() {
        assertEquals(curry { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int, i: Int, j: Int, k: Int, l: Int, m: Int ->
            a + b + c + d + e + f + g + h + i + j + k + l + m
        }(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)(13), 91)
    }
    @Test
    fun testCurry14() {
        assertEquals(curry { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int, i: Int, j: Int, k: Int, l: Int, m: Int, n: Int ->
            a + b + c + d + e + f + g + h + i + j + k + l + m + n
        }(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)(13)(14), 105)
    }
    @Test
    fun testCurry15() {
        assertEquals(curry { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int, i: Int, j: Int, k: Int, l: Int, m: Int, n: Int, o: Int ->
            a + b + c + d + e + f + g + h + i + j + k + l + m + n + o
        }(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)(13)(14)(15), 120)
    }
    @Test
    fun testCurry16() {
        assertEquals(curry { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int, i: Int, j: Int, k: Int, l: Int, m: Int, n: Int, o: Int, p: Int ->
            a + b + c + d + e + f + g + h + i + j + k + l + m + n + o + p
        }(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)(13)(14)(15)(16), 136)
    }
    @Test
    fun testCurry17() {
        assertEquals(curry { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int, i: Int, j: Int, k: Int, l: Int, m: Int, n: Int, o: Int, p: Int, q: Int ->
            a + b + c + d + e + f + g + h + i + j + k + l + m + n + o + p + q
        }(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)(13)(14)(15)(16)(17), 153)
    }
    @Test
    fun testCurry18() {
        assertEquals(curry { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int, i: Int, j: Int, k: Int, l: Int, m: Int, n: Int, o: Int, p: Int, q: Int, r: Int ->
            a + b + c + d + e + f + g + h + i + j + k + l + m + n + o + p + q + r
        }(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)(13)(14)(15)(16)(17)(18), 171)
    }
    @Test
    fun testCurry19() {
        assertEquals(curry { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int, i: Int, j: Int, k: Int, l: Int, m: Int, n: Int, o: Int, p: Int, q: Int, r: Int, s: Int ->
            a + b + c + d + e + f + g + h + i + j + k + l + m + n + o + p + q + r + s
        }(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)(13)(14)(15)(16)(17)(18)(19), 190)
    }
    @Test
    fun testCurry20() {
        assertEquals(curry { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int, i: Int, j: Int, k: Int, l: Int, m: Int, n: Int, o: Int, p: Int, q: Int, r: Int, s: Int, t: Int ->
            a + b + c + d + e + f + g + h + i + j + k + l + m + n + o + p + q + r + s + t
        }(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)(13)(14)(15)(16)(17)(18)(19)(20), 210)
    }
    @Test
    fun testCurry21() {
        assertEquals(curry { a: Int, b: Int, c: Int, d: Int, e: Int, f: Int, g: Int, h: Int, i: Int, j: Int, k: Int, l: Int, m: Int, n: Int, o: Int, p: Int, q: Int, r: Int, s: Int, t: Int, u: Int ->
            a + b + c + d + e + f + g + h + i + j + k + l + m + n + o + p + q + r + s + t + u
        }(1)(2)(3)(4)(5)(6)(7)(8)(9)(10)(11)(12)(13)(14)(15)(16)(17)(18)(19)(20)(21), 231)
    }
}
