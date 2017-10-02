package com.example.play_maker.calculator;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    String string="",strans="";
    TextView screen,screen2;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b19;
    ImageButton b18;
    double n1,n2,answer=0.0;
    int count=0;
    boolean test=false,show=true,testans=false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen=(TextView)findViewById(R.id.textView);
        screen2=(TextView)findViewById(R.id.textView1);

        b1=(Button)findViewById(R.id.one);         b2=(Button)findViewById(R.id.two);
        b3=(Button)findViewById(R.id.three);       b4=(Button)findViewById(R.id.four);
        b5=(Button)findViewById(R.id.fife);        b6=(Button)findViewById(R.id.six);
        b7=(Button)findViewById(R.id.seven);       b8=(Button)findViewById(R.id.eight);
        b9=(Button)findViewById(R.id.nine);        b10=(Button)findViewById(R.id.zero);
        b11=(Button)findViewById(R.id.point);      b12=(Button)findViewById(R.id.plus);
        b13=(Button)findViewById(R.id.ans);        b14=(Button)findViewById(R.id.min);
        b15=(Button)findViewById(R.id.mul);        b16=(Button)findViewById(R.id.div);
        b17=(Button)findViewById(R.id.clear);      b18=(ImageButton) findViewById(R.id.koko);
        b19=(Button)findViewById(R.id.a);
        n1=n2=0.0;
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        
    }

    @Override
    protected void onStart() {
        super.onStart();

        b1.setOnClickListener(this);        b2.setOnClickListener(this);
        b3.setOnClickListener(this);        b4.setOnClickListener(this);
        b5.setOnClickListener(this);        b6.setOnClickListener(this);
        b7.setOnClickListener(this);        b8.setOnClickListener(this);
        b9.setOnClickListener(this);        b10.setOnClickListener(this);
        b11.setOnClickListener(this);       b12.setOnClickListener(this);
        b13.setOnClickListener(this);       b14.setOnClickListener(this);
        b15.setOnClickListener(this);       b16.setOnClickListener(this);
        b17.setOnClickListener(this);       b18.setOnClickListener(this);
        b19.setOnClickListener(this);

    }

        @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.item1:
            {   Intent x=new Intent(Intent.ACTION_VIEW);
                x.setData(Uri.parse("https://www.facebook.com/play0maker"));
                startActivity(x);}
                break;
            case R.id.item2:
            {
                Intent x=new Intent(Intent.ACTION_VIEW);
                x.setData(Uri.parse("https://www.linkedin.com/in/karim-elbahi-0a12a0125/"));
                startActivity(x);
            }
                break;

        }
            return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {


        if(v.getId()==R.id.one)
        {
            if(screen.getText()=="|" ||!show)                screen.setText("1");
            else                                            screen.setText(screen.getText()+"1");
            test=show =true;
            screen2.setText(screen2.getText()+"1");

        }
        else if(v.getId()==R.id.two)
        {
            if(screen.getText()=="|" ||!show)                screen.setText("2");
            else                                     screen.setText(screen.getText()+"2");
            test=show =true;
            screen2.setText(screen2.getText()+"2");
        }
        else if(v.getId()==R.id.three)
        {
            if(screen.getText()=="|" ||!show)                screen.setText("3");
            else                                     screen.setText(screen.getText()+"3");
            test=show =true;
            screen2.setText(screen2.getText()+"3");
        }
        else if(v.getId()==R.id.four)
        {
            if(screen.getText()=="|" ||!show)               screen.setText("4");
            else                                     screen.setText(screen.getText()+"4");
            test=show =true;
            screen2.setText(screen2.getText()+"4");
        }
        else if(v.getId()==R.id.fife)
        {
            if(screen.getText()=="|" ||!show)              screen.setText("5");
            else                                     screen.setText(screen.getText()+"5");
            test=show =true;
            screen2.setText(screen2.getText()+"5");
        }
        else if(v.getId()==R.id.six)
        {
            if(screen.getText()=="|" ||!show)               screen.setText("6");
            else                                     screen.setText(screen.getText()+"6");
            test=show =true;
            screen2.setText(screen2.getText()+"6");
        }
        else if(v.getId()==R.id.seven)
        {
            if(screen.getText()=="|" ||!show)                screen.setText("7");
            else                                     screen.setText(screen.getText()+"7");
            test=show =true;
            screen2.setText(screen2.getText()+"7");
        }
        else if(v.getId()==R.id.eight)
        {
            if(screen.getText()=="|" ||!show)               screen.setText("8");
            else                                     screen.setText(screen.getText()+"8");
            test=show =true;
            screen2.setText(screen2.getText()+"8");
        }
        else if(v.getId()==R.id.nine)
        {
            if(screen.getText()=="|" ||!show)                screen.setText("9");
            else                                     screen.setText(screen.getText()+"9");
            test=show =true;
            screen2.setText(screen2.getText()+"9");
        }
        else if(v.getId()==R.id.zero)
        {
            if(screen.getText()=="|" ||!show)              screen.setText("0");
            else                                     screen.setText(screen.getText()+"0");
            test=show =true;
            screen2.setText(screen2.getText()+"0");
        }
        else if(v.getId()==R.id.point)
        {
            if(screen.getText()=="|" ||!show)               screen.setText(".");
            else                                     screen.setText(screen.getText()+".");
            screen2.setText(screen2.getText()+".");
            show =true;
        }

        else if(v.getId()==R.id.min)
        {
            if(test){
                if(testans)                   n1=answer;
                else                 n1=Double.parseDouble(screen.getText().toString());
            screen.setText("");
            count=1;
            test=false;
                screen2.setText(screen2.getText()+"-");}

            else
            {Toast.makeText(MainActivity.this,"pleas enter number first",Toast.LENGTH_LONG).show();}
        }

        else if(v.getId()==R.id.plus)
        {
            if(test){
                if(testans)                   n1=answer;
                else                 n1=Double.parseDouble(screen.getText().toString());
                screen.setText("");
                count=2;
                test=false;
                screen2.setText(screen2.getText()+"+");}

            else
            {Toast.makeText(MainActivity.this,"pleas enter number first",Toast.LENGTH_LONG).show();}
        }
        else if(v.getId()==R.id.mul)
        {
            if(test){
                if(testans)                   n1=answer;
                else                 n1=Double.parseDouble(screen.getText().toString());
                screen.setText("");
                count=3;
                test=false;
                screen2.setText(screen2.getText()+"*");}

            else
            {Toast.makeText(MainActivity.this,"pleas enter number first",Toast.LENGTH_SHORT).show();}
        }
        else if(v.getId()==R.id.div)
        {
            if(test){
                if(testans)                   n1=answer;
                else                 n1=Double.parseDouble(screen.getText().toString());
                screen.setText("");
                count=4;
                test=false;
                screen2.setText(screen2.getText()+"/");}

            else
            {Toast.makeText(MainActivity.this,"pleas enter number first",Toast.LENGTH_SHORT).show();}
        }
        else if(v.getId()==R.id.koko)
        {
            test=testans=false;show=true;
            string=strans="";
            n1 = n2 =count =0;
            answer=0.0;
            screen2.setText("");            screen.setText("|");
            Toast.makeText(MainActivity.this, "Memory Deleted", Toast.LENGTH_SHORT).show();
        }

        else if(v.getId()==R.id.clear && screen.getText()!="")
        {
            string=screen.getText().toString();
            if(string.length()==1)
                string="";
            else string=(String) string.subSequence(0,(string.length())-1);
            if(screen.getText()!="")
            screen2.setText(string);
            screen.setText(string);

        }

        else if(v.getId()==R.id.a)
        {

            screen.setText("ans");
            test=testans=true;
            screen2.setText(screen2.getText()+"ans");
            n1=answer;
        }

        else if(v.getId()==R.id.ans)
        {
                if (n1 == 0.0)
                {   Toast.makeText(MainActivity.this, "pleas enter number first", Toast.LENGTH_SHORT).show(); }
                else
                {
                    if (screen.getText() == "")
                    { Toast.makeText(MainActivity.this, "pleas enter number first", Toast.LENGTH_SHORT).show();   }
                    else
                    {
                        n2 = Double.parseDouble(screen.getText().toString());
                        if (count == 1)           {     answer = n1 - n2;          }
                        else if (count == 2)      {     answer = n1 + n2;          }
                        else if (count == 3)      {     answer = n1 * n2;          }
                        else                      {     answer = n1 / n2;          }
                        n1 = n2 = 0;
                            screen.setText(answer+"");
                            screen2.setText("");
                        assert test = show=false;
                    }
               }
        show =false;
        n1 = n2 = 0;
        }
    }
}
