package structures;

public class stringBuilder {
    private StringBuilder text;

    // Constructor to initialize with a string
    public stringBuilder(String initialText) {
        this.text = new StringBuilder(initialText);
    }

    // Method to change the character at index k to character c
    public void setCharAt(int k, char c) {
        if (k >= 0 && k < text.length()) {
            text.setCharAt(k, c);
        } else {
            System.out.println("Index out of bounds.");
        }
    }

    // Method to retrieve the modified string
    public String getText() {
        return text.toString();
    }

    public static void main(String[] args) {
        // Example usage
        stringBuilder modifier = new stringBuilder("Hello, World!");
        System.out.println("Original text: " + modifier.getText());

        // Changing character at index 7 to 'J'
        modifier.setCharAt(7, 'J');
        System.out.println("Modified text: " + modifier.getText());
    }
}
