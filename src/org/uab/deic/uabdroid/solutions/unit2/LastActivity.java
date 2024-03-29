/*
   Copyright 2012 Ruben Serrano

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */

package org.uab.deic.uabdroid.solutions.unit2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class LastActivity extends Activity 
{
    @Override
    public void onCreate(Bundle _savedInstanceState) 
    {
        super.onCreate(_savedInstanceState);
        setContentView(R.layout.main);
        
        // Obtain a reference to the button in order to set a ClickListener 
        Button buttonSecondActivity = (Button) findViewById(R.id.button_second_activity);
        
        // Set an OnClickListener to capture the Click Event 
        buttonSecondActivity.setOnClickListener(new OnClickListener()
        {
        	// When the button is pressed, launch the SecondActivity
			@Override
			public void onClick(View v) 
			{
				startActivity(new Intent(getBaseContext(), SecondFragmentActivity.class));
			}
        });
        
    }
}