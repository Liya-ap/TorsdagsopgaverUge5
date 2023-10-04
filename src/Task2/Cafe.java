package src.Task2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.io.File;
import java.util.Scanner;

public class Cafe {
    private ArrayList<String> coffeeMenu = new ArrayList<>();

    public ArrayList<String> getCoffeeMenu() {
        return coffeeMenu;
    }

    public void loadMenuData() {
        File file = new File("src/Task2/coffees.txt");

        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNextLine()) {
                String coffee = fileReader.nextLine();
                coffeeMenu.add(coffee);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        }
    }
}
