package game;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Window extends JFrame {
	
	//ラベル
	JLabel handLabel;
	JLabel resultLabel;
	
	//パネル
	JPanel handPanel;
	JPanel resultPanel;

	//pub と入力し、Ctrl + スペース
	public void create() {
		//フレームのサイズ
		setBounds(300, 200, 300, 200);
		//フレームを閉じたときの処理
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ラベル作成
		handLabel = new JLabel("PC:", JLabel.CENTER);
		
		
		
		
		//フレームを表示
		setVisible(true);
	}
	
	
}
