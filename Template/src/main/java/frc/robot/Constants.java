package frc.robot;

/**
 * Constans provides a place for all robot
 * constants to exist and be easily changed
 * throughout the entire program
 */
public class Constants {
    // ---------- Motor Constants ----------\\
    public static final int MOTOR_FL_PORT = 1;
    public static final int MOTOR_FR_PORT = 2;
    public static final int MOTOR_BL_PORT = 3;
    public static final int MOTOR_BR_PORT = 4;

    // ---------- Other Motor Ports ----------\\
    public static final int MOTOR_SHOOTER_PORT = 5;

    // ---------- Sensor Ports ----------\\

    // ---------- Sensor Constants ----------\\
    public static final int ENCODER_TICKS_PER_REVOLUTION = 2048;

    // ---------- PID Constants ----------\\

    // ---------- Field Constants ----------\\
    public static final double GRAVITY = 9.8;

    // in meters (standard field is roughly this size)
    public static final double FIELD_WIDTH = 8.1;
    public static final double FIELD_LENGTH = 16.48;

    // ---------- Driving Constants ----------\\
    public static final double WHEEL_RADIUS = 0;
    public static final double DRIVETRAIN_GEAR_RATIO = 1;

    // ---------- Joystick Constants ----------\\
    public static final int JOYSTICK_PORT = 1;
    public static final int XBOX_PORT = 2;

    public static final double DEADZONE = 0.05;
    // Todo: Add all joystick buttons as Constants

}
