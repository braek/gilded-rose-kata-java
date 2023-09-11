package com.gildedrose;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

public final class ItemTestParams implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext context) {
        return Stream.of(
            // Test cases for standard items
            Arguments.of(
                new Item("Standard Item", 0, 0),
                new Item("Standard Item", -1, 0)
            ),
            Arguments.of(
                new Item("Standard Item", 1, 1),
                new Item("Standard Item", 0, 0)
            ),
            Arguments.of(
                new Item("Standard Item", -1, 10),
                new Item("Standard Item", -2, 8)
            ),
            Arguments.of(
                new Item("Standard Item", -2, 1),
                new Item("Standard Item", -3, 0)
            ),
            // Test cases for aged brie
            Arguments.of(
                new Item("Aged Brie", 20, 1),
                new Item("Aged Brie", 19, 2)
            ),
            Arguments.of(
                new Item("Aged Brie", 0, 1),
                new Item("Aged Brie", -1, 3)
            ),
            Arguments.of(
                new Item("Aged Brie", -1, 5),
                new Item("Aged Brie", -2, 7)
            ),
            Arguments.of(
                new Item("Aged Brie", 20, 50),
                new Item("Aged Brie", 19, 50)
            ),
            // Test cases for sulfuras
            Arguments.of(
                new Item("Sulfuras, Hand of Ragnaros", 10, 80),
                new Item("Sulfuras, Hand of Ragnaros", 10, 80)
            ),
            Arguments.of(
                new Item("Sulfuras, Hand of Ragnaros", -5, 80),
                new Item("Sulfuras, Hand of Ragnaros", -5, 80)
            ),
            Arguments.of(
                new Item("Sulfuras, Hand of Ragnaros", 0, 80),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80)
            ),
            Arguments.of(
                new Item("Sulfuras, Hand of Ragnaros", 0, 50),
                new Item("Sulfuras, Hand of Ragnaros", 0, 80)
            ),
            // Test cases for backstage passes
            Arguments.of(
                new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50),
                new Item("Backstage passes to a TAFKAL80ETC concert", -1, 0)
            ),
            Arguments.of(
                new Item("Backstage passes to a TAFKAL80ETC concert", -1, 50),
                new Item("Backstage passes to a TAFKAL80ETC concert", -2, 0)
            ),
            Arguments.of(
                new Item("Backstage passes to a TAFKAL80ETC concert", 1, 50),
                new Item("Backstage passes to a TAFKAL80ETC concert", 0, 50)
            ),
            Arguments.of(
                new Item("Backstage passes to a TAFKAL80ETC concert", 20, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 19, 21)
            ),
            Arguments.of(
                new Item("Backstage passes to a TAFKAL80ETC concert", 11, 20),
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 21)
            ),
            Arguments.of(
                new Item("Backstage passes to a TAFKAL80ETC concert", 10, 10),
                new Item("Backstage passes to a TAFKAL80ETC concert", 9, 12)
            ),
            Arguments.of(
                new Item("Backstage passes to a TAFKAL80ETC concert", 6, 15),
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 17)
            ),
            Arguments.of(
                new Item("Backstage passes to a TAFKAL80ETC concert", 5, 10),
                new Item("Backstage passes to a TAFKAL80ETC concert", 4, 13)
            ),
            Arguments.of(
                new Item("Backstage passes to a TAFKAL80ETC concert", 4, 10),
                new Item("Backstage passes to a TAFKAL80ETC concert", 3, 13)
            ),
            // Test cases for conjured items
            Arguments.of(
                new Item("Conjured Mana Cake", 4, 10),
                new Item("Conjured Mana Cake", 3, 8)
            ),
            Arguments.of(
                new Item("Conjured Mana Cake", 4, 0),
                new Item("Conjured Mana Cake", 3, 0)
            ),
            Arguments.of(
                new Item("Conjured Mana Cake", -1, 20),
                new Item("Conjured Mana Cake", -2, 16)
            ),
            Arguments.of(
                new Item("Conjured Mana Cake", 0, 10),
                new Item("Conjured Mana Cake", -1, 6)
            )
        );
    }
}
