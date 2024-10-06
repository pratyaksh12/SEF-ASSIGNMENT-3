public class Prescription {
    private int prescriptionID;
    private int customerID;
    private int optometristID;
    private String prescriptionDetails;

    public void showPrescription(){
        System.out.println(prescriptionID);
        System.out.println(customerID);
        System.out.println(optometristID);
        System.out.println(prescriptionDetails);
    }
}
