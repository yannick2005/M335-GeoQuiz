package ch.zli.geoquiz;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;

import java.util.Timer;

public class QuizActivity extends Activity implements SensorEventListener {
    public Timer timer;
    private SensorManager sensorManager;
    private Sensor sensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        initializeSensor();

    }

    @Override
    public void onSensorChanged(SensorEvent event) {
            float axisX = event.values[0];
            float axisY = event.values[1];
            float axisZ = event.values[2];

            long curTime = System.currentTimeMillis();
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {
        // Only initialized, that nor error occurs
    }

    private void initializeSensor(){
        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
    }
}
