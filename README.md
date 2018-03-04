##### Добавляем кнопку для перехода на следующую Активность

Создаем новую Акстивность
`java => pakc => ПКМ => New - Activity - Empty`

В `manifest` появилась запись
```
<activity android:name=".SettingsActivity"
            android:label="ActivitySettings">
        </activity>
```

В MainActivity
```
public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    // обьявляем кнопку
    Button settingButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязываем слушателя
        settingButton = (Button) findViewById(R.id.button_settings);
        settingButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.button_settings:
                // вызываем вторую активность
                // создаем обьект intent(контент, класс второй активности)
                Intent intent = new Intent(this, SettingsActivity.class);
                // стартуем вторую активность
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}
```
