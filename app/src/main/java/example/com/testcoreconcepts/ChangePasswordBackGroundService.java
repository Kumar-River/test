package example.com.testcoreconcepts;

import android.app.IntentService;
import android.content.Intent;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Kumar M on 6/27/2016.
 */
public class ChangePasswordBackGroundService extends IntentService
{
    private Timer mBackGroundTimer;
    private long mDelay = 10 * 1 * 1000; // 20 sec
    private long mInterval_Period = 10 * 1 * 1000; // 10 minz

    public ChangePasswordBackGroundService()
    {
        super("Bis");
        this.mBackGroundTimer = new Timer();
    }

    @Override
    protected void onHandleIntent(Intent intent)
    {
        mBackGroundTimer.schedule(new TimerTask()
        {
            public void run()
            {
                System.out.println("Timer run");

                // Checking Internet
                if (false)
                {
                    // Internet is there
                }
                else
                {
                    // Internet is not there
                    System.out.println("Timer No Internet while Updating Coupons Status onto the server----");
                }
            }
        }, mDelay, mInterval_Period);
    } // END onHandleIntent()

    private void mStopTimer()
    {
        mBackGroundTimer.cancel();
        System.out.println("-----ChangePasswordBackGroundService-----STOPPED");
    }



}
