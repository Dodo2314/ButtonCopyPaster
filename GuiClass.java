import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import javax.swing.*;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class GuiClass extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	private static JButton b1; //Copy Buttons werden erstellt / definiert
	private static JButton b2;
	private static JButton b3;
	private static JButton b4;
	private static JButton b5;
	private static JButton b6;
	private static JButton b7;
	private static JButton b8;
	
	private JButton s1; //Save Buttons werden erstellt / definiert
	//private JButton options;
	private JButton close;
	private JButton help;
	
	private JLabel madeBy;
	private static JLabel curPro;
	
	private JLabel profile;
	private JTextField profiel;
	private JButton changepro;
	
	private static JTextField f1; //Text felder werden erstellt / definiert
	private static JTextField f2;
	private static JTextField f3;
	private static JTextField f4;
	private static JTextField f5;
	private static JTextField f6;
	private static JTextField f7;
	private static JTextField f8;
	
	private static String t1 = "."; //Texte der Buttons werden erstellt / definiert
	private static String t2 = ".";
	private static String t3 = ".";
	private static String t4 = ".";
	private static String t5 = ".";
	private static String t6 = ".";
	private static String t7 = ".";
	private static String t8 = ".";
	
	private String path = "data";
	private boolean rf = false;
	
	//static JFrame frame = new JFrame ("Help");
	static Help frame = new Help();

	public GuiClass() throws Exception
	{
		if(rf == false)
		{
			System.out.println("First Read File");
			readFile(path);
			rf = true;
		}
		setLayout(null); //Layout null = kein vorgegebenes Layout
		setSize(500, 385); //Größe des Fensters
		setDefaultCloseOperation(EXIT_ON_CLOSE); //Wenn x gedrückt wird programm beenden
		setLocationRelativeTo(null); //Fenster in die Mitte des Bildschirms
		setResizable(false); //Fenster kann nicht vergrößert oder verkleinert werden
		b1 = new JButton(t1); //Copy Buttons werden in die Gui Class eingefügt und Text des Buttons definiert
		b2 = new JButton(t2);
		b3 = new JButton(t3);
		b4 = new JButton(t4);
		b5 = new JButton(t5);
		b6 = new JButton(t6);
		b7 = new JButton(t7);
		b8 = new JButton(t8);
		
		madeBy = new JLabel("Made by Dodo2314");
		curPro = new JLabel("Current Profile name: "+ path);
		
		profile = new JLabel("Name of current Profile");
		profiel = new JTextField("data");
		changepro = new JButton("Change Profile");
		help = new JButton("Help");
		
		s1 = new JButton("Save"); //Save Button werden in die Gui Class eingefügt und Text des Buttons definiert
		//options = new JButton("Options");
		close = new JButton("Exit");
		
		f1 = new JTextField(t1); //Text felder werden in die Gui Class eingefügt und Text des Feldes definiert
		f2 = new JTextField(t2);
		f3 = new JTextField(t3);
		f4 = new JTextField(t4);
		f5 = new JTextField(t5);
		f6 = new JTextField(t6);
		f7 = new JTextField(t7);
		f8 = new JTextField(t8);
		
		s1.addActionListener(this); //Action Listener für Save Buttons hinzufügen
		//options.addActionListener(this);
		close.addActionListener(this);
		
		changepro.addActionListener(this);
		help.addActionListener(this);
		
		b1.addActionListener(this); //Action Listener für Copy Buttons hinzufügen
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		
		curPro.setBounds(10, 320, 250, 30);
		madeBy.setBounds(370, 320, 120, 30);
		
		profile.setBounds(340, 60, 140, 30);
		profiel.setBounds(340, 90, 140, 30);
		changepro.setBounds(340, 130, 140, 30);
		help.setBounds(340, 170, 140, 30);
		
		s1.setBounds(340, 10, 140, 30);
		//options.setBounds(340, 50, 80, 30);
		close.setBounds(340, 290, 140, 30);
		
		f1.setBounds(180, 10, 150, 30); //Text felder auf Gui setzen
		f2.setBounds(180, 50, 150, 30);
		f3.setBounds(180, 90, 150, 30);
		f4.setBounds(180, 130, 150, 30);
		f5.setBounds(180, 170, 150, 30);
		f6.setBounds(180, 210, 150, 30);
		f7.setBounds(180, 250, 150, 30);
		f8.setBounds(180, 290, 150, 30);
		
		b1.setBounds(10, 10, 150, 30); //x y Koords wie Mathe Graph 
		b2.setBounds(10, 50, 150, 30); // Buttons auf gui setzen
		b3.setBounds(10, 90, 150, 30);
		b4.setBounds(10, 130, 150, 30);
		b5.setBounds(10, 170, 150, 30);
		b6.setBounds(10, 210, 150, 30);
		b7.setBounds(10, 250, 150, 30);
		b8.setBounds(10, 290, 150, 30);
		
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		
		add(f1);
		add(f2);
		add(f3);
		add(f4);
		add(f5);
		add(f6);
		add(f7);
		add(f8);
		
		add(curPro);
		add(madeBy);
		
		add(profile);
		add(profiel);
		add(changepro);
		add(help);
		
		add(s1);
		//add(options);
		add(close);
	}
	
	public static void main(String[] args) throws Exception
	{
		GuiClass haupt = new GuiClass();
		haupt.setVisible(true);
		haupt.setTitle("Button Copy Paster");
	}
	
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == b1)
		{
			writeToClipboard(t1);
		}
		else if(e.getSource() == b2)
		{
			writeToClipboard(t2);
		}
		else if(e.getSource() == b3)
		{
			writeToClipboard(t3);
		}
		else if(e.getSource() == b4)
		{
			writeToClipboard(t4);
		}
		else if(e.getSource() == b5)
		{
			writeToClipboard(t5);
		}
		else if(e.getSource() == b6)
		{
			writeToClipboard(t6);
		}
		else if(e.getSource() == b7)
		{
			writeToClipboard(t7);
		}
		else if(e.getSource() == b8)
		{
			writeToClipboard(t8);
		}
		else if(e.getSource() == s1)
		{
			t1 = f1.getText();
			System.out.println("t1 = "+t1+" f1 = "+f1.getText());
			b1.setText(t1);
			t2 = f2.getText();
			b2.setText(t2);
			t3 = f3.getText();
			b3.setText(t3);
			t4 = f4.getText();
			b4.setText(t4);
			t5 = f5.getText();
			b5.setText(t5);
			t6 = f6.getText();
			b6.setText(t6);
			t7 = f7.getText();
			b7.setText(t7);
			t8 = f8.getText();
			b8.setText(t8);
			try {
				System.out.println("Pressed Save");
				saveFile();
			} 
			catch (IOException e1) 
			{
				e1.printStackTrace();
			}
		}
		else if(e.getSource() == close)
		{
			System.exit(EXIT_ON_CLOSE);
		}
		else if(e.getSource() == changepro)
		{		
			try 
			{
				path = profiel.getText();
				changeProfile(path);
			} 
			catch (Exception e1) 
			{
				e1.printStackTrace();
			}
		}
		else if(e.getSource() == help)
		{
	        //frame.getContentPane().add (new Help());
	        //frame.pack();
			frame.setTitle("Help");
	        frame.setVisible(true);
		}
	}
	
	public static void closeHelp()
	{
		frame.setVisible(false);
	}
	
	public static void writeToClipboard(String s)
	{
	  Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
	  Transferable transferable = new StringSelection(s);
	  clipboard.setContents(transferable, null);
	}
	
	public void saveFile() throws IOException
	{
		String workingDir = System.getProperty("user.dir");
		System.out.println(workingDir);
			File data = new File(workingDir + "/" + path + ".txt");
			FileWriter fileW = new FileWriter(data);
			BufferedWriter buffW = new BufferedWriter(fileW);
			buffW.write("//Data from Button Copy Paster");
			buffW.newLine();
			buffW.write(t1);
			buffW.newLine();
			buffW.write(t2);
			buffW.newLine();
			buffW.write(t3);
			buffW.newLine();
			buffW.write(t4);
			buffW.newLine();
			buffW.write(t5);
			buffW.newLine();
			buffW.write(t6);
			buffW.newLine();
			buffW.write(t7);
			buffW.newLine();
			buffW.write(t8);
			buffW.close();	
			try 
			{
				readFile(path);
			} 
			catch (Exception e) 
			{
				e.printStackTrace();
			}
	}
	
	public static void changeProfile(String name) throws Exception 
	{
		String workingDir = System.getProperty("user.dir");
		System.out.println(workingDir);
		File data = new File(workingDir + "/" + name + ".txt");
		if(data.exists())
		{
			System.out.println("File exists Writer");
		}
		else
		{
				data.createNewFile();
				
				FileWriter fileW = new FileWriter(data);
				BufferedWriter buffW = new BufferedWriter(fileW);
				
				for(int i = 0; i<8; i++)
				{
					buffW.newLine();
				}
				buffW.close();
		}
		
		FileReader file = new FileReader(name + ".txt");
		BufferedReader reader = new BufferedReader(file);
		
		String line = reader.readLine();
		line = reader.readLine();
		t1 = line; 
		line = reader.readLine();
		t2 = line; 
		line = reader.readLine();
		t3 = line; 
		line = reader.readLine();
		t4 = line; 
		line = reader.readLine();
		t5 = line; 
		line = reader.readLine();
		t6 = line; 
		line = reader.readLine();
		t7 = line; 
		line = reader.readLine();
		t8 = line; 
		reader.close();
		
		b1.setText(t1);
		b2.setText(t2);
		b3.setText(t3);
		b4.setText(t4);
		b5.setText(t5);
		b6.setText(t6);
		b7.setText(t7);
		b8.setText(t8);
		
		f1.setText(t1);
		f2.setText(t2);
		f3.setText(t3);
		f4.setText(t4);
		f5.setText(t5);
		f6.setText(t6);
		f7.setText(t7);
		f8.setText(t8);
		
		curPro.setText("Current Profile name: "+ name);
	}
	
	public static void readFile(String path) throws Exception 
	{
		String workingDir = System.getProperty("user.dir");
		System.out.println(workingDir);
		File data = new File(workingDir + "/" + path + ".txt");
		if(data.exists())
		{
			System.out.println("File exists Reader");
		}
		else
		{
				data.createNewFile();
		}
		
		FileReader file = new FileReader(path + ".txt");
		BufferedReader reader = new BufferedReader(file);
		
		String line = reader.readLine();
		line = reader.readLine();
		t1 = line; 
		line = reader.readLine();
		t2 = line; 
		line = reader.readLine();
		t3 = line; 
		line = reader.readLine();
		t4 = line; 
		line = reader.readLine();
		t5 = line; 
		line = reader.readLine();
		t6 = line; 
		line = reader.readLine();
		t7 = line; 
		line = reader.readLine();
		t8 = line; 
		reader.close();
	}
}
