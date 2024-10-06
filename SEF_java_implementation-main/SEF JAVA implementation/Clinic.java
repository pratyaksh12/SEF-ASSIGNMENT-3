import java.util.ArrayList;

public class Clinic {
    private int clinicID;
    private String clinicName;
    private ArrayList<Optometrist> optometrists;

    public void showAvailableAppoitments(){
        for(Optometrist opts : optometrists){
            opts.showAvailabilities();
        }
    }

}
