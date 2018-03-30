import java.awt.EventQueue; 
 
import javax.swing.JFrame; 
import javax.swing.JTextField; 
import javax.swing.JToggleButton; 
import javax.swing.JButton; 
import java.awt.event.ActionListener; 
import java.math.BigInteger; 
import java.awt.event.ActionEvent; 
import javax.swing.JLabel; 
import javax.swing.JOptionPane; 
import javax.swing.SwingConstants; 
import java.awt.Color; 
import java.awt.Dimension; 
import java.awt.SystemColor; 
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.UIManager; 
 
public class frame1 { 
 
    private JFrame frame; 
    private JTextField mainTextField; 
    private JLabel lblAnswer; 
    private JLabel textField_2; 
    private JButton btnConvertToBinary; 
    private JButton btnConvertToOctal; 
    private JButton btnConvertToDecimal; 
    private JTextField textField; 
    private JLabel lblIsThisAn; 
    private JToggleButton btnInteger; 
    private JToggleButton btnHexadecimal; 
    private JToggleButton btnBinary; 
    private JToggleButton btnOctal; 
    private JButton btnClear; 
 
    /** 
     * Launch the application. 
     */ 
     
     
    boolean isHex(String hex) { 
        try { 
            Long.parseLong(hex, 16); 
            return true; 
          } 
          catch (NumberFormatException ex) { 
            return false; 
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
        frame.getContentPane().setForeground(Color.WHITE); 
        frame.getContentPane().setBackground(UIManager.getColor("CheckBox.light")); 
        frame.setBounds(100, 100, 491, 507); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.getContentPane().setLayout(null); 
         
        mainTextField = new JTextField(); 
        mainTextField.setBounds(10, 28, 455, 46); 
        frame.getContentPane().add(mainTextField); 
        mainTextField.setColumns(10); 
         
        lblAnswer = new JLabel("ANSWER"); 
        lblAnswer.setHorizontalAlignment(SwingConstants.CENTER); 
        lblAnswer.setBounds(152, 344, 160, 23); 
        frame.getContentPane().add(lblAnswer); 
         
        btnConvertToBinary = new JButton("Convert to Binary"); 
        btnConvertToBinary.setBackground(SystemColor.inactiveCaptionBorder);
        btnConvertToBinary.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
        btnConvertToBinary.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(btnInteger.isSelected()){ 
        			textField.setText(Long.toBinaryString(Long.parseLong(mainTextField.getText())));
                    btnInteger.setSelected(false); 
                } 
                if(btnBinary.isSelected()){ 
                	 JOptionPane.showMessageDialog(null, "This is already in binary format!"); 
                     btnBinary.setSelected(false); 
                } 
                if(btnHexadecimal.isSelected()){ 
                    String s = new BigInteger(mainTextField.getText(), 16).toString(2);
                	textField.setText(s);
                    btnHexadecimal.setSelected(false); 
                } 
                if(btnOctal.isSelected()){ 
                	long octal = Long.parseLong(mainTextField.getText(), 8);
                	String octalString = Long.toBinaryString(octal);
                    textField.setText(octalString); 
                    btnOctal.setSelected(false); 
                } 
        	}
        });
        
        JButton btnAdd = new JButton("Convert to Hex");
        btnAdd.setIcon(null);
        btnAdd.setSelectedIcon(null);
        btnAdd.setBackground(SystemColor.inactiveCaptionBorder);
        btnAdd.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
        btnAdd.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                if(btnInteger.isSelected()){ 
                    textField.setText(String.format("%016x", Long.valueOf(mainTextField.getText()))); 
                    btnInteger.setSelected(false); 
                } 
                if(btnBinary.isSelected()){ 
                    int decimal = Integer.parseInt(mainTextField.getText(),2); 
                    String hexStr = Integer.toString(decimal,16); 
                    textField.setText(hexStr); 
                    btnBinary.setSelected(false); 
                } 
                if(btnHexadecimal.isSelected()){ 
                    JOptionPane.showMessageDialog(null, "This is already in hexadecimal format!"); 
                    btnHexadecimal.setSelected(false); 
                } 
                if(btnOctal.isSelected()){ 
                    String octalString = Integer.toHexString(Integer.parseInt(mainTextField.getText(), 8)); 
                    textField.setText(octalString); 
                    btnOctal.setSelected(false); 
                } 
            } 
             
        }); 
        btnAdd.setBounds(236, 238, 229, 79); 
        frame.getContentPane().add(btnAdd); 
        btnConvertToBinary.setBounds(236, 159, 229, 79); 
        frame.getContentPane().add(btnConvertToBinary); 
         
        btnConvertToOctal = new JButton("Convert to Octal"); 
        btnConvertToOctal.setBackground(SystemColor.inactiveCaptionBorder);
        btnConvertToOctal.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
        btnConvertToOctal.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		if(btnInteger.isSelected()){ 
        			long octVal = Long.parseLong(mainTextField.getText(), 8);
                    textField.setText(Long.toString(octVal)); 
                    btnInteger.setSelected(false); 
                } 
                if(btnBinary.isSelected()){ 
                	long l = Long.parseLong(mainTextField.getText(), 2);
                	 textField.setText(Long.toOctalString(l)); 
                     btnBinary.setSelected(false); 
                } 
                if(btnHexadecimal.isSelected()){ 
                	long octVal = Long.parseLong(mainTextField.getText(), 16);
                    textField.setText(Long.toString(octVal)); 
                    btnHexadecimal.setSelected(false); 
                } 
                if(btnOctal.isSelected()){ 
                	JOptionPane.showMessageDialog(null, "This is already in octal format!"); 
                    btnOctal.setSelected(false); 
                } 
        	}
        });
        btnConvertToOctal.setBounds(10, 238, 223, 79); 
        frame.getContentPane().add(btnConvertToOctal); 
         
        btnConvertToDecimal = new JButton("Convert to Decimal"); 
        btnConvertToDecimal.setBackground(SystemColor.inactiveCaptionBorder);
        btnConvertToDecimal.setFont(new Font("Segoe UI Symbol", Font.BOLD, 18));
        btnConvertToDecimal.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent arg0) {
        		if(btnInteger.isSelected()){ 
        			JOptionPane.showMessageDialog(null, "This is already in decimal format!"); 
                    btnInteger.setSelected(false); 
                } 
                if(btnBinary.isSelected()){ 
                	 long decimalValue = Long.parseLong(mainTextField.getText(), 2); 
                	 textField.setText(Long.toString(decimalValue));
                     btnBinary.setSelected(false); 
                } 
                if(btnHexadecimal.isSelected()){ 
                    long hexVal = Long.parseLong(mainTextField.getText(), 16);
                	textField.setText(Long.toString(hexVal));
                    btnHexadecimal.setSelected(false); 
                } 
                if(btnOctal.isSelected()){ 
                	long octVal = Long.parseLong(mainTextField.getText(), 8);
                	textField.setText(Long.toString(octVal));
                    btnOctal.setSelected(false); 
                } 
        	}
        });
        btnConvertToDecimal.setBounds(10, 159, 223, 79); 
        frame.getContentPane().add(btnConvertToDecimal); 
         
        textField = new JTextField(); 
        textField.setFont(new Font("Times New Roman", Font.BOLD, 14));
        textField.setBounds(10, 378, 455, 20); 
        frame.getContentPane().add(textField); 
        textField.setColumns(10); 
         
        textField_2 = new JLabel(""); 
        textField_2.setHorizontalAlignment(SwingConstants.CENTER); 
        textField_2.setBounds(33, 411, 414, 23); 
        frame.getContentPane().add(textField_2); 
         
        lblIsThisAn = new JLabel("Is this an Integer, Hexadecimal, Binary, or Octal?(click one)"); 
        lblIsThisAn.setFont(new Font("Segoe UI Symbol", Font.BOLD, 14));
        lblIsThisAn.setHorizontalAlignment(SwingConstants.CENTER); 
        lblIsThisAn.setBounds(10, 85, 455, 23); 
        frame.getContentPane().add(lblIsThisAn); 
         
        btnInteger = new JToggleButton("Integer"); 
        btnInteger.setBackground(SystemColor.inactiveCaptionBorder);
        btnInteger.setFont(new Font("Segoe UI Symbol", Font.BOLD, 11));
        btnInteger.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                try { 
                    long firstNum = Long.parseLong(mainTextField.getText()); 
                }catch (Exception alpha) { 
                    btnInteger.setSelected(false); 
                    JOptionPane.showMessageDialog(null, "Not a valid number please try again!"); 
                } 
            } 
        }); 
        btnInteger.setBounds(10, 125, 105, 23); 
        frame.getContentPane().add(btnInteger); 
         
        btnHexadecimal = new JToggleButton("Hexadecimal"); 
        btnHexadecimal.setBackground(SystemColor.inactiveCaptionBorder);
        btnHexadecimal.setFont(new Font("Segoe UI Symbol", Font.BOLD, 11));
        btnHexadecimal.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                if (isHex(mainTextField.getText()) == true) { 
                     
                } 
                else { 
                    btnHexadecimal.setSelected(false); 
                    JOptionPane.showMessageDialog(null, "Not a valid hex please try again!"); 
                } 
            } 
        }); 
        btnHexadecimal.setBounds(116, 125, 123, 23); 
        frame.getContentPane().add(btnHexadecimal); 
         
        btnBinary = new JToggleButton("Binary"); 
        btnBinary.setBackground(SystemColor.inactiveCaptionBorder);
        btnBinary.setFont(new Font("Segoe UI Symbol", Font.BOLD, 11));
        btnBinary.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                if (mainTextField.getText().matches("[01]+")) { 
 
                } 
                else { 
                    btnBinary.setSelected(false); 
                    JOptionPane.showMessageDialog(null, "This is NOT a valid binary"); 
                } 
            } 
        }); 
        btnBinary.setBounds(245, 125, 115, 23); 
        frame.getContentPane().add(btnBinary); 
         
        btnOctal = new JToggleButton("Octal"); 
        btnOctal.setBackground(SystemColor.inactiveCaptionBorder);
        btnOctal.setFont(new Font("Segoe UI Symbol", Font.BOLD, 11));
        btnOctal.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                 try{ 
                     long i=Long.parseLong(mainTextField.getText(),8); // returns the integer represented by the  string argument in the specified radix. 
                      
                   }  catch(NumberFormatException Alpha)  { 
                       btnOctal.setSelected(false); 
                       JOptionPane.showMessageDialog(null, "Not a valid octal please try again"); 
                   } 
            } 
        }); 
        btnOctal.setBounds(360, 125, 105, 23); 
        frame.getContentPane().add(btnOctal); 
         
        btnClear = new JButton("Clear"); 
        btnClear.setBackground(SystemColor.inactiveCaptionBorder);
        btnClear.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent e) { 
                textField.setText(""); 
                mainTextField.setText(""); 
                btnInteger.setSelected(false); 
                btnOctal.setSelected(false); 
                btnBinary.setSelected(false); 
                btnHexadecimal.setSelected(false); 
            } 
        }); 
        btnClear.setBounds(190, 423, 89, 23); 
        frame.getContentPane().add(btnClear);
    } 
 
}
