package com.afroraydude.mods.randomstuff.util;

import com.afroraydude.mods.randomstuff.main;
import cpw.mods.fml.common.FMLLog;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by afroraydude.
 */
public class AfroLogger {
    public static Logger logger = Logger.getLogger(main.NAME);

    public static void init() {
        logger.setParent((Logger) FMLLog.getLogger());

    }

    public static void log(Level logLevel, String message) {
        logger.log(logLevel, message);
    }
}
