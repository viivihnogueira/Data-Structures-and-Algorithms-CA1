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
    
    ///method to delete bins
    public boolean deleteBin(int binID){
        for (WasteBin bin : bins){
            if(bin.getBinID() == binID){
                bins.remove(bin);
                return true;
            }
        }
        return false;
    }
    
    /// method to not accept duplicated bins
  public boolean binExists(int binID) {
      for (WasteBin bin : bins){
          if (bin.getBinID() == binID){
              return true;
          }
      }
      return false;
  }
}
