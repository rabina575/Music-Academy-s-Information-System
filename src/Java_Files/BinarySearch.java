/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Files;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * The class consists of a method binarySearch which returns an object.
 * @author Aashna Shrestha, Rabina Shrestha, Subriti Aryal
 */
public class BinarySearch {
    /*
     * An arrayList - instrumentList, a String - target and sortBy of type SortBy is passed in the parameter.
     * The target value is searched in a sorted arrayList.
     * If the target is found its object is returned with the type MusicalInstrument.
    */

    public static MusicalInstrument binarySearch(ArrayList<MusicalInstrument> list, String searchElement) {
        int right = list.size() - 1;
        int left = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
                if (String.valueOf(list.get(mid).getPrice()).equals(searchElement)) {
                    return list.get(mid);
                } else if (String.valueOf(list.get(mid).getPrice()).compareTo(searchElement) > 0) {
                    right = mid - 1;

                } else {
                    left = mid + 1;
                }
            }
        return null;
    }
}
