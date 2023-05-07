package assignments.assignment4.gui.member;

import assignments.assignment3.user.Member;
import assignments.assignment3.user.menu.SystemCLI;
import assignments.assignment4.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public abstract class AbstractMemberGUI extends JPanel implements Loginable{
    private JLabel welcomeLabel;
    private JLabel loggedInAsLabel;
    protected Member loggedInMember;
    private final SystemCLI systemCLI;

    public AbstractMemberGUI(SystemCLI systemCLI) {
        super(new BorderLayout());
        this.systemCLI = systemCLI;
        // Set up welcome label
        welcomeLabel = new JLabel("", SwingConstants.CENTER);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(welcomeLabel, BorderLayout.NORTH);

        // Set up footer
        loggedInAsLabel = new JLabel("", SwingConstants.CENTER);
        add(loggedInAsLabel, BorderLayout.SOUTH);

        // Initialize buttons
        JPanel buttonsPanel = initializeButtons();
        add(buttonsPanel, BorderLayout.CENTER);
    }

    /**
     * Membuat panel button yang akan ditampilkan pada Panel ini.
     * Buttons dan ActionListeners akan disupply oleh method createButtons() & createActionListeners() respectively.
     * <p> Feel free to make any changes. Be creative and have fun!
     *
     * @return JPanel yang di dalamnya berisi Buttons.
     * */
    protected JPanel initializeButtons() {
        JButton[] buttons = createButtons();
        ActionListener[] listeners = createActionListeners();

        if (buttons.length != listeners.length) {
            throw new IllegalStateException("Number of buttons and listeners must be equal.");
        }

        JPanel buttonsPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = GridBagConstraints.RELATIVE;
        gbc.fill = GridBagConstraints.NONE;
        gbc.anchor = GridBagConstraints.CENTER;
        gbc.weightx = 1.0;
        gbc.weighty = 0.5;
        gbc.insets = new Insets(5, 5, 5, 5);

        for (int i = 0; i < buttons.length; i++) {
            JButton button = buttons[i];
            button.addActionListener(listeners[i]);
            buttonsPanel.add(button, gbc);
        }

        JButton logoutButton = new JButton("Logout");
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.getInstance().logout();
            }
        });
        buttonsPanel.add(logoutButton, gbc);
        return buttonsPanel;
    }

    /**
     * Method untuk login pada panel.
     * <p>
     * Method ini akan melakukan pengecekan apakah ID dan passowrd yang telah diberikan dapat login
     * pada panel ini. <p>
     * Jika bisa, member akan login pada panel ini, method akan:<p>
     *  - mengupdate Welcome & LoggedInAs label.<p>
     *  - mengupdate LoggedInMember sesuai dengan instance pemilik ID dan password.
     *
     * @param id -> ID anggota yang akan diautentikasi.
     * @param password -> password anggota untuk mengautentikasi.
     * @return true jika ID dan password sesuai dengan instance member, false jika tidak.
     * */
    public boolean login(String id, String password) {
        // TODO
        return false;
    }

    /**
     * Method untuk logout pada panel ini.
     * Akan mengubah loggedInMemberMenjadi null.
     * */
    public void logout() {
        loggedInMember = null;
    }

    /**
     * Method ini mensupply buttons apa saja yang akan dimuat oleh panel ini.
     * Button yang disediakan method ini BELUM memiliki ActionListener.
     * Harus diimplementasikan sesuai class yang menginherit class ini.
     *
     * @return Array of JButton, berisi button yang sudah stylize namun belum ada ActionListener.
     * */
    protected abstract JButton[] createButtons();

    /**
     * Method ini mensupply ActionListener korespondensi dengan button yang dibuat createButtons().
     * Harus diimplementasikan sesuai class yang menginherit class ini.
     *
     * @return Array of ActionListener.
     * */
    protected abstract ActionListener[] createActionListeners();
}
