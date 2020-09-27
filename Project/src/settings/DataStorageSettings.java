/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settings;

/**
 *
 * @author Hanane Nour
 */
public class DataStorageSettings {
   private Media mediaType;
   private Network networkType;
   private boolean autoDownload;
   
   public DataStorageSettings (Media mediaType, Network networkType)
   {
       this.mediaType = mediaType;
       this.networkType = networkType;
   }
   public DataStorageSettings (boolean autoDownload)
   {
       this.autoDownload = autoDownload;
   }

    /**
     * @return the mediaType
     */
    public Media getMediaType() {
        return mediaType;
    }

    /**
     * @return the networkType
     */
    public Network getNetworkType() {
        return networkType;
    }

    /**
     * @return the autoDownload
     */
    public boolean isAutoDownload() {
        return autoDownload;
    }

    /**
     * @param autoDownload the autoDownload to set
     */
    public void setAutoDownload(boolean autoDownload) {
        this.autoDownload = autoDownload;
    }
   
}
