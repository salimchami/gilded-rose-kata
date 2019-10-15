package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LegacyGildedRoseDayZeroTest {

    @Test
    public void should_return_quality_9_and_sellin_19_after_a_quality_update_for_5_Dexterity_Vest() {
        Item[] item = new Item[]{new Item("+5 Dexterity Vest", 10, 20)};
        LegacyGildedRose app = new LegacyGildedRose(item);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
    }

    @Test
    public void should_return_quality_1_and_sellin_1_after_a_quality_update_for_aged_brie() {
        Item[] item = new Item[]{new Item("Aged Brie", 2, 0)};
        LegacyGildedRose app = new LegacyGildedRose(item);
        assertEquals(2, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    public void should_return_quality_4_and_sellin_6_after_a_quality_update_for_Elixir_of_the_Mongoose() {
        Item[] item = new Item[]{new Item("Elixir of the Mongoose", 5, 7)};
        LegacyGildedRose app = new LegacyGildedRose(item);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(7, app.items[0].quality);
    }

    @Test
    public void should_return_quality_0_and_sellin_80_after_a_quality_update_for_Sulfuras() {
        Item[] item = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 0, 80)};
        LegacyGildedRose app = new LegacyGildedRose(item);
        assertEquals(0, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
    }

    @Test
    public void should_return_quality_minus1_and_sellin_80_after_a_quality_update_for_Sulfuras() {
        Item[] item = new Item[]{new Item("Sulfuras, Hand of Ragnaros", -1, 80)};
        LegacyGildedRose app = new LegacyGildedRose(item);
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
    }

    @Test
    public void should_return_quality_14_and_sellin_21_after_a_quality_update_for_TAFKAL80ETC_concert() {
        Item[] item = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)};
        LegacyGildedRose app = new LegacyGildedRose(item);
        assertEquals(15, app.items[0].sellIn);
        assertEquals(20, app.items[0].quality);
    }

    @Test
    public void should_return_quality_9_and_sellin__after_a_quality_update_for_TAFKAL80ETC() {
        Item[] item = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49)};
        LegacyGildedRose app = new LegacyGildedRose(item);
        assertEquals(10, app.items[0].sellIn);
        assertEquals(49, app.items[0].quality);
    }

    @Test
    public void should_return_quality_and_sellin_after_a_quality_update_for_TAFKAL80ETC() {
        Item[] item = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49)};
        LegacyGildedRose app = new LegacyGildedRose(item);
        assertEquals(5, app.items[0].sellIn);
        assertEquals(49, app.items[0].quality);
    }

    @Test
    public void should_return_quality_and_sellin_after_a_quality_update_for_Conjured_Mana_Cake() {
        Item[] item = new Item[]{new Item("Conjured Mana Cake", 3, 6)};
        LegacyGildedRose app = new LegacyGildedRose(item);
        assertEquals(3, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
    }
}
