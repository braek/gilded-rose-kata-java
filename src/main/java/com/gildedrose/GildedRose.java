package com.gildedrose;

import java.util.Arrays;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        Arrays.stream(items).forEach(this::updateItemQuality);
    }

    private void updateItemQuality(Item item) {
        final DailyUpdateStrategy strategy = DailyUpdateStrategyFactory.createStrategy(item.name);
        strategy.dailyUpdate(item);
    }
}
