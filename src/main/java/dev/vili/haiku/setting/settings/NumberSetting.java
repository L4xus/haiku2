/*
 * Copyright (c) 2023. Vili (https://vili.dev) - All rights reserved
 */

package dev.vili.haiku.setting.settings;

import dev.vili.haiku.setting.Setting;

public class NumberSetting extends Setting {
    public double value;
    public double minimum;
    public double maximum;
    public double increment;

    public NumberSetting(String name, String description, double value, double minimum, double maximum, double increment) {
        super(name, description);
        this.value = value;
        this.minimum = minimum;
        this.maximum = maximum;
        this.increment = increment;
    }

    /**
     * Gets the value of the setting.
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the setting.
     * @param value
     */
    public void setValue(double value) {
        double precision = 1.0D / this.increment;
        this.value = Math.round(Math.max(this.minimum, Math.min(this.maximum, value)) * precision) / precision;
    }

    /**
     * Increments the value of the setting.
     * @param positive
     */
    public void increment(boolean positive) {
        setValue(getValue() + (positive ? 1 : -1) * increment);
    }

    /**
     * Gets the minimum value of the setting.
     */
    public double getMinimum() {
        return this.minimum;
    }

    /**
     * Sets the minimum value of the setting.
     * @param minimum
     */
    public void setMinimum(double minimum) {
        this.minimum = minimum;
    }

    /**
     * Gets the maximum value of the setting.
     */
    public double getMaximum() {
        return this.maximum;
    }

    /**
     * Sets the maximum value of the setting.
     * @param maximum
     */
    public void setMaximum(double maximum) {
        this.maximum = maximum;
    }

    /**
     * Gets the increment value of the setting.
     */
    public double getIncrement() {
        return this.increment;
    }

    /**
     * Sets the increment value of the setting.
     * @param increment
     */
    public void setIncrement(double increment) {
        this.increment = increment;
    }
}
