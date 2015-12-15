package connect3;

import java.util.*;

public class GameManager
{
	public GameManager() {
		GameBoard game = new GameBoard(6,6);
		GameLogic logic = new GameLogic(game);
		game.generateBoard(logic);
		
		Scanner in = new Scanner(System.in);
		while (!in.equals("exit")) {
			System.out.print("Enter y1, x1: ");
			int y1 = in.nextInt();
			int x1 = in.nextInt();
			System.out.print("Enter y2, x2: ");
			int y2 = in.nextInt();
			int x2 = in.nextInt();
			game.swap(y1, x1, y2, x2);
			System.out.println("-----------\n");
			game.displayBoard();
			logic.displayMatches();
		}
		in.close();
	}
}