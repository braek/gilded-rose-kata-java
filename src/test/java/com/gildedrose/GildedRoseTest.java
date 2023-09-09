package com.gildedrose;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ArgumentsSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GildedRoseTest {

    @ParameterizedTest
    @ArgumentsSource(ItemTestParams.class)
    void testItemUpdate(Item itemBeforeUpdate, Item expected) {
        final Item[] items = {itemBeforeUpdate};
        final GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(expected.name, app.items[0].name);
        assertEquals(expected.sellIn, app.items[0].sellIn);
        assertEquals(expected.quality, app.items[0].quality);
    }
}
