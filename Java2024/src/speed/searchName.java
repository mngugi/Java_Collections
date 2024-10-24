package speed;

public class searchName {
	public static void main(String[] args) {
		String[] names = new String[4];
		
		names[0] = "katuma katavi";
		names[1] = "kanini kadogo";
		names[2] = "mutego kushika";
		names[3] = "kanyundo kupiga";
		
		 // Search for the name in the array
        String targetName = "katuma katavi";
        boolean found = false;
        
        // Loop through the array to find the name
        for (String name : names) {
            if (name.equals(targetName)) {
                found = true;
                break;
            }
        }
        
        // Print result
        if (found) {
            System.out.println("Name found");
        } else {
            System.out.println("Name not found");
        }
    }
}