package entitie;

public class Position {
    private int colunm;
    private int row;

    public Position(int colunm, int row) {
        this.colunm = colunm;
        this.row = row;
    }

    public Position(){

    }

    public void setColunm(int colunm) {
        this.colunm = colunm;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public int getColunm() {
        return colunm;
    }

    @Override
    public String toString() {
        return colunm + ", " + row;
    }
}
