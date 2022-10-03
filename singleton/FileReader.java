package singleton;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Responsible for reading file
 */
public class FileReader {

    /**
     * Reads in the file and creates a list of clothing
     * 
     * @param fileName The file to read through
     * @param part     The type of clothes: (top, bottom, or whole outfit)
     * @return A list of clothing items
     */
    public static ArrayList<ClothingItem> getClothing(String fileName, ClothingPart part) {
        ArrayList<ClothingItem> clothing = new ArrayList<ClothingItem>();

        try {
            File file = new File(fileName);
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                String[] data = line.split(":");
                ClothingItem item = new ClothingItem(data[0], part, data[1].trim());
                String[] itemSeasons = data[2].split(",");

                for (Season season : Season.values()) {
                    if (hasSeason(itemSeasons, season)) {
                        item.addSeason(season);
                    }
                }

                clothing.add(item);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading file.");
            e.printStackTrace();
        }

        return clothing;
    }

    private static boolean hasSeason(String[] data, Season season) {
        for (String item : data) {
            if (item.trim().equalsIgnoreCase(season.toString())) {
                return true;
            }
        }
        return false;
    }
}
