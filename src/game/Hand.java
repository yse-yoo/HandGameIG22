package game;

import java.util.Random;

public class Hand {

	final static String ROCK = "グー";
	final static String SICCORS = "チョキ";
	final static String PAPER = "パー";
	final static String[] hands = { ROCK, SICCORS, PAPER };

	final static String[] images = { 
			"rock.png",
			"siccors.png",
			"paper.png"
	};

	//PCの手
	public String pcHand;
	//じゃんけんの結果
	public String result;
	
	//じゃんけんの判別
	public void play(String playerHand) {
		//PCの手（ランダム）
		Random rand = new Random();
		int handIndex = rand.nextInt(3);
		pcHand = hands[handIndex];
		

		if (playerHand == pcHand) {
			//Draw
			result = "Draw";
		} else {
			//Win or Lose
			result = (
					(playerHand == ROCK && pcHand == SICCORS)
					|| (playerHand == SICCORS && pcHand == PAPER)
					|| (playerHand == PAPER && pcHand == ROCK)
					) ? "Win" : "Lose";
			
//			if ((playerHand == ROCK && pcHand == SICCORS)
//					|| (playerHand == SICCORS && pcHand == PAPER)
//					|| (playerHand == PAPER && pcHand == ROCK)) {
//				result = "Win";
//			} else {
//				result = "Lose";
//			}
		}
	}

}
