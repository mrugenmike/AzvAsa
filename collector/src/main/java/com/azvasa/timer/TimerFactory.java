package com.azvasa.timer;

import java.util.Timer;

/**
 * Created by mrugen on 5/3/15.
 */
public class TimerFactory {
    private static Timer recoveryTimer = new Timer();

    public static Timer instance(){
        return recoveryTimer;
    }
}
