/**
 * OOPS Banner App - UC7
 * Stores character patterns using an Inner Static Class
 * and prints "OOPS" in banner format.
 */
public class OOPSBannerAppUC7 {

    /**
     * Inner Static Class to encapsulate
     * character and its 7-line banner pattern.
     */
    public static class CharacterPatternMap {

        private final char character;
        private final String[] pattern;

        /**
         * Constructor to initialize character and pattern
         *
         * @param character the character
         * @param pattern   7-line banner pattern
         */
        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        /**
         * Returns the stored character
         *
         * @return character
         */
        public char getCharacter() {
            return character;
        }

        /**
         * Returns the stored pattern
         *
         * @return 7-line pattern
         */
        public String[] getPattern() {
            return pattern;
        }
    }

    /**
     * Utility method to fetch pattern of a character
     *
     * @param ch character to search
     * @param patterns array of CharacterPatternMap
     * @return matching pattern or null
     */
    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] patterns) {
        for (CharacterPatternMap map : patterns) {
            if (map.getCharacter() == ch) {
                return map.getPattern();
            }
        }
        return null;
    }

    /**
     * Prints banner text
     *
     * @param text word to print
     * @param patterns array of CharacterPatternMap
     */
    public static void printBanner(String text, CharacterPatternMap[] patterns) {

        StringBuilder[] bannerLines = new StringBuilder[7];

        // Initialize 7 rows
        for (int i = 0; i < 7; i++) {
            bannerLines[i] = new StringBuilder();
        }

        // Build banner
        for (char ch : text.toCharArray()) {

            String[] pattern = getCharacterPattern(ch, patterns);

            if (pattern != null) {
                for (int i = 0; i < 7; i++) {
                    bannerLines[i].append(pattern[i]).append("  ");
                }
            }
        }

        // Print banner
        for (StringBuilder line : bannerLines) {
            System.out.println(line);
        }
    }

    /**
     * Main method
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Pattern for O
        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        // Pattern for P
        String[] P = {
                "****** ",
                "*     *",
                "*     *",
                "****** ",
                "*      ",
                "*      ",
                "*      "
        };

        // Pattern for S
        String[] S = {
                " ***** ",
                "*     *",
                "*      ",
                " ***** ",
                "      *",
                "*     *",
                " ***** "
        };

        // Array of CharacterPatternMap objects
        CharacterPatternMap[] patterns = {
                new CharacterPatternMap('O', O),
                new CharacterPatternMap('P', P),
                new CharacterPatternMap('S', S)
        };

        // Display OOPS
        printBanner("OOPS", patterns);
    }
}