package example.com.testcoreconcepts;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Created by Kumar M on 6/27/2016.
 */
public class ServiceStarter extends BroadcastReceiver
{

    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, MyIntentService.class);
        context.startService(i);
    }
}