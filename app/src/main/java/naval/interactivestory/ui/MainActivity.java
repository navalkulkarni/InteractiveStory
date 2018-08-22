package naval.interactivestory.ui;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import naval.interactivestory.R;

public class MainActivity extends AppCompatActivity {

    private EditText nameField;
private Button startButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startButton = findViewById(R.id.start_button);

        nameField=  findViewById(R.id.user_input_edit_text);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userText = nameField.getText().toString();
                //Toast.makeText(MainActivity.this,userText,Toast.LENGTH_LONG).show();
                startStory(userText);
            }
        };
        startButton.setOnClickListener(listener);
    }

    private void startStory(String userText) {
        Intent intent = new Intent(this, StoryActivity.class);
        intent.putExtra("@string/key_name",userText);
        startActivity(intent);
    }
}
