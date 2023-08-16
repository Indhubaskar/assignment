public class DupliString {
    public static void main(String[] args) {
        String st="abvvcfhjjg";
        int len=st.length();
        char[] cha=st.toCharArray();
        for(int i=0;i<len;i++)
        {
            for (int j=i+1;j<len;j++)
            {
                if(cha[i]==cha[j])
                {
                    System.out.println("solution:"+cha[j]);
                    break;
                }
            }
        }
    }
}
