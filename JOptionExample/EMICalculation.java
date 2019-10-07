package JOptionExample;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class EMICalculation {

	final static DecimalFormat df = new DecimalFormat("Rs0.00");

	
	
	public static void main(String[] args) {
		
		
		JOptionPane.showMessageDialog(null, "Welcome to EMI CALCULATOR  \nPress OK to Continue");
	
		String one = JOptionPane.showInputDialog(null, "Enter Mortgage Amount");
		double mrtpymt = Double.parseDouble(one);
	
		String two = JOptionPane.showInputDialog(null, "Enter Interest Rate(examle 5.75 for 5.75%)");
	
		String three = JOptionPane.showInputDialog(null, "Enter Term Limit(in years)");
		double IntRate = Double.parseDouble(two);
		double TrmLimit = Double.parseDouble(three);
		
		double MonthlyMortgagePayment =(mrtpymt *IntRate * TrmLimit) /100;
		JOptionPane.showMessageDialog(null, "EMI = " + df.format(MonthlyMortgagePayment));
		JOptionPane.showConfirmDialog(null,"Would you like to continue?");

	}

}
