package game;

import javax.swing.BoxLayout;
import javax.swing.JButton;
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
	
	
	//Handインスタンス
	Hand hand;

	//コンストラクタ
	public Window(Hand hand) {
		super();
		this.hand = hand;
	}


	//pub と入力し、Ctrl + スペース
	public void create() {
		//フレームのサイズ
		setBounds(500, 500, 600, 800);
		//フレームを閉じたときの処理
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//ラベル作成
		handLabel = new JLabel("PC:", JLabel.CENTER);
		resultLabel = new JLabel("じゃんけん", JLabel.CENTER);
		
		//パネル作成
		handPanel = new JPanel();
		handPanel.add(handLabel);

		resultPanel = new JPanel();
		resultPanel.add(resultLabel);
		
		//フレームにパネルを追加
		add(handPanel);
		add(resultPanel);
		
		//ボタン追加
		JPanel buttonPanel = new JPanel();
		for (int i = 0; i < Hand.hands.length; i++) {
			//画像ボタンの場合
//			ImageIcon icon = new ImageIcon("./images/" + Hand.images[i]);
//			JButton button = new JButton(icon);
			JButton button = new JButton(Hand.hands[i]);
			buttonPanel.add(button);
		}
		add(buttonPanel);
		
		BoxLayout boxlayout = new BoxLayout(getContentPane(), BoxLayout.Y_AXIS);
		setLayout(boxlayout);
		
		//フレームを表示
		setVisible(true);
	}
	
	
}
