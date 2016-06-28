package example.com.testcoreconcepts;

import android.os.Bundle;

public class MainActivity1 extends BaseAppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MainActivity.printMessage();
        //BaseAppCompatActivity.printMessage();

        System.out.println("child1 oncreate");

        printMessage();
    }

    public void printMessage()
    {
        System.out.println("child");
    }
}
