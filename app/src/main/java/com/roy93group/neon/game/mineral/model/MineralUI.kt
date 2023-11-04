package com.roy93group.neon.game.mineral.model

import androidx.compose.runtime.Immutable

@Immutable
data class MineralUI(
    val xOffset: Float,
    val yOffset: Float,
    val width: Float,
    val alpha: Float
)