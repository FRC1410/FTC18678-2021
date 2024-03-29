package org.firstinspires.ftc.teamcode.mechanisms.basicmechanisms;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;

public class DeadzonedController {
    private OpMode currentOpMode;
    private int controllerNum;
    private double deadzone;

    public DeadzonedController(OpMode opMode, int controllerNum, double deadzone) {
        this.currentOpMode = opMode;
        this.controllerNum = controllerNum;
        this.deadzone = deadzone;
    }

    private double GetHypotenuse(double axis1, double axis2) {
        return (Math.sqrt(Math.pow(axis1, 2) + Math.pow(axis2, 2)));
    }

    public double getLeftXAxis() {
        switch (controllerNum) {
            case 1:
                if (GetHypotenuse(currentOpMode.gamepad1.left_stick_x, currentOpMode.gamepad1.left_stick_y) <= deadzone) {
                    return 0;
                } else {
                    return ((GetHypotenuse(currentOpMode.gamepad1.left_stick_x, currentOpMode.gamepad1.left_stick_y) - deadzone) / (1 - deadzone))
                            * (currentOpMode.gamepad1.left_stick_x / GetHypotenuse(currentOpMode.gamepad1.left_stick_x, currentOpMode.gamepad1.left_stick_y));
                }
            case 2:
                if (GetHypotenuse(currentOpMode.gamepad2.left_stick_x, currentOpMode.gamepad2.left_stick_y) <= deadzone) {
                    return 0;
                } else {
                    return ((GetHypotenuse(currentOpMode.gamepad2.left_stick_x, currentOpMode.gamepad2.left_stick_y) - deadzone) / (1 - deadzone))
                            * (currentOpMode.gamepad2.left_stick_x / GetHypotenuse(currentOpMode.gamepad2.left_stick_x, currentOpMode.gamepad2.left_stick_y));
                }
        }
        return 0;
    }

    public double getLeftYAxis() {
        switch (controllerNum) {
            case 1:
                if (GetHypotenuse(currentOpMode.gamepad1.left_stick_x, currentOpMode.gamepad1.left_stick_y) <= deadzone) {
                    return 0;
                } else {
                    return ((GetHypotenuse(currentOpMode.gamepad1.left_stick_x, currentOpMode.gamepad1.left_stick_y) - deadzone) / (1 - deadzone))
                            * (currentOpMode.gamepad1.left_stick_y / GetHypotenuse(currentOpMode.gamepad1.left_stick_x, currentOpMode.gamepad1.left_stick_y));
                }
            case 2:
                if (GetHypotenuse(currentOpMode.gamepad2.left_stick_x, currentOpMode.gamepad2.left_stick_y) <= deadzone) {
                    return 0;
                } else {
                    return ((GetHypotenuse(currentOpMode.gamepad2.left_stick_x, currentOpMode.gamepad2.left_stick_y) - deadzone) / (1 - deadzone))
                            * (currentOpMode.gamepad2.left_stick_y / GetHypotenuse(currentOpMode.gamepad2.left_stick_x, currentOpMode.gamepad2.left_stick_y));
                }
        }
        return 0;
    }

    public double getRightXAxis() {
        switch (controllerNum) {
            case 1:
                if (GetHypotenuse(currentOpMode.gamepad1.right_stick_x, currentOpMode.gamepad1.right_stick_y) <= deadzone) {
                    return 0;
                } else {
                    return ((GetHypotenuse(currentOpMode.gamepad1.right_stick_x, currentOpMode.gamepad1.right_stick_y) - deadzone) / (1 - deadzone))
                            * (currentOpMode.gamepad1.right_stick_x / GetHypotenuse(currentOpMode.gamepad1.right_stick_x, currentOpMode.gamepad1.right_stick_y));
                }
            case 2:
                if (GetHypotenuse(currentOpMode.gamepad2.right_stick_x, currentOpMode.gamepad2.right_stick_y) <= deadzone) {
                    return 0;
                } else {
                    return ((GetHypotenuse(currentOpMode.gamepad2.right_stick_x, currentOpMode.gamepad2.right_stick_y) - deadzone) / (1 - deadzone))
                            * (currentOpMode.gamepad2.right_stick_x / GetHypotenuse(currentOpMode.gamepad2.right_stick_x, currentOpMode.gamepad2.right_stick_y));
                }
        }
        return 0;
    }

    public double getRightYAxis() {
        switch (controllerNum) {
            case 1:
                if (GetHypotenuse(currentOpMode.gamepad1.right_stick_x, currentOpMode.gamepad1.right_stick_y) <= deadzone) {
                    return 0;
                } else {
                    return ((GetHypotenuse(currentOpMode.gamepad1.right_stick_x, currentOpMode.gamepad1.right_stick_y) - deadzone) / (1 - deadzone))
                            * (currentOpMode.gamepad1.right_stick_y / GetHypotenuse(currentOpMode.gamepad1.right_stick_x, currentOpMode.gamepad1.right_stick_y));
                }
            case 2:
                if (GetHypotenuse(currentOpMode.gamepad2.right_stick_x, currentOpMode.gamepad2.right_stick_y) <= deadzone) {
                    return 0;
                } else {
                    return ((GetHypotenuse(currentOpMode.gamepad2.right_stick_x, currentOpMode.gamepad2.right_stick_y) - deadzone) / (1 - deadzone))
                            * (currentOpMode.gamepad2.right_stick_y / GetHypotenuse(currentOpMode.gamepad2.right_stick_x, currentOpMode.gamepad2.right_stick_y));
                }
        }
        return 0;
    }
}
