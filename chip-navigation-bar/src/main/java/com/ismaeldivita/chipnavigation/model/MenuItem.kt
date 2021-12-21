package com.ismaeldivita.chipnavigation.model

import android.graphics.PorterDuff
import androidx.annotation.ColorInt
import androidx.annotation.DimenRes
import androidx.annotation.DrawableRes

 class MenuItem(
    val id: Int,
    val title: CharSequence,
    val contentDescription: CharSequence?,
    @DrawableRes val icon: Int,
    val enabled: Boolean,
    val tintMode: PorterDuff.Mode?,
    @ColorInt val iconColor: Int,
    @ColorInt val textColor: Int,
    @ColorInt var backgroundColor: Int,
    val menuStyle: MenuStyle
)