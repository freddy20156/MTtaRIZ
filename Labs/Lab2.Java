public class Lab2 {

    public static void main(String[] args) {
        int treeLevels = 5; // Задаем количество уровней для ёлочки
        int rows = 3; // Количество строк в массиве
        int cols = 4; // Количество столбцов в массиве

        // Вызов метода для вывода ёлочки
        printTree(treeLevels);

        System.out.println(); // Разделение вывода ёлочки и массива

        // Вызов метода для создания и вывода двумерного массива
        createAndPrintArray(rows, cols);
    }

    // Метод для вывода ёлочки
    public static void printTree(int levels) {
        for (int i = 1; i <= levels; i++) {
            // Друк пробілів для вирівнювання
            for (int j = 0; j < levels - i; j++) {
                System.out.print(" ");
            }
            // Друк зірочок
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Перехід на новий рядок після кожного рівня
            System.out.println();
        }
    }

    // Метод для создания и вывода двумерного массива
    public static void createAndPrintArray(int rows, int cols) {
        int[][] array = new int[rows][cols];
        int value = 1; // Начальное значение

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = value;
                value += 3; // Увеличиваем значение на 3 для следующего элемента
                System.out.print(array[i][j] + "\t"); // Вывод элемента с табуляцией
            }
            System.out.println(); // Переход на новую строку после каждой строки массива
        }
    }
}
