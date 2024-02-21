public class nQueenOneSol {
    public static boolean isSafe(char board[][], int row, int col) {

        // vertical up

        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;

    }

    public static boolean nQueens(char board[][], int row) {

        // base case
        if (row == board.length) {
            // printBoard(board);
            count++;
            return true;
        }
        // column loop
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                // function call
                if (nQueens(board, row + 1)) {
                    return true;
                }
                ;
                // backtrack
                board[row][j] = 'x';
            }
        }
        return false;
    }

    public static void printBoard(char board[][]) {

        System.out.println("------- chess Board --------");

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // the static keyword makes the count variable shared across all instances of
    // the class
    // It's important to note that static variables are shared across all instances
    // of the class, so if you modify a static variable in one instance, it will
    // affect all other instances and the class itself.
    static int count = 0;

    public static void main(String[] args) {
        int n = 2;
        char board[][] = new char[n][n];

        // initiliaze
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        if (nQueens(board, 0)) {
            System.out.println("Solution is possible ");
            printBoard(board);
        } else {
            System.out.print("Solution is Not Possible");
        }

        // System.out.println("Total ways of nQueens To Solve it in = " + count);
    }
}
