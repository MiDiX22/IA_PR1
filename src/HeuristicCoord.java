import java.awt.*;

public class HeuristicCoord implements Heuristic {

    @Override
    public int calculate(Node node, Point p) {
        int x = p.x - node.getCoord().x;
        int y = p.y - node.getCoord().y;
        return  x+y;
    }
}
