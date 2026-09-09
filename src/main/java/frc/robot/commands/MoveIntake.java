package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.constants.IntakeConstants;
import frc.robot.subsytems.IntakeSubsystem;

public class MoveIntake extends Command {
    private final IntakeSubsystem subsystem;

    public MoveIntake(IntakeSubsystem sub) {
        this.subsystem = sub;
    }

    @Override
    public void initialize() {}

    @Override
    public void execute() {
        subsystem.setVoltage(IntakeConstants.ARM_MOTOR.SET_VOLTAGE);
    }

    @Override
    public void end(boolean interrupted) {
        subsystem.stopArm();
    }

    @Override
    public boolean isFinished() {
        return false;
    }
}
