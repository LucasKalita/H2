package Structures;

import Interfaces.Block;
import Interfaces.Structure;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Wall implements Structure {
    private final List<Block> blocks;

    public Wall(List<Block> blocks) {
        this.blocks = blocks;
    }

    /**
     * Zwracanie wielkości Listy
     * @return
     */
    @Override
    public int count() {
        return blocks.size();
    }

    /**Zgodnie z zadaniem zwraca jeden blok w formie optionala
     *
     * @param color
     * @return
     */
    @Override
    public Optional<Block> findBlockByColor(String color) {
        return blocks.stream()
                .filter(block -> color.equalsIgnoreCase(block.getColor()))
                .findFirst();
    }

    /**Zgodnie z zadaniem zwraca listę bloków o takim materiale
     *
     * @param material
     * @return
     */
    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream()
                .filter(block -> material.equals(block.getMaterial()))
                .collect(Collectors.toList());
    }
}
