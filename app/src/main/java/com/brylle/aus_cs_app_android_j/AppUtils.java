package com.brylle.aus_cs_app_android_j;

import java.text.SimpleDateFormat;
import java.util.*;

public class AppUtils {

    // Firestore Keys of /users/user_x
    public static String KEY_FIRST_NAME = "first_name";
    public static String KEY_LAST_NAME = "last_name";
    public static String KEY_EMAIL = "email_address";
    public static String KEY_MOBILE_NUMBER = "mobile_number";
    public static String KEY_VOLUNTEER_HOURS = "volunteer_hours";
    public static String KEY_REGISTERED_EVENTS = "registered_events";
    // Firestore Keys of /metadata/counts
    public static String KEY_USER_COUNT = "user_count";
    // Firestore Keys of /events/event_x
    public static String KEY_EVENT_ID = "event_id";
    public static String KEY_REGISTERED_STUDENTS = "registered_students";

    public static String epochToDate(Long time) {
        return new SimpleDateFormat("MMM dd, yyyy", Locale.US).format(new Date(time));
    }

}