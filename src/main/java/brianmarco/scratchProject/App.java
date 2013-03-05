package brianmarco.scratchProject;

public class App 
{
    public static void main( String[] args )
    {
    	System.out.println(doReverseWords(args));
    }
    
    public static String doReverseWords(String[] words) {
    	if (words == null || words.length < 1) {
    		return null; 
    	}
    	
    	StringBuilder result = new StringBuilder();
    	
    	for (String word : words) {
    		StringBuilder reverser = new StringBuilder(word);
    		result.append(reverser.reverse().append(" ").toString());
    	}
    	
    	return result.toString().trim();
    }
}
