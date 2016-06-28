package example.com.testcoreconcepts;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Kumar M on 6/17/2016.
 */
public class BaseAppCompatActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);

        System.out.println("parent oncreate");
    }

    public void printMessage()
    {
        System.out.println("parent");
    }
}
