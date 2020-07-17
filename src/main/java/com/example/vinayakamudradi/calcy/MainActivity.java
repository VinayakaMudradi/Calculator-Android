package com.example.vinayakamudradi.calcy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1;
    TextView t1,t2;

    public void modify(View view)
    {
        t1=(TextView)findViewById(R.id.calculation);
        String str=t1.getText().toString();
        if(str.length()==1)
        {
            t1.setText("0");
        }
       else if(!(str.equals("0")))
        t1.setText(str.substring(0,str.length()-1));
    }
    public void compute(View view)
    {
        double temp=0,sum=0,product=0;
        int identify=0,i=0,j;
        t1=(TextView)findViewById(R.id.calculation);
        String str=t1.getText().toString();
        if(str.charAt(str.length()-1)=='+' || str.charAt(str.length()-1)=='-'  ||  str.charAt(str.length()-1)=='*' || str.charAt(str.length()-1)=='/')
        {
            int k=str.length();
            str=str.substring(0,k-1);
        }
        t2=(TextView)findViewById(R.id.result);

        while(i<str.length())
        {
            for(j=i;j<str.length();j++)
            {
               if(str.charAt(j)=='+'  || str.charAt(j)=='-'  || str.charAt(j)=='/' ||str.charAt(j)=='*')
                {
                    if(temp!=j)
                    break;
                }

            }
            temp=j;

                String num = str.substring(i, j);
                if(num.charAt(0)=='*')
                {
                    String num1=num.substring(1);
                    double number=Double.parseDouble(num1);
                    for(int k=1;k<number;k++)
                    {
                        product=product+sum;
                    }
                    sum=sum+product;
                }
            else if(num.charAt(0)=='/')
            {
                try {
                    String num1 = num.substring(1);
                    double number = Double.parseDouble(num1);
                    if(number==0.0)
                    {
                        throw new ArithmeticException();
                    }
                    sum = sum / number;
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Such Division Not Allowed!",Toast.LENGTH_SHORT).show();
                    t1.setText("0");
                    t2.setText("0");
                    identify=1;
                }
              //  sum=sum+indication;
             //  sum+=sum/number;
                //sum=sum+product;
            }
                else {
                    double number = Double.parseDouble(num);
                    sum = sum + number;
                }
                i = j;



        }
        if(identify!=1)
        t2.setText(String.valueOf(sum));

    }
    public void addNumber(View view)
    {
        t1=(TextView)findViewById(R.id.calculation);

        String str=t1.getText().toString();
        if(!(str.equals("0"))) {
           int k=str.length()-1;
           if(!(str.charAt(k)=='+' || str.charAt(k)=='-' || str.charAt(k)=='*' || str.charAt(k)=='/'))
           {
               t1.setText(str + "+");
           }



        }
    }
    public void subNumber(View view)
    {
        t1=(TextView)findViewById(R.id.calculation);

        String str=t1.getText().toString();
        if(!(str.equals("0"))) {

            int k=str.length()-1;
            if(!(str.charAt(k)=='+' || str.charAt(k)=='-' || str.charAt(k)=='*' || str.charAt(k)=='/'))
            {
                t1.setText(str + "-");
            }

        }
    }
    public void MultiplyNumber(View view)
    {
        t1=(TextView)findViewById(R.id.calculation);

        String str=t1.getText().toString();
        if(!(str.equals("0"))) {

            int k=str.length()-1;
            if(!(str.charAt(k)=='+' || str.charAt(k)=='-' || str.charAt(k)=='*' || str.charAt(k)=='/'))
            {
                t1.setText(str + "*");
            }

        }
    }
    public void divideNumber(View view)
    {
        t1=(TextView)findViewById(R.id.calculation);

        String str=t1.getText().toString();
        if(!(str.equals("0"))) {

            int k=str.length()-1;
            if(!(str.charAt(k)=='+' || str.charAt(k)=='-' || str.charAt(k)=='*' || str.charAt(k)=='/'))
            {
                t1.setText(str + "/");
            }

        }
    }
    public void oneNumber(View view)
    {
        t1=(TextView)findViewById(R.id.calculation);
       String str= t1.getText().toString();
       if(str.equals("0"))
       {
          t1.setText("1");
       }
       else {
           t1.setText(t1.getText().toString() + "1");
       }
    }
    public void twoNumber(View view)
    {
        t1=(TextView)findViewById(R.id.calculation);
        String str= t1.getText().toString();
        if(str.equals("0"))
        {
            t1.setText("2");
        }
        else {
            t1.setText(t1.getText().toString() + "2");
        }
    }
    public void threeNumber(View view)
    {
        t1=(TextView)findViewById(R.id.calculation);
        String str= t1.getText().toString();
        if(str.equals("0"))
        {
            t1.setText("3");
        }
        else {
            t1.setText(t1.getText().toString() + "3");
        }
    }
    public void dotOperation(View view)
    {
        t1=(TextView)findViewById(R.id.calculation);
        int count=0;
        String str= t1.getText().toString();
        for(int k=str.length()-1;k>=0;k--)
        {
            if(str.charAt(k)=='+' || str.charAt(k)=='-' || str.charAt(k)=='*' || str.charAt(k)=='/')
            {
                break;
            }
            if(str.charAt(k)=='.')
            {
                count++;
            }
        }
        if(count==0) {
            t1.setText(str + ".");
        }
    }
    public void fourNumber(View view)
    {
        t1=(TextView)findViewById(R.id.calculation);
        String str= t1.getText().toString();
        if(str.equals("0"))
        {
            t1.setText("4");
        }
        else {
            t1.setText(t1.getText().toString() + "4");
        }
    }
    public void fiveNumber(View view)
    {
        t1=(TextView)findViewById(R.id.calculation);
        String str= t1.getText().toString();
        if(str.equals("0"))
        {
            t1.setText("5");
        }
        else {
            t1.setText(t1.getText().toString() + "5");
        }
    }
    public void sixNumber(View view)
    {
        t1=(TextView)findViewById(R.id.calculation);
        String str= t1.getText().toString();
        if(str.equals("0"))
        {
            t1.setText("6");
        }
        else {
            t1.setText(t1.getText().toString() + "7");
        }
    }
    public void sevenNumber(View view)
    {
        t1=(TextView)findViewById(R.id.calculation);
        String str= t1.getText().toString();
        if(str.equals("0"))
        {
            t1.setText("7");
        }
        else {
            t1.setText(t1.getText().toString() + "7");
        }
    }
    public void eightNumber(View view)
    {
        t1=(TextView)findViewById(R.id.calculation);
        String str= t1.getText().toString();
        if(str.equals("0"))
        {
            t1.setText("8");
        }
        else {
            t1.setText(t1.getText().toString() + "8");
        }
    }
    public void nineNumber(View view)
    {
        t1=(TextView)findViewById(R.id.calculation);
        String str= t1.getText().toString();
        if(str.equals("0"))
        {
            t1.setText("9");
        }
        else {
            t1.setText(t1.getText().toString() + "9");
        }
    }
    public void zeroNumber(View view)
    {
        t1=(TextView)findViewById(R.id.calculation);
        String str= t1.getText().toString();
        if(str.equals("0"))
        {
            t1.setText("0");
        }
        else {
            t1.setText(t1.getText().toString() + "0");
        }
    }
    public void clearData(View view)
    {
        t1=(TextView)findViewById(R.id.calculation);
        t2=(TextView)findViewById(R.id.result);
        t2.setText("0");
        t1.setText("0");
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
}
