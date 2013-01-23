package wifi.nav.buddy;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ScanView extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan_view);
        
		// Setup UI
        TextView dataText = (TextView) findViewById(R.id.dataText);

		// Setup WiFi
        WifiManager wifi = (WifiManager) getSystemService(Context.WIFI_SERVICE);

		Button btnDisplay = (Button) findViewById(R.id.button1);
    }
    
    public void onClick(View v) {
		
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_scan_view, menu);
        return true;
    }
}
