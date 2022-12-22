// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonFX;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
import edu.wpi.first.wpilibj.drive.RobotDriveBase;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class DriveTrain extends SubsystemBase {
  private AHRS ahrs;
  private Joystick stick;
  private XboxController xbox;

  RobotDriveBase driveBase;

  //---------- Drive Motors ----------\\
  WPI_TalonFX motorFL = new WPI_TalonFX(Constants.MOTOR_FL_PORT);
  WPI_TalonFX motorBL = new WPI_TalonFX(Constants.MOTOR_BL_PORT);
  WPI_TalonFX motorFR = new WPI_TalonFX(Constants.MOTOR_FR_PORT);
  WPI_TalonFX motorBR = new WPI_TalonFX(Constants.MOTOR_BR_PORT);


  /** Creates a new DriveTrain. */
  public DriveTrain(AHRS ahrs, Joystick stick, XboxController xbox) {
    this.ahrs = ahrs;
    this.stick = stick;
    this.xbox = xbox;

    // Todo: Create DriveTrain type


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void singleJoystickDrive(double x, double y, double z) {
  
  }

  public void reset() {
    // Todo: implement a reset method
  }

  public void stop() {
    // Todo: implement a stop method
  }

  /**
   * Use to create a MechanumDrive
   */
  private void mecanumDrive() {
    driveBase = new MecanumDrive(motorFL, motorBL, motorFR, motorBR);
    driveBase.setSafetyEnabled(false);
  }
  /**
   * Use to create a Tank Drive
   */
  private void tankDrive() {
    motorBR.follow(motorFR);
    motorBL.follow(motorFL);
    driveBase = new DifferentialDrive(motorFR, motorFL);
  }
}
