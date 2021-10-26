import java.awt.*;

public class HeuristicTimexNode implements Heuristic{
    @Override
    public int calculate(Node node, Point end, Character name) {
        double timeXNode = (node.pathTime())/(node.getPath().size());
        int x = end.x - node.getCoord().x;
        int y = end.y - node.getCoord().y;
        return (int) ((x+y)*timeXNode);
    }
}
