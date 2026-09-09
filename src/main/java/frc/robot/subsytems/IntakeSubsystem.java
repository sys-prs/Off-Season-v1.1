package frc.robot.subsytems;

import com.ctre.phoenix6.configs.TalonFXConfiguration;
import com.ctre.phoenix6.controls.Follower;
import com.ctre.phoenix6.hardware.TalonFX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.constants.IntakeConstants;

/*
 * ! se lo encargo a oswa y vale
 */

public class IntakeSubsystem extends SubsystemBase {
    private final TalonFX rightMotor = new TalonFX(IntakeConstants.RIGHT_MOTOR.ID);
    private final TalonFX leftMotor = new TalonFX(IntakeConstants.LEFT_MOTOR.ID);
    private final TalonFX armMotor = new TalonFX(IntakeConstants.ARM_MOTOR.ID);

    public IntakeSubsystem() {
        TalonFXConfiguration rightConfig = new TalonFXConfiguration();
        rightConfig.MotorOutput.Inverted = IntakeConstants.RIGHT_MOTOR.INVERTED;

        TalonFXConfiguration armConfig = new TalonFXConfiguration();
        armConfig.Slot0.kP = IntakeConstants.ARM_MOTOR.p;
        armConfig.Slot0.kI = IntakeConstants.ARM_MOTOR.i;
        armConfig.Slot0.kD = IntakeConstants.ARM_MOTOR.d;

        leftMotor.setControl(new Follower(rightMotor.getDeviceID(), IntakeConstants.LEFT_MOTOR.FOLLOW_RIGHT));
        rightMotor.getConfigurator().apply(rightConfig);
        armMotor.getConfigurator().apply(armConfig);
    }

    public void setSpeed(double speed) {
        rightMotor.set(speed); //-1.0 a 1.0
    }

    public void setVoltage(double voltage) {
        rightMotor.setVoltage(voltage);
    }

    public void stop() {
        rightMotor.stopMotor();
    }

    public void stopArm() {
        armMotor.stopMotor();
    }
}
