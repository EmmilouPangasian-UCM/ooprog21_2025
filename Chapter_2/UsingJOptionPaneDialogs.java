import javax.swing.*;

public class UsingJOptionPaneDialogs {
    public static void main(String[] args) {
        // Loop to repeatedly ask for name if the user does not confirm
        while (true) {
            // Step 1: Ask for the user's name
            String name = JOptionPane.showInputDialog("Please enter your name:");

            // If the user cancels or doesn't enter a name, exit the loop
            if (name == null || name.isEmpty()) {
                JOptionPane.showMessageDialog(null, "No name entered. Exiting program.");
                break;
            }

            // Step 2: Ask if they want their name to be shown
            int response = JOptionPane.showConfirmDialog(
                null,
                "Do you want your name to be displayed: " + name + "?",
                "Confirm Name Display",
                JOptionPane.YES_NO_OPTION
            );

            // Step 3: Handle the user's response
            if (response == JOptionPane.YES_OPTION) {
                // If YES, show their name in a message dialog
                JOptionPane.showMessageDialog(null, "Your name is: " + name);
                break; // Exit the loop
            } else {
                // If NO or Cancel, return to the input dialog
                JOptionPane.showMessageDialog(null, "Let's try again.");
            }
        }
    }
}

