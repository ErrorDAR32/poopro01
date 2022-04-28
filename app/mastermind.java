/**
 * Container Package
 */
package app;

/**
 * Necesary imports
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

/**
 * This class represents the variables and methods necesaries for the program function.
 * @author: Dariem F. Hidalgo, Pablo A. Arguedas.
 * @version: 27/04/2022
 */
public class mastermind {
    /**
     * Declarations
     */
    Integer CurrentRow;
    ArrayList<Integer> HistoryPoints;
    ArrayList<Integer> Solution;

    /**
     * Constructs a game state with default conditions
     * @param solution(List with the solution of the game)
     * @return void
     */
    public mastermind(ArrayList<Integer> solution) {
        this.CurrentRow = 0;
        this.HistoryPoints = new ArrayList<>();
        this.Solution = solution;

        for (int i=0; i<40; i++) {
            HistoryPoints.add(6);
        }
    }

    public ArrayList<Integer> getHistoryPoints() {
        return HistoryPoints;
    }

    public void setHistoryPoints(ArrayList<Integer> historyPoints) {
        HistoryPoints = historyPoints;
    }

    public Integer getCurrentRow() {
        return CurrentRow;
    }

    public void setCurrentRow(Integer currentRow) {
        CurrentRow = currentRow;
    }



    /**
     * Checks colors on current row
     * @param
     * @return ArrayList<Integer>
     * result posible contains:
     * 0= no hint
     * 1= red hint (good color)
     * 2= white hint (good color, good position)
     */
    public ArrayList<Integer> CheckColors() {
        ArrayList<Integer> result = new ArrayList<>();

        for(int i=0; i<4; i++) {
            int point = CurrentRow-4+i;

            if (Objects.equals(HistoryPoints.get(point), this.Solution.get(i))) {
                result.add(2);
            } else if (this.Solution.contains(HistoryPoints.get(point))) {
                result.add(1);
            } else result.add(0);
        }

        Random r1 = new Random();

        for (int i = result.size() - 1; i >= 1; i--) {
            // swapping current index value
            // with random index value
            Collections.swap(result, i, r1.nextInt(i + 1));
        }

        return result;
    }

    public void addGuess(ArrayList<Integer> guess) {
        for (int i=0; i<4; i++) {
            HistoryPoints.set(CurrentRow+i, guess.get(i));
        }
        CurrentRow += 4;
    }

    public ArrayList<Integer> getSolution() {
        return Solution;
    }

    public void setSolution(ArrayList<Integer> solution) {
        Solution = solution;
    }
}
