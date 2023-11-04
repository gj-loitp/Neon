package com.roy93group.neon.game.laser

import com.roy93group.neon.game.ship.laser.LaserUI

class LaserToLaserUIMapper {

    operator fun invoke(laser: Laser): LaserUI {
        return with(laser) {
            LaserUI(
                id = id,
                xOffset = xOffset,
                yOffset = yOffset,
                width = width,
                height = height,
                rotation = rotation,
                drawableId = drawableId
            )
        }
    }
}