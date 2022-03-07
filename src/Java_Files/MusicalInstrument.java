/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_Files;

/**
 * The class consists of six variable declarations: instrumentId, instrumentName, modelNum, brand, price and warranty.
 * The class consists of a constructor to initialize the variables and mutator methods to get the instrument details.
 * @author Aashna Shrestha, Rabina Shrestha, Subriti Aryal
 */
public class MusicalInstrument {
    //Declaration of instance variables
    private int instrumentId;
    private String instrumentName;
    private String modelNum;
    private String brand;
    private int price;
    private int warranty;

    /*
    * Constructor with the parameters: instrumentId, instrumentName, modelNum, brand, price and warranty.
    * The variables are initialized.
    */
    MusicalInstrument(int instrumentId, String instrumentName, String modelNum, String brand, int price, int warranty) {
        this.instrumentId = instrumentId;
        this.instrumentName = instrumentName;
        this.modelNum = modelNum;
        this.brand = brand;
        this.price = price;
        this.warranty = warranty;
    }

    /*
     * Accessor method for Instrument ID.
     * Returns instrumentId.
    */
    public int getInstrumentId() {
        return this.instrumentId;
    }
    
    /*
     * Accessor method for Instrument Name.
     * Returns instrumentName.
    */
    public String getInstrumentName() {
        return this.instrumentName;
    }
    
    /*
     * Accessor method for Model Number of the instrument.
     * Returns modelNum.
    */
    public String getmodelNum() {
        return this.modelNum;
    }
    
    /*
     * Accessor method for brand of the instrument.
     * Returns brand.
    */
    public String getBrand() {
        return this.brand;
    }
    
    /*
     * Accessor method for Price of the instrument.
     * Returns price.
    */
    public int getPrice() {
        return this.price;
    }

    /*
     * Accessor method for Warranty of the instrument.
     * Returns warranty.
    */
    public int getWarranty() {
        return this.warranty;
    }
}
