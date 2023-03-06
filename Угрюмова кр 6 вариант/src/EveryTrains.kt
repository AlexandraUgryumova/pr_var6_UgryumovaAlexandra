abstract class EveryTrains(val price: Double, val name: String, val wayTime: Int) {
constructor(price: Double, wayTime: Int) : this(1.5, "", wayTime)
    open fun EE(): Double{
        return price*wayTime
    }
}