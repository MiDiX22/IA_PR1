import java.awt.*;

public class HeuristicCoord implements Heuristic {

    @Override
    public int calculate(Node node, Point end, Character name) {
        int x = end.x - node.getCoord().x;
        int y = end.y - node.getCoord().y;
        return  x+y;
    }
}
