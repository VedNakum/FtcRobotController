package com.example.meepmeeptesting;

import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.noahbres.meepmeep.MeepMeep;
import com.noahbres.meepmeep.roadrunner.DefaultBotBuilder;
import com.noahbres.meepmeep.roadrunner.entity.RoadRunnerBotEntity;

public class MeepMeepTesting {
    public static void main(String[] args) {
        MeepMeep meepMeep = new MeepMeep(800);

        RoadRunnerBotEntity myBot = new DefaultBotBuilder(meepMeep)
                // Set bot constraints: maxVel, maxAccel, maxAngVel, maxAngAccel, track width
                .setConstraints(60, 60, Math.toRadians(180), Math.toRadians(180), 15)
                .build();

        myBot.runAction(myBot.getDrive().actionBuilder(new Pose2d(65, 30, -85))
                .splineTo(new Vector2d(10, 25), Math.toRadians(-90))
                .waitSeconds(5)
                .splineTo(new Vector2d(40, 40), Math.toRadians(180))
                .strafeTo(new Vector2d(40, 57))
                .waitSeconds(2)
                .splineTo(new Vector2d(50, 56), Math.toRadians(-25))
                .waitSeconds(2)
                .splineTo(new Vector2d(40, 53), Math.toRadians(180))
                .lineToX(37)
                .waitSeconds(2)
                .splineTo(new Vector2d(50, 56), Math.toRadians(-25))
                .strafeTo(new Vector2d(55, 67))
                .build());

        meepMeep.setBackground(MeepMeep.Background.FIELD_CENTERSTAGE_OFFICIAL)
                .setDarkMode(true)
                .setBackgroundAlpha(0.25f)
                .addEntity(myBot)
                .start();
    }
}