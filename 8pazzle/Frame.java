import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

class Frame extends JFrame {
	public Frame(String title) {
		setTitle(title);

		//setLayout(new FlowLayout());

		Container contentPane = getContentPane();

		Number[] num_pnls = new Number[9];

		for(int i=0;i<9;i++) {
			num_pnls[i] = new Number(i+1);
			contentPane.add(num_pnls[i]);
		}

		setSize(180,205);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args) {
		Frame frm = new Frame("pazzle");
	}
}

class Number extends JPanel {
	private int num;

	public Number(int num) {
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