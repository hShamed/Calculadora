import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator extends JFrame {
    private JPanel panel1;
    private JTextField inputTextField;
    private JButton clearButton;
    private JButton deleteButton;
    private JButton divitionButton;
    private JButton multiplicationButton;
    private JButton subtractionButton;
    private JButton additionButton;
    private JButton equalsButton;
    private JButton pointButton;
    private JButton zeroButton;
    private JButton oneButton;
    private JButton twoButton;
    private JButton threeButton;
    private JButton fourButton;
    private JButton fiveButton;
    private JButton sixButton;
    private JButton sevenButton;
    private JButton eightButton;
    private JButton nineButton;
    private JButton plusSubsButton;
    private boolean operation = true;
    private int typeOperation = 0;
    private double result = 0;


    public Calculator() {
        // Put the main panel of the interface
        setContentPane(panel1);

        // Put the default window options
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Put a title to the window
        setTitle("Calculadora");

        // Adjust size
        setSize(400, 600);

        // Locks size
        setResizable(false);

        // Put in the middle of the screen
        setLocationRelativeTo(null);

        // Show the window
        setVisible(true);

        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Put '0' if an operation is active, else only add '0' to the string of numbers
                if (operation) {
                    inputTextField.setText("");
                    inputTextField.setText("0");
                    operation = false;
                } else {
                    inputTextField.setText(inputTextField.getText() + "0");
                }
            }
        });

        oneButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Put '1' if an operation is active, else only add '1' to the string of numbers
                if (operation) {
                    inputTextField.setText("");
                    inputTextField.setText("1");
                    operation = false;
                } else {
                    inputTextField.setText(inputTextField.getText() + "1");
                }
            }
        });

        twoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Put '2' if an operation is active, else only add '2' to the string of numbers
                if (operation) {
                    inputTextField.setText("");
                    inputTextField.setText("2");
                    operation = false;
                } else {
                    inputTextField.setText(inputTextField.getText() + "2");
                }
            }
        });

        threeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Put '3' if an operation is active, else only add '3' to the string of numbers
                if (operation) {
                    inputTextField.setText("");
                    inputTextField.setText("3");
                    operation = false;
                } else {
                    inputTextField.setText(inputTextField.getText() + "3");
                }
            }
        });

        fourButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Put '4' if an operation is active, else only add '4' to the string of numbers
                if (operation) {
                    inputTextField.setText("");
                    inputTextField.setText("4");
                    operation = false;
                } else {
                    inputTextField.setText(inputTextField.getText() + "4");
                }
            }
        });

        fiveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Put '5' if an operation is active, else only add '5' to the string of numbers
                if (operation) {
                    inputTextField.setText("");
                    inputTextField.setText("5");
                    operation = false;
                } else {
                    inputTextField.setText(inputTextField.getText() + "5");
                }
            }
        });

        sixButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Put '6' if an operation is active, else only add '6' to the string of numbers
                if (operation) {
                    inputTextField.setText("");
                    inputTextField.setText("6");
                    operation = false;
                } else {
                    inputTextField.setText(inputTextField.getText() + "6");
                }
            }
        });

        sevenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Put '7' if an operation is active, else only add '7' to the string of numbers
                if (operation) {
                    inputTextField.setText("");
                    inputTextField.setText("7");
                    operation = false;
                } else {
                    inputTextField.setText(inputTextField.getText() + "7");
                }
            }
        });

        eightButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Put '8' if an operation is active, else only add '8' to the string of numbers
                if (operation) {
                    inputTextField.setText("");
                    inputTextField.setText("8");
                    operation = false;
                } else {
                    inputTextField.setText(inputTextField.getText() + "8");
                }
            }
        });

        nineButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Put '9' if an operation is active, else only add '9' to the string of numbers
                if (operation) {
                    inputTextField.setText("");
                    inputTextField.setText("9");
                    operation = false;
                } else {
                    inputTextField.setText(inputTextField.getText() + "9");
                }
            }
        });

        pointButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Put or add '.' if there is no other
                // Put '0.' if an operation is active, else only add '.' to the string of numbers
                if (inputTextField.getText().indexOf('.') == -1) {
                    if (operation) {
                        inputTextField.setText("");
                        inputTextField.setText("0.");
                        operation = false;
                    } else {
                        inputTextField.setText(inputTextField.getText() + ".");
                    }
                }
            }
        });

        divitionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Operation needs to be false
                // If a type of operation is running, execute this, else add the input to the result
                // Mark that the next operation is 'division'
                if (operation == false) {
                    if (typeOperation != 0) {
                        doOperation(typeOperation);
                    } else {
                        result += Double.parseDouble(inputTextField.getText());
                    }

                    operation = true;
                }

                typeOperation = 1;
            }
        });

        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Operation needs to be false
                // If a type of operation is running, execute this, else add the input to the result
                // Mark that the next operation is 'multiplication'
                if (operation == false) {
                    if (typeOperation != 0) {
                        doOperation(typeOperation);
                    } else {
                        result += Double.parseDouble(inputTextField.getText());
                    }

                    operation = true;
                }

                typeOperation = 2;
            }
        });

        subtractionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Operation needs to be false
                // If a type of operation is running, execute this, else add the input to the result
                // Mark that the next operation is 'subtraction'
                if (operation == false) {
                    if (typeOperation != 0) {
                        doOperation(typeOperation);
                    } else {
                        result += Double.parseDouble(inputTextField.getText());
                    }

                    operation = true;
                }

                typeOperation = 3;
            }
        });

        additionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Operation needs to be false
                // If a type of operation is running, execute this, else add the input to the result
                // Mark that the next operation is 'addition'
                if (operation == false) {
                    if (typeOperation != 0) {
                        doOperation(typeOperation);
                    } else {
                        result += Double.parseDouble(inputTextField.getText());
                    }

                    operation = true;
                }

                typeOperation = 4;
            }
        });

        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // If a type of operation is running and active, execute the operation
                if (typeOperation != 0 && operation == false) {

                    doOperation(typeOperation);

                    result = 0;
                    typeOperation = 0;
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Resets variables to default
                inputTextField.setText("0");
                result = 0;
                operation = true;
                typeOperation = 0;
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // Remove the last character of the input if it's not empty
                String input =  inputTextField.getText();

                if (input.isEmpty() || input.equals("0")) {
                    input = "0";
                } else {
                    input = input.substring(0, input.length() - 1);
                }

                inputTextField.setText(input);

                operation = true;
            }
        });

        plusSubsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                // If the input is not equal to zero, multiplies by -1 for change to positive or negative
                double input = Double.parseDouble(inputTextField.getText());

                if (input > 0 || input < 0) {
                    input *= -1;

                    inputTextField.setText(String.valueOf(input));
                }
            }
        });
    }

    public void doOperation(int typeOperation){
        // From the type, do an operation and show the result
        switch (typeOperation) {
            case 1:
                result /= Double.parseDouble(inputTextField.getText());
                break;

            case 2:
                result *= Double.parseDouble(inputTextField.getText());
                break;

            case 3:
                result -= Double.parseDouble(inputTextField.getText());
                break;

            case 4:
                result += Double.parseDouble(inputTextField.getText());
                break;

            default:
        }

        inputTextField.setText(String.valueOf(result));

    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();


    }
}
