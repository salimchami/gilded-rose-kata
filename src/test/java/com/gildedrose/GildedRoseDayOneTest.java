package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseDayOneTest {

    @Test
    public void should_return_quality_9_and_sellin_19_after_a_quality_update_for_5_Dexterity_Vest() {
        Item[] itemWithNegativQuality = new Item[]{new Item("+5 Dexterity Vest", 10, 20)};
        GildedRose app = new GildedRose(itemWithNegativQuality);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
        assertEquals(19, app.items[0].quality);
    }

    @Test
    public void should_return_quality_1_and_sellin_1_after_a_quality_update_for_aged_brie() {
        Item[] itemWithNegativQuality = new Item[]{new Item("Aged Brie", 2, 0)};
        GildedRose app = new GildedRose(itemWithNegativQuality);
        app.updateQuality();
        assertEquals(1, app.items[0].sellIn);
        assertEquals(1, app.items[0].quality);
    }

    @Test
    public void should_return_quality_4_and_sellin_6_after_a_quality_update_for_Elixir_of_the_Mongoose() {
        Item[] itemWithNegativQuality = new Item[]{new Item("Elixir of the Mongoose", 5, 7)};
        GildedRose app = new GildedRose(itemWithNegativQuality);
        app.updateQuality();
        assertEquals(4, app.items[0].sellIn);
        assertEquals(6, app.items[0].quality);
    }

    @Test
    public void should_return_quality_0_and_sellin_80_after_a_quality_update_for_Sulfuras() {
        Item[] itemWithNegativQuality = new Item[]{new Item("Sulfuras, Hand of Ragnaros", 0, 80)};
        GildedRose app = new GildedRose(itemWithNegativQuality);
        app.updateQuality();
        assertEquals(0, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
    }

    @Test
    public void should_return_quality_minus1_and_sellin_80_after_a_quality_update_for_Sulfuras() {
        Item[] itemWithNegativQuality = new Item[]{new Item("Sulfuras, Hand of Ragnaros", -1, 80)};
        GildedRose app = new GildedRose(itemWithNegativQuality);
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(80, app.items[0].quality);
    }

    @Test
    public void should_return_quality_14_and_sellin_21_after_a_quality_update_for_TAFKAL80ETC_concert() {
        Item[] itemWithNegativQuality = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20)};
        GildedRose app = new GildedRose(itemWithNegativQuality);
        app.updateQuality();
        assertEquals(14, app.items[0].sellIn);
        assertEquals(21, app.items[0].quality);
    }

    @Test
    public void should_return_quality_9_and_sellin_50_after_a_quality_update_for_TAFKAL80ETC() {
        Item[] itemWithNegativQuality = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49)};
        GildedRose app = new GildedRose(itemWithNegativQuality);
        app.updateQuality();
        assertEquals(9, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    public void should_return_quality_4_and_sellin_50_after_a_quality_update_for_TAFKAL80ETC() {
        Item[] itemWithNegativQuality = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49)};
        GildedRose app = new GildedRose(itemWithNegativQuality);
        app.updateQuality();
        assertEquals(4, app.items[0].sellIn);
        assertEquals(50, app.items[0].quality);
    }

    @Test
    public void should_return_quality_2_and_sellin_5_after_a_quality_update_for_Conjured_Mana_Cake() {
        Item[] itemWithNegativQuality = new Item[]{new Item("Conjured Mana Cake", 3, 6)};
        GildedRose app = new GildedRose(itemWithNegativQuality);
        app.updateQuality();
        assertEquals(2, app.items[0].sellIn);
        assertEquals(5, app.items[0].quality);
    }

    @Test
    public void should_return_quality_2_and_sellin_11_after_a_quality_update_for_Backstage_TAFKAL80ETC() {
        Item[] itemWithNegativQuality = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 2, 10)};
        GildedRose app = new GildedRose(itemWithNegativQuality);
        app.updateQuality();
        assertEquals(1, app.items[0].sellIn);
        assertEquals(13, app.items[0].quality);
    }

    @Test
    public void should_return_quality_0_and_sellin_minus1_after_a_quality_update_for_Backstage_TAFKAL80ETC() {
        Item[] itemWithNegativQuality = new Item[]{new Item("Backstage passes to a TAFKAL80ETC concert", 0, 10)};
        GildedRose app = new GildedRose(itemWithNegativQuality);
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(0, app.items[0].quality);
    }

    @Test
    public void should_return_quality_0_and_sellin_minus1_after_a_quality_update_for_Aged_Brie() {
        Item[] itemWithNegativQuality = new Item[]{new Item("Aged Brie", 0, 10)};
        GildedRose app = new GildedRose(itemWithNegativQuality);
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(12, app.items[0].quality);
    }

    @Test
    public void should_return_quality__and_sellin_6_after_a_quality_update_for_Elixir_of_the_Mongoose() {
        Item[] itemWithNegativQuality = new Item[]{new Item("Elixir of the Mongoose", 0, 50)};
        GildedRose app = new GildedRose(itemWithNegativQuality);
        app.updateQuality();
        assertEquals(-1, app.items[0].sellIn);
        assertEquals(48, app.items[0].quality);
    }


}
