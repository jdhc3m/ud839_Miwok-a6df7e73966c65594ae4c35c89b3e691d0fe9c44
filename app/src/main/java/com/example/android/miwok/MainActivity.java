/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Set;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the Number category
        final TextView numbers = (TextView) findViewById(R.id.numbers);


        // Set a click listener on that View

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override

            // The code in this method will be executed when the numbers category is clicked on.
            public void onClick(View view) {
                Toast.makeText(view.getContext(),
                        "Open the list of Numbers", Toast.LENGTH_SHORT).show();

                // Create a new intent to open the {@link NumbersActivity}
                Intent numbersIntent = new Intent(MainActivity.this, NumberActivity.class);

                // Start the new activity
                startActivity(numbersIntent);
            }
        });

        // Find the View that shows the Colors category
        final TextView colors = (TextView) findViewById(R.id.colors);

        // Set a click listener on that View
        colors.setOnClickListener(new View.OnClickListener() {
            @Override

            // The code in this method will be executed when the Colors category is clicked on.
            public void onClick(View view) {
                Toast.makeText(view.getContext(),
                        "Open the list of Colors", Toast.LENGTH_SHORT).show();

                // Create a new intent to open the {@link NumbersActivity}
                Intent colorsIntent = new Intent(MainActivity.this, ColorsActivity.class);

                // Start the new activity
                startActivity(colorsIntent);
            }
        });

        //Find the View that shows the Family category
/*        TextView family = (TextView)findViewById(R.id.family);

        // set a ClickListener on that View
        family.setOnClickListener(new View.OnClickListener() {
            @Override

            // The code in this method will be executed when the Family category is clicked on.
            public void onClick(View view) {
                Toast.makeText(view.getContext(),
                        "Open the list of Family", Toast.LENGTH_SHORT).show();

                // Create a new intent to open the {@link NumbersActivity}
                Intent familyIntent = new Intent(MainActivity.this, FamilyActivity.class);

                // Start the new activity
                startActivity(familyIntent);
            }
        }); */

        //Find the View that shows the Phrases category
        TextView phrases = (TextView)findViewById(R.id.phrases);

        // set a ClickListener on that View
        phrases.setOnClickListener(new View.OnClickListener() {
            @Override

            // The code in this method will be executed when the Family category is clicked on.
            public void onClick(View view) {
                Toast.makeText(view.getContext(),
                        "Open the list of Phrases", Toast.LENGTH_SHORT).show();

                // Create a new intent to open the {@link NumbersActivity}
                Intent phrasesIntent = new Intent(MainActivity.this, PhrasesActivity.class);

                // Start the new activity
                startActivity(phrasesIntent);
            }
        });


    }
    public void openNumbersList (View view){
        Intent i = new Intent(this, NumberActivity.class);
        startActivity(i);
    }
    public void openPhrasesList (View view){
        Intent i = new Intent(this, PhrasesActivity.class);
        startActivity(i);
    }
    public void openFamilyList (View view){
        Intent i = new Intent(this, FamilyActivity.class);
        startActivity(i);
    }
    public void openColorsList (View view){
        Intent i = new Intent(this, ColorsActivity.class);
        startActivity(i);
    }
}
