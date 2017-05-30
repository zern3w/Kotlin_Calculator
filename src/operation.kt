class operation : operations {
    val val1: Double
    val val2: Double

    override fun add(): Double
            = val1+val2

    override fun minus(): Double
            = val1-val2

    override fun multiply(): Double
            = val1*val2

    override fun divide(): Double
            = val1/val2

    constructor(val1: Double, val2: Double){
        this.val1 = val1
        this.val2 = val2
    }
}