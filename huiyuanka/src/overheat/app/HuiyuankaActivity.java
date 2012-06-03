package overheat.app;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;
import android.view.View.OnClickListener;

public class HuiyuankaActivity extends Activity {
    /** Called when the activity is first created. */
	private Button plusButton = null;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        plusButton = (Button)findViewById(R.id.plusButton);
        
        plusButton.setOnClickListener(new plusButtonOnClickListener()) ;
    }
    
    class plusButtonOnClickListener implements OnClickListener{

		public void onClick(View v) {
			// TODO Auto-generated method stub
			System.out.println("plusButtonOnClickListener answered.");
		}
    	
    }
}