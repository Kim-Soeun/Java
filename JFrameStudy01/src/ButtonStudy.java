
import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonStudy extends JFrame {
	ButtonStudy() {
		JButton btn1 = new JButton();
		add(btn1);
		
		setVisible(true);  			//창을 눈에 보이도록 함
		setSize(640, 720);			// 사이즈는 640*720
		setResizable(false);		// 사이즈 재조정 불가능
		setLocationRelativeTo(null);// 창이 가운데 뜨도록 함
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창이 꺼지면 프로그램 종료
	}
}
