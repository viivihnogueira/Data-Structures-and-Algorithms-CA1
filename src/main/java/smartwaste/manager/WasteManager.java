/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package smartwaste.manager;

import java.util.ArrayList;
import smartwaste.model.WasteBin;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author viivihnogueira
 */
public class WasteManager {
      
    //declaring ArrayList Bins to save all WasteBin objects added by the user
    private ArrayList<WasteBin> bins;
    
    /// declaring linked list queue to request collection of WasteBin Objects 
    private Queue<WasteBin> collectionQueue = new LinkedList<>();

    /// declaring stack to view history and proccessed WasteBin objects
    private Stack<WasteBin> collectionHistory = new Stack<>();
    
    /// constructor
    public WasteManager() {
        bins = new ArrayList<>();
    }

    /// method to add bins
    public void addBin(WasteBin bin) {
        bins.add(bin);
    }

    // method to view bins list
    public ArrayList<WasteBin> getBins() {
        return bins;
    }

    ///method to delete bins
    public boolean deleteBin(int binID) {
        for (WasteBin bin : bins) {
            if (bin.getBinID() == binID) {
                bins.remove(bin);
                return true;
            }
        }
        return false;
    }

    /// method to not accept duplicated bins
  public boolean binExists(int binID) {
        for (WasteBin bin : bins) {
            if (bin.getBinID() == binID) {
                return true;
            }
        }
        return false;
    }

    // method to update bins
    public boolean updateBin(int binID, String location, String wasteType, String fillLevel) {
        for (WasteBin bin : bins) {
            if (bin.getBinID() == binID) {

                bin.setLocation(location);
                bin.setWasteType(wasteType);
                bin.setFillLevel(fillLevel);
                return true;
            }
        }
        return false;
    }
    /// method to add a WasteBin object to the collection qu
    /// @param bin
    public void requestCollection(WasteBin bin){
        collectionQueue.add(bin);
    }
    
    /// method to view the queue
    /// @return e
   public Queue<WasteBin> getCollectionQueue(){
       return collectionQueue;
   }
   
   /// method to process colection of wastebin
   /// remove first wastebin object from the queue and add it to the stack/history
  public WasteBin processNextCollection(){
      if(!collectionQueue.isEmpty()){
          WasteBin bin = collectionQueue.poll(); //remove from queue
          collectionHistory.push(bin); ///add to stack
          return bin;
      }
       return null; //empty queue
  }

  /// method to return history
  public Stack<WasteBin> getCollectionHistory(){
      return collectionHistory;
  }

}
