package com.example.administrator.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String M = null;
    int res = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*public void onClickZero(View view)
    {
        Button bt =(Button)findViewById(R.id.zero);
        if(M==null)
            M = (String) bt.getText();
        else
            M+=bt.getText();
        display(M);
    }*/
    public void onClickZero(View view)
    {
        if(M==null)
            M = "0";
        else
            M+="0";
        display(M);
    }
    public void onClick1(View view)
    {
        Button bt =(Button)findViewById(R.id.one);
        if(M==null)
            M = (String) bt.getText();
        else
            M+=bt.getText();
        display(M);
    }
    public void onClick2(View view)
    {
        Button bt =(Button)findViewById(R.id.two);
        if(M==null)
            M = (String) bt.getText();
        else
            M+=bt.getText();
        display(M);
    }
    public void onClick3(View view)
    {
        Button bt =(Button)findViewById(R.id.three);
        if(M==null)
            M = (String) bt.getText();
        else
            M+=bt.getText();
        display(M);
    }
    public void onClick4(View view)
    {
        Button bt =(Button)findViewById(R.id.four);
        if(M==null)
            M = (String) bt.getText();
        else
            M+=bt.getText();
        display(M);
    }
    public void onClick5(View view)
    {
        Button bt =(Button)findViewById(R.id.five);
        if(M==null)
            M = (String) bt.getText();
        else
            M+=bt.getText();
        display(M);
    }
    public void onClick6(View view)
    {
        Button bt =(Button)findViewById(R.id.six);
        if(M==null)
            M = (String) bt.getText();
        else
            M+=bt.getText();
        display(M);
    }
    public void onClick7(View view)
    {
        Button bt =(Button)findViewById(R.id.seven);
        if(M==null)
            M = (String) bt.getText();
        else
            M+=bt.getText();
        display(M);
    }
    public void onClick8(View view)
    {
        Button bt =(Button)findViewById(R.id.eight);
        if(M==null)
            M = (String) bt.getText();
        else
            M+=bt.getText();
        display(M);
    }
    public void onClick9(View view)
    {
        Button bt =(Button)findViewById(R.id.nine);
        if(M==null)
            M = (String) bt.getText();
        else
            M+=bt.getText();
        display(M);
    }
    public void onClickAc(View view)
    {
        M = null;
        display(M);

        display2(M);
    }
    public void onClickDel(View view)
    {
        if(M==null||M.length() - 1<=0)/*M等于空或字符串长度小于0的时候del执行会异常*/ {
            M ="0";
            display(M);
        }
        Button bt =(Button)findViewById(R.id.del);
        M = M.substring(0, M.length() - 1);
        display(M);


    }
    /*
     删除字符串最后一位数
     M = M.substring(0, M.length() - 1);

     Java String类Java String类

     substring() 方法返回字符串的子字符串。

     语法
     public String substring(int beginIndex)

     或

     public String substring(int beginIndex, int endIndex)
      */

    public void onClickPlus(View view)
    {
        if(M==null)
            M = "+";
        else
            M+="+";
        display(M);
    }
    public void onClickMinus(View view)
    {
        if(M==null)
            M = "-";
        else
            M+="-";
        display(M);
    }
    public void onClickMultiply(View view)
    {
        if(M==null)
            M = "*";
        else
            M+="*";
        display(M);
    }
    public void onClickDivide(View view)
    {
        if(M==null)
            M = "/";
        else
            M+="/";
        display(M);
    }
    public void onClickPoint(View view)
    {
        if(M==null)
            M = "0.";
        else
            M+=".";
        display(M);
    }
    public void onClickEqual(View view)
    {
        M = "" + res(M);
        display2(M);
    }
    private void display(String M) {
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(M);
    }
    private void display2(String M) {
        TextView textView = (TextView) findViewById(R.id.textView2);
        textView.setText(M);
    }
    private double res(String M)
    {
        String a,b;
        String operation = null;
        int i;

        for( i = 0;i<M.length();i++)
        {
            if(i==0&&String.valueOf(M.charAt(0)).equals("-")&&String.valueOf(M.charAt(i)).equals("-"))
            {
                i += 1;
            }
            String flag = String.valueOf(M.charAt(i));
            if(flag.equals("*"))
            {
                operation = "*";
                break;
            }
            if(flag.equals("/"))
            {
                operation = "/";
                break;
            }
            if(flag.equals("+"))
            {
                operation = "+";
                break;
            }
            if(flag.equals("-"))
            {
                operation = "-";
                break;
            }
        }
        a = M.substring(0, i);
        if (M.length()==i)
            return Double.valueOf(a);//输入一个数是直接得结果
        b = M.substring(i+1,M.length());
        double value1 = Double.valueOf(a);// 要转换的类型.valueOf(原类型)
        double value2 = Double.valueOf(b);
        switch(operation){
            case "+":
                return (double) (value1+value2);
            case "-":
                return value1-value2;
            case "*":
                return value1*value2;
            case "/":
                return value1/value2;
            default:
                System.out.print("error");
                return 0;
        }
    }
}
