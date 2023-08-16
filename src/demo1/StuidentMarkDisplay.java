package demo1;

public class StuidentMarkDisplay {
    public static void main(String[] args) {
        StudentMark sm=new StudentMark();
        int ans=sm.mark(45,34);
        float ans1=sm.mark(45.9f,32.4f,54.2f);
        System.out.println(ans);
        System.out.println(ans1);
    }


    }

