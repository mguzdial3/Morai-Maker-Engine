package dk.itu.mario.level;

import java.util.Random;

import dk.itu.mario.MarioInterface.Constraints;
import dk.itu.mario.MarioInterface.GamePlay;
import dk.itu.mario.MarioInterface.LevelInterface;
import dk.itu.mario.engine.sprites.SpriteTemplate;
import dk.itu.mario.engine.sprites.Enemy;

public class MyLevel extends Level
{
    private static long lastSeed;
    private static Random levelSeedRandom;

    private int difficulty;
    private int type;

    public MyLevel(int width, int height)
    {
        super(width, height);
    }

    public MyLevel(int width, int height, long seed, int difficulty, int type, GamePlay playerMetrics)
    {
        this(width, height);
        this.difficulty = difficulty;
        this.type = type;
        lastSeed = seed;
        levelSeedRandom = new Random(seed);

        setBlock(0, 13, GROUND);
        setBlock(1, 13, GROUND);
        setBlock(2, 13, GROUND);
        setBlock(3, 13, GROUND);
        setBlock(4, 13, GROUND);
        setBlock(5, 13, GROUND);
        setBlock(6, 13, GROUND);
        setBlock(7, 13, GROUND);
        setBlock(8, 13, GROUND);
        setBlock(8, 14, GROUND);
        setBlock(7, 14, GROUND);
        setBlock(0, 14, GROUND);
        setBlock(1, 14, GROUND);
        setBlock(2, 14, GROUND);
        setBlock(3, 14, GROUND);
        setBlock(4, 14, GROUND);
        setBlock(5, 14, GROUND);
        setBlock(6, 14, GROUND);
        setBlock(99, 13, GROUND);
        setBlock(98, 13, GROUND);
        setBlock(97, 13, GROUND);
        setBlock(96, 13, GROUND);
        setBlock(95, 13, GROUND);
        setBlock(94, 13, GROUND);
        setBlock(93, 13, GROUND);
        setBlock(92, 13, GROUND);
        setBlock(91, 13, GROUND);
        setBlock(90, 13, GROUND);
        setBlock(90, 14, GROUND);
        setBlock(91, 14, GROUND);
        setBlock(92, 14, GROUND);
        setBlock(93, 14, GROUND);
        setBlock(94, 14, GROUND);
        setBlock(95, 14, GROUND);
        setBlock(96, 14, GROUND);
        setBlock(99, 14, GROUND);
        setBlock(98, 14, GROUND);
        setBlock(97, 14, GROUND);
        setBlock(6, 12, BLOCK_EMPTY);
        setBlock(7, 11, BLOCK_EMPTY);
        setBlock(7, 12, BLOCK_EMPTY);
        setBlock(45, 11, BLOCK_EMPTY);
        setBlock(46, 11, BLOCK_EMPTY);
        setBlock(45, 12, BLOCK_EMPTY);
        setBlock(46, 12, BLOCK_EMPTY);
        setBlock(68, 9, BLOCK_EMPTY);
        setBlock(93, 12, BLOCK_EMPTY);
        setBlock(94, 11, BLOCK_EMPTY);
        setBlock(94, 12, BLOCK_EMPTY);
        setBlock(0, 1, BLOCK_EMPTY);
        setBlock(1, 1, BLOCK_EMPTY);
        setBlock(2, 1, BLOCK_EMPTY);
        setBlock(3, 1, BLOCK_EMPTY);
        setBlock(4, 1, BLOCK_EMPTY);
        setBlock(5, 1, BLOCK_EMPTY);
        setBlock(6, 1, BLOCK_EMPTY);
        setBlock(7, 1, BLOCK_EMPTY);
        setBlock(8, 1, BLOCK_EMPTY);
        setBlock(9, 1, BLOCK_EMPTY);
        setBlock(10, 1, BLOCK_EMPTY);
        setBlock(11, 1, BLOCK_EMPTY);
        setBlock(12, 1, BLOCK_EMPTY);
        setBlock(13, 1, BLOCK_EMPTY);
        setBlock(14, 1, BLOCK_EMPTY);
        setBlock(9, 13, GROUND);
        setBlock(9, 14, GROUND);
        setBlock(10, 13, GROUND);
        setBlock(10, 14, GROUND);
        setBlock(11, 13, GROUND);
        setBlock(11, 14, GROUND);
        setBlock(12, 13, GROUND);
        setBlock(12, 14, GROUND);
        setBlock(13, 13, GROUND);
        setBlock(13, 14, GROUND);
        setBlock(14, 13, GROUND);
        setBlock(14, 14, GROUND);
        setBlock(15, 13, GROUND);
        setBlock(15, 14, GROUND);
        setBlock(16, 13, GROUND);
        setBlock(16, 14, GROUND);
        setBlock(17, 13, GROUND);
        setBlock(17, 14, GROUND);
        setBlock(18, 13, GROUND);
        setBlock(18, 14, GROUND);
        setBlock(19, 13, GROUND);
        setBlock(19, 14, GROUND);
        setBlock(20, 13, GROUND);
        setBlock(20, 14, GROUND);
        setBlock(79, 14, BLOCK_EMPTY);
        setBlock(79, 13, BLOCK_EMPTY);
        setBlock(80, 13, BLOCK_EMPTY);
        setBlock(80, 14, BLOCK_EMPTY);
        setBlock(80, 12, BLOCK_EMPTY);
        setBlock(74, 1, BLOCK_EMPTY);
        setBlock(75, 1, BLOCK_EMPTY);
        setBlock(76, 1, BLOCK_EMPTY);
        setBlock(77, 1, BLOCK_EMPTY);
        setBlock(78, 1, BLOCK_EMPTY);
        setBlock(79, 1, BLOCK_EMPTY);
        setBlock(80, 1, BLOCK_EMPTY);
        setBlock(81, 1, BLOCK_EMPTY);
        setBlock(82, 1, BLOCK_EMPTY);
        setBlock(87, 1, BLOCK_EMPTY);
        setBlock(88, 1, BLOCK_EMPTY);
        setBlock(89, 1, BLOCK_EMPTY);
        setBlock(90, 1, BLOCK_EMPTY);
        setBlock(91, 1, BLOCK_EMPTY);
        setBlock(92, 1, BLOCK_EMPTY);
        setBlock(93, 1, BLOCK_EMPTY);
        setBlock(94, 1, BLOCK_EMPTY);
        setBlock(95, 1, BLOCK_EMPTY);
        setBlock(96, 1, BLOCK_EMPTY);
        setBlock(97, 1, BLOCK_EMPTY);
        setBlock(52, 13, GROUND);
        setBlock(52, 14, GROUND);
        setBlock(51, 14, GROUND);
        setBlock(50, 14, GROUND);
        setBlock(50, 13, GROUND);
        setBlock(49, 13, GROUND);
        setBlock(51, 13, GROUND);
        setBlock(48, 13, GROUND);
        setBlock(47, 13, GROUND);
        setBlock(46, 14, GROUND);
        setBlock(46, 13, GROUND);
        setBlock(45, 13, GROUND);
        setBlock(45, 14, GROUND);
        setBlock(47, 14, GROUND);
        setBlock(48, 14, GROUND);
        setBlock(49, 14, GROUND);
        setBlock(44, 14, GROUND);
        setBlock(44, 13, GROUND);
        setBlock(45, 10, BLOCK_EMPTY);
        setBlock(45, 9, BLOCK_EMPTY);
        setBlock(46, 10, BLOCK_EMPTY);
        setBlock(46, 9, BLOCK_EMPTY);
        setBlock(26, 13, GROUND);
        setBlock(27, 13, GROUND);
        setBlock(28, 13, GROUND);
        setBlock(28, 14, GROUND);
        setBlock(27, 14, GROUND);
        setBlock(26, 14, GROUND);
        setBlock(25, 14, GROUND);
        setBlock(25, 13, GROUND);
        setBlock(0, 13, HILL_TOP);
        setBlock(1, 13, HILL_TOP);
        setBlock(2, 13, HILL_TOP);
        setBlock(3, 13, HILL_TOP);
        setBlock(4, 13, HILL_TOP);
        setBlock(5, 13, HILL_TOP);
        setBlock(6, 13, HILL_TOP);
        setBlock(7, 13, HILL_TOP);
        setBlock(8, 13, HILL_TOP);
        setBlock(9, 13, HILL_TOP);
        setBlock(10, 13, HILL_TOP);
        setBlock(11, 13, HILL_TOP);
        setBlock(12, 13, HILL_TOP);
        setBlock(13, 13, HILL_TOP);
        setBlock(14, 13, HILL_TOP);
        setBlock(15, 13, HILL_TOP);
        setBlock(16, 13, HILL_TOP);
        setBlock(17, 13, HILL_TOP);
        setBlock(18, 13, HILL_TOP);
        setBlock(19, 13, HILL_TOP);
        setBlock(20, 13, HILL_TOP);
        setBlock(25, 13, HILL_TOP);
        setBlock(26, 13, HILL_TOP);
        setBlock(27, 13, HILL_TOP);
        setBlock(28, 13, HILL_TOP);
        setBlock(44, 13, HILL_TOP);
        setBlock(45, 13, HILL_TOP);
        setBlock(46, 13, HILL_TOP);
        setBlock(47, 13, HILL_TOP);
        setBlock(48, 13, HILL_TOP);
        setBlock(49, 13, HILL_TOP);
        setBlock(50, 13, HILL_TOP);
        setBlock(51, 13, HILL_TOP);
        setBlock(52, 13, HILL_TOP);
        setBlock(90, 13, HILL_TOP);
        setBlock(91, 13, HILL_TOP);
        setBlock(92, 13, HILL_TOP);
        setBlock(93, 13, HILL_TOP);
        setBlock(94, 13, HILL_TOP);
        setBlock(95, 13, HILL_TOP);
        setBlock(96, 13, HILL_TOP);
        setBlock(97, 13, HILL_TOP);
        setBlock(98, 13, HILL_TOP);
        setBlock(99, 13, HILL_TOP);

        xExit = 98;
        yExit = 14;
    }
}
