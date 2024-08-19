package play.dispy.spacexdemo

interface DateHandler {
    fun getToday(): String
}

expect fun getDateHandler(): DateHandler
