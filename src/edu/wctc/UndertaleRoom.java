package edu.wctc;

public class UndertaleRoom extends room implements Lootable,Interactable  {
    public UndertaleRoom(String name) {
        super(name);
    }

    @Override
    public String interact(player player) {
        player.addToScore(-80);
        player.AddToInventory("tears of regret");
        return "A strange skeleton man says he will give you 3 coins to let him sing you a song";
    }

    @Override
    public String Loot(player player) {
        player.addToScore(50);
        player.AddToInventory("Papyrus's arm");
        return "The is a rather annoying dog who keep bugging you there seems to be something hanging out of his mouth";
    }

    @Override
    public String GetDescription() {
        return " you are filled with a sense of determination as you enter ";
    }
}
