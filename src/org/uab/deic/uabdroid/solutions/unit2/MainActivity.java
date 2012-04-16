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
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity 
{
	private static final int SECOND_ACTIVITY_MENU_ITEM = Menu.FIRST;
	private static final int SUBMENU_ITEM = Menu.FIRST+1;
	
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
				// Activitat 2.3 i 2.3 bis
				//startActivity(new Intent(getBaseContext(), SecondActivity.class));
				// Activitat 2.4
				//startActivity(new Intent(getBaseContext(), ThirdActivity.class));
				// Activitat 2.5
				//startActivity(new Intent(getBaseContext(), FirstFragmentActivity.class));
				// Activitat 2.5 bis bis
				startActivity(new Intent(getBaseContext(), SecondFragmentActivity.class));
			}
        });
        
    }

    // The following method is used to create the activity's options menu
	@Override
	public boolean onCreateOptionsMenu(Menu _menu) 
	{	
		// Hardcoded menu
		/*
		_menu.add(0, SECOND_ACTIVITY_MENU_ITEM, Menu.NONE, R.string.menuitem_second_activity);
		
		SubMenu submenu = _menu.addSubMenu(0, SUBMENU_ITEM, Menu.NONE, R.string.submenu_title);
		submenu.add(0, 0, Menu.NONE, R.string.submenu_item1);
		submenu.add(0, 0, Menu.NONE, R.string.submenu_item2);
		submenu.add(0, 0, Menu.NONE, R.string.submenu_item3);
		submenu.add(0, 0, Menu.NONE, R.string.submenu_item4);
		*/
		
		// Menu in XML file
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.menu_mainactivity, _menu);
		
		return true;
	}

	// With this method we can know wich item from the options menus has been selected
	@Override
	public boolean onOptionsItemSelected(MenuItem _item) 
	{
		switch(_item.getItemId())
		{
			//case SECOND_ACTIVITY_MENU_ITEM:
			case R.id.item_second_activity:
			{
				startActivity(new Intent(this, SecondActivity.class));
				break;
			}
			default:
			{
				break;
			}
		}
		return true;
	}
}