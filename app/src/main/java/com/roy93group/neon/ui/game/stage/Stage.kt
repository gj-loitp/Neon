package com.roy93group.neon.ui.game.stage

import com.roy93group.neon.R
import com.roy93group.neon.ui.game.common.Millis
import com.roy93group.neon.ui.game.common.Never
import com.roy93group.neon.ui.game.common.RepeatTime
import com.roy93group.neon.ui.game.enemy.ship.model.EnemyType
import com.roy93group.neon.ui.game.enemy.ship.model.LevelOneBossType
import com.roy93group.neon.ui.game.enemy.ship.model.LevelTwoBossType
import com.roy93group.neon.ui.game.enemy.ship.model.RegularEnemyType
import com.roy93group.neon.ui.game.enemy.ship.model.Row
import com.roy93group.neon.ui.game.enemy.ship.model.ZigZag
import com.roy93group.neon.ui.game.enemy.ship.model.ZigZagInitialPosition
import java.io.Serializable
import java.util.*

val stages = listOf(
    StageMessage(
        message = "Stage 1",
        durationMillis = 3
    ),
    StageMessage(
        message = "Get ready!",
        durationMillis = 3
    ),
    StageMessage(
        message = "GO!",
        durationMillis = 1
    ),
    StageGame(
        spaceRockSpawnRateMillis = Never,
        enemyType = RegularEnemyType(
            drawableId = R.drawable.enemy_red_1,
            width = 40f,
            height = 40f,
            hp = 180f,
            impactPower = 60f,
            formation = ZigZag(position = ZigZagInitialPosition.RIGHT),
            xOffsetSpeed = 0.5f,
            yOffsetSpeed = 0.4f,
            enemySpawnRate = Millis(1000)
        ),
        durationTimeSec = 5
    ),
    StageGame(
        spaceRockSpawnRateMillis = Never,
        enemyType = RegularEnemyType(
            drawableId = R.drawable.enemy_red_2,
            width = 30f,
            height = 40f,
            hp = 150f,
            impactPower = 50f,
            formation = Row(rowCount = 3),
            xOffsetSpeed = 0.8f,
            yOffsetSpeed = 0.5f,
            enemySpawnRate = Millis(1000)
        ),
        durationTimeSec = 4
    ),
    StageGame(
        spaceRockSpawnRateMillis = Millis(2000),
        enemyType = RegularEnemyType(
            drawableId = R.drawable.enemy_red_3,
            width = 45f,
            height = 45f,
            hp = 220f,
            impactPower = 65f,
            formation = ZigZag(position = ZigZagInitialPosition.LEFT),
            xOffsetSpeed = 0.6f,
            yOffsetSpeed = 0.6f,
            enemySpawnRate = Millis(900)
        ),
        durationTimeSec = 5
    ),
    StageGame(
        spaceRockSpawnRateMillis = Never,
        enemyType = RegularEnemyType(
            drawableId = R.drawable.enemy_red_1,
            width = 30f,
            height = 40f,
            hp = 150f,
            impactPower = 50f,
            formation = Row(rowCount = 3),
            xOffsetSpeed = 0.8f,
            yOffsetSpeed = 0.7f,
            enemySpawnRate = Millis(1000)
        ),
        durationTimeSec = 4
    ),
    StageMessage(
        message = "Boss fight",
        durationMillis = 3
    ),
    StageMessage(
        message = "Get ready!",
        durationMillis = 3
    ),
    StageMessage(
        message = "GO!",
        durationMillis = 1
    ),
    StageBoss(bossId = UUID.randomUUID().toString(), enemyType = LevelOneBossType),
    StageMessage(
        message = "Rekt",
        durationMillis = 3
    ),
    StageMessage(
        message = "Stage 2",
        durationMillis = 3
    ),
    StageMessage(
        message = "Get ready!",
        durationMillis = 3
    ),
    StageMessage(
        message = "GO!",
        durationMillis = 1
    ),
    StageGame(
        spaceRockSpawnRateMillis = Never,
        enemyType = RegularEnemyType(
            drawableId = R.drawable.enemy_green_1,
            width = 35f,
            height = 40f,
            hp = 220f,
            impactPower = 65f,
            formation = ZigZag(position = ZigZagInitialPosition.LEFT),
            xOffsetSpeed = 0.5f,
            yOffsetSpeed = 0.7f,
            enemySpawnRate = Millis(900)
        ),
        durationTimeSec = 15
    ),
    StageGame(
        spaceRockSpawnRateMillis = Never,
        enemyType = RegularEnemyType(
            drawableId = R.drawable.enemy_green_2,
            width = 40f,
            height = 40f,
            hp = 230f,
            impactPower = 70f,
            formation = ZigZag(position = ZigZagInitialPosition.RIGHT),
            xOffsetSpeed = 0.5f,
            yOffsetSpeed = 0.5f,
            enemySpawnRate = Millis(800)
        ),
        durationTimeSec = 15
    ),
    StageGame(
        spaceRockSpawnRateMillis = Never,
        enemyType = RegularEnemyType(
            drawableId = R.drawable.enemy_green_3,
            width = 45f,
            height = 45f,
            hp = 240f,
            impactPower = 75f,
            formation = ZigZag(position = ZigZagInitialPosition.LEFT),
            xOffsetSpeed = 0.6f,
            yOffsetSpeed = 0.6f,
            enemySpawnRate = Millis(800)
        ),
        durationTimeSec = 15
    ),
    StageGame(
        spaceRockSpawnRateMillis = Never,
        enemyType = RegularEnemyType(
            drawableId = R.drawable.enemy_green_4,
            width = 50f,
            height = 50f,
            hp = 250f,
            impactPower = 80f,
            formation = ZigZag(position = ZigZagInitialPosition.RIGHT),
            xOffsetSpeed = 0.6f,
            yOffsetSpeed = 0.6f,
            enemySpawnRate = Millis(800)
        ),
        durationTimeSec = 15
    ),
    StageMessage(
        message = "Boss fight",
        durationMillis = 3
    ),
    StageMessage(
        message = "Get ready!",
        durationMillis = 3
    ),
    StageMessage(
        message = "GO!",
        durationMillis = 1
    ),
    StageBoss(bossId = UUID.randomUUID().toString(), enemyType = LevelTwoBossType),
    StageMessage(
        message = "Great!",
        durationMillis = 3
    ),
    StageMessage(
        message = "Stage 3",
        durationMillis = 3
    ),
    StageMessage(
        message = "Get ready!",
        durationMillis = 3
    ),
    StageMessage(
        message = "GO!",
        durationMillis = 1
    ),
    StageGame(
        spaceRockSpawnRateMillis = Millis(1000),
        enemyType = RegularEnemyType(
            drawableId = R.drawable.enemy_light_blue_1,
            width = 37f,
            height = 37f,
            hp = 220f,
            impactPower = 65f,
            formation = ZigZag(position = ZigZagInitialPosition.LEFT),
            xOffsetSpeed = 0.7f,
            yOffsetSpeed = 0.8f,
            enemySpawnRate = Millis(900)
        ),
        durationTimeSec = 10
    ),
    StageGame(
        spaceRockSpawnRateMillis = Millis(1000),
        enemyType = RegularEnemyType(
            drawableId = R.drawable.enemy_light_blue_2,
            width = 38f,
            height = 42f,
            hp = 230f,
            impactPower = 70f,
            formation = ZigZag(position = ZigZagInitialPosition.RIGHT),
            xOffsetSpeed = 0.7f,
            yOffsetSpeed = 0.8f,
            enemySpawnRate = Millis(900)
        ),
        durationTimeSec = 10
    ),
    StageGame(
        spaceRockSpawnRateMillis = Millis(1000),
        enemyType = RegularEnemyType(
            drawableId = R.drawable.enemy_light_blue_3,
            width = 42f,
            height = 40f,
            hp = 220f,
            impactPower = 71f,
            formation = ZigZag(position = ZigZagInitialPosition.RIGHT),
            xOffsetSpeed = 0.8f,
            yOffsetSpeed = 0.8f,
            enemySpawnRate = Millis(900)
        ),
        durationTimeSec = 10
    ),
    StageGame(
        spaceRockSpawnRateMillis = Millis(1000),
        enemyType = RegularEnemyType(
            drawableId = R.drawable.enemy_light_blue_4,
            width = 43f,
            height = 41f,
            hp = 220f,
            impactPower = 73f,
            formation = Row(rowCount = 4),
            xOffsetSpeed = 0.0f,
            yOffsetSpeed = 0.8f,
            enemySpawnRate = Millis(900)
        ),
        durationTimeSec = 4
    ),
    StageGame(
        spaceRockSpawnRateMillis = Millis(1000),
        enemyType = RegularEnemyType(
            drawableId = R.drawable.enemy_light_blue_5,
            width = 44f,
            height = 40f,
            hp = 220f,
            impactPower = 73f,
            formation = Row(rowCount = 5),
            xOffsetSpeed = 0.0f,
            yOffsetSpeed = 0.8f,
            enemySpawnRate = Millis(900)
        ),
        durationTimeSec = 4
    ),
    StageMessage(
        message = "End",
        durationMillis = 3
    ),
)

sealed class Stage(val durationSec: Int) : Serializable

data class StageMessage(val message: String, val durationMillis: Int) : Stage(durationMillis)
data class StageGame(
    val spaceRockSpawnRateMillis: RepeatTime = Never,
    val enemyType: EnemyType,
    val durationTimeSec: Int
) : Stage(durationTimeSec)

data class StageBoss(val bossId: String, val enemyType: EnemyType) : Stage(1)
object StageBreak : Stage(3)