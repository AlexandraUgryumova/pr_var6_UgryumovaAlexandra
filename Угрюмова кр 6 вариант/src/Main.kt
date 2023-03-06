import kotlinx.coroutines.*
import kotlinx.coroutines.launch
import Trainn.Trains as newTrain
fun main(){
    var n: Int
    var number1: Int
    var punktStart1: String
    var punktFinish1: String
    var dateStars1: String
    var timeStart1: String
    var wayTime1: Int
    while (true) {
        println("введите количество поездов")
        n = readLine()!!.toInt()
        if(n>0) break
    }
    for(i in 1..n){
        GlobalScope.launch{
            while(true){
                println("введите номер поезда")
                number1 = readLine()!!.toInt()
                println("введите начальный пункт")
                punktStart1 = readLine().toString()
                println("")
                punktFinish1 = readLine().toString()
                dateStars1= readLine().toString()
                timeStart1 = readLine().toString()
                wayTime1 = readLine()!!.toInt()

            }
        }
        for(i in 1..n){

        }
    }

}