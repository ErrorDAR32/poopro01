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

    /**
     * Constructs a game state with random values
     * @param
     * @return void
     */
    public mastermind() {
        this.CurrentRow = 0;
        this.HistoryPoints = new ArrayList<>();

        Random r = new Random();

        this.Solution = new ArrayList<>();
        Solution.add(r.nextInt(5));
        Solution.add(r.nextInt(5));
        Solution.add(r.nextInt(5));
        Solution.add(r.nextInt(5));

        for (int i=0; i<40; i++) {
            HistoryPoints.add(6);
        }
    }

    /**
     * Method for get the list that have the points of the game
     * @param
     * @return ArrayList<Integer>
     */
    public ArrayList<Integer> getHistoryPoints() {
        return HistoryPoints;
    }

    /**
     * Method for set a new list that have the points choosed by the user
     * @param historyPoints(A list with the points that choose the user)
     * @return void
     */
    public void setHistoryPoints(ArrayList<Integer> historyPoints) {
        HistoryPoints = historyPoints;
    }

    /**
     * Method for get the current row of the list
     * @param
     * @return Integer
     */
    public Integer getCurrentRow() {
        return CurrentRow;
    }

    /**
     * Method for set the row that the user is playing
     * @param currentRow(Number of the current Row)
     * @return void
     */
    public void setCurrentRow(Integer currentRow) {
        CurrentRow = currentRow;
    }



    /**
     * Checks colors on current row
     * @param
     * @return ArrayList<Integer>
     * result posible contains:
     * 0= no hint
     * 1= white hint (good color)
     * 2= red hint (good color, good position)
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

    /**
     * Method for add a try to the list of History Points
     * @param guess(A list with the colors of the try that the user do)
     * @return void
     */
    public void addGuess(ArrayList<Integer> guess) {
        for (int i=0; i<4; i++) {
            HistoryPoints.set(CurrentRow+i, guess.get(i));
        }
        CurrentRow += 4;
    }

    /**
     * Method for get the list that have the solution of the game
     * @param
     * @return ArrayList<Integer>
     */
    public ArrayList<Integer> getSolution() {
        return Solution;
    }

    /**
     * Method for set a new list that have the solution of the game
     * @param solution(List with the solution of the game)
     * @return void
     */
    public void setSolution(ArrayList<Integer> solution) {
        Solution = solution;
    }


    public void reset() {
        this.CurrentRow = 0;

        Random r = new Random();

        this.Solution.clear();
        Solution.add(r.nextInt(5));
        Solution.add(r.nextInt(5));
        Solution.add(r.nextInt(5));
        Solution.add(r.nextInt(5));

        for (int i=0; i<40; i++) {
            HistoryPoints.add(6);
        }
    }
}
