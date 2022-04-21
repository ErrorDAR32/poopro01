package app;

import java.util.ArrayList;

/** this class represents the four spaces where colors go, and the four spaces for the hints **/
public class PointRow {
    ArrayList<Point> guess;
    ArrayList<Point> hints;

    public ArrayList<Point> getGuess() {
        return guess;
    }
}
