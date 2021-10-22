import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

    public class MyFrame extends JFrame implements ActionListener {
        //fields outside constructor so that they may be in use outside it. ie in ActionListener()
        private JButton sbmtButton;
        private JButton clrButton;
        private JButton extButton;
        private JTextField textfield1;
        private JTextField textfield2;
        private JLabel label1;
        private JLabel label2;
        private String input;
        private Double calculate;
        private JPanel panel1;
        private JPanel panel2;
        private JPanel panel3;
        private JPanel panel4;
        private JPanel panel5;


        MyFrame() {
            //frame to close
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            //frame layout
            this.setLayout(new FlowLayout());


            //set textfields, set dimensions and whether they're editable
            textfield1 = new JTextField();
            textfield1.setPreferredSize(new Dimension(120,20));
            textfield1.setEditable(true);

            textfield2 = new JTextField();
            textfield2.setPreferredSize(new Dimension(120,20));
            textfield2.setEditable(false);

            //set labels and names
            label1 = new JLabel("Label 1");
            label2 = new JLabel("Label 2");

            //create buttons and attach actionlistener to 'listen' for click. ActionListener method below to say what to do when clicked
            sbmtButton = new JButton("Submit");
            sbmtButton.addActionListener(this);

            clrButton = new JButton("Clear");
            clrButton.addActionListener(this);

            extButton = new JButton("Exit");
            extButton.addActionListener(this);

            //attach labels/textfields/buttons to panels with layouts. Gridlayout is good because its specific for buttons to give spacing around it
            panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
            panel1.setLayout(new GridLayout(2,1,15,15)); //(rows, columns,horizontal spacing, vertical spacing)
            panel1.setBackground(Color.YELLOW);
            panel1.add(label1);
            panel1.add(label2);

            panel2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            panel2.setLayout(new GridLayout(2,1,15,15)); //(rows, columns,horizontal spacing, vertical spacing)
            panel2.setBackground(Color.YELLOW);
            panel2.add(textfield1);
            panel2.add(textfield2);

            panel3 = new JPanel(new FlowLayout(FlowLayout.LEFT));
            panel3.setLayout(new GridLayout(1,3,5,5)); //(rows, columns,horizontal spacing, vertical spacing)
            panel3.setBackground(Color.YELLOW);
            panel3.add(sbmtButton);
            panel3.add(clrButton);
            panel3.add(extButton);

            //tidy up layout by attaching other panels to another panel so that you can attach them to the frame more neatly
            panel4 = new JPanel((new FlowLayout(FlowLayout.CENTER)));
            panel4.setBackground(Color.YELLOW);
            panel4.add(panel1);
            panel4.add(panel2);

            panel5 = new JPanel(new FlowLayout(FlowLayout.CENTER));
            panel5.setBackground(Color.YELLOW);
            panel5.add(panel3);

            //attach to frame, set frame layout Border was handy for this. set visibility
            this.setLayout(new BorderLayout());
            this.add(panel4, BorderLayout.CENTER);
            this.add(panel5, BorderLayout.SOUTH);
            this.pack();
            this.setVisible(true);
        }

        //set what happens when the button is clicked
@Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource()==sbmtButton){
                //calculation
            }else if(e.getSource()==clrButton){
                textfield1.setText(" ");
                textfield2.setText(" ");
            }else if(e.getSource()==extButton){
                System.exit(0);
            }else{
                JOptionPane.showMessageDialog(null, "Error: Unknown Action Performed.");
            }
        }

        }


