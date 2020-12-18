package edu.csc413.tankgame.model;

import java.awt.image.BufferedImage;

/**
 * Model class representing a shell that has been fired by a tank. A shell has a position and an angle, as well as a
 * speed. Shells by default should be unable to turn and only move forward.
 */
// TODO: Notice that Shell has a lot in common with Tank. For full credit, you will need to find a way to share code
// between the two classes so that the logic for e.g. moveForward, etc. are not duplicated.
public class Shell extends Entity{
    private static final String SHELL_ID_PREFIX = "shell-"; //which tank shell belongs to
    private static final double MOVEMENT_SPEED = 4.0;


    private static long uniqueId = 0L;

    private final String id;
    private double x;
    private double y;
    private double angle;
    private String shellOwner;

    public Shell(String id, double x, double y, double angle, double height, double width) {
        super(getUniqueId(), x, y, angle, height, width);
        this.id = getUniqueId();
        this.x =x;
        this.y=y;
        this.angle=angle;
    }

    public static String getUniqueId() {
        return SHELL_ID_PREFIX + uniqueId++;
    }

    @Override
    public void move(GameState state) {
        moveForward();
    }

}
