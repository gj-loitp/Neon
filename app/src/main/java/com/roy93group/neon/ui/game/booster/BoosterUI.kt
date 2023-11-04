package com.roy93group.neon.ui.game.booster

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable
import java.io.Serializable

@Immutable
data class BoosterUI(
    val xOffset: Float,
    val yOffset: Float,
    val size: Float,
    @DrawableRes val drawableId: Int
) : Serializable