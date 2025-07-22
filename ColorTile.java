interface ColorTileGUI {
    public void setTileColor(int x, int y, int tileColor);

    public void setEmptyTile(int x, int y);

    public void win();

    public void lose();
}

public class ColorTile {

    private final int height;
    private final int width;
    private final int[][] table;
    private final int defaultEmptyCount;
    private final int totalColors;
    private int score;


    public ColorTile(int height, int width, int defaultEmptyCount, int totalColors) {
        this.height = height;
        this.width = width;
        this.table = new int[height][width];
        this.defaultEmptyCount = defaultEmptyCount;
        this.totalColors = totalColors;
        this.score = 0;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    void initTable(ColorTileGUI gui) {
        setEmpties();

        /* ----- add here ----- */

    }

    void setEmpties(){
        /* ----- add here ----- */
    }

    public void openTile(int x, int y, ColorTileGUI gui) {
        /* ----- add here ----- */
    }

    private int checkWinCondition(){
        /* ----- add here ----- */
    }

    public void reset(ColorTileGUI gui){
        /* ----- add here ----- */
    }

}