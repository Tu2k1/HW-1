
fun main() {
    val candles = 24
    val layers = 5
    println("Number of candles: $candles")
    println("Cake top length: $candles")
    println("Number of layers: $layers")
    printCakeCandles(candles)
    printCakeTop(candles)
    printCakeBottom(candles,layers)
}
fun printCakeCandles(candles: Int){
    print(" ")
    repeat(candles){
        print(",")
    }
    println()
    
    print(" ")
    repeat(candles){
        print("|")
    }
    println()
    
}
fun printCakeTop(candles:Int){
    repeat(candles+2){
        print("=")
    }
    println()
    
}
fun printCakeBottom(candles:Int,layers:Int){
    repeat(layers){
        repeat(candles+2){
            print("@")
        }
        println()
    }
}
