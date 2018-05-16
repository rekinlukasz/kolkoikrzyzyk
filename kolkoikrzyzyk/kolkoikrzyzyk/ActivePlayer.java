package kolkoikrzyzyk;

public class ActivePlayer {


    private Player player1 = new Player("Mario", Symbol.CROSS);
    private Player player2 = new Player("Luigi", Symbol.CIRCLE);

    private Player activePlayer = player1;

    public void change() {
        if(activePlayer.equals(player1)) {
            setActivePlayer(player2);
        } else {
            setActivePlayer(player1);
        }
    }

    public void makeMoveTo(Coordinate coordinate, Board board) {
        board.getBoard() ;
    }

    public Player getActivePlayer() {
        return activePlayer;
    }

    public void setActivePlayer(Player player) {
        this.activePlayer = player;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    @Override
    public String toString() {
        return "Ruch wykonuje " + activePlayer.getName();
    }
}
