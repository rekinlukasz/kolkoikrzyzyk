package kolkoikrzyzyk;


public class Board {
    private int size = 3;
    private Field[][] board = new Field[size][size];

    public void createAndPrintBoard() {
        createEmptyBoard();
        printBoard();

    }

    public void createEmptyBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                this.board[i][j] = new Field(Symbol.EMPTY);
            }
        }
    }

    public void printBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j].getSymbol().getDescription());
            }
            System.out.println();
        }

    }

    public void changeFieldtoX(Coordinate coordinate) {
        board[coordinate.getX()][coordinate.getY()].setSymbol(Symbol.CROSS);
    }

    public void changeFieldtoO(Coordinate coordinate) {
        board[coordinate.getX()][coordinate.getY()].setSymbol(Symbol.CIRCLE);
    }

    public boolean isWon() {
        boolean result = false;
        for (int i = 0; i < size; i++) {
            if ((board[i][0].getSymbol() == board[i][1].getSymbol()) && (board[i][1].getSymbol() == board[i][2].getSymbol()) && (board[i][1].getSymbol() != Symbol.EMPTY)) {
                result = true;
            }

            if (board[0][i].getSymbol().equals(board[1][i].getSymbol()) && (board[1][i].getSymbol().equals(board[2][i].getSymbol())) && (board[0][i].getSymbol() != Symbol.EMPTY)) {
                result = true;
            }
        }
        if (board[0][0].getSymbol().equals(board[1][1].getSymbol()) && (board[1][1].getSymbol().equals(board[2][2].getSymbol())) && (board[0][0].getSymbol() != Symbol.EMPTY)) {
            result = true;
        }

        if (board[0][2].getSymbol().equals(board[1][1].getSymbol()) && (board[1][1].getSymbol().equals(board[2][0].getSymbol())) && (board[2][2].getSymbol() != Symbol.EMPTY)) {
            result = true;
        }

        return result;
    }


    public Field[][] getBoard() {
        return board;
    }

    public void setBoard(Field[][] board) {
        this.board = board;
    }

    public void validateAndSetCertainFieldAsSymbol(Coordinate coordinate, ActivePlayer activePlayer) {
        if (coordinate.getX() >= 0 && coordinate.getX() <= 2 && coordinate.getY() >= 0 && coordinate.getY() <= 2 && checkCertainFieldSymbol(coordinate).equals(Symbol.EMPTY)) {
            board[coordinate.getX()][coordinate.getY()].setSymbol(activePlayer.getActivePlayer().getSymbol());

        } else {
            System.out.println("niepoprawne pole, powtorz ruch");
            activePlayer.change();
        }
    }

    public Symbol checkCertainFieldSymbol(Coordinate coordinate) {
        return board[coordinate.getX()][coordinate.getY()].getSymbol();
    }
}
