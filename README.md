# Kurry

_Kurry_ provides `curry` functions for currying in Kotlin.

```kotlin
data class Foo(val i: Int, val b: Boolean, val s: String) {}

val foo = curry(::Foo)(42)(true)("ABC")
```

## License

[The MIT License](LICENSE)
