package com.rakesh.jpmccodetest.data.location

import android.location.Location

interface LocationTracker {
    suspend fun getCurrentLocation(): Location?
}