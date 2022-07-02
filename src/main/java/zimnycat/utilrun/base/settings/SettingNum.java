package zimnycat.utilrun.base.settings;

import zimnycat.utilrun.base.SettingBase;

public class SettingNum extends SettingBase {
    public double value;
    private final double min;
    private final double max;

    public SettingNum(String name, double value, double min, double max) {
        this.name = name;
        this.value = value;
        this.min = min;
        this.max = max;
    }

    public double getMin() { return min; }

    public double getMax() { return max; }
}