// Calculates all permutations of a string

public class PermutationsOfAGivenString {
    
    public static void main(String[] args) {
        String str = "abc";
        perm(str,0,str.length()-1);
    }


    public static String swap(String str, int i , int j) {
		if(str == null || str.isEmpty()) {
			return str;
		}
		if(str.length() == 0) {
			return str;
		}
		char[] charArray = str.toCharArray();
		char temp = charArray[i];
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
	
	public static void perm(String str, int left,int right) {
		if(str == null || str.isEmpty()) {
			return;
		}
		if(left == right) {
			System.out.print(str + "\n");
		}
		
		for(int i = left ; i <= right ; i++) {
			String swapped = swap(str,left,i);
			perm(swapped, left + 1,right);
		}
	}
	
}
