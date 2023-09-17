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
    private JButton substractionButton;
    private JButton plusButton;
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
        setContentPane(panel1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Calculadora");
        setSize(400, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);

        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
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
                if (operation) {
                    inputTextField.setText("");
                    inputTextField.setText(".");
                    operation = false;
                } else {
                    inputTextField.setText(inputTextField.getText() + ".");
                }
            }
        });

        divitionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if (typeOperation != 0) {
                    doOperation(typeOperation);
                } else {
                    result += Double.parseDouble(inputTextField.getText());
                }

                operation = true;
                typeOperation = 1;
            }
        });

        multiplicationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if (typeOperation != 0) {
                    doOperation(typeOperation);
                } else {
                    result += Double.parseDouble(inputTextField.getText());
                }

                operation = true;
                typeOperation = 2;
            }
        });

        substractionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if (typeOperation != 0) {
                    doOperation(typeOperation);
                } else {
                    result += Double.parseDouble(inputTextField.getText());
                }

                operation = true;
                typeOperation = 3;
            }
        });

        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

                if (typeOperation != 0) {
                    doOperation(typeOperation);
                } else {
                    result += Double.parseDouble(inputTextField.getText());
                }

                operation = true;
                typeOperation = 4;
            }
        });

        equalsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (typeOperation != 0 && operation == false) {

                    doOperation(typeOperation);

                    inputTextField.setText(String.valueOf(result));

                    result = 0;
                    typeOperation = 0;
                    operation = true;
                }
            }
        });

        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                inputTextField.setText("0");
                result = 0;
                operation = true;
                typeOperation = 0;
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
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
                double input = Double.parseDouble(inputTextField.getText());

                if (input > 0 || input < 0) {
                    input *= -1;

                    inputTextField.setText(String.valueOf(input));
                }
            }
        });
    }

    public void doOperation(int typeOperation){

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
