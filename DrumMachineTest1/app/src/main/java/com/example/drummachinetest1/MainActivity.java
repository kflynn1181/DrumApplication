//Final Project Drum Application
//Code created by Kevin Flynn (C18502203)

//the folder where the source code resides
package com.example.drummachinetest1;

//importing the necessary libraries/modules/classes to be used in this application
import androidx.appcompat.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.SeekBar;
import android.widget.Switch;
import android.view.View.OnTouchListener;
import android.widget.Toast;

import java.util.Arrays;

//public class to initialise the app, implements the OnClick and OnTouch
public class MainActivity extends AppCompatActivity implements View.OnClickListener, OnTouchListener {

    //variable created for Sound Pool, which will be used to store and play back sounds
    private SoundPool sp;

    //the following variables are used for different drum sounds
    private int crash;
    private int bell;
    private int stick;
    private int kick;
    private int hihatopen;
    private int snare;
    private int hihatclosed;

    private int electroniccrash;
    private int electronicbell;
    private int electronicstick;
    private int electronickick;
    private int electronichihatopen;
    private int electronicsnare;
    private int electronichihatclosed;

    private int crashsequencer;
    private int bellsequencer;
    private int sticksequencer;
    private int kicksequencer;
    private int hihatopensequencer;
    private int snaresequencer;
    private int hihatclosedsequencer;

    private int electroniccrashsequencer;
    private int electronicbellsequencer;
    private int electronicsticksequencer;
    private int electronickicksequencer;
    private int electronichihatopensequencer;
    private int electronicsnaresequencer;
    private int electronichihatclosedsequencer;

    private int crashreverb;
    private int bellreverb;
    private int stickreverb;
    private int kickreverb;
    private int hihatopenreverb;
    private int snarereverb;
    private int hihatclosedreverb;

    private int electroniccrashreverb;
    private int electronicbellreverb;
    private int electronicstickreverb;
    private int electronickickreverb;
    private int electronichihatopenreverb;
    private int electronicsnarereverb;
    private int electronichihatclosedreverb;

    private int crashdelay;
    private int belldelay;
    private int stickdelay;
    private int kickdelay;
    private int hihatopendelay;
    private int snaredelay;
    private int hihatcloseddelay;

    private int electroniccrashdelay;
    private int electronicbelldelay;
    private int electronicstickdelay;
    private int electronickickdelay;
    private int electronichihatopendelay;
    private int electronicsnaredelay;
    private int electronichihatcloseddelay;

    private int crashreverbdelay;
    private int bellreverbdelay;
    private int stickreverbdelay;
    private int kickreverbdelay;
    private int hihatopenreverbdelay;
    private int snarereverbdelay;
    private int hihatclosedreverbdelay;

    private int electroniccrashreverbdelay;
    private int electronicbellreverbdelay;
    private int electronicstickreverbdelay;
    private int electronickickreverbdelay;
    private int electronichihatopenreverbdelay;
    private int electronicsnarereverbdelay;
    private int electronichihatclosedreverbdelay;

    //three variables for transferring from one activity to another
    ImageButton myImageButtonViewRefDrums;
    ImageButton myImageButtonViewRefGuitar;
    ImageButton myImageButtonViewRefPiano;

    //variables represent the seven drum sounds, will be used to check if a button is touched using onTouch method
    Button buttonKick;
    Button buttonSnare;
    Button buttonHiHatOpen;
    Button buttonHiHatClosed;
    Button buttonBell;
    Button buttonStick;
    Button buttonCymbal;

    //variables used for reverb and delay pedals, will be used to check if reverb or delay have been turned on, as well as volume control, used for drop-down menu and sliders
    Button myButtonViewRefDrumReverb;
    Button myButtonViewRefDrumDelay;
    Button myButtonViewRefVolumeControl;

    //red circle used for reverb and delay pedals, when a pedal is turned on by user, this view variable is used to display a red circle drawable on the pedal if user has clicked on it, remains gray if not clicked by user
    View myViewRefRedCircle;

    //switch variable for switching to acoustic drums or electronic drums
    Switch Switch1;

    //seekbars are essentially sliders, used for the volume control,
    //when one volume control option is clicked
    //(ex. snare is clicked by user from drop-down menu)
    //then snare slider displays on ui
    SeekBar seekBar;
    SeekBar seekBarKick;
    SeekBar seekBarSnare;
    SeekBar seekBarHiHatOpen;
    SeekBar seekBarHiHatClosed;
    SeekBar seekBarStick;
    SeekBar seekBarBell;
    SeekBar seekBarCrash;

    //variable used for accessing system volume for application
    AudioManager audioManager;

    //variables used to check max and current volume
    int maxvolume;
    int currentvolume;

    //variables to set the sliders of drum sounds to 1, or fully on
    //Can be lowered by user (ex. 0.5 will be halfway on the slider)
    float progressChangedValueKick = 1;
    float progressChangedValueSnare = 1;
    float progressChangedValueHiHatOpen = 1;
    float progressChangedValueHiHatClosed = 1;
    float progressChangedValueStick = 1;
    float progressChangedValueBell = 1;
    float progressChangedValueCrash = 1;

    //double counter variable used for checking the on and off states for the sequencer
    double sequencerCounter = 0;

    //double counter variables used for checking the on and off states for the reverb pedal and delay pedal
    double drumReverbCounter = 0;
    double drumDelayCounter = 0;

    //used for intent, to swap between MainActivity.java and MainActivity2.java and MainActivity3.java
    final int APP2_REQUEST = 1;

    //two variables used for turning on and off sequencer
    ImageButton myImageButtonViewRefSequencer;
    ImageButton myImageButtonViewRefStop;

    //variable used for resetting sequencer
    ImageButton myImageButtonViewRefReset;

    //variables used to check the states of the sequencer
    long sequencerStartTime;
    long sequencerCheckTime;
    long sequencerCompareTime;

    //variables used for metronome sounds,
    //first bar will be a louder sound than the following three bars
    private int metronomeFirstBar;
    private int metronomeSecondThirdFourthBar;

    //two-dimensional boolean array used for sequencer,
    //16 represents 16 bars and 8 represents 8 different sounds,
    //7 for drums and 1 for metronome
    boolean[][] sequencerBoolean = new boolean[16][8];

    //counter variables, used for checking if something is in an on or off state
    int countering = 0;
    int checkPresses = 0;
    int testVariable = 0;

    //the following variables are used to check if a user has pressed a certain drum sound at a certain time when the sequencer is on (ex. the user has pressed a kick 2 seconds after the sequencer is on. In this case, the kickCheckCounter7 will convert from 0 to 1. When it is one, the sequencer playback knows when to play that sound)
    int kickCheckCounter = 0; int kickCheckCounter1 = 0; int kickCheckCounter2 = 0; int kickCheckCounter3 = 0; int kickCheckCounter4 = 0; int kickCheckCounter5 = 0; int kickCheckCounter6 = 0; int kickCheckCounter7 = 0; int kickCheckCounter8 = 0; int kickCheckCounter9 = 0; int kickCheckCounter10 = 0; int kickCheckCounter11 = 0; int kickCheckCounter12 = 0; int kickCheckCounter13 = 0; int kickCheckCounter14 = 0; int kickCheckCounter15 = 0;
    int kickReverbCheckCounter = 0; int kickReverbCheckCounter1 = 0; int kickReverbCheckCounter2 = 0; int kickReverbCheckCounter3 = 0; int kickReverbCheckCounter4 = 0; int kickReverbCheckCounter5 = 0; int kickReverbCheckCounter6 = 0; int kickReverbCheckCounter7 = 0; int kickReverbCheckCounter8 = 0; int kickReverbCheckCounter9 = 0; int kickReverbCheckCounter10 = 0; int kickReverbCheckCounter11 = 0; int kickReverbCheckCounter12 = 0; int kickReverbCheckCounter13 = 0; int kickReverbCheckCounter14 = 0; int kickReverbCheckCounter15 = 0;
    int kickDelayCheckCounter = 0; int kickDelayCheckCounter1 = 0; int kickDelayCheckCounter2 = 0; int kickDelayCheckCounter3 = 0; int kickDelayCheckCounter4 = 0; int kickDelayCheckCounter5 = 0; int kickDelayCheckCounter6 = 0; int kickDelayCheckCounter7 = 0; int kickDelayCheckCounter8 = 0; int kickDelayCheckCounter9 = 0; int kickDelayCheckCounter10 = 0; int kickDelayCheckCounter11 = 0; int kickDelayCheckCounter12 = 0; int kickDelayCheckCounter13 = 0; int kickDelayCheckCounter14 = 0; int kickDelayCheckCounter15 = 0;
    int kickReverbDelayCheckCounter = 0; int kickReverbDelayCheckCounter1 = 0; int kickReverbDelayCheckCounter2 = 0; int kickReverbDelayCheckCounter3 = 0; int kickReverbDelayCheckCounter4 = 0; int kickReverbDelayCheckCounter5 = 0; int kickReverbDelayCheckCounter6 = 0; int kickReverbDelayCheckCounter7 = 0; int kickReverbDelayCheckCounter8 = 0; int kickReverbDelayCheckCounter9 = 0; int kickReverbDelayCheckCounter10 = 0; int kickReverbDelayCheckCounter11 = 0; int kickReverbDelayCheckCounter12 = 0; int kickReverbDelayCheckCounter13 = 0; int kickReverbDelayCheckCounter14 = 0; int kickReverbDelayCheckCounter15 = 0;
    int electronicKickCheckCounter = 0; int electronicKickCheckCounter1 = 0; int electronicKickCheckCounter2 = 0; int electronicKickCheckCounter3 = 0; int electronicKickCheckCounter4 = 0; int electronicKickCheckCounter5 = 0; int electronicKickCheckCounter6 = 0; int electronicKickCheckCounter7 = 0; int electronicKickCheckCounter8 = 0; int electronicKickCheckCounter9 = 0; int electronicKickCheckCounter10 = 0; int electronicKickCheckCounter11 = 0; int electronicKickCheckCounter12 = 0; int electronicKickCheckCounter13 = 0; int electronicKickCheckCounter14 = 0; int electronicKickCheckCounter15 = 0;
    int electronicKickReverbCheckCounter = 0; int electronicKickReverbCheckCounter1 = 0; int electronicKickReverbCheckCounter2 = 0; int electronicKickReverbCheckCounter3 = 0; int electronicKickReverbCheckCounter4 = 0; int electronicKickReverbCheckCounter5 = 0; int electronicKickReverbCheckCounter6 = 0; int electronicKickReverbCheckCounter7 = 0; int electronicKickReverbCheckCounter8 = 0; int electronicKickReverbCheckCounter9 = 0; int electronicKickReverbCheckCounter10 = 0; int electronicKickReverbCheckCounter11 = 0; int electronicKickReverbCheckCounter12 = 0; int electronicKickReverbCheckCounter13 = 0; int electronicKickReverbCheckCounter14 = 0; int electronicKickReverbCheckCounter15 = 0;
    int electronicKickDelayCheckCounter = 0; int electronicKickDelayCheckCounter1 = 0; int electronicKickDelayCheckCounter2 = 0; int electronicKickDelayCheckCounter3 = 0; int electronicKickDelayCheckCounter4 = 0; int electronicKickDelayCheckCounter5 = 0; int electronicKickDelayCheckCounter6 = 0; int electronicKickDelayCheckCounter7 = 0; int electronicKickDelayCheckCounter8 = 0; int electronicKickDelayCheckCounter9 = 0; int electronicKickDelayCheckCounter10 = 0; int electronicKickDelayCheckCounter11 = 0; int electronicKickDelayCheckCounter12 = 0; int electronicKickDelayCheckCounter13 = 0; int electronicKickDelayCheckCounter14 = 0; int electronicKickDelayCheckCounter15 = 0;
    int electronicKickReverbDelayCheckCounter = 0; int electronicKickReverbDelayCheckCounter1 = 0; int electronicKickReverbDelayCheckCounter2 = 0; int electronicKickReverbDelayCheckCounter3 = 0; int electronicKickReverbDelayCheckCounter4 = 0; int electronicKickReverbDelayCheckCounter5 = 0; int electronicKickReverbDelayCheckCounter6 = 0; int electronicKickReverbDelayCheckCounter7 = 0; int electronicKickReverbDelayCheckCounter8 = 0; int electronicKickReverbDelayCheckCounter9 = 0; int electronicKickReverbDelayCheckCounter10 = 0; int electronicKickReverbDelayCheckCounter11 = 0; int electronicKickReverbDelayCheckCounter12 = 0; int electronicKickReverbDelayCheckCounter13 = 0; int electronicKickReverbDelayCheckCounter14 = 0; int electronicKickReverbDelayCheckCounter15 = 0;

    int snareCheckCounter = 0; int snareCheckCounter1 = 0; int snareCheckCounter2 = 0; int snareCheckCounter3 = 0; int snareCheckCounter4 = 0; int snareCheckCounter5 = 0; int snareCheckCounter6 = 0; int snareCheckCounter7 = 0; int snareCheckCounter8 = 0; int snareCheckCounter9 = 0; int snareCheckCounter10 = 0; int snareCheckCounter11 = 0; int snareCheckCounter12 = 0; int snareCheckCounter13 = 0; int snareCheckCounter14 = 0; int snareCheckCounter15 = 0;
    int snareReverbCheckCounter = 0; int snareReverbCheckCounter1 = 0; int snareReverbCheckCounter2 = 0; int snareReverbCheckCounter3 = 0; int snareReverbCheckCounter4 = 0; int snareReverbCheckCounter5 = 0; int snareReverbCheckCounter6 = 0; int snareReverbCheckCounter7 = 0; int snareReverbCheckCounter8 = 0; int snareReverbCheckCounter9 = 0; int snareReverbCheckCounter10 = 0; int snareReverbCheckCounter11 = 0; int snareReverbCheckCounter12 = 0; int snareReverbCheckCounter13 = 0; int snareReverbCheckCounter14 = 0; int snareReverbCheckCounter15 = 0;
    int snareDelayCheckCounter = 0; int snareDelayCheckCounter1 = 0; int snareDelayCheckCounter2 = 0; int snareDelayCheckCounter3 = 0; int snareDelayCheckCounter4 = 0; int snareDelayCheckCounter5 = 0; int snareDelayCheckCounter6 = 0; int snareDelayCheckCounter7 = 0; int snareDelayCheckCounter8 = 0; int snareDelayCheckCounter9 = 0; int snareDelayCheckCounter10 = 0; int snareDelayCheckCounter11 = 0; int snareDelayCheckCounter12 = 0; int snareDelayCheckCounter13 = 0; int snareDelayCheckCounter14 = 0; int snareDelayCheckCounter15 = 0;
    int snareReverbDelayCheckCounter = 0; int snareReverbDelayCheckCounter1 = 0; int snareReverbDelayCheckCounter2 = 0; int snareReverbDelayCheckCounter3 = 0; int snareReverbDelayCheckCounter4 = 0; int snareReverbDelayCheckCounter5 = 0; int snareReverbDelayCheckCounter6 = 0; int snareReverbDelayCheckCounter7 = 0; int snareReverbDelayCheckCounter8 = 0; int snareReverbDelayCheckCounter9 = 0; int snareReverbDelayCheckCounter10 = 0; int snareReverbDelayCheckCounter11 = 0; int snareReverbDelayCheckCounter12 = 0; int snareReverbDelayCheckCounter13 = 0; int snareReverbDelayCheckCounter14 = 0; int snareReverbDelayCheckCounter15 = 0;
    int electronicSnareCheckCounter = 0; int electronicSnareCheckCounter1 = 0; int electronicSnareCheckCounter2 = 0; int electronicSnareCheckCounter3 = 0; int electronicSnareCheckCounter4 = 0; int electronicSnareCheckCounter5 = 0; int electronicSnareCheckCounter6 = 0; int electronicSnareCheckCounter7 = 0; int electronicSnareCheckCounter8 = 0; int electronicSnareCheckCounter9 = 0; int electronicSnareCheckCounter10 = 0; int electronicSnareCheckCounter11 = 0; int electronicSnareCheckCounter12 = 0; int electronicSnareCheckCounter13 = 0; int electronicSnareCheckCounter14 = 0; int electronicSnareCheckCounter15 = 0;
    int electronicSnareReverbCheckCounter = 0; int electronicSnareReverbCheckCounter1 = 0; int electronicSnareReverbCheckCounter2 = 0; int electronicSnareReverbCheckCounter3 = 0; int electronicSnareReverbCheckCounter4 = 0; int electronicSnareReverbCheckCounter5 = 0; int electronicSnareReverbCheckCounter6 = 0; int electronicSnareReverbCheckCounter7 = 0; int electronicSnareReverbCheckCounter8 = 0; int electronicSnareReverbCheckCounter9 = 0; int electronicSnareReverbCheckCounter10 = 0; int electronicSnareReverbCheckCounter11 = 0; int electronicSnareReverbCheckCounter12 = 0; int electronicSnareReverbCheckCounter13 = 0; int electronicSnareReverbCheckCounter14 = 0; int electronicSnareReverbCheckCounter15 = 0;
    int electronicSnareDelayCheckCounter = 0; int electronicSnareDelayCheckCounter1 = 0; int electronicSnareDelayCheckCounter2 = 0; int electronicSnareDelayCheckCounter3 = 0; int electronicSnareDelayCheckCounter4 = 0; int electronicSnareDelayCheckCounter5 = 0; int electronicSnareDelayCheckCounter6 = 0; int electronicSnareDelayCheckCounter7 = 0; int electronicSnareDelayCheckCounter8 = 0; int electronicSnareDelayCheckCounter9 = 0; int electronicSnareDelayCheckCounter10 = 0; int electronicSnareDelayCheckCounter11 = 0; int electronicSnareDelayCheckCounter12 = 0; int electronicSnareDelayCheckCounter13 = 0; int electronicSnareDelayCheckCounter14 = 0; int electronicSnareDelayCheckCounter15 = 0;
    int electronicSnareReverbDelayCheckCounter = 0; int electronicSnareReverbDelayCheckCounter1 = 0; int electronicSnareReverbDelayCheckCounter2 = 0; int electronicSnareReverbDelayCheckCounter3 = 0; int electronicSnareReverbDelayCheckCounter4 = 0; int electronicSnareReverbDelayCheckCounter5 = 0; int electronicSnareReverbDelayCheckCounter6 = 0; int electronicSnareReverbDelayCheckCounter7 = 0; int electronicSnareReverbDelayCheckCounter8 = 0; int electronicSnareReverbDelayCheckCounter9 = 0; int electronicSnareReverbDelayCheckCounter10 = 0; int electronicSnareReverbDelayCheckCounter11 = 0; int electronicSnareReverbDelayCheckCounter12 = 0; int electronicSnareReverbDelayCheckCounter13 = 0; int electronicSnareReverbDelayCheckCounter14 = 0; int electronicSnareReverbDelayCheckCounter15 = 0;

    int hiHatOpenCheckCounter = 0; int hiHatOpenCheckCounter1 = 0; int hiHatOpenCheckCounter2 = 0; int hiHatOpenCheckCounter3 = 0; int hiHatOpenCheckCounter4 = 0; int hiHatOpenCheckCounter5 = 0; int hiHatOpenCheckCounter6 = 0; int hiHatOpenCheckCounter7 = 0; int hiHatOpenCheckCounter8 = 0; int hiHatOpenCheckCounter9 = 0; int hiHatOpenCheckCounter10 = 0; int hiHatOpenCheckCounter11 = 0; int hiHatOpenCheckCounter12 = 0; int hiHatOpenCheckCounter13 = 0; int hiHatOpenCheckCounter14 = 0; int hiHatOpenCheckCounter15 = 0;
    int hiHatOpenReverbCheckCounter = 0; int hiHatOpenReverbCheckCounter1 = 0; int hiHatOpenReverbCheckCounter2 = 0; int hiHatOpenReverbCheckCounter3 = 0; int hiHatOpenReverbCheckCounter4 = 0; int hiHatOpenReverbCheckCounter5 = 0; int hiHatOpenReverbCheckCounter6 = 0; int hiHatOpenReverbCheckCounter7 = 0; int hiHatOpenReverbCheckCounter8 = 0; int hiHatOpenReverbCheckCounter9 = 0; int hiHatOpenReverbCheckCounter10 = 0; int hiHatOpenReverbCheckCounter11 = 0; int hiHatOpenReverbCheckCounter12 = 0; int hiHatOpenReverbCheckCounter13 = 0; int hiHatOpenReverbCheckCounter14 = 0; int hiHatOpenReverbCheckCounter15 = 0;
    int hiHatOpenDelayCheckCounter = 0; int hiHatOpenDelayCheckCounter1 = 0; int hiHatOpenDelayCheckCounter2 = 0; int hiHatOpenDelayCheckCounter3 = 0; int hiHatOpenDelayCheckCounter4 = 0; int hiHatOpenDelayCheckCounter5 = 0; int hiHatOpenDelayCheckCounter6 = 0; int hiHatOpenDelayCheckCounter7 = 0; int hiHatOpenDelayCheckCounter8 = 0; int hiHatOpenDelayCheckCounter9 = 0; int hiHatOpenDelayCheckCounter10 = 0; int hiHatOpenDelayCheckCounter11 = 0; int hiHatOpenDelayCheckCounter12 = 0; int hiHatOpenDelayCheckCounter13 = 0; int hiHatOpenDelayCheckCounter14 = 0; int hiHatOpenDelayCheckCounter15 = 0;
    int hiHatOpenReverbDelayCheckCounter = 0; int hiHatOpenReverbDelayCheckCounter1 = 0; int hiHatOpenReverbDelayCheckCounter2 = 0; int hiHatOpenReverbDelayCheckCounter3 = 0; int hiHatOpenReverbDelayCheckCounter4 = 0; int hiHatOpenReverbDelayCheckCounter5 = 0; int hiHatOpenReverbDelayCheckCounter6 = 0; int hiHatOpenReverbDelayCheckCounter7 = 0; int hiHatOpenReverbDelayCheckCounter8 = 0; int hiHatOpenReverbDelayCheckCounter9 = 0; int hiHatOpenReverbDelayCheckCounter10 = 0; int hiHatOpenReverbDelayCheckCounter11 = 0; int hiHatOpenReverbDelayCheckCounter12 = 0; int hiHatOpenReverbDelayCheckCounter13 = 0; int hiHatOpenReverbDelayCheckCounter14 = 0; int hiHatOpenReverbDelayCheckCounter15 = 0;
    int electronicHiHatOpenCheckCounter = 0; int electronicHiHatOpenCheckCounter1 = 0; int electronicHiHatOpenCheckCounter2 = 0; int electronicHiHatOpenCheckCounter3 = 0; int electronicHiHatOpenCheckCounter4 = 0; int electronicHiHatOpenCheckCounter5 = 0; int electronicHiHatOpenCheckCounter6 = 0; int electronicHiHatOpenCheckCounter7 = 0; int electronicHiHatOpenCheckCounter8 = 0; int electronicHiHatOpenCheckCounter9 = 0; int electronicHiHatOpenCheckCounter10 = 0; int electronicHiHatOpenCheckCounter11 = 0; int electronicHiHatOpenCheckCounter12 = 0; int electronicHiHatOpenCheckCounter13 = 0; int electronicHiHatOpenCheckCounter14 = 0; int electronicHiHatOpenCheckCounter15 = 0;
    int electronicHiHatOpenReverbCheckCounter = 0; int electronicHiHatOpenReverbCheckCounter1 = 0; int electronicHiHatOpenReverbCheckCounter2 = 0; int electronicHiHatOpenReverbCheckCounter3 = 0; int electronicHiHatOpenReverbCheckCounter4 = 0; int electronicHiHatOpenReverbCheckCounter5 = 0; int electronicHiHatOpenReverbCheckCounter6 = 0; int electronicHiHatOpenReverbCheckCounter7 = 0; int electronicHiHatOpenReverbCheckCounter8 = 0; int electronicHiHatOpenReverbCheckCounter9 = 0; int electronicHiHatOpenReverbCheckCounter10 = 0; int electronicHiHatOpenReverbCheckCounter11 = 0; int electronicHiHatOpenReverbCheckCounter12 = 0; int electronicHiHatOpenReverbCheckCounter13 = 0; int electronicHiHatOpenReverbCheckCounter14 = 0; int electronicHiHatOpenReverbCheckCounter15 = 0;
    int electronicHiHatOpenDelayCheckCounter = 0; int electronicHiHatOpenDelayCheckCounter1 = 0; int electronicHiHatOpenDelayCheckCounter2 = 0; int electronicHiHatOpenDelayCheckCounter3 = 0; int electronicHiHatOpenDelayCheckCounter4 = 0; int electronicHiHatOpenDelayCheckCounter5 = 0; int electronicHiHatOpenDelayCheckCounter6 = 0; int electronicHiHatOpenDelayCheckCounter7 = 0; int electronicHiHatOpenDelayCheckCounter8 = 0; int electronicHiHatOpenDelayCheckCounter9 = 0; int electronicHiHatOpenDelayCheckCounter10 = 0; int electronicHiHatOpenDelayCheckCounter11 = 0; int electronicHiHatOpenDelayCheckCounter12 = 0; int electronicHiHatOpenDelayCheckCounter13 = 0; int electronicHiHatOpenDelayCheckCounter14 = 0; int electronicHiHatOpenDelayCheckCounter15 = 0;
    int electronicHiHatOpenReverbDelayCheckCounter = 0; int electronicHiHatOpenReverbDelayCheckCounter1 = 0; int electronicHiHatOpenReverbDelayCheckCounter2 = 0; int electronicHiHatOpenReverbDelayCheckCounter3 = 0; int electronicHiHatOpenReverbDelayCheckCounter4 = 0; int electronicHiHatOpenReverbDelayCheckCounter5 = 0; int electronicHiHatOpenReverbDelayCheckCounter6 = 0; int electronicHiHatOpenReverbDelayCheckCounter7 = 0; int electronicHiHatOpenReverbDelayCheckCounter8 = 0; int electronicHiHatOpenReverbDelayCheckCounter9 = 0; int electronicHiHatOpenReverbDelayCheckCounter10 = 0; int electronicHiHatOpenReverbDelayCheckCounter11 = 0; int electronicHiHatOpenReverbDelayCheckCounter12 = 0; int electronicHiHatOpenReverbDelayCheckCounter13 = 0; int electronicHiHatOpenReverbDelayCheckCounter14 = 0; int electronicHiHatOpenReverbDelayCheckCounter15 = 0;

    int hiHatClosedCheckCounter = 0; int hiHatClosedCheckCounter1 = 0; int hiHatClosedCheckCounter2 = 0; int hiHatClosedCheckCounter3 = 0; int hiHatClosedCheckCounter4 = 0; int hiHatClosedCheckCounter5 = 0; int hiHatClosedCheckCounter6 = 0; int hiHatClosedCheckCounter7 = 0; int hiHatClosedCheckCounter8 = 0; int hiHatClosedCheckCounter9 = 0; int hiHatClosedCheckCounter10 = 0; int hiHatClosedCheckCounter11 = 0; int hiHatClosedCheckCounter12 = 0; int hiHatClosedCheckCounter13 = 0; int hiHatClosedCheckCounter14 = 0; int hiHatClosedCheckCounter15 = 0;
    int hiHatClosedReverbCheckCounter = 0; int hiHatClosedReverbCheckCounter1 = 0; int hiHatClosedReverbCheckCounter2 = 0; int hiHatClosedReverbCheckCounter3 = 0; int hiHatClosedReverbCheckCounter4 = 0; int hiHatClosedReverbCheckCounter5 = 0; int hiHatClosedReverbCheckCounter6 = 0; int hiHatClosedReverbCheckCounter7 = 0; int hiHatClosedReverbCheckCounter8 = 0; int hiHatClosedReverbCheckCounter9 = 0; int hiHatClosedReverbCheckCounter10 = 0; int hiHatClosedReverbCheckCounter11 = 0; int hiHatClosedReverbCheckCounter12 = 0; int hiHatClosedReverbCheckCounter13 = 0; int hiHatClosedReverbCheckCounter14 = 0; int hiHatClosedReverbCheckCounter15 = 0;
    int hiHatClosedDelayCheckCounter = 0; int hiHatClosedDelayCheckCounter1 = 0; int hiHatClosedDelayCheckCounter2 = 0; int hiHatClosedDelayCheckCounter3 = 0; int hiHatClosedDelayCheckCounter4 = 0; int hiHatClosedDelayCheckCounter5 = 0; int hiHatClosedDelayCheckCounter6 = 0; int hiHatClosedDelayCheckCounter7 = 0; int hiHatClosedDelayCheckCounter8 = 0; int hiHatClosedDelayCheckCounter9 = 0; int hiHatClosedDelayCheckCounter10 = 0; int hiHatClosedDelayCheckCounter11 = 0; int hiHatClosedDelayCheckCounter12 = 0; int hiHatClosedDelayCheckCounter13 = 0; int hiHatClosedDelayCheckCounter14 = 0; int hiHatClosedDelayCheckCounter15 = 0;
    int hiHatClosedReverbDelayCheckCounter = 0; int hiHatClosedReverbDelayCheckCounter1 = 0; int hiHatClosedReverbDelayCheckCounter2 = 0; int hiHatClosedReverbDelayCheckCounter3 = 0; int hiHatClosedReverbDelayCheckCounter4 = 0; int hiHatClosedReverbDelayCheckCounter5 = 0; int hiHatClosedReverbDelayCheckCounter6 = 0; int hiHatClosedReverbDelayCheckCounter7 = 0; int hiHatClosedReverbDelayCheckCounter8 = 0; int hiHatClosedReverbDelayCheckCounter9 = 0; int hiHatClosedReverbDelayCheckCounter10 = 0; int hiHatClosedReverbDelayCheckCounter11 = 0; int hiHatClosedReverbDelayCheckCounter12 = 0; int hiHatClosedReverbDelayCheckCounter13 = 0; int hiHatClosedReverbDelayCheckCounter14 = 0; int hiHatClosedReverbDelayCheckCounter15 = 0;
    int electronicHiHatClosedCheckCounter = 0; int electronicHiHatClosedCheckCounter1 = 0; int electronicHiHatClosedCheckCounter2 = 0; int electronicHiHatClosedCheckCounter3 = 0; int electronicHiHatClosedCheckCounter4 = 0; int electronicHiHatClosedCheckCounter5 = 0; int electronicHiHatClosedCheckCounter6 = 0; int electronicHiHatClosedCheckCounter7 = 0; int electronicHiHatClosedCheckCounter8 = 0; int electronicHiHatClosedCheckCounter9 = 0; int electronicHiHatClosedCheckCounter10 = 0; int electronicHiHatClosedCheckCounter11 = 0; int electronicHiHatClosedCheckCounter12 = 0; int electronicHiHatClosedCheckCounter13 = 0; int electronicHiHatClosedCheckCounter14 = 0; int electronicHiHatClosedCheckCounter15 = 0;
    int electronicHiHatClosedReverbCheckCounter = 0; int electronicHiHatClosedReverbCheckCounter1 = 0; int electronicHiHatClosedReverbCheckCounter2 = 0; int electronicHiHatClosedReverbCheckCounter3 = 0; int electronicHiHatClosedReverbCheckCounter4 = 0; int electronicHiHatClosedReverbCheckCounter5 = 0; int electronicHiHatClosedReverbCheckCounter6 = 0; int electronicHiHatClosedReverbCheckCounter7 = 0; int electronicHiHatClosedReverbCheckCounter8 = 0; int electronicHiHatClosedReverbCheckCounter9 = 0; int electronicHiHatClosedReverbCheckCounter10 = 0; int electronicHiHatClosedReverbCheckCounter11 = 0; int electronicHiHatClosedReverbCheckCounter12 = 0; int electronicHiHatClosedReverbCheckCounter13 = 0; int electronicHiHatClosedReverbCheckCounter14 = 0; int electronicHiHatClosedReverbCheckCounter15 = 0;
    int electronicHiHatClosedDelayCheckCounter = 0; int electronicHiHatClosedDelayCheckCounter1 = 0; int electronicHiHatClosedDelayCheckCounter2 = 0; int electronicHiHatClosedDelayCheckCounter3 = 0; int electronicHiHatClosedDelayCheckCounter4 = 0; int electronicHiHatClosedDelayCheckCounter5 = 0; int electronicHiHatClosedDelayCheckCounter6 = 0; int electronicHiHatClosedDelayCheckCounter7 = 0; int electronicHiHatClosedDelayCheckCounter8 = 0; int electronicHiHatClosedDelayCheckCounter9 = 0; int electronicHiHatClosedDelayCheckCounter10 = 0; int electronicHiHatClosedDelayCheckCounter11 = 0; int electronicHiHatClosedDelayCheckCounter12 = 0; int electronicHiHatClosedDelayCheckCounter13 = 0; int electronicHiHatClosedDelayCheckCounter14 = 0; int electronicHiHatClosedDelayCheckCounter15 = 0;
    int electronicHiHatClosedReverbDelayCheckCounter = 0; int electronicHiHatClosedReverbDelayCheckCounter1 = 0; int electronicHiHatClosedReverbDelayCheckCounter2 = 0; int electronicHiHatClosedReverbDelayCheckCounter3 = 0; int electronicHiHatClosedReverbDelayCheckCounter4 = 0; int electronicHiHatClosedReverbDelayCheckCounter5 = 0; int electronicHiHatClosedReverbDelayCheckCounter6 = 0; int electronicHiHatClosedReverbDelayCheckCounter7 = 0; int electronicHiHatClosedReverbDelayCheckCounter8 = 0; int electronicHiHatClosedReverbDelayCheckCounter9 = 0; int electronicHiHatClosedReverbDelayCheckCounter10 = 0; int electronicHiHatClosedReverbDelayCheckCounter11 = 0; int electronicHiHatClosedReverbDelayCheckCounter12 = 0; int electronicHiHatClosedReverbDelayCheckCounter13 = 0; int electronicHiHatClosedReverbDelayCheckCounter14 = 0; int electronicHiHatClosedReverbDelayCheckCounter15 = 0;

    int stickCheckCounter = 0; int stickCheckCounter1 = 0; int stickCheckCounter2 = 0; int stickCheckCounter3 = 0; int stickCheckCounter4 = 0; int stickCheckCounter5 = 0; int stickCheckCounter6 = 0; int stickCheckCounter7 = 0; int stickCheckCounter8 = 0; int stickCheckCounter9 = 0; int stickCheckCounter10 = 0; int stickCheckCounter11 = 0; int stickCheckCounter12 = 0; int stickCheckCounter13 = 0; int stickCheckCounter14 = 0; int stickCheckCounter15 = 0;
    int stickReverbCheckCounter = 0; int stickReverbCheckCounter1 = 0; int stickReverbCheckCounter2 = 0; int stickReverbCheckCounter3 = 0; int stickReverbCheckCounter4 = 0; int stickReverbCheckCounter5 = 0; int stickReverbCheckCounter6 = 0; int stickReverbCheckCounter7 = 0; int stickReverbCheckCounter8 = 0; int stickReverbCheckCounter9 = 0; int stickReverbCheckCounter10 = 0; int stickReverbCheckCounter11 = 0; int stickReverbCheckCounter12 = 0; int stickReverbCheckCounter13 = 0; int stickReverbCheckCounter14 = 0; int stickReverbCheckCounter15 = 0;
    int stickDelayCheckCounter = 0; int stickDelayCheckCounter1 = 0; int stickDelayCheckCounter2 = 0; int stickDelayCheckCounter3 = 0; int stickDelayCheckCounter4 = 0; int stickDelayCheckCounter5 = 0; int stickDelayCheckCounter6 = 0; int stickDelayCheckCounter7 = 0; int stickDelayCheckCounter8 = 0; int stickDelayCheckCounter9 = 0; int stickDelayCheckCounter10 = 0; int stickDelayCheckCounter11 = 0; int stickDelayCheckCounter12 = 0; int stickDelayCheckCounter13 = 0; int stickDelayCheckCounter14 = 0; int stickDelayCheckCounter15 = 0;
    int stickReverbDelayCheckCounter = 0; int stickReverbDelayCheckCounter1 = 0; int stickReverbDelayCheckCounter2 = 0; int stickReverbDelayCheckCounter3 = 0; int stickReverbDelayCheckCounter4 = 0; int stickReverbDelayCheckCounter5 = 0; int stickReverbDelayCheckCounter6 = 0; int stickReverbDelayCheckCounter7 = 0; int stickReverbDelayCheckCounter8 = 0; int stickReverbDelayCheckCounter9 = 0; int stickReverbDelayCheckCounter10 = 0; int stickReverbDelayCheckCounter11 = 0; int stickReverbDelayCheckCounter12 = 0; int stickReverbDelayCheckCounter13 = 0; int stickReverbDelayCheckCounter14 = 0; int stickReverbDelayCheckCounter15 = 0;
    int electronicStickCheckCounter = 0; int electronicStickCheckCounter1 = 0; int electronicStickCheckCounter2 = 0; int electronicStickCheckCounter3 = 0; int electronicStickCheckCounter4 = 0; int electronicStickCheckCounter5 = 0; int electronicStickCheckCounter6 = 0; int electronicStickCheckCounter7 = 0; int electronicStickCheckCounter8 = 0; int electronicStickCheckCounter9 = 0; int electronicStickCheckCounter10 = 0; int electronicStickCheckCounter11 = 0; int electronicStickCheckCounter12 = 0; int electronicStickCheckCounter13 = 0; int electronicStickCheckCounter14 = 0; int electronicStickCheckCounter15 = 0;
    int electronicStickReverbCheckCounter = 0; int electronicStickReverbCheckCounter1 = 0; int electronicStickReverbCheckCounter2 = 0; int electronicStickReverbCheckCounter3 = 0; int electronicStickReverbCheckCounter4 = 0; int electronicStickReverbCheckCounter5 = 0; int electronicStickReverbCheckCounter6 = 0; int electronicStickReverbCheckCounter7 = 0; int electronicStickReverbCheckCounter8 = 0; int electronicStickReverbCheckCounter9 = 0; int electronicStickReverbCheckCounter10 = 0; int electronicStickReverbCheckCounter11 = 0; int electronicStickReverbCheckCounter12 = 0; int electronicStickReverbCheckCounter13 = 0; int electronicStickReverbCheckCounter14 = 0; int electronicStickReverbCheckCounter15 = 0;
    int electronicStickDelayCheckCounter = 0; int electronicStickDelayCheckCounter1 = 0; int electronicStickDelayCheckCounter2 = 0; int electronicStickDelayCheckCounter3 = 0; int electronicStickDelayCheckCounter4 = 0; int electronicStickDelayCheckCounter5 = 0; int electronicStickDelayCheckCounter6 = 0; int electronicStickDelayCheckCounter7 = 0; int electronicStickDelayCheckCounter8 = 0; int electronicStickDelayCheckCounter9 = 0; int electronicStickDelayCheckCounter10 = 0; int electronicStickDelayCheckCounter11 = 0; int electronicStickDelayCheckCounter12 = 0; int electronicStickDelayCheckCounter13 = 0; int electronicStickDelayCheckCounter14 = 0; int electronicStickDelayCheckCounter15 = 0;
    int electronicStickReverbDelayCheckCounter = 0; int electronicStickReverbDelayCheckCounter1 = 0; int electronicStickReverbDelayCheckCounter2 = 0; int electronicStickReverbDelayCheckCounter3 = 0; int electronicStickReverbDelayCheckCounter4 = 0; int electronicStickReverbDelayCheckCounter5 = 0; int electronicStickReverbDelayCheckCounter6 = 0; int electronicStickReverbDelayCheckCounter7 = 0; int electronicStickReverbDelayCheckCounter8 = 0; int electronicStickReverbDelayCheckCounter9 = 0; int electronicStickReverbDelayCheckCounter10 = 0; int electronicStickReverbDelayCheckCounter11 = 0; int electronicStickReverbDelayCheckCounter12 = 0; int electronicStickReverbDelayCheckCounter13 = 0; int electronicStickReverbDelayCheckCounter14 = 0; int electronicStickReverbDelayCheckCounter15 = 0;

    int bellCheckCounter = 0; int bellCheckCounter1 = 0; int bellCheckCounter2 = 0; int bellCheckCounter3 = 0; int bellCheckCounter4 = 0; int bellCheckCounter5 = 0; int bellCheckCounter6 = 0; int bellCheckCounter7 = 0; int bellCheckCounter8 = 0; int bellCheckCounter9 = 0; int bellCheckCounter10 = 0; int bellCheckCounter11 = 0; int bellCheckCounter12 = 0; int bellCheckCounter13 = 0; int bellCheckCounter14 = 0; int bellCheckCounter15 = 0;
    int bellReverbCheckCounter = 0; int bellReverbCheckCounter1 = 0; int bellReverbCheckCounter2 = 0; int bellReverbCheckCounter3 = 0; int bellReverbCheckCounter4 = 0; int bellReverbCheckCounter5 = 0; int bellReverbCheckCounter6 = 0; int bellReverbCheckCounter7 = 0; int bellReverbCheckCounter8 = 0; int bellReverbCheckCounter9 = 0; int bellReverbCheckCounter10 = 0; int bellReverbCheckCounter11 = 0; int bellReverbCheckCounter12 = 0; int bellReverbCheckCounter13 = 0; int bellReverbCheckCounter14 = 0; int bellReverbCheckCounter15 = 0;
    int bellDelayCheckCounter = 0; int bellDelayCheckCounter1 = 0; int bellDelayCheckCounter2 = 0; int bellDelayCheckCounter3 = 0; int bellDelayCheckCounter4 = 0; int bellDelayCheckCounter5 = 0; int bellDelayCheckCounter6 = 0; int bellDelayCheckCounter7 = 0; int bellDelayCheckCounter8 = 0; int bellDelayCheckCounter9 = 0; int bellDelayCheckCounter10 = 0; int bellDelayCheckCounter11 = 0; int bellDelayCheckCounter12 = 0; int bellDelayCheckCounter13 = 0; int bellDelayCheckCounter14 = 0; int bellDelayCheckCounter15 = 0;
    int bellReverbDelayCheckCounter = 0; int bellReverbDelayCheckCounter1 = 0; int bellReverbDelayCheckCounter2 = 0; int bellReverbDelayCheckCounter3 = 0; int bellReverbDelayCheckCounter4 = 0; int bellReverbDelayCheckCounter5 = 0; int bellReverbDelayCheckCounter6 = 0; int bellReverbDelayCheckCounter7 = 0; int bellReverbDelayCheckCounter8 = 0; int bellReverbDelayCheckCounter9 = 0; int bellReverbDelayCheckCounter10 = 0; int bellReverbDelayCheckCounter11 = 0; int bellReverbDelayCheckCounter12 = 0; int bellReverbDelayCheckCounter13 = 0; int bellReverbDelayCheckCounter14 = 0; int bellReverbDelayCheckCounter15 = 0;
    int electronicBellCheckCounter = 0; int electronicBellCheckCounter1 = 0; int electronicBellCheckCounter2 = 0; int electronicBellCheckCounter3 = 0; int electronicBellCheckCounter4 = 0; int electronicBellCheckCounter5 = 0; int electronicBellCheckCounter6 = 0; int electronicBellCheckCounter7 = 0; int electronicBellCheckCounter8 = 0; int electronicBellCheckCounter9 = 0; int electronicBellCheckCounter10 = 0; int electronicBellCheckCounter11 = 0; int electronicBellCheckCounter12 = 0; int electronicBellCheckCounter13 = 0; int electronicBellCheckCounter14 = 0; int electronicBellCheckCounter15 = 0;
    int electronicBellReverbCheckCounter = 0; int electronicBellReverbCheckCounter1 = 0; int electronicBellReverbCheckCounter2 = 0; int electronicBellReverbCheckCounter3 = 0; int electronicBellReverbCheckCounter4 = 0; int electronicBellReverbCheckCounter5 = 0; int electronicBellReverbCheckCounter6 = 0; int electronicBellReverbCheckCounter7 = 0; int electronicBellReverbCheckCounter8 = 0; int electronicBellReverbCheckCounter9 = 0; int electronicBellReverbCheckCounter10 = 0; int electronicBellReverbCheckCounter11 = 0; int electronicBellReverbCheckCounter12 = 0; int electronicBellReverbCheckCounter13 = 0; int electronicBellReverbCheckCounter14 = 0; int electronicBellReverbCheckCounter15 = 0;
    int electronicBellDelayCheckCounter = 0; int electronicBellDelayCheckCounter1 = 0; int electronicBellDelayCheckCounter2 = 0; int electronicBellDelayCheckCounter3 = 0; int electronicBellDelayCheckCounter4 = 0; int electronicBellDelayCheckCounter5 = 0; int electronicBellDelayCheckCounter6 = 0; int electronicBellDelayCheckCounter7 = 0; int electronicBellDelayCheckCounter8 = 0; int electronicBellDelayCheckCounter9 = 0; int electronicBellDelayCheckCounter10 = 0; int electronicBellDelayCheckCounter11 = 0; int electronicBellDelayCheckCounter12 = 0; int electronicBellDelayCheckCounter13 = 0; int electronicBellDelayCheckCounter14 = 0; int electronicBellDelayCheckCounter15 = 0;
    int electronicBellReverbDelayCheckCounter = 0; int electronicBellReverbDelayCheckCounter1 = 0; int electronicBellReverbDelayCheckCounter2 = 0; int electronicBellReverbDelayCheckCounter3 = 0; int electronicBellReverbDelayCheckCounter4 = 0; int electronicBellReverbDelayCheckCounter5 = 0; int electronicBellReverbDelayCheckCounter6 = 0; int electronicBellReverbDelayCheckCounter7 = 0; int electronicBellReverbDelayCheckCounter8 = 0; int electronicBellReverbDelayCheckCounter9 = 0; int electronicBellReverbDelayCheckCounter10 = 0; int electronicBellReverbDelayCheckCounter11 = 0; int electronicBellReverbDelayCheckCounter12 = 0; int electronicBellReverbDelayCheckCounter13 = 0; int electronicBellReverbDelayCheckCounter14 = 0; int electronicBellReverbDelayCheckCounter15 = 0;

    int crashCheckCounter = 0; int crashCheckCounter1 = 0; int crashCheckCounter2 = 0; int crashCheckCounter3 = 0; int crashCheckCounter4 = 0; int crashCheckCounter5 = 0; int crashCheckCounter6 = 0; int crashCheckCounter7 = 0; int crashCheckCounter8 = 0; int crashCheckCounter9 = 0; int crashCheckCounter10 = 0; int crashCheckCounter11 = 0; int crashCheckCounter12 = 0; int crashCheckCounter13 = 0; int crashCheckCounter14 = 0; int crashCheckCounter15 = 0;
    int crashReverbCheckCounter = 0; int crashReverbCheckCounter1 = 0; int crashReverbCheckCounter2 = 0; int crashReverbCheckCounter3 = 0; int crashReverbCheckCounter4 = 0; int crashReverbCheckCounter5 = 0; int crashReverbCheckCounter6 = 0; int crashReverbCheckCounter7 = 0; int crashReverbCheckCounter8 = 0; int crashReverbCheckCounter9 = 0; int crashReverbCheckCounter10 = 0; int crashReverbCheckCounter11 = 0; int crashReverbCheckCounter12 = 0; int crashReverbCheckCounter13 = 0; int crashReverbCheckCounter14 = 0; int crashReverbCheckCounter15 = 0;
    int crashDelayCheckCounter = 0; int crashDelayCheckCounter1 = 0; int crashDelayCheckCounter2 = 0; int crashDelayCheckCounter3 = 0; int crashDelayCheckCounter4 = 0; int crashDelayCheckCounter5 = 0; int crashDelayCheckCounter6 = 0; int crashDelayCheckCounter7 = 0; int crashDelayCheckCounter8 = 0; int crashDelayCheckCounter9 = 0; int crashDelayCheckCounter10 = 0; int crashDelayCheckCounter11 = 0; int crashDelayCheckCounter12 = 0; int crashDelayCheckCounter13 = 0; int crashDelayCheckCounter14 = 0; int crashDelayCheckCounter15 = 0;
    int crashReverbDelayCheckCounter = 0; int crashReverbDelayCheckCounter1 = 0; int crashReverbDelayCheckCounter2 = 0; int crashReverbDelayCheckCounter3 = 0; int crashReverbDelayCheckCounter4 = 0; int crashReverbDelayCheckCounter5 = 0; int crashReverbDelayCheckCounter6 = 0; int crashReverbDelayCheckCounter7 = 0; int crashReverbDelayCheckCounter8 = 0; int crashReverbDelayCheckCounter9 = 0; int crashReverbDelayCheckCounter10 = 0; int crashReverbDelayCheckCounter11 = 0; int crashReverbDelayCheckCounter12 = 0; int crashReverbDelayCheckCounter13 = 0; int crashReverbDelayCheckCounter14 = 0; int crashReverbDelayCheckCounter15 = 0;
    int electronicCrashCheckCounter = 0; int electronicCrashCheckCounter1 = 0; int electronicCrashCheckCounter2 = 0; int electronicCrashCheckCounter3 = 0; int electronicCrashCheckCounter4 = 0; int electronicCrashCheckCounter5 = 0; int electronicCrashCheckCounter6 = 0; int electronicCrashCheckCounter7 = 0; int electronicCrashCheckCounter8 = 0; int electronicCrashCheckCounter9 = 0; int electronicCrashCheckCounter10 = 0; int electronicCrashCheckCounter11 = 0; int electronicCrashCheckCounter12 = 0; int electronicCrashCheckCounter13 = 0; int electronicCrashCheckCounter14 = 0; int electronicCrashCheckCounter15 = 0;
    int electronicCrashReverbCheckCounter = 0; int electronicCrashReverbCheckCounter1 = 0; int electronicCrashReverbCheckCounter2 = 0; int electronicCrashReverbCheckCounter3 = 0; int electronicCrashReverbCheckCounter4 = 0; int electronicCrashReverbCheckCounter5 = 0; int electronicCrashReverbCheckCounter6 = 0; int electronicCrashReverbCheckCounter7 = 0; int electronicCrashReverbCheckCounter8 = 0; int electronicCrashReverbCheckCounter9 = 0; int electronicCrashReverbCheckCounter10 = 0; int electronicCrashReverbCheckCounter11 = 0; int electronicCrashReverbCheckCounter12 = 0; int electronicCrashReverbCheckCounter13 = 0; int electronicCrashReverbCheckCounter14 = 0; int electronicCrashReverbCheckCounter15 = 0;
    int electronicCrashDelayCheckCounter = 0; int electronicCrashDelayCheckCounter1 = 0; int electronicCrashDelayCheckCounter2 = 0; int electronicCrashDelayCheckCounter3 = 0; int electronicCrashDelayCheckCounter4 = 0; int electronicCrashDelayCheckCounter5 = 0; int electronicCrashDelayCheckCounter6 = 0; int electronicCrashDelayCheckCounter7 = 0; int electronicCrashDelayCheckCounter8 = 0; int electronicCrashDelayCheckCounter9 = 0; int electronicCrashDelayCheckCounter10 = 0; int electronicCrashDelayCheckCounter11 = 0; int electronicCrashDelayCheckCounter12 = 0; int electronicCrashDelayCheckCounter13 = 0; int electronicCrashDelayCheckCounter14 = 0; int electronicCrashDelayCheckCounter15 = 0;
    int electronicCrashReverbDelayCheckCounter = 0; int electronicCrashReverbDelayCheckCounter1 = 0; int electronicCrashReverbDelayCheckCounter2 = 0; int electronicCrashReverbDelayCheckCounter3 = 0; int electronicCrashReverbDelayCheckCounter4 = 0; int electronicCrashReverbDelayCheckCounter5 = 0; int electronicCrashReverbDelayCheckCounter6 = 0; int electronicCrashReverbDelayCheckCounter7 = 0; int electronicCrashReverbDelayCheckCounter8 = 0; int electronicCrashReverbDelayCheckCounter9 = 0; int electronicCrashReverbDelayCheckCounter10 = 0; int electronicCrashReverbDelayCheckCounter11 = 0; int electronicCrashReverbDelayCheckCounter12 = 0; int electronicCrashReverbDelayCheckCounter13 = 0; int electronicCrashReverbDelayCheckCounter14 = 0; int electronicCrashReverbDelayCheckCounter15 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sp = new SoundPool(250, AudioManager.STREAM_MUSIC, 0);

        crash = sp.load(getApplicationContext(), R.raw.cymbal4, 1);
        bell = sp.load(getApplicationContext(), R.raw.bell1, 1);
        stick = sp.load(getApplicationContext(), R.raw.stick1, 1);
        kick = sp.load(getApplicationContext(), R.raw.kick1, 1);
        hihatopen = sp.load(getApplicationContext(), R.raw.hihatopen1, 1);
        snare = sp.load(getApplicationContext(), R.raw.snare1, 1);
        hihatclosed = sp.load(getApplicationContext(), R.raw.hihatclosed1, 1);

        electroniccrash = sp.load(getApplicationContext(), R.raw.electroniccymbal, 1);
        electronicbell = sp.load(getApplicationContext(), R.raw.electronicbell, 1);
        electronicstick = sp.load(getApplicationContext(), R.raw.electronicstick, 1);
        electronickick = sp.load(getApplicationContext(), R.raw.electronickick, 1);
        electronichihatopen = sp.load(getApplicationContext(), R.raw.electronichihatopen, 1);
        electronicsnare = sp.load(getApplicationContext(), R.raw.electronicsnare, 1);
        electronichihatclosed = sp.load(getApplicationContext(), R.raw.electronichihatclosed, 1);

        crashsequencer = sp.load(getApplicationContext(), R.raw.cymbal4sequencer, 1);
        bellsequencer = sp.load(getApplicationContext(), R.raw.bell1sequencer, 1);
        sticksequencer = sp.load(getApplicationContext(), R.raw.stick1sequencer, 1);
        kicksequencer = sp.load(getApplicationContext(), R.raw.kick1sequencer, 1);
        hihatopensequencer = sp.load(getApplicationContext(), R.raw.hihatopen1sequencer, 1);
        snaresequencer = sp.load(getApplicationContext(), R.raw.snare1sequencer, 1);
        hihatclosedsequencer = sp.load(getApplicationContext(), R.raw.hihatclosed1sequencer, 1);

        electroniccrashsequencer = sp.load(getApplicationContext(), R.raw.electroniccymbalsequencer, 1);
        electronicbellsequencer = sp.load(getApplicationContext(), R.raw.electronicbellsequencer, 1);
        electronicsticksequencer = sp.load(getApplicationContext(), R.raw.electronicsticksequencer, 1);
        electronickicksequencer = sp.load(getApplicationContext(), R.raw.electronickicksequencer, 1);
        electronichihatopensequencer = sp.load(getApplicationContext(), R.raw.electronichihatopensequencer, 1);
        electronicsnaresequencer = sp.load(getApplicationContext(), R.raw.electronicsnaresequencer, 1);
        electronichihatclosedsequencer = sp.load(getApplicationContext(), R.raw.electronichihatclosedsequencer, 1);

        crashreverb = sp.load(getApplicationContext(), R.raw.cymbalreverb, 1);
        bellreverb = sp.load(getApplicationContext(), R.raw.bellreverb, 1);
        stickreverb = sp.load(getApplicationContext(), R.raw.stickreverb, 1);
        kickreverb = sp.load(getApplicationContext(), R.raw.kickreverb, 1);
        hihatopenreverb = sp.load(getApplicationContext(), R.raw.hihatopenreverb, 1);
        snarereverb = sp.load(getApplicationContext(), R.raw.snarereverb, 1);
        hihatclosedreverb = sp.load(getApplicationContext(), R.raw.hihatclosedreverb, 1);

        electroniccrashreverb = sp.load(getApplicationContext(), R.raw.electroniccymbalreverb, 1);
        electronicbellreverb = sp.load(getApplicationContext(), R.raw.electronicbellreverb, 1);
        electronicstickreverb = sp.load(getApplicationContext(), R.raw.electronicstickreverb, 1);
        electronickickreverb = sp.load(getApplicationContext(), R.raw.electronickickreverb, 1);
        electronichihatopenreverb = sp.load(getApplicationContext(), R.raw.electronichihatopenreverb, 1);
        electronicsnarereverb = sp.load(getApplicationContext(), R.raw.electronicsnarereverb, 1);
        electronichihatclosedreverb = sp.load(getApplicationContext(), R.raw.electronichihatclosedreverb, 1);


        crashdelay = sp.load(getApplicationContext(), R.raw.cymbaldelay, 1);
        belldelay = sp.load(getApplicationContext(), R.raw.belldelay, 1);
        stickdelay = sp.load(getApplicationContext(), R.raw.stickdelay, 1);
        kickdelay = sp.load(getApplicationContext(), R.raw.kickdelay, 1);
        hihatopendelay = sp.load(getApplicationContext(), R.raw.hihatopendelay, 1);
        snaredelay = sp.load(getApplicationContext(), R.raw.snaredelay, 1);
        hihatcloseddelay = sp.load(getApplicationContext(), R.raw.hihatcloseddelay, 1);

        electroniccrashdelay = sp.load(getApplicationContext(), R.raw.electroniccymbaldelay, 1);
        electronicbelldelay = sp.load(getApplicationContext(), R.raw.electronicbelldelay, 1);
        electronicstickdelay = sp.load(getApplicationContext(), R.raw.electronicstickdelay, 1);
        electronickickdelay = sp.load(getApplicationContext(), R.raw.electronickickdelay, 1);
        electronichihatopendelay = sp.load(getApplicationContext(), R.raw.electronichihatopendelay, 1);
        electronicsnaredelay = sp.load(getApplicationContext(), R.raw.electronicsnaredelay, 1);
        electronichihatcloseddelay = sp.load(getApplicationContext(), R.raw.electronichihatcloseddelay, 1);

        crashreverbdelay = sp.load(getApplicationContext(), R.raw.cymbalreverbdelay, 1);
        bellreverbdelay = sp.load(getApplicationContext(), R.raw.bellreverbdelay, 1);
        stickreverbdelay = sp.load(getApplicationContext(), R.raw.stickreverbdelay, 1);
        kickreverbdelay = sp.load(getApplicationContext(), R.raw.kickreverbdelay, 1);
        hihatopenreverbdelay = sp.load(getApplicationContext(), R.raw.hihatopenreverbdelay, 1);
        snarereverbdelay = sp.load(getApplicationContext(), R.raw.snarereverbdelay, 1);
        hihatclosedreverbdelay = sp.load(getApplicationContext(), R.raw.hihatclosedreverbdelay, 1);

        electroniccrashreverbdelay = sp.load(getApplicationContext(), R.raw.electroniccymbalreverbdelay, 1);
        electronicbellreverbdelay = sp.load(getApplicationContext(), R.raw.electronicbellreverbdelay, 1);
        electronicstickreverbdelay = sp.load(getApplicationContext(), R.raw.electronicstickreverbdelay, 1);
        electronickickreverbdelay = sp.load(getApplicationContext(), R.raw.electronickickreverbdelay, 1);
        electronichihatopenreverbdelay = sp.load(getApplicationContext(), R.raw.electronichihatopenreverbdelay, 1);
        electronicsnarereverbdelay = sp.load(getApplicationContext(), R.raw.electronicsnarereverbdelay, 1);
        electronichihatclosedreverbdelay = sp.load(getApplicationContext(), R.raw.electronichihatclosedreverbdelay, 1);

        metronomeFirstBar = sp.load(getApplicationContext(), R.raw.metronomefirstbar, 1);
        metronomeSecondThirdFourthBar = sp.load(getApplicationContext(), R.raw.metronomesecondthirdfourthbar, 1);

        myViewRefRedCircle = findViewById(R.id.theRedCircle);
        myViewRefRedCircle.setOnClickListener(this);

        myImageButtonViewRefDrums = findViewById(R.id.imageButtonDrums);
        myImageButtonViewRefDrums.setOnClickListener(this);

        myImageButtonViewRefGuitar = findViewById(R.id.imageButtonGuitar);
        myImageButtonViewRefGuitar.setOnClickListener(this);

        myImageButtonViewRefPiano = findViewById(R.id.imageButtonPiano);
        myImageButtonViewRefPiano.setOnClickListener(this);

        myImageButtonViewRefSequencer = findViewById(R.id.imageButtonSequencer);
        myImageButtonViewRefSequencer.setOnClickListener(this);

        myImageButtonViewRefStop = findViewById(R.id.imageButtonStop);
        myImageButtonViewRefStop.setOnClickListener(this);

        myImageButtonViewRefReset = findViewById(R.id.imageButtonReset);
        myImageButtonViewRefReset.setOnClickListener(this);

        myButtonViewRefDrumReverb = findViewById(R.id.drumReverb);
        myButtonViewRefDrumReverb.setOnClickListener(this);

        myButtonViewRefDrumDelay = findViewById(R.id.drumDelay);
        myButtonViewRefDrumDelay.setOnClickListener(this);

        buttonKick = findViewById(R.id.kickid);
        buttonKick.setOnTouchListener(this);

        buttonSnare = findViewById(R.id.snareid);
        buttonSnare.setOnTouchListener(this);

        buttonHiHatOpen = findViewById(R.id.hihatopenid);
        buttonHiHatOpen.setOnTouchListener(this);

        buttonHiHatClosed = findViewById(R.id.hihatclosedid);
        buttonHiHatClosed.setOnTouchListener(this);

        buttonBell = findViewById(R.id.bellid);
        buttonBell.setOnTouchListener(this);

        buttonStick = findViewById(R.id.sidestickid);
        buttonStick.setOnTouchListener(this);

        buttonCymbal = findViewById(R.id.crashid);
        buttonCymbal.setOnTouchListener(this);

        Switch1 = (Switch) findViewById(R.id.switch1);

        myButtonViewRefVolumeControl = findViewById(R.id.buttonVolume);
        myButtonViewRefVolumeControl.setOnClickListener(this);

        seekBar = findViewById(R.id.seekBar);
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        maxvolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        currentvolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        seekBar.setMax(maxvolume);
        seekBar.setProgress(currentvolume);

        seekBarKick = findViewById(R.id.seekBarKick);
        seekBarSnare = findViewById(R.id.seekBarSnare);
        seekBarHiHatOpen = findViewById(R.id.seekBarHiHatOpen);
        seekBarHiHatClosed = findViewById(R.id.seekBarHiHatClosed);
        seekBarStick = findViewById(R.id.seekBarStick);
        seekBarBell = findViewById(R.id.seekBarBell);
        seekBarCrash = findViewById(R.id.seekBarCrash);

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
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

        seekBarKick.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValueKick = seekBarKick.getProgress();
                progressChangedValueKick = progressChangedValueKick /10;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Seek bar progress is :" + progressChangedValueKick,
                        Toast.LENGTH_SHORT).show();
            }
        });

        seekBarSnare.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValueSnare = seekBarSnare.getProgress();
                progressChangedValueSnare = progressChangedValueSnare /10;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Seek bar progress is :" + progressChangedValueSnare,
                        Toast.LENGTH_SHORT).show();
            }
        });

        seekBarHiHatOpen.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValueHiHatOpen = seekBarHiHatOpen.getProgress();
                progressChangedValueHiHatOpen = progressChangedValueHiHatOpen /10;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Seek bar progress is :" + progressChangedValueHiHatOpen,
                        Toast.LENGTH_SHORT).show();
            }
        });

        seekBarHiHatClosed.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValueHiHatClosed = seekBarHiHatClosed.getProgress();
                progressChangedValueHiHatClosed = progressChangedValueHiHatClosed /10;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Seek bar progress is :" + progressChangedValueHiHatClosed,
                        Toast.LENGTH_SHORT).show();
            }
        });

        seekBarStick.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValueStick = seekBarStick.getProgress();
                progressChangedValueStick = progressChangedValueStick /10;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Seek bar progress is :" + progressChangedValueStick,
                        Toast.LENGTH_SHORT).show();
            }
        });

        seekBarBell.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValueBell = seekBarBell.getProgress();
                progressChangedValueBell = progressChangedValueBell /10;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Seek bar progress is :" + progressChangedValueBell,
                        Toast.LENGTH_SHORT).show();
            }
        });

        seekBarCrash.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValueCrash = seekBarCrash.getProgress();
                progressChangedValueCrash = progressChangedValueCrash /10;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity.this, "Seek bar progress is :" + progressChangedValueCrash,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View view) {
        PopupMenu popupMenu = new PopupMenu(MainActivity.this, myButtonViewRefVolumeControl);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu, popupMenu.getMenu());

        switch (view.getId()) { //checks which button is pressed

            case R.id.imageButtonDrums: //if the nextPage button is pressed
            {
                Intent intent = new Intent(this, MainActivity.class); //creates a new intent
                sp.release();
                startActivityForResult(intent, APP2_REQUEST); //starts activity, effectively transfers from MainActivity.java to MainActivity2.java
                break; //break statement
            }

            case R.id.imageButtonGuitar: //if the nextPage button is pressed
            {
                Intent intent = new Intent(this, MainActivity2.class); //creates a new intent
                sp.release();
                startActivityForResult(intent, APP2_REQUEST); //starts activity, effectively transfers from MainActivity.java to MainActivity2.java
                break; //break statement
            }

            case R.id.imageButtonPiano: //if the nextPage button is pressed
            {
                Intent intent = new Intent(this, MainActivity3.class); //creates a new intent
                sp.release();
                startActivityForResult(intent, APP2_REQUEST); //starts activity, effectively transfers from MainActivity.java to MainActivity2.java
                break; //break statement
            }

            case R.id.buttonVolume: //if the nextPage button is pressed
            {
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        // Toast message on menu item clicked
                        Toast.makeText(MainActivity.this, "Volume Control for " + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                        if(menuItem.getTitle().equals("Total Volume")) {
                            seekBar.setVisibility(View.VISIBLE);
                            seekBarKick.setVisibility(View.INVISIBLE);
                            seekBarSnare.setVisibility(View.INVISIBLE);
                            seekBarHiHatOpen.setVisibility(View.INVISIBLE);
                            seekBarHiHatClosed.setVisibility(View.INVISIBLE);
                            seekBarStick.setVisibility(View.INVISIBLE);
                            seekBarBell.setVisibility(View.INVISIBLE);
                            seekBarCrash.setVisibility(View.INVISIBLE);
                        }
                        if(menuItem.getTitle().equals("Kick")) {
                            seekBar.setVisibility(View.INVISIBLE);
                            seekBarKick.setVisibility(View.VISIBLE);
                            seekBarSnare.setVisibility(View.INVISIBLE);
                            seekBarHiHatOpen.setVisibility(View.INVISIBLE);
                            seekBarHiHatClosed.setVisibility(View.INVISIBLE);
                            seekBarStick.setVisibility(View.INVISIBLE);
                            seekBarBell.setVisibility(View.INVISIBLE);
                            seekBarCrash.setVisibility(View.INVISIBLE);
                        }
                        if(menuItem.getTitle().equals("Snare")) {
                            seekBar.setVisibility(View.INVISIBLE);
                            seekBarKick.setVisibility(View.INVISIBLE);
                            seekBarSnare.setVisibility(View.VISIBLE);
                            seekBarHiHatOpen.setVisibility(View.INVISIBLE);
                            seekBarHiHatClosed.setVisibility(View.INVISIBLE);
                            seekBarStick.setVisibility(View.INVISIBLE);
                            seekBarBell.setVisibility(View.INVISIBLE);
                            seekBarCrash.setVisibility(View.INVISIBLE);
                        }
                        if(menuItem.getTitle().equals("Hi-Hat Open")) {
                            seekBar.setVisibility(View.INVISIBLE);
                            seekBarKick.setVisibility(View.INVISIBLE);
                            seekBarSnare.setVisibility(View.INVISIBLE);
                            seekBarHiHatOpen.setVisibility(View.VISIBLE);
                            seekBarHiHatClosed.setVisibility(View.INVISIBLE);
                            seekBarStick.setVisibility(View.INVISIBLE);
                            seekBarBell.setVisibility(View.INVISIBLE);
                            seekBarCrash.setVisibility(View.INVISIBLE);
                        }
                        if(menuItem.getTitle().equals("Hi-Hat Closed")) {
                            seekBar.setVisibility(View.INVISIBLE);
                            seekBarKick.setVisibility(View.INVISIBLE);
                            seekBarSnare.setVisibility(View.INVISIBLE);
                            seekBarHiHatOpen.setVisibility(View.INVISIBLE);
                            seekBarHiHatClosed.setVisibility(View.VISIBLE);
                            seekBarStick.setVisibility(View.INVISIBLE);
                            seekBarBell.setVisibility(View.INVISIBLE);
                            seekBarCrash.setVisibility(View.INVISIBLE);
                        }
                        if(menuItem.getTitle().equals("Side-Stick")) {
                            seekBar.setVisibility(View.INVISIBLE);
                            seekBarKick.setVisibility(View.INVISIBLE);
                            seekBarSnare.setVisibility(View.INVISIBLE);
                            seekBarHiHatOpen.setVisibility(View.INVISIBLE);
                            seekBarHiHatClosed.setVisibility(View.INVISIBLE);
                            seekBarStick.setVisibility(View.VISIBLE);
                            seekBarBell.setVisibility(View.INVISIBLE);
                            seekBarCrash.setVisibility(View.INVISIBLE);
                        }
                        if(menuItem.getTitle().equals("Bell")) {
                            seekBar.setVisibility(View.INVISIBLE);
                            seekBarKick.setVisibility(View.INVISIBLE);
                            seekBarSnare.setVisibility(View.INVISIBLE);
                            seekBarHiHatOpen.setVisibility(View.INVISIBLE);
                            seekBarHiHatClosed.setVisibility(View.INVISIBLE);
                            seekBarStick.setVisibility(View.INVISIBLE);
                            seekBarBell.setVisibility(View.VISIBLE);
                            seekBarCrash.setVisibility(View.INVISIBLE);
                        }
                        if(menuItem.getTitle().equals("Crash")) {
                            seekBar.setVisibility(View.INVISIBLE);
                            seekBarKick.setVisibility(View.INVISIBLE);
                            seekBarSnare.setVisibility(View.INVISIBLE);
                            seekBarHiHatOpen.setVisibility(View.INVISIBLE);
                            seekBarHiHatClosed.setVisibility(View.INVISIBLE);
                            seekBarStick.setVisibility(View.INVISIBLE);
                            seekBarBell.setVisibility(View.INVISIBLE);
                            seekBarCrash.setVisibility(View.VISIBLE);
                        }
                        return true;
                    }
                });
                popupMenu.show();
                break; //break statement
            }

            case R.id.imageButtonSequencer:
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

                if (myImageButtonViewRefSequencer.isPressed() && sequencerCounter==2) {
                    myViewRefRedCircle.setVisibility(View.GONE);
                    sequencerCounter = 0;
                }
                else {
                    myViewRefRedCircle.setVisibility(View.VISIBLE);
                        sequencerCounter = 1;
                        sequencerStartTime = System.currentTimeMillis();
                        if (sequencerBoolean[0][0] == true) {
                            handlerMetronome.postDelayed(new Runnable() {
                                public void run() {
                                    sp.play(metronomeFirstBar, 1.0f, 1.0f, 0, 0, 1.0f);
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
                                    sp.play(metronomeSecondThirdFourthBar, 1.0f, 1.0f, 0, 0, 1.0f);
                                }
                            }, 550);
                        }
                        if (sequencerBoolean[4][0] == true) {
                            handlerMetronome.postDelayed(new Runnable() {
                                public void run() {
                                    sp.play(metronomeSecondThirdFourthBar, 1.0f, 1.0f, 0, 0, 1.0f);
                                }
                            }, 1050);
                        }
                        if (sequencerBoolean[6][0] == true) {
                            handlerMetronome.postDelayed(new Runnable() {
                                public void run() {
                                    sp.play(metronomeSecondThirdFourthBar, 1.0f, 1.0f, 0, 0, 1.0f);
                                }
                            }, 1550);
                        }
                        if (sequencerBoolean[8][0] == true) {
                            handlerMetronome.postDelayed(new Runnable() {
                                public void run() {
                                    sp.play(metronomeFirstBar, 1.0f, 1.0f, 0, 0, 1.0f);
                                }
                            }, 2050);
                        }
                        if (sequencerBoolean[10][0] == true) {
                            handlerMetronome.postDelayed(new Runnable() {
                                public void run() {
                                    sp.play(metronomeSecondThirdFourthBar, 1.0f, 1.0f, 0, 0, 1.0f);
                                }
                            }, 2550);
                        }
                        if (sequencerBoolean[12][0] == true) {
                            handlerMetronome.postDelayed(new Runnable() {
                                public void run() {
                                    sp.play(metronomeSecondThirdFourthBar, 1.0f, 1.0f, 0, 0, 1.0f);
                                }
                            }, 3050);
                        }
                        if (sequencerBoolean[14][0] == true) {
                            handlerMetronome.postDelayed(new Runnable() {
                                public void run() {
                                    sp.play(metronomeSecondThirdFourthBar, 1.0f, 1.0f, 0, 0, 1.0f);
                                }
                            }, 3550);
                        }

                        handlerMetronome.postDelayed(new Runnable() {
                            public void run() {
                                //sp.play(metronomeSecondThirdFourthBar, 1.0f, 1.0f, 0, 0, 1.0f);
                                myViewRefRedCircle.setVisibility(View.GONE);
                                sequencerCounter = 0;
                            }
                        }, 4000);



                }
                break;
            }

            case R.id.drumReverb:
            {
                if (myButtonViewRefDrumReverb.isPressed() && drumReverbCounter==1) {
                    myButtonViewRefDrumReverb.setBackgroundResource(R.drawable.drumreverb);
                    drumReverbCounter = 0; }

                else {
                    myButtonViewRefDrumReverb.setBackgroundResource(R.drawable.drumreverb2);
                    drumReverbCounter = 1; }

                break; //break statement

            }

            case R.id.drumDelay:
            {
                if (myButtonViewRefDrumDelay.isPressed() && drumDelayCounter==1) {
                    myButtonViewRefDrumDelay.setBackgroundResource(R.drawable.drumdelay);
                    drumDelayCounter = 0; }

                else {
                    myButtonViewRefDrumDelay.setBackgroundResource(R.drawable.drumdelay2);
                    drumDelayCounter = 1; }

                break; //break statement

            }

            case R.id.imageButtonReset:
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

                Toast.makeText(MainActivity.this, "Sequencer Reset", Toast.LENGTH_SHORT).show();

                break; //break statement
            }

            case R.id.imageButtonStop: //if the nextPage button is pressed
            {
                if (testVariable == 1) {
                    checkPresses = checkPresses - 1;
                    testVariable = 0;
                    Toast.makeText(MainActivity.this, "Stopped state", Toast.LENGTH_SHORT).show();
                }
                else {
                    checkPresses = checkPresses + 1;
                    testVariable = 1;
                    Toast.makeText(MainActivity.this, "Playback state", Toast.LENGTH_SHORT).show();
                }

                final Handler handler = new Handler();


                if (sequencerCounter == 0 && checkPresses == 1) {
                    //while (sequencerCounter==0) {
                    if (sequencerBoolean[0][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (kickCheckCounter==1) { sp.play(kick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbCheckCounter==1) { sp.play(kickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickDelayCheckCounter==1) { sp.play(kickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbDelayCheckCounter==1) { sp.play(kickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickCheckCounter==1) { sp.play(electronickick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbCheckCounter==1) { sp.play(electronickickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickDelayCheckCounter==1) { sp.play(electronickickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbDelayCheckCounter==1) { sp.play(electronickickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                    if(checkPresses == 0) {
                                        sp.autoPause();
                                    }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (kickCheckCounter1==1) { sp.play(kick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbCheckCounter1==1) { sp.play(kickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickDelayCheckCounter1==1) { sp.play(kickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbDelayCheckCounter1==1) { sp.play(kickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickCheckCounter1==1) { sp.play(electronickick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbCheckCounter1==1) { sp.play(electronickickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickDelayCheckCounter1==1) { sp.play(electronickickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbDelayCheckCounter1==1) { sp.play(electronickickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (kickCheckCounter2==1) { sp.play(kick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbCheckCounter2==1) { sp.play(kickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickDelayCheckCounter2==1) { sp.play(kickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbDelayCheckCounter2==1) { sp.play(kickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickCheckCounter2==1) { sp.play(electronickick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbCheckCounter2==1) { sp.play(electronickickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickDelayCheckCounter2==1) { sp.play(electronickickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbDelayCheckCounter2==1) { sp.play(electronickickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (kickCheckCounter3==1) { sp.play(kick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbCheckCounter3==1) { sp.play(kickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickDelayCheckCounter3==1) { sp.play(kickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbDelayCheckCounter3==1) { sp.play(kickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickCheckCounter3==1) { sp.play(electronickick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbCheckCounter3==1) { sp.play(electronickickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickDelayCheckCounter3==1) { sp.play(electronickickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbDelayCheckCounter3==1) { sp.play(electronickickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (kickCheckCounter4==1) { sp.play(kick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbCheckCounter4==1) { sp.play(kickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickDelayCheckCounter4==1) { sp.play(kickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbDelayCheckCounter4==1) { sp.play(kickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickCheckCounter4==1) { sp.play(electronickick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbCheckCounter4==1) { sp.play(electronickickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickDelayCheckCounter4==1) { sp.play(electronickickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbDelayCheckCounter4==1) { sp.play(electronickickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (kickCheckCounter5==1) { sp.play(kick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbCheckCounter5==1) { sp.play(kickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickDelayCheckCounter5==1) { sp.play(kickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbDelayCheckCounter5==1) { sp.play(kickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickCheckCounter5==1) { sp.play(electronickick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbCheckCounter5==1) { sp.play(electronickickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickDelayCheckCounter5==1) { sp.play(electronickickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbDelayCheckCounter5==1) { sp.play(electronickickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (kickCheckCounter6==1) { sp.play(kick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbCheckCounter6==1) { sp.play(kickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickDelayCheckCounter6==1) { sp.play(kickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbDelayCheckCounter6==1) { sp.play(kickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickCheckCounter6==1) { sp.play(electronickick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbCheckCounter6==1) { sp.play(electronickickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickDelayCheckCounter6==1) { sp.play(electronickickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbDelayCheckCounter6==1) { sp.play(electronickickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (kickCheckCounter7==1) { sp.play(kick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbCheckCounter7==1) { sp.play(kickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickDelayCheckCounter7==1) { sp.play(kickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbDelayCheckCounter7==1) { sp.play(kickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickCheckCounter7==1) { sp.play(electronickick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbCheckCounter7==1) { sp.play(electronickickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickDelayCheckCounter7==1) { sp.play(electronickickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbDelayCheckCounter7==1) { sp.play(electronickickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (kickCheckCounter8==1) { sp.play(kick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbCheckCounter8==1) { sp.play(kickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickDelayCheckCounter8==1) { sp.play(kickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbDelayCheckCounter8==1) { sp.play(kickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickCheckCounter8==1) { sp.play(electronickick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbCheckCounter8==1) { sp.play(electronickickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickDelayCheckCounter8==1) { sp.play(electronickickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbDelayCheckCounter8==1) { sp.play(electronickickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (kickCheckCounter9==1) { sp.play(kick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbCheckCounter9==1) { sp.play(kickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickDelayCheckCounter9==1) { sp.play(kickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbDelayCheckCounter9==1) { sp.play(kickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickCheckCounter9==1) { sp.play(electronickick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbCheckCounter9==1) { sp.play(electronickickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickDelayCheckCounter9==1) { sp.play(electronickickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbDelayCheckCounter9==1) { sp.play(electronickickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (kickCheckCounter10==1) { sp.play(kick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbCheckCounter10==1) { sp.play(kickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickDelayCheckCounter10==1) { sp.play(kickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbDelayCheckCounter10==1) { sp.play(kickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickCheckCounter10==1) { sp.play(electronickick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbCheckCounter10==1) { sp.play(electronickickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickDelayCheckCounter10==1) { sp.play(electronickickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbDelayCheckCounter10==1) { sp.play(electronickickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (kickCheckCounter11==1) { sp.play(kick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbCheckCounter11==1) { sp.play(kickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickDelayCheckCounter11==1) { sp.play(kickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbDelayCheckCounter11==1) { sp.play(kickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickCheckCounter11==1) { sp.play(electronickick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbCheckCounter11==1) { sp.play(electronickickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickDelayCheckCounter11==1) { sp.play(electronickickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbDelayCheckCounter11==1) { sp.play(electronickickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (kickCheckCounter12==1) { sp.play(kick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbCheckCounter12==1) { sp.play(kickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickDelayCheckCounter12==1) { sp.play(kickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbDelayCheckCounter12==1) { sp.play(kickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickCheckCounter12==1) { sp.play(electronickick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbCheckCounter12==1) { sp.play(electronickickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickDelayCheckCounter12==1) { sp.play(electronickickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbDelayCheckCounter12==1) { sp.play(electronickickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (kickCheckCounter13==1) { sp.play(kick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbCheckCounter13==1) { sp.play(kickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickDelayCheckCounter13==1) { sp.play(kickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbDelayCheckCounter13==1) { sp.play(kickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickCheckCounter13==1) { sp.play(electronickick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbCheckCounter13==1) { sp.play(electronickickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickDelayCheckCounter13==1) { sp.play(electronickickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbDelayCheckCounter13==1) { sp.play(electronickickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (kickCheckCounter14==1) { sp.play(kick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbCheckCounter14==1) { sp.play(kickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickDelayCheckCounter14==1) { sp.play(kickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbDelayCheckCounter14==1) { sp.play(kickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickCheckCounter14==1) { sp.play(electronickick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbCheckCounter14==1) { sp.play(electronickickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickDelayCheckCounter14==1) { sp.play(electronickickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbDelayCheckCounter14==1) { sp.play(electronickickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (kickCheckCounter15==1) { sp.play(kick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbCheckCounter15==1) { sp.play(kickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickDelayCheckCounter15==1) { sp.play(kickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (kickReverbDelayCheckCounter15==1) { sp.play(kickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickCheckCounter15==1) { sp.play(electronickick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbCheckCounter15==1) { sp.play(electronickickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickDelayCheckCounter15==1) { sp.play(electronickickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (electronicKickReverbDelayCheckCounter15==1) { sp.play(electronickickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 4000);
                    }
                    //break;

                    if (sequencerBoolean[0][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (snareCheckCounter==1) { sp.play(snare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbCheckCounter==1) { sp.play(snarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareDelayCheckCounter==1) { sp.play(snaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbDelayCheckCounter==1) { sp.play(snarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareCheckCounter==1) { sp.play(electronicsnare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbCheckCounter==1) { sp.play(electronicsnarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareDelayCheckCounter==1) { sp.play(electronicsnaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbDelayCheckCounter==1) { sp.play(electronicsnarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (snareCheckCounter1==1) { sp.play(snare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbCheckCounter1==1) { sp.play(snarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareDelayCheckCounter1==1) { sp.play(snaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbDelayCheckCounter1==1) { sp.play(snarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareCheckCounter1==1) { sp.play(electronicsnare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbCheckCounter1==1) { sp.play(electronicsnarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareDelayCheckCounter1==1) { sp.play(electronicsnaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbDelayCheckCounter1==1) { sp.play(electronicsnarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (snareCheckCounter2==1) { sp.play(snare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbCheckCounter2==1) { sp.play(snarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareDelayCheckCounter2==1) { sp.play(snaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbDelayCheckCounter2==1) { sp.play(snarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareCheckCounter2==1) { sp.play(electronicsnare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbCheckCounter2==1) { sp.play(electronicsnarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareDelayCheckCounter2==1) { sp.play(electronicsnaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbDelayCheckCounter2==1) { sp.play(electronicsnarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (snareCheckCounter3==1) { sp.play(snare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbCheckCounter3==1) { sp.play(snarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareDelayCheckCounter3==1) { sp.play(snaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbDelayCheckCounter3==1) { sp.play(snarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareCheckCounter3==1) { sp.play(electronicsnare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbCheckCounter3==1) { sp.play(electronicsnarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareDelayCheckCounter3==1) { sp.play(electronicsnaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbDelayCheckCounter3==1) { sp.play(electronicsnarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (snareCheckCounter4==1) { sp.play(snare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbCheckCounter4==1) { sp.play(snarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareDelayCheckCounter4==1) { sp.play(snaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbDelayCheckCounter4==1) { sp.play(snarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareCheckCounter4==1) { sp.play(electronicsnare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbCheckCounter4==1) { sp.play(electronicsnarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareDelayCheckCounter4==1) { sp.play(electronicsnaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbDelayCheckCounter4==1) { sp.play(electronicsnarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (snareCheckCounter5==1) { sp.play(snare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbCheckCounter5==1) { sp.play(snarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareDelayCheckCounter5==1) { sp.play(snaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbDelayCheckCounter5==1) { sp.play(snarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareCheckCounter5==1) { sp.play(electronicsnare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbCheckCounter5==1) { sp.play(electronicsnarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareDelayCheckCounter5==1) { sp.play(electronicsnaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbDelayCheckCounter5==1) { sp.play(electronicsnarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (snareCheckCounter6==1) { sp.play(snare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbCheckCounter6==1) { sp.play(snarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareDelayCheckCounter6==1) { sp.play(snaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbDelayCheckCounter6==1) { sp.play(snarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareCheckCounter6==1) { sp.play(electronicsnare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbCheckCounter6==1) { sp.play(electronicsnarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareDelayCheckCounter6==1) { sp.play(electronicsnaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbDelayCheckCounter6==1) { sp.play(electronicsnarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (snareCheckCounter7==1) { sp.play(snare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbCheckCounter7==1) { sp.play(snarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareDelayCheckCounter7==1) { sp.play(snaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbDelayCheckCounter7==1) { sp.play(snarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareCheckCounter7==1) { sp.play(electronicsnare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbCheckCounter7==1) { sp.play(electronicsnarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareDelayCheckCounter7==1) { sp.play(electronicsnaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbDelayCheckCounter7==1) { sp.play(electronicsnarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (snareCheckCounter8==1) { sp.play(snare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbCheckCounter8==1) { sp.play(snarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareDelayCheckCounter8==1) { sp.play(snaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbDelayCheckCounter8==1) { sp.play(snarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareCheckCounter8==1) { sp.play(electronicsnare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbCheckCounter8==1) { sp.play(electronicsnarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareDelayCheckCounter8==1) { sp.play(electronicsnaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbDelayCheckCounter8==1) { sp.play(electronicsnarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (snareCheckCounter9==1) { sp.play(snare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbCheckCounter9==1) { sp.play(snarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareDelayCheckCounter9==1) { sp.play(snaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbDelayCheckCounter9==1) { sp.play(snarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareCheckCounter9==1) { sp.play(electronicsnare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbCheckCounter9==1) { sp.play(electronicsnarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareDelayCheckCounter9==1) { sp.play(electronicsnaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbDelayCheckCounter9==1) { sp.play(electronicsnarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (snareCheckCounter10==1) { sp.play(snare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbCheckCounter10==1) { sp.play(snarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareDelayCheckCounter10==1) { sp.play(snaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbDelayCheckCounter10==1) { sp.play(snarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareCheckCounter10==1) { sp.play(electronicsnare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbCheckCounter10==1) { sp.play(electronicsnarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareDelayCheckCounter10==1) { sp.play(electronicsnaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbDelayCheckCounter10==1) { sp.play(electronicsnarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (snareCheckCounter11==1) { sp.play(snare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbCheckCounter11==1) { sp.play(snarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareDelayCheckCounter11==1) { sp.play(snaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbDelayCheckCounter11==1) { sp.play(snarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareCheckCounter11==1) { sp.play(electronicsnare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbCheckCounter11==1) { sp.play(electronicsnarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareDelayCheckCounter11==1) { sp.play(electronicsnaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbDelayCheckCounter11==1) { sp.play(electronicsnarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (snareCheckCounter12==1) { sp.play(snare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbCheckCounter12==1) { sp.play(snarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareDelayCheckCounter12==1) { sp.play(snaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbDelayCheckCounter12==1) { sp.play(snarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareCheckCounter12==1) { sp.play(electronicsnare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbCheckCounter12==1) { sp.play(electronicsnarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareDelayCheckCounter12==1) { sp.play(electronicsnaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbDelayCheckCounter12==1) { sp.play(electronicsnarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (snareCheckCounter13==1) { sp.play(snare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbCheckCounter13==1) { sp.play(snarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareDelayCheckCounter13==1) { sp.play(snaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbDelayCheckCounter13==1) { sp.play(snarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareCheckCounter13==1) { sp.play(electronicsnare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbCheckCounter13==1) { sp.play(electronicsnarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareDelayCheckCounter13==1) { sp.play(electronicsnaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbDelayCheckCounter13==1) { sp.play(electronicsnarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (snareCheckCounter14==1) { sp.play(snare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbCheckCounter14==1) { sp.play(snarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareDelayCheckCounter14==1) { sp.play(snaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbDelayCheckCounter14==1) { sp.play(snarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareCheckCounter14==1) { sp.play(electronicsnare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbCheckCounter14==1) { sp.play(electronicsnarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareDelayCheckCounter14==1) { sp.play(electronicsnaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbDelayCheckCounter14==1) { sp.play(electronicsnarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (snareCheckCounter15==1) { sp.play(snare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbCheckCounter15==1) { sp.play(snarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareDelayCheckCounter15==1) { sp.play(snaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (snareReverbDelayCheckCounter15==1) { sp.play(snarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareCheckCounter15==1) { sp.play(electronicsnare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbCheckCounter15==1) { sp.play(electronicsnarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareDelayCheckCounter15==1) { sp.play(electronicsnaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (electronicSnareReverbDelayCheckCounter15==1) { sp.play(electronicsnarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 4000);
                    }

                    if (sequencerBoolean[0][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatOpenCheckCounter==1) { sp.play(hihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbCheckCounter==1) { sp.play(hihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenDelayCheckCounter==1) { sp.play(hihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbDelayCheckCounter==1) { sp.play(hihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenCheckCounter==1) { sp.play(electronichihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbCheckCounter==1) { sp.play(electronichihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenDelayCheckCounter==1) { sp.play(electronichihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbDelayCheckCounter==1) { sp.play(electronichihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatOpenCheckCounter1==1) { sp.play(hihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbCheckCounter1==1) { sp.play(hihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenDelayCheckCounter1==1) { sp.play(hihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbDelayCheckCounter1==1) { sp.play(hihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenCheckCounter1==1) { sp.play(electronichihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbCheckCounter1==1) { sp.play(electronichihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenDelayCheckCounter1==1) { sp.play(electronichihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbDelayCheckCounter1==1) { sp.play(electronichihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatOpenCheckCounter2==1) { sp.play(hihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbCheckCounter2==1) { sp.play(hihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenDelayCheckCounter2==1) { sp.play(hihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbDelayCheckCounter2==1) { sp.play(hihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenCheckCounter2==1) { sp.play(electronichihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbCheckCounter2==1) { sp.play(electronichihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenDelayCheckCounter2==1) { sp.play(electronichihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbDelayCheckCounter2==1) { sp.play(electronichihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatOpenCheckCounter3==1) { sp.play(hihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbCheckCounter3==1) { sp.play(hihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenDelayCheckCounter3==1) { sp.play(hihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbDelayCheckCounter3==1) { sp.play(hihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenCheckCounter3==1) { sp.play(electronichihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbCheckCounter3==1) { sp.play(electronichihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenDelayCheckCounter3==1) { sp.play(electronichihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbDelayCheckCounter3==1) { sp.play(electronichihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatOpenCheckCounter4==1) { sp.play(hihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbCheckCounter4==1) { sp.play(hihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenDelayCheckCounter4==1) { sp.play(hihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbDelayCheckCounter4==1) { sp.play(hihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenCheckCounter4==1) { sp.play(electronichihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbCheckCounter4==1) { sp.play(electronichihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenDelayCheckCounter4==1) { sp.play(electronichihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbDelayCheckCounter4==1) { sp.play(electronichihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatOpenCheckCounter5==1) { sp.play(hihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbCheckCounter5==1) { sp.play(hihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenDelayCheckCounter5==1) { sp.play(hihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbDelayCheckCounter5==1) { sp.play(hihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenCheckCounter5==1) { sp.play(electronichihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbCheckCounter5==1) { sp.play(electronichihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenDelayCheckCounter5==1) { sp.play(electronichihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbDelayCheckCounter5==1) { sp.play(electronichihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatOpenCheckCounter6==1) { sp.play(hihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbCheckCounter6==1) { sp.play(hihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenDelayCheckCounter6==1) { sp.play(hihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbDelayCheckCounter6==1) { sp.play(hihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenCheckCounter6==1) { sp.play(electronichihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbCheckCounter6==1) { sp.play(electronichihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenDelayCheckCounter6==1) { sp.play(electronichihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbDelayCheckCounter6==1) { sp.play(electronichihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatOpenCheckCounter7==1) { sp.play(hihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbCheckCounter7==1) { sp.play(hihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenDelayCheckCounter7==1) { sp.play(hihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbDelayCheckCounter7==1) { sp.play(hihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenCheckCounter7==1) { sp.play(electronichihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbCheckCounter7==1) { sp.play(electronichihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenDelayCheckCounter7==1) { sp.play(electronichihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbDelayCheckCounter7==1) { sp.play(electronichihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatOpenCheckCounter8==1) { sp.play(hihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbCheckCounter8==1) { sp.play(hihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenDelayCheckCounter8==1) { sp.play(hihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbDelayCheckCounter8==1) { sp.play(hihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenCheckCounter8==1) { sp.play(electronichihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbCheckCounter8==1) { sp.play(electronichihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenDelayCheckCounter8==1) { sp.play(electronichihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbDelayCheckCounter8==1) { sp.play(electronichihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatOpenCheckCounter9==1) { sp.play(hihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbCheckCounter9==1) { sp.play(hihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenDelayCheckCounter9==1) { sp.play(hihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbDelayCheckCounter9==1) { sp.play(hihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenCheckCounter9==1) { sp.play(electronichihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbCheckCounter9==1) { sp.play(electronichihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenDelayCheckCounter9==1) { sp.play(electronichihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbDelayCheckCounter9==1) { sp.play(electronichihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatOpenCheckCounter10==1) { sp.play(hihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbCheckCounter10==1) { sp.play(hihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenDelayCheckCounter10==1) { sp.play(hihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbDelayCheckCounter10==1) { sp.play(hihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenCheckCounter10==1) { sp.play(electronichihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbCheckCounter10==1) { sp.play(electronichihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenDelayCheckCounter10==1) { sp.play(electronichihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbDelayCheckCounter10==1) { sp.play(electronichihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatOpenCheckCounter11==1) { sp.play(hihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbCheckCounter11==1) { sp.play(hihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenDelayCheckCounter11==1) { sp.play(hihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbDelayCheckCounter11==1) { sp.play(hihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenCheckCounter11==1) { sp.play(electronichihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbCheckCounter11==1) { sp.play(electronichihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenDelayCheckCounter11==1) { sp.play(electronichihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbDelayCheckCounter11==1) { sp.play(electronichihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatOpenCheckCounter12==1) { sp.play(hihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbCheckCounter12==1) { sp.play(hihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenDelayCheckCounter12==1) { sp.play(hihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbDelayCheckCounter12==1) { sp.play(hihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenCheckCounter12==1) { sp.play(electronichihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbCheckCounter12==1) { sp.play(electronichihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenDelayCheckCounter12==1) { sp.play(electronichihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbDelayCheckCounter12==1) { sp.play(electronichihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatOpenCheckCounter13==1) { sp.play(hihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbCheckCounter13==1) { sp.play(hihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenDelayCheckCounter13==1) { sp.play(hihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbDelayCheckCounter13==1) { sp.play(hihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenCheckCounter13==1) { sp.play(electronichihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbCheckCounter13==1) { sp.play(electronichihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenDelayCheckCounter13==1) { sp.play(electronichihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbDelayCheckCounter13==1) { sp.play(electronichihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatOpenCheckCounter14==1) { sp.play(hihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbCheckCounter14==1) { sp.play(hihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenDelayCheckCounter14==1) { sp.play(hihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbDelayCheckCounter14==1) { sp.play(hihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenCheckCounter14==1) { sp.play(electronichihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbCheckCounter14==1) { sp.play(electronichihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenDelayCheckCounter14==1) { sp.play(electronichihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbDelayCheckCounter14==1) { sp.play(electronichihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatOpenCheckCounter15==1) { sp.play(hihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbCheckCounter15==1) { sp.play(hihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenDelayCheckCounter15==1) { sp.play(hihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (hiHatOpenReverbDelayCheckCounter15==1) { sp.play(hihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenCheckCounter15==1) { sp.play(electronichihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbCheckCounter15==1) { sp.play(electronichihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenDelayCheckCounter15==1) { sp.play(electronichihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (electronicHiHatOpenReverbDelayCheckCounter15==1) { sp.play(electronichihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 4000);
                    }


                    if (sequencerBoolean[0][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatClosedCheckCounter==1) { sp.play(hihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbCheckCounter==1) { sp.play(hihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedDelayCheckCounter==1) { sp.play(hihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbDelayCheckCounter==1) { sp.play(hihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedCheckCounter==1) { sp.play(electronichihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbCheckCounter==1) { sp.play(electronichihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedDelayCheckCounter==1) { sp.play(electronichihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbDelayCheckCounter==1) { sp.play(electronichihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatClosedCheckCounter1==1) { sp.play(hihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbCheckCounter1==1) { sp.play(hihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedDelayCheckCounter1==1) { sp.play(hihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbDelayCheckCounter1==1) { sp.play(hihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedCheckCounter1==1) { sp.play(electronichihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbCheckCounter1==1) { sp.play(electronichihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedDelayCheckCounter1==1) { sp.play(electronichihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbDelayCheckCounter1==1) { sp.play(electronichihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatClosedCheckCounter2==1) { sp.play(hihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbCheckCounter2==1) { sp.play(hihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedDelayCheckCounter2==1) { sp.play(hihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbDelayCheckCounter2==1) { sp.play(hihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedCheckCounter2==1) { sp.play(electronichihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbCheckCounter2==1) { sp.play(electronichihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedDelayCheckCounter2==1) { sp.play(electronichihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbDelayCheckCounter2==1) { sp.play(electronichihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatClosedCheckCounter3==1) { sp.play(hihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbCheckCounter3==1) { sp.play(hihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedDelayCheckCounter3==1) { sp.play(hihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbDelayCheckCounter3==1) { sp.play(hihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedCheckCounter3==1) { sp.play(electronichihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbCheckCounter3==1) { sp.play(electronichihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedDelayCheckCounter3==1) { sp.play(electronichihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbDelayCheckCounter3==1) { sp.play(electronichihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatClosedCheckCounter4==1) { sp.play(hihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbCheckCounter4==1) { sp.play(hihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedDelayCheckCounter4==1) { sp.play(hihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbDelayCheckCounter4==1) { sp.play(hihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedCheckCounter4==1) { sp.play(electronichihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbCheckCounter4==1) { sp.play(electronichihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedDelayCheckCounter4==1) { sp.play(electronichihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbDelayCheckCounter4==1) { sp.play(electronichihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatClosedCheckCounter5==1) { sp.play(hihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbCheckCounter5==1) { sp.play(hihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedDelayCheckCounter5==1) { sp.play(hihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbDelayCheckCounter5==1) { sp.play(hihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedCheckCounter5==1) { sp.play(electronichihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbCheckCounter5==1) { sp.play(electronichihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedDelayCheckCounter5==1) { sp.play(electronichihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbDelayCheckCounter5==1) { sp.play(electronichihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatClosedCheckCounter6==1) { sp.play(hihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbCheckCounter6==1) { sp.play(hihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedDelayCheckCounter6==1) { sp.play(hihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbDelayCheckCounter6==1) { sp.play(hihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedCheckCounter6==1) { sp.play(electronichihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbCheckCounter6==1) { sp.play(electronichihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedDelayCheckCounter6==1) { sp.play(electronichihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbDelayCheckCounter6==1) { sp.play(electronichihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatClosedCheckCounter7==1) { sp.play(hihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbCheckCounter7==1) { sp.play(hihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedDelayCheckCounter7==1) { sp.play(hihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbDelayCheckCounter7==1) { sp.play(hihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedCheckCounter7==1) { sp.play(electronichihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbCheckCounter7==1) { sp.play(electronichihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedDelayCheckCounter7==1) { sp.play(electronichihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbDelayCheckCounter7==1) { sp.play(electronichihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatClosedCheckCounter8==1) { sp.play(hihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbCheckCounter8==1) { sp.play(hihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedDelayCheckCounter8==1) { sp.play(hihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbDelayCheckCounter8==1) { sp.play(hihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedCheckCounter8==1) { sp.play(electronichihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbCheckCounter8==1) { sp.play(electronichihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedDelayCheckCounter8==1) { sp.play(electronichihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbDelayCheckCounter8==1) { sp.play(electronichihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatClosedCheckCounter9==1) { sp.play(hihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbCheckCounter9==1) { sp.play(hihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedDelayCheckCounter9==1) { sp.play(hihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbDelayCheckCounter9==1) { sp.play(hihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedCheckCounter9==1) { sp.play(electronichihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbCheckCounter9==1) { sp.play(electronichihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedDelayCheckCounter9==1) { sp.play(electronichihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbDelayCheckCounter9==1) { sp.play(electronichihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatClosedCheckCounter10==1) { sp.play(hihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbCheckCounter10==1) { sp.play(hihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedDelayCheckCounter10==1) { sp.play(hihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbDelayCheckCounter10==1) { sp.play(hihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedCheckCounter10==1) { sp.play(electronichihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbCheckCounter10==1) { sp.play(electronichihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedDelayCheckCounter10==1) { sp.play(electronichihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbDelayCheckCounter10==1) { sp.play(electronichihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatClosedCheckCounter11==1) { sp.play(hihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbCheckCounter11==1) { sp.play(hihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedDelayCheckCounter11==1) { sp.play(hihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbDelayCheckCounter11==1) { sp.play(hihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedCheckCounter11==1) { sp.play(electronichihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbCheckCounter11==1) { sp.play(electronichihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedDelayCheckCounter11==1) { sp.play(electronichihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbDelayCheckCounter11==1) { sp.play(electronichihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatClosedCheckCounter12==1) { sp.play(hihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbCheckCounter12==1) { sp.play(hihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedDelayCheckCounter12==1) { sp.play(hihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbDelayCheckCounter12==1) { sp.play(hihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedCheckCounter12==1) { sp.play(electronichihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbCheckCounter12==1) { sp.play(electronichihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedDelayCheckCounter12==1) { sp.play(electronichihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbDelayCheckCounter12==1) { sp.play(electronichihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatClosedCheckCounter13==1) { sp.play(hihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbCheckCounter13==1) { sp.play(hihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedDelayCheckCounter13==1) { sp.play(hihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbDelayCheckCounter13==1) { sp.play(hihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedCheckCounter13==1) { sp.play(electronichihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbCheckCounter13==1) { sp.play(electronichihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedDelayCheckCounter13==1) { sp.play(electronichihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbDelayCheckCounter13==1) { sp.play(electronichihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatClosedCheckCounter14==1) { sp.play(hihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbCheckCounter14==1) { sp.play(hihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedDelayCheckCounter14==1) { sp.play(hihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbDelayCheckCounter14==1) { sp.play(hihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedCheckCounter14==1) { sp.play(electronichihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbCheckCounter14==1) { sp.play(electronichihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedDelayCheckCounter14==1) { sp.play(electronichihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbDelayCheckCounter14==1) { sp.play(electronichihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (hiHatClosedCheckCounter15==1) { sp.play(hihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbCheckCounter15==1) { sp.play(hihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedDelayCheckCounter15==1) { sp.play(hihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (hiHatClosedReverbDelayCheckCounter15==1) { sp.play(hihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedCheckCounter15==1) { sp.play(electronichihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbCheckCounter15==1) { sp.play(electronichihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedDelayCheckCounter15==1) { sp.play(electronichihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (electronicHiHatClosedReverbDelayCheckCounter15==1) { sp.play(electronichihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 4000);
                    }

                    if (sequencerBoolean[0][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (stickCheckCounter==1) { sp.play(stick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbCheckCounter==1) { sp.play(stickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickDelayCheckCounter==1) { sp.play(stickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbDelayCheckCounter==1) { sp.play(stickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickCheckCounter==1) { sp.play(electronicstick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbCheckCounter==1) { sp.play(electronicstickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickDelayCheckCounter==1) { sp.play(electronicstickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbDelayCheckCounter==1) { sp.play(electronicstickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (stickCheckCounter1==1) { sp.play(stick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbCheckCounter1==1) { sp.play(stickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickDelayCheckCounter1==1) { sp.play(stickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbDelayCheckCounter1==1) { sp.play(stickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickCheckCounter1==1) { sp.play(electronicstick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbCheckCounter1==1) { sp.play(electronicstickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickDelayCheckCounter1==1) { sp.play(electronicstickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbDelayCheckCounter1==1) { sp.play(electronicstickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (stickCheckCounter2==1) { sp.play(stick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbCheckCounter2==1) { sp.play(stickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickDelayCheckCounter2==1) { sp.play(stickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbDelayCheckCounter2==1) { sp.play(stickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickCheckCounter2==1) { sp.play(electronicstick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbCheckCounter2==1) { sp.play(electronicstickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickDelayCheckCounter2==1) { sp.play(electronicstickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbDelayCheckCounter2==1) { sp.play(electronicstickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (stickCheckCounter3==1) { sp.play(stick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbCheckCounter3==1) { sp.play(stickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickDelayCheckCounter3==1) { sp.play(stickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbDelayCheckCounter3==1) { sp.play(stickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickCheckCounter3==1) { sp.play(electronicstick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbCheckCounter3==1) { sp.play(electronicstickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickDelayCheckCounter3==1) { sp.play(electronicstickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbDelayCheckCounter3==1) { sp.play(electronicstickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (stickCheckCounter4==1) { sp.play(stick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbCheckCounter4==1) { sp.play(stickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickDelayCheckCounter4==1) { sp.play(stickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbDelayCheckCounter4==1) { sp.play(stickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickCheckCounter4==1) { sp.play(electronicstick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbCheckCounter4==1) { sp.play(electronicstickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickDelayCheckCounter4==1) { sp.play(electronicstickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbDelayCheckCounter4==1) { sp.play(electronicstickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (stickCheckCounter5==1) { sp.play(stick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbCheckCounter5==1) { sp.play(stickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickDelayCheckCounter5==1) { sp.play(stickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbDelayCheckCounter5==1) { sp.play(stickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickCheckCounter5==1) { sp.play(electronicstick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbCheckCounter5==1) { sp.play(electronicstickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickDelayCheckCounter5==1) { sp.play(electronicstickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbDelayCheckCounter5==1) { sp.play(electronicstickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (stickCheckCounter6==1) { sp.play(stick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbCheckCounter6==1) { sp.play(stickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickDelayCheckCounter6==1) { sp.play(stickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbDelayCheckCounter6==1) { sp.play(stickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickCheckCounter6==1) { sp.play(electronicstick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbCheckCounter6==1) { sp.play(electronicstickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickDelayCheckCounter6==1) { sp.play(electronicstickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbDelayCheckCounter6==1) { sp.play(electronicstickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (stickCheckCounter7==1) { sp.play(stick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbCheckCounter7==1) { sp.play(stickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickDelayCheckCounter7==1) { sp.play(stickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbDelayCheckCounter7==1) { sp.play(stickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickCheckCounter7==1) { sp.play(electronicstick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbCheckCounter7==1) { sp.play(electronicstickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickDelayCheckCounter7==1) { sp.play(electronicstickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbDelayCheckCounter7==1) { sp.play(electronicstickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (stickCheckCounter8==1) { sp.play(stick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbCheckCounter8==1) { sp.play(stickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickDelayCheckCounter8==1) { sp.play(stickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbDelayCheckCounter8==1) { sp.play(stickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickCheckCounter8==1) { sp.play(electronicstick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbCheckCounter8==1) { sp.play(electronicstickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickDelayCheckCounter8==1) { sp.play(electronicstickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbDelayCheckCounter8==1) { sp.play(electronicstickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (stickCheckCounter9==1) { sp.play(stick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbCheckCounter9==1) { sp.play(stickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickDelayCheckCounter9==1) { sp.play(stickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbDelayCheckCounter9==1) { sp.play(stickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickCheckCounter9==1) { sp.play(electronicstick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbCheckCounter9==1) { sp.play(electronicstickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickDelayCheckCounter9==1) { sp.play(electronicstickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbDelayCheckCounter9==1) { sp.play(electronicstickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (stickCheckCounter10==1) { sp.play(stick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbCheckCounter10==1) { sp.play(stickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickDelayCheckCounter10==1) { sp.play(stickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbDelayCheckCounter10==1) { sp.play(stickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickCheckCounter10==1) { sp.play(electronicstick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbCheckCounter10==1) { sp.play(electronicstickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickDelayCheckCounter10==1) { sp.play(electronicstickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbDelayCheckCounter10==1) { sp.play(electronicstickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (stickCheckCounter11==1) { sp.play(stick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbCheckCounter11==1) { sp.play(stickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickDelayCheckCounter11==1) { sp.play(stickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbDelayCheckCounter11==1) { sp.play(stickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickCheckCounter11==1) { sp.play(electronicstick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbCheckCounter11==1) { sp.play(electronicstickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickDelayCheckCounter11==1) { sp.play(electronicstickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbDelayCheckCounter11==1) { sp.play(electronicstickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (stickCheckCounter12==1) { sp.play(stick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbCheckCounter12==1) { sp.play(stickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickDelayCheckCounter12==1) { sp.play(stickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbDelayCheckCounter12==1) { sp.play(stickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickCheckCounter12==1) { sp.play(electronicstick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbCheckCounter12==1) { sp.play(electronicstickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickDelayCheckCounter12==1) { sp.play(electronicstickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbDelayCheckCounter12==1) { sp.play(electronicstickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (stickCheckCounter13==1) { sp.play(stick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbCheckCounter13==1) { sp.play(stickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickDelayCheckCounter13==1) { sp.play(stickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbDelayCheckCounter13==1) { sp.play(stickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickCheckCounter13==1) { sp.play(electronicstick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbCheckCounter13==1) { sp.play(electronicstickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickDelayCheckCounter13==1) { sp.play(electronicstickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbDelayCheckCounter13==1) { sp.play(electronicstickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (stickCheckCounter14==1) { sp.play(stick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbCheckCounter14==1) { sp.play(stickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickDelayCheckCounter14==1) { sp.play(stickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbDelayCheckCounter14==1) { sp.play(stickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickCheckCounter14==1) { sp.play(electronicstick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbCheckCounter14==1) { sp.play(electronicstickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickDelayCheckCounter14==1) { sp.play(electronicstickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbDelayCheckCounter14==1) { sp.play(electronicstickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (stickCheckCounter15==1) { sp.play(stick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbCheckCounter15==1) { sp.play(stickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickDelayCheckCounter15==1) { sp.play(stickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (stickReverbDelayCheckCounter15==1) { sp.play(stickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickCheckCounter15==1) { sp.play(electronicstick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbCheckCounter15==1) { sp.play(electronicstickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickDelayCheckCounter15==1) { sp.play(electronicstickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (electronicStickReverbDelayCheckCounter15==1) { sp.play(electronicstickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 4000);
                    }

                    if (sequencerBoolean[0][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (bellCheckCounter==1) { sp.play(bell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbCheckCounter==1) { sp.play(bellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellDelayCheckCounter==1) { sp.play(belldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbDelayCheckCounter==1) { sp.play(bellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellCheckCounter==1) { sp.play(electronicbell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbCheckCounter==1) { sp.play(electronicbellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellDelayCheckCounter==1) { sp.play(electronicbelldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbDelayCheckCounter==1) { sp.play(electronicbellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (bellCheckCounter1==1) { sp.play(bell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbCheckCounter1==1) { sp.play(bellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellDelayCheckCounter1==1) { sp.play(belldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbDelayCheckCounter1==1) { sp.play(bellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellCheckCounter1==1) { sp.play(electronicbell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbCheckCounter1==1) { sp.play(electronicbellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellDelayCheckCounter1==1) { sp.play(electronicbelldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbDelayCheckCounter1==1) { sp.play(electronicbellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (bellCheckCounter2==1) { sp.play(bell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbCheckCounter2==1) { sp.play(bellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellDelayCheckCounter2==1) { sp.play(belldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbDelayCheckCounter2==1) { sp.play(bellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellCheckCounter2==1) { sp.play(electronicbell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbCheckCounter2==1) { sp.play(electronicbellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellDelayCheckCounter2==1) { sp.play(electronicbelldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbDelayCheckCounter2==1) { sp.play(electronicbellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (bellCheckCounter3==1) { sp.play(bell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbCheckCounter3==1) { sp.play(bellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellDelayCheckCounter3==1) { sp.play(belldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbDelayCheckCounter3==1) { sp.play(bellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellCheckCounter3==1) { sp.play(electronicbell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbCheckCounter3==1) { sp.play(electronicbellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellDelayCheckCounter3==1) { sp.play(electronicbelldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbDelayCheckCounter3==1) { sp.play(electronicbellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (bellCheckCounter4==1) { sp.play(bell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbCheckCounter4==1) { sp.play(bellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellDelayCheckCounter4==1) { sp.play(belldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbDelayCheckCounter4==1) { sp.play(bellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellCheckCounter4==1) { sp.play(electronicbell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbCheckCounter4==1) { sp.play(electronicbellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellDelayCheckCounter4==1) { sp.play(electronicbelldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbDelayCheckCounter4==1) { sp.play(electronicbellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (bellCheckCounter5==1) { sp.play(bell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbCheckCounter5==1) { sp.play(bellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellDelayCheckCounter5==1) { sp.play(belldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbDelayCheckCounter5==1) { sp.play(bellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellCheckCounter5==1) { sp.play(electronicbell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbCheckCounter5==1) { sp.play(electronicbellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellDelayCheckCounter5==1) { sp.play(electronicbelldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbDelayCheckCounter5==1) { sp.play(electronicbellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (bellCheckCounter6==1) { sp.play(bell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbCheckCounter6==1) { sp.play(bellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellDelayCheckCounter6==1) { sp.play(belldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbDelayCheckCounter6==1) { sp.play(bellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellCheckCounter6==1) { sp.play(electronicbell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbCheckCounter6==1) { sp.play(electronicbellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellDelayCheckCounter6==1) { sp.play(electronicbelldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbDelayCheckCounter6==1) { sp.play(electronicbellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (bellCheckCounter7==1) { sp.play(bell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbCheckCounter7==1) { sp.play(bellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellDelayCheckCounter7==1) { sp.play(belldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbDelayCheckCounter7==1) { sp.play(bellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellCheckCounter7==1) { sp.play(electronicbell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbCheckCounter7==1) { sp.play(electronicbellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellDelayCheckCounter7==1) { sp.play(electronicbelldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbDelayCheckCounter7==1) { sp.play(electronicbellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (bellCheckCounter8==1) { sp.play(bell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbCheckCounter8==1) { sp.play(bellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellDelayCheckCounter8==1) { sp.play(belldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbDelayCheckCounter8==1) { sp.play(bellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellCheckCounter8==1) { sp.play(electronicbell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbCheckCounter8==1) { sp.play(electronicbellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellDelayCheckCounter8==1) { sp.play(electronicbelldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbDelayCheckCounter8==1) { sp.play(electronicbellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (bellCheckCounter9==1) { sp.play(bell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbCheckCounter9==1) { sp.play(bellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellDelayCheckCounter9==1) { sp.play(belldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbDelayCheckCounter9==1) { sp.play(bellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellCheckCounter9==1) { sp.play(electronicbell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbCheckCounter9==1) { sp.play(electronicbellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellDelayCheckCounter9==1) { sp.play(electronicbelldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbDelayCheckCounter9==1) { sp.play(electronicbellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (bellCheckCounter10==1) { sp.play(bell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbCheckCounter10==1) { sp.play(bellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellDelayCheckCounter10==1) { sp.play(belldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbDelayCheckCounter10==1) { sp.play(bellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellCheckCounter10==1) { sp.play(electronicbell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbCheckCounter10==1) { sp.play(electronicbellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellDelayCheckCounter10==1) { sp.play(electronicbelldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbDelayCheckCounter10==1) { sp.play(electronicbellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (bellCheckCounter11==1) { sp.play(bell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbCheckCounter11==1) { sp.play(bellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellDelayCheckCounter11==1) { sp.play(belldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbDelayCheckCounter11==1) { sp.play(bellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellCheckCounter11==1) { sp.play(electronicbell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbCheckCounter11==1) { sp.play(electronicbellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellDelayCheckCounter11==1) { sp.play(electronicbelldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbDelayCheckCounter11==1) { sp.play(electronicbellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (bellCheckCounter12==1) { sp.play(bell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbCheckCounter12==1) { sp.play(bellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellDelayCheckCounter12==1) { sp.play(belldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbDelayCheckCounter12==1) { sp.play(bellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellCheckCounter12==1) { sp.play(electronicbell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbCheckCounter12==1) { sp.play(electronicbellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellDelayCheckCounter12==1) { sp.play(electronicbelldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbDelayCheckCounter12==1) { sp.play(electronicbellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (bellCheckCounter13==1) { sp.play(bell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbCheckCounter13==1) { sp.play(bellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellDelayCheckCounter13==1) { sp.play(belldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbDelayCheckCounter13==1) { sp.play(bellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellCheckCounter13==1) { sp.play(electronicbell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbCheckCounter13==1) { sp.play(electronicbellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellDelayCheckCounter13==1) { sp.play(electronicbelldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbDelayCheckCounter13==1) { sp.play(electronicbellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (bellCheckCounter14==1) { sp.play(bell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbCheckCounter14==1) { sp.play(bellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellDelayCheckCounter14==1) { sp.play(belldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbDelayCheckCounter14==1) { sp.play(bellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellCheckCounter14==1) { sp.play(electronicbell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbCheckCounter14==1) { sp.play(electronicbellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellDelayCheckCounter14==1) { sp.play(electronicbelldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbDelayCheckCounter14==1) { sp.play(electronicbellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (bellCheckCounter15==1) { sp.play(bell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbCheckCounter15==1) { sp.play(bellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellDelayCheckCounter15==1) { sp.play(belldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (bellReverbDelayCheckCounter15==1) { sp.play(bellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellCheckCounter15==1) { sp.play(electronicbell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbCheckCounter15==1) { sp.play(electronicbellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellDelayCheckCounter15==1) { sp.play(electronicbelldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (electronicBellReverbDelayCheckCounter15==1) { sp.play(electronicbellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 4000);
                    }

                    if (sequencerBoolean[0][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (crashCheckCounter==1) { sp.play(crash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbCheckCounter==1) { sp.play(crashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashDelayCheckCounter==1) { sp.play(crashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbDelayCheckCounter==1) { sp.play(crashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashCheckCounter==1) { sp.play(electroniccrash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbCheckCounter==1) { sp.play(electroniccrashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashDelayCheckCounter==1) { sp.play(electroniccrashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbDelayCheckCounter==1) { sp.play(electroniccrashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (crashCheckCounter1==1) { sp.play(crash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbCheckCounter1==1) { sp.play(crashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashDelayCheckCounter1==1) { sp.play(crashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbDelayCheckCounter1==1) { sp.play(crashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashCheckCounter1==1) { sp.play(electroniccrash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbCheckCounter1==1) { sp.play(electroniccrashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashDelayCheckCounter1==1) { sp.play(electroniccrashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbDelayCheckCounter1==1) { sp.play(electroniccrashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (crashCheckCounter2==1) { sp.play(crash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbCheckCounter2==1) { sp.play(crashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashDelayCheckCounter2==1) { sp.play(crashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbDelayCheckCounter2==1) { sp.play(crashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashCheckCounter2==1) { sp.play(electroniccrash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbCheckCounter2==1) { sp.play(electroniccrashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashDelayCheckCounter2==1) { sp.play(electroniccrashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbDelayCheckCounter2==1) { sp.play(electroniccrashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (crashCheckCounter3==1) { sp.play(crash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbCheckCounter3==1) { sp.play(crashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashDelayCheckCounter3==1) { sp.play(crashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbDelayCheckCounter3==1) { sp.play(crashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashCheckCounter3==1) { sp.play(electroniccrash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbCheckCounter3==1) { sp.play(electroniccrashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashDelayCheckCounter3==1) { sp.play(electroniccrashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbDelayCheckCounter3==1) { sp.play(electroniccrashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (crashCheckCounter4==1) { sp.play(crash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbCheckCounter4==1) { sp.play(crashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashDelayCheckCounter4==1) { sp.play(crashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbDelayCheckCounter4==1) { sp.play(crashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashCheckCounter4==1) { sp.play(electroniccrash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbCheckCounter4==1) { sp.play(electroniccrashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashDelayCheckCounter4==1) { sp.play(electroniccrashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbDelayCheckCounter4==1) { sp.play(electroniccrashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (crashCheckCounter5==1) { sp.play(crash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbCheckCounter5==1) { sp.play(crashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashDelayCheckCounter5==1) { sp.play(crashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbDelayCheckCounter5==1) { sp.play(crashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashCheckCounter5==1) { sp.play(electroniccrash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbCheckCounter5==1) { sp.play(electroniccrashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashDelayCheckCounter5==1) { sp.play(electroniccrashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbDelayCheckCounter5==1) { sp.play(electroniccrashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (crashCheckCounter6==1) { sp.play(crash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbCheckCounter6==1) { sp.play(crashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashDelayCheckCounter6==1) { sp.play(crashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbDelayCheckCounter6==1) { sp.play(crashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashCheckCounter6==1) { sp.play(electroniccrash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbCheckCounter6==1) { sp.play(electroniccrashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashDelayCheckCounter6==1) { sp.play(electroniccrashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbDelayCheckCounter6==1) { sp.play(electroniccrashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (crashCheckCounter7==1) { sp.play(crash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbCheckCounter7==1) { sp.play(crashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashDelayCheckCounter7==1) { sp.play(crashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbDelayCheckCounter7==1) { sp.play(crashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashCheckCounter7==1) { sp.play(electroniccrash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbCheckCounter7==1) { sp.play(electroniccrashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashDelayCheckCounter7==1) { sp.play(electroniccrashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbDelayCheckCounter7==1) { sp.play(electroniccrashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (crashCheckCounter8==1) { sp.play(crash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbCheckCounter8==1) { sp.play(crashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashDelayCheckCounter8==1) { sp.play(crashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbDelayCheckCounter8==1) { sp.play(crashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashCheckCounter8==1) { sp.play(electroniccrash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbCheckCounter8==1) { sp.play(electroniccrashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashDelayCheckCounter8==1) { sp.play(electroniccrashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbDelayCheckCounter8==1) { sp.play(electroniccrashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (crashCheckCounter9==1) { sp.play(crash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbCheckCounter9==1) { sp.play(crashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashDelayCheckCounter9==1) { sp.play(crashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbDelayCheckCounter9==1) { sp.play(crashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashCheckCounter9==1) { sp.play(electroniccrash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbCheckCounter9==1) { sp.play(electroniccrashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashDelayCheckCounter9==1) { sp.play(electroniccrashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbDelayCheckCounter9==1) { sp.play(electroniccrashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (crashCheckCounter10==1) { sp.play(crash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbCheckCounter10==1) { sp.play(crashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashDelayCheckCounter10==1) { sp.play(crashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbDelayCheckCounter10==1) { sp.play(crashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashCheckCounter10==1) { sp.play(electroniccrash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbCheckCounter10==1) { sp.play(electroniccrashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashDelayCheckCounter10==1) { sp.play(electroniccrashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbDelayCheckCounter10==1) { sp.play(electroniccrashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (crashCheckCounter11==1) { sp.play(crash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbCheckCounter11==1) { sp.play(crashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashDelayCheckCounter11==1) { sp.play(crashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbDelayCheckCounter11==1) { sp.play(crashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashCheckCounter11==1) { sp.play(electroniccrash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbCheckCounter11==1) { sp.play(electroniccrashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashDelayCheckCounter11==1) { sp.play(electroniccrashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbDelayCheckCounter11==1) { sp.play(electroniccrashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (crashCheckCounter12==1) { sp.play(crash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbCheckCounter12==1) { sp.play(crashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashDelayCheckCounter12==1) { sp.play(crashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbDelayCheckCounter12==1) { sp.play(crashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashCheckCounter12==1) { sp.play(electroniccrash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbCheckCounter12==1) { sp.play(electroniccrashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashDelayCheckCounter12==1) { sp.play(electroniccrashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbDelayCheckCounter12==1) { sp.play(electroniccrashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (crashCheckCounter13==1) { sp.play(crash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbCheckCounter13==1) { sp.play(crashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashDelayCheckCounter13==1) { sp.play(crashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbDelayCheckCounter13==1) { sp.play(crashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashCheckCounter13==1) { sp.play(electroniccrash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbCheckCounter13==1) { sp.play(electroniccrashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashDelayCheckCounter13==1) { sp.play(electroniccrashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbDelayCheckCounter13==1) { sp.play(electroniccrashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (crashCheckCounter14==1) { sp.play(crash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbCheckCounter14==1) { sp.play(crashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashDelayCheckCounter14==1) { sp.play(crashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbDelayCheckCounter14==1) { sp.play(crashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashCheckCounter14==1) { sp.play(electroniccrash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbCheckCounter14==1) { sp.play(electroniccrashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashDelayCheckCounter14==1) { sp.play(electroniccrashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbDelayCheckCounter14==1) { sp.play(electroniccrashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() {
                                if (checkPresses == 1) {
                                    if (crashCheckCounter15==1) { sp.play(crash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbCheckCounter15==1) { sp.play(crashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashDelayCheckCounter15==1) { sp.play(crashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (crashReverbDelayCheckCounter15==1) { sp.play(crashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashCheckCounter15==1) { sp.play(electroniccrash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbCheckCounter15==1) { sp.play(electroniccrashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashDelayCheckCounter15==1) { sp.play(electroniccrashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (electronicCrashReverbDelayCheckCounter15==1) { sp.play(electroniccrashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f); }
                                    if (countering==0) {
                                        handler.postDelayed(this, 4000); }
                                }
                                if(checkPresses == 0) {
                                    sp.autoPause();
                                }
                            }
                        }, 4000);
                    }

                    //if (checkPresses > 1) {
                    //handler.removeCallbacks(Runnable);
                    //sp.autoPause();
                    //System.out.println("Hi");
                    //sp.autoResume();
                    //}

                }
                //if (sequencerCounter == 0 && checkPresses > 1) {
                //else {
                    //sp.autoPause();
                    //sp.pause(this);
                    //handler.removeCallbacksAndMessages(null);
                    //System.out.println("Hi there");
                    //sp.autoResume();
                    //sp.release();
                //}
                break;
            }


            //}

            /*case R.id.imageButtonPlay: //if the nextPage button is pressed
            {
                if (myImageButtonViewRefPlay.isPressed()) {
                    sequencerCounter = 1;
                    //stopRecording();
                    //mediaRecorder.stop();
                    //mediaRecorder.release();
                    mediaRecorder.stop();
                    //MediaRecorder.reset();   // You can reuse the object by going back to setAudioSource() step
                    mediaRecorder.release(); // Now the object cannot be reused
                    //MediaRecorder = null;

                    mediaPlayer = new MediaPlayer();
                    try {
                        ContextWrapper contextWrapper = new ContextWrapper(getApplicationContext());
                        File musicDirectory = contextWrapper.getExternalFilesDir(Environment.DIRECTORY_MUSIC);
                        File file = new File(musicDirectory, "testRecordingFile" + ".mp3");
                        String thisone = file.getPath();
                        mediaPlayer.setDataSource(thisone);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    try {
                        mediaPlayer.prepare();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    mediaPlayer.start();
                }

                else{
                    sequencerCounter = 0;
                }
            }*/



        }
    }

        @Override
        public boolean onTouch (View view, MotionEvent motionEvent){

            switch(view.getId()) {
                case R.id.kickid:
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter == 0 && drumReverbCounter == 0 && drumDelayCounter == 0) {
                        sp.play(electronickick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f);
                    }

                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(kick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(electronickick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][1] = true; //3
                            electronicKickCheckCounter = 1;
                            //Log.d("checkkick", "kick placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][1] = true; //3
                            electronicKickCheckCounter1 = 1;
                            //Log.d("checkkick", "kick placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][1] = true; //3
                            electronicKickCheckCounter2 = 1;
                            //Log.d("checkkick", "kick placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][1] = true; //3
                            electronicKickCheckCounter3 = 1;
                            //Log.d("checkkick", "kick placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][1] = true; //3
                            electronicKickCheckCounter4 = 1;
                            //Log.d("checkkick", "kick placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][1] = true; //3
                            electronicKickCheckCounter5 = 1;
                            //Log.d("checkkick", "kick placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][1] = true; //3
                            electronicKickCheckCounter6 = 1;
                            //Log.d("checkkick", "kick placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][1] = true; //3
                            electronicKickCheckCounter7 = 1;
                            //Log.d("checkkick", "kick placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][1] = true; //3
                            electronicKickCheckCounter8 = 1;
                            //Log.d("checkkick", "kick placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][1] = true; //3
                            electronicKickCheckCounter9 = 1;
                            //Log.d("checkkick", "kick placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][1] = true; //3
                            electronicKickCheckCounter10 = 1;
                            //Log.d("checkkick", "kick placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][1] = true; //3
                            electronicKickCheckCounter11 = 1;
                            //Log.d("checkkick", "kick placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][1] = true; //3
                            electronicKickCheckCounter12 = 1;
                            //Log.d("checkkick", "kick placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][1] = true; //3
                            electronicKickCheckCounter13 = 1;
                            //Log.d("checkkick", "kick placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][1] = true; //3
                            electronicKickCheckCounter14 = 1;
                            //Log.d("checkkick", "kick placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][1] = true; //3
                            electronicKickCheckCounter15 = 1;
                            //Log.d("checkkick", "kick placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(kick, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][1] = true; //3
                            kickCheckCounter = 1;
                            //Log.d("checkkick", "kick placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][1] = true; //3
                            kickCheckCounter1 = 1;
                            //Log.d("checkkick", "kick placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][1] = true; //3
                            kickCheckCounter2 = 1;
                            //Log.d("checkkick", "kick placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][1] = true; //3
                            kickCheckCounter3 = 1;
                            //Log.d("checkkick", "kick placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][1] = true; //3
                            kickCheckCounter4 = 1;
                            //Log.d("checkkick", "kick placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][1] = true; //3
                            kickCheckCounter5 = 1;
                            //Log.d("checkkick", "kick placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][1] = true; //3
                            kickCheckCounter6 = 1;
                            //Log.d("checkkick", "kick placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][1] = true; //3
                            kickCheckCounter7 = 1;
                            //Log.d("checkkick", "kick placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][1] = true; //3
                            kickCheckCounter8 = 1;
                            //Log.d("checkkick", "kick placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][1] = true; //3
                            kickCheckCounter9 = 1;
                            //Log.d("checkkick", "kick placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][1] = true; //3
                            kickCheckCounter10 = 1;
                            //Log.d("checkkick", "kick placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][1] = true; //3
                            kickCheckCounter11 = 1;
                            //Log.d("checkkick", "kick placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][1] = true; //3
                            kickCheckCounter12 = 1;
                            //Log.d("checkkick", "kick placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][1] = true; //3
                            kickCheckCounter13 = 1;
                            //Log.d("checkkick", "kick placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][1] = true; //3
                            kickCheckCounter14 = 1;
                            //Log.d("checkkick", "kick placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][1] = true; //3
                            kickCheckCounter15 = 1;
                            //Log.d("checkkick", "kick placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(kickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(kickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(kickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(kickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][1] = true; //3
                            kickReverbCheckCounter = 1;
                            //Log.d("checkkick", "kick placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][1] = true; //3
                            kickReverbCheckCounter1 = 1;
                            //Log.d("checkkick", "kick placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][1] = true; //3
                            kickReverbCheckCounter2 = 1;
                            //Log.d("checkkick", "kick placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][1] = true; //3
                            kickReverbCheckCounter3 = 1;
                            //Log.d("checkkick", "kick placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][1] = true; //3
                            kickReverbCheckCounter4 = 1;
                            //Log.d("checkkick", "kick placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][1] = true; //3
                            kickReverbCheckCounter5 = 1;
                            //Log.d("checkkick", "kick placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][1] = true; //3
                            kickReverbCheckCounter6 = 1;
                            //Log.d("checkkick", "kick placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][1] = true; //3
                            kickReverbCheckCounter7 = 1;
                            //Log.d("checkkick", "kick placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][1] = true; //3
                            kickReverbCheckCounter8 = 1;
                            //Log.d("checkkick", "kick placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][1] = true; //3
                            kickReverbCheckCounter9 = 1;
                            //Log.d("checkkick", "kick placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][1] = true; //3
                            kickReverbCheckCounter10 = 1;
                            //Log.d("checkkick", "kick placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][1] = true; //3
                            kickReverbCheckCounter11 = 1;
                            //Log.d("checkkick", "kick placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][1] = true; //3
                            kickReverbCheckCounter12 = 1;
                            //Log.d("checkkick", "kick placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][1] = true; //3
                            kickReverbCheckCounter13 = 1;
                            //Log.d("checkkick", "kick placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][1] = true; //3
                            kickReverbCheckCounter14 = 1;
                            //Log.d("checkkick", "kick placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][1] = true; //3
                            kickReverbCheckCounter15 = 1;
                            //Log.d("checkkick", "kick placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(kickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][1] = true; //3
                            kickDelayCheckCounter = 1;
                            //Log.d("checkkick", "kick placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][1] = true; //3
                            kickDelayCheckCounter1 = 1;
                            //Log.d("checkkick", "kick placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][1] = true; //3
                            kickDelayCheckCounter2 = 1;
                            //Log.d("checkkick", "kick placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][1] = true; //3
                            kickDelayCheckCounter3 = 1;
                            //Log.d("checkkick", "kick placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][1] = true; //3
                            kickDelayCheckCounter4 = 1;
                            //Log.d("checkkick", "kick placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][1] = true; //3
                            kickDelayCheckCounter5 = 1;
                            //Log.d("checkkick", "kick placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][1] = true; //3
                            kickDelayCheckCounter6 = 1;
                            //Log.d("checkkick", "kick placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][1] = true; //3
                            kickDelayCheckCounter7 = 1;
                            //Log.d("checkkick", "kick placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][1] = true; //3
                            kickDelayCheckCounter8 = 1;
                            //Log.d("checkkick", "kick placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][1] = true; //3
                            kickDelayCheckCounter9 = 1;
                            //Log.d("checkkick", "kick placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][1] = true; //3
                            kickDelayCheckCounter10 = 1;
                            //Log.d("checkkick", "kick placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][1] = true; //3
                            kickDelayCheckCounter11 = 1;
                            //Log.d("checkkick", "kick placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][1] = true; //3
                            kickDelayCheckCounter12 = 1;
                            //Log.d("checkkick", "kick placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][1] = true; //3
                            kickDelayCheckCounter13 = 1;
                            //Log.d("checkkick", "kick placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][1] = true; //3
                            kickDelayCheckCounter14 = 1;
                            //Log.d("checkkick", "kick placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][1] = true; //3
                            kickDelayCheckCounter15 = 1;
                            //Log.d("checkkick", "kick placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(kickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][1] = true; //3
                            kickReverbDelayCheckCounter = 1;
                            //Log.d("checkkick", "kick placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][1] = true; //3
                            kickReverbDelayCheckCounter1 = 1;
                            //Log.d("checkkick", "kick placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][1] = true; //3
                            kickReverbDelayCheckCounter2 = 1;
                            //Log.d("checkkick", "kick placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][1] = true; //3
                            kickReverbDelayCheckCounter3 = 1;
                            //Log.d("checkkick", "kick placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][1] = true; //3
                            kickReverbDelayCheckCounter4 = 1;
                            //Log.d("checkkick", "kick placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][1] = true; //3
                            kickReverbDelayCheckCounter5 = 1;
                            //Log.d("checkkick", "kick placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][1] = true; //3
                            kickReverbDelayCheckCounter6 = 1;
                            //Log.d("checkkick", "kick placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][1] = true; //3
                            kickReverbDelayCheckCounter7 = 1;
                            //Log.d("checkkick", "kick placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][1] = true; //3
                            kickReverbDelayCheckCounter8 = 1;
                            //Log.d("checkkick", "kick placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][1] = true; //3
                            kickReverbDelayCheckCounter9 = 1;
                            //Log.d("checkkick", "kick placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][1] = true; //3
                            kickReverbDelayCheckCounter10 = 1;
                            //Log.d("checkkick", "kick placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][1] = true; //3
                            kickReverbDelayCheckCounter11 = 1;
                            //Log.d("checkkick", "kick placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][1] = true; //3
                            kickReverbDelayCheckCounter12 = 1;
                            //Log.d("checkkick", "kick placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][1] = true; //3
                            kickReverbDelayCheckCounter13 = 1;
                            //Log.d("checkkick", "kick placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][1] = true; //3
                            kickReverbDelayCheckCounter14 = 1;
                            //Log.d("checkkick", "kick placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][1] = true; //3
                            kickReverbDelayCheckCounter15 = 1;
                            //Log.d("checkkick", "kick placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(electronickickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(electronickickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(electronickickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(electronickickreverb, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][1] = true; //3
                            electronicKickReverbCheckCounter = 1;
                            //Log.d("checkkick", "kick placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][1] = true; //3
                            electronicKickReverbCheckCounter1 = 1;
                            //Log.d("checkkick", "kick placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][1] = true; //3
                            electronicKickReverbCheckCounter2 = 1;
                            //Log.d("checkkick", "kick placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][1] = true; //3
                            electronicKickReverbCheckCounter3 = 1;
                            //Log.d("checkkick", "kick placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][1] = true; //3
                            electronicKickReverbCheckCounter4 = 1;
                            //Log.d("checkkick", "kick placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][1] = true; //3
                            electronicKickReverbCheckCounter5 = 1;
                            //Log.d("checkkick", "kick placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][1] = true; //3
                            electronicKickReverbCheckCounter6 = 1;
                            //Log.d("checkkick", "kick placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][1] = true; //3
                            electronicKickReverbCheckCounter7 = 1;
                            //Log.d("checkkick", "kick placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][1] = true; //3
                            electronicKickReverbCheckCounter8 = 1;
                            //Log.d("checkkick", "kick placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][1] = true; //3
                            electronicKickReverbCheckCounter9 = 1;
                            //Log.d("checkkick", "kick placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][1] = true; //3
                            electronicKickReverbCheckCounter10 = 1;
                            //Log.d("checkkick", "kick placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][1] = true; //3
                            electronicKickReverbCheckCounter11 = 1;
                            //Log.d("checkkick", "kick placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][1] = true; //3
                            electronicKickReverbCheckCounter12 = 1;
                            //Log.d("checkkick", "kick placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][1] = true; //3
                            electronicKickReverbCheckCounter13 = 1;
                            //Log.d("checkkick", "kick placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][1] = true; //3
                            electronicKickReverbCheckCounter14 = 1;
                            //Log.d("checkkick", "kick placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][1] = true; //3
                            electronicKickReverbCheckCounter15 = 1;
                            //Log.d("checkkick", "kick placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(electronickickdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][1] = true; //3
                            electronicKickDelayCheckCounter = 1;
                            //Log.d("checkkick", "kick placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][1] = true; //3
                            electronicKickDelayCheckCounter1 = 1;
                            //Log.d("checkkick", "kick placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][1] = true; //3
                            electronicKickDelayCheckCounter2 = 1;
                            //Log.d("checkkick", "kick placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][1] = true; //3
                            electronicKickDelayCheckCounter3 = 1;
                            //Log.d("checkkick", "kick placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][1] = true; //3
                            electronicKickDelayCheckCounter4 = 1;
                            //Log.d("checkkick", "kick placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][1] = true; //3
                            electronicKickDelayCheckCounter5 = 1;
                            //Log.d("checkkick", "kick placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][1] = true; //3
                            electronicKickDelayCheckCounter6 = 1;
                            //Log.d("checkkick", "kick placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][1] = true; //3
                            electronicKickDelayCheckCounter7 = 1;
                            //Log.d("checkkick", "kick placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][1] = true; //3
                            electronicKickDelayCheckCounter8 = 1;
                            //Log.d("checkkick", "kick placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][1] = true; //3
                            electronicKickDelayCheckCounter9 = 1;
                            //Log.d("checkkick", "kick placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][1] = true; //3
                            electronicKickDelayCheckCounter10 = 1;
                            //Log.d("checkkick", "kick placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][1] = true; //3
                            electronicKickDelayCheckCounter11 = 1;
                            //Log.d("checkkick", "kick placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][1] = true; //3
                            electronicKickDelayCheckCounter12 = 1;
                            //Log.d("checkkick", "kick placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][1] = true; //3
                            electronicKickDelayCheckCounter13 = 1;
                            //Log.d("checkkick", "kick placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][1] = true; //3
                            electronicKickDelayCheckCounter14 = 1;
                            //Log.d("checkkick", "kick placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][1] = true; //3
                            electronicKickDelayCheckCounter15 = 1;
                            //Log.d("checkkick", "kick placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(electronickickreverbdelay, progressChangedValueKick, progressChangedValueKick, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][1] = true; //3
                            electronicKickReverbDelayCheckCounter = 1;
                            //Log.d("checkkick", "kick placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][1] = true; //3
                            electronicKickReverbDelayCheckCounter1 = 1;
                            //Log.d("checkkick", "kick placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][1] = true; //3
                            electronicKickReverbDelayCheckCounter2 = 1;
                            //Log.d("checkkick", "kick placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][1] = true; //3
                            electronicKickReverbDelayCheckCounter3 = 1;
                            //Log.d("checkkick", "kick placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][1] = true; //3
                            electronicKickReverbDelayCheckCounter4 = 1;
                            //Log.d("checkkick", "kick placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][1] = true; //3
                            electronicKickReverbDelayCheckCounter5 = 1;
                            //Log.d("checkkick", "kick placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][1] = true; //3
                            electronicKickReverbDelayCheckCounter6 = 1;
                            //Log.d("checkkick", "kick placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][1] = true; //3
                            electronicKickReverbDelayCheckCounter7 = 1;
                            //Log.d("checkkick", "kick placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][1] = true; //3
                            electronicKickReverbDelayCheckCounter8 = 1;
                            //Log.d("checkkick", "kick placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][1] = true; //3
                            electronicKickReverbDelayCheckCounter9 = 1;
                            //Log.d("checkkick", "kick placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][1] = true; //3
                            electronicKickReverbDelayCheckCounter10 = 1;
                            //Log.d("checkkick", "kick placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][1] = true; //3
                            electronicKickReverbDelayCheckCounter11 = 1;
                            //Log.d("checkkick", "kick placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][1] = true; //3
                            electronicKickReverbDelayCheckCounter12 = 1;
                            //Log.d("checkkick", "kick placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][1] = true; //3
                            electronicKickReverbDelayCheckCounter13 = 1;
                            //Log.d("checkkick", "kick placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][1] = true; //3
                            electronicKickReverbDelayCheckCounter14 = 1;
                            //Log.d("checkkick", "kick placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][1] = true; //3
                            electronicKickReverbDelayCheckCounter15 = 1;
                            //Log.d("checkkick", "kick placed in sixteenth bar");
                        }
                    }
                    break;


                case R.id.snareid:
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter == 0 && drumReverbCounter == 0 && drumDelayCounter == 0) {
                    sp.play(electronicsnare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f);
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==0) {
                    sp.play(snare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f);
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==0) {
                    sp.play(electronicsnare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                        sequencerBoolean[0][2] = true; //3
                        electronicSnareCheckCounter = 1;
                        //Log.d("checksnare", "snare placed in first bar");
                    }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                        sequencerBoolean[1][2] = true; //3
                        electronicSnareCheckCounter1 = 1;
                        //Log.d("checksnare", "snare placed in second bar");
                    }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                        sequencerBoolean[2][2] = true; //3
                        electronicSnareCheckCounter2 = 1;
                        //Log.d("checksnare", "snare placed in third bar");
                    }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                        sequencerBoolean[3][2] = true; //3
                        electronicSnareCheckCounter3 = 1;
                        //Log.d("checksnare", "snare placed in fourth bar");
                    }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                        sequencerBoolean[4][2] = true; //3
                        electronicSnareCheckCounter4 = 1;
                        //Log.d("checksnare", "snare placed in fifth bar");
                    }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                        sequencerBoolean[5][2] = true; //3
                        electronicSnareCheckCounter5 = 1;
                        //Log.d("checksnare", "snare placed in sixth bar");
                    }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                        sequencerBoolean[6][2] = true; //3
                        electronicSnareCheckCounter6 = 1;
                        //Log.d("checksnare", "snare placed in seventh bar");
                    }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                        sequencerBoolean[7][2] = true; //3
                        electronicSnareCheckCounter7 = 1;
                        //Log.d("checksnare", "snare placed in eight bar");
                    }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                        sequencerBoolean[8][2] = true; //3
                        electronicSnareCheckCounter8 = 1;
                        //Log.d("checksnare", "snare placed in ninth bar");
                    }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                        sequencerBoolean[9][2] = true; //3
                        electronicSnareCheckCounter9 = 1;
                        //Log.d("checksnare", "snare placed in tenth bar");
                    }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                        sequencerBoolean[10][2] = true; //3
                        electronicSnareCheckCounter10 = 1;
                        //Log.d("checksnare", "snare placed in eleventh bar");
                    }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                        sequencerBoolean[11][2] = true; //3
                        electronicSnareCheckCounter11 = 1;
                        //Log.d("checksnare", "snare placed in twelfth bar");
                    }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                        sequencerBoolean[12][2] = true; //3
                        electronicSnareCheckCounter12 = 1;
                        //Log.d("checksnare", "snare placed in thirteenth bar");
                    }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                        sequencerBoolean[13][2] = true; //3
                        electronicSnareCheckCounter13 = 1;
                        //Log.d("checksnare", "snare placed in fourteenth bar");
                    }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                        sequencerBoolean[14][2] = true; //3
                        electronicSnareCheckCounter14 = 1;
                        //Log.d("checksnare", "snare placed in fifteenth bar");
                    }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                        sequencerBoolean[15][2] = true; //3
                        electronicSnareCheckCounter15 = 1;
                        //Log.d("checksnare", "snare placed in sixteenth bar");
                    }
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==0) {
                    sp.play(snare, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                        sequencerBoolean[0][2] = true; //3
                        snareCheckCounter = 1;
                        //Log.d("checksnare", "snare placed in first bar");
                    }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                        sequencerBoolean[1][2] = true; //3
                        snareCheckCounter1 = 1;
                        //Log.d("checksnare", "snare placed in second bar");
                    }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                        sequencerBoolean[2][2] = true; //3
                        snareCheckCounter2 = 1;
                        //Log.d("checksnare", "snare placed in third bar");
                    }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                        sequencerBoolean[3][2] = true; //3
                        snareCheckCounter3 = 1;
                        //Log.d("checksnare", "snare placed in fourth bar");
                    }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                        sequencerBoolean[4][2] = true; //3
                        snareCheckCounter4 = 1;
                        //Log.d("checksnare", "snare placed in fifth bar");
                    }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                        sequencerBoolean[5][2] = true; //3
                        snareCheckCounter5 = 1;
                        //Log.d("checksnare", "snare placed in sixth bar");
                    }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                        sequencerBoolean[6][2] = true; //3
                        snareCheckCounter6 = 1;
                        //Log.d("checksnare", "snare placed in seventh bar");
                    }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                        sequencerBoolean[7][2] = true; //3
                        snareCheckCounter7 = 1;
                        //Log.d("checksnare", "snare placed in eight bar");
                    }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                        sequencerBoolean[8][2] = true; //3
                        snareCheckCounter8 = 1;
                        //Log.d("checksnare", "snare placed in ninth bar");
                    }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                        sequencerBoolean[9][2] = true; //3
                        snareCheckCounter9 = 1;
                        //Log.d("checksnare", "snare placed in tenth bar");
                    }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                        sequencerBoolean[10][2] = true; //3
                        snareCheckCounter10 = 1;
                        //Log.d("checksnare", "snare placed in eleventh bar");
                    }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                        sequencerBoolean[11][2] = true; //3
                        snareCheckCounter11 = 1;
                        //Log.d("checksnare", "snare placed in twelfth bar");
                    }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                        sequencerBoolean[12][2] = true; //3
                        snareCheckCounter12 = 1;
                        //Log.d("checksnare", "snare placed in thirteenth bar");
                    }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                        sequencerBoolean[13][2] = true; //3
                        snareCheckCounter13 = 1;
                        //Log.d("checksnare", "snare placed in fourteenth bar");
                    }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                        sequencerBoolean[14][2] = true; //3
                        snareCheckCounter14 = 1;
                        //Log.d("checksnare", "snare placed in fifteenth bar");
                    }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                        sequencerBoolean[15][2] = true; //3
                        snareCheckCounter15 = 1;
                        //Log.d("checksnare", "snare placed in sixteenth bar");
                    }
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==0) {
                    sp.play(snarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f);
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==1) {
                    sp.play(snaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f);
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==1) {
                    sp.play(snarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f);
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==0) {
                    sp.play(snarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                        sequencerBoolean[0][2] = true; //3
                        snareReverbCheckCounter = 1;
                        //Log.d("checksnare", "snare placed in first bar");
                    }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                        sequencerBoolean[1][2] = true; //3
                        snareReverbCheckCounter1 = 1;
                        //Log.d("checksnare", "snare placed in second bar");
                    }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                        sequencerBoolean[2][2] = true; //3
                        snareReverbCheckCounter2 = 1;
                        //Log.d("checksnare", "snare placed in third bar");
                    }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                        sequencerBoolean[3][2] = true; //3
                        snareReverbCheckCounter3 = 1;
                        //Log.d("checksnare", "snare placed in fourth bar");
                    }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                        sequencerBoolean[4][2] = true; //3
                        snareReverbCheckCounter4 = 1;
                        //Log.d("checksnare", "snare placed in fifth bar");
                    }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                        sequencerBoolean[5][2] = true; //3
                        snareReverbCheckCounter5 = 1;
                        //Log.d("checksnare", "snare placed in sixth bar");
                    }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                        sequencerBoolean[6][2] = true; //3
                        snareReverbCheckCounter6 = 1;
                        //Log.d("checksnare", "snare placed in seventh bar");
                    }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                        sequencerBoolean[7][2] = true; //3
                        snareReverbCheckCounter7 = 1;
                        //Log.d("checksnare", "snare placed in eight bar");
                    }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                        sequencerBoolean[8][2] = true; //3
                        snareReverbCheckCounter8 = 1;
                        //Log.d("checksnare", "snare placed in ninth bar");
                    }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                        sequencerBoolean[9][2] = true; //3
                        snareReverbCheckCounter9 = 1;
                        //Log.d("checksnare", "snare placed in tenth bar");
                    }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                        sequencerBoolean[10][2] = true; //3
                        snareReverbCheckCounter10 = 1;
                        //Log.d("checksnare", "snare placed in eleventh bar");
                    }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                        sequencerBoolean[11][2] = true; //3
                        snareReverbCheckCounter11 = 1;
                        //Log.d("checksnare", "snare placed in twelfth bar");
                    }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                        sequencerBoolean[12][2] = true; //3
                        snareReverbCheckCounter12 = 1;
                        //Log.d("checksnare", "snare placed in thirteenth bar");
                    }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                        sequencerBoolean[13][2] = true; //3
                        snareReverbCheckCounter13 = 1;
                        //Log.d("checksnare", "snare placed in fourteenth bar");
                    }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                        sequencerBoolean[14][2] = true; //3
                        snareReverbCheckCounter14 = 1;
                        //Log.d("checksnare", "snare placed in fifteenth bar");
                    }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                        sequencerBoolean[15][2] = true; //3
                        snareReverbCheckCounter15 = 1;
                        //Log.d("checksnare", "snare placed in sixteenth bar");
                    }
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==1) {
                    sp.play(snaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                        sequencerBoolean[0][2] = true; //3
                        snareDelayCheckCounter = 1;
                        //Log.d("checksnare", "snare placed in first bar");
                    }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                        sequencerBoolean[1][2] = true; //3
                        snareDelayCheckCounter1 = 1;
                        //Log.d("checksnare", "snare placed in second bar");
                    }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                        sequencerBoolean[2][2] = true; //3
                        snareDelayCheckCounter2 = 1;
                        //Log.d("checksnare", "snare placed in third bar");
                    }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                        sequencerBoolean[3][2] = true; //3
                        snareDelayCheckCounter3 = 1;
                        //Log.d("checksnare", "snare placed in fourth bar");
                    }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                        sequencerBoolean[4][2] = true; //3
                        snareDelayCheckCounter4 = 1;
                        //Log.d("checksnare", "snare placed in fifth bar");
                    }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                        sequencerBoolean[5][2] = true; //3
                        snareDelayCheckCounter5 = 1;
                        //Log.d("checksnare", "snare placed in sixth bar");
                    }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                        sequencerBoolean[6][2] = true; //3
                        snareDelayCheckCounter6 = 1;
                        //Log.d("checksnare", "snare placed in seventh bar");
                    }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                        sequencerBoolean[7][2] = true; //3
                        snareDelayCheckCounter7 = 1;
                        //Log.d("checksnare", "snare placed in eight bar");
                    }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                        sequencerBoolean[8][2] = true; //3
                        snareDelayCheckCounter8 = 1;
                        //Log.d("checksnare", "snare placed in ninth bar");
                    }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                        sequencerBoolean[9][2] = true; //3
                        snareDelayCheckCounter9 = 1;
                        //Log.d("checksnare", "snare placed in tenth bar");
                    }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                        sequencerBoolean[10][2] = true; //3
                        snareDelayCheckCounter10 = 1;
                        //Log.d("checksnare", "snare placed in eleventh bar");
                    }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                        sequencerBoolean[11][2] = true; //3
                        snareDelayCheckCounter11 = 1;
                        //Log.d("checksnare", "snare placed in twelfth bar");
                    }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                        sequencerBoolean[12][2] = true; //3
                        snareDelayCheckCounter12 = 1;
                        //Log.d("checksnare", "snare placed in thirteenth bar");
                    }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                        sequencerBoolean[13][2] = true; //3
                        snareDelayCheckCounter13 = 1;
                        //Log.d("checksnare", "snare placed in fourteenth bar");
                    }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                        sequencerBoolean[14][2] = true; //3
                        snareDelayCheckCounter14 = 1;
                        //Log.d("checksnare", "snare placed in fifteenth bar");
                    }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                        sequencerBoolean[15][2] = true; //3
                        snareDelayCheckCounter15 = 1;
                        //Log.d("checksnare", "snare placed in sixteenth bar");
                    }
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==1) {
                    sp.play(snarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                        sequencerBoolean[0][2] = true; //3
                        snareReverbDelayCheckCounter = 1;
                        //Log.d("checksnare", "snare placed in first bar");
                    }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                        sequencerBoolean[1][2] = true; //3
                        snareReverbDelayCheckCounter1 = 1;
                        //Log.d("checksnare", "snare placed in second bar");
                    }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                        sequencerBoolean[2][2] = true; //3
                        snareReverbDelayCheckCounter2 = 1;
                        //Log.d("checksnare", "snare placed in third bar");
                    }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                        sequencerBoolean[3][2] = true; //3
                        snareReverbDelayCheckCounter3 = 1;
                        //Log.d("checksnare", "snare placed in fourth bar");
                    }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                        sequencerBoolean[4][2] = true; //3
                        snareReverbDelayCheckCounter4 = 1;
                        //Log.d("checksnare", "snare placed in fifth bar");
                    }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                        sequencerBoolean[5][2] = true; //3
                        snareReverbDelayCheckCounter5 = 1;
                        //Log.d("checksnare", "snare placed in sixth bar");
                    }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                        sequencerBoolean[6][2] = true; //3
                        snareReverbDelayCheckCounter6 = 1;
                        //Log.d("checksnare", "snare placed in seventh bar");
                    }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                        sequencerBoolean[7][2] = true; //3
                        snareReverbDelayCheckCounter7 = 1;
                        //Log.d("checksnare", "snare placed in eight bar");
                    }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                        sequencerBoolean[8][2] = true; //3
                        snareReverbDelayCheckCounter8 = 1;
                        //Log.d("checksnare", "snare placed in ninth bar");
                    }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                        sequencerBoolean[9][2] = true; //3
                        snareReverbDelayCheckCounter9 = 1;
                        //Log.d("checksnare", "snare placed in tenth bar");
                    }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                        sequencerBoolean[10][2] = true; //3
                        snareReverbDelayCheckCounter10 = 1;
                        //Log.d("checksnare", "snare placed in eleventh bar");
                    }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                        sequencerBoolean[11][2] = true; //3
                        snareReverbDelayCheckCounter11 = 1;
                        //Log.d("checksnare", "snare placed in twelfth bar");
                    }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                        sequencerBoolean[12][2] = true; //3
                        snareReverbDelayCheckCounter12 = 1;
                        //Log.d("checksnare", "snare placed in thirteenth bar");
                    }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                        sequencerBoolean[13][2] = true; //3
                        snareReverbDelayCheckCounter13 = 1;
                        //Log.d("checksnare", "snare placed in fourteenth bar");
                    }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                        sequencerBoolean[14][2] = true; //3
                        snareReverbDelayCheckCounter14 = 1;
                        //Log.d("checksnare", "snare placed in fifteenth bar");
                    }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                        sequencerBoolean[15][2] = true; //3
                        snareReverbDelayCheckCounter15 = 1;
                        //Log.d("checksnare", "snare placed in sixteenth bar");
                    }
                }

                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==0) {
                    sp.play(electronicsnarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f);
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==1) {
                    sp.play(electronicsnaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f);
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==1) {
                    sp.play(electronicsnarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f);
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==0) {
                    sp.play(electronicsnarereverb, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                        sequencerBoolean[0][2] = true; //3
                        electronicSnareReverbCheckCounter = 1;
                        //Log.d("checksnare", "snare placed in first bar");
                    }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                        sequencerBoolean[1][2] = true; //3
                        electronicSnareReverbCheckCounter1 = 1;
                        //Log.d("checksnare", "snare placed in second bar");
                    }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                        sequencerBoolean[2][2] = true; //3
                        electronicSnareReverbCheckCounter2 = 1;
                        //Log.d("checksnare", "snare placed in third bar");
                    }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                        sequencerBoolean[3][2] = true; //3
                        electronicSnareReverbCheckCounter3 = 1;
                        //Log.d("checksnare", "snare placed in fourth bar");
                    }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                        sequencerBoolean[4][2] = true; //3
                        electronicSnareReverbCheckCounter4 = 1;
                        //Log.d("checksnare", "snare placed in fifth bar");
                    }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                        sequencerBoolean[5][2] = true; //3
                        electronicSnareReverbCheckCounter5 = 1;
                        //Log.d("checksnare", "snare placed in sixth bar");
                    }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                        sequencerBoolean[6][2] = true; //3
                        electronicSnareReverbCheckCounter6 = 1;
                        //Log.d("checksnare", "snare placed in seventh bar");
                    }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                        sequencerBoolean[7][2] = true; //3
                        electronicSnareReverbCheckCounter7 = 1;
                        //Log.d("checksnare", "snare placed in eight bar");
                    }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                        sequencerBoolean[8][2] = true; //3
                        electronicSnareReverbCheckCounter8 = 1;
                        //Log.d("checksnare", "snare placed in ninth bar");
                    }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                        sequencerBoolean[9][2] = true; //3
                        electronicSnareReverbCheckCounter9 = 1;
                        //Log.d("checksnare", "snare placed in tenth bar");
                    }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                        sequencerBoolean[10][2] = true; //3
                        electronicSnareReverbCheckCounter10 = 1;
                        //Log.d("checksnare", "snare placed in eleventh bar");
                    }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                        sequencerBoolean[11][2] = true; //3
                        electronicSnareReverbCheckCounter11 = 1;
                        //Log.d("checksnare", "snare placed in twelfth bar");
                    }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                        sequencerBoolean[12][2] = true; //3
                        electronicSnareReverbCheckCounter12 = 1;
                        //Log.d("checksnare", "snare placed in thirteenth bar");
                    }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                        sequencerBoolean[13][2] = true; //3
                        electronicSnareReverbCheckCounter13 = 1;
                        //Log.d("checksnare", "snare placed in fourteenth bar");
                    }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                        sequencerBoolean[14][2] = true; //3
                        electronicSnareReverbCheckCounter14 = 1;
                        //Log.d("checksnare", "snare placed in fifteenth bar");
                    }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                        sequencerBoolean[15][2] = true; //3
                        electronicSnareReverbCheckCounter15 = 1;
                        //Log.d("checksnare", "snare placed in sixteenth bar");
                    }
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==1) {
                    sp.play(electronicsnaredelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                        sequencerBoolean[0][2] = true; //3
                        electronicSnareDelayCheckCounter = 1;
                        //Log.d("checksnare", "snare placed in first bar");
                    }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                        sequencerBoolean[1][2] = true; //3
                        electronicSnareDelayCheckCounter1 = 1;
                        //Log.d("checksnare", "snare placed in second bar");
                    }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                        sequencerBoolean[2][2] = true; //3
                        electronicSnareDelayCheckCounter2 = 1;
                        //Log.d("checksnare", "snare placed in third bar");
                    }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                        sequencerBoolean[3][2] = true; //3
                        electronicSnareDelayCheckCounter3 = 1;
                        //Log.d("checksnare", "snare placed in fourth bar");
                    }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                        sequencerBoolean[4][2] = true; //3
                        electronicSnareDelayCheckCounter4 = 1;
                        //Log.d("checksnare", "snare placed in fifth bar");
                    }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                        sequencerBoolean[5][2] = true; //3
                        electronicSnareDelayCheckCounter5 = 1;
                        //Log.d("checksnare", "snare placed in sixth bar");
                    }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                        sequencerBoolean[6][2] = true; //3
                        electronicSnareDelayCheckCounter6 = 1;
                        //Log.d("checksnare", "snare placed in seventh bar");
                    }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                        sequencerBoolean[7][2] = true; //3
                        electronicSnareDelayCheckCounter7 = 1;
                        //Log.d("checksnare", "snare placed in eight bar");
                    }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                        sequencerBoolean[8][2] = true; //3
                        electronicSnareDelayCheckCounter8 = 1;
                        //Log.d("checksnare", "snare placed in ninth bar");
                    }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                        sequencerBoolean[9][2] = true; //3
                        electronicSnareDelayCheckCounter9 = 1;
                        //Log.d("checksnare", "snare placed in tenth bar");
                    }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                        sequencerBoolean[10][2] = true; //3
                        electronicSnareDelayCheckCounter10 = 1;
                        //Log.d("checksnare", "snare placed in eleventh bar");
                    }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                        sequencerBoolean[11][2] = true; //3
                        electronicSnareDelayCheckCounter11 = 1;
                        //Log.d("checksnare", "snare placed in twelfth bar");
                    }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                        sequencerBoolean[12][2] = true; //3
                        electronicSnareDelayCheckCounter12 = 1;
                        //Log.d("checksnare", "snare placed in thirteenth bar");
                    }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                        sequencerBoolean[13][2] = true; //3
                        electronicSnareDelayCheckCounter13 = 1;
                        //Log.d("checksnare", "snare placed in fourteenth bar");
                    }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                        sequencerBoolean[14][2] = true; //3
                        electronicSnareDelayCheckCounter14 = 1;
                        //Log.d("checksnare", "snare placed in fifteenth bar");
                    }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                        sequencerBoolean[15][2] = true; //3
                        electronicSnareDelayCheckCounter15 = 1;
                        //Log.d("checksnare", "snare placed in sixteenth bar");
                    }
                }
                if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==1) {
                    sp.play(electronicsnarereverbdelay, progressChangedValueSnare, progressChangedValueSnare, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                        sequencerBoolean[0][2] = true; //3
                        electronicSnareReverbDelayCheckCounter = 1;
                        //Log.d("checksnare", "snare placed in first bar");
                    }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                        sequencerBoolean[1][2] = true; //3
                        electronicSnareReverbDelayCheckCounter1 = 1;
                        //Log.d("checksnare", "snare placed in second bar");
                    }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                        sequencerBoolean[2][2] = true; //3
                        electronicSnareReverbDelayCheckCounter2 = 1;
                        //Log.d("checksnare", "snare placed in third bar");
                    }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                        sequencerBoolean[3][2] = true; //3
                        electronicSnareReverbDelayCheckCounter3 = 1;
                        //Log.d("checksnare", "snare placed in fourth bar");
                    }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                        sequencerBoolean[4][2] = true; //3
                        electronicSnareReverbDelayCheckCounter4 = 1;
                        //Log.d("checksnare", "snare placed in fifth bar");
                    }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                        sequencerBoolean[5][2] = true; //3
                        electronicSnareReverbDelayCheckCounter5 = 1;
                        //Log.d("checksnare", "snare placed in sixth bar");
                    }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                        sequencerBoolean[6][2] = true; //3
                        electronicSnareReverbDelayCheckCounter6 = 1;
                        //Log.d("checksnare", "snare placed in seventh bar");
                    }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                        sequencerBoolean[7][2] = true; //3
                        electronicSnareReverbDelayCheckCounter7 = 1;
                        //Log.d("checksnare", "snare placed in eight bar");
                    }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                        sequencerBoolean[8][2] = true; //3
                        electronicSnareReverbDelayCheckCounter8 = 1;
                        //Log.d("checksnare", "snare placed in ninth bar");
                    }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                        sequencerBoolean[9][2] = true; //3
                        electronicSnareReverbDelayCheckCounter9 = 1;
                        //Log.d("checksnare", "snare placed in tenth bar");
                    }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                        sequencerBoolean[10][2] = true; //3
                        electronicSnareReverbDelayCheckCounter10 = 1;
                        //Log.d("checksnare", "snare placed in eleventh bar");
                    }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                        sequencerBoolean[11][2] = true; //3
                        electronicSnareReverbDelayCheckCounter11 = 1;
                        //Log.d("checksnare", "snare placed in twelfth bar");
                    }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                        sequencerBoolean[12][2] = true; //3
                        electronicSnareReverbDelayCheckCounter12 = 1;
                        //Log.d("checksnare", "snare placed in thirteenth bar");
                    }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                        sequencerBoolean[13][2] = true; //3
                        electronicSnareReverbDelayCheckCounter13 = 1;
                        //Log.d("checksnare", "snare placed in fourteenth bar");
                    }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                        sequencerBoolean[14][2] = true; //3
                        electronicSnareReverbDelayCheckCounter14 = 1;
                        //Log.d("checksnare", "snare placed in fifteenth bar");
                    }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                        sequencerBoolean[15][2] = true; //3
                        electronicSnareReverbDelayCheckCounter15 = 1;
                        //Log.d("checksnare", "snare placed in sixteenth bar");
                    }
                }
                break;

                case R.id.hihatopenid:
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(electronichihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(hihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(electronichihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][3] = true; //3
                            electronicHiHatOpenCheckCounter = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][3] = true; //3
                            electronicHiHatOpenCheckCounter1 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][3] = true; //3
                            electronicHiHatOpenCheckCounter2 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][3] = true; //3
                            electronicHiHatOpenCheckCounter3 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][3] = true; //3
                            electronicHiHatOpenCheckCounter4 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][3] = true; //3
                            electronicHiHatOpenCheckCounter5 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][3] = true; //3
                            electronicHiHatOpenCheckCounter6 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][3] = true; //3
                            electronicHiHatOpenCheckCounter7 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][3] = true; //3
                            electronicHiHatOpenCheckCounter8 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][3] = true; //3
                            electronicHiHatOpenCheckCounter9 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][3] = true; //3
                            electronicHiHatOpenCheckCounter10 = 1;
                            //Log.d("checksnare", "hihatopen placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][3] = true; //3
                            electronicHiHatOpenCheckCounter11 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][3] = true; //3
                            electronicHiHatOpenCheckCounter12 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][3] = true; //3
                            electronicHiHatOpenCheckCounter13 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][3] = true; //3
                            electronicHiHatOpenCheckCounter14 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][3] = true; //3
                            electronicHiHatOpenCheckCounter15 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(hihatopen, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][3] = true; //3
                            hiHatOpenCheckCounter = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][3] = true; //3
                            hiHatOpenCheckCounter1 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][3] = true; //3
                            hiHatOpenCheckCounter2 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][3] = true; //3
                            hiHatOpenCheckCounter3 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][3] = true; //3
                            hiHatOpenCheckCounter4 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][3] = true; //3
                            hiHatOpenCheckCounter5 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][3] = true; //3
                            hiHatOpenCheckCounter6 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][3] = true; //3
                            hiHatOpenCheckCounter7 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][3] = true; //3
                            hiHatOpenCheckCounter8 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][3] = true; //3
                            hiHatOpenCheckCounter9 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][3] = true; //3
                            hiHatOpenCheckCounter10 = 1;
                            //Log.d("checksnare", "hihatopen placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][3] = true; //3
                            hiHatOpenCheckCounter11 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][3] = true; //3
                            hiHatOpenCheckCounter12 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][3] = true; //3
                            hiHatOpenCheckCounter13 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][3] = true; //3
                            hiHatOpenCheckCounter14 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][3] = true; //3
                            hiHatOpenCheckCounter15 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in sixteenth bar");
                        }
                    }

                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(hihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(hihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(hihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(hihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][3] = true; //3
                            hiHatOpenReverbCheckCounter = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][3] = true; //3
                            hiHatOpenReverbCheckCounter1 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][3] = true; //3
                            hiHatOpenReverbCheckCounter2 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][3] = true; //3
                            hiHatOpenReverbCheckCounter3 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][3] = true; //3
                            hiHatOpenReverbCheckCounter4 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][3] = true; //3
                            hiHatOpenReverbCheckCounter5 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][3] = true; //3
                            hiHatOpenReverbCheckCounter6 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][3] = true; //3
                            hiHatOpenReverbCheckCounter7 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][3] = true; //3
                            hiHatOpenReverbCheckCounter8 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][3] = true; //3
                            hiHatOpenReverbCheckCounter9 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][3] = true; //3
                            hiHatOpenReverbCheckCounter10 = 1;
                            Log.d("checksnare", "hihatopen placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][3] = true; //3
                            hiHatOpenReverbCheckCounter11 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][3] = true; //3
                            hiHatOpenReverbCheckCounter12 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][3] = true; //3
                            hiHatOpenReverbCheckCounter13 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][3] = true; //3
                            hiHatOpenReverbCheckCounter14 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][3] = true; //3
                            hiHatOpenReverbCheckCounter15 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(hihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][3] = true; //3
                            hiHatOpenDelayCheckCounter = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][3] = true; //3
                            hiHatOpenDelayCheckCounter1 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][3] = true; //3
                            hiHatOpenDelayCheckCounter2 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][3] = true; //3
                            hiHatOpenDelayCheckCounter3 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][3] = true; //3
                            hiHatOpenDelayCheckCounter4 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][3] = true; //3
                            hiHatOpenDelayCheckCounter5 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][3] = true; //3
                            hiHatOpenDelayCheckCounter6 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][3] = true; //3
                            hiHatOpenDelayCheckCounter7 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][3] = true; //3
                            hiHatOpenDelayCheckCounter8 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][3] = true; //3
                            hiHatOpenDelayCheckCounter9 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][3] = true; //3
                            hiHatOpenDelayCheckCounter10 = 1;
                            //Log.d("checksnare", "hihatopen placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][3] = true; //3
                            hiHatOpenDelayCheckCounter11 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][3] = true; //3
                            hiHatOpenDelayCheckCounter12 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][3] = true; //3
                            hiHatOpenDelayCheckCounter13 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][3] = true; //3
                            hiHatOpenDelayCheckCounter14 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][3] = true; //3
                            hiHatOpenDelayCheckCounter15 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(hihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][3] = true; //3
                            hiHatOpenReverbDelayCheckCounter = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][3] = true; //3
                            hiHatOpenReverbDelayCheckCounter1 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][3] = true; //3
                            hiHatOpenReverbDelayCheckCounter2 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][3] = true; //3
                            hiHatOpenReverbDelayCheckCounter3 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][3] = true; //3
                            hiHatOpenReverbDelayCheckCounter4 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][3] = true; //3
                            hiHatOpenReverbDelayCheckCounter5 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][3] = true; //3
                            hiHatOpenReverbDelayCheckCounter6 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][3] = true; //3
                            hiHatOpenReverbDelayCheckCounter7 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][3] = true; //3
                            hiHatOpenReverbDelayCheckCounter8 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][3] = true; //3
                            hiHatOpenReverbDelayCheckCounter9 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][3] = true; //3
                            hiHatOpenReverbDelayCheckCounter10 = 1;
                            //Log.d("checksnare", "hihatopen placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][3] = true; //3
                            hiHatOpenReverbDelayCheckCounter11 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][3] = true; //3
                            hiHatOpenReverbDelayCheckCounter12 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][3] = true; //3
                            hiHatOpenReverbDelayCheckCounter13 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][3] = true; //3
                            hiHatOpenReverbDelayCheckCounter14 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][3] = true; //3
                            hiHatOpenReverbDelayCheckCounter15 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in sixteenth bar");
                        }
                    }

                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(electronichihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(electronichihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(electronichihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(electronichihatopenreverb, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][3] = true; //3
                            electronicHiHatOpenReverbCheckCounter = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][3] = true; //3
                            electronicHiHatOpenReverbCheckCounter1 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][3] = true; //3
                            electronicHiHatOpenReverbCheckCounter2 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][3] = true; //3
                            electronicHiHatOpenReverbCheckCounter3 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][3] = true; //3
                            electronicHiHatOpenReverbCheckCounter4 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][3] = true; //3
                            electronicHiHatOpenReverbCheckCounter5 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][3] = true; //3
                            electronicHiHatOpenReverbCheckCounter6 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][3] = true; //3
                            electronicHiHatOpenReverbCheckCounter7 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][3] = true; //3
                            electronicHiHatOpenReverbCheckCounter8 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][3] = true; //3
                            electronicHiHatOpenReverbCheckCounter9 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][3] = true; //3
                            electronicHiHatOpenReverbCheckCounter10 = 1;
                            //Log.d("checksnare", "hihatopen placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][3] = true; //3
                            electronicHiHatOpenReverbCheckCounter11 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][3] = true; //3
                            electronicHiHatOpenReverbCheckCounter12 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][3] = true; //3
                            electronicHiHatOpenReverbCheckCounter13 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][3] = true; //3
                            electronicHiHatOpenReverbCheckCounter14 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][3] = true; //3
                            electronicHiHatOpenReverbCheckCounter15 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(electronichihatopendelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][3] = true; //3
                            electronicHiHatOpenDelayCheckCounter = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][3] = true; //3
                            electronicHiHatOpenDelayCheckCounter1 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][3] = true; //3
                            electronicHiHatOpenDelayCheckCounter2 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][3] = true; //3
                            electronicHiHatOpenDelayCheckCounter3 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][3] = true; //3
                            electronicHiHatOpenDelayCheckCounter4 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][3] = true; //3
                            electronicHiHatOpenDelayCheckCounter5 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][3] = true; //3
                            electronicHiHatOpenDelayCheckCounter6 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][3] = true; //3
                            electronicHiHatOpenDelayCheckCounter7 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][3] = true; //3
                            electronicHiHatOpenDelayCheckCounter8 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][3] = true; //3
                            electronicHiHatOpenDelayCheckCounter9 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][3] = true; //3
                            electronicHiHatOpenDelayCheckCounter10 = 1;
                            //Log.d("checksnare", "hihatopen placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][3] = true; //3
                            electronicHiHatOpenDelayCheckCounter11 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][3] = true; //3
                            electronicHiHatOpenDelayCheckCounter12 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][3] = true; //3
                            electronicHiHatOpenDelayCheckCounter13 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][3] = true; //3
                            electronicHiHatOpenDelayCheckCounter14 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][3] = true; //3
                            electronicHiHatOpenDelayCheckCounter15 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(electronichihatopenreverbdelay, progressChangedValueHiHatOpen, progressChangedValueHiHatOpen, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][3] = true; //3
                            electronicHiHatOpenReverbDelayCheckCounter = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][3] = true; //3
                            electronicHiHatOpenReverbDelayCheckCounter1 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][3] = true; //3
                            electronicHiHatOpenReverbDelayCheckCounter2 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][3] = true; //3
                            electronicHiHatOpenReverbDelayCheckCounter3 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][3] = true; //3
                            electronicHiHatOpenReverbDelayCheckCounter4 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][3] = true; //3
                            electronicHiHatOpenReverbDelayCheckCounter5 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][3] = true; //3
                            electronicHiHatOpenReverbDelayCheckCounter6 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][3] = true; //3
                            electronicHiHatOpenReverbDelayCheckCounter7 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][3] = true; //3
                            electronicHiHatOpenReverbDelayCheckCounter8 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][3] = true; //3
                            electronicHiHatOpenReverbDelayCheckCounter9 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][3] = true; //3
                            electronicHiHatOpenReverbDelayCheckCounter10 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][3] = true; //3
                            electronicHiHatOpenReverbDelayCheckCounter11 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][3] = true; //3
                            electronicHiHatOpenReverbDelayCheckCounter12 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][3] = true; //3
                            electronicHiHatOpenReverbDelayCheckCounter13 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][3] = true; //3
                            electronicHiHatOpenReverbDelayCheckCounter14 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][3] = true; //3
                            electronicHiHatOpenReverbDelayCheckCounter15 = 1;
                            //Log.d("checkhihatopen", "hihatopen placed in sixteenth bar");
                        }
                    }
                    break;


                case R.id.hihatclosedid:
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(electronichihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(hihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(electronichihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][4] = true; //3
                            electronicHiHatClosedCheckCounter = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][4] = true; //3
                            electronicHiHatClosedCheckCounter1 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][4] = true; //3
                            electronicHiHatClosedCheckCounter2 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][4] = true; //3
                            electronicHiHatClosedCheckCounter3 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][4] = true; //3
                            electronicHiHatClosedCheckCounter4 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][4] = true; //3
                            electronicHiHatClosedCheckCounter5 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][4] = true; //3
                            electronicHiHatClosedCheckCounter6 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][4] = true; //3
                            electronicHiHatClosedCheckCounter7 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][4] = true; //3
                            electronicHiHatClosedCheckCounter8 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][4] = true; //3
                            electronicHiHatClosedCheckCounter9 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][4] = true; //3
                            electronicHiHatClosedCheckCounter10 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][4] = true; //3
                            electronicHiHatClosedCheckCounter11 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][4] = true; //3
                            electronicHiHatClosedCheckCounter12 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][4] = true; //3
                            electronicHiHatClosedCheckCounter13 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][4] = true; //3
                            electronicHiHatClosedCheckCounter14 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][4] = true; //3
                            electronicHiHatClosedCheckCounter15 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(hihatclosed, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][4] = true; //3
                            hiHatClosedCheckCounter = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][4] = true; //3
                            hiHatClosedCheckCounter1 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][4] = true; //3
                            hiHatClosedCheckCounter2 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][4] = true; //3
                            hiHatClosedCheckCounter3 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][4] = true; //3
                            hiHatClosedCheckCounter4 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][4] = true; //3
                            hiHatClosedCheckCounter5 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][4] = true; //3
                            hiHatClosedCheckCounter6 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][4] = true; //3
                            hiHatClosedCheckCounter7 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][4] = true; //3
                            hiHatClosedCheckCounter8 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][4] = true; //3
                            hiHatClosedCheckCounter9 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][4] = true; //3
                            hiHatClosedCheckCounter10 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][4] = true; //3
                            hiHatClosedCheckCounter11 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][4] = true; //3
                            hiHatClosedCheckCounter12 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][4] = true; //3
                            hiHatClosedCheckCounter13 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][4] = true; //3
                            hiHatClosedCheckCounter14 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][4] = true; //3
                            hiHatClosedCheckCounter15 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in sixteenth bar");
                        }
                    }

                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(hihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(hihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(hihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(hihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][4] = true; //3
                            hiHatClosedReverbCheckCounter = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][4] = true; //3
                            hiHatClosedReverbCheckCounter1 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][4] = true; //3
                            hiHatClosedReverbCheckCounter2 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][4] = true; //3
                            hiHatClosedReverbCheckCounter3 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][4] = true; //3
                            hiHatClosedReverbCheckCounter4 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][4] = true; //3
                            hiHatClosedReverbCheckCounter5 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][4] = true; //3
                            hiHatClosedReverbCheckCounter6 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][4] = true; //3
                            hiHatClosedReverbCheckCounter7 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][4] = true; //3
                            hiHatClosedReverbCheckCounter8 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][4] = true; //3
                            hiHatClosedReverbCheckCounter9 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][4] = true; //3
                            hiHatClosedReverbCheckCounter10 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][4] = true; //3
                            hiHatClosedReverbCheckCounter11 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][4] = true; //3
                            hiHatClosedReverbCheckCounter12 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][4] = true; //3
                            hiHatClosedReverbCheckCounter13 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][4] = true; //3
                            hiHatClosedReverbCheckCounter14 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][4] = true; //3
                            hiHatClosedReverbCheckCounter15 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(hihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][4] = true; //3
                            hiHatClosedDelayCheckCounter = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][4] = true; //3
                            hiHatClosedDelayCheckCounter1 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][4] = true; //3
                            hiHatClosedDelayCheckCounter2 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][4] = true; //3
                            hiHatClosedDelayCheckCounter3 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][4] = true; //3
                            hiHatClosedDelayCheckCounter4 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][4] = true; //3
                            hiHatClosedDelayCheckCounter5 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][4] = true; //3
                            hiHatClosedDelayCheckCounter6 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][4] = true; //3
                            hiHatClosedDelayCheckCounter7 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][4] = true; //3
                            hiHatClosedDelayCheckCounter8 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][4] = true; //3
                            hiHatClosedDelayCheckCounter9 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][4] = true; //3
                            hiHatClosedDelayCheckCounter10 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][4] = true; //3
                            hiHatClosedDelayCheckCounter11 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][4] = true; //3
                            hiHatClosedDelayCheckCounter12 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][4] = true; //3
                            hiHatClosedDelayCheckCounter13 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][4] = true; //3
                            hiHatClosedDelayCheckCounter14 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][4] = true; //3
                            hiHatClosedDelayCheckCounter15 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(hihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][4] = true; //3
                            hiHatClosedReverbDelayCheckCounter = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][4] = true; //3
                            hiHatClosedReverbDelayCheckCounter1 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][4] = true; //3
                            hiHatClosedReverbDelayCheckCounter2 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][4] = true; //3
                            hiHatClosedReverbDelayCheckCounter3 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][4] = true; //3
                            hiHatClosedReverbDelayCheckCounter4 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][4] = true; //3
                            hiHatClosedReverbDelayCheckCounter5 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][4] = true; //3
                            hiHatClosedReverbDelayCheckCounter6 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][4] = true; //3
                            hiHatClosedReverbDelayCheckCounter7 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][4] = true; //3
                            hiHatClosedReverbDelayCheckCounter8 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][4] = true; //3
                            hiHatClosedReverbDelayCheckCounter9 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][4] = true; //3
                            hiHatClosedReverbDelayCheckCounter10 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][4] = true; //3
                            hiHatClosedReverbDelayCheckCounter11 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][4] = true; //3
                            hiHatClosedReverbDelayCheckCounter12 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][4] = true; //3
                            hiHatClosedReverbDelayCheckCounter13 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][4] = true; //3
                            hiHatClosedReverbDelayCheckCounter14 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][4] = true; //3
                            hiHatClosedReverbDelayCheckCounter15 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in sixteenth bar");
                        }
                    }

                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(electronichihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(electronichihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(electronichihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(electronichihatclosedreverb, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][4] = true; //3
                            electronicHiHatClosedReverbCheckCounter = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][4] = true; //3
                            electronicHiHatClosedReverbCheckCounter1 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][4] = true; //3
                            electronicHiHatClosedReverbCheckCounter2 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][4] = true; //3
                            electronicHiHatClosedReverbCheckCounter3 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][4] = true; //3
                            electronicHiHatClosedReverbCheckCounter4 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][4] = true; //3
                            electronicHiHatClosedReverbCheckCounter5 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][4] = true; //3
                            electronicHiHatClosedReverbCheckCounter6 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][4] = true; //3
                            electronicHiHatClosedReverbCheckCounter7 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][4] = true; //3
                            electronicHiHatClosedReverbCheckCounter8 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][4] = true; //3
                            electronicHiHatClosedReverbCheckCounter9 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][4] = true; //3
                            electronicHiHatClosedReverbCheckCounter10 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][4] = true; //3
                            electronicHiHatClosedReverbCheckCounter11 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][4] = true; //3
                            electronicHiHatClosedReverbCheckCounter12 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][4] = true; //3
                            electronicHiHatClosedReverbCheckCounter13 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][4] = true; //3
                            electronicHiHatClosedReverbCheckCounter14 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][4] = true; //3
                            electronicHiHatClosedReverbCheckCounter15 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(electronichihatcloseddelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][4] = true; //3
                            electronicHiHatClosedDelayCheckCounter = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][4] = true; //3
                            electronicHiHatClosedDelayCheckCounter1 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][4] = true; //3
                            electronicHiHatClosedDelayCheckCounter2 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][4] = true; //3
                            electronicHiHatClosedDelayCheckCounter3 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][4] = true; //3
                            electronicHiHatClosedDelayCheckCounter4 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][4] = true; //3
                            electronicHiHatClosedDelayCheckCounter5 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][4] = true; //3
                            electronicHiHatClosedDelayCheckCounter6 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][4] = true; //3
                            electronicHiHatClosedDelayCheckCounter7 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][4] = true; //3
                            electronicHiHatClosedDelayCheckCounter8 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][4] = true; //3
                            electronicHiHatClosedDelayCheckCounter9 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][4] = true; //3
                            electronicHiHatClosedDelayCheckCounter10 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][4] = true; //3
                            electronicHiHatClosedDelayCheckCounter11 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][4] = true; //3
                            electronicHiHatClosedDelayCheckCounter12 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][4] = true; //3
                            electronicHiHatClosedDelayCheckCounter13 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][4] = true; //3
                            electronicHiHatClosedDelayCheckCounter14 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][4] = true; //3
                            electronicHiHatClosedDelayCheckCounter15 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(electronichihatclosedreverbdelay, progressChangedValueHiHatClosed, progressChangedValueHiHatClosed, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][4] = true; //3
                            electronicHiHatClosedReverbDelayCheckCounter = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][4] = true; //3
                            electronicHiHatClosedReverbDelayCheckCounter1 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][4] = true; //3
                            electronicHiHatClosedReverbDelayCheckCounter2 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][4] = true; //3
                            electronicHiHatClosedReverbDelayCheckCounter3 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][4] = true; //3
                            electronicHiHatClosedReverbDelayCheckCounter4 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][4] = true; //3
                            electronicHiHatClosedReverbDelayCheckCounter5 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][4] = true; //3
                            electronicHiHatClosedReverbDelayCheckCounter6 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][4] = true; //3
                            electronicHiHatClosedReverbDelayCheckCounter7 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][4] = true; //3
                            electronicHiHatClosedReverbDelayCheckCounter8 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][4] = true; //3
                            electronicHiHatClosedReverbDelayCheckCounter9 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][4] = true; //3
                            electronicHiHatClosedReverbDelayCheckCounter10 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][4] = true; //3
                            electronicHiHatClosedReverbDelayCheckCounter11 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][4] = true; //3
                            electronicHiHatClosedReverbDelayCheckCounter12 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][4] = true; //3
                            electronicHiHatClosedReverbDelayCheckCounter13 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][4] = true; //3
                            electronicHiHatClosedReverbDelayCheckCounter14 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][4] = true; //3
                            electronicHiHatClosedReverbDelayCheckCounter15 = 1;
                            //Log.d("checkhihatclosed", "hihatclosed placed in sixteenth bar");
                        }
                    }
                    break;

                case R.id.sidestickid:
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(electronicstick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(stick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(electronicstick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][5] = true; //3
                            electronicStickCheckCounter = 1;
                            //Log.d("checksidestick", "sidestick placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][5] = true; //3
                            electronicStickCheckCounter1 = 1;
                            //Log.d("checksidestick", "sidestick placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][5] = true; //3
                            electronicStickCheckCounter2 = 1;
                            //Log.d("checksidestick", "sidestick placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][5] = true; //3
                            electronicStickCheckCounter3 = 1;
                            //Log.d("checksidestick", "sidestick placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][5] = true; //3
                            electronicStickCheckCounter4 = 1;
                            //Log.d("checksidestick", "sidestick placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][5] = true; //3
                            electronicStickCheckCounter5 = 1;
                            //Log.d("checksidestick", "sidestick placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][5] = true; //3
                            electronicStickCheckCounter6 = 1;
                            //Log.d("checksidestick", "sidestick placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][5] = true; //3
                            electronicStickCheckCounter7 = 1;
                            //Log.d("checksidestick", "sidestick placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][5] = true; //3
                            electronicStickCheckCounter8 = 1;
                            //Log.d("checksidestick", "sidestick placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][5] = true; //3
                            electronicStickCheckCounter9 = 1;
                            //Log.d("checksidestick", "sidestick placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][5] = true; //3
                            electronicStickCheckCounter10 = 1;
                            //Log.d("checksidestick", "sidestick placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][5] = true; //3
                            electronicStickCheckCounter11 = 1;
                            //Log.d("checksidestick", "sidestick placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][5] = true; //3
                            electronicStickCheckCounter12 = 1;
                            //Log.d("checksidestick", "sidestick placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][5] = true; //3
                            electronicStickCheckCounter13 = 1;
                            //Log.d("checksidestick", "sidestick placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][5] = true; //3
                            electronicStickCheckCounter14 = 1;
                            //Log.d("checksidestick", "sidestick placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][5] = true; //3
                            electronicStickCheckCounter15 = 1;
                            //Log.d("checksidestick", "sidestick placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(stick, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][5] = true; //3
                            stickCheckCounter = 1;
                            //Log.d("checksidestick", "sidestick placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][5] = true; //3
                            stickCheckCounter1 = 1;
                            //Log.d("checksidestick", "sidestick placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][5] = true; //3
                            stickCheckCounter2 = 1;
                            //Log.d("checksidestick", "sidestick placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][5] = true; //3
                            stickCheckCounter3 = 1;
                            //Log.d("checksidestick", "sidestick placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][5] = true; //3
                            stickCheckCounter4 = 1;
                            //Log.d("checksidestick", "sidestick placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][5] = true; //3
                            stickCheckCounter5 = 1;
                            //Log.d("checksidestick", "sidestick placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][5] = true; //3
                            stickCheckCounter6 = 1;
                            //Log.d("checksidestick", "sidestick placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][5] = true; //3
                            stickCheckCounter7 = 1;
                            //Log.d("checksidestick", "sidestick placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][5] = true; //3
                            stickCheckCounter8 = 1;
                            //Log.d("checksidestick", "sidestick placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][5] = true; //3
                            stickCheckCounter9 = 1;
                            //Log.d("checksidestick", "sidestick placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][5] = true; //3
                            stickCheckCounter10 = 1;
                            //Log.d("checksidestick", "sidestick placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][5] = true; //3
                            stickCheckCounter11 = 1;
                            //Log.d("checksidestick", "sidestick placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][5] = true; //3
                            stickCheckCounter12 = 1;
                            //Log.d("checksidestick", "sidestick placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][5] = true; //3
                            stickCheckCounter13 = 1;
                            //Log.d("checksidestick", "sidestick placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][5] = true; //3
                            stickCheckCounter14 = 1;
                            //Log.d("checksidestick", "sidestick placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][5] = true; //3
                            stickCheckCounter15 = 1;
                            //Log.d("checksidestick", "sidestick placed in sixteenth bar");
                        }
                    }

                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(stickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(stickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(stickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(stickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][5] = true; //3
                            stickReverbCheckCounter = 1;
                            //Log.d("checksidestick", "sidestick placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][5] = true; //3
                            stickReverbCheckCounter1 = 1;
                            //Log.d("checksidestick", "sidestick placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][5] = true; //3
                            stickReverbCheckCounter2 = 1;
                            //Log.d("checksidestick", "sidestick placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][5] = true; //3
                            stickReverbCheckCounter3 = 1;
                            //Log.d("checksidestick", "sidestick placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][5] = true; //3
                            stickReverbCheckCounter4 = 1;
                            //Log.d("checksidestick", "sidestick placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][5] = true; //3
                            stickReverbCheckCounter5 = 1;
                            //Log.d("checksidestick", "sidestick placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][5] = true; //3
                            stickReverbCheckCounter6 = 1;
                            //Log.d("checksidestick", "sidestick placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][5] = true; //3
                            stickReverbCheckCounter7 = 1;
                            //Log.d("checksidestick", "sidestick placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][5] = true; //3
                            stickReverbCheckCounter8 = 1;
                            //Log.d("checksidestick", "sidestick placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][5] = true; //3
                            stickReverbCheckCounter9 = 1;
                            //Log.d("checksidestick", "sidestick placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][5] = true; //3
                            stickReverbCheckCounter10 = 1;
                            //Log.d("checksidestick", "sidestick placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][5] = true; //3
                            stickReverbCheckCounter11 = 1;
                            //Log.d("checksidestick", "sidestick placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][5] = true; //3
                            stickReverbCheckCounter12 = 1;
                            //Log.d("checksidestick", "sidestick placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][5] = true; //3
                            stickReverbCheckCounter13 = 1;
                            //Log.d("checksidestick", "sidestick placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][5] = true; //3
                            stickReverbCheckCounter14 = 1;
                            //Log.d("checksidestick", "sidestick placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][5] = true; //3
                            stickReverbCheckCounter15 = 1;
                            //Log.d("checksidestick", "sidestick placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(stickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][5] = true; //3
                            stickDelayCheckCounter = 1;
                            //Log.d("checksidestick", "sidestick placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][5] = true; //3
                            stickDelayCheckCounter1 = 1;
                            //Log.d("checksidestick", "sidestick placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][5] = true; //3
                            stickDelayCheckCounter2 = 1;
                            //Log.d("checksidestick", "sidestick placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][5] = true; //3
                            stickDelayCheckCounter3 = 1;
                            //Log.d("checksidestick", "sidestick placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][5] = true; //3
                            stickDelayCheckCounter4 = 1;
                            //Log.d("checksidestick", "sidestick placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][5] = true; //3
                            stickDelayCheckCounter5 = 1;
                            //Log.d("checksidestick", "sidestick placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][5] = true; //3
                            stickDelayCheckCounter6 = 1;
                            //Log.d("checksidestick", "sidestick placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][5] = true; //3
                            stickDelayCheckCounter7 = 1;
                            //Log.d("checksidestick", "sidestick placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][5] = true; //3
                            stickDelayCheckCounter8 = 1;
                            //Log.d("checksidestick", "sidestick placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][5] = true; //3
                            stickDelayCheckCounter9 = 1;
                            //Log.d("checksidestick", "sidestick placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][5] = true; //3
                            stickDelayCheckCounter10 = 1;
                            //Log.d("checksidestick", "sidestick placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][5] = true; //3
                            stickDelayCheckCounter11 = 1;
                            //Log.d("checksidestick", "sidestick placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][5] = true; //3
                            stickDelayCheckCounter12 = 1;
                            //Log.d("checksidestick", "sidestick placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][5] = true; //3
                            stickDelayCheckCounter13 = 1;
                            //Log.d("checksidestick", "sidestick placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][5] = true; //3
                            stickDelayCheckCounter14 = 1;
                            //Log.d("checksidestick", "sidestick placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][5] = true; //3
                            stickDelayCheckCounter15 = 1;
                            //Log.d("checksidestick", "sidestick placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(stickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][5] = true; //3
                            stickReverbDelayCheckCounter = 1;
                            //Log.d("checksidestick", "sidestick placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][5] = true; //3
                            stickReverbDelayCheckCounter1 = 1;
                            //Log.d("checksidestick", "sidestick placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][5] = true; //3
                            stickReverbDelayCheckCounter2 = 1;
                            //Log.d("checksidestick", "sidestick placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][5] = true; //3
                            stickReverbDelayCheckCounter3 = 1;
                            //Log.d("checksidestick", "sidestick placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][5] = true; //3
                            stickReverbDelayCheckCounter4 = 1;
                            //Log.d("checksidestick", "sidestick placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][5] = true; //3
                            stickReverbDelayCheckCounter5 = 1;
                            //Log.d("checksidestick", "sidestick placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][5] = true; //3
                            stickReverbDelayCheckCounter6 = 1;
                            //Log.d("checksidestick", "sidestick placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][5] = true; //3
                            stickReverbDelayCheckCounter7 = 1;
                            //Log.d("checksidestick", "sidestick placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][5] = true; //3
                            stickReverbDelayCheckCounter8 = 1;
                            //Log.d("checksidestick", "sidestick placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][5] = true; //3
                            stickReverbDelayCheckCounter9 = 1;
                            //Log.d("checksidestick", "sidestick placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][5] = true; //3
                            stickReverbDelayCheckCounter10 = 1;
                            //Log.d("checksidestick", "sidestick placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][5] = true; //3
                            stickReverbDelayCheckCounter11 = 1;
                            //Log.d("checksidestick", "sidestick placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][5] = true; //3
                            stickReverbDelayCheckCounter12 = 1;
                            //Log.d("checksidestick", "sidestick placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][5] = true; //3
                            stickReverbDelayCheckCounter13 = 1;
                            //Log.d("checksidestick", "sidestick placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][5] = true; //3
                            stickReverbDelayCheckCounter14 = 1;
                            //Log.d("checksidestick", "sidestick placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][5] = true; //3
                            stickReverbDelayCheckCounter15 = 1;
                            //Log.d("checksidestick", "sidestick placed in sixteenth bar");
                        }
                    }

                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(electronicstickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(electronicstickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(electronicstickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(electronicstickreverb, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][5] = true; //3
                            electronicStickReverbCheckCounter = 1;
                            //Log.d("checksidestick", "sidestick placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][5] = true; //3
                            electronicStickReverbCheckCounter1 = 1;
                            //Log.d("checksidestick", "sidestick placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][5] = true; //3
                            electronicStickReverbCheckCounter2 = 1;
                            //Log.d("checksidestick", "sidestick placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][5] = true; //3
                            electronicStickReverbCheckCounter3 = 1;
                            //Log.d("checksidestick", "sidestick placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][5] = true; //3
                            electronicStickReverbCheckCounter4 = 1;
                            //Log.d("checksidestick", "sidestick placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][5] = true; //3
                            electronicStickReverbCheckCounter5 = 1;
                            //Log.d("checksidestick", "sidestick placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][5] = true; //3
                            electronicStickReverbCheckCounter6 = 1;
                            //Log.d("checksidestick", "sidestick placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][5] = true; //3
                            electronicStickReverbCheckCounter7 = 1;
                            //Log.d("checksidestick", "sidestick placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][5] = true; //3
                            electronicStickReverbCheckCounter8 = 1;
                            //Log.d("checksidestick", "sidestick placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][5] = true; //3
                            electronicStickReverbCheckCounter9 = 1;
                            //Log.d("checksidestick", "sidestick placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][5] = true; //3
                            electronicStickReverbCheckCounter10 = 1;
                            //Log.d("checksidestick", "sidestick placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][5] = true; //3
                            electronicStickReverbCheckCounter11 = 1;
                            //Log.d("checksidestick", "sidestick placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][5] = true; //3
                            electronicStickReverbCheckCounter12 = 1;
                            //Log.d("checksidestick", "sidestick placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][5] = true; //3
                            electronicStickReverbCheckCounter13 = 1;
                            //Log.d("checksidestick", "sidestick placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][5] = true; //3
                            electronicStickReverbCheckCounter14 = 1;
                            //Log.d("checksidestick", "sidestick placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][5] = true; //3
                            electronicStickReverbCheckCounter15 = 1;
                            //Log.d("checksidestick", "sidestick placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(electronicstickdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][5] = true; //3
                            electronicStickDelayCheckCounter = 1;
                            //Log.d("checksidestick", "sidestick placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][5] = true; //3
                            electronicStickDelayCheckCounter1 = 1;
                            //Log.d("checksidestick", "sidestick placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][5] = true; //3
                            electronicStickDelayCheckCounter2 = 1;
                            //Log.d("checksidestick", "sidestick placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][5] = true; //3
                            electronicStickDelayCheckCounter3 = 1;
                            //Log.d("checksidestick", "sidestick placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][5] = true; //3
                            electronicStickDelayCheckCounter4 = 1;
                            //Log.d("checksidestick", "sidestick placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][5] = true; //3
                            electronicStickDelayCheckCounter5 = 1;
                            //Log.d("checksidestick", "sidestick placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][5] = true; //3
                            electronicStickDelayCheckCounter6 = 1;
                            //Log.d("checksidestick", "sidestick placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][5] = true; //3
                            electronicStickDelayCheckCounter7 = 1;
                            //Log.d("checksidestick", "sidestick placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][5] = true; //3
                            electronicStickDelayCheckCounter8 = 1;
                            //Log.d("checksidestick", "sidestick placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][5] = true; //3
                            electronicStickDelayCheckCounter9 = 1;
                            //Log.d("checksidestick", "sidestick placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][5] = true; //3
                            electronicStickDelayCheckCounter10 = 1;
                            //Log.d("checksidestick", "sidestick placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][5] = true; //3
                            electronicStickDelayCheckCounter11 = 1;
                            //Log.d("checksidestick", "sidestick placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][5] = true; //3
                            electronicStickDelayCheckCounter12 = 1;
                            //Log.d("checksidestick", "sidestick placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][5] = true; //3
                            electronicStickDelayCheckCounter13 = 1;
                            //Log.d("checksidestick", "sidestick placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][5] = true; //3
                            electronicStickDelayCheckCounter14 = 1;
                            //Log.d("checksidestick", "sidestick placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][5] = true; //3
                            electronicStickDelayCheckCounter15 = 1;
                            //Log.d("checksidestick", "sidestick placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(electronicstickreverbdelay, progressChangedValueStick, progressChangedValueStick, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][5] = true; //3
                            electronicStickReverbDelayCheckCounter = 1;
                            //Log.d("checksidestick", "sidestick placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][5] = true; //3
                            electronicStickReverbDelayCheckCounter1 = 1;
                            //Log.d("checksidestick", "sidestick placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][5] = true; //3
                            electronicStickReverbDelayCheckCounter2 = 1;
                            //Log.d("checksidestick", "sidestick placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][5] = true; //3
                            electronicStickReverbDelayCheckCounter3 = 1;
                            //Log.d("checksidestick", "sidestick placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][5] = true; //3
                            electronicStickReverbDelayCheckCounter4 = 1;
                            //Log.d("checksidestick", "sidestick placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][5] = true; //3
                            electronicStickReverbDelayCheckCounter5 = 1;
                            //Log.d("checksidestick", "sidestick placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][5] = true; //3
                            electronicStickReverbDelayCheckCounter6 = 1;
                            //Log.d("checksidestick", "sidestick placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][5] = true; //3
                            electronicStickReverbDelayCheckCounter7 = 1;
                            //Log.d("checksidestick", "sidestick placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][5] = true; //3
                            electronicStickReverbDelayCheckCounter8 = 1;
                            //Log.d("checksidestick", "sidestick placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][5] = true; //3
                            electronicStickReverbDelayCheckCounter9 = 1;
                            //Log.d("checksidestick", "sidestick placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][5] = true; //3
                            electronicStickReverbDelayCheckCounter10 = 1;
                            //Log.d("checksidestick", "sidestick placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][5] = true; //3
                            electronicStickReverbDelayCheckCounter11 = 1;
                            //Log.d("checksidestick", "sidestick placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][5] = true; //3
                            electronicStickReverbDelayCheckCounter12 = 1;
                            //Log.d("checksidestick", "sidestick placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][5] = true; //3
                            electronicStickReverbDelayCheckCounter13 = 1;
                            //Log.d("checksidestick", "sidestick placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][5] = true; //3
                            electronicStickReverbDelayCheckCounter14 = 1;
                            //Log.d("checksidestick", "sidestick placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][5] = true; //3
                            electronicStickReverbDelayCheckCounter15 = 1;
                            //Log.d("checksidestick", "sidestick placed in sixteenth bar");
                        }
                    }
                    break;

                case R.id.bellid:
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(electronicbell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(bell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(electronicbell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][6] = true; //3
                            electronicBellCheckCounter = 1;
                            //Log.d("checkbell", "bell placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][6] = true; //3
                            electronicBellCheckCounter1 = 1;
                            //Log.d("checkbell", "bell placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][6] = true; //3
                            electronicBellCheckCounter2 = 1;
                            //Log.d("checkbell", "bell placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][6] = true; //3
                            electronicBellCheckCounter3 = 1;
                            //Log.d("checkbell", "bell placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][6] = true; //3
                            electronicBellCheckCounter4 = 1;
                            //Log.d("checkbell", "bell placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][6] = true; //3
                            electronicBellCheckCounter5 = 1;
                            //Log.d("checkbell", "bell placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][6] = true; //3
                            electronicBellCheckCounter6 = 1;
                            //Log.d("checkbell", "bell placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][6] = true; //3
                            electronicBellCheckCounter7 = 1;
                            //Log.d("checkbell", "bell placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][6] = true; //3
                            electronicBellCheckCounter8 = 1;
                            //Log.d("checkbell", "bell placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][6] = true; //3
                            electronicBellCheckCounter9 = 1;
                            //Log.d("checkbell", "bell placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][6] = true; //3
                            electronicBellCheckCounter10 = 1;
                            //Log.d("checkbell", "bell placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][6] = true; //3
                            electronicBellCheckCounter11 = 1;
                            //Log.d("checkbell", "bell placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][6] = true; //3
                            electronicBellCheckCounter12 = 1;
                            //Log.d("checkbell", "bell placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][6] = true; //3
                            electronicBellCheckCounter13 = 1;
                            //Log.d("checkbell", "bell placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][6] = true; //3
                            electronicBellCheckCounter14 = 1;
                            //Log.d("checkbell", "bell placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][6] = true; //3
                            electronicBellCheckCounter15 = 1;
                            //Log.d("checkbell", "bell placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(bell, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][6] = true; //3
                            bellCheckCounter = 1;
                            //Log.d("checkbell", "bell placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][6] = true; //3
                            bellCheckCounter1 = 1;
                            //Log.d("checkbell", "bell placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][6] = true; //3
                            bellCheckCounter2 = 1;
                            //Log.d("checkbell", "bell placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][6] = true; //3
                            bellCheckCounter3 = 1;
                            //Log.d("checkbell", "bell placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][6] = true; //3
                            bellCheckCounter4 = 1;
                            //Log.d("checkbell", "bell placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][6] = true; //3
                            bellCheckCounter5 = 1;
                            //Log.d("checkbell", "bell placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][6] = true; //3
                            bellCheckCounter6 = 1;
                            //Log.d("checkbell", "bell placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][6] = true; //3
                            bellCheckCounter7 = 1;
                            //Log.d("checkbell", "bell placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][6] = true; //3
                            bellCheckCounter8 = 1;
                            //Log.d("checkbell", "bell placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][6] = true; //3
                            bellCheckCounter9 = 1;
                            //Log.d("checkbell", "bell placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][6] = true; //3
                            bellCheckCounter10 = 1;
                            //Log.d("checkbell", "bell placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][6] = true; //3
                            bellCheckCounter11 = 1;
                            //Log.d("checkbell", "bell placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][6] = true; //3
                            bellCheckCounter12 = 1;
                            //Log.d("checkbell", "bell placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][6] = true; //3
                            bellCheckCounter13 = 1;
                            //Log.d("checkbell", "bell placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][6] = true; //3
                            bellCheckCounter14 = 1;
                            //Log.d("checkbell", "bell placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][6] = true; //3
                            bellCheckCounter15 = 1;
                            //Log.d("checkbell", "bell placed in sixteenth bar");
                        }
                    }

                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(bellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(belldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(bellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(bellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][6] = true; //3
                            bellReverbCheckCounter = 1;
                            //Log.d("checkbell", "bell placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][6] = true; //3
                            bellReverbCheckCounter1 = 1;
                            //Log.d("checkbell", "bell placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][6] = true; //3
                            bellReverbCheckCounter2 = 1;
                            //Log.d("checkbell", "bell placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][6] = true; //3
                            bellReverbCheckCounter3 = 1;
                            //Log.d("checkbell", "bell placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][6] = true; //3
                            bellReverbCheckCounter4 = 1;
                            //Log.d("checkbell", "bell placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][6] = true; //3
                            bellReverbCheckCounter5 = 1;
                            //Log.d("checkbell", "bell placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][6] = true; //3
                            bellReverbCheckCounter6 = 1;
                            //Log.d("checkbell", "bell placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][6] = true; //3
                            bellReverbCheckCounter7 = 1;
                            //Log.d("checkbell", "bell placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][6] = true; //3
                            bellReverbCheckCounter8 = 1;
                            //Log.d("checkbell", "bell placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][6] = true; //3
                            bellReverbCheckCounter9 = 1;
                            //Log.d("checkbell", "bell placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][6] = true; //3
                            bellReverbCheckCounter10 = 1;
                            //Log.d("checkbell", "bell placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][6] = true; //3
                            bellReverbCheckCounter11 = 1;
                            //Log.d("checkbell", "bell placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][6] = true; //3
                            bellReverbCheckCounter12 = 1;
                            //Log.d("checkbell", "bell placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][6] = true; //3
                            bellReverbCheckCounter13 = 1;
                            //Log.d("checkbell", "bell placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][6] = true; //3
                            bellReverbCheckCounter14 = 1;
                            //Log.d("checkbell", "bell placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][6] = true; //3
                            bellReverbCheckCounter15 = 1;
                            //Log.d("checkbell", "bell placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(belldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][6] = true; //3
                            bellDelayCheckCounter = 1;
                            //Log.d("checkbell", "bell placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][6] = true; //3
                            bellDelayCheckCounter1 = 1;
                            //Log.d("checkbell", "bell placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][6] = true; //3
                            bellDelayCheckCounter2 = 1;
                            //Log.d("checkbell", "bell placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][6] = true; //3
                            bellDelayCheckCounter3 = 1;
                            //Log.d("checkbell", "bell placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][6] = true; //3
                            bellDelayCheckCounter4 = 1;
                            //Log.d("checkbell", "bell placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][6] = true; //3
                            bellDelayCheckCounter5 = 1;
                            //Log.d("checkbell", "bell placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][6] = true; //3
                            bellDelayCheckCounter6 = 1;
                            //Log.d("checkbell", "bell placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][6] = true; //3
                            bellDelayCheckCounter7 = 1;
                            //Log.d("checkbell", "bell placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][6] = true; //3
                            bellDelayCheckCounter8 = 1;
                            //Log.d("checkbell", "bell placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][6] = true; //3
                            bellDelayCheckCounter9 = 1;
                            //Log.d("checkbell", "bell placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][6] = true; //3
                            bellDelayCheckCounter10 = 1;
                            //Log.d("checkbell", "bell placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][6] = true; //3
                            bellDelayCheckCounter11 = 1;
                            //Log.d("checkbell", "bell placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][6] = true; //3
                            bellDelayCheckCounter12 = 1;
                            //Log.d("checkbell", "bell placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][6] = true; //3
                            bellDelayCheckCounter13 = 1;
                            //Log.d("checkbell", "bell placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][6] = true; //3
                            bellDelayCheckCounter14 = 1;
                            //Log.d("checkbell", "bell placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][6] = true; //3
                            bellDelayCheckCounter15 = 1;
                            //Log.d("checkbell", "bell placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(bellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][6] = true; //3
                            bellReverbDelayCheckCounter = 1;
                            //Log.d("checkbell", "bell placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][6] = true; //3
                            bellReverbDelayCheckCounter1 = 1;
                            //Log.d("checkbell", "bell placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][6] = true; //3
                            bellReverbDelayCheckCounter2 = 1;
                            //Log.d("checkbell", "bell placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][6] = true; //3
                            bellReverbDelayCheckCounter3 = 1;
                            //Log.d("checkbell", "bell placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][6] = true; //3
                            bellReverbDelayCheckCounter4 = 1;
                            //Log.d("checkbell", "bell placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][6] = true; //3
                            bellReverbDelayCheckCounter5 = 1;
                            //Log.d("checkbell", "bell placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][6] = true; //3
                            bellReverbDelayCheckCounter6 = 1;
                            //Log.d("checkbell", "bell placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][6] = true; //3
                            bellReverbDelayCheckCounter7 = 1;
                            //Log.d("checkbell", "bell placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][6] = true; //3
                            bellReverbDelayCheckCounter8 = 1;
                            //Log.d("checkbell", "bell placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][6] = true; //3
                            bellReverbDelayCheckCounter9 = 1;
                            //Log.d("checkbell", "bell placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][6] = true; //3
                            bellReverbDelayCheckCounter10 = 1;
                            //Log.d("checkbell", "bell placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][6] = true; //3
                            bellReverbDelayCheckCounter11 = 1;
                            //Log.d("checkbell", "bell placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][6] = true; //3
                            bellReverbDelayCheckCounter12 = 1;
                            //Log.d("checkbell", "bell placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][6] = true; //3
                            bellReverbDelayCheckCounter13 = 1;
                            //Log.d("checkbell", "bell placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][6] = true; //3
                            bellReverbDelayCheckCounter14 = 1;
                            //Log.d("checkbell", "bell placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][6] = true; //3
                            bellReverbDelayCheckCounter15 = 1;
                            //Log.d("checkbell", "bell placed in sixteenth bar");
                        }
                    }

                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(electronicbellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(electronicbelldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(electronicbellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(electronicbellreverb, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][6] = true; //3
                            electronicBellReverbCheckCounter = 1;
                            //Log.d("checkbell", "bell placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][6] = true; //3
                            electronicBellReverbCheckCounter1 = 1;
                            //Log.d("checkbell", "bell placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][6] = true; //3
                            electronicBellReverbCheckCounter2 = 1;
                            //Log.d("checkbell", "bell placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][6] = true; //3
                            electronicBellReverbCheckCounter3 = 1;
                            //Log.d("checkbell", "bell placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][6] = true; //3
                            electronicBellReverbCheckCounter4 = 1;
                            //Log.d("checkbell", "bell placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][6] = true; //3
                            electronicBellReverbCheckCounter5 = 1;
                            //Log.d("checkbell", "bell placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][6] = true; //3
                            electronicBellReverbCheckCounter6 = 1;
                            //Log.d("checkbell", "bell placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][6] = true; //3
                            electronicBellReverbCheckCounter7 = 1;
                            //Log.d("checkbell", "bell placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][6] = true; //3
                            electronicBellReverbCheckCounter8 = 1;
                            //Log.d("checkbell", "bell placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][6] = true; //3
                            electronicBellReverbCheckCounter9 = 1;
                            //Log.d("checkbell", "bell placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][6] = true; //3
                            electronicBellReverbCheckCounter10 = 1;
                            //Log.d("checkbell", "bell placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][6] = true; //3
                            electronicBellReverbCheckCounter11 = 1;
                            //Log.d("checkbell", "bell placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][6] = true; //3
                            electronicBellReverbCheckCounter12 = 1;
                            //Log.d("checkbell", "bell placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][6] = true; //3
                            electronicBellReverbCheckCounter13 = 1;
                            //Log.d("checkbell", "bell placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][6] = true; //3
                            electronicBellReverbCheckCounter14 = 1;
                            //Log.d("checkbell", "bell placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][6] = true; //3
                            electronicBellReverbCheckCounter15 = 1;
                            //Log.d("checkbell", "bell placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(electronicbelldelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][6] = true; //3
                            electronicBellDelayCheckCounter = 1;
                            //Log.d("checkbell", "bell placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][6] = true; //3
                            electronicBellDelayCheckCounter1 = 1;
                            //Log.d("checkbell", "bell placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][6] = true; //3
                            electronicBellDelayCheckCounter2 = 1;
                            //Log.d("checkbell", "bell placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][6] = true; //3
                            electronicBellDelayCheckCounter3 = 1;
                            //Log.d("checkbell", "bell placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][6] = true; //3
                            electronicBellDelayCheckCounter4 = 1;
                            //Log.d("checkbell", "bell placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][6] = true; //3
                            electronicBellDelayCheckCounter5 = 1;
                            //Log.d("checkbell", "bell placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][6] = true; //3
                            electronicBellDelayCheckCounter6 = 1;
                            //Log.d("checkbell", "bell placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][6] = true; //3
                            electronicBellDelayCheckCounter7 = 1;
                            //Log.d("checkbell", "bell placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][6] = true; //3
                            electronicBellDelayCheckCounter8 = 1;
                            //Log.d("checkbell", "bell placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][6] = true; //3
                            electronicBellDelayCheckCounter9 = 1;
                            //Log.d("checkbell", "bell placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][6] = true; //3
                            electronicBellDelayCheckCounter10 = 1;
                            //Log.d("checkbell", "bell placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][6] = true; //3
                            electronicBellDelayCheckCounter11 = 1;
                            //Log.d("checkbell", "bell placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][6] = true; //3
                            electronicBellDelayCheckCounter12 = 1;
                            //Log.d("checkbell", "bell placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][6] = true; //3
                            electronicBellDelayCheckCounter13 = 1;
                            //Log.d("checkbell", "bell placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][6] = true; //3
                            electronicBellDelayCheckCounter14 = 1;
                            //Log.d("checkbell", "bell placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][6] = true; //3
                            electronicBellDelayCheckCounter15 = 1;
                            //Log.d("checkbell", "bell placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(electronicbellreverbdelay, progressChangedValueBell, progressChangedValueBell, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][6] = true; //3
                            electronicBellReverbDelayCheckCounter = 1;
                            //Log.d("checkbell", "bell placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][6] = true; //3
                            electronicBellReverbDelayCheckCounter1 = 1;
                            //Log.d("checkbell", "bell placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][6] = true; //3
                            electronicBellReverbDelayCheckCounter2 = 1;
                            //Log.d("checkbell", "bell placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][6] = true; //3
                            electronicBellReverbDelayCheckCounter3 = 1;
                            //Log.d("checkbell", "bell placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][6] = true; //3
                            electronicBellReverbDelayCheckCounter4 = 1;
                            //Log.d("checkbell", "bell placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][6] = true; //3
                            electronicBellReverbDelayCheckCounter5 = 1;
                            //Log.d("checkbell", "bell placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][6] = true; //3
                            electronicBellReverbDelayCheckCounter6 = 1;
                            //Log.d("checkbell", "bell placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][6] = true; //3
                            electronicBellReverbDelayCheckCounter7 = 1;
                            //Log.d("checkbell", "bell placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][6] = true; //3
                            electronicBellReverbDelayCheckCounter8 = 1;
                            //Log.d("checkbell", "bell placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][6] = true; //3
                            electronicBellReverbDelayCheckCounter9 = 1;
                            //Log.d("checkbell", "bell placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][6] = true; //3
                            electronicBellReverbDelayCheckCounter10 = 1;
                            //Log.d("checkbell", "bell placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][6] = true; //3
                            electronicBellReverbDelayCheckCounter11 = 1;
                            //Log.d("checkbell", "bell placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][6] = true; //3
                            electronicBellReverbDelayCheckCounter12 = 1;
                            //Log.d("checkbell", "bell placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][6] = true; //3
                            electronicBellReverbDelayCheckCounter13 = 1;
                            //Log.d("checkbell", "bell placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][6] = true; //3
                            electronicBellReverbDelayCheckCounter14 = 1;
                            //Log.d("checkbell", "bell placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][6] = true; //3
                            electronicBellReverbDelayCheckCounter15 = 1;
                            //Log.d("checkbell", "bell placed in sixteenth bar");
                        }
                    }
                    break;

                case R.id.crashid:
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(electroniccrash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(crash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(electroniccrash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][7] = true; //3
                            electronicCrashCheckCounter = 1;
                            //Log.d("checkcymbal", "cymbal placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][7] = true; //3
                            electronicCrashCheckCounter1 = 1;
                            //Log.d("checkcymbal", "cymbal placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][7] = true; //3
                            electronicCrashCheckCounter2 = 1;
                            //Log.d("checkcymbal", "cymbal placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][7] = true; //3
                            electronicCrashCheckCounter3 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][7] = true; //3
                            electronicCrashCheckCounter4 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][7] = true; //3
                            electronicCrashCheckCounter5 = 1;
                            //Log.d("checkcymbal", "cymbal placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][7] = true; //3
                            electronicCrashCheckCounter6 = 1;
                            //Log.d("checkcymbal", "cymbal placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][7] = true; //3
                            electronicCrashCheckCounter7 = 1;
                            //Log.d("checkcymbal", "cymbal placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][7] = true; //3
                            electronicCrashCheckCounter8 = 1;
                            //Log.d("checkcymbal", "cymbal placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][7] = true; //3
                            electronicCrashCheckCounter9 = 1;
                            //Log.d("checkcymbal", "cymbal placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][7] = true; //3
                            electronicCrashCheckCounter10 = 1;
                            //Log.d("checkcymbal", "cymbal placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][7] = true; //3
                            electronicCrashCheckCounter11 = 1;
                            //Log.d("checkcymbal", "cymbal placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][7] = true; //3
                            electronicCrashCheckCounter12 = 1;
                            //Log.d("checkcymbal", "cymbal placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][7] = true; //3
                            electronicCrashCheckCounter13 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][7] = true; //3
                            electronicCrashCheckCounter14 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][7] = true; //3
                            electronicCrashCheckCounter15 = 1;
                            //Log.d("checkcymbal", "cymbal placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==0) {
                        sp.play(crash, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][7] = true; //3
                            crashCheckCounter = 1;
                            //Log.d("checkcymbal", "cymbal placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][7] = true; //3
                            crashCheckCounter1 = 1;
                            //Log.d("checkcymbal", "cymbal placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][7] = true; //3
                            crashCheckCounter2 = 1;
                            //Log.d("checkcymbal", "cymbal placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][7] = true; //3
                            crashCheckCounter3 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][7] = true; //3
                            crashCheckCounter4 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][7] = true; //3
                            crashCheckCounter5 = 1;
                            //Log.d("checkcymbal", "cymbal placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][7] = true; //3
                            crashCheckCounter6 = 1;
                            //Log.d("checkcymbal", "cymbal placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][7] = true; //3
                            crashCheckCounter7 = 1;
                            //Log.d("checkcymbal", "cymbal placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][7] = true; //3
                            crashCheckCounter8 = 1;
                            //Log.d("checkcymbal", "cymbal placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][7] = true; //3
                            crashCheckCounter9 = 1;
                            //Log.d("checkcymbal", "cymbal placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][7] = true; //3
                            crashCheckCounter10 = 1;
                            //Log.d("checkcymbal", "cymbal placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][7] = true; //3
                            crashCheckCounter11 = 1;
                            //Log.d("checkcymbal", "cymbal placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][7] = true; //3
                            crashCheckCounter12 = 1;
                            //Log.d("checkcymbal", "cymbal placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][7] = true; //3
                            crashCheckCounter13 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][7] = true; //3
                            crashCheckCounter14 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][7] = true; //3
                            crashCheckCounter15 = 1;
                            //Log.d("checkcymbal", "cymbal placed in sixteenth bar");
                        }
                    }

                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(crashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(crashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(crashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(crashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][7] = true; //3
                            crashReverbCheckCounter = 1;
                            //Log.d("checkcymbal", "cymbal placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][7] = true; //3
                            crashReverbCheckCounter1 = 1;
                            //Log.d("checkcymbal", "cymbal placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][7] = true; //3
                            crashReverbCheckCounter2 = 1;
                            //Log.d("checkcymbal", "cymbal placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][7] = true; //3
                            crashReverbCheckCounter3 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][7] = true; //3
                            crashReverbCheckCounter4 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][7] = true; //3
                            crashReverbCheckCounter5 = 1;
                            //Log.d("checkcymbal", "cymbal placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][7] = true; //3
                            crashReverbCheckCounter6 = 1;
                            //Log.d("checkcymbal", "cymbal placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][7] = true; //3
                            crashReverbCheckCounter7 = 1;
                            //Log.d("checkcymbal", "cymbal placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][7] = true; //3
                            crashReverbCheckCounter8 = 1;
                            //Log.d("checkcymbal", "cymbal placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][7] = true; //3
                            crashReverbCheckCounter9 = 1;
                            //Log.d("checkcymbal", "cymbal placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][7] = true; //3
                            crashReverbCheckCounter10 = 1;
                            //Log.d("checkcymbal", "cymbal placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][7] = true; //3
                            crashReverbCheckCounter11 = 1;
                            //Log.d("checkcymbal", "cymbal placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][7] = true; //3
                            crashReverbCheckCounter12 = 1;
                            //Log.d("checkcymbal", "cymbal placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][7] = true; //3
                            crashReverbCheckCounter13 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][7] = true; //3
                            crashReverbCheckCounter14 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][7] = true; //3
                            crashReverbCheckCounter15 = 1;
                            //Log.d("checkcymbal", "cymbal placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(crashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][7] = true; //3
                            crashDelayCheckCounter = 1;
                            //Log.d("checkcymbal", "cymbal placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][7] = true; //3
                            crashDelayCheckCounter1 = 1;
                            //Log.d("checkcymbal", "cymbal placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][7] = true; //3
                            crashDelayCheckCounter2 = 1;
                            //Log.d("checkcymbal", "cymbal placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][7] = true; //3
                            crashDelayCheckCounter3 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][7] = true; //3
                            crashDelayCheckCounter4 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][7] = true; //3
                            crashDelayCheckCounter5 = 1;
                            //Log.d("checkcymbal", "cymbal placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][7] = true; //3
                            crashDelayCheckCounter6 = 1;
                            //Log.d("checkcymbal", "cymbal placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][7] = true; //3
                            crashDelayCheckCounter7 = 1;
                            //Log.d("checkcymbal", "cymbal placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][7] = true; //3
                            crashDelayCheckCounter8 = 1;
                            //Log.d("checkcymbal", "cymbal placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][7] = true; //3
                            crashDelayCheckCounter9 = 1;
                            //Log.d("checkcymbal", "cymbal placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][7] = true; //3
                            crashDelayCheckCounter10 = 1;
                            //Log.d("checkcymbal", "cymbal placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][7] = true; //3
                            crashDelayCheckCounter11 = 1;
                            //Log.d("checkcymbal", "cymbal placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][7] = true; //3
                            crashDelayCheckCounter12 = 1;
                            //Log.d("checkcymbal", "cymbal placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][7] = true; //3
                            crashDelayCheckCounter13 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][7] = true; //3
                            crashDelayCheckCounter14 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][7] = true; //3
                            crashDelayCheckCounter15 = 1;
                            //Log.d("checkcymbal", "cymbal placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && !Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(crashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][7] = true; //3
                            crashReverbDelayCheckCounter = 1;
                            //Log.d("checkcymbal", "cymbal placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][7] = true; //3
                            crashReverbDelayCheckCounter1 = 1;
                            //Log.d("checkcymbal", "cymbal placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][7] = true; //3
                            crashReverbDelayCheckCounter2 = 1;
                            //Log.d("checkcymbal", "cymbal placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][7] = true; //3
                            crashReverbDelayCheckCounter3 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][7] = true; //3
                            crashReverbDelayCheckCounter4 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][7] = true; //3
                            crashReverbDelayCheckCounter5 = 1;
                            //Log.d("checkcymbal", "cymbal placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][7] = true; //3
                            crashReverbDelayCheckCounter6 = 1;
                            //Log.d("checkcymbal", "cymbal placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][7] = true; //3
                            crashReverbDelayCheckCounter7 = 1;
                            //Log.d("checkcymbal", "cymbal placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][7] = true; //3
                            crashReverbDelayCheckCounter8 = 1;
                            //Log.d("checkcymbal", "cymbal placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][7] = true; //3
                            crashReverbDelayCheckCounter9 = 1;
                            //Log.d("checkcymbal", "cymbal placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][7] = true; //3
                            crashReverbDelayCheckCounter10 = 1;
                            //Log.d("checkcymbal", "cymbal placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][7] = true; //3
                            crashReverbDelayCheckCounter11 = 1;
                            //Log.d("checkcymbal", "cymbal placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][7] = true; //3
                            crashReverbDelayCheckCounter12 = 1;
                            //Log.d("checkcymbal", "cymbal placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][7] = true; //3
                            crashReverbDelayCheckCounter13 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][7] = true; //3
                            crashReverbDelayCheckCounter14 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][7] = true; //3
                            crashReverbDelayCheckCounter15 = 1;
                            //Log.d("checkcymbal", "cymbal placed in sixteenth bar");
                        }
                    }

                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(electroniccrashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(electroniccrashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==0 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(electroniccrashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f);
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==0) {
                        sp.play(electroniccrashreverb, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][7] = true; //3
                            electronicCrashReverbCheckCounter = 1;
                            //Log.d("checkcymbal", "cymbal placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][7] = true; //3
                            electronicCrashReverbCheckCounter1 = 1;
                            //Log.d("checkcymbal", "cymbal placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][7] = true; //3
                            electronicCrashReverbCheckCounter2 = 1;
                            //Log.d("checkcymbal", "cymbal placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][7] = true; //3
                            electronicCrashReverbCheckCounter3 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][7] = true; //3
                            electronicCrashReverbCheckCounter4 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][7] = true; //3
                            electronicCrashReverbCheckCounter5 = 1;
                            //Log.d("checkcymbal", "cymbal placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][7] = true; //3
                            electronicCrashReverbCheckCounter6 = 1;
                            //Log.d("checkcymbal", "cymbal placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][7] = true; //3
                            electronicCrashReverbCheckCounter7 = 1;
                            //Log.d("checkcymbal", "cymbal placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][7] = true; //3
                            electronicCrashReverbCheckCounter8 = 1;
                            //Log.d("checkcymbal", "cymbal placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][7] = true; //3
                            electronicCrashReverbCheckCounter9 = 1;
                            //Log.d("checkcymbal", "cymbal placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][7] = true; //3
                            electronicCrashReverbCheckCounter10 = 1;
                            //Log.d("checkcymbal", "cymbal placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][7] = true; //3
                            electronicCrashReverbCheckCounter11 = 1;
                            //Log.d("checkcymbal", "cymbal placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][7] = true; //3
                            electronicCrashReverbCheckCounter12 = 1;
                            //Log.d("checkcymbal", "cymbal placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][7] = true; //3
                            electronicCrashReverbCheckCounter13 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][7] = true; //3
                            electronicCrashReverbCheckCounter14 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][7] = true; //3
                            electronicCrashReverbCheckCounter15 = 1;
                            //Log.d("checkcymbal", "cymbal placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==0 && drumDelayCounter==1) {
                        sp.play(electroniccrashdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][7] = true; //3
                            electronicCrashDelayCheckCounter = 1;
                            //Log.d("checkcymbal", "cymbal placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][7] = true; //3
                            electronicCrashDelayCheckCounter1 = 1;
                            //Log.d("checkcymbal", "cymbal placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][7] = true; //3
                            electronicCrashDelayCheckCounter2 = 1;
                            //Log.d("checkcymbal", "cymbal placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][7] = true; //3
                            electronicCrashDelayCheckCounter3 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][7] = true; //3
                            electronicCrashDelayCheckCounter4 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][7] = true; //3
                            electronicCrashDelayCheckCounter5 = 1;
                            //Log.d("checkcymbal", "cymbal placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][7] = true; //3
                            electronicCrashDelayCheckCounter6 = 1;
                            //Log.d("checkcymbal", "cymbal placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][7] = true; //3
                            electronicCrashDelayCheckCounter7 = 1;
                            //Log.d("checkcymbal", "cymbal placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][7] = true; //3
                            electronicCrashDelayCheckCounter8 = 1;
                            //Log.d("checkcymbal", "cymbal placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][7] = true; //3
                            electronicCrashDelayCheckCounter9 = 1;
                            //Log.d("checkcymbal", "cymbal placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][7] = true; //3
                            electronicCrashDelayCheckCounter10 = 1;
                            //Log.d("checkcymbal", "cymbal placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][7] = true; //3
                            electronicCrashDelayCheckCounter11 = 1;
                            //Log.d("checkcymbal", "cymbal placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][7] = true; //3
                            electronicCrashDelayCheckCounter12 = 1;
                            //Log.d("checkcymbal", "cymbal placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][7] = true; //3
                            electronicCrashDelayCheckCounter13 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][7] = true; //3
                            electronicCrashDelayCheckCounter14 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][7] = true; //3
                            electronicCrashDelayCheckCounter15 = 1;
                            //Log.d("checkcymbal", "cymbal placed in sixteenth bar");
                        }
                    }
                    if (motionEvent.getAction() == MotionEvent.ACTION_DOWN && Switch1.isChecked() && sequencerCounter==1 && drumReverbCounter==1 && drumDelayCounter==1) {
                        sp.play(electroniccrashreverbdelay, progressChangedValueCrash, progressChangedValueCrash, 0, 0, 1.0f);
                        sequencerCheckTime = System.currentTimeMillis(); //1
                        sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                        if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { //3
                            sequencerBoolean[0][7] = true; //3
                            electronicCrashReverbDelayCheckCounter = 1;
                            //Log.d("checkcymbal", "cymbal placed in first bar");
                        }
                        if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { //3
                            sequencerBoolean[1][7] = true; //3
                            electronicCrashReverbDelayCheckCounter1 = 1;
                            //Log.d("checkcymbal", "cymbal placed in second bar");
                        }
                        if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { //3
                            sequencerBoolean[2][7] = true; //3
                            electronicCrashReverbDelayCheckCounter2 = 1;
                            //Log.d("checkcymbal", "cymbal placed in third bar");
                        }
                        if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { //3
                            sequencerBoolean[3][7] = true; //3
                            electronicCrashReverbDelayCheckCounter3 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fourth bar");
                        }
                        if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { //3
                            sequencerBoolean[4][7] = true; //3
                            electronicCrashReverbDelayCheckCounter4 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fifth bar");
                        }
                        if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { //3
                            sequencerBoolean[5][7] = true; //3
                            electronicCrashReverbDelayCheckCounter5 = 1;
                            //Log.d("checkcymbal", "cymbal placed in sixth bar");
                        }
                        if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { //3
                            sequencerBoolean[6][7] = true; //3
                            electronicCrashReverbDelayCheckCounter6 = 1;
                            //Log.d("checkcymbal", "cymbal placed in seventh bar");
                        }
                        if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { //3
                            sequencerBoolean[7][7] = true; //3
                            electronicCrashReverbDelayCheckCounter7 = 1;
                            //Log.d("checkcymbal", "cymbal placed in eight bar");
                        }
                        if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { //3
                            sequencerBoolean[8][7] = true; //3
                            electronicCrashReverbDelayCheckCounter8 = 1;
                            //Log.d("checkcymbal", "cymbal placed in ninth bar");
                        }
                        if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { //3
                            sequencerBoolean[9][7] = true; //3
                            electronicCrashReverbDelayCheckCounter9 = 1;
                            //Log.d("checkcymbal", "cymbal placed in tenth bar");
                        }
                        if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { //3
                            sequencerBoolean[10][7] = true; //3
                            electronicCrashReverbDelayCheckCounter10 = 1;
                            //Log.d("checkcymbal", "cymbal placed in eleventh bar");
                        }
                        if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { //3
                            sequencerBoolean[11][7] = true; //3
                            electronicCrashReverbDelayCheckCounter11 = 1;
                            //Log.d("checkcymbal", "cymbal placed in twelfth bar");
                        }
                        if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { //3
                            sequencerBoolean[12][7] = true; //3
                            electronicCrashReverbDelayCheckCounter12 = 1;
                            //Log.d("checkcymbal", "cymbal placed in thirteenth bar");
                        }
                        if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { //3
                            sequencerBoolean[13][7] = true; //3
                            electronicCrashReverbDelayCheckCounter13 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fourteenth bar");
                        }
                        if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { //3
                            sequencerBoolean[14][7] = true; //3
                            electronicCrashReverbDelayCheckCounter14 = 1;
                            //Log.d("checkcymbal", "cymbal placed in fifteenth bar");
                        }
                        if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { //3
                            sequencerBoolean[15][7] = true; //3
                            electronicCrashReverbDelayCheckCounter15 = 1;
                            //Log.d("checkcymbal", "cymbal placed in sixteenth bar");
                        }
                    }
                    break;
            }
            return false;
        }

    }

