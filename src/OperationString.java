public class OperationString {
    public static void main(String[] args) {
        Word wd=new Word();
        System.out.println(wd.Fname.toUpperCase());
        System.out.println(wd.Lname.getBytes());
        System.out.println(wd.Mname.concat(wd.Lname));
        System.out.println(wd.Mname.charAt(2));
        System.out.println(wd.Fname.compareTo(wd.Lname));

    }

}
