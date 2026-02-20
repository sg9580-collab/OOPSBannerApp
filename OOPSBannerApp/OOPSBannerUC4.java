public class OOPSBannerUC4 {

    public static void main(String[] args) {

        // Create a String array to store 7 lines of the banner
        String[] banner = new String[7];

        // Populate each line using String.join()
        banner[0] = String.join("  ",
                " ***** ",
                "*     *",
                "****** ",
                "****** ");

        banner[1] = String.join("  ",
                "*     *",
                "*     *",
                "*     *",
                "*     *");

        banner[2] = String.join("  ",
                "*     *",
                "*     *",
                "*     *",
                "*     *");

        banner[3] = String.join("  ",
                "*     *",
                " ***** ",
                "****** ",
                "****** ");

        banner[4] = String.join("  ",
                "*     *",
                "*       ",
                "*       ",
                "*   *   ");

        banner[5] = String.join("  ",
                "*     *",
                "*       ",
                "*       ",
                "*    *  ");

        banner[6] = String.join("  ",
                " ***** ",
                "*       ",
                "*       ",
                " ***** ");

        // Print banner using Enhanced For Loop
        for (String line : banner) {
            System.out.println(line);
        }
    }
}