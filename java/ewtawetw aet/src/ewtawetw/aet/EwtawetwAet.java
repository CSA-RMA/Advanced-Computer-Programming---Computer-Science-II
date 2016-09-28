package ewtawetw.aet;
import java.awt.EventQueue;
import javax.swing.JFrame;
public class EwtawetwAet {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                idk frame = new idk();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setSize(500, 400);
                frame.setVisible(true);
            }
        });
    }
}