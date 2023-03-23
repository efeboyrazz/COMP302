package ui.form;

import com.intellij.uiDesigner.core.GridConstraints;
import com.intellij.uiDesigner.core.GridLayoutManager;
import ui.ViewModel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HelpScreen implements ActionListener {
    private JButton closeButton;
    private JTextArea helpText;
    private JPanel helpScreen;

    public HelpScreen() {
        closeButton.addActionListener(e -> ViewModel.getInstance().getController().ShowPreviousScreen());
    }

    public JPanel getHelpPanel() {
        return helpScreen;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HelpScreen");
        frame.setContentPane(new HelpScreen().helpScreen);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }


    public JPanel getHelpScreen() {
        return helpScreen;
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    {
// GUI initializer generated by IntelliJ IDEA GUI Designer
// >>> IMPORTANT!! <<<
// DO NOT EDIT OR ADD ANY CODE HERE!
        $$$setupUI$$$();
    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        helpScreen = new JPanel();
        helpScreen.setLayout(new GridLayoutManager(2, 2, new Insets(0, 0, 0, 0), -1, -1));
        closeButton = new JButton();
        closeButton.setText("Close");
        helpScreen.add(closeButton, new GridConstraints(1, 1, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_HORIZONTAL, GridConstraints.SIZEPOLICY_CAN_SHRINK | GridConstraints.SIZEPOLICY_CAN_GROW, GridConstraints.SIZEPOLICY_FIXED, null, null, null, 0, false));
        helpText = new JTextArea();
        helpText.setDragEnabled(false);
        helpText.setEditable(false);
        helpText.setEnabled(true);
        helpText.setText("Hello Player! Welcome to our game. Here, you are going to understand how to play the game and the basic concepts for you to understand what is really going on.\n\n-Use arrow keys to walk inside the buildings\n-Press left click on objects to concur the key you need\n-You need to be near the object to successfully pick up the key\n-There are 3 types of Aliens in our game; Shooter Alien, Blind Alien and Time-Wasting Alien; encountering with these objects may cause either losing your life or lose the precious time you need.\n-You have 5 types of model.game.Powerups which are Extra time power-up, Hint, Protection Vest, Plastic Bottle and Extra Life. You can store these powerups in your bag for later use in the game. Each of these contents will give you the chance to fight against the Aliens\n-Game will be over if you lose all your lives or, hopefully, you find all the keys for all the buildings\nHave Fun!!!\n");
        helpText.setWrapStyleWord(true);
        helpScreen.add(helpText, new GridConstraints(0, 0, 1, 1, GridConstraints.ANCHOR_CENTER, GridConstraints.FILL_BOTH, GridConstraints.SIZEPOLICY_FIXED, GridConstraints.SIZEPOLICY_WANT_GROW, null, new Dimension(150, 50), null, 0, false));
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return helpScreen;
    }

}


