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
	// 목록을 보여주는 화면
	// ActionListener : 액션 이벤트를 처리하기 위한 인터페이스
	
	public Image background = new ImageIcon(List.class.getResource("../image/list.png")).getImage();
	// 화면 이미지 설정
	public JButton register;
	// 버튼 설정
	public JButton[] check = new JButton[3];

	public List() {
		setSize(640, 720);	// 화면 사이즈 설정
		setLayout(null);    // 레이아웃 설정
		setVisible(true);   // 화면 보이기 설정

		register = new JButton();			  // 등록 버튼
		register.setBounds(50, 625, 40, 40);  // 버튼 위치, 크기 설정
		register.setBorderPainted(false);     // 버튼 테두리 삭제
		register.setContentAreaFilled(false); // 버튼 투명하게 설정
		register.addActionListener(this);     // 버튼 이벤트 설정
		register.setIcon(new ImageIcon(List.class.getResource("../image/register.png")));
		add(register);

//		for (int i = 0; i < 3; i++) {
//			check[i] = new JButton();
//			check[i].setBorderPainted(false); // 버튼 테두리 삭제
//			check[i].setContentAreaFilled(false); // 버튼 투명하게 설정
//			check[i].addActionListener(this); // 버튼 클릭 이벤트
//			add(check[i]);
//		}
//		check[0].setBounds(150, 145, 120, 40); // 각 제목 버튼 위치 조정
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
