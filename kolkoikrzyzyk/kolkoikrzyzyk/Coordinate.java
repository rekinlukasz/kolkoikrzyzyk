package kolkoikrzyzyk;

public class Coordinate {
    private int x;
    private int y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void changeStringToCoordinate(String coordinate) {

        char charX = coordinate.charAt(1);
        char charY = coordinate.charAt(0);

        x = Character.getNumericValue(charX);
        y = Character.getNumericValue(charY);
    }




}
