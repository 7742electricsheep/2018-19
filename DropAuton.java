package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
// import com.qualcomm.robotcore.eventloop.opmode.DcMotor;


@Autonomous

public class DropAuton extends LinearOpMode {

    DcMotor liftMotor;

    @Override
    public void runOpMode() throws InterruptedException {
        liftMotor = hardwareMap.dcMotor.get("lift_motor");

        telemetry.addData("Status", "Waiting");
        telemetry.update();

        waitForStart();

        telemetry.addData("Status", "Running");
        telemetry.update();

        liftMotor.setPower(-.25);

        sleep(2500);

        liftMotor.setPower(0.0);
    }}