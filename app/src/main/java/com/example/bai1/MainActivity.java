public class MainActivity extends AppCompatActivity {

    EditText edtA, edtB, edtKQ; Button btncong;
    @Override
    protected void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); setContentView(R.layout.activity_main);
// Ánh xạ Id cho các biến giao diện edtA = findViewById(R.id.edtA); edtB = findViewById(R.id.edtB); edtKQ = findViewById(R.id.edtKQ);
        btncong = findViewById(R.id.btntong);

        btncong.setOnClickListener(new View.OnClickListener() { @Override
        public void onClick(View view) {
            int a = Integer.parseInt(edtA.getText().toString());	//

            int b = Integer.parseInt(edtB.getText().toString());



        }
        });
    }
}