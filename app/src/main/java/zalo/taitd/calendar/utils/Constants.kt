package zalo.taitd.calendar.utils

import android.accounts.Account
import android.provider.CalendarContract

object Constants {
    const val CALENDAR_PERMISSIONS_REQUEST = 0

    const val EVENT_ID = "EVENT_ID"

    const val ONE_MIN_IN_MILLISECOND = 60 * 1000
    const val ONE_HOUR_IN_MILLISECOND = 60 * ONE_MIN_IN_MILLISECOND
    const val ONE_DAY_IN_MILLISECOND = 24 * ONE_HOUR_IN_MILLISECOND

    const val ACTION_RESCHEDULE_REMINDERS = "ACTION_RESCHEDULE_REMINDERS"


    const val ACCOUNT_TYPE = "zalo.taitd.calendar"
    const val ACCOUNT_NAME = "dummyaccount"
    const val AUTHORITY = CalendarContract.AUTHORITY

    val ACCOUNT = Account(ACCOUNT_NAME, ACCOUNT_TYPE)
}