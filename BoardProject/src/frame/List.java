package frame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class List extends JPanel implements ActionListener {

	public Image background = new ImageIcon(List.class.getResource("../image/list.png")).getImage();
	public JButton register;
	public JButton[] check = new JButton[3];

	public List() {
		setSize(640, 720);
		setLayout(null);
		setVisible(true);

		register = new JButton();			  // ��� ��ư
		register.setBounds(50, 625, 40, 40);
		register.setBorderPainted(false);     // ��ư �׵θ� ����
		register.setContentAreaFilled(false); // ��ư �����ϰ� ����
		register.addActionListener(this); //
		register.setIcon(new ImageIcon(List.class.getResource("../image/register.png")));
		add(register);

//		for (int i = 0; i < 3; i++) {
//			check[i] = new JButton();
//			check[i].setBorderPainted(false); // ��ư �׵θ� ����
//			check[i].setContentAreaFilled(false); // ��ư �����ϰ� ����
//			check[i].addActionListener(this); // ��ư Ŭ�� �̺�Ʈ
//			add(check[i]);
//		}
//		check[0].setBounds(150, 145, 120, 40); // �� ���� ��ư ��ġ ����
//		check[1].setBounds(150, 190, 120, 40);
//		check[2].setBounds(150, 240, 120, 40);

	}

	public void paintComponent(Graphics g) {
		g.drawImage(background, 0, 0, null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==register) {
		setVisible(false);
		}
		
	}
	
}
