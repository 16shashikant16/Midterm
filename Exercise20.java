public class Exercise20 {
    public static void main(String[] args) 
    {
        String str = "hello hii";
        System.out.println(removeDuplicateChar(str));
    }
   
    public static String removeDuplicateChar(String str)
    {
        if(str.length()==1) return str;
   
        if(str.charAt(0)==str.charAt(1)){
        return removeDuplicateChar(str.substring(1));
        }
        else
        {
        return str.charAt(0) + removeDuplicateChar(str.substring(1));
        }
    }
}
   