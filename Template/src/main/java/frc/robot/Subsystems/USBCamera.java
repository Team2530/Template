// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.Subsystems;

import java.util.ArrayList;

import org.ejml.data.CMatrix;

import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.cscore.MjpegServer;
import edu.wpi.first.cscore.UsbCamera;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class USBCamera extends SubsystemBase {
  static MjpegServer mjpegServer = new MjpegServer("Current Camera", 1181);
  private static ArrayList<UsbCamera> allCameras = new ArrayList<UsbCamera>();

  /** Creates a new USBCamera. */
  public USBCamera() {
    CameraServer.startAutomaticCapture();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
