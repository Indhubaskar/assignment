public class Extract {
    public String number;
    public String specialchar;
    public String enter;

    public static void main(String[] args) {
        Extract ex=new Extract();
        ex.enter="wFvLrl2xQjyrWrxeNI21@#9w";
        ex.specialchar= ex.enter.replaceAll("[!^0-9 a-z A-Z]","");
        ex.number= ex.enter.replaceAll("[^0-9]","");


        System.out.println(ex.number);

      System.out.println(ex.specialchar);


    }
}
