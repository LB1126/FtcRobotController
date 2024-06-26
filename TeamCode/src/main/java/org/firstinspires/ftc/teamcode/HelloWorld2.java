package org.firstinspires.ftc.teamcode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
@TeleOp()
public class HelloWorld2 extends OpMode {

    @Override
    public void init() {
    }

    @Override
    public void loop() {
        double speedForward = -gamepad2.left_stick_y / 2.0;
        double deltaY = gamepad2.left_stick_y-gamepad2.right_stick_y;
        double sumOfPsiTrigs = gamepad2.right_trigger + gamepad2.left_trigger;
        telemetry.addData("Left stick x", gamepad2.left_stick_x);
        telemetry.addData("Left stick y", -gamepad2.left_stick_y);
        telemetry.addData("Right stick x", gamepad2.right_stick_x);
        telemetry.addData("Right stick y", -gamepad2.right_stick_y);
        telemetry.addData("Is B Pressed?:", gamepad2.b);
        telemetry.addData("Left y - Right y", deltaY);
        telemetry.addData("Sum of psi on trigs", sumOfPsiTrigs);
        telemetry.addData("speed Forward", speedForward);
        boolean x = false;
    }
}