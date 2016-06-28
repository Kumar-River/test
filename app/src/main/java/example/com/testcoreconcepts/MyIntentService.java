package example.com.testcoreconcepts;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.SystemClock;
import android.support.annotation.Nullable;

import java.util.Timer;
import java.util.TimerTask;


/**
 * An {@link IntentService} subclass for handling asynchronous task requests in
 * a service on a separate handler thread.
 * <p/>
 * TODO: Customize class - update intent actions and extra parameters.
 */
public class MyIntentService extends Service
{
    Timer mTimer;

    @Override
    public void onCreate()
    {
        super.onCreate();

        mTimer = new Timer();

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        mTimer.schedule(mTimerTask, 1000, 5000);

        return START_STICKY;
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }


    TimerTask mTimerTask = new TimerTask()
    {
        @Override
        public void run()
        {
          System.out.println("timer task run");

        }
    };


    @Override
    public void onTaskRemoved(Intent rootIntent)
    {
        System.out.println("onTaskRemoved");

        Intent restartServiceIntent = new Intent(getApplicationContext(), this.getClass());
        restartServiceIntent.setPackage(getPackageName());

        PendingIntent restartServicePendingIntent = PendingIntent.getService(getApplicationContext(), 1, restartServiceIntent, PendingIntent.FLAG_ONE_SHOT);
        AlarmManager alarmService = (AlarmManager) getApplicationContext().getSystemService(Context.ALARM_SERVICE);
        alarmService.set(AlarmManager.ELAPSED_REALTIME, SystemClock.elapsedRealtime() + 1000, restartServicePendingIntent);

        super.onTaskRemoved(rootIntent);
    }

}
