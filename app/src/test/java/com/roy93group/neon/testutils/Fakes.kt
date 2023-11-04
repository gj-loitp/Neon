package com.roy93group.neon.testutils

import com.roy93group.neon.R
import com.roy93group.neon.game.booster.Booster
import com.roy93group.neon.game.common.Millis
import com.roy93group.neon.game.enemy.ship.model.*
import java.util.*

const val FAKE_SCREEN_WIDTH = 500f
const val FAKE_SCREEN_HEIGHT = 550f
val FAKE_TIME_MILLIS = System.currentTimeMillis()
val FAKE_UUID: String = UUID.randomUUID().toString()
val FAKE_ZIG_ZAG_FORMATION = ZigZag(position = ZigZagInitialPosition.LEFT)
val FAKE_ROW_FORMATION = Row(rowCount = 4)
val FAKE_REGULAR_ENEMY_TYPE: RegularEnemyType = RegularEnemyType(
    drawableId = R.drawable.enemy_green_2,
    width = 50f,
    height = 50f,
    hp = 200f,
    impactPower = 50f,
    formation = ZigZag(
        position = ZigZagInitialPosition.LEFT
    ),
    xOffsetSpeed = 0.5f,
    yOffsetSpeed = 0.5f,
    enemySpawnRate = Millis(1000)
)
val FAKE_ENEMY: RegularEnemy = RegularEnemy(
    screenWidth = FAKE_SCREEN_WIDTH,
    screenHeight = FAKE_SCREEN_HEIGHT,
    xOffset = 100f,
    type = FAKE_REGULAR_ENEMY_TYPE
)
val FAKE_ENEMIES: List<Enemy> = listOf(
    FAKE_ENEMY
)
val FAKE_BOOSTER = Booster("a", 100f, 40f, FAKE_SCREEN_HEIGHT)
val FAKE_BOOSTER_LIST = listOf(
    FAKE_BOOSTER
)