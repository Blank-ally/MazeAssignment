package edu.wctc;

public class AnimalCrossingRoom extends room implements Exitable {
    public AnimalCrossingRoom(String name) {
        super(name);
    }

    @Override
    public String exit(player player) {
        return "you Have reached your island you can rest from your long journey";
    }

    @Override
    public String GetDescription() {
        return "There is gentle sway of the palm trees as you are greeted by Tom Nook,Timmy,Tommy and isabelle welcoming you to the island ";
    }
}
