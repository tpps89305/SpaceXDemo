package play.dispy.spacexdemo

import platform.Foundation.*

class IOSDateHandler: DateHandler {
    override fun getToday(): String {
        val dateFormatter = NSDateFormatter()
        dateFormatter.dateFormat = "yyyy-MM-dd HH:mm"
        val now = NSDate()
        return dateFormatter.stringFromDate(now)
    }

}

actual fun getDateHandler(): DateHandler = IOSDateHandler()
