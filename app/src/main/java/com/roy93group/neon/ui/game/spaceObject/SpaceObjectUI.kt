package com.roy93group.neon.ui.game.spaceObject

import androidx.annotation.DrawableRes
import androidx.compose.runtime.Immutable
import java.io.Serializable

@Immutable
data class SpaceObjectUI(
    val id: String,
    val size: Float,
    val xOffset: Float,
    val yOffset: Float,
    val rotation: Float,
    @DrawableRes val drawableId: Int,
) : Serializable
