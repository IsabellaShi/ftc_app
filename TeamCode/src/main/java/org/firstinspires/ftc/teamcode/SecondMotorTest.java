package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import org.firstinspires.ftc.teamcode.modules.GamepadV2;

/**
 * Created by shiyaoran on 2017/9/4.
 */

public class SecondMotorTest extends OpMode{
    private DcMotor Left, Right;

    private GamepadV2 pad1 = new GamepadV2();

    @Override
    public void init() {
        Left = hardwareMap.dcMotor.get("L");
        Right = hardwareMap.dcMotor.get("R");

        Left.setDirection(DcMotorSimple.Direction.REVERSE);

    }

    @Override
    public void loop() {
        pad1.update(gamepad1);

        Left.setPower(pad1.left_stick_y_exponential(1));
        Right.setPower(pad1.right_stick_y_exponential(1));
    }
}
