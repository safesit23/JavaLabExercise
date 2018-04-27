package smarttvscreen;

public class Cursor {

    private int row, column, maxRow;

    public Cursor(int maxRow) {
        this.maxRow = maxRow;
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public int getColumn() {
        return column;
    }

    public void increaseColumn() {
        this.column++;
    }

    public void decreaseColumn() {
        if (this.column > 0) {
            this.column--;
        }
    }

    public void increaseRow() {
        if (this.row < maxRow - 1) {
            this.row++;
        }
    }

    public void decreaseRow() {
        if (this.row > 0) {
            this.row--;
        }
    }

}
