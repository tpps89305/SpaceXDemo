package play.dispy.spacexdemo

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform