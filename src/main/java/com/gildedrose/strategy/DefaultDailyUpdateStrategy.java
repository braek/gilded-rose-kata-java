package com.gildedrose.strategy;

import com.gildedrose.DailyUpdateStrategy;
import com.gildedrose.Item;

public final class DefaultDailyUpdateStrategy implements DailyUpdateStrategy {
    @Override
    public void dailyUpdate(Item item) {
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            item.quality = item.quality - 2;
        } else if (item.quality > 0) {
            item.quality = item.quality - 1;
        }
        if (item.quality < 0) {
            item.quality = 0;
        }
    }
}
