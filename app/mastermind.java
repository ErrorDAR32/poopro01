package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.Random;

public class mastermind {
    Integer CurrentRow;
    ArrayList<Integer> HistoryPoints;
    ArrayList<Integer> Solution;

    /** constructs a game state with default conditions **/
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


    /** checks colors on current row
     * output array of integers encode:
     * 0= no hint
     * 1= red hint (good color)
     * 2= white hint (good color, good position)*/
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
