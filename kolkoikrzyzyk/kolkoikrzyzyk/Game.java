package kolkoikrzyzyk;

import java.util.Scanner;

public class Game {

    private GameState gameState = GameState.IN_PROGRESS;

    Scanner scanner = new Scanner(System.in);
    Coordinate coordinate = new Coordinate(0, 0);

    public void play() {

        Game game = new Game();

        System.out.println("Let the game begin!");

        Board board = new Board();
        ActivePlayer activePlayer = new ActivePlayer();

        board.createAndPrintBoard();


        while (getGameState() == GameState.IN_PROGRESS) {
            System.out.println(activePlayer.toString());
            System.out.println("podaj koordynaty ruchu (XY)");
            String input = scanner.nextLine();
            coordinate.changeStringToCoordinate(input);
            board.validateAndSetCertainFieldAsSymbol(coordinate, activePlayer);
            board.printBoard();
            activePlayer.change();

            if (board.isWon()) {
                activePlayer.change();

                System.out.println("GAME OVER, " + activePlayer.getActivePlayer().getName() + " won");
                setGameState(getGameState().OVER);
            }

        }
    }


    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }



}
