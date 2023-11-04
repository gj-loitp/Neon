package com.roy93group.neon.game.enemy.ship.mapper

import com.roy93group.neon.game.enemy.ship.model.Enemy
import com.roy93group.neon.game.enemy.ship.model.EnemyUI

class EnemyToEnemyUIMapper {

    operator fun invoke(enemy: Enemy): EnemyUI {
        return with(enemy) {
            EnemyUI(
                enemyId = enemyId,
                width = width,
                height = height,
                xOffset = xOffset,
                yOffset = yOffset,
                hpBarWidth = width / initialHp * hp,
                drawableId = drawableId
            )
        }
    }
}