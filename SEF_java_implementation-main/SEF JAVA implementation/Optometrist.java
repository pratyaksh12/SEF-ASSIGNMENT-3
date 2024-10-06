import java.util.ArrayList;

public class Optometrist {
    private int optometristID;
    private String optometristName;    
    private ArrayList<String> availabilities;
    
    
    public boolean confirmPrescription(){
        Prescription Prescrpition = new Prescription();
        return true;
    }

    public void showAvailabilities(){
        for(String availability : availabilities){
            System.out.println(availability);
        }
    }
}
