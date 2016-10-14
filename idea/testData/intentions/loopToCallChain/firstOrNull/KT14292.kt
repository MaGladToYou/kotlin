// WITH_RUNTIME
// INTENTION_TEXT: "Replace with 'filterNotNull().firstOrNull{}'"
// INTENTION_TEXT_2: "Replace with 'asSequence().filterNotNull().firstOrNull{}'"

fun getFirstValue() = "value"

fun foo(list: List<String?>): String? {
    var found: String? = null
    val value = getFirstValue()
    <caret>for (s in list)
        if (s != null)
            if(!s.startsWith("IMG:"))
                if (s.contains(value)) {
                    found = s
                    break
                }
    return found
}