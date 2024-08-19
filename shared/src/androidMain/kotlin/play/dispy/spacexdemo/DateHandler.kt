package play.dispy.spacexdemo

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class AndroidDateHandler: DateHandler {
    override fun getToday(): String {
        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US)

        return sdf.format(Date())
    }
    
}

actual fun getDateHandler(): DateHandler = AndroidDateHandler()
