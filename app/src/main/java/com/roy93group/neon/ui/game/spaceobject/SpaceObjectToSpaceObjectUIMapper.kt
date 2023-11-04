package com.roy93group.neon.ui.game.spaceobject

class SpaceObjectToSpaceObjectUIMapper {

    operator fun invoke(spaceObject: SpaceObject): SpaceObjectUI {
        return with(spaceObject) {
            SpaceObjectUI(
                id = id,
                size = size,
                xOffset = xOffset,
                yOffset = yOffset,
                rotation = rotation,
                drawableId = drawableId
            )
        }
    }
}