// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.kForward;
import static edu.wpi.first.wpilibj.DoubleSolenoid.Value.kReverse;

public class Shooter extends SubsystemBase {
  
  CANSparkMax m_shooterMotor; 
  private final DoubleSolenoid m_shooterGate;

  /** Creates a new Shooter. */
  public Shooter(CANSparkMax shooterMotor, DoubleSolenoid shooterGate) {
    m_shooterMotor = shooterMotor;
    m_shooterGate = shooterGate;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  public void shooterOn() {
    m_shooterMotor.set(Constants.SHOOTER_SPEED);
  }

  public void shooterOff() {
    m_shooterMotor.set(0.0);
  }

  public void gateUp() {
    m_shooterGate.set(kForward);
  }

  public void gateDown() {
    m_shooterGate.set(kReverse);
  }
}
