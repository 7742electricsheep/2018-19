package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

@Autonomous

public class ShortWallAuto extends LinearOpMode {

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
        sleep(1500);
        midMotor.setPower(0.0);
//Backing up
        leftMotor.setPower(-0.5);
        rightMotor.setPower(-0.5);
        sleep(750);
        leftMotor.setPower(0.0);
//Strafing left
        midMotor.setPower(0.5);
        sleep(500);
        midMotor.setPower(0.0);
//Rotate 45 degrees counter-clockwise ??? TINKERRR
        leftMotor.setPower(0.5);
        sleep(400);
        leftMotor.setPower(0.0);
// Maybe go left?????
//Go forward
        leftMotor.setPower(0.5);
        rightMotor.setPower(0.5);
        sleep(2000);
        leftMotor.setPower(0.0);
        rightMotor.setPower(0.0);
//Maybe go left??
//Rotate servo
    }}