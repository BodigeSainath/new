public class FirstNonRepeatedCharacter {
    char findFirstNonRepeated(String text) {
        for (int i = 0; i < text.length(); i++) {
            char current = text.charAt(i);
            int count = 0;

            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == current) {
                    count++;
                }
            }

            if (count == 1) {
                return current;
            }
        }

        return '\0';
    }
}