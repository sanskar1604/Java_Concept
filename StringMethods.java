public class StringMethods {

	public static void main(String[] args) {
	
		String name = "Ram";
		String name1 = "Shyam";
		
		//length()
		int length = name.length();
		
		//charAt()
		name.charAt(1);
		
		//.equals()
		name.equals(name1);
		
		//.equalsIgnoreCase() -- ignore the uppercase and lowercase
		name.equalsIgnoreCase(name1);
		
		//.compareTo() -- compare the characters ASCII position for both string
		name.compareTo(name1);	
		
		//.comapreToIngnoreCase() -- ignore the uppercase and lowercase
		name.compareToIgnoreCase(name1);
		
		//.substring(beginIndex, endIndex)
		//.substring(beginIndex)
		name.substring(0);
		
		//.toUpperCase()
		name.toUpperCase();
		
		//.toLowerCase()
		name.toLowerCase();
		
		//.trim()
		name.trim();
		
		//.replace(target, replacement)
		name.replace("Ram", "Ram1");
		
		//.contains()
		name.contains("R");
		
		//.startWith()
		name.startsWith("R");
		
		//.endsWith()
		name.endsWith("1");
		
		//.isEmpty()
		name.isEmpty();
		
		//.isBlank()
		name.isBlank();
		
		//.indexOf()
		name.indexOf("a");
		
		//.lastIndexOf()
		name.lastIndexOf("a");
	}

}
