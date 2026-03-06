package com.kuzmina.grade_clicker_k.model

import android.window.TrustedPresentationThresholds
import androidx.annotation.DrawableRes

data class Grade(
    @DrawableRes val imageId: Int,
    val pointPerClick: Int,
    val threshold: Int
) {}