import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

class Sales {
    public static void main(String[] args) {
        // Create an array to store sales data for each month
        double[][] salesData = new double[12][3];

        // Prompt the user to enter sales data for each month
        for (int month = 0; month < 12; month++) {
            String GrossIncome = JOptionPane.showInputDialog(null, "Enter Gross Income for month " + (month + 1) + ":");
            String totalexpenses = JOptionPane.showInputDialog(null, "Enter Total Expenses for month " + (month + 1) + ":");
            
            double grossIncome = Double.parseDouble(GrossIncome);
            double TotalExpenses = Double.parseDouble(totalexpenses);
            double netIncome = grossIncome - TotalExpenses;

            salesData[month][0] = grossIncome;
            salesData[month][1] = TotalExpenses;
            salesData[month][2] = netIncome;
        }

        // Save sales data to file
        try {
            FileWriter writer = new FileWriter("Sales.txt");
            writer.write("Month\tGross Income\tTotal Expenses\tNet Income\n");

            for (int month = 0; month < 12; month++) {
                writer.write((month + 1) + "\t" + salesData[month][0] + "\t" + salesData[month][1] + "\t" + salesData[month][2] + "\n");
            }

            writer.close();
            JOptionPane.showMessageDialog(null, "Sales data saved to file.");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error saving file.");
        }
    }
}


//CSA121 - DANIEL JOHN HENRICK D. SANCHEZ
