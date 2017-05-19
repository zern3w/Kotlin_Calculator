class operation : operations {
    override fun add(): Double {
        return val1+val2
    }

    override fun minus(): Double {
        return val1-val2
    }

    override fun multiply(): Double {
        return val1*val2
    }

    override fun divide(): Double {
        return val1/val2
    }

    override var val1: Double = 0.0
    override var val2: Double = 0.0

    constructor(val1: Double, val2: Double){
        this.val1 = val1
        this.val2 = val2
    }

}