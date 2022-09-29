package hilos

import java.io.File
import java.util.concurrent.CompletableFuture
import java.util.concurrent.Future
import kotlin.system.measureNanoTime
import kotlin.system.measureTimeMillis
import kotlin.time.Duration.Companion.seconds


fun main() {
    var tiempo= measureNanoTime { // Podemos leer ficheros de texto de la siguiente manera
        val texto1File = "data${File.separator}PSP01"
        val texto2File = "data${File.separator}ejerciciospsp.txt"
        if (!File(texto1File).exists()) {
            throw IllegalArgumentException("El fichero $texto1File no existe")
        }
        if (!File(texto2File).exists()) {
            throw IllegalArgumentException("El fichero $texto2File no existe")
        }
        File(texto1File).forEachLine {
            println(it)
        }
        File(texto2File).forEachLine {
            println(it)
        }
    }
   println("tiempo secuencial  es: $tiempo ms")

     tiempo= measureNanoTime { // Podemos leer ficheros de texto de la siguiente manera
        val texto1File = "data${File.separator}PSP01"
        val texto2File = "data${File.separator}ejerciciospsp.txt"
        if (!File(texto1File).exists()) {
            throw IllegalArgumentException("El fichero $texto1File no existe")
        }
        if (!File(texto2File).exists()) {
            throw IllegalArgumentException("El fichero $texto2File no existe")
        }
      //  val f1 = CompletableFuture()
    }
    println("tiempo con future es: $tiempo ms")





}