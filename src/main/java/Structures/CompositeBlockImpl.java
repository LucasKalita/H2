package Implementations;

import Interfaces.Block;
import Interfaces.CompositeBlock;

import java.util.ArrayList;
import java.util.List;

//Implementacja Composite block, stworzyłem ponieważ uznałem ze to będzie najlepszy sposób na implementacje getterów
public class CompositeBlockImpl implements CompositeBlock {
    final String color;
    final String material;
    final List<Block> blocks;

    public CompositeBlockImpl(String color, String material, List<Block> blocks) {
        this.color = color;
        this.material = material;
        this.blocks = blocks;
    }

    public CompositeBlockImpl(String color, String material) {
        this.color = color;
        this.material = material;
        this.blocks = new ArrayList<>();
    }
    public String getColor() {
        return color;
    }

    public String getMaterial() {
        return material;
    }

    public List<Block> getBlocks() {
        return blocks;
    }

}
