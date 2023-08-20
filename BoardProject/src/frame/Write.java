package frame;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.Border;

public class Write extends JPanel implements ActionListener {

	public Image background = new ImageIcon(List.class.getResource("../image/write.png")).getImage();
	public JTextArea titleArea;
	public JTextArea writeArea;
	public JButton write;
	List2 list2 = new List2();
	
	
	public Write() {
		setSize(640, 720);
		setLayout(null);
		setVisible(true);

		writeArea = new JTextArea() {
			public void setBorder(Border border) { 		// 입력창 테두리 삭제

			}
		};
		
		writeArea.setBounds(60, 190, 420, 400);
		writeArea.setOpaque(false);
		add(writeArea);
		
		
		titleArea = new JTextArea() {
			public void setBorder(Border border) { 		// 입력창 테두리 삭제

			}
		};
		
		titleArea.setBounds(60, 140, 420, 40);
		titleArea.setOpaque(false);
		add(titleArea);
		
		
		write = new JButton();				// 글쓰기 버튼
		write.setBounds(520, 645, 60, 30);
		write.setBorderPainted(false); // 버튼 테두리 삭제
		write.setContentAreaFilled(false); // 버튼 투명하게 설정
		write.addActionListener(this); //
		add(write);

		
		
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(background, 0, 0, null);
	}
		
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==write) {
		setVisible(false);
		list2.setVisible(true);
		}
		
	}
		
}
