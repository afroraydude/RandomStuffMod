package com.afroraydude.mods.randomstuff.biome;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGlowstone;
import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;

/**
 * Created by afroraydude.
 */
public class TestBiome extends BiomeGenBase{

    public TestBiome(int id) {
        super(id);
        this.theBiomeDecorator.treesPerChunk = 5;
        this.theBiomeDecorator.bigMushroomsPerChunk = 5;
        this.getSkyColorByTemp(1.9F);

        // The top and filler block
        this.topBlock = Blocks.grass;
        this.fillerBlock = Blocks.clay;

        // The entities that spawn and how many of said entities spawn in each group in this order: average, min, max
        this.spawnableCreatureList.add(new SpawnListEntry(EntitySlime.class, 5, 1, 10));

    }
}
