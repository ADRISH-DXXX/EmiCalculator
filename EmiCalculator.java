    import java.awt.Color;
    import javax.swing.*;
    import java.awt.*;
    import java.awt.event.*;
    import java.text.*;
    class EmiCalculator extends JFrame //Declaring the controls
    {
    JButton Calculate = new JButton();
    JButton Exit = new JButton();
    JLabel netAmt = new JLabel();
    JLabel months = new JLabel();
    JLabel finalValue = new JLabel();
    JTextField netAmtarea = new JTextField();
    JTextField monthsArea = new JTextField();
    JTextField finalArea = new JTextField();
   public static void main(String[]args) //Main method
    {
        new EmiCalculator().show();
    }
    public EmiCalculator() //Giving name and position to button,labels,
    {
        setTitle("EMI CALCULATOR");
        addWindowListener(new WindowAdapter()
        {
   public void windowClosing(WindowEvent e)
   {
       exitForm(e);
    }});
        getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints position  = new GridBagConstraints();
        Calculate.setBackground(Color.yellow);
        Calculate.setText("-->CALCULATE<--");
        position.gridx = 1;
        position.gridy = 3;
        getContentPane().add(Calculate,position);
        Calculate.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                CalculateActionPerformed(e);
            }
            
        
        });
        Exit.setText("-->EXIT<--");
      Exit.setBackground(Color.yellow);
        position.gridx = 0;
        position.gridy = 3;
        getContentPane().add(Exit,position);
        Exit.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                ExitActionPerformed(e);
            }
        });
        netAmt.setText("-->NET AMOUNT<--");
        position.gridx = 0;
        position.gridy = 0;
        getContentPane().add(netAmt,position);
        months.setText("-->MONTHS<--");
        position.gridx = 0;
        position.gridy = 1;
        getContentPane().add(months,position);
        finalValue.setText("-->FINAL<--");
        position.gridx = 0;
        position.gridy = 2;
        getContentPane().add(finalValue,position);
        netAmtarea.setColumns(15);
        position.gridx = 1;
        position.gridy = 0;
        getContentPane().add(netAmtarea,position);
        monthsArea.setColumns(15);
        position.gridx = 1;
        position.gridy = 1;
        getContentPane().add(monthsArea,position);
        finalArea.setColumns(15);
        position.gridx = 1;
        position.gridy = 2;
        getContentPane().add(finalArea,position);
        pack();}
        private void CalculateActionPerformed(ActionEvent e)
        {
            double months;
            double netAmount; 
            double finalBalance;
            netAmount= Double.valueOf(netAmtarea.getText()).doubleValue();
              months= Double.valueOf(monthsArea.getText()).doubleValue();
              finalBalance = netAmount/months;
              finalArea.setText(new DecimalFormat("0.00").format(finalBalance));
        }
        private void ExitActionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
        private void exitForm(WindowEvent e)
        {
            System.exit(0);
        }
        
        
    
    }
