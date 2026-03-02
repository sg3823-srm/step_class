/*
 * OOPSBannerApp UC5 – Render OOPS as Banner using Inline Array Initialization
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Declare + initialize + populate array in ONE step
        String[] lines = {
                String.join(" ", " *** ", " *** ", " ***** ", " ***** "),
                String.join(" ", "*   *", "*   *", "*     ", "*     "),
                String.join(" ", "*   *", "*   *", "*     ", "*     "),
                String.join(" ", "*   *", "*   *", " *****", " *****"),
                String.join(" ", "*   *", "*   *", "*     ", "     *"),
                String.join(" ", "*   *", "*   *", "*     ", "*    *"),
                String.join(" ", " *** ", " *** ", "*     ", " **** ")
        };

        // Print using enhanced for loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}