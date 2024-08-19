package play.dispy.spacexdemo

class Greeting {
    private val platform = getPlatform()
    private val dateHandler = getDateHandler()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

    fun getToday(): String {
        return dateHandler.getToday()
    }

}