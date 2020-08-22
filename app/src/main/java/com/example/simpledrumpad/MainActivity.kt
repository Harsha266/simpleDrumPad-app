package com.example.simpledrumpad
import android.media.AudioAttributes
import android.media.AudioManager
import android.media.SoundPool
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity() {
    var soundPool: SoundPool ?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            var at = AudioAttributes.Builder()
                .setUsage(AudioAttributes.USAGE_MEDIA)
                .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                .build()

            var soundPool = SoundPool.Builder()
                .setMaxStreams(9)
                .setAudioAttributes(at)
                .build()

        }else{

            soundPool = SoundPool(9,AudioManager.STREAM_MUSIC,0)

        }
         var sound1 = soundPool!!.load(this,R.raw.ratat, 1)
         var sound2 = soundPool!!.load(this,R.raw.basic_rock, 1)
         var sound3 = soundPool!!.load(this,R.raw.big_thawa, 1)
         var sound4 = soundPool!!.load(this,R.raw.basic, 1)
         var sound5 = soundPool!!.load(this,R.raw.cymbal_groove, 1)
         var sound6 = soundPool!!.load(this,R.raw.driving_force, 1)
         var sound7 = soundPool!!.load(this,R.raw.first_beat, 1)
         var sound8 = soundPool!!.load(this,R.raw.pounder, 1)
         var sound9 = soundPool!!.load(this,R.raw.tamba, 1)




        btnOne.setOnClickListener { soundPool!!.play(sound1,1.0F,1.0F,0,0,10F) }
        btnTwo.setOnClickListener { soundPool!!.play(sound2,1.0F,1.0F,0,0,10F) }
        btnThree.setOnClickListener { soundPool!!.play(sound3,1.0F,1.0F,0,0,10F) }
        btnFour.setOnClickListener { soundPool!!.play(sound4,1.0F,1.0F,0,0,10F) }
        btnFive.setOnClickListener {soundPool!!.play(sound5,1.0F,1.0F,0,0,10F)  }
        btnSix.setOnClickListener { soundPool!!.play(sound6,1.0F,1.0F,0,0,10F) }
        btnSeven.setOnClickListener {  soundPool!!.play(sound7,1.0F,1.0F,0,0,10F)}
        btnEight.setOnClickListener { soundPool!!.play(sound8,1.0F,1.0F,0,0,10F) }
        btnNine.setOnClickListener { soundPool!!.play(sound9,1.0F,1.0F,0,0,10F) }
    }


}

