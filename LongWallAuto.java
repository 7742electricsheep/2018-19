package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous

public class LongWallAuto extends LinearOpMode {

    DcMotor liftMotor;
    DcMotor leftMotor;
    DcMotor rightMotor;
    DcMotor midMotor;

    @Override
    public void runOpMode() throws InterruptedException {
        liftMotor = hardwareMap.dcMotor.get("lift_motor");
        leftMotor = hardwareMap.dcMotor.get("left_motor");
        rightMotor = hardwareMap.dcMotor.get("right_motor");
        midMotor = hardwareMap.dcMotor.get("mid_motor");

        telemetry.addData("Status", "Waiting");
        telemetry.update();

        waitForStart();

        telemetry.addData("Status", "Running");
        telemetry.update();

//DON'T FORGET TO CHECK POS/NEG VALUES OF MOTORS

//Lowering the robot from the lander
        liftMotor.setPower(-0.5);
        sleep(1500);
        liftMotor.setPower(0.0);
//Backing up
        leftMotor.setPower(-0.5);
        rightMotor.setPower(-0.5);
        sleep(1200);
        leftMotor.setPower(0.0);
//Strafing left
        midMotor.setPower(0.5);
        sleep(4000);
        midMotor.setPower(0.0);
//Backing up
        leftMotor.setPower(-0.5);
        rightMotor.setPower(-0.5);
        sleep(5000);
        leftMotor.setPower(0.0);
//Strafing right
        midMotor.setPower(-0.5);
        sleep(7750);
        midMotor.setPower(0.0);
//Rotate 135 degrees counter-clockwise
        leftMotor.setPower(0.5);
        sleep(1300);
        leftMotor.setPower(0.0);
//Go forward
        leftMotor.setPower(0.5);
        rightMotor.setPower(0.5);
        sleep(2500);
        leftMotor.setPower(0.0);
        rightMotor.setPower(0.0);
//Strafe left
        midMotor.setPower(0.5);
        sleep(3000);
        midMotor.setPower(0.0);
    }}