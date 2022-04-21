package app;

import java.util.ArrayList;

public class mastermind {
    Integer CurrentRow;
    ArrayList<PointRow> Rows;
    ArrayList<Integer> Solution;

    /** constructs a game state with default conditions **/
    public mastermind(ArrayList<Integer> solution) {
        this.CurrentRow = 0;
        this.Rows = new ArrayList<>();
        this.Solution = solution;

        for (int i=0; i<10; i++) {
            Rows.add(new PointRow());
        }
    }
    /** checks colors on current row
     * output array of integers encode:
     * 0= no hint
     * 1= red hint (good color)
     * 2= white hint (good color, good position)*/
    public ArrayList<Integer> CheckColors() {
        ArrayList<Integer> result = new ArrayList<>();

        PointRow currentRow = this.Rows.get(this.CurrentRow);

        for(int i=0; i<4; i++) {
            if (currentRow.getGuess().get(i).getColor() == this.Solution.get(i)) {
                result.add(2);
            } else if (this.Solution.contains(currentRow.getGuess().get(i).getColor())) {
                result.add(1);
            } else result.add(0);
        }
        return result;
    }
}
