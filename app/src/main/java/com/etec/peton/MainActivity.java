package com.etec.peton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
<<<<<<< Updated upstream
=======
        Toolbar tb = findViewById(R.id.toolbar);
        setSupportActionBar(tb);

        View.OnClickListener listn = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Home.class);
                startActivity(intent);

            }
        };

        Button btn = findViewById(R.id.btnLogin);
        btn.setOnClickListener(listn);
    }

    public void CallRegister(View v){
        Intent i = new Intent(MainActivity.this, UserRegister.class);
        startActivity(i);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.item1:
                Toast.makeText(this, "Item 1 is selected.", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item2:
                Toast.makeText(this, "Item 2 is selected.", Toast.LENGTH_LONG).show();
                return true;
            case R.id.item3:
                Toast.makeText(this, "Item 3 is selected.", Toast.LENGTH_LONG).show();
                return true;
            case R.id.subItem1:
                Toast.makeText(this, "Sub item 1 is selected.", Toast.LENGTH_LONG).show();
                return true;
            case R.id.subItem2:
                Toast.makeText(this, "Sub item 2 is selected.", Toast.LENGTH_LONG).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
>>>>>>> Stashed changes
    }
}
