public class AccessModifer  {
    public static void main(String[] args) {
        Main ms=new Main();
        System.out.println(ms.name);
        System.out.println(ms.phoneNumber);
        System.out.println(ms.getId());
        //Private access modifier  can be only access within the class so using getter we can display the output in the other class
        //Public access modifier can be access globally
        //protected access modifer can be access within the package , if we want use it in other package make it has sub-class

    }
}
