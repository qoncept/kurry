fun <A, B> curry(function: (A) -> B): (A) -> B {
    return { a -> function(a) }
}

fun <A, B, C> curry(function: (A, B) -> C): (A) -> (B) -> C {
    return { a -> { b -> function(a, b) } }
}

fun <A, B , C, D> curry(function: (A, B, C) -> D): (A) -> (B) -> (C) -> D {
    return { a -> { b -> { c -> function(a, b, c) } } }
}

fun <A, B , C, D, E> curry(function: (A, B, C, D) -> E): (A) -> (B) -> (C) -> (D) -> E {
    return { a -> { b -> { c -> {d -> function(a, b, c, d) } } } }
}

fun <A, B , C, D, E, F> curry(function: (A, B, C, D, E) -> F): (A) -> (B) -> (C) -> (D) -> (E) -> F {
    return { a -> { b -> { c -> {d -> {e -> function(a, b, c, d, e) } } } } }
}

fun <A, B , C, D, E, F, G> curry(function: (A, B, C, D, E, F) -> G): (A) -> (B) -> (C) -> (D) -> (E) -> (F) -> G {
    return { a -> { b -> { c -> {d -> {e -> { f -> function(a, b, c, d, e, f) } } } } } }
}

fun <A, B , C, D, E, F, G, H> curry(function: (A, B, C, D, E, F, G) -> H): (A) -> (B) -> (C) -> (D) -> (E) -> (F) -> (G) -> H {
    return { a -> { b -> { c -> {d -> {e -> { f -> { g -> function(a, b, c, d, e, f, g) } } } } } } }
}

fun <A, B , C, D, E, F, G, H, I> curry(function: (A, B, C, D, E, F, G, H) -> I): (A) -> (B) -> (C) -> (D) -> (E) -> (F) -> (G) -> (H) -> I {
    return { a -> { b -> { c -> {d -> {e -> { f -> { g -> { h -> function(a, b, c, d, e, f, g, h) } } } } } } } }
}

fun <A, B , C, D, E, F, G, H, I, J> curry(function: (A, B, C, D, E, F, G, H, I) -> J): (A) -> (B) -> (C) -> (D) -> (E) -> (F) -> (G) -> (H) -> (I) -> J {
    return { a -> { b -> { c -> {d -> {e -> { f -> { g -> { h -> { i -> function(a, b, c, d, e, f, g, h, i) } } } } } } } } }
}

fun <A, B , C, D, E, F, G, H, I, J, K> curry(function: (A, B, C, D, E, F, G, H, I, J) -> K): (A) -> (B) -> (C) -> (D) -> (E) -> (F) -> (G) -> (H) -> (I) -> (J) -> K {
    return { a -> { b -> { c -> {d -> {e -> { f -> { g -> { h -> { i -> { j -> function(a, b, c, d, e, f, g, h, i, j) } } } } } } } } } }
}

fun <A, B , C, D, E, F, G, H, I, J, K, L> curry(function: (A, B, C, D, E, F, G, H, I, J, K) -> L): (A) -> (B) -> (C) -> (D) -> (E) -> (F) -> (G) -> (H) -> (I) -> (J) -> (K) -> L {
    return { a -> { b -> { c -> {d -> {e -> { f -> { g -> { h -> { i -> { j -> { k -> function(a, b, c, d, e, f, g, h, i, j, k) } } } } } } } } } } }
}
