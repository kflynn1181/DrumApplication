package com.example.drummachinetest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.view.View.OnTouchListener;
import android.widget.PopupMenu;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;


public class MainActivity2 extends AppCompatActivity implements View.OnClickListener, OnTouchListener {

    private SoundPool mSoundPool;

    private int guitarcsound;
    private int guitardsound;
    private int guitaresound;
    private int guitarfsound;
    private int guitargsound;
    private int guitarasound;
    private int guitarbsound;
    private int guitarccsound;
    private int guitarcssound;
    private int guitarcsssound;
    private int guitardssound;
    private int guitargssound;
    private int guitarassound;
    private int guitarfssound;

    private int guitarcsoundreverb;
    private int guitardsoundreverb;
    private int guitaresoundreverb;
    private int guitarfsoundreverb;
    private int guitargsoundreverb;
    private int guitarasoundreverb;
    private int guitarbsoundreverb;
    private int guitarccsoundreverb;
    private int guitarcssoundreverb;
    private int guitarcsssoundreverb;
    private int guitardssoundreverb;
    private int guitargssoundreverb;
    private int guitarassoundreverb;
    private int guitarfssoundreverb;

    private int guitarcsounddelay;
    private int guitardsounddelay;
    private int guitaresounddelay;
    private int guitarfsounddelay;
    private int guitargsounddelay;
    private int guitarasounddelay;
    private int guitarbsounddelay;
    private int guitarccsounddelay;
    private int guitarcssounddelay;
    private int guitarcsssounddelay;
    private int guitardssounddelay;
    private int guitargssounddelay;
    private int guitarassounddelay;
    private int guitarfssounddelay;

    private int guitarcsoundchorus;
    private int guitardsoundchorus;
    private int guitaresoundchorus;
    private int guitarfsoundchorus;
    private int guitargsoundchorus;
    private int guitarasoundchorus;
    private int guitarbsoundchorus;
    private int guitarccsoundchorus;
    private int guitarcssoundchorus;
    private int guitarcsssoundchorus;
    private int guitardssoundchorus;
    private int guitargssoundchorus;
    private int guitarassoundchorus;
    private int guitarfssoundchorus;

    private int guitarcsounddrive;
    private int guitardsounddrive;
    private int guitaresounddrive;
    private int guitarfsounddrive;
    private int guitargsounddrive;
    private int guitarasounddrive;
    private int guitarbsounddrive;
    private int guitarccsounddrive;
    private int guitarcssounddrive;
    private int guitarcsssounddrive;
    private int guitardssounddrive;
    private int guitargssounddrive;
    private int guitarassounddrive;
    private int guitarfssounddrive;

    private int guitarcsoundreverbdelay;
    private int guitardsoundreverbdelay;
    private int guitaresoundreverbdelay;
    private int guitarfsoundreverbdelay;
    private int guitargsoundreverbdelay;
    private int guitarasoundreverbdelay;
    private int guitarbsoundreverbdelay;
    private int guitarccsoundreverbdelay;
    private int guitarcssoundreverbdelay;
    private int guitarcsssoundreverbdelay;
    private int guitardssoundreverbdelay;
    private int guitargssoundreverbdelay;
    private int guitarassoundreverbdelay;
    private int guitarfssoundreverbdelay;

    private int guitarcsoundreverbchorus;
    private int guitardsoundreverbchorus;
    private int guitaresoundreverbchorus;
    private int guitarfsoundreverbchorus;
    private int guitargsoundreverbchorus;
    private int guitarasoundreverbchorus;
    private int guitarbsoundreverbchorus;
    private int guitarccsoundreverbchorus;
    private int guitarcssoundreverbchorus;
    private int guitarcsssoundreverbchorus;
    private int guitardssoundreverbchorus;
    private int guitargssoundreverbchorus;
    private int guitarassoundreverbchorus;
    private int guitarfssoundreverbchorus;

    private int guitarcsoundreverbdrive;
    private int guitardsoundreverbdrive;
    private int guitaresoundreverbdrive;
    private int guitarfsoundreverbdrive;
    private int guitargsoundreverbdrive;
    private int guitarasoundreverbdrive;
    private int guitarbsoundreverbdrive;
    private int guitarccsoundreverbdrive;
    private int guitarcssoundreverbdrive;
    private int guitarcsssoundreverbdrive;
    private int guitardssoundreverbdrive;
    private int guitargssoundreverbdrive;
    private int guitarassoundreverbdrive;
    private int guitarfssoundreverbdrive;

    private int guitarcsounddelaychorus;
    private int guitardsounddelaychorus;
    private int guitaresounddelaychorus;
    private int guitarfsounddelaychorus;
    private int guitargsounddelaychorus;
    private int guitarasounddelaychorus;
    private int guitarbsounddelaychorus;
    private int guitarccsounddelaychorus;
    private int guitarcssounddelaychorus;
    private int guitarcsssounddelaychorus;
    private int guitardssounddelaychorus;
    private int guitargssounddelaychorus;
    private int guitarassounddelaychorus;
    private int guitarfssounddelaychorus;

    private int guitarcsounddelaydrive;
    private int guitardsounddelaydrive;
    private int guitaresounddelaydrive;
    private int guitarfsounddelaydrive;
    private int guitargsounddelaydrive;
    private int guitarasounddelaydrive;
    private int guitarbsounddelaydrive;
    private int guitarccsounddelaydrive;
    private int guitarcssounddelaydrive;
    private int guitarcsssounddelaydrive;
    private int guitardssounddelaydrive;
    private int guitargssounddelaydrive;
    private int guitarassounddelaydrive;
    private int guitarfssounddelaydrive;

    private int guitarcsoundchorusdrive;
    private int guitardsoundchorusdrive;
    private int guitaresoundchorusdrive;
    private int guitarfsoundchorusdrive;
    private int guitargsoundchorusdrive;
    private int guitarasoundchorusdrive;
    private int guitarbsoundchorusdrive;
    private int guitarccsoundchorusdrive;
    private int guitarcssoundchorusdrive;
    private int guitarcsssoundchorusdrive;
    private int guitardssoundchorusdrive;
    private int guitargssoundchorusdrive;
    private int guitarassoundchorusdrive;
    private int guitarfssoundchorusdrive;

    private int guitarcsoundreverbdelaychorus;
    private int guitardsoundreverbdelaychorus;
    private int guitaresoundreverbdelaychorus;
    private int guitarfsoundreverbdelaychorus;
    private int guitargsoundreverbdelaychorus;
    private int guitarasoundreverbdelaychorus;
    private int guitarbsoundreverbdelaychorus;
    private int guitarccsoundreverbdelaychorus;
    private int guitarcssoundreverbdelaychorus;
    private int guitarcsssoundreverbdelaychorus;
    private int guitardssoundreverbdelaychorus;
    private int guitargssoundreverbdelaychorus;
    private int guitarassoundreverbdelaychorus;
    private int guitarfssoundreverbdelaychorus;

    private int guitarcsoundreverbdelaydrive;
    private int guitardsoundreverbdelaydrive;
    private int guitaresoundreverbdelaydrive;
    private int guitarfsoundreverbdelaydrive;
    private int guitargsoundreverbdelaydrive;
    private int guitarasoundreverbdelaydrive;
    private int guitarbsoundreverbdelaydrive;
    private int guitarccsoundreverbdelaydrive;
    private int guitarcssoundreverbdelaydrive;
    private int guitarcsssoundreverbdelaydrive;
    private int guitardssoundreverbdelaydrive;
    private int guitargssoundreverbdelaydrive;
    private int guitarassoundreverbdelaydrive;
    private int guitarfssoundreverbdelaydrive;

    private int guitarcsounddelaychorusdrive;
    private int guitardsounddelaychorusdrive;
    private int guitaresounddelaychorusdrive;
    private int guitarfsounddelaychorusdrive;
    private int guitargsounddelaychorusdrive;
    private int guitarasounddelaychorusdrive;
    private int guitarbsounddelaychorusdrive;
    private int guitarccsounddelaychorusdrive;
    private int guitarcssounddelaychorusdrive;
    private int guitarcsssounddelaychorusdrive;
    private int guitardssounddelaychorusdrive;
    private int guitargssounddelaychorusdrive;
    private int guitarassounddelaychorusdrive;
    private int guitarfssounddelaychorusdrive;

    private int guitarcsoundreverbchorusdrive;
    private int guitardsoundreverbchorusdrive;
    private int guitaresoundreverbchorusdrive;
    private int guitarfsoundreverbchorusdrive;
    private int guitargsoundreverbchorusdrive;
    private int guitarasoundreverbchorusdrive;
    private int guitarbsoundreverbchorusdrive;
    private int guitarccsoundreverbchorusdrive;
    private int guitarcssoundreverbchorusdrive;
    private int guitarcsssoundreverbchorusdrive;
    private int guitardssoundreverbchorusdrive;
    private int guitargssoundreverbchorusdrive;
    private int guitarassoundreverbchorusdrive;
    private int guitarfssoundreverbchorusdrive;

    private int guitarcsoundreverbdelaychorusdrive;
    private int guitardsoundreverbdelaychorusdrive;
    private int guitaresoundreverbdelaychorusdrive;
    private int guitarfsoundreverbdelaychorusdrive;
    private int guitargsoundreverbdelaychorusdrive;
    private int guitarasoundreverbdelaychorusdrive;
    private int guitarbsoundreverbdelaychorusdrive;
    private int guitarccsoundreverbdelaychorusdrive;
    private int guitarcssoundreverbdelaychorusdrive;
    private int guitarcsssoundreverbdelaychorusdrive;
    private int guitardssoundreverbdelaychorusdrive;
    private int guitargssoundreverbdelaychorusdrive;
    private int guitarassoundreverbdelaychorusdrive;
    private int guitarfssoundreverbdelaychorusdrive;

    private int guitaresoundbelow;
    private int guitarfsoundbelow;
    private int guitargsoundbelow;
    private int guitarasoundbelow;
    private int guitarbsoundbelow;
    private int guitargssoundbelow;
    private int guitarassoundbelow;
    private int guitarfssoundbelow;

    private int guitarcsoundabove;
    private int guitardsoundabove;
    private int guitaresoundabove;
    private int guitarfsoundabove;
    private int guitargsoundabove;
    private int guitarasoundabove;
    private int guitarbsoundabove;
    private int guitarccsoundabove;
    private int guitarcssoundabove;
    private int guitardssoundabove;
    private int guitargssoundabove;
    private int guitarassoundabove;
    private int guitarfssoundabove;
    private int guitarcsssoundabove;

    ImageButton myImageButtonViewRefDrums;
    ImageButton myImageButtonViewRefGuitar;
    ImageButton myImageButtonViewRefPiano;
    ImageButton myImageButtonViewRefSequencerGuitar;
    ImageButton myImageButtonViewRefStopGuitar;

    //variable used for resetting sequencer
    ImageButton myImageButtonViewRefResetGuitar;

    View myViewRefRedCircleGuitar;

    View myViewRefNoteC;
    View myViewRefNoteD;
    View myViewRefNoteE;
    View myViewRefNoteF;
    View myViewRefNoteG;
    View myViewRefNoteA;
    View myViewRefNoteB;
    View myViewRefNoteC2;
    View myViewRefNoteCSharp;
    View myViewRefNoteDSharp;
    View myViewRefNoteFSharp;
    View myViewRefNoteGSharp;
    View myViewRefNoteASharp;
    View myViewRefNoteCSharp2;

    View myViewRefNoteEBelow;
    View myViewRefNoteFBelow;
    View myViewRefNoteGBelow;
    View myViewRefNoteABelow;
    View myViewRefNoteBBelow;
    View myViewRefNoteFSharpBelow;
    View myViewRefNoteGSharpBelow;
    View myViewRefNoteASharpBelow;

    View myViewRefNoteCAbove;
    View myViewRefNoteDAbove;
    View myViewRefNoteEAbove;
    View myViewRefNoteFAbove;
    View myViewRefNoteGAbove;
    View myViewRefNoteAAbove;
    View myViewRefNoteBAbove;
    View myViewRefNoteC2Above;
    View myViewRefNoteCSharpAbove;
    View myViewRefNoteDSharpAbove;
    View myViewRefNoteFSharpAbove;
    View myViewRefNoteGSharpAbove;
    View myViewRefNoteASharpAbove;
    View myViewRefNoteCSharp2Above;

    Button myButtonViewRefGuitarReverb;
    Button myButtonViewRefGuitarDelay;
    Button myButtonViewRefGuitarChorus;
    Button myButtonViewRefGuitarDrive;

    Button buttonGuitarC;
    Button buttonGuitarD;
    Button buttonGuitarE;
    Button buttonGuitarF;
    Button buttonGuitarG;
    Button buttonGuitarA;
    Button buttonGuitarB;
    Button buttonGuitarC2;
    Button buttonGuitarCSharp;
    Button buttonGuitarDSharp;
    Button buttonGuitarFSharp;
    Button buttonGuitarGSharp;
    Button buttonGuitarASharp;
    Button buttonGuitarC2Sharp;

    Button myButtonViewRefButtonDownOctave;
    Button myButtonViewRefButtonUpOctave;

    Button myButtonViewRefVolumeControlGuitar;

    SeekBar seekBarGuitar;

    //variable used for accessing system volume for application
    AudioManager audioManager;

    //variables used to check max and current volume
    int maxvolume;
    int currentvolume;

    Switch Switch2;

    double reverbCounter = 0;
    double delayCounter = 0;
    double chorusCounter = 0;
    double driveCounter = 0;
    double downOctaveCounter = 0;
    double upOctaveCounter = 0;
    double sequencerCounterGuitar = 0;
    double stopCounterGuitar = 0;
    double chordCounterGuitar = 0;

    long sequencerStartTime;
    long sequencerCheckTime;
    long sequencerCompareTime;

    boolean[][] sequencerBoolean = new boolean[16][15];

    private int metronomeFirstBar;
    private int metronomeSecondThirdFourthBar;

    int countering = 0;
    int checkPresses = 0;
    int testVariable = 0;

    final int APP2_REQUEST = 1; //used for intent, to swap between MainActivity.java and MainActivity2.java

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mSoundPool = new SoundPool(250, AudioManager.STREAM_MUSIC,0);

        guitarcsound = mSoundPool.load(getApplicationContext(),R.raw.guitarc,1);
        guitardsound = mSoundPool.load(getApplicationContext(),R.raw.guitard,1);
        guitaresound = mSoundPool.load(getApplicationContext(),R.raw.guitare,1);
        guitarfsound = mSoundPool.load(getApplicationContext(),R.raw.guitarf,1);
        guitargsound = mSoundPool.load(getApplicationContext(),R.raw.guitarg,1);
        guitarasound = mSoundPool.load(getApplicationContext(),R.raw.guitara,1);
        guitarbsound = mSoundPool.load(getApplicationContext(),R.raw.guitarb,1);
        guitarcssound = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharp,1);
        guitarcsssound = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharp2,1);
        guitarccsound = mSoundPool.load(getApplicationContext(),R.raw.guitarc2,1);
        guitarassound = mSoundPool.load(getApplicationContext(),R.raw.guitarasharp,1);
        guitarfssound = mSoundPool.load(getApplicationContext(),R.raw.guitarfsharp,1);
        guitargssound = mSoundPool.load(getApplicationContext(),R.raw.guitargsharp,1);
        guitardssound = mSoundPool.load(getApplicationContext(),R.raw.guitardsharp,1);

        guitarcsoundreverb = mSoundPool.load(getApplicationContext(),R.raw.guitarcreverb,1);
        guitardsoundreverb = mSoundPool.load(getApplicationContext(),R.raw.guitardreverb,1);
        guitaresoundreverb = mSoundPool.load(getApplicationContext(),R.raw.guitarereverb,1);
        guitarfsoundreverb = mSoundPool.load(getApplicationContext(),R.raw.guitarfreverb,1);
        guitargsoundreverb = mSoundPool.load(getApplicationContext(),R.raw.guitargreverb,1);
        guitarasoundreverb = mSoundPool.load(getApplicationContext(),R.raw.guitarareverb,1);
        guitarbsoundreverb = mSoundPool.load(getApplicationContext(),R.raw.guitarbreverb,1);
        guitarcssoundreverb = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharpreverb,1);
        guitarcsssoundreverb = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharp2reverb,1);
        guitarccsoundreverb = mSoundPool.load(getApplicationContext(),R.raw.guitarc2reverb,1);
        guitarassoundreverb = mSoundPool.load(getApplicationContext(),R.raw.guitarasharpreverb,1);
        guitarfssoundreverb = mSoundPool.load(getApplicationContext(),R.raw.guitarfsharpreverb,1);
        guitargssoundreverb = mSoundPool.load(getApplicationContext(),R.raw.guitargsharpreverb,1);
        guitardssoundreverb = mSoundPool.load(getApplicationContext(),R.raw.guitardsharpreverb,1);

        guitarcsounddelay = mSoundPool.load(getApplicationContext(),R.raw.guitarcdelay,1);
        guitardsounddelay = mSoundPool.load(getApplicationContext(),R.raw.guitarddelay,1);
        guitaresounddelay = mSoundPool.load(getApplicationContext(),R.raw.guitaredelay,1);
        guitarfsounddelay = mSoundPool.load(getApplicationContext(),R.raw.guitarfdelay,1);
        guitargsounddelay = mSoundPool.load(getApplicationContext(),R.raw.guitargdelay,1);
        guitarasounddelay = mSoundPool.load(getApplicationContext(),R.raw.guitaradelay,1);
        guitarbsounddelay = mSoundPool.load(getApplicationContext(),R.raw.guitarbdelay,1);
        guitarcssounddelay = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharpdelay,1);
        guitarcsssounddelay = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharp2delay,1);
        guitarccsounddelay = mSoundPool.load(getApplicationContext(),R.raw.guitarc2delay,1);
        guitarassounddelay = mSoundPool.load(getApplicationContext(),R.raw.guitarasharpdelay,1);
        guitarfssounddelay = mSoundPool.load(getApplicationContext(),R.raw.guitarfsharpdelay,1);
        guitargssounddelay = mSoundPool.load(getApplicationContext(),R.raw.guitargsharpdelay,1);
        guitardssounddelay = mSoundPool.load(getApplicationContext(),R.raw.guitardsharpdelay,1);

        guitarcsoundchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarcchorus,1);
        guitardsoundchorus = mSoundPool.load(getApplicationContext(),R.raw.guitardchorus,1);
        guitaresoundchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarechorus,1);
        guitarfsoundchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarfchorus,1);
        guitargsoundchorus = mSoundPool.load(getApplicationContext(),R.raw.guitargchorus,1);
        guitarasoundchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarachorus,1);
        guitarbsoundchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarbchorus,1);
        guitarcssoundchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharpchorus,1);
        guitarcsssoundchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharp2chorus,1);
        guitarccsoundchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarc2chorus,1);
        guitarassoundchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarasharpchorus,1);
        guitarfssoundchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarfsharpchorus,1);
        guitargssoundchorus = mSoundPool.load(getApplicationContext(),R.raw.guitargsharpchorus,1);
        guitardssoundchorus = mSoundPool.load(getApplicationContext(),R.raw.guitardsharpchorus,1);

        guitarcsounddrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcdrive,1);
        guitardsounddrive = mSoundPool.load(getApplicationContext(),R.raw.guitarddrive,1);
        guitaresounddrive = mSoundPool.load(getApplicationContext(),R.raw.guitaredrive,1);
        guitarfsounddrive = mSoundPool.load(getApplicationContext(),R.raw.guitarfdrive,1);
        guitargsounddrive = mSoundPool.load(getApplicationContext(),R.raw.guitargdrive,1);
        guitarasounddrive = mSoundPool.load(getApplicationContext(),R.raw.guitaradrive,1);
        guitarbsounddrive = mSoundPool.load(getApplicationContext(),R.raw.guitarbdrive,1);
        guitarcssounddrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharpdrive,1);
        guitarcsssounddrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharp2drive,1);
        guitarccsounddrive = mSoundPool.load(getApplicationContext(),R.raw.guitarc2drive,1);
        guitarassounddrive = mSoundPool.load(getApplicationContext(),R.raw.guitarasharpdrive,1);
        guitarfssounddrive = mSoundPool.load(getApplicationContext(),R.raw.guitarfsharpdrive,1);
        guitargssounddrive = mSoundPool.load(getApplicationContext(),R.raw.guitargsharpdrive,1);
        guitardssounddrive = mSoundPool.load(getApplicationContext(),R.raw.guitardsharpdrive,1);

        guitarcsoundreverbdelay = mSoundPool.load(getApplicationContext(),R.raw.guitarcreverbdelay,1);
        guitardsoundreverbdelay = mSoundPool.load(getApplicationContext(),R.raw.guitardreverbdelay,1);
        guitaresoundreverbdelay = mSoundPool.load(getApplicationContext(),R.raw.guitarereverbdelay,1);
        guitarfsoundreverbdelay = mSoundPool.load(getApplicationContext(),R.raw.guitarfreverbdelay,1);
        guitargsoundreverbdelay = mSoundPool.load(getApplicationContext(),R.raw.guitargreverbdelay,1);
        guitarasoundreverbdelay = mSoundPool.load(getApplicationContext(),R.raw.guitarareverbdelay,1);
        guitarbsoundreverbdelay = mSoundPool.load(getApplicationContext(),R.raw.guitarbreverbdelay,1);
        guitarcssoundreverbdelay = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharpreverbdelay,1);
        guitarcsssoundreverbdelay = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharp2reverbdelay,1);
        guitarccsoundreverbdelay = mSoundPool.load(getApplicationContext(),R.raw.guitarc2reverbdelay,1);
        guitarassoundreverbdelay = mSoundPool.load(getApplicationContext(),R.raw.guitarasharpreverbdelay,1);
        guitarfssoundreverbdelay = mSoundPool.load(getApplicationContext(),R.raw.guitarfsharpreverbdelay,1);
        guitargssoundreverbdelay = mSoundPool.load(getApplicationContext(),R.raw.guitargsharpreverbdelay,1);
        guitardssoundreverbdelay = mSoundPool.load(getApplicationContext(),R.raw.guitardsharpreverbdelay,1);

        guitarcsoundreverbchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarcreverbchorus,1);
        guitardsoundreverbchorus = mSoundPool.load(getApplicationContext(),R.raw.guitardreverbchorus,1);
        guitaresoundreverbchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarereverbchorus,1);
        guitarfsoundreverbchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarfreverbchorus,1);
        guitargsoundreverbchorus = mSoundPool.load(getApplicationContext(),R.raw.guitargreverbchorus,1);
        guitarasoundreverbchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarareverbchorus,1);
        guitarbsoundreverbchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarbreverbchorus,1);
        guitarcssoundreverbchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharpreverbchorus,1);
        guitarcsssoundreverbchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharp2reverbchorus,1);
        guitarccsoundreverbchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarc2reverbchorus,1);
        guitarassoundreverbchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarasharpreverbchorus,1);
        guitarfssoundreverbchorus = mSoundPool.load(getApplicationContext(),R.raw.guitarfsharpreverbchorus,1);
        guitargssoundreverbchorus = mSoundPool.load(getApplicationContext(),R.raw.guitargsharpreverbchorus,1);
        guitardssoundreverbchorus = mSoundPool.load(getApplicationContext(),R.raw.guitardsharpreverbchorus,1);

        guitarcsoundreverbdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcreverbdrive,1);
        guitardsoundreverbdrive = mSoundPool.load(getApplicationContext(),R.raw.guitardreverbdrive,1);
        guitaresoundreverbdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarereverbdrive,1);
        guitarfsoundreverbdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarfreverbdrive,1);
        guitargsoundreverbdrive = mSoundPool.load(getApplicationContext(),R.raw.guitargreverbdrive,1);
        guitarasoundreverbdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarareverbdrive,1);
        guitarbsoundreverbdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarbreverbdrive,1);
        guitarcssoundreverbdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharpreverbdrive,1);
        guitarcsssoundreverbdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharp2reverbdrive,1);
        guitarccsoundreverbdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarc2reverbdrive,1);
        guitarassoundreverbdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarasharpreverbdrive,1);
        guitarfssoundreverbdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarfsharpreverbdrive,1);
        guitargssoundreverbdrive = mSoundPool.load(getApplicationContext(),R.raw.guitargsharpreverbdrive,1);
        guitardssoundreverbdrive = mSoundPool.load(getApplicationContext(),R.raw.guitardsharpreverbchorus,1);

        guitarcsounddelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitarcdelaychorus,1);
        guitardsounddelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitarddelaychorus,1);
        guitaresounddelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitaredelaychorus,1);
        guitarfsounddelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitarfdelaychorus,1);
        guitargsounddelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitargdelaychorus,1);
        guitarasounddelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitaradelaychorus,1);
        guitarbsounddelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitarbdelaychorus,1);
        guitarcssounddelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharpdelaychorus,1);
        guitarcsssounddelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharp2delaychorus,1);
        guitarccsounddelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitarc2delaychorus,1);
        guitarassounddelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitarasharpdelaychorus,1);
        guitarfssounddelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitarfsharpdelaychorus,1);
        guitargssounddelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitargsharpdelaychorus,1);
        guitardssounddelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitardsharpdelaychorus,1);

        guitarcsounddelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcdelaydrive,1);
        guitardsounddelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitarddelaydrive,1);
        guitaresounddelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitaredelaydrive,1);
        guitarfsounddelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitarfdelaydrive,1);
        guitargsounddelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitargdelaydrive,1);
        guitarasounddelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitaradelaydrive,1);
        guitarbsounddelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitarbdelaydrive,1);
        guitarcssounddelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharpdelaydrive,1);
        guitarcsssounddelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharp2delaydrive,1);
        guitarccsounddelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitarc2delaydrive,1);
        guitarassounddelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitarasharpdelaydrive,1);
        guitarfssounddelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitarfsharpdelaydrive,1);
        guitargssounddelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitargsharpdelaydrive,1);
        guitardssounddelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitardsharpdelaydrive,1);

        guitarcsoundchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcchorusdrive,1);
        guitardsoundchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitardchorusdrive,1);
        guitaresoundchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarechorusdrive,1);
        guitarfsoundchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarfchorusdrive,1);
        guitargsoundchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitargchorusdrive,1);
        guitarasoundchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarachorusdrive,1);
        guitarbsoundchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarbchorusdrive,1);
        guitarcssoundchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharpchorusdrive,1);
        guitarcsssoundchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharp2chorusdrive,1);
        guitarccsoundchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarc2chorusdrive,1);
        guitarassoundchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarasharpchorusdrive,1);
        guitarfssoundchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarfsharpchorusdrive,1);
        guitargssoundchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitargsharpchorusdrive,1);
        guitardssoundchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitardsharpchorusdrive,1);

        guitarcsoundreverbdelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitarcreverbdelaychorus,1);
        guitardsoundreverbdelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitardreverbdelaychorus,1);
        guitaresoundreverbdelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitarereverbdelaychorus,1);
        guitarfsoundreverbdelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitarfreverbdelaychorus,1);
        guitargsoundreverbdelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitargreverbdelaychorus,1);
        guitarasoundreverbdelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitarareverbdelaychorus,1);
        guitarbsoundreverbdelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitarbreverbdelaychorus,1);
        guitarcssoundreverbdelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharpreverbdelaychorus,1);
        guitarcsssoundreverbdelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharp2reverbdelaychorus,1);
        guitarccsoundreverbdelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitarc2reverbdelaychorus,1);
        guitarassoundreverbdelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitarasharpreverbdelaychorus,1);
        guitarfssoundreverbdelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitarfsharpreverbdelaychorus,1);
        guitargssoundreverbdelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitargsharpreverbdelaychorus,1);
        guitardssoundreverbdelaychorus = mSoundPool.load(getApplicationContext(),R.raw.guitardsharpreverbdelaychorus,1);

        guitarcsoundreverbdelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcreverbdelaydrive,1);
        guitardsoundreverbdelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitardreverbdelaydrive,1);
        guitaresoundreverbdelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitarereverbdelaydrive,1);
        guitarfsoundreverbdelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitarfreverbdelaydrive,1);
        guitargsoundreverbdelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitargreverbdelaydrive,1);
        guitarasoundreverbdelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitarareverbdelaydrive,1);
        guitarbsoundreverbdelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitarbreverbdelaydrive,1);
        guitarcssoundreverbdelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharpreverbdelaydrive,1);
        guitarcsssoundreverbdelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharp2reverbdelaydrive,1);
        guitarccsoundreverbdelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitarc2reverbdelaydrive,1);
        guitarassoundreverbdelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitarasharpreverbdelaydrive,1);
        guitarfssoundreverbdelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitarfsharpreverbdelaydrive,1);
        guitargssoundreverbdelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitargsharpreverbdelaydrive,1);
        guitardssoundreverbdelaydrive = mSoundPool.load(getApplicationContext(),R.raw.guitardsharpreverbdelaydrive,1);

        guitarcsounddelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcdelaychorusdrive,1);
        guitardsounddelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarddelaychorusdrive,1);
        guitaresounddelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitaredelaychorusdrive,1);
        guitarfsounddelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarfdelaychorusdrive,1);
        guitargsounddelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitargdelaychorusdrive,1);
        guitarasounddelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitaradelaychorusdrive,1);
        guitarbsounddelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarbdelaychorusdrive,1);
        guitarcssounddelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharpdelaychorusdrive,1);
        guitarcsssounddelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharp2delaychorusdrive,1);
        guitarccsounddelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarc2delaychorusdrive,1);
        guitarassounddelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarasharpdelaychorusdrive,1);
        guitarfssounddelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarfsharpdelaychorusdrive,1);
        guitargssounddelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitargsharpdelaychorusdrive,1);
        guitardssounddelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitardsharpdelaychorusdrive,1);

        guitarcsoundreverbchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcreverbchorusdrive,1);
        guitardsoundreverbchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitardreverbchorusdrive,1);
        guitaresoundreverbchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarereverbchorusdrive,1);
        guitarfsoundreverbchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarfreverbchorusdrive,1);
        guitargsoundreverbchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitargreverbchorusdrive,1);
        guitarasoundreverbchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarareverbchorusdrive,1);
        guitarbsoundreverbchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarbreverbchorusdrive,1);
        guitarcssoundreverbchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharpreverbchorusdrive,1);
        guitarcsssoundreverbchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharp2reverbchorusdrive,1);
        guitarccsoundreverbchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarc2reverbchorusdrive,1);
        guitarassoundreverbchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarasharpreverbchorusdrive,1);
        guitarfssoundreverbchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarfsharpreverbchorusdrive,1);
        guitargssoundreverbchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitargsharpreverbchorusdrive,1);
        guitardssoundreverbchorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitardsharpreverbchorusdrive,1);

        guitarcsoundreverbdelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcreverbdelaychorusdrive,1);
        guitardsoundreverbdelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitardreverbdelaychorusdrive,1);
        guitaresoundreverbdelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarereverbdelaychorusdrive,1);
        guitarfsoundreverbdelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarfreverbdelaychorusdrive,1);
        guitargsoundreverbdelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitargreverbdelaychorusdrive,1);
        guitarasoundreverbdelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarareverbdelaychorusdrive,1);
        guitarbsoundreverbdelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarbreverbdelaychorusdrive,1);
        guitarcssoundreverbdelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharpreverbdelaychorusdrive,1);
        guitarcsssoundreverbdelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharp2reverbdelaychorusdrive,1);
        guitarccsoundreverbdelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarc2reverbdelaychorusdrive,1);
        guitarassoundreverbdelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarasharpreverbdelaychorusdrive,1);
        guitarfssoundreverbdelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitarfsharpreverbdelaychorusdrive,1);
        guitargssoundreverbdelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitargsharpreverbdelaychorusdrive,1);
        guitardssoundreverbdelaychorusdrive = mSoundPool.load(getApplicationContext(),R.raw.guitardsharpreverbdelaychorusdrive,1);


        guitaresoundbelow = mSoundPool.load(getApplicationContext(),R.raw.guitarebelow,1);
        guitarfsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.guitarfbelow,1);
        guitargsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.guitargbelow,1);
        guitarasoundbelow = mSoundPool.load(getApplicationContext(),R.raw.guitarabelow,1);
        guitarbsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.guitarbbelow,1);
        guitarassoundbelow = mSoundPool.load(getApplicationContext(),R.raw.guitarasharpbelow,1);
        guitarfssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.guitarfsharpbelow,1);
        guitargssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.guitargsharpbelow,1);

        guitarcsoundabove = mSoundPool.load(getApplicationContext(),R.raw.guitarcabove,1);
        guitardsoundabove = mSoundPool.load(getApplicationContext(),R.raw.guitardabove,1);
        guitaresoundabove = mSoundPool.load(getApplicationContext(),R.raw.guitareabove,1);
        guitarfsoundabove = mSoundPool.load(getApplicationContext(),R.raw.guitarfabove,1);
        guitargsoundabove = mSoundPool.load(getApplicationContext(),R.raw.guitargabove,1);
        guitarasoundabove = mSoundPool.load(getApplicationContext(),R.raw.guitaraabove,1);
        guitarbsoundabove = mSoundPool.load(getApplicationContext(),R.raw.guitarbabove,1);
        guitarccsoundabove = mSoundPool.load(getApplicationContext(),R.raw.guitarc2above,1);
        guitarcssoundabove = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharpabove,1);
        guitardssoundabove = mSoundPool.load(getApplicationContext(),R.raw.guitardsharpabove,1);
        guitarassoundabove = mSoundPool.load(getApplicationContext(),R.raw.guitarasharpabove,1);
        guitarfssoundabove = mSoundPool.load(getApplicationContext(),R.raw.guitarfsharpabove,1);
        guitargssoundabove = mSoundPool.load(getApplicationContext(),R.raw.guitargsharpabove,1);
        guitarcsssoundabove = mSoundPool.load(getApplicationContext(),R.raw.guitarcsharp2above,1);

        metronomeFirstBar = mSoundPool.load(getApplicationContext(), R.raw.metronomefirstbar, 1);
        metronomeSecondThirdFourthBar = mSoundPool.load(getApplicationContext(), R.raw.metronomesecondthirdfourthbar, 1);

        myImageButtonViewRefDrums = findViewById(R.id.imageButtonDrums);
        myImageButtonViewRefDrums.setOnClickListener(this);

        myImageButtonViewRefGuitar = findViewById(R.id.imageButtonGuitar);
        myImageButtonViewRefGuitar.setOnClickListener(this);

        myImageButtonViewRefPiano = findViewById(R.id.imageButtonPiano);
        myImageButtonViewRefPiano.setOnClickListener(this);

        myImageButtonViewRefResetGuitar = findViewById(R.id.imageButtonResetGuitar);
        myImageButtonViewRefResetGuitar.setOnClickListener(this);

        myButtonViewRefGuitarReverb = findViewById(R.id.guitarReverb);
        myButtonViewRefGuitarReverb.setOnClickListener(this);

        myButtonViewRefGuitarDelay = findViewById(R.id.guitarDelay);
        myButtonViewRefGuitarDelay.setOnClickListener(this);

        myButtonViewRefGuitarChorus = findViewById(R.id.guitarChorus);
        myButtonViewRefGuitarChorus.setOnClickListener(this);

        myButtonViewRefGuitarDrive = findViewById(R.id.guitarDrive);
        myButtonViewRefGuitarDrive.setOnClickListener(this);

        myViewRefNoteC = findViewById(R.id.greenCircleNoteC);
        myViewRefNoteC.setOnClickListener(this);

        myViewRefNoteD = findViewById(R.id.greenCircleNoteD);
        myViewRefNoteD.setOnClickListener(this);

        myViewRefNoteE = findViewById(R.id.greenCircleNoteE);
        myViewRefNoteE.setOnClickListener(this);

        myViewRefNoteF = findViewById(R.id.greenCircleNoteF);
        myViewRefNoteF.setOnClickListener(this);

        myViewRefNoteG = findViewById(R.id.greenCircleNoteG);
        myViewRefNoteG.setOnClickListener(this);

        myViewRefNoteA = findViewById(R.id.greenCircleNoteA);
        myViewRefNoteA.setOnClickListener(this);

        myViewRefNoteB = findViewById(R.id.greenCircleNoteB);
        myViewRefNoteB.setOnClickListener(this);

        myViewRefNoteC2 = findViewById(R.id.greenCircleNoteC2);
        myViewRefNoteC2.setOnClickListener(this);

        myViewRefNoteCSharp = findViewById(R.id.greenCircleNoteCSharp);
        myViewRefNoteCSharp.setOnClickListener(this);

        myViewRefNoteDSharp = findViewById(R.id.greenCircleNoteDSharp);
        myViewRefNoteDSharp.setOnClickListener(this);

        myViewRefNoteFSharp = findViewById(R.id.greenCircleNoteFSharp);
        myViewRefNoteFSharp.setOnClickListener(this);

        myViewRefNoteGSharp = findViewById(R.id.greenCircleNoteGSharp);
        myViewRefNoteGSharp.setOnClickListener(this);

        myViewRefNoteASharp = findViewById(R.id.greenCircleNoteASharp);
        myViewRefNoteASharp.setOnClickListener(this);

        myViewRefNoteCSharp2 = findViewById(R.id.greenCircleNoteCSharp2);
        myViewRefNoteCSharp2.setOnClickListener(this);



        myViewRefNoteEBelow = findViewById(R.id.greenCircleNoteEBelow);
        myViewRefNoteEBelow.setOnClickListener(this);

        myViewRefNoteFBelow = findViewById(R.id.greenCircleNoteFBelow);
        myViewRefNoteFBelow.setOnClickListener(this);

        myViewRefNoteGBelow = findViewById(R.id.greenCircleNoteGBelow);
        myViewRefNoteGBelow.setOnClickListener(this);

        myViewRefNoteABelow = findViewById(R.id.greenCircleNoteABelow);
        myViewRefNoteABelow.setOnClickListener(this);

        myViewRefNoteBBelow = findViewById(R.id.greenCircleNoteBBelow);
        myViewRefNoteBBelow.setOnClickListener(this);

        myViewRefNoteFSharpBelow = findViewById(R.id.greenCircleNoteFSharpBelow);
        myViewRefNoteFSharpBelow.setOnClickListener(this);

        myViewRefNoteGSharpBelow = findViewById(R.id.greenCircleNoteGSharpBelow);
        myViewRefNoteGSharpBelow.setOnClickListener(this);

        myViewRefNoteASharpBelow = findViewById(R.id.greenCircleNoteASharpBelow);
        myViewRefNoteASharpBelow.setOnClickListener(this);



        myViewRefNoteDAbove = findViewById(R.id.greenCircleNoteDAbove);
        myViewRefNoteDAbove.setOnClickListener(this);

        myViewRefNoteEAbove = findViewById(R.id.greenCircleNoteEAbove);
        myViewRefNoteEAbove.setOnClickListener(this);

        myViewRefNoteFAbove = findViewById(R.id.greenCircleNoteFAbove);
        myViewRefNoteFAbove.setOnClickListener(this);

        myViewRefNoteGAbove = findViewById(R.id.greenCircleNoteGAbove);
        myViewRefNoteGAbove.setOnClickListener(this);

        myViewRefNoteAAbove = findViewById(R.id.greenCircleNoteAAbove);
        myViewRefNoteAAbove.setOnClickListener(this);

        myViewRefNoteBAbove = findViewById(R.id.greenCircleNoteBAbove);
        myViewRefNoteBAbove.setOnClickListener(this);

        myViewRefNoteC2Above = findViewById(R.id.greenCircleNoteC2Above);
        myViewRefNoteC2Above.setOnClickListener(this);

        myViewRefNoteDSharpAbove = findViewById(R.id.greenCircleNoteDSharpAbove);
        myViewRefNoteDSharpAbove.setOnClickListener(this);

        myViewRefNoteFSharpAbove = findViewById(R.id.greenCircleNoteFSharpAbove);
        myViewRefNoteFSharpAbove.setOnClickListener(this);

        myViewRefNoteGSharpAbove = findViewById(R.id.greenCircleNoteGSharpAbove);
        myViewRefNoteGSharpAbove.setOnClickListener(this);

        myViewRefNoteASharpAbove = findViewById(R.id.greenCircleNoteASharpAbove);
        myViewRefNoteASharpAbove.setOnClickListener(this);

        myViewRefNoteCSharp2Above = findViewById(R.id.greenCircleNoteCSharp2Above);
        myViewRefNoteCSharp2Above.setOnClickListener(this);

        myButtonViewRefButtonDownOctave = findViewById(R.id.buttonDownOctave);
        myButtonViewRefButtonDownOctave.setOnClickListener(this);

        myButtonViewRefButtonUpOctave = findViewById(R.id.buttonUpOctave);
        myButtonViewRefButtonUpOctave.setOnClickListener(this);

        myImageButtonViewRefSequencerGuitar = findViewById(R.id.imageButtonSequencerGuitar);
        myImageButtonViewRefSequencerGuitar.setOnClickListener(this);

        myImageButtonViewRefStopGuitar = findViewById(R.id.imageButtonStopGuitar);
        myImageButtonViewRefStopGuitar.setOnClickListener(this);

        myViewRefRedCircleGuitar = findViewById(R.id.theRedCircleGuitar);
        myViewRefRedCircleGuitar.setOnClickListener(this);

        buttonGuitarC = findViewById(R.id.c);
        buttonGuitarC.setOnTouchListener(this);

        buttonGuitarD = findViewById(R.id.d);
        buttonGuitarD.setOnTouchListener(this);

        buttonGuitarE = findViewById(R.id.e);
        buttonGuitarE.setOnTouchListener(this);

        buttonGuitarF = findViewById(R.id.f);
        buttonGuitarF.setOnTouchListener(this);

        buttonGuitarG = findViewById(R.id.g);
        buttonGuitarG.setOnTouchListener(this);

        buttonGuitarA = findViewById(R.id.a);
        buttonGuitarA.setOnTouchListener(this);

        buttonGuitarB = findViewById(R.id.b);
        buttonGuitarB.setOnTouchListener(this);

        buttonGuitarC2 = findViewById(R.id.c2);
        buttonGuitarC2.setOnTouchListener(this);

        buttonGuitarCSharp = findViewById(R.id.cs);
        buttonGuitarCSharp.setOnTouchListener(this);

        buttonGuitarDSharp = findViewById(R.id.ds);
        buttonGuitarDSharp.setOnTouchListener(this);

        buttonGuitarFSharp = findViewById(R.id.fs);
        buttonGuitarFSharp.setOnTouchListener(this);

        buttonGuitarGSharp = findViewById(R.id.gs);
        buttonGuitarGSharp.setOnTouchListener(this);

        buttonGuitarASharp = findViewById(R.id.as);
        buttonGuitarASharp.setOnTouchListener(this);

        buttonGuitarC2Sharp = findViewById(R.id.css);
        buttonGuitarC2Sharp.setOnTouchListener(this);

        Switch2 = (Switch) findViewById(R.id.switch2);

        myButtonViewRefVolumeControlGuitar = findViewById(R.id.buttonVolumeGuitar);
        myButtonViewRefVolumeControlGuitar.setOnClickListener(this);

        seekBarGuitar = findViewById(R.id.seekBarGuitar);
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        maxvolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        currentvolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        seekBarGuitar.setMax(maxvolume);
        seekBarGuitar.setProgress(currentvolume);

        seekBarGuitar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, i, 0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        PopupMenu popupMenu = new PopupMenu(MainActivity2.this, myButtonViewRefVolumeControlGuitar);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu2, popupMenu.getMenu());

        switch (view.getId()) { //checks which button is pressed

            case R.id.imageButtonDrums: //if the nextPage button is pressed
            {
                Intent intent = new Intent(this, MainActivity.class); //creates a new intent
                mSoundPool.release();
                startActivityForResult(intent, APP2_REQUEST); //starts activity, effectively transfers from MainActivity.java to MainActivity2.java
                break; //break statement
            }

            case R.id.imageButtonGuitar: //if the nextPage button is pressed
            {
                Intent intent = new Intent(this, MainActivity2.class); //creates a new intent
                mSoundPool.release();
                startActivityForResult(intent, APP2_REQUEST); //starts activity, effectively transfers from MainActivity.java to MainActivity2.java
                break; //break statement
            }

            case R.id.imageButtonPiano: //if the nextPage button is pressed
            {
                Intent intent = new Intent(this, MainActivity3.class); //creates a new intent
                mSoundPool.release();
                startActivityForResult(intent, APP2_REQUEST); //starts activity, effectively transfers from MainActivity.java to MainActivity2.java
                break; //break statement
            }

            case R.id.guitarReverb: //if the nextPage button is pressed
            {
                if (myButtonViewRefGuitarReverb.isPressed() && reverbCounter==1) {
                myButtonViewRefGuitarReverb.setBackgroundResource(R.drawable.guitarreverb);
                reverbCounter = 0; }

                else {
                myButtonViewRefGuitarReverb.setBackgroundResource(R.drawable.guitarreverb2);
                reverbCounter = 1; }

                break; //break statement

            }

            case R.id.guitarDelay: //if the nextPage button is pressed
            {
                if (myButtonViewRefGuitarDelay.isPressed() && delayCounter==1) {
                    myButtonViewRefGuitarDelay.setBackgroundResource(R.drawable.guitardelay);
                    delayCounter = 0; }

                else {
                    myButtonViewRefGuitarDelay.setBackgroundResource(R.drawable.guitardelay2);
                    delayCounter = 1; }

                break; //break statement

            }

            case R.id.guitarChorus: //if the nextPage button is pressed
            {
                if (myButtonViewRefGuitarChorus.isPressed() && chorusCounter==1) {
                    myButtonViewRefGuitarChorus.setBackgroundResource(R.drawable.guitarchorus);
                    chorusCounter = 0; }

                else {
                    myButtonViewRefGuitarChorus.setBackgroundResource(R.drawable.guitarchorus2);
                    chorusCounter = 1; }

                break; //break statement

            }

            case R.id.guitarDrive: //if the nextPage button is pressed
            {
                if (myButtonViewRefGuitarDrive.isPressed() && driveCounter==1) {
                    myButtonViewRefGuitarDrive.setBackgroundResource(R.drawable.guitardrive);
                    driveCounter = 0; }

                else {
                    myButtonViewRefGuitarDrive.setBackgroundResource(R.drawable.guitardrive2);
                    driveCounter = 1; }

                break; //break statement

            }

            case R.id.buttonUpOctave: //if the nextPage button is pressed
            {
                if (myButtonViewRefButtonUpOctave.isPressed() && upOctaveCounter == 0 && downOctaveCounter == 0) {
                    upOctaveCounter = 1;
                }
                if (myButtonViewRefButtonUpOctave.isPressed() && upOctaveCounter == 0 && downOctaveCounter == 1) {
                    downOctaveCounter = 0;
                }
                break; //break statement
            }

            case R.id.buttonDownOctave: //if the nextPage button is pressed
            {
                if (myButtonViewRefButtonDownOctave.isPressed() && upOctaveCounter == 0 && downOctaveCounter == 0) {
                    downOctaveCounter = 1;
                }
                if (myButtonViewRefButtonDownOctave.isPressed() && upOctaveCounter == 1 && downOctaveCounter == 0) {
                    upOctaveCounter = 0;
                }
                break; //break statement
            }

            case R.id.buttonVolumeGuitar: //if the nextPage button is pressed
            {
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        // Toast message on menu item clicked
                        Toast.makeText(MainActivity2.this, "Volume Control for " + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                        if (menuItem.getTitle().equals("Total Volume")) {
                            seekBarGuitar.setVisibility(View.VISIBLE);
                        }
                        return true;
                    }
                });
                popupMenu.show();
                break;
            }

            case R.id.imageButtonSequencerGuitar: //if the nextPage button is pressed
            {
                sequencerBoolean[0][0] = true;
                sequencerBoolean[1][0] = true;
                sequencerBoolean[2][0] = true;
                sequencerBoolean[3][0] = true;
                sequencerBoolean[4][0] = true;
                sequencerBoolean[5][0] = true;
                sequencerBoolean[6][0] = true;
                sequencerBoolean[7][0] = true;
                sequencerBoolean[8][0] = true;
                sequencerBoolean[9][0] = true;
                sequencerBoolean[10][0] = true;
                sequencerBoolean[11][0] = true;
                sequencerBoolean[12][0] = true;
                sequencerBoolean[13][0] = true;
                sequencerBoolean[14][0] = true;
                sequencerBoolean[15][0] = true;
                final Handler handlerMetronome = new Handler();

                if (myImageButtonViewRefSequencerGuitar.isPressed() && sequencerCounterGuitar == 2) {
                    myViewRefRedCircleGuitar.setVisibility(View.GONE);
                    sequencerCounterGuitar = 0;
                } else {
                    myViewRefRedCircleGuitar.setVisibility(View.VISIBLE);
                    sequencerCounterGuitar = 1;
                    sequencerStartTime = System.currentTimeMillis();
                    if (sequencerBoolean[0][0] == true) {
                        handlerMetronome.postDelayed(new Runnable() {
                            public void run() {
                                mSoundPool.play(metronomeFirstBar, 1.0f, 1.0f, 0, 0, 1.0f);
                                //if i want to loop the code then uncomment below
                                //if (countering==0) {
                                //handlerMetronome.postDelayed(this, 4000);
                                //}
                            }
                        }, 0);
                    }
                    if (sequencerBoolean[2][0] == true) {
                        handlerMetronome.postDelayed(new Runnable() {
                            public void run() {
                                mSoundPool.play(metronomeSecondThirdFourthBar, 1.0f, 1.0f, 0, 0, 1.0f);
                            }
                        }, 550);
                    }
                    if (sequencerBoolean[4][0] == true) {
                        handlerMetronome.postDelayed(new Runnable() {
                            public void run() {
                                mSoundPool.play(metronomeSecondThirdFourthBar, 1.0f, 1.0f, 0, 0, 1.0f);
                            }
                        }, 1050);
                    }
                    if (sequencerBoolean[6][0] == true) {
                        handlerMetronome.postDelayed(new Runnable() {
                            public void run() {
                                mSoundPool.play(metronomeSecondThirdFourthBar, 1.0f, 1.0f, 0, 0, 1.0f);
                            }
                        }, 1550);
                    }
                    if (sequencerBoolean[8][0] == true) {
                        handlerMetronome.postDelayed(new Runnable() {
                            public void run() {
                                mSoundPool.play(metronomeFirstBar, 1.0f, 1.0f, 0, 0, 1.0f);
                            }
                        }, 2050);
                    }
                    if (sequencerBoolean[10][0] == true) {
                        handlerMetronome.postDelayed(new Runnable() {
                            public void run() {
                                mSoundPool.play(metronomeSecondThirdFourthBar, 1.0f, 1.0f, 0, 0, 1.0f);
                            }
                        }, 2550);
                    }
                    if (sequencerBoolean[12][0] == true) {
                        handlerMetronome.postDelayed(new Runnable() {
                            public void run() {
                                mSoundPool.play(metronomeSecondThirdFourthBar, 1.0f, 1.0f, 0, 0, 1.0f);
                            }
                        }, 3050);
                    }
                    if (sequencerBoolean[14][0] == true) {
                        handlerMetronome.postDelayed(new Runnable() {
                            public void run() {
                                mSoundPool.play(metronomeSecondThirdFourthBar, 1.0f, 1.0f, 0, 0, 1.0f);
                            }
                        }, 3550);
                    }
                    handlerMetronome.postDelayed(new Runnable() {
                        public void run() {
                            //sp.play(metronomeSecondThirdFourthBar, 1.0f, 1.0f, 0, 0, 1.0f);
                            myViewRefRedCircleGuitar.setVisibility(View.GONE);
                            sequencerCounterGuitar = 0;
                        }
                    }, 4000);
                }
                break;
            }

            case R.id.imageButtonResetGuitar:
            {
                java.util.Arrays.fill(sequencerBoolean[0], false);
                java.util.Arrays.fill(sequencerBoolean[1], false);
                java.util.Arrays.fill(sequencerBoolean[2], false);
                java.util.Arrays.fill(sequencerBoolean[3], false);
                java.util.Arrays.fill(sequencerBoolean[4], false);
                java.util.Arrays.fill(sequencerBoolean[5], false);
                java.util.Arrays.fill(sequencerBoolean[6], false);
                java.util.Arrays.fill(sequencerBoolean[7], false);
                java.util.Arrays.fill(sequencerBoolean[8], false);
                java.util.Arrays.fill(sequencerBoolean[9], false);
                java.util.Arrays.fill(sequencerBoolean[10], false);
                java.util.Arrays.fill(sequencerBoolean[11], false);
                java.util.Arrays.fill(sequencerBoolean[12], false);
                java.util.Arrays.fill(sequencerBoolean[13], false);
                java.util.Arrays.fill(sequencerBoolean[14], false);
                java.util.Arrays.fill(sequencerBoolean[15], false);

                Toast.makeText(MainActivity2.this, "Sequencer Reset", Toast.LENGTH_SHORT).show();

                break; //break statement
            }

            case R.id.imageButtonStopGuitar://if the nextPage button is pressed
            {
                if (testVariable == 1) {
                    checkPresses = checkPresses - 1;
                    testVariable = 0;
                    Toast.makeText(MainActivity2.this, "Stopped state", Toast.LENGTH_SHORT).show();
                } else {
                    checkPresses = checkPresses + 1;
                    testVariable = 1;
                    Toast.makeText(MainActivity2.this, "Playback state", Toast.LENGTH_SHORT).show();
                }

                final Handler handler = new Handler();

                if (sequencerCounterGuitar == 0 && checkPresses == 1) {
                    if (sequencerBoolean[0][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarccsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarccsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarccsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarccsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarccsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarccsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarccsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarccsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarccsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarccsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarccsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarccsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarccsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarccsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarccsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarccsound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitardssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarfssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitargssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarassound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarassound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarassound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarassound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarassound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarassound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarassound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarassound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarassound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarassound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarassound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarassound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarassound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarassound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarassound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarassound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    mSoundPool.play(guitarcsssound, 1.0f, 1.0f, 0, 0, 1.0f);
                                    if (countering == 0) {
                                        handler.postDelayed(this, 4000);
                                    }
                                    if (checkPresses == 0) {
                                        mSoundPool.autoPause();
                                    }
                                }
                            }
                        }, 4000);
                    }

                }
            }

        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        onTouchEvent(view, motionEvent);
        onTouchEvent2(view, motionEvent);
        onTouchEvent3(view, motionEvent);
        onTouchEvent4(view, motionEvent);
        switch(view.getId()) {
            case R.id.c:
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==0) { mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==0) { mSoundPool.play(guitarcsoundreverb, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==0) { mSoundPool.play(guitarcsounddelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==0) { mSoundPool.play(guitarcsoundchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==0) { mSoundPool.play(guitarcsounddrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==0) { mSoundPool.play(guitarcsoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==0) { mSoundPool.play(guitarcsoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==0) { mSoundPool.play(guitarcsoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==0) { mSoundPool.play(guitarcsounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==0) { mSoundPool.play(guitarcsounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==0) { mSoundPool.play(guitarcsoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==0) { mSoundPool.play(guitarcsoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==0) { mSoundPool.play(guitarcsoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==0) { mSoundPool.play(guitarcsounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==0) { mSoundPool.play(guitarcsoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==0) { mSoundPool.play(guitarcsoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsoundreverb, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsounddelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsoundchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsounddrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                myViewRefNoteC.setVisibility(View.VISIBLE);
                myViewRefNoteC.postDelayed(new Runnable() {
                    public void run() {
                        myViewRefNoteC.setVisibility(View.INVISIBLE);
                    }
                }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f);
                    mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                    mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                    mSoundPool.play(guitarccsound, 1.0f, 1.0f, 0, 0, 1.0f);
                    mSoundPool.play(guitaresoundabove, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    myViewRefNoteC.setVisibility(View.VISIBLE);
                    myViewRefNoteE.setVisibility(View.VISIBLE);
                    myViewRefNoteG.setVisibility(View.VISIBLE);
                    myViewRefNoteC2.setVisibility(View.VISIBLE);
                    myViewRefNoteEAbove.setVisibility(View.VISIBLE);
                    myViewRefNoteC.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteC.setVisibility(View.INVISIBLE);
                            myViewRefNoteE.setVisibility(View.INVISIBLE);
                            myViewRefNoteG.setVisibility(View.INVISIBLE);
                            myViewRefNoteC2.setVisibility(View.INVISIBLE);
                            myViewRefNoteEAbove.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) { mSoundPool.play(guitarcsoundabove, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) {
                    myViewRefNoteC2.setVisibility(View.VISIBLE);
                    myViewRefNoteC2.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteC2.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                break;

            case R.id.d:
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardsoundreverb, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardsounddelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardsoundchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardsounddrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardsoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardsoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardsoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardsounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardsounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardsoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardsoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardsoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardsounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardsoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardsoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardsoundreverb, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardsounddelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardsoundchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardsounddrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardsoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardsoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardsoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardsounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardsounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardsoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardsoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardsoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardsounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardsoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardsoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;}
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    myViewRefNoteD.setVisibility(View.VISIBLE);
                    myViewRefNoteD.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteD.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f);
                    mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f);
                    mSoundPool.play(guitardsoundabove, 1.0f, 1.0f, 0, 0, 1.0f);
                    mSoundPool.play(guitarfssoundabove, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    myViewRefNoteD.setVisibility(View.VISIBLE);
                    myViewRefNoteA.setVisibility(View.VISIBLE);
                    myViewRefNoteDAbove.setVisibility(View.VISIBLE);
                    myViewRefNoteFSharpAbove.setVisibility(View.VISIBLE);
                    myViewRefNoteC.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteD.setVisibility(View.INVISIBLE);
                            myViewRefNoteA.setVisibility(View.INVISIBLE);
                            myViewRefNoteDAbove.setVisibility(View.INVISIBLE);
                            myViewRefNoteFSharpAbove.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) { mSoundPool.play(guitardsoundabove, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) {
                    myViewRefNoteDAbove.setVisibility(View.VISIBLE);
                    myViewRefNoteDAbove.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteDAbove.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                break;

            case R.id.e:
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitaresoundreverb, 1.0f, 1.0f, 0, 0, 1.0f); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitaresounddelay, 1.0f, 1.0f, 0, 0, 1.0f); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitaresoundchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitaresounddrive, 1.0f, 1.0f, 0, 0, 1.0f); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitaresoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitaresoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitaresoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitaresounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitaresounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitaresoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitaresoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitaresoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitaresounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitaresoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitaresoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }

            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                sequencerCheckTime = System.currentTimeMillis(); //1
                sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;}
                if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;}
                if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;}
                if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;}
                if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;}
                if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;}
                if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;}
                if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;}
                if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;}
                if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;}
                if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;}
                if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;}
                if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;}
                if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;}
                if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;}
                if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;}
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                mSoundPool.play(guitaresoundreverb, 1.0f, 1.0f, 0, 0, 1.0f);
                sequencerCheckTime = System.currentTimeMillis(); //1
                sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;}
                if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;}
                if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;}
                if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;}
                if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;}
                if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;}
                if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;}
                if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;}
                if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;}
                if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;}
                if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;}
                if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;}
                if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;}
                if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;}
                if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;}
                if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;}
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                mSoundPool.play(guitaresounddelay, 1.0f, 1.0f, 0, 0, 1.0f);
                sequencerCheckTime = System.currentTimeMillis(); //1
                sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;}
                if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;}
                if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;}
                if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;}
                if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;}
                if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;}
                if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;}
                if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;}
                if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;}
                if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;}
                if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;}
                if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;}
                if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;}
                if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;}
                if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;}
                if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;}
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                mSoundPool.play(guitaresoundchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                sequencerCheckTime = System.currentTimeMillis(); //1
                sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;}
                if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;}
                if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;}
                if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;}
                if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;}
                if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;}
                if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;}
                if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;}
                if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;}
                if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;}
                if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;}
                if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;}
                if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;}
                if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;}
                if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;}
                if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;}
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                mSoundPool.play(guitaresounddrive, 1.0f, 1.0f, 0, 0, 1.0f);
                sequencerCheckTime = System.currentTimeMillis(); //1
                sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;}
                if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;}
                if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;}
                if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;}
                if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;}
                if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;}
                if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;}
                if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;}
                if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;}
                if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;}
                if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;}
                if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;}
                if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;}
                if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;}
                if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;}
                if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;}
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                mSoundPool.play(guitaresoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f);
                sequencerCheckTime = System.currentTimeMillis(); //1
                sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;}
                if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;}
                if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;}
                if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;}
                if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;}
                if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;}
                if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;}
                if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;}
                if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;}
                if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;}
                if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;}
                if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;}
                if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;}
                if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;}
                if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;}
                if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;}
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                mSoundPool.play(guitaresoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                sequencerCheckTime = System.currentTimeMillis(); //1
                sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;}
                if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;}
                if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;}
                if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;}
                if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;}
                if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;}
                if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;}
                if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;}
                if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;}
                if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;}
                if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;}
                if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;}
                if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;}
                if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;}
                if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;}
                if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;}
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                mSoundPool.play(guitaresoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                sequencerCheckTime = System.currentTimeMillis(); //1
                sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;}
                if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;}
                if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;}
                if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;}
                if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;}
                if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;}
                if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;}
                if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;}
                if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;}
                if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;}
                if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;}
                if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;}
                if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;}
                if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;}
                if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;}
                if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;}
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                mSoundPool.play(guitaresounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                sequencerCheckTime = System.currentTimeMillis(); //1
                sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;}
                if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;}
                if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;}
                if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;}
                if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;}
                if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;}
                if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;}
                if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;}
                if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;}
                if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;}
                if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;}
                if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;}
                if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;}
                if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;}
                if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;}
                if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;}
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                mSoundPool.play(guitaresounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                sequencerCheckTime = System.currentTimeMillis(); //1
                sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;}
                if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;}
                if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;}
                if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;}
                if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;}
                if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;}
                if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;}
                if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;}
                if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;}
                if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;}
                if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;}
                if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;}
                if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;}
                if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;}
                if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;}
                if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;}
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                mSoundPool.play(guitaresoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                sequencerCheckTime = System.currentTimeMillis(); //1
                sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;}
                if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;}
                if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;}
                if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;}
                if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;}
                if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;}
                if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;}
                if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;}
                if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;}
                if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;}
                if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;}
                if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;}
                if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;}
                if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;}
                if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;}
                if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;}
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                mSoundPool.play(guitaresoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                sequencerCheckTime = System.currentTimeMillis(); //1
                sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;}
                if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;}
                if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;}
                if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;}
                if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;}
                if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;}
                if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;}
                if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;}
                if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;}
                if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;}
                if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;}
                if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;}
                if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;}
                if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;}
                if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;}
                if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;}
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                mSoundPool.play(guitaresoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                sequencerCheckTime = System.currentTimeMillis(); //1
                sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;}
                if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;}
                if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;}
                if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;}
                if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;}
                if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;}
                if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;}
                if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;}
                if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;}
                if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;}
                if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;}
                if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;}
                if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;}
                if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;}
                if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;}
                if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;}
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                mSoundPool.play(guitaresounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                sequencerCheckTime = System.currentTimeMillis(); //1
                sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;}
                if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;}
                if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;}
                if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;}
                if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;}
                if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;}
                if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;}
                if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;}
                if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;}
                if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;}
                if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;}
                if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;}
                if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;}
                if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;}
                if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;}
                if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;}
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                mSoundPool.play(guitaresoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                sequencerCheckTime = System.currentTimeMillis(); //1
                sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;}
                if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;}
                if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;}
                if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;}
                if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;}
                if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;}
                if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;}
                if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;}
                if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;}
                if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;}
                if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;}
                if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;}
                if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;}
                if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;}
                if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;}
                if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;}
            }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                mSoundPool.play(guitaresoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                sequencerCheckTime = System.currentTimeMillis(); //1
                sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;}
                if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;}
                if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;}
                if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;}
                if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;}
                if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;}
                if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;}
                if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;}
                if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;}
                if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;}
                if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;}
                if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;}
                if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;}
                if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;}
                if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;}
                if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;}
            }


            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                myViewRefNoteE.setVisibility(View.VISIBLE);
                myViewRefNoteE.postDelayed(new Runnable() {
                    public void run() {
                        myViewRefNoteE.setVisibility(View.INVISIBLE);
                    }
                }, 1500); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                mSoundPool.play(guitaresoundbelow, 1.0f, 1.0f, 0, 0, 1.0f);
                mSoundPool.play(guitarbsoundbelow, 1.0f, 1.0f, 0, 0, 1.0f);
                mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f);
                mSoundPool.play(guitaresoundabove, 1.0f, 1.0f, 0, 0, 1.0f); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                myViewRefNoteEBelow.setVisibility(View.VISIBLE);
                myViewRefNoteBBelow.setVisibility(View.VISIBLE);
                myViewRefNoteE.setVisibility(View.VISIBLE);
                myViewRefNoteG.setVisibility(View.VISIBLE);
                myViewRefNoteB.setVisibility(View.VISIBLE);
                myViewRefNoteEAbove.setVisibility(View.VISIBLE);
                myViewRefNoteC.postDelayed(new Runnable() {
                    public void run() {
                        myViewRefNoteEBelow.setVisibility(View.INVISIBLE);
                        myViewRefNoteBBelow.setVisibility(View.INVISIBLE);
                        myViewRefNoteE.setVisibility(View.INVISIBLE);
                        myViewRefNoteG.setVisibility(View.INVISIBLE);
                        myViewRefNoteB.setVisibility(View.INVISIBLE);
                        myViewRefNoteEAbove.setVisibility(View.INVISIBLE);
                    }
                }, 1500); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) {
                mSoundPool.play(guitaresoundbelow, 1.0f, 1.0f, 0, 0, 1.0f); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) {
                mSoundPool.play(guitaresoundabove, 1.0f, 1.0f, 0, 0, 1.0f); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) {
                myViewRefNoteEAbove.setVisibility(View.VISIBLE);
                myViewRefNoteEAbove.postDelayed(new Runnable() {
                    public void run() {
                        myViewRefNoteEAbove.setVisibility(View.INVISIBLE);
                    }
                }, 1500); }
            if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) {
                myViewRefNoteEBelow.setVisibility(View.VISIBLE);
                myViewRefNoteEBelow.postDelayed(new Runnable() {
                    public void run() {
                        myViewRefNoteEBelow.setVisibility(View.INVISIBLE);
                    }
                }, 1500); }
            break;
        }
        return false;
    }

    public boolean onTouchEvent(View view, MotionEvent motionEvent) {
        switch(view.getId()) {
            case R.id.f:
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfsound, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfsoundreverb, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfsounddelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfsoundchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfsounddrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfsoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfsoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfsoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfsounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfsounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfsoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfsoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfsoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfsounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfsoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfsoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfsound, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfsoundreverb, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfsounddelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfsoundchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfsounddrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfsoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfsoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfsoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfsounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfsounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfsoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfsoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfsoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfsounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfsoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfsoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;}
                }


                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    myViewRefNoteF.setVisibility(View.VISIBLE);
                    myViewRefNoteF.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteF.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) { mSoundPool.play(guitarfsoundbelow, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) { mSoundPool.play(guitarfsoundabove, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) {
                    myViewRefNoteFAbove.setVisibility(View.VISIBLE);
                    myViewRefNoteFAbove.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteFAbove.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) {
                    myViewRefNoteFBelow.setVisibility(View.VISIBLE);
                    myViewRefNoteFBelow.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteFBelow.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                break;

            case R.id.g:
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargsoundreverb, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargsounddelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargsoundchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargsounddrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargsoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargsoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargsoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargsounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargsounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargsoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargsoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargsoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargsounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargsoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargsoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargsoundreverb, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargsounddelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargsoundchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargsounddrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargsoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargsoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargsoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargsounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargsounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargsoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargsoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargsoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargsounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargsoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargsoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;}
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    myViewRefNoteG.setVisibility(View.VISIBLE);
                    myViewRefNoteG.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteG.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    mSoundPool.play(guitargsoundbelow, 1.0f, 1.0f, 0, 0, 1.0f);
                    mSoundPool.play(guitarbsoundbelow, 1.0f, 1.0f, 0, 0, 1.0f);
                    mSoundPool.play(guitardsound, 1.0f, 1.0f, 0, 0, 1.0f);
                    mSoundPool.play(guitargsound, 1.0f, 1.0f, 0, 0, 1.0f);
                    mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f);
                    mSoundPool.play(guitargsoundabove, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    myViewRefNoteGBelow.setVisibility(View.VISIBLE);
                    myViewRefNoteBBelow.setVisibility(View.VISIBLE);
                    myViewRefNoteD.setVisibility(View.VISIBLE);
                    myViewRefNoteG.setVisibility(View.VISIBLE);
                    myViewRefNoteB.setVisibility(View.VISIBLE);
                    myViewRefNoteGAbove.setVisibility(View.VISIBLE);
                    myViewRefNoteC.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteGBelow.setVisibility(View.INVISIBLE);
                            myViewRefNoteBBelow.setVisibility(View.INVISIBLE);
                            myViewRefNoteD.setVisibility(View.INVISIBLE);
                            myViewRefNoteG.setVisibility(View.INVISIBLE);
                            myViewRefNoteB.setVisibility(View.INVISIBLE);
                            myViewRefNoteGAbove.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) {
                    mSoundPool.play(guitargsoundbelow, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) {
                    mSoundPool.play(guitargsoundabove, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) {
                    myViewRefNoteGAbove.setVisibility(View.VISIBLE);
                    myViewRefNoteGAbove.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteGAbove.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) {
                    myViewRefNoteGBelow.setVisibility(View.VISIBLE);
                    myViewRefNoteGBelow.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteGBelow.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                break;

            case R.id.a:
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarasoundreverb, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarasounddelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarasoundchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarasounddrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarasoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarasoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarasoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarasounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarasounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarasoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarasoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarasoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarasounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarasoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarasoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarasoundreverb, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarasounddelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarasoundchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarasounddrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarasoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarasoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarasoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarasounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarasounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarasoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarasoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarasoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarasounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarasoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarasoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;}
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    myViewRefNoteA.setVisibility(View.VISIBLE);
                    myViewRefNoteA.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteA.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    mSoundPool.play(guitarasoundbelow, 1.0f, 1.0f, 0, 0, 1.0f);
                    mSoundPool.play(guitaresound, 1.0f, 1.0f, 0, 0, 1.0f);
                    mSoundPool.play(guitarasound, 1.0f, 1.0f, 0, 0, 1.0f);
                    mSoundPool.play(guitarcsssound, 1.0f, 1.0f, 0, 0, 1.0f);
                    mSoundPool.play(guitaresoundabove, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    myViewRefNoteABelow.setVisibility(View.VISIBLE);
                    myViewRefNoteE.setVisibility(View.VISIBLE);
                    myViewRefNoteA.setVisibility(View.VISIBLE);
                    myViewRefNoteCSharp2.setVisibility(View.VISIBLE);
                    myViewRefNoteEAbove.setVisibility(View.VISIBLE);
                    myViewRefNoteC.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteABelow.setVisibility(View.INVISIBLE);
                            myViewRefNoteE.setVisibility(View.INVISIBLE);
                            myViewRefNoteA.setVisibility(View.INVISIBLE);
                            myViewRefNoteCSharp2.setVisibility(View.INVISIBLE);
                            myViewRefNoteEAbove.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) { mSoundPool.play(guitarasoundbelow, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) { mSoundPool.play(guitarasoundabove, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) {
                    myViewRefNoteAAbove.setVisibility(View.VISIBLE);
                    myViewRefNoteAAbove.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteAAbove.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) {
                    myViewRefNoteABelow.setVisibility(View.VISIBLE);
                    myViewRefNoteABelow.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteABelow.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                break;
        }
        return false;
    }

    public boolean onTouchEvent2(View view, MotionEvent motionEvent) {
        switch(view.getId()) {
            case R.id.b:
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarbsoundreverb, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarbsounddelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarbsoundchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarbsounddrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarbsoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarbsoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarbsoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarbsounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarbsounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarbsoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarbsoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarbsoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarbsounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarbsoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarbsoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarbsound, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarbsoundreverb, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarbsounddelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarbsoundchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarbsounddrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarbsoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarbsoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarbsoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarbsounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarbsounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarbsoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarbsoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarbsoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarbsounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarbsoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarbsoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;}
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    myViewRefNoteB.setVisibility(View.VISIBLE);
                    myViewRefNoteB.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteB.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) { mSoundPool.play(guitarbsoundbelow, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) { mSoundPool.play(guitarbsoundabove, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) {
                    myViewRefNoteBAbove.setVisibility(View.VISIBLE);
                    myViewRefNoteBAbove.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteBAbove.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) {
                    myViewRefNoteBBelow.setVisibility(View.VISIBLE);
                    myViewRefNoteBBelow.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteBBelow.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                break;

            case R.id.c2:
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarccsound, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarccsoundreverb, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarccsounddelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarccsoundchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarccsounddrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarccsoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarccsoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarccsoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarccsounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarccsounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarccsoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarccsoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarccsoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarccsounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarccsoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarccsoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarccsound, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarccsoundreverb, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarccsounddelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarccsoundchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarccsounddrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarccsoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarccsoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarccsoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarccsounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarccsounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarccsoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarccsoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarccsoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarccsounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarccsoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarccsoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;}
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    myViewRefNoteC2.setVisibility(View.VISIBLE);
                    myViewRefNoteC2.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteC2.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) { mSoundPool.play(guitarcsound, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) { mSoundPool.play(guitarccsoundabove, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) {
                    myViewRefNoteC2Above.setVisibility(View.VISIBLE);
                    myViewRefNoteC2Above.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteC2Above.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) {
                    myViewRefNoteC.setVisibility(View.VISIBLE);
                    myViewRefNoteC.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteC.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                break;

            case R.id.cs:
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcssound, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcssoundreverb, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcssounddelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcssoundchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcssounddrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcssoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcssoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcssoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcssounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcssounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcssoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcssoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcssoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcssounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcssoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcssoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcssound, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcssoundreverb, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcssounddelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcssoundchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcssounddrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcssoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcssoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcssoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcssounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcssounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcssoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcssoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcssoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcssounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcssoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcssoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;}
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    myViewRefNoteCSharp.setVisibility(View.VISIBLE);
                    myViewRefNoteCSharp.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteCSharp.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) { mSoundPool.play(guitarcssoundabove, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) {
                    myViewRefNoteCSharp2.setVisibility(View.VISIBLE);
                    myViewRefNoteCSharp2.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteCSharp2.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                break;
        }
        return false;
    }

    public boolean onTouchEvent3(View view, MotionEvent motionEvent) {
        switch(view.getId()) {
            case R.id.ds:
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardssound, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardssoundreverb, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardssounddelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardssoundchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardssounddrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardssoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardssoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardssoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardssounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardssounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardssoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardssoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardssoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardssounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardssoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitardssoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardssound, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardssoundreverb, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardssounddelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardssoundchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardssounddrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardssoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardssoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardssoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardssounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardssounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardssoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardssoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardssoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardssounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardssoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitardssoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;}
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    myViewRefNoteDSharp.setVisibility(View.VISIBLE);
                    myViewRefNoteDSharp.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteDSharp.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) {
                    mSoundPool.play(guitardssoundabove, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) {
                    myViewRefNoteDSharpAbove.setVisibility(View.VISIBLE);
                    myViewRefNoteDSharpAbove.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteDSharpAbove.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                break;

            case R.id.fs:
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfssound, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfssoundreverb, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfssounddelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfssoundchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfssounddrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfssoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfssoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfssoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfssounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfssounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfssoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfssoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfssoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfssounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfssoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarfssoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfssound, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfssoundreverb, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfssounddelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfssoundchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfssounddrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfssoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfssoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfssoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfssounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfssounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfssoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfssoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfssoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfssounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfssoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarfssoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;}
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    myViewRefNoteFSharp.setVisibility(View.VISIBLE);
                    myViewRefNoteFSharp.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteFSharp.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) { mSoundPool.play(guitarfssoundbelow, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) { mSoundPool.play(guitarfssoundabove, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) {
                    myViewRefNoteFSharpAbove.setVisibility(View.VISIBLE);
                    myViewRefNoteFSharpAbove.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteFSharpAbove.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) {
                    myViewRefNoteFSharpBelow.setVisibility(View.VISIBLE);
                    myViewRefNoteFSharpBelow.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteFSharpBelow.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                break;

            case R.id.gs:
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargssound, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargssoundreverb, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargssounddelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargssoundchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargssounddrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargssoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargssoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargssoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargssounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargssounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargssoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargssoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargssoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargssounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargssoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitargssoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargssound, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargssoundreverb, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargssounddelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargssoundchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargssounddrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargssoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargssoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargssoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargssounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargssounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargssoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargssoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargssoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargssounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargssoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitargssoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;}
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    myViewRefNoteGSharp.setVisibility(View.VISIBLE);
                    myViewRefNoteGSharp.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteGSharp.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) { mSoundPool.play(guitargssoundbelow, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) { mSoundPool.play(guitargssoundabove, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) {
                    myViewRefNoteGSharpAbove.setVisibility(View.VISIBLE);
                    myViewRefNoteGSharpAbove.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteGSharpAbove.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) {
                    myViewRefNoteGSharpBelow.setVisibility(View.VISIBLE);
                    myViewRefNoteGSharpBelow.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteGSharpBelow.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                break;
        }
        return false;
    }

    public boolean onTouchEvent4(View view, MotionEvent motionEvent) {
        switch(view.getId()) {
            case R.id.as:
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarassound, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarassoundreverb, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarassounddelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarassoundchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarassounddrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarassoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarassoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarassoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarassounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarassounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarassoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarassoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarassoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarassounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarassoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarassoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarassound, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarassoundreverb, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarassounddelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarassoundchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarassounddrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarassoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarassoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarassoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarassounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarassounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarassoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarassoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarassoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarassounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarassoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarassoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;}
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    myViewRefNoteASharp.setVisibility(View.VISIBLE);
                    myViewRefNoteASharp.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteASharp.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) { mSoundPool.play(guitarassoundbelow, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) { mSoundPool.play(guitarassoundabove, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) {
                    myViewRefNoteASharpAbove.setVisibility(View.VISIBLE);
                    myViewRefNoteASharpAbove.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteASharpAbove.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) {
                    myViewRefNoteASharpBelow.setVisibility(View.VISIBLE);
                    myViewRefNoteASharpBelow.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteASharpBelow.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                break;

            case R.id.css:
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcsssound, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcsssoundreverb, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcsssounddelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcsssoundchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcsssounddrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcsssoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcsssoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcsssoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcsssounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcsssounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcsssoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcsssoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcsssoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcsssounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcsssoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) { mSoundPool.play(guitarcsssoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f); }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsssound, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsssoundreverb, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsssounddelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsssoundchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsssounddrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsssoundreverbdelay, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsssoundreverbchorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsssoundreverbdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsssounddelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsssounddelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsssoundchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsssoundreverbdelaychorus, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==0 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsssoundreverbdelaydrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsssounddelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==0 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsssoundreverbchorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;}
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==1 && delayCounter==1 && chorusCounter==1 && driveCounter==1 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0 && sequencerCounterGuitar==1) {
                    mSoundPool.play(guitarcsssoundreverbdelaychorusdrive, 1.0f, 1.0f, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;}
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;}
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;}
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;}
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;}
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;}
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;}
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;}
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;}
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;}
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;}
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;}
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;}
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;}
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;}
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;}
                }


                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==0) {
                    myViewRefNoteCSharp2.setVisibility(View.VISIBLE);
                    myViewRefNoteCSharp2.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteCSharp2.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) { mSoundPool.play(guitarcssound, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && reverbCounter==0 && delayCounter==0 && chorusCounter==0 && driveCounter==0 && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) { mSoundPool.play(guitarcsssoundabove, 1.0f, 1.0f, 0, 0, 1.0f); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==0 && upOctaveCounter==1) {
                    myViewRefNoteCSharp2Above.setVisibility(View.VISIBLE);
                    myViewRefNoteCSharp2Above.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteCSharp2Above.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch2.isChecked() && downOctaveCounter==1 && upOctaveCounter==0) {
                    myViewRefNoteCSharp.setVisibility(View.VISIBLE);
                    myViewRefNoteCSharp.postDelayed(new Runnable() {
                        public void run() {
                            myViewRefNoteCSharp.setVisibility(View.INVISIBLE);
                        }
                    }, 1500); }
                break;
        }
        return false;
    }

}