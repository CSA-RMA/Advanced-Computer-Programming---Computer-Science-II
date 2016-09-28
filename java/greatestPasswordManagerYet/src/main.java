import java.awt.EventQueue;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilenameFilter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
public class main {
    public static void main(String[] args) {
        /*File dir = new File("");
    	   System.out.println(dir.listFiles(new FilenameFilter() { 
    	         public boolean accept(File dir, String filename)
    	              { return filename.endsWith(".txt"); }
    	} ));
        for(int i=0;i<matchingFiles.length;i++) {
            System.out.println(matchingFiles[i]);
        }*/
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    GUI frame = new GUI();
                    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    frame.setSize(500, 400);
                    frame.setVisible(true);
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
}