import javax.swing.*;
public class GUI {

    GUI() {

        // Skapa ett nytt fönster (syns inte på skärmen)
        JFrame frame = new JFrame("Lektion 7 - Swing it magistern");
        // Sätt storlek på fönstret
        frame.setSize(600, 300);
        // Bestäm vad som skall hända när vi stänger fönstret
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Skapa Panel
        JPanel panel = new JPanel();
        // Lägg till panelen till vårt formulär
        frame.add(panel);

        // Skapa en ny etikett
        JLabel label = new JLabel("Hejsan svejsan JAVA23!");
        // Lägga ut etiketten på formuläret
        //frame.add(label);
        // Lägg till etiketten till vår panel istället.
        panel.add(label);

        // Skapa en ny knapp
        JButton button = new JButton("Klicka på mig! Nu!");
        // Lägg ut knappen på formuläret
        //frame.add(button);
        // Lägg till knappen till vår panel istället.
        panel.add(button);

        // Skapa en TextArea
        JTextArea textArea = new JTextArea("Detta är min JTextArea!");
        // Lägg ut den på formuläret
        //frame.add(textArea);
        // Lägg till TextArea till vår panel istället.
        panel.add(textArea);

        // Skapa en TextField
        JTextField textField = new JTextField("Detta är mitt jTextFieLd");
        // Lägg ut den på formuläret
        // frame.add(textField);
        // Lägg till TextField till vår panel istället.
        panel.add(textField);

        // Visa fönstret på skärmen
        frame.setVisible(true);
    }

}
