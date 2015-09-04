import javax.swing.*;

public class Help extends JFrame{

    private static final long serialVersionUID = 1L;
    private JLabel q1;	//Jlabel werden erstellt für Text der Help Class
    private JLabel te11;
    private JLabel te12;
    private JLabel te13;
    private JLabel te14;
    private JLabel q2;
    private JLabel te21;
    private JLabel te22;
    private JLabel te23;
    private JLabel q3;
    private JLabel te31;
    private JLabel te32;
    private JLabel te33;

    public Help() {
    	
    	setLocationRelativeTo(null); //Fenster in die Mitte des Bildschirms
    	setResizable(false); //Fenster kann nicht vergrößert oder verkleinert werden
    	
    	
    	//construct components
        q1 = new JLabel ("What is Button Copy Paster?");
        te11 = new JLabel ("ButtonCopy Paster is an Java Application that helps you to reduce");
        te12 = new JLabel ("repetitive writing of the same sentence or code segment. You can ");
        te13 = new JLabel ("create your own sentences which will then if you press the Button");
        te14 = new JLabel ("it will copy the content to your Clipboard.");
        
        q2 = new JLabel ("What does the Save Button?");
        te21 = new JLabel ("The Save Button saves your Data to an txt file. When you changed");
        te22 = new JLabel ("something you have to press Save to apply changes. It also creates");
        te23 = new JLabel ("a new txt file if it doesnt exist in the same directory as the jar.");
        
        q3 = new JLabel ("How does the Change Profile Button work?");
        te31 = new JLabel ("In the text field above the Change Profile Button is the name of the");
        te32 = new JLabel ("Profile when you change it to a new name (Default is data) you are ");
        te33 = new JLabel ("either creating a new Profile or load a Profile thats already existent.");

        //adjust size and set layout
        setSize(415, 325);        
        setLayout (null);

        //add components
        add (q1);
        add (te11);
        add (te12);
        add (te13);
        add (te14);
        
        add (q2);
        add (te21);
        add (te22);
        add (te23);
        
        add (q3);
        add (te31);
        add (te32);
        add (te33);
        

        //set component bounds (only needed by Absolute Positioning)
        q1.setBounds (10, 10, 168, 25);
        te11.setBounds (10, 35, 385, 30);
        te12.setBounds (10, 50, 385, 30);
        te13.setBounds (10, 65, 385, 30);
        te14.setBounds (10, 80, 385, 30);
        q2.setBounds (10, 115, 167, 30);
        te21.setBounds (10, 140, 385, 30);
        te22.setBounds (10, 155, 385, 30);
        te23.setBounds (10, 170, 385, 30);
        q3.setBounds (10, 205, 248, 30);
        te31.setBounds (10, 230, 385, 30);
        te32.setBounds (10, 245, 385, 30);
        te33.setBounds (10, 260, 385, 30);
    }
}

