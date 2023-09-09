package com.gildedrose.strategy;

import com.gildedrose.DailyUpdateStrategy;
import com.gildedrose.Item;

public final class AgedBrieDailyUpdateStrategy implements DailyUpdateStrategy {
    @Override
    public void dailyUpdate(Item item) {
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            item.quality = item.quality + 2;
        } else {
            item.quality = item.quality + 1;
        }
        if (item.quality > 50) {
            item.quality = 50;
        }
    }
}
