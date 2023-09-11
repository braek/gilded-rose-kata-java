package com.gildedrose.strategy;

import com.gildedrose.DailyUpdateStrategy;
import com.gildedrose.Item;

public final class SulfurasDailyUpdateStrategy implements DailyUpdateStrategy {
    @Override
    public void dailyUpdate(Item item) {
        item.quality = 80;
    }
}
