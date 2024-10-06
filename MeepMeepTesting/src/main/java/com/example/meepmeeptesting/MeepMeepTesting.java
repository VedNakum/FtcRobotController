package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class MeepMeepTesting {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(700);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(75, 75, Math.toRadians(180), Math.toRadians(180), 15)
                .build();

        myBot.runAction(myBot.getDrive().actionBuilder(new Pose2d(-13, -61, Math.toRadians(90)))
                .splineToConstantHeading(new Vector2d(-10,-40),Math.toRadians(180))
                        .waitSeconds(3)
                .splineToConstantHeading(new Vector2d(-48,-42),Math.toRadians(180))
                        .waitSeconds(3)
                .splineToConstantHeading(new Vector2d(-52,-52),Math.toRadians(-140))
                        .waitSeconds(2)
                .splineToConstantHeading(new Vector2d(-57,-37),Math.toRadians(90))
                        .waitSeconds(2)
                .splineToConstantHeading(new Vector2d(-52,-52),Math.toRadians(-140))
                        .waitSeconds(2)
                .splineTo(new Vector2d(-52,-25),Math.toRadians(-180))
                        .waitSeconds(2)
                .splineTo(new Vector2d(-52,-52),Math.toRadians(-140))









                //
                //.lineToY(55)
                //.setTangent(Math.toRadians(0))
                //.lineToX(32)
                //.setTangent(Math.toRadians(0))
                //.splineTo(new Vector2d(44,28), Math.toRadians(0))
                .build());

        meepMeep.setBackground(MeepMeep.Background.FIELD_INTO_THE_DEEP_JUICE_DARK)
                .setBackgroundAlpha(0.95f)
                .addEntity(myBot)
                .start();
//  <following code you were using previously>

    }
}