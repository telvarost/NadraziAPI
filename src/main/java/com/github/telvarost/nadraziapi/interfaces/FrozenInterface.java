package com.github.telvarost.nadraziapi.interfaces;

import net.modificationstation.stationapi.api.util.Util;

public interface FrozenInterface {
    default int nadraziApi_getFrozenTicks() {
        return Util.assertImpl();
    }

    default void nadraziApi_setFrozenTicks(int frozenTicks) {
        Util.assertImpl();
    }
}
