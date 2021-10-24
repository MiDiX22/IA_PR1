import java.awt.*;
import java.io.File;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Solver sv = new Solver(new File("src/Map1.txt"),10, 10,0,0,9,9);
//        Solver sv = new Solver(new File("src/mapBasic.txt"),3, 3,0,0,2,2);

        sv.bestFirst();

        System.out.println("\n");
        for (int i=0; i<10; i++){
            for (int j=0; j<10; j++){
                System.out.print(sv.getChar(new Point(j,i)));
            }
            System.out.println("");
        }
    }
}
