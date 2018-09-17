package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.Disabled;

@TeleOp(name="GamepadTelemetryTest", group="Linear Opmode")
@Disabled
public class GamepadTelemetryTest extends LinearOpMode {

    @Override
    public void runOpMode() {

        telemetry.addData("Status", "Initialized");
        telemetry.update();

        waitForStart();

        while (opModeIsActive()) {

            boolean aButton = gamepad1.a;

            telemetry.addData("Status", "Running fine.");
            telemetry.addData("a Button", aButton);
            telemetry.update();
        }


    }


}
