package pazzle_8;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class Frame extends JFrame {
	public Frame(String title) {
		setTitle(title);

		Container contentPane = getContentPane();

		Num_Tile[] num_pnls = new Num_Tile[9];

		for(int i=0;i<9;i++) {
			num_pnls[i] = new Num_Tile(i+1);
			contentPane.add(num_pnls[i]);
		}

		setSize(175,195);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		Frame frm = new Frame("pazzle");
	}
}

class Num_Tile extends JPanel {
	private int num;

	public Num_Tile(int num) {
		this.num = num;
		BevelBorder border = new BevelBorder(BevelBorder.RAISED);
		this.setBorder(border);
		this.setPreferredSize(new Dimension(50, 50));
		this.setBounds( (((num-1)%3)+1)*55-50, (((num-1)/3)+1)*55-50, 50, 50);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawString(String.valueOf(num),21,30);
	}
}
