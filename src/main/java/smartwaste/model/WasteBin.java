/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartwaste.model;

/**
 *
 * @author viivihnogueira
 */
public class WasteBin {
    
    /// adding attributes 
    private int binID;
    private String location;
    private String wasteType;
    private String fillLevel;
    
    ///constructort to create a bin object
   public WasteBin(int binID, String location, String wasteType, String fillLevel){
       this.binID = binID;
       this.location = location;
       this.wasteType = wasteType;
       this.fillLevel = fillLevel;
   }

   /// adding getters
    public int getBinID() {
        return binID;
    }

    public String getLocation() {
        return location;
    }

    public String getWasteType() {
        return wasteType;
    }

    public String getFillLevel() {
        return fillLevel;
    }

    /// adding setters - binID is not necessary
    public void setLocation(String location) {
        this.location = location;
    }

    public void setWasteType(String wasteType) {
        this.wasteType = wasteType;
    }

    public void setFillLevel(String fillLevel) {
        this.fillLevel = fillLevel;
    }
 
    /// ToString method to display the output to the user
   @Override
   public String toString(){
       return "ID: " + binID +
               "| Location: " + location +
               "| Waste Type: " + wasteType +
               "| Fill Level: " + fillLevel; 
   }
    
}
