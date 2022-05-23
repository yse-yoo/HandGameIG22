package game;

public class App {

	public static void main(String[] args) {
		//Handを生成
		Hand hand = new Hand();
		
		//コンストラクタに hand を入れる
		Window window = new Window(hand);
		window.create();
	}

}
