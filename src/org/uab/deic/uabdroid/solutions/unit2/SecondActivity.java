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
import android.os.Bundle;

// Unused classes when loading the layout from a XML file
// Left here only for when testing the dynamically created layout
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

public class SecondActivity extends Activity 
{

	@Override
	protected void onCreate(Bundle _savedInstanceState) 
	{
		super.onCreate(_savedInstanceState);
		
		/*
		 * Adding the screen layout hierarchy dynamically from the code
		 * 
		LinearLayout rootLayout = new LinearLayout(this);
		rootLayout.setOrientation(LinearLayout.VERTICAL);
		
		LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
		
		TextView textView = new TextView(this);
		textView.setText(R.string.hello);
		
		rootLayout.addView(textView, layoutParams);
		
		setContentView(rootLayout);
		*/
		
		// Add the screen layout hierarchy from a XML file
		// (better way unless you need to create the layout on demand)
		setContentView(R.layout.second);
		
	}

}
