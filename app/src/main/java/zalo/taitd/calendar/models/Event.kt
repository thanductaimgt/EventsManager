package zalo.taitd.calendar.models


data class Event(
    val id: Long? = null,
    var title: String = "",
    var location: String = "",
    var description: String = "",
    var startTime: Long = (System.currentTimeMillis() / 3600000 + 1) * 3600000,
    var endTime: Long = startTime + 3600000,
    val accountName: String,
    val calendarId: Long,
    var isRepeatDaily:Boolean = false
) {
    companion object {
        const val PAYLOAD_TITLE = 0
        const val PAYLOAD_LOCATION = 1
        const val PAYLOAD_TIME = 2
        const val PAYLOAD_SELECT_STATE = 3
    }
}