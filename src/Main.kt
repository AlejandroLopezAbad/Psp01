
//processBuilder.command("powershell.exe","/C",

fun main() {
//Los procesos pueden estar activos ejecutandose, pausado, bloqueado
    // val p = Runtime.getRuntime().exec("ls -ls")
    val ls = ProcessBuilder("ls", "-ls", ".").start()
    val lsOut = ls.inputStream.bufferedReader()
        .lineSequence().filter { it.contains(".kts")||it.contains(".bat") }
        .joinToString("\n")
    //Esto seria un grep
    // esto es para esperar para que termine , se llama espera activa
    ls.waitFor()
    var exitValue = ls.exitValue()
    println("Valor de salida : $exitValue")

    //Tomamos la primera linea
    val ficheroCat=lsOut.lines().first().split(" ").last()
    println(ficheroCat)
    //Ahora hacemos el comando cat
    val cat = ProcessBuilder("cat",ficheroCat).start()
    cat.waitFor()
    val catOut= cat.inputStream.bufferedReader().readText()
    exitValue=cat.exitValue()
    println("valor de salida proceso cat : $exitValue")
    println(catOut)

    val grep= ProcessBuilder("grep",).start()

    //en los apuntes esta el 8 el ejercicio del grep


    //





}