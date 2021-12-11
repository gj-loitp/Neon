package com.zero.neon.game.ship.ship

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Rect
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.zero.neon.game.spaceobject.Booster
import com.zero.neon.game.spaceobject.SpaceObject
import java.util.*

class ShipManager(private val screenWidthDp: Dp, screenHeightDp: Dp) {

    private val shipSize = 90.dp
    val ship = Ship(
        size = shipSize,
        shieldEnabled = false,
        shieldSize = shipSize * 2,
        xOffset = screenWidthDp / 2 - shipSize / 2,
        yOffset = screenHeightDp - 140.dp,
        moveLeft = { moveShipLeft(it) },
        moveRight = { moveShipRight(it) }
    )

    private val spaceShipCollidePower = 100
    private val movementSpeed: Dp = 2.dp

    private var movingLeft = false
    private var movingRight = false

    private fun moveShipLeft(movingLeft: Boolean) {
        this.movingLeft = movingLeft
    }

    private fun moveShipRight(movingRight: Boolean) {
        this.movingRight = movingRight
    }

    val moveShipId = UUID.randomUUID().toString()
    fun moveShip() {
        if (movingLeft && ship.xOffset >= 0.dp - ship.size / 4) {
            ship.xOffset -= movementSpeed
        } else movingLeft = false
        if (movingRight && ship.xOffset <= screenWidthDp - (ship.size.value / 1.5).dp) {
            ship.xOffset += movementSpeed
        } else movingRight = false
    }

    private var shieldEnabledGlobalTimeMillis: Long = 0
    private val shieldDurationMillis: Long = 10000
    private fun shieldEndDurationMillis() = shieldEnabledGlobalTimeMillis + shieldDurationMillis
    private fun enableShield(enable: Boolean) {
        ship.shieldEnabled = enable
        if (enable) {
            shieldEnabledGlobalTimeMillis = System.currentTimeMillis()
        }
    }

    val monitorShipSpaceObjectsCollisionId = UUID.randomUUID().toString()
    fun monitorShipSpaceObjectsCollision(
        spaceObjects: List<SpaceObject>,
        fileUltimateLaser: () -> Unit
    ) {
        val shipRect = Rect(
            offset = Offset(x = ship.xOffset.value, y = ship.yOffset.value),
            size = Size(width = ship.size.value, height = ship.size.value)
        )
        val shipRadius = ship.size.value / 2
        val shipShieldRect = Rect(
            center = Offset(
                x = ship.xOffset.value + shipRadius,
                y = ship.yOffset.value + shipRadius
            ),
            radius = shipRadius
        )
        spaceObjects.forEachIndexed { spaceObjectIndex, spaceObject ->
            val spaceRect = Rect(
                offset = Offset(x = spaceObject.xOffset.value, y = spaceObject.yOffset.value),
                size = Size(width = spaceObject.size.value, height = spaceObject.size.value)
            )
            if (spaceRect.overlaps(if (ship.shieldEnabled) shipShieldRect else shipRect)) {
                spaceObjects[spaceObjectIndex].onObjectImpact(spaceShipCollidePower)

                if (!ship.shieldEnabled) {
                    ship.hp -= spaceObject.impactPower
                }

                if (spaceObject.drawableId == Booster.BoosterType.ULTIMATE_WEAPON_BOOSTER.drawableId) {
                    fileUltimateLaser()
                } else if (spaceObject.drawableId == Booster.BoosterType.SHIELD_BOOSTER.drawableId) {
                    enableShield(enable = true)
                }
            }
        }

        if (shieldEndDurationMillis() < System.currentTimeMillis()) {
            enableShield(enable = false)
        }
    }
}