/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartwaste.manager;

import java.util.ArrayList;
import smartwaste.model.WasteBin;

/**
 *
 * @author viivihnogueira
 */
public class WasteManager {
    
    //declaring and creating WasteBin ArrayList to save all bins added by the user
    private ArrayList <WasteBin> bins;
    
    public WasteManager() {
    bins = new ArrayList<>();
}
    public void addBin(WasteBin bin){
        bins.add(bin);
    }
    
    public ArrayList<WasteBin> getBins(){
        return bins;
    }
}
