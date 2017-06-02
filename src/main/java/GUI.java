import javax.swing.*;
import java.awt.*;

/**
 * Created by Antons on 2017-02-27.
 */

public class GUI extends JFrame {
	
	public GUI() {
		
		setLayout(new BorderLayout());
		setSize(400, 960);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}

    public static void main(String[] args) throws Exception {

        new GUI();

    }

}
