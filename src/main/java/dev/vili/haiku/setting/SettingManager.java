/*
 * Copyright (c) 2023. Vili (https://vili.dev) - All rights reserved
 */

package dev.vili.haiku.setting;

import dev.vili.haiku.module.Module;

import java.util.ArrayList;

public class SettingManager {
    private final ArrayList<Setting> settings;

    public SettingManager() {
        settings = new ArrayList<>();
    }

    /**
     * Gets the settings.
     */
    public ArrayList<Setting> getSettings() {
        return settings;
    }

    /**
     * Gets settings by name.
     * @param module
     * @param name
     */
    public Setting getSettingsByName(Module module, String name) {
        for (Setting setting : module.settings) {
            if (setting.name.equalsIgnoreCase(name)) {
                return setting;
            }
        }
        return null;
    }

    /**
     * Gets settings by module.
     * @param module
     */
    public ArrayList<Setting> getSettingsByModule(Module module) {
        ArrayList<Setting> settings = new ArrayList<>();
        for (Setting setting : module.settings) {
            settings.add(setting);
        }
        return settings;
    }

}
