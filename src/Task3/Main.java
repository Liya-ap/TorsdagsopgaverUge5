package src.Task3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Room> apartment = new ArrayList<>();

        Room bathroom = new Room(1,2,1);
        Room livingRoom = new Room(1,4,2);
        Room kitchen = new Room(1,4,1);
        Room bedroom = new Room(1,2,2);
        apartment.add(bathroom);
        apartment.add(livingRoom);
        apartment.add(kitchen);
        apartment.add(bedroom);

        Building building = new Building(apartment,1,1,false);
        System.out.println("Amount of lamps in building: " + countLampsInBuilding(building));
        System.out.println("Is the building normal?: " + isNormal(building));
    }

    public static int countLampsInBuilding(Building building) {
        int lampsAmount = 0;
        for (Room r: building.getRooms()) {
            lampsAmount += r.getNumberOfLamps();
        }
        return lampsAmount;
    }

    public static boolean isNormal(Building building) {
        if (building.getNumberOfFloors() > building.getRooms().size()) {
            return true;
        }

        System.out.println("\nThis is an odd building");
        return false;
    }
}
