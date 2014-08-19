package admin.batyaapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Math.*;

/**
 * Created by admin on 04/07/2014.
 */
public class MainActivity extends Activity implements View.OnClickListener {

    TextView output;
    Button button0, button1, button2, button3,
            button4, button5, button6, button7,
            button8, button9, buttonDot, buttonEqual,
            buttonMinus, buttonPlus, buttonMultiply, buttonDevide,
            buttonRoot, buttonPower, buttonLn, buttonClear;
    String firstOperand = "";
    int operation = 0;
    final int plus = 1, minus = 2, multiply = 3, devide = 4, power = 5;

    @Override
    public void onCreate(Bundle saveInstanceState) {
        super.onCreate(saveInstanceState);
        setContentView(R.layout.main);
        output = (TextView) findViewById(R.id.textView);

        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonDot = (Button) findViewById(R.id.buttonDot);
        buttonEqual = (Button) findViewById(R.id.buttonEqual);
        buttonMinus = (Button) findViewById(R.id.buttonMinus);
        buttonPlus = (Button) findViewById(R.id.buttonPlus);
        buttonMultiply = (Button) findViewById(R.id.buttonMultiply);
        buttonDevide = (Button) findViewById(R.id.buttonDevide);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonRoot = (Button) findViewById(R.id.buttonRoot);
        buttonPower = (Button) findViewById(R.id.buttonPower);
        buttonLn = (Button) findViewById(R.id.buttonLn);

        button0.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        buttonDot.setOnClickListener(this);
        buttonEqual.setOnClickListener(this);
        buttonMinus.setOnClickListener(this);
        buttonPlus.setOnClickListener(this);
        buttonMultiply.setOnClickListener(this);
        buttonDevide.setOnClickListener(this);
        buttonClear.setOnClickListener(this);
        buttonRoot.setOnClickListener(this);
        buttonPower.setOnClickListener(this);
        buttonLn.setOnClickListener(this);

    }

    protected void onRestoreInstanceState(Bundle saveInstanceState) {
        super.onRestoreInstanceState(saveInstanceState);
        output.setText(saveInstanceState.getCharSequence("output"));
    }

    protected void onSaveInstanceState(Bundle saveInstanceState) {
        super.onSaveInstanceState(saveInstanceState);
        saveInstanceState.putCharSequence("output",output.getText().toString());
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()) {
            case R.id.button0:
                if(!output.getText().toString().equals("0")) {
                    output.setText(output.getText().toString() + "0");
                }
                break;
            case R.id.button1:
                if(output.getText().toString().equals("0")) {
                    output.setText("1");
                } else {
                    output.setText(output.getText().toString() + "1");
                }
                break;
            case R.id.button2:
                if(output.getText().toString().equals("0")) {
                    output.setText("2");
                } else {
                    output.setText(output.getText().toString() + "2");
                }
                break;
            case R.id.button3:
                if(output.getText().toString().equals("0")) {
                    output.setText("3");
                } else {
                    output.setText(output.getText().toString() + "3");
                }
                break;
            case R.id.button4:
                if(output.getText().toString().equals("0")) {
                    output.setText("4");
                } else {
                    output.setText(output.getText().toString() + "4");
                }
                break;
            case R.id.button5:
                if(output.getText().toString().equals("0")) {
                    output.setText("5");
                } else {
                    output.setText(output.getText().toString() + "5");
                }
                break;
            case R.id.button6:
                if(output.getText().toString().equals("0")) {
                    output.setText("6");
                } else {
                    output.setText(output.getText().toString() + "6");
                }
                break;
            case R.id.button7:
                if(output.getText().toString().equals("0")) {
                    output.setText("7");
                } else {
                    output.setText(output.getText().toString() + "7");
                }
                break;
            case R.id.button8:
                if(output.getText().toString().equals("0")) {
                    output.setText("8");
                } else {
                    output.setText(output.getText().toString() + "8");
                }
                break;
            case R.id.button9:
                if(output.getText().toString().equals("0")) {
                    output.setText("9");
                } else {
                    output.setText(output.getText().toString() + "9");
                }
                break;
            case R.id.buttonDot:
                if (output.getText().toString().equals("")) {
                    output.setText("0.");
                }
                else if(!output.getText().toString().contains(".")) {
                    output.setText(output.getText().toString() + ".");
                }
                break;
            case R.id.buttonEqual:
                Equal();
                break;
            case R.id.buttonMinus:
                if (!output.getText().toString().equals("")) {
                    if (operation>0) {
                        Equal();
                    }
                    operation = minus;
                    firstOperand = output.getText().toString();
                    output.setText("");
                }
                break;
            case R.id.buttonPlus:
                if (!output.getText().toString().equals("")) {
                    if (operation>0) {
                        Equal();
                    } else {
                        operation = plus;
                        firstOperand = output.getText().toString();
                        output.setText("");
                    }
                }
                break;
            case R.id.buttonMultiply:
                if (!output.getText().toString().equals("")) {
                    if (operation>0) {
                        Equal();
                    }
                    operation = multiply;
                    firstOperand = output.getText().toString();
                    output.setText("");
                }
                break;
            case R.id.buttonDevide:
                if (!output.getText().toString().equals("")) {
                    if (operation>0) {
                        Equal();
                    }
                    operation = devide;
                    firstOperand = output.getText().toString();
                    output.setText("");
                }
                break;
            case R.id.buttonClear:
                output.setText("");
                firstOperand = "";
                operation = 0;
                break;
            case R.id.buttonRoot:
                if (!output.getText().toString().equals("")) {
                    if (Double.parseDouble(output.getText().toString()) >= 0) {
                        setText(Double.toString(sqrt(Double.parseDouble(output.getText().toString()))));
                    } else {
                        Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
                    }
                }
                break;
            case R.id.buttonPower:
                if (!output.getText().toString().equals("")) {
                    if (Double.parseDouble(output.getText().toString()) >= 0) {
                        firstOperand = output.getText().toString();
                        operation = power;
                        output.setText("");
                    } else {
                        Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
                    }
                }
                break;
            case R.id.buttonLn:
                if (!output.getText().toString().equals("")) {
                    if (Double.parseDouble(output.getText().toString()) > 0) {
                        setText(Double.toString(log(Double.parseDouble(output.getText().toString()))));
                    } else {
                        Toast.makeText(this, "Error", Toast.LENGTH_LONG).show();
                    }
                }
                break;

        }

        }

    private void Equal() {
        if ((!output.getText().toString().equals("")) && (!firstOperand.equals(""))) {
            double operand1 = Double.parseDouble(firstOperand);
            double operand2 = Double.parseDouble(output.getText().toString());
            double ans = 0.0;
            switch (operation) {
                case plus:
                    ans = operand1 + operand2;
                    break;
                case minus:
                    ans = operand1 - operand2;
                    break;
                case multiply:
                    ans = operand1 * operand2;
                    break;
                case devide:
                    ans = operand1 / operand2;
                    break;
                case power:
                    ans = pow(operand1, operand2);
                    break;
                default:
                    break;
            }
            operation = 0;
            setText(Double.toString(ans));
            firstOperand = "";
        }
    }

    private void setText(String str) {
        if (str.substring(str.length()-2, str.length()).equals(".0")) {
            output.setText(str.substring(0, str.length()-2));
        } else {
            output.setText(str);
        }
    }
}