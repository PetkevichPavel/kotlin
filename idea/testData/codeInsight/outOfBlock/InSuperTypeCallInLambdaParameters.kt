// OUT_OF_CODE_BLOCK: FALSE

open class A(a: () -> Unit) {
    constructor(f: (String) -> Unit) : this({ -> f("") })
}

class B: A({ s<caret> -> "1" })
