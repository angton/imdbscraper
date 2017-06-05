import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
		
		JPanel nordpanel = new JPanel();
		JPanel sydpanel = new JPanel();
		
		JButton gnrt = new JButton("Generate movies!");
		final JTextArea print = new JTextArea();
		
		add(nordpanel, BorderLayout.NORTH);
		nordpanel.add(gnrt);
		//gnrt.addActionListener(new ActionListener() {
		//	public void actionPerformed (ActionEvent aev) {
		//		print.setText(Scraper.getResult());
		//	}
		//});
		
		
		add(sydpanel, BorderLayout.SOUTH);
		sydpanel.add(print);
		
	}

    public static void main(String[] args) throws Exception {

        new GUI();

    }

}
