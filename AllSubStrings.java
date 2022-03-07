public class AllSubStrings {
    public static void main(String[] args){
        allSubString("abcd");
    }
    public static void allSubString(String str){
        if(str == null || str.isEmpty()){
            return;
        }

        for(int i=0; i<str.length();i++){
            for(int j =i; j<str.length(); j++){
                String subString = str.substring(i,j+1);
                System.out.println(subString);
            }
        }

    }
}
