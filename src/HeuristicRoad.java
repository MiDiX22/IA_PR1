import java.awt.*;

public class HeuristicRoad implements Heuristic {
    @Override
    public int calculate(Node node, Point end, Character name) {
        if (node.getName() == name){
            return 1;
        } else return 10;
    }
}
