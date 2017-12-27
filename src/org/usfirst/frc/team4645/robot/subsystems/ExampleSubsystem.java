package org.usfirst.frc.team4645.robot.subsystems;

import org.usfirst.frc.team4645.robot.RobotMap;
import org.usfirst.frc.team4645.robot.commands.ExampleCommand;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class ExampleSubsystem extends Subsystem 
{
	
	public static TalonSRX motorFL = new TalonSRX(1);
	public static TalonSRX motorFR = new TalonSRX(2);
	public static TalonSRX motorBR = new TalonSRX(3);
	public static TalonSRX motorBL = new TalonSRX(4);
	RobotDrive rb = new RobotDrive(motorFL, motorFR, motorBL, motorBR);
	
	Joystick joy1 = new Joystick(1) ; 
	Joystick joy2 = new Joystick(2) ;
	
	public void initDefaultCommand() 
	{
		
		setDefaultCommand(new ExampleCommand());
	}
	
	public void driveMethod()
	{
	motorFL.set(joy1.getY());
	motorBL.set(joy1.getY());
	
	motorFR.set(joy2.getY());
	motorBR.set(joy2.getY());
	
	}
	
	public void stopMethod()
	{
		motorFL.set(0);
		motorBL.set(0);
		
		motorFR.set(0);
		motorBR.set(0);
	}
}
