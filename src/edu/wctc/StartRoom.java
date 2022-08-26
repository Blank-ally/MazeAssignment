package edu.wctc;

public class StartRoom extends room{

    public StartRoom(String name) {
        super(name);
    }

    @Override
    public String GetDescription() {
        return "You are surrounded by blank white walls ";
    }
}
