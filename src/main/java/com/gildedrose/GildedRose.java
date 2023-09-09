package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (Item item : items) {
            switch (item.name) {
                case "Aged Brie":
                    updateAgedBrie(item);
                    break;
                case "Backstage passes to a TAFKAL80ETC concert":
                    updateBackstagePasses(item);
                    break;
                case "Sulfuras, Hand of Ragnaros":
                    updateSulfuras(item);
                    break;
                case "Conjured Mana Cake":
                    updateConjuredManaCake(item);
                    break;
                default:
                    updateStandardItem(item);
                    break;
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
