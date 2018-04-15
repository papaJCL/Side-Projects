import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class frame1 {

	private JFrame frame;
	static private JTextField textField;
	static private JTextField textField_1;
	static private JTextField textField_2;
	static private JTextField textField_3;
	static private JTextField textField_4;
	static private JTextField textField_5;
	static private JTextField textField_6;
	static private JTextField textField_7;
	private JLabel lblGpa;
	private JLabel TOTALGPA;
	static private JTextField textField_8;
	static private JTextField textField_9;
	static private JTextField textField_10;
	static private JTextField textField_11;
	static private JTextField textField_12;
	static private JTextField textField_13;
	static private JTextField textField_14;
	static private JTextField textField_15;
	private JLabel lblAndHowMany;
	private JButton btnCalculate;

	/**
	 * Launch the application.
	 */
	
	
	
//	public static int calculateGPA() {
//		int returnInt = 0;
//		returnInt += mainInt(textField.getText(), Integer.parseInt(textField_8.getText()));
//		returnInt += mainInt(textField_1.getText(), Integer.parseInt(textField_9.getText()));
//		returnInt += mainInt(textField_2.getText(), Integer.parseInt(textField_10.getText()));
//		returnInt += mainInt(textField_3.getText(), Integer.parseInt(textField_11.getText()));
//		returnInt += mainInt(textField_4.getText(), Integer.parseInt(textField_12.getText()));
//		returnInt += mainInt(textField_5.getText(), Integer.parseInt(textField_13.getText()));
//		returnInt += mainInt(textField_6.getText(), Integer.parseInt(textField_14.getText()));
//		returnInt += mainInt(textField_7.getText(), Integer.parseInt(textField_15.getText()));
//		return 20;
//	}
//	
	
	
	public static double mainInt(String s, String credits1) {
		if (s.length() < 1) {
			return 100;
		}
		char c = s.charAt(0);
		double credits = Double.parseDouble(credits1);
		if(c == 'A') {
			return (credits * 4)/credits;
		}
		if(c == 'B') {
			return (credits * 3)/credits;
		}
		 if(c == 'C') {
			 return (credits * 2)/credits;
		}
		 if(c == 'D') {
			 return (credits * 1)/credits;
		}
		 if(c == 'F') {
			 return (credits * 0);
		}
		else {
			return 100;	//100 will say that it should not be countd towards the counter variable in the button method.
		}
	}
	
	
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame1 window = new frame1();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
		
	}

	/**
	 * Create the application.
	 */
	public frame1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 284, 471);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("GPA Calculator");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(0, 0, 268, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblForEach = new JLabel("For each textbox, put in your letter grade(A-F)\r\n\r\n");
		lblForEach.setHorizontalAlignment(SwingConstants.CENTER);
		lblForEach.setBounds(0, 27, 268, 37);
		frame.getContentPane().add(lblForEach);
		
		JLabel lblLeaveTheRest = new JLabel("Leave the rest blank");
		lblLeaveTheRest.setHorizontalAlignment(SwingConstants.CENTER);
		lblLeaveTheRest.setBounds(0, 91, 241, 37);
		frame.getContentPane().add(lblLeaveTheRest);
		
		textField = new JTextField();
		textField.setBounds(32, 165, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(32, 183, 86, 20);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(32, 201, 86, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(32, 219, 86, 20);
		frame.getContentPane().add(textField_3);
		
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(32, 237, 86, 20);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(32, 255, 86, 20);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(32, 273, 86, 20);
		frame.getContentPane().add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(32, 291, 86, 20);
		frame.getContentPane().add(textField_7);
		
		JLabel lblGradeaf = new JLabel("Grade(A-F)");
		lblGradeaf.setHorizontalAlignment(SwingConstants.CENTER);
		lblGradeaf.setBounds(32, 139, 86, 14);
		frame.getContentPane().add(lblGradeaf);
		
		JLabel lblCredits = new JLabel("Credits");
		lblCredits.setHorizontalAlignment(SwingConstants.CENTER);
		lblCredits.setBounds(155, 139, 86, 14);
		frame.getContentPane().add(lblCredits);
		
		lblGpa = new JLabel("GPA:");
		lblGpa.setBounds(32, 379, 46, 14);
		frame.getContentPane().add(lblGpa);
		
		TOTALGPA = new JLabel("");
		TOTALGPA.setBounds(98, 379, 143, 14);
		frame.getContentPane().add(TOTALGPA);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(155, 165, 86, 20);
		frame.getContentPane().add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(155, 183, 86, 20);
		frame.getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(155, 201, 86, 20);
		frame.getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(155, 219, 86, 20);
		frame.getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(155, 237, 86, 20);
		frame.getContentPane().add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(155, 255, 86, 20);
		frame.getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(155, 273, 86, 20);
		frame.getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(155, 291, 86, 20);
		frame.getContentPane().add(textField_15);
		
		lblAndHowMany = new JLabel("and how many credits its worth. ");
		lblAndHowMany.setHorizontalAlignment(SwingConstants.CENTER);
		lblAndHowMany.setBounds(0, 66, 268, 14);
		frame.getContentPane().add(lblAndHowMany);
		
		btnCalculate = new JButton("Calculate");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double counter = 0.0;
				double totalCounter = 0.0;
				if((mainInt(textField.getText(),textField_8.getText()) != 100)) {
					totalCounter += mainInt(textField.getText(), textField_8.getText());
					System.out.println("\t THE VALUE IS " + totalCounter);
					counter++;
				}
				if((mainInt(textField_1.getText(),textField_9.getText()) != 100)) {
					totalCounter += mainInt(textField_1.getText(), textField_9.getText());
					System.out.println("\t THE VALUE IS " + totalCounter);
					counter++;
				}
				if((mainInt(textField_2.getText(),textField_10.getText()) != 100)) {
					totalCounter += mainInt(textField_2.getText(), textField_10.getText());
					System.out.println("\t THE VALUE IS " + totalCounter);
					counter++;
				}
				if((mainInt(textField_3.getText(),textField_11.getText()) != 100)) {
					totalCounter += mainInt(textField_3.getText(), textField_11.getText());
					System.out.println("\t THE VALUE IS " + totalCounter);
					counter++;
				}
				if((mainInt(textField_4.getText(),textField_12.getText()) != 100)) {
					totalCounter += mainInt(textField_4.getText(), textField_12.getText());
					System.out.println("\t THE VALUE IS " + totalCounter);
					counter++;
				}
				if((mainInt(textField_5.getText(),textField_13.getText()) != 100)) {
					totalCounter += mainInt(textField_5.getText(), textField_13.getText());
					System.out.println("\t THE VALUE IS " + totalCounter);
					counter++;
				}
				if((mainInt(textField_6.getText(),textField_14.getText()) != 100)) {
					totalCounter += mainInt(textField_6.getText(), textField_14.getText());
					System.out.println("\t THE VALUE IS " + totalCounter);
					counter++;
				}
				if((mainInt(textField_7.getText(),textField_15.getText()) != 100)) {
					totalCounter += mainInt(textField_7.getText(), textField_15.getText());
					System.out.println("\t THE VALUE IS " + totalCounter);
					counter++;
				}
				System.out.println("TOTAL IS " + totalCounter);
				System.out.println("COUNTER IS " + counter);
				double totalGPA = ((totalCounter / counter));
				System.out.println(totalGPA);
				TOTALGPA.setText(Double.toString(totalGPA));
			}
		});
		btnCalculate.setBounds(88, 345, 89, 23);
		frame.getContentPane().add(btnCalculate);
	}
}
