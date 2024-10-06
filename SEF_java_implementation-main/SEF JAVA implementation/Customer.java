public class Customer {
    protected int customerID;
    protected String customerName;
    protected String customerEmail;
    
    public void confirmAppointment(Appointment appointment){
        Appointment customerAppointment;
        customerAppointment = appointment;
        
    }

    public void updateInformation(){
        System.out.println(customerID);
        System.out.println(customerName);
        System.out.println(customerEmail);
    }


}
