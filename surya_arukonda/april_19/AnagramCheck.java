public class AnagramCheck {
    boolean areAnagrams(String first, String second) {
        first = first.toLowerCase();
        second = second.toLowerCase();

        if (first.length() != second.length()) {
            return false;
        }

        String secondCopy = second;

        for (int i = 0; i < first.length(); i++) {
            char ch = first.charAt(i);
            int index = secondCopy.indexOf(ch);

            if (index == -1) {
                return false;
            }

            secondCopy = secondCopy.substring(0, index) + secondCopy.substring(index + 1);
        }

        return secondCopy.length() == 0;
    }
}