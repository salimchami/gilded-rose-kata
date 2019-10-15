package com.gildedrose;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GildedRoseTest {

    @ParameterizedTest
    @MethodSource("parameters")
    void add(String itemName, int sellIn, int quality, int expectedSellIn, int expectedQuality) {
        Item[] item = new Item[]{new Item(itemName, sellIn, quality)};
        GildedRose app = new GildedRose(item);
        app.updateQuality();
        assertEquals(expectedSellIn, app.items[0].sellIn);
        assertEquals(expectedQuality, app.items[0].quality);
    }

    private static Stream<Arguments> parameters() {
        return Stream.of(
                Arguments.of("Aged Brie", 2, 0, 1, 1),
                Arguments.of("Elixir of the Mongoose", 5, 7, 4, 6),
                Arguments.of("Sulfuras, Hand of Ragnaros", 0, 80, 0, 80),
                Arguments.of("Sulfuras, Hand of Ragnaros", -1, 80, -1, 80),
                Arguments.of("Backstage passes to a TAFKAL80ETC concert", 15, 20, 14, 21),
                Arguments.of("Backstage passes to a TAFKAL80ETC concert", 10, 49, 9, 50),
                Arguments.of("Backstage passes to a TAFKAL80ETC concert", 5, 49, 4, 50),
                Arguments.of("Conjured Mana Cake", 3, 6, 2, 5),
                Arguments.of("Backstage passes to a TAFKAL80ETC concert", 2, 10, 1, 13),
                Arguments.of("Backstage passes to a TAFKAL80ETC concert", 0, 10, -1, 0),
                Arguments.of("Aged Brie", 0, 10, -1, 12),
                Arguments.of("Elixir of the Mongoose", 0, 50, -1, 48)
        );
    }

}
