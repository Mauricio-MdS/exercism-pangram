public class PangramChecker {

    public boolean isPangram(String input) {
        for (int characterCodepoint = "a".codePointAt(0);
             characterCodepoint <= "z".codePointAt(0);
             characterCodepoint++)
            if (!input.toLowerCase().contains(Character.toString(characterCodepoint))) return false;

        return true;
    }
}
