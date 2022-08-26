package edu.wctc;

public class ZeldaRoom extends room implements Lootable  {

    public ZeldaRoom(String name) {
        super(name);
    }

    @Override
    public String GetDescription() {
        return "The Grassy fields of Hyrule provide a warm an inviting air";
    }

    @Override
    public String Loot(player player) {
        player.AddToInventory("Sword");
        player.addToScore(50);
        return "There is mossy chess that lay in the grass infront of you";

    }
}
