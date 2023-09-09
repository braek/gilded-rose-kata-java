package com.gildedrose;

import com.gildedrose.strategy.*;

public class DailyUpdateStrategyFactory {
    public static DailyUpdateStrategy createStrategy(String itemName) {
        switch (itemName) {
            case "Aged Brie":
                return new AgedBrieDailyUpdateStrategy();
            case "Backstage passes to a TAFKAL80ETC concert":
                return new BackstagePassesDailyUpdateStrategy();
            case "Sulfuras, Hand of Ragnaros":
                return new SulfurasDailyUpdateStrategy();
            case "Conjured Mana Cake":
                return new ConjuredManaCakeDailyUpdateStrategy();
            default:
                return new DefaultDailyUpdateStrategy();
        }
    }
}
