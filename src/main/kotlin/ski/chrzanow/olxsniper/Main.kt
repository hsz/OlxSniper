package ski.chrzanow.olxsniper

import kotlinx.coroutines.runBlocking
import java.net.HttpURLConnection
import java.net.URI

val olxUrl = "https://www.olx.pl/koscino/q-elden%20ring/?min_id=943911448&reason=observed_search&search%5Bdist%5D=15&search%5Bfilter_float_price:to%5D=200"

fun main() = runBlocking {
    val connection = URI(olxUrl).toURL().openConnection() as HttpURLConnection
    val inputStream = connection.inputStream
    val content = inputStream.bufferedReader().use { it.readText() }
    println(content)
}
