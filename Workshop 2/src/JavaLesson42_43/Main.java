package JavaLesson42_43;

public class Main {
    public static void main(String[] args) {
        CustomerManager customerManager=new CustomerManager(new OracleCustomerDal());
        customerManager.add();
    }
}
