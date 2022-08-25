package com.example.motivationapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation(
    @StringRes val stringResourseId: Int,
    @DrawableRes val drawableResId: Int
)