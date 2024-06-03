public class matrix {
    private int rows;
    private int columns;
    private int[][] data;
    public matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.data = new int[rows][columns];
    }
    public void fillMatrix(int[][] values) {
        if (values.length != rows || values[0].length != columns) {
            System.out.println("Error: Provided values array does not match matrix dimensions.");
            return;
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = values[i][j];
            }
        }
    }
    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        matrix matrix = new matrix(3, 3);
        int[][] values = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        matrix.fillMatrix(values);
        System.out.println("matrix:");
        matrix.printMatrix();
    }
}