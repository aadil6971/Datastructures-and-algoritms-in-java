public class RemoveUnwantedChraractersFromString {
	public static void main(String arg[]) {	
		System.out.print(remove("aaabc",'a'));
	}
	
	public static String remove(String str, char unwanted) {
		StringBuilder sb = new StringBuilder();
		char[] strArray = str.toCharArray();
		for(int i=0; i < strArray.length; i++) {
			if(strArray[i] != unwanted) {
				sb.append(strArray[i]);
			}
		}
		
		return sb.toString();
	}
	
	
}