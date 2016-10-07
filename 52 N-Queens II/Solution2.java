**
 * don't need to actually place the queen,
 * instead, for each row, try to place without violation on
 * col/ diagonal1/ diagnol2.
 * trick: to detect whether 2 positions sit on the same diagnol:
 * if delta(col, row) equals, same diagnol1;
 * if sum(col, row) equals, same diagnal2.
 */
private final Set<Integer> occupiedCols = new HashSet<Integer>();
private final Set<Integer> occupiedDiag1s = new HashSet<Integer>();
private final Set<Integer> occupiedDiag2s = new HashSet<Integer>();
public int totalNQueens(int n) {
    return totalNQueensHelper(0, 0, n);
}

private int totalNQueensHelper(int row, int count, int n) {
    for (int col = 0; col < n; col++) {
        if (occupiedCols.contains(col))
            continue;
        int diag1 = row - col;
        if (occupiedDiag1s.contains(diag1))
            continue;
        int diag2 = row + col;
        if (occupiedDiag2s.contains(diag2))
            continue;
        // we can now place a queen here
        if (row == n-1)
            count++;
        else {
            occupiedCols.add(col);
            occupiedDiag1s.add(diag1);
            occupiedDiag2s.add(diag2);
            count = totalNQueensHelper(row+1, count, n);
            // recover
            occupiedCols.remove(col);
            occupiedDiag1s.remove(diag1);
            occupiedDiag2s.remove(diag2);
        }
    }
    
    return count;
}

/**
public class Solution {
    int result = 0;
    public int totalNQueens(int n) {
        boolean[] column = new boolean[n];
        boolean[] dia45 = new boolean[2 * n - 1];
        boolean[] dia135 = new boolean[2 * n - 1];
        helper(0, n, column, dia45, dia135);
        return result;
    }
    private void helper(int row, int n, boolean[] column, boolean[] dia45, boolean[] dia135) {
        if (row == n) {
            result++;
            return;
        }
        for (int col = 0; col < n; col++) {
            if (!column[col] && !dia45[col + row] && !dia135[n - 1- row + col]) {
                column[col] = dia45[col + row] = dia135[n - 1- row + col] = true;
                helper(row + 1, n, column, dia45, dia135);
                column[col] = dia45[col + row] = dia135[n - 1- row + col] = false;
            }
        }
    }
}
*/