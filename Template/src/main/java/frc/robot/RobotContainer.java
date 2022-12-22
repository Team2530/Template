package frc.robot;

import frc.robot.Commands.*;
import frc.robot.Libraries.*;
import frc.robot.Subsystems.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj2.command.*;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

import com.kauailabs.navx.frc.AHRS;

/**
 * This class is where the bulk of the robot should be declared. Since
 * Command-based is a "declarative" paradigm, very little robot logic should
 * actually be handled in the {@link Robot} periodic methods (other than the
 * scheduler calls). Instead, the structure of the robot (including subsystems,
 * commands, and button mappings) should be declared here.
 */
public class RobotContainer {

    final Joystick stick = new Joystick(Constants.JOYSTICK_PORT);
    final XboxController xbox = new XboxController(Constants.XBOX_PORT);

    private final AHRS m_ahrs = new AHRS();

    // ---------- Subsystems ----------\\
    DriveTrain driveTrain = new DriveTrain(m_ahrs, stick, xbox);

    // ---------- Autonomous Commands ----------\\

    // ---------- Commands ----------\\
    InstantCommand example = new InstantCommand(() -> {

    });
        

    // ---------- Global Toggles ----------\\

    public RobotContainer() {
        configureButtonBindings();
    }

    public void configureButtonBindings() {
        new JoystickButton(stick, 1).whenPressed(() -> {

        }).whenReleased(() -> {

        });

        new JoystickButton(xbox, 1).whileHeld(() -> {

        });
    }

    /**
     * Use this to pass the enable command to the main {@link Robot} class.
     * This command is run immediately when the robot is enabled (not simply turned
     * on), regardless of whether the robot is in teleop or autonomous.
     *
     * @return the command to run when the robot is enabled
     */
    public Command getEnableCommand() {
        return new InstantCommand(() -> driveTrain.reset());
    }

    /**
     * Use this to pass the autonomous command to the main {@link Robot} class.
     *
     * @return the command to run in autonomous
     */
    public Command getAutonomousCommand() {
        return null;
    }

    /**
     * Command to run in Telop mode
     * @return the command to run in Telop
     */
    public Command getTelopCommand() {
        return null;
    }
    /**
     * Command to run in Test Mode
     * @return the command to run in Test
     */
    public Command getTestCommand() {
        return null;
    }
}
