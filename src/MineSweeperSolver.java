import solver.Coord;

import javax.swing.*;
import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseListener;
import static com.sun.java.accessibility.util.AWTEventMonitor.addMouseMotionListener;

public class MineSweeperSolver  extends JFrame {

    private JPanel panel;

    public static void main(String[] args) throws AWTException {
        new MineSweeperSolver();
        //1366*768
        Coord coord = new Coord(150,150);
        moveMouse(coord);
    }

    private MineSweeperSolver() {
        initPanel();
    }

    private void initPanel() {
        panel = new JPanel();
    }

    private static void moveMouse(Coord coord) throws AWTException {
        Robot robot = new Robot();
        robot.delay(300);
        robot.mouseMove(coord.x, coord.y);
    }

    private static void rightClick() throws  AWTException{
        Robot robot = new Robot();
        robot.delay(300);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);
    }

    private static void  leftClick() throws  AWTException{
        Robot robot = new Robot();
        robot.delay(300);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
    }
}
