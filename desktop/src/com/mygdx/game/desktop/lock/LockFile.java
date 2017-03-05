package com.mygdx.game.desktop.lock;


import java.io.File;

import org.apache.commons.io.FileUtils;

import com.mygdx.game.desktop.Main;


public class LockFile {

    public static boolean exists() {
        try {
            return new File(Main.LOCK_FILE).exists();
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
    }

    public static void deleteOnExit() {
        try {
            File file = new File(Main.LOCK_FILE);
            file.deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void create() {
        try {
            FileUtils.touch(new File(Main.LOCK_FILE));
        } catch (Exception e) {
            e.printStackTrace();
            // TODO do smth
        }
    }

}
