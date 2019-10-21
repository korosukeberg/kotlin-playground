fun main() {

    //let
    var aaa = "abc"
    var bbb = aaa.let { it.toUpperCase() }
    println("let: $bbb")
    println("let: $aaa")

    //with
    var ccc = "abc"
    ccc = with(StringBuilder()) {
        append("def")
        toString()
    }
    println("with: $ccc")

    //run
    val ddd = StringBuilder().run {
        append("run: ")
        append("ggg")
        toString()
    }
    println(ddd)

}
