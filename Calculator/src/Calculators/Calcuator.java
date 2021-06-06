package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class Calcuator
{

	private JFrame frame;
	private JTextField textDisplay;
	double firstnum;
	double secondnum;
	double result;
	String Operations;
	String answer;	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run()
			{
				try
				{
					Calcuator window = new Calcuator();
					window.frame.setVisible(true);
				} catch (Exception e)
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calcuator()
	{
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize()
	{
		frame = new JFrame();
		frame.setBounds(100, 100, 279, 424);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setHorizontalAlignment(SwingConstants.RIGHT);
		textDisplay.setBounds(10, 11, 247, 46);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		
		//------------Row1----- create backbutton,clear ,percentage sign and plus sign---------------------------------
		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backspace = null;
				
				if(textDisplay.getText().length() >0) {
					StringBuilder strB = new StringBuilder(textDisplay.getText());
					strB.deleteCharAt(textDisplay.getText().length()-1);
					backspace = strB.toString();
					textDisplay.setText(backspace);
				}
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.BOLD, 20));
		btnBackSpace.setBounds(10, 68, 60, 60);
		frame.getContentPane().add(btnBackSpace);
		
		
		JButton btnClear = new JButton("C");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textDisplay.setText(null);
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.setBounds(73, 68, 60, 60);
		frame.getContentPane().add(btnClear);
		
		
		JButton btnPercen = new JButton("%");
		btnPercen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum =Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				Operations ="%";
			}
		});
		btnPercen.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPercen.setBounds(135, 68, 60, 60);
		frame.getContentPane().add(btnPercen);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum =Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				Operations ="+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(198, 68, 60, 60);
		frame.getContentPane().add(btnPlus);
		
		//-------------Row2--   create numbers button and operator sign-----------------------------------------

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String EnterNumber = textDisplay.getText() + btn7.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 130, 60, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn8.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(73, 130, 60, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn9.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(135, 130, 60, 60);
		frame.getContentPane().add(btn9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum =Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				Operations ="-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMinus.setBounds(198, 130, 60, 60);
		frame.getContentPane().add(btnMinus);
		
		
		//-------------------Row3----  create number button and operator sign-------------------------------------
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn4.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 192, 60, 60);
		frame.getContentPane().add(btn4);
		
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn5.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(73, 192, 60, 60);
		frame.getContentPane().add(btn5);
		

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn6.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(135, 192, 60, 60);
		frame.getContentPane().add(btn6);
		
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum =Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				Operations ="*";
			}
		});
		btnMult .setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMult .setBounds(198, 192, 60, 60);
		frame.getContentPane().add(btnMult );
		
		//--------------------Row4--------   create number button and operator sign-----------------------------------
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn1.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn1 .setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1 .setBounds(10, 254, 60, 60);
		frame.getContentPane().add(btn1 );
		
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn2.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn2 .setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2 .setBounds(73, 254, 60, 60);
		frame.getContentPane().add(btn2 );
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btn3.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btn3 .setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3 .setBounds(135, 254, 60, 60);
		frame.getContentPane().add(btn3 );
		
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstnum =Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				Operations ="/";
			}
		});
		btnDiv .setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDiv .setBounds(198, 254, 60, 60);
		frame.getContentPane().add(btnDiv );
		
		//-----------------Row5-------  create number button and opearator sign----------------------------------------------
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {String EnterNumber = textDisplay.getText() + btn0.getText();
			textDisplay.setText(EnterNumber);
			}
		});
		btn0 .setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0 .setBounds(10,316, 60, 60);
		frame.getContentPane().add(btn0 );
		
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNumber = textDisplay.getText() + btnDot.getText();
				textDisplay.setText(EnterNumber);
			}
		});
		btnDot .setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot .setBounds(73,316, 60, 60);
		frame.getContentPane().add(btnDot );
		
		JButton btnPM = new JButton("\u00B1");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ops = Double.parseDouble(String.valueOf(textDisplay.getText()));
				ops=ops * (-1);
				textDisplay.setText(String.valueOf(ops));
			}
		});
		btnPM .setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPM .setBounds(135,316, 60, 60);
		frame.getContentPane().add(btnPM );
		
		
		JButton btnEquals = new JButton("=");
		btnEquals.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String answer;// string is  declared 
				secondnum =Double.parseDouble(textDisplay.getText());// second number in textDisplay is assigned to variable secondnum
				if(Operations == "+") {
					result = firstnum + secondnum; // if operator is plus firstnum plus secondnum is stored in result
					answer = String.format("%.2f", result);// the result of firstnum and second num is then converted  to string stored in answer which has two decimal place which converts any calculations to whole number
					textDisplay.setText(answer);//the answer is then assisgned to the textDisplay  
					
				}
				
				else if (Operations == "-") {
					result = firstnum - secondnum;
					answer =String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				
				else if (Operations == "*") {
					result = firstnum * secondnum;
					answer =String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				
				else if (Operations == "/") {
					result = firstnum / secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
					
				}
				
				else if (Operations == "%") {
					result =firstnum % secondnum;
					answer = String.format("%.2f", result);
					textDisplay.setText(answer);
				}
				
			}
		});
		btnEquals  .setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEquals  .setBounds(198,316, 60, 60);
		frame.getContentPane().add(btnEquals );
		
		
	}

}
