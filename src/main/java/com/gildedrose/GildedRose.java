package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            if (item.name.equals("Aged Brie")) {
                updateAgedBrie(item);
            } else if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                updateBackstagePasses(item);
            } else if (item.name.equals("Sulfuras, Hand of Ragnaros")) {
                updateSulfuras(item);
            } else if (item.name.equals("Conjured Mana Cake")) {
                updateConjuredManaCake(item);
            } else {
                updateStandardItem(item);
            }
        }
    }

    private void updateStandardItem(Item item) {
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

    private void updateConjuredManaCake(Item item) {
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            item.quality = item.quality - 4;
        } else if (item.quality > 0) {
            item.quality = item.quality - 2;
        }
        if (item.quality > 50) {
            item.quality = 50;
        }
    }

    private void updateSulfuras(Item item) {
        item.quality = 80;
    }

    private void updateBackstagePasses(Item item) {
        item.sellIn = item.sellIn - 1;
        if (item.sellIn < 0) {
            item.quality = 0;
        } else if (item.sellIn < 5) {
            item.quality = item.quality + 3;
        } else if (item.sellIn < 10) {
            item.quality = item.quality + 2;
        } else {
            item.quality = item.quality + 1;
        }
        if (item.quality > 50) {
            item.quality = 50;
        }
    }

    private void updateAgedBrie(Item item) {
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
