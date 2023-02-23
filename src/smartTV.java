public class smartTV {

    boolean statusTV;
    int channelSelected;
    int volumeSelected;

    public smartTV() {
        statusTV = false;
        channelSelected = 0;
        volumeSelected = 0;
    }    

    public void changeStatusTV(boolean statusTV) {
        statusTV = !statusTV;
    }
    
    public void upVolume(int volumeSelected){
        volumeSelected ++;
    }

    public void downVolume(int volumeSelected){
        volumeSelected --;
    }
    
    public void upChannel(int channelSelected){
        channelSelected ++;
    }
    
    public void downChannel(int channelSelected){
        channelSelected --;
    }
    
    public int setChannel(int channelSelected){
        int newChannelSelected = channelSelected;
        return newChannelSelected;
    }        

}
