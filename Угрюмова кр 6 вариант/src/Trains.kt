package Trainn
interface Trains {
    val number: Int
    val punktStart: String
    val punktFinish: String
    val dateStars: String
    val timeStart: String
    val wayTime: Int
    open fun InfoTrainStart(){
        println("поезд №$number, начальный пункт: $punktStart, дата выезда: $dateStars, время выезда: $timeStart")
    }
    open fun InfotrainFinish(){
        println("поезд №$number, конечный пункт: $punktFinish, время поездки в минутах: $wayTime")
    }
}