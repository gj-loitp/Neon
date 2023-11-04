package com.roy93group.neon.game.mineral.mapper

import com.roy93group.neon.game.mineral.model.Mineral
import com.roy93group.neon.game.mineral.model.MineralUI

class MineralToMineralUIMapper {

    operator fun invoke(mineral: Mineral): MineralUI {
        return with(mineral) {
            MineralUI(
                xOffset = xOffset,
                yOffset = yOffset,
                width = width,
                alpha = alpha
            )
        }
    }
}