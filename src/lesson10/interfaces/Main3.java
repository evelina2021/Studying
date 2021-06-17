package lesson10.interfaces;

public class Main3 {
    public static void main(String[] args) {
        //* Matrix matrix = new Matrix(3, 4);
        // System.out.println(matrix.getRows());
        // System.out.println(matrix.getColumns());
        // System.out.println(matrix.getValueAt(0, 1));
        // matrix.setValueAt(0,0,4);
        // matrix.setValueAt(0,1,7);
        // matrix.setValueAt(0,2,3);
        // matrix.setValueAt(0,3,2); *//

        Matrix matrix = new Matrix(3, 3);
        matrix.setValueAt(0, 0, 4);
        matrix.setValueAt(0, 1, 7);
        matrix.setValueAt(0, 2, 3);
        matrix.setValueAt(1, 1, 4);
        matrix.setValueAt(1, 1, 1);
        matrix.setValueAt(1, 2, 3);
        matrix.setValueAt(2, 0, 4);
        matrix.setValueAt(2, 1, 7);
        matrix.setValueAt(2, 2, 3);

        Matrix matrix2 = new Matrix(3, 3);
        matrix2.setValueAt(0, 0, 3);
        matrix2.setValueAt(0, 1, 4);
        matrix2.setValueAt(0, 2, 5);
        matrix2.setValueAt(1, 1, 4);
        matrix2.setValueAt(1, 1, 1);
        matrix2.setValueAt(1, 2, 3);
        matrix2.setValueAt(2, 0, 4);
        matrix2.setValueAt(2, 1, 7);
        matrix2.setValueAt(2, 2, 3);

        IMatrix result = matrix2.add(matrix);
    }
}
