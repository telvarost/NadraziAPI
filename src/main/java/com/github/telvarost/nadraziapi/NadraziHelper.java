package com.github.telvarost.nadraziapi;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;

public class NadraziHelper {
    public static Entity collisionEntity = null;
    public static int songLevelId = Integer.MAX_VALUE;
    public static String currentStreamingSong = null;
    public static String currentMusicSong = null;
    public static boolean cancelCurrentBGM = false;
    //public static ArrayList<String> musicForMainMenu;

    public static void setFrozen(LivingEntity livingEntity, int frozenDurationTicks) {
        livingEntity.nadraziApi_setFrozenTicks(frozenDurationTicks);
    }

    public static int getFrozen(LivingEntity livingEntity) {
        return livingEntity.nadraziApi_getFrozenTicks();
    }
}
