public class remoteControll {
    
    public static void main(String[] args) {
        
        smartTV smartTV = new smartTV();

        System.out.println(smartTV.statusTV);
        
        smartTV.changeStatusTV();
        
    }
}
