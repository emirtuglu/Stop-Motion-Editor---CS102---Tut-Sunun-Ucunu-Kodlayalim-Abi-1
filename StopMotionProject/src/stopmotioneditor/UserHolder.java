package stopmotioneditor;

import javax.swing.*;
import java.util.ArrayList;

/**
 * UserHolder
 * @author Bahadır
 */
public class UserHolder extends JScrollPane {

    JPanel panel;
    ArrayList<JCheckBox> checkBoxes; 
    User user;

    public UserHolder(User user){
        this.user = user;
        checkBoxes = new ArrayList<>();
        initComponents();
    }
    private void initComponents(){


        setSize(300, 400);
        setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        panel = new JPanel();
        panel.setSize(300, 400);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
        createCheckBoxes();
        setViewportView(panel);

    }
    private void createCheckBoxes(){

        for(int i = 0; i < User.users.size(); i++){
            
            checkBoxes.add(new JCheckBox(User.users.get(i).getUserName()));
            if(User.users.get(i).equals(user)){checkBoxes.get(i).setEnabled(false);}
            panel.add(checkBoxes.get(i));
        }
    }

    public JCheckBox getCheckBox(int i){
        return checkBoxes.get(i);
    }
    
}