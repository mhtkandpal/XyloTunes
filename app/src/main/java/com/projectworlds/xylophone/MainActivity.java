package com.projectworlds.xylophone;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool soundPool;
     private int mCsoundId;
    private int mDsoundId;
    private int mEsoundId;
    private int mFsoundId;
    private int mGsoundId;
    private int mHsoundId;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         soundPool=new SoundPool(6, AudioManager.STREAM_MUSIC,0);
         mCsoundId=soundPool.load(getApplicationContext(),R.raw.note1_c,1);
        mDsoundId=soundPool.load(getApplicationContext(),R.raw.note2_d,1);
        mEsoundId=soundPool.load(getApplicationContext(),R.raw.note3_e,1);
        mFsoundId=soundPool.load(getApplicationContext(),R.raw.note4_f,1);
        mGsoundId=soundPool.load(getApplicationContext(),R.raw.note5_g,1);
        mHsoundId=soundPool.load(getApplicationContext(),R.raw.note6_a,1);

    }
    public  void playC(View v){

        soundPool.play(mCsoundId,1.0f,1.0f,0,0,1.0f);


    }
    public  void playD(View v){
        soundPool.play(mDsoundId,1.0f,1.0f,0,0,1.0f);
    }
    public  void playE(View v){
        soundPool.play(mEsoundId,1.0f,1.0f,0,0,1.0f);

    }
    public  void playF(View v){
        soundPool.play(mFsoundId,1.0f,1.0f,0,0,1.0f);
    }
    public  void playG(View v){
        soundPool.play(mGsoundId,1.0f,1.0f,0,0,1.0f);
    }
    public  void playA(View v){
        soundPool.play(mHsoundId,1.0f,1.0f,0,0,1.0f);
    }
}
