import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        CompositeBlockImpl compositeBlock0 = new CompositeBlockImpl("White", "Paper");
        CompositeBlockImpl compositeBlock1 = new CompositeBlockImpl("Black", "Wood");
        CompositeBlockImpl compositeBlock2 = new CompositeBlockImpl("White", "Brick");
        CompositeBlockImpl compositeBlock3 = new CompositeBlockImpl("Red", "Paper");
        CompositeBlockImpl compositeBlock4 = new CompositeBlockImpl("Grey", "Cement");

        List<Block> blocks = new ArrayList<>();
        final Wall wall = new Wall(blocks);
        blocks.add(compositeBlock0);
        blocks.add(compositeBlock1);
        blocks.add(compositeBlock2);
        blocks.add(compositeBlock3);
        blocks.add(compositeBlock4);
        System.out.println(wall.findBlockByColor("white"));
        System.out.println(Arrays.toString(wall.findBlocksByMaterial("Paper").toArray()));
        System.out.println(wall.toString());
        System.out.println(compositeBlock0.getColor());


    }

    }





