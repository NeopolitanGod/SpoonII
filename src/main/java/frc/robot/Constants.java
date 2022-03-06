// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

/**
 * The Constants class provides a convenient place for teams to hold robot-wide numerical or boolean
 * constants. This class should not be used for any other purpose. All constants should be declared
 * globally (i.e. public static). Do not put anything functional in this class.
 *
 * <p>It is advised to statically import this class (or one of its inner classes) wherever the
 * constants are needed, to reduce verbosity.
 */
public final class Constants {

    //LIMELIGHT DISTANCE SETTINGS       
     
    // how many degrees back is your limelight rotated from perfectly vertical?
    public static double limelightMountAngleDegrees = 60.0;
    // distance from the center of the Limelight lens to the floor
    public static double limelightHeight = 20.0;
    // distance from the target to the floor
    public static double goalHeightInches = 104.0;

    /**
     * 0 = left
     * 1 = center
     * 2 = right
     */
    //Set this before the game, this will control the autonomous starting mode.
    public static int autoMode = 0;

}
