/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Files;

import java.util.ArrayList;

/**
 * The class consists of two methods: mergeSort and merge.
 * @author Aashna Shrestha, Rabina Shrestha, Subriti Aryal
 */
public class MergeSort {
    /*
     * An arrayList - instrumentList and sortBy with the type SortBy are passed in the parameter.
     * The method sorts the ArrayList passed in the parameter using Merge Sort.
     * The sorted arrayList - instrumentList is returned 
     */
    public static ArrayList<MusicalInstrument> mergeSort(ArrayList<MusicalInstrument> instrumentList, SortBy sortBy) {
        ArrayList<MusicalInstrument> left = new ArrayList<MusicalInstrument>();
        ArrayList<MusicalInstrument> right = new ArrayList<MusicalInstrument>();
        int mid;
        if (instrumentList.size() == 1) {
            return instrumentList;
        } else {
            mid = instrumentList.size() / 2;
            // the left half of instrumentList is stored in the ArrayList left
            for (int i = 0; i < mid; i++) {
                left.add(instrumentList.get(i));
            }

            //the right half of instrumentList is stored in the ArrayList right
            for (int i = mid; i < instrumentList.size(); i++) {
                right.add(instrumentList.get(i));
            }

            // the ArrayLists left and right are sorted by mergeSort
            left = mergeSort(left, sortBy);
            right = mergeSort(right, sortBy);

            // method to merge the arrayLists is called
            merge(left, right, instrumentList, sortBy);
        }
        return instrumentList;
    }
    
    /*
     * The arraylists - left, right, instrumentList and sortBy of type SortBy is taken as the parameter.
     * Merges the arrayLists.
    */
    private static void merge(ArrayList<MusicalInstrument> left, ArrayList<MusicalInstrument> right, ArrayList<MusicalInstrument> instrumentList, SortBy sortBy) {
        int leftIndex = 0;
        int rightIndex = 0;
        int instrumentListIndex = 0;
        
        // Checks if the lists have to be sorted by category or price.
        // Compares the category and sorts by category if sortby == sortBy.CATEGORY
        //Compares the price and sorts by price if sortby == sortBy.PRICE
        while (leftIndex < left.size() && rightIndex < right.size()) {
            if (sortBy == sortBy.CATEGORY) {
                if ((left.get(leftIndex).getInstrumentName().compareTo(right.get(rightIndex).getInstrumentName())) < 0) {
                    instrumentList.set(instrumentListIndex, left.get(leftIndex));
                    leftIndex++;
                } else {
                    instrumentList.set(instrumentListIndex, right.get(rightIndex));
                    rightIndex++;
                }
            } else {
                if ((String.valueOf(left.get(leftIndex).getPrice()).compareTo(String.valueOf(right.get(rightIndex).getPrice()))) < 0) {
                    instrumentList.set(instrumentListIndex, left.get(leftIndex));
                    leftIndex++;
                } else {
                    instrumentList.set(instrumentListIndex, right.get(rightIndex));
                    rightIndex++;
                }
                
            }
            instrumentListIndex++;
        }
        ArrayList<MusicalInstrument> rest;
        int restIndex;
        if (leftIndex >= left.size()) {
            rest = right;
            restIndex = rightIndex;
        } else {
            rest = left;
            restIndex = leftIndex;
        }

        // The remaining elements in the arraylist are added.
        for (int i = restIndex; i < rest.size(); i++) {
            instrumentList.set(instrumentListIndex, rest.get(i));
            instrumentListIndex++;
        }
    }
}
