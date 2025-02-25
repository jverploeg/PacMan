//need to create a window
import javax.swing.JFrame;

public class App {
    public static void main(String[] args) throws Exception {
        //set up window dimensions
        int rowCount = 21;
        int columnCount = 19;
        int tileSize = 32;
        int boardWidth = columnCount * tileSize;
        int boardHeight = rowCount * tileSize;

        //create window
        JFrame frame = new JFrame("PacMan");
        //make visible
        frame.setVisible(true);
        //set window size
        frame.setSize(boardWidth, boardHeight);
        //center on screen
        frame.setLocationRelativeTo(null);
        //dont allow resize
        frame.setResizable(false);
        //terminate on window close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



    }
}
