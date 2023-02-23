public class smartTV {

    // variables
    boolean statusTV;
    int channelSelected;
    int volumeSelected;

    public void changeStatusTV() {
        statusTV = !statusTV;
    }
    
    public void increaseVolume(int volumeSelected){
        volumeSelected ++;
    }

    public void decreaseVolume(int volumeSelected){
        volumeSelected --;
    }
    
    public void increaseChannel(int channelSelected){
        channelSelected ++;
    }
    
    public void decreaseChannel(int channelSelected){
        channelSelected --;
    }
    
    public int setChannel(int channelSelected){
        int newChannelSelected = channelSelected;
        return newChannelSelected;
    }        

}
