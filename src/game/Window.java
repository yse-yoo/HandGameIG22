package game;

import javax.swing.JFrame;

public class Window extends JFrame {

	//pub と入力し、Ctrl + スペース
	public void create() {
		//フレームのサイズ
		setBounds(300, 200, 300, 200);
		//フレームを閉じたときの処理
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//フレームを表示
		setVisible(true);
	}
	
	
}
