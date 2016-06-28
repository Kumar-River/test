package example.com.testcoreconcepts;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends BaseAppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MainActivity.printMessage();
        //BaseAppCompatActivity.printMessage();

        System.out.println("child oncreate");

        startActivity(new Intent(this, MainActivity1.class));
        printMessage();



    }

    public void printMessage()
    {
        System.out.println("child");
    }

}
