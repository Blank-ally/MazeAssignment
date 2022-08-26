package edu.wctc;
/*
*Maze: A concrete class that contains a Room field called currentRoom and a Player field called player. It also contains a boolean field called isFinished that is initially false.
* The Maze class contains the following methods.
[x]A constructor that creates a Player object and assigns it to the field. The Maze constructor creates all of the Room objects in the game and connects them using the Rooms' setter methods.
* The Room in which the Player begins the game is assigned to the currentRoom field. (See below for instructions on creating concrete Room classes.)
[x]A method named exitCurrentRoom that returns a String. If the currentRoom is Exitable, it returns the result of calling exit() on the Room. If not, it returns a message that the current room is not exitable.
[x]A method named interactWithCurrentRoom that returns a String. If the currentRoom is Interactable, it returns the result of calling interact on the Room. If not, it returns a message that no interactions are possible.
[x]A method named lootCurrentRoom that returns a String. If the currentRoom is Lootable, it returns the result of calling loot on the Room. If not, it returns a message that the current room is not lootable.
[x]A method named move that accepts a char argument for the direction and returns a boolean. If the direction is valid to move from within the currentRoom, the adjoining Room becomes the new currentRoom and the method returns true. If not, the method returns false.
[x]Methods named getPlayerScore and getPlayerInventory that return the result of calling the Player's getScore and getInventory methods.
[x]Methods named getCurrentRoomDescription and getCurrentRoomExits that return the result of calling the getDescription and getExits method of the currentRoom.
[x]A method named isFinished that returns the Maze's isFinished field (a boolean).*/
public class maze{
    player Player ;
   room currentRoom ;
    boolean isFinshed = false;
// [x]add room to the maze
    // [x]add player
    //[]connect rooms
    public maze() {
        Player = new player();
        currentRoom = new StartRoom("White room");
        ZeldaRoom zeldaRoom = new ZeldaRoom("Zelda Room");
        UndertaleRoom undertaleRoom = new UndertaleRoom("Undertale room");
        AnimalCrossingRoom animalCrossingRoom = new AnimalCrossingRoom("Animal Crossing room");
        currentRoom.setUp(zeldaRoom);
        zeldaRoom.setEast(undertaleRoom);
        zeldaRoom.setDown(currentRoom);
        undertaleRoom.setWest(zeldaRoom);
        undertaleRoom.setNorth(animalCrossingRoom);
        animalCrossingRoom.setSouth(undertaleRoom);


    }

    public String ExitCurrentRoom(){

        if (currentRoom instanceof Exitable){
            ((Exitable) currentRoom).exit(Player);
            return ((Exitable) currentRoom).exit(Player);
        } else
            return "Sorry there is no exit here";


    }
    public String GetcurrentRoomDescription(){
        return currentRoom.GetDescription();

    }
    public String GetCurrentRoomExits(){
        return currentRoom.GetExits();
    }
    public String GetPlayerInventory(){
        return Player.GetInventory();

    }
    public int GetPlayerScore(){
        return Player.GetScore();
    }
    public String InteractWithCurrentRoom(){
        if (currentRoom instanceof Interactable){

            return ((Interactable) currentRoom).interact(Player);

        } else return "No interraction Availible";
    }
    public boolean isFinshed(){

        return isFinshed;
    }
    public String LootCurrentRoom(){
        if (currentRoom instanceof Lootable){
            return ((Lootable) currentRoom).Loot(Player);
        } else return "there is nothing to loot here";
    }
    public boolean move  (char c){
        if(currentRoom.IsValidDirection(c)){
           switch(c) {
               case 'n':
                   currentRoom = currentRoom.north;
                   break;
               case 's':
                   currentRoom = currentRoom.south;
                   break;
               case 'w':
                   currentRoom = currentRoom.west;
                   break;
               case 'e':
                   currentRoom = currentRoom.east;
                   break;
               case 'u':
                   currentRoom = currentRoom.up;
                   break;
               case 'd':
                   currentRoom = currentRoom.down;
                   break;
           }

        return true;
        } else return  false;


    }



}
