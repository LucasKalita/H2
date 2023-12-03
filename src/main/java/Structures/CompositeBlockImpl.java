package Structures;

import Interfaces.Block;
import Interfaces.CompositeBlock;

import java.util.ArrayList;
import java.util.List;



public class CompositeBlockImpl implements CompositeBlock {
    final String color;
    final String material;
    final List<Block> blocks;
    /**
    *Stworzyłem tą klasę ze względu na potrzebę operowania na obiekcie z polami gdzie mogę zaimplementować CompositeBlock
     */
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
