package com.example.drummachinetest1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.os.Handler;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View.OnTouchListener;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.PopupMenu;
import android.widget.SeekBar;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity implements View.OnClickListener, OnTouchListener {

    private SoundPool mSoundPool;

    private int GrandPianocsound;
    private int GrandPianodsound;
    private int GrandPianoesound;
    private int GrandPianofsound;
    private int GrandPianogsound;
    private int GrandPianoasound;
    private int GrandPianobsound;
    private int GrandPianoccsound;
    private int GrandPianocssound;
    private int GrandPianocsssound;
    private int GrandPianodssound;
    private int GrandPianogssound;
    private int GrandPianoassound;
    private int GrandPianofssound;

    private int Keyboardcsound;
    private int Keyboarddsound;
    private int Keyboardesound;
    private int Keyboardfsound;
    private int Keyboardgsound;
    private int Keyboardasound;
    private int Keyboardbsound;
    private int Keyboardccsound;
    private int Keyboardcssound;
    private int Keyboardcsssound;
    private int Keyboarddssound;
    private int Keyboardgssound;
    private int Keyboardassound;
    private int Keyboardfssound;

    private int Organcsound;
    private int Organdsound;
    private int Organesound;
    private int Organfsound;
    private int Organgsound;
    private int Organasound;
    private int Organbsound;
    private int Organccsound;
    private int Organcssound;
    private int Organcsssound;
    private int Organdssound;
    private int Organgssound;
    private int Organassound;
    private int Organfssound;

    private int Harpsichordcsound;
    private int Harpsichorddsound;
    private int Harpsichordesound;
    private int Harpsichordfsound;
    private int Harpsichordgsound;
    private int Harpsichordasound;
    private int Harpsichordbsound;
    private int Harpsichordccsound;
    private int Harpsichordcssound;
    private int Harpsichordcsssound;
    private int Harpsichorddssound;
    private int Harpsichordgssound;
    private int Harpsichordassound;
    private int Harpsichordfssound;

    private int Dx7csound;
    private int Dx7dsound;
    private int Dx7esound;
    private int Dx7fsound;
    private int Dx7gsound;
    private int Dx7asound;
    private int Dx7bsound;
    private int Dx7ccsound;
    private int Dx7cssound;
    private int Dx7csssound;
    private int Dx7dssound;
    private int Dx7gssound;
    private int Dx7assound;
    private int Dx7fssound;

    private int Cs80csound;
    private int Cs80dsound;
    private int Cs80esound;
    private int Cs80fsound;
    private int Cs80gsound;
    private int Cs80asound;
    private int Cs80bsound;
    private int Cs80ccsound;
    private int Cs80cssound;
    private int Cs80csssound;
    private int Cs80dssound;
    private int Cs80gssound;
    private int Cs80assound;
    private int Cs80fssound;

    private int GrandPianocsoundabove;
    private int GrandPianodsoundabove;
    private int GrandPianoesoundabove;
    private int GrandPianofsoundabove;
    private int GrandPianogsoundabove;
    private int GrandPianoasoundabove;
    private int GrandPianobsoundabove;
    private int GrandPianoccsoundabove;
    private int GrandPianocssoundabove;
    private int GrandPianocsssoundabove;
    private int GrandPianodssoundabove;
    private int GrandPianogssoundabove;
    private int GrandPianoassoundabove;
    private int GrandPianofssoundabove;

    private int Keyboardcsoundabove;
    private int Keyboarddsoundabove;
    private int Keyboardesoundabove;
    private int Keyboardfsoundabove;
    private int Keyboardgsoundabove;
    private int Keyboardasoundabove;
    private int Keyboardbsoundabove;
    private int Keyboardccsoundabove;
    private int Keyboardcssoundabove;
    private int Keyboardcsssoundabove;
    private int Keyboarddssoundabove;
    private int Keyboardgssoundabove;
    private int Keyboardassoundabove;
    private int Keyboardfssoundabove;

    private int Organcsoundabove;
    private int Organdsoundabove;
    private int Organesoundabove;
    private int Organfsoundabove;
    private int Organgsoundabove;
    private int Organasoundabove;
    private int Organbsoundabove;
    private int Organccsoundabove;
    private int Organcssoundabove;
    private int Organcsssoundabove;
    private int Organdssoundabove;
    private int Organgssoundabove;
    private int Organassoundabove;
    private int Organfssoundabove;

    private int Harpsichordcsoundabove;
    private int Harpsichorddsoundabove;
    private int Harpsichordesoundabove;
    private int Harpsichordfsoundabove;
    private int Harpsichordgsoundabove;
    private int Harpsichordasoundabove;
    private int Harpsichordbsoundabove;
    private int Harpsichordccsoundabove;
    private int Harpsichordcssoundabove;
    private int Harpsichordcsssoundabove;
    private int Harpsichorddssoundabove;
    private int Harpsichordgssoundabove;
    private int Harpsichordassoundabove;
    private int Harpsichordfssoundabove;

    private int Dx7csoundabove;
    private int Dx7dsoundabove;
    private int Dx7esoundabove;
    private int Dx7fsoundabove;
    private int Dx7gsoundabove;
    private int Dx7asoundabove;
    private int Dx7bsoundabove;
    private int Dx7ccsoundabove;
    private int Dx7cssoundabove;
    private int Dx7csssoundabove;
    private int Dx7dssoundabove;
    private int Dx7gssoundabove;
    private int Dx7assoundabove;
    private int Dx7fssoundabove;

    private int Cs80csoundabove;
    private int Cs80dsoundabove;
    private int Cs80esoundabove;
    private int Cs80fsoundabove;
    private int Cs80gsoundabove;
    private int Cs80asoundabove;
    private int Cs80bsoundabove;
    private int Cs80ccsoundabove;
    private int Cs80cssoundabove;
    private int Cs80csssoundabove;
    private int Cs80dssoundabove;
    private int Cs80gssoundabove;
    private int Cs80assoundabove;
    private int Cs80fssoundabove;

    private int GrandPianocsoundbelow;
    private int GrandPianodsoundbelow;
    private int GrandPianoesoundbelow;
    private int GrandPianofsoundbelow;
    private int GrandPianogsoundbelow;
    private int GrandPianoasoundbelow;
    private int GrandPianobsoundbelow;
    private int GrandPianoccsoundbelow;
    private int GrandPianocssoundbelow;
    private int GrandPianocsssoundbelow;
    private int GrandPianodssoundbelow;
    private int GrandPianogssoundbelow;
    private int GrandPianoassoundbelow;
    private int GrandPianofssoundbelow;

    private int Keyboardcsoundbelow;
    private int Keyboarddsoundbelow;
    private int Keyboardesoundbelow;
    private int Keyboardfsoundbelow;
    private int Keyboardgsoundbelow;
    private int Keyboardasoundbelow;
    private int Keyboardbsoundbelow;
    private int Keyboardccsoundbelow;
    private int Keyboardcssoundbelow;
    private int Keyboardcsssoundbelow;
    private int Keyboarddssoundbelow;
    private int Keyboardgssoundbelow;
    private int Keyboardassoundbelow;
    private int Keyboardfssoundbelow;

    private int Organcsoundbelow;
    private int Organdsoundbelow;
    private int Organesoundbelow;
    private int Organfsoundbelow;
    private int Organgsoundbelow;
    private int Organasoundbelow;
    private int Organbsoundbelow;
    private int Organccsoundbelow;
    private int Organcssoundbelow;
    private int Organcsssoundbelow;
    private int Organdssoundbelow;
    private int Organgssoundbelow;
    private int Organassoundbelow;
    private int Organfssoundbelow;

    private int Harpsichordcsoundbelow;
    private int Harpsichorddsoundbelow;
    private int Harpsichordesoundbelow;
    private int Harpsichordfsoundbelow;
    private int Harpsichordgsoundbelow;
    private int Harpsichordasoundbelow;
    private int Harpsichordbsoundbelow;
    private int Harpsichordccsoundbelow;
    private int Harpsichordcssoundbelow;
    private int Harpsichordcsssoundbelow;
    private int Harpsichorddssoundbelow;
    private int Harpsichordgssoundbelow;
    private int Harpsichordassoundbelow;
    private int Harpsichordfssoundbelow;

    private int Dx7csoundbelow;
    private int Dx7dsoundbelow;
    private int Dx7esoundbelow;
    private int Dx7fsoundbelow;
    private int Dx7gsoundbelow;
    private int Dx7asoundbelow;
    private int Dx7bsoundbelow;
    private int Dx7ccsoundbelow;
    private int Dx7cssoundbelow;
    private int Dx7csssoundbelow;
    private int Dx7dssoundbelow;
    private int Dx7gssoundbelow;
    private int Dx7assoundbelow;
    private int Dx7fssoundbelow;

    private int Cs80csoundbelow;
    private int Cs80dsoundbelow;
    private int Cs80esoundbelow;
    private int Cs80fsoundbelow;
    private int Cs80gsoundbelow;
    private int Cs80asoundbelow;
    private int Cs80bsoundbelow;
    private int Cs80ccsoundbelow;
    private int Cs80cssoundbelow;
    private int Cs80csssoundbelow;
    private int Cs80dssoundbelow;
    private int Cs80gssoundbelow;
    private int Cs80assoundbelow;
    private int Cs80fssoundbelow;

    ImageButton myImageButtonViewRefDrums;
    ImageButton myImageButtonViewRefGuitar;
    ImageButton myImageButtonViewRefPiano;
    ImageButton myImageButtonViewRefSequencer4;
    ImageButton myImageButtonViewRefStop4;

    Button myButtonViewRefGrandPiano;
    Button myButtonViewRefKeyboard;
    Button myButtonViewRefOrgan;
    Button myButtonViewRefHarpsichord;
    Button myButtonViewRefDx7;
    Button myButtonViewRefCs80;

    Button buttonPianoC;
    Button buttonPianoD;
    Button buttonPianoE;
    Button buttonPianoF;
    Button buttonPianoG;
    Button buttonPianoA;
    Button buttonPianoB;
    Button buttonPianoC2;
    Button buttonPianoCSharp;
    Button buttonPianoDSharp;
    Button buttonPianoFSharp;
    Button buttonPianoGSharp;
    Button buttonPianoASharp;
    Button buttonPianoC2Sharp;

    Button myButtonViewRefVolumeControl;

    Button myButtonViewRefOctaveUp;
    Button myButtonViewRefOctaveDown;
    Switch switchChords;

    View myViewRefRedCircle4;

    double grandPianoCounter = 1;
    double keyboardCounter = 0;
    double organCounter = 0;
    double harpsichordCounter = 0;
    double dx7Counter = 0;
    double cs80Counter = 0;
    double sequencerCounter4 = 0;
    double octaveCounterUp = 0;
    double octaveCounterDown = 0;
    double chordCounter = 0;
    double stopCounter4 = 0;

    long sequencerStartTime;
    long sequencerCheckTime;
    long sequencerCompareTime;

    boolean[][] sequencerBoolean = new boolean[16][15];

    private int metronomeFirstBar;
    private int metronomeSecondThirdFourthBar;

    int countering = 0;
    int checkPresses = 0;
    int testVariable = 0;

    SeekBar seekBar;
    AudioManager audioManager;
    int maxvolume;
    int currentvolume;

    SeekBar seekBarGrandPiano;
    SeekBar seekBarHarpsichord;
    SeekBar seekBarOrgan;
    SeekBar seekBarKeyboard;
    SeekBar seekBarDx7;
    SeekBar seekBarCs80;
    float progressChangedValueGrandPiano = 1;
    float progressChangedValueHarpsichord = 1;
    float progressChangedValueOrgan = 1;
    float progressChangedValueKeyboard = 1;
    float progressChangedValueDx7 = 1;
    float progressChangedValueCs80 = 1;

    int cCheckCounterGrandPiano = 0; int cCheckCounterGrandPiano1 = 0; int cCheckCounterGrandPiano2 = 0; int cCheckCounterGrandPiano3 = 0; int cCheckCounterGrandPiano4 = 0; int cCheckCounterGrandPiano5 = 0; int cCheckCounterGrandPiano6 = 0; int cCheckCounterGrandPiano7 = 0; int cCheckCounterGrandPiano8 = 0; int cCheckCounterGrandPiano9 = 0; int cCheckCounterGrandPiano10 = 0; int cCheckCounterGrandPiano11 = 0; int cCheckCounterGrandPiano12 = 0; int cCheckCounterGrandPiano13 = 0; int cCheckCounterGrandPiano14 = 0; int cCheckCounterGrandPiano15 = 0;
    int cCheckCounterHarpsichord = 0; int cCheckCounterHarpsichord1 = 0; int cCheckCounterHarpsichord2 = 0; int cCheckCounterHarpsichord3 = 0; int cCheckCounterHarpsichord4 = 0; int cCheckCounterHarpsichord5 = 0; int cCheckCounterHarpsichord6 = 0; int cCheckCounterHarpsichord7 = 0; int cCheckCounterHarpsichord8 = 0; int cCheckCounterHarpsichord9 = 0; int cCheckCounterHarpsichord10 = 0; int cCheckCounterHarpsichord11 = 0; int cCheckCounterHarpsichord12 = 0; int cCheckCounterHarpsichord13 = 0; int cCheckCounterHarpsichord14 = 0; int cCheckCounterHarpsichord15 = 0;
    int cCheckCounterOrgan = 0; int cCheckCounterOrgan1 = 0; int cCheckCounterOrgan2 = 0; int cCheckCounterOrgan3 = 0; int cCheckCounterOrgan4 = 0; int cCheckCounterOrgan5 = 0; int cCheckCounterOrgan6 = 0; int cCheckCounterOrgan7 = 0; int cCheckCounterOrgan8 = 0; int cCheckCounterOrgan9 = 0; int cCheckCounterOrgan10 = 0; int cCheckCounterOrgan11 = 0; int cCheckCounterOrgan12 = 0; int cCheckCounterOrgan13 = 0; int cCheckCounterOrgan14 = 0; int cCheckCounterOrgan15 = 0;
    int cCheckCounterKeyboard = 0; int cCheckCounterKeyboard1 = 0; int cCheckCounterKeyboard2 = 0; int cCheckCounterKeyboard3 = 0; int cCheckCounterKeyboard4 = 0; int cCheckCounterKeyboard5 = 0; int cCheckCounterKeyboard6 = 0; int cCheckCounterKeyboard7 = 0; int cCheckCounterKeyboard8 = 0; int cCheckCounterKeyboard9 = 0; int cCheckCounterKeyboard10 = 0; int cCheckCounterKeyboard11 = 0; int cCheckCounterKeyboard12 = 0; int cCheckCounterKeyboard13 = 0; int cCheckCounterKeyboard14 = 0; int cCheckCounterKeyboard15 = 0;
    int cCheckCounterDx7 = 0; int cCheckCounterDx71 = 0; int cCheckCounterDx72 = 0; int cCheckCounterDx73 = 0; int cCheckCounterDx74 = 0; int cCheckCounterDx75 = 0; int cCheckCounterDx76 = 0; int cCheckCounterDx77 = 0; int cCheckCounterDx78 = 0; int cCheckCounterDx79 = 0; int cCheckCounterDx710 = 0; int cCheckCounterDx711 = 0; int cCheckCounterDx712 = 0; int cCheckCounterDx713 = 0; int cCheckCounterDx714 = 0; int cCheckCounterDx715 = 0;
    int cCheckCounterCs80 = 0; int cCheckCounterCs801 = 0; int cCheckCounterCs802 = 0; int cCheckCounterCs803 = 0; int cCheckCounterCs804 = 0; int cCheckCounterCs805 = 0; int cCheckCounterCs806 = 0; int cCheckCounterCs807 = 0; int cCheckCounterCs808 = 0; int cCheckCounterCs809 = 0; int cCheckCounterCs8010 = 0; int cCheckCounterCs8011 = 0; int cCheckCounterCs8012 = 0; int cCheckCounterCs8013 = 0; int cCheckCounterCs8014 = 0; int cCheckCounterCs8015 = 0;

    int dCheckCounterGrandPiano = 0; int dCheckCounterGrandPiano1 = 0; int dCheckCounterGrandPiano2 = 0; int dCheckCounterGrandPiano3 = 0; int dCheckCounterGrandPiano4 = 0; int dCheckCounterGrandPiano5 = 0; int dCheckCounterGrandPiano6 = 0; int dCheckCounterGrandPiano7 = 0; int dCheckCounterGrandPiano8 = 0; int dCheckCounterGrandPiano9 = 0; int dCheckCounterGrandPiano10 = 0; int dCheckCounterGrandPiano11 = 0; int dCheckCounterGrandPiano12 = 0; int dCheckCounterGrandPiano13 = 0; int dCheckCounterGrandPiano14 = 0; int dCheckCounterGrandPiano15 = 0;
    int dCheckCounterHarpsichord = 0; int dCheckCounterHarpsichord1 = 0; int dCheckCounterHarpsichord2 = 0; int dCheckCounterHarpsichord3 = 0; int dCheckCounterHarpsichord4 = 0; int dCheckCounterHarpsichord5 = 0; int dCheckCounterHarpsichord6 = 0; int dCheckCounterHarpsichord7 = 0; int dCheckCounterHarpsichord8 = 0; int dCheckCounterHarpsichord9 = 0; int dCheckCounterHarpsichord10 = 0; int dCheckCounterHarpsichord11 = 0; int dCheckCounterHarpsichord12 = 0; int dCheckCounterHarpsichord13 = 0; int dCheckCounterHarpsichord14 = 0; int dCheckCounterHarpsichord15 = 0;
    int dCheckCounterOrgan = 0; int dCheckCounterOrgan1 = 0; int dCheckCounterOrgan2 = 0; int dCheckCounterOrgan3 = 0; int dCheckCounterOrgan4 = 0; int dCheckCounterOrgan5 = 0; int dCheckCounterOrgan6 = 0; int dCheckCounterOrgan7 = 0; int dCheckCounterOrgan8 = 0; int dCheckCounterOrgan9 = 0; int dCheckCounterOrgan10 = 0; int dCheckCounterOrgan11 = 0; int dCheckCounterOrgan12 = 0; int dCheckCounterOrgan13 = 0; int dCheckCounterOrgan14 = 0; int dCheckCounterOrgan15 = 0;
    int dCheckCounterKeyboard = 0; int dCheckCounterKeyboard1 = 0; int dCheckCounterKeyboard2 = 0; int dCheckCounterKeyboard3 = 0; int dCheckCounterKeyboard4 = 0; int dCheckCounterKeyboard5 = 0; int dCheckCounterKeyboard6 = 0; int dCheckCounterKeyboard7 = 0; int dCheckCounterKeyboard8 = 0; int dCheckCounterKeyboard9 = 0; int dCheckCounterKeyboard10 = 0; int dCheckCounterKeyboard11 = 0; int dCheckCounterKeyboard12 = 0; int dCheckCounterKeyboard13 = 0; int dCheckCounterKeyboard14 = 0; int dCheckCounterKeyboard15 = 0;
    int dCheckCounterDx7 = 0; int dCheckCounterDx71 = 0; int dCheckCounterDx72 = 0; int dCheckCounterDx73 = 0; int dCheckCounterDx74 = 0; int dCheckCounterDx75 = 0; int dCheckCounterDx76 = 0; int dCheckCounterDx77 = 0; int dCheckCounterDx78 = 0; int dCheckCounterDx79 = 0; int dCheckCounterDx710 = 0; int dCheckCounterDx711 = 0; int dCheckCounterDx712 = 0; int dCheckCounterDx713 = 0; int dCheckCounterDx714 = 0; int dCheckCounterDx715 = 0;
    int dCheckCounterCs80 = 0; int dCheckCounterCs801 = 0; int dCheckCounterCs802 = 0; int dCheckCounterCs803 = 0; int dCheckCounterCs804 = 0; int dCheckCounterCs805 = 0; int dCheckCounterCs806 = 0; int dCheckCounterCs807 = 0; int dCheckCounterCs808 = 0; int dCheckCounterCs809 = 0; int dCheckCounterCs8010 = 0; int dCheckCounterCs8011 = 0; int dCheckCounterCs8012 = 0; int dCheckCounterCs8013 = 0; int dCheckCounterCs8014 = 0; int dCheckCounterCs8015 = 0;

    int eCheckCounterGrandPiano = 0; int eCheckCounterGrandPiano1 = 0; int eCheckCounterGrandPiano2 = 0; int eCheckCounterGrandPiano3 = 0; int eCheckCounterGrandPiano4 = 0; int eCheckCounterGrandPiano5 = 0; int eCheckCounterGrandPiano6 = 0; int eCheckCounterGrandPiano7 = 0; int eCheckCounterGrandPiano8 = 0; int eCheckCounterGrandPiano9 = 0; int eCheckCounterGrandPiano10 = 0; int eCheckCounterGrandPiano11 = 0; int eCheckCounterGrandPiano12 = 0; int eCheckCounterGrandPiano13 = 0; int eCheckCounterGrandPiano14 = 0; int eCheckCounterGrandPiano15 = 0;
    int eCheckCounterHarpsichord = 0; int eCheckCounterHarpsichord1 = 0; int eCheckCounterHarpsichord2 = 0; int eCheckCounterHarpsichord3 = 0; int eCheckCounterHarpsichord4 = 0; int eCheckCounterHarpsichord5 = 0; int eCheckCounterHarpsichord6 = 0; int eCheckCounterHarpsichord7 = 0; int eCheckCounterHarpsichord8 = 0; int eCheckCounterHarpsichord9 = 0; int eCheckCounterHarpsichord10 = 0; int eCheckCounterHarpsichord11 = 0; int eCheckCounterHarpsichord12 = 0; int eCheckCounterHarpsichord13 = 0; int eCheckCounterHarpsichord14 = 0; int eCheckCounterHarpsichord15 = 0;
    int eCheckCounterOrgan = 0; int eCheckCounterOrgan1 = 0; int eCheckCounterOrgan2 = 0; int eCheckCounterOrgan3 = 0; int eCheckCounterOrgan4 = 0; int eCheckCounterOrgan5 = 0; int eCheckCounterOrgan6 = 0; int eCheckCounterOrgan7 = 0; int eCheckCounterOrgan8 = 0; int eCheckCounterOrgan9 = 0; int eCheckCounterOrgan10 = 0; int eCheckCounterOrgan11 = 0; int eCheckCounterOrgan12 = 0; int eCheckCounterOrgan13 = 0; int eCheckCounterOrgan14 = 0; int eCheckCounterOrgan15 = 0;
    int eCheckCounterKeyboard = 0; int eCheckCounterKeyboard1 = 0; int eCheckCounterKeyboard2 = 0; int eCheckCounterKeyboard3 = 0; int eCheckCounterKeyboard4 = 0; int eCheckCounterKeyboard5 = 0; int eCheckCounterKeyboard6 = 0; int eCheckCounterKeyboard7 = 0; int eCheckCounterKeyboard8 = 0; int eCheckCounterKeyboard9 = 0; int eCheckCounterKeyboard10 = 0; int eCheckCounterKeyboard11 = 0; int eCheckCounterKeyboard12 = 0; int eCheckCounterKeyboard13 = 0; int eCheckCounterKeyboard14 = 0; int eCheckCounterKeyboard15 = 0;
    int eCheckCounterDx7 = 0; int eCheckCounterDx71 = 0; int eCheckCounterDx72 = 0; int eCheckCounterDx73 = 0; int eCheckCounterDx74 = 0; int eCheckCounterDx75 = 0; int eCheckCounterDx76 = 0; int eCheckCounterDx77 = 0; int eCheckCounterDx78 = 0; int eCheckCounterDx79 = 0; int eCheckCounterDx710 = 0; int eCheckCounterDx711 = 0; int eCheckCounterDx712 = 0; int eCheckCounterDx713 = 0; int eCheckCounterDx714 = 0; int eCheckCounterDx715 = 0;
    int eCheckCounterCs80 = 0; int eCheckCounterCs801 = 0; int eCheckCounterCs802 = 0; int eCheckCounterCs803 = 0; int eCheckCounterCs804 = 0; int eCheckCounterCs805 = 0; int eCheckCounterCs806 = 0; int eCheckCounterCs807 = 0; int eCheckCounterCs808 = 0; int eCheckCounterCs809 = 0; int eCheckCounterCs8010 = 0; int eCheckCounterCs8011 = 0; int eCheckCounterCs8012 = 0; int eCheckCounterCs8013 = 0; int eCheckCounterCs8014 = 0; int eCheckCounterCs8015 = 0;

    int fCheckCounterGrandPiano = 0; int fCheckCounterGrandPiano1 = 0; int fCheckCounterGrandPiano2 = 0; int fCheckCounterGrandPiano3 = 0; int fCheckCounterGrandPiano4 = 0; int fCheckCounterGrandPiano5 = 0; int fCheckCounterGrandPiano6 = 0; int fCheckCounterGrandPiano7 = 0; int fCheckCounterGrandPiano8 = 0; int fCheckCounterGrandPiano9 = 0; int fCheckCounterGrandPiano10 = 0; int fCheckCounterGrandPiano11 = 0; int fCheckCounterGrandPiano12 = 0; int fCheckCounterGrandPiano13 = 0; int fCheckCounterGrandPiano14 = 0; int fCheckCounterGrandPiano15 = 0;
    int fCheckCounterHarpsichord = 0; int fCheckCounterHarpsichord1 = 0; int fCheckCounterHarpsichord2 = 0; int fCheckCounterHarpsichord3 = 0; int fCheckCounterHarpsichord4 = 0; int fCheckCounterHarpsichord5 = 0; int fCheckCounterHarpsichord6 = 0; int fCheckCounterHarpsichord7 = 0; int fCheckCounterHarpsichord8 = 0; int fCheckCounterHarpsichord9 = 0; int fCheckCounterHarpsichord10 = 0; int fCheckCounterHarpsichord11 = 0; int fCheckCounterHarpsichord12 = 0; int fCheckCounterHarpsichord13 = 0; int fCheckCounterHarpsichord14 = 0; int fCheckCounterHarpsichord15 = 0;
    int fCheckCounterOrgan = 0; int fCheckCounterOrgan1 = 0; int fCheckCounterOrgan2 = 0; int fCheckCounterOrgan3 = 0; int fCheckCounterOrgan4 = 0; int fCheckCounterOrgan5 = 0; int fCheckCounterOrgan6 = 0; int fCheckCounterOrgan7 = 0; int fCheckCounterOrgan8 = 0; int fCheckCounterOrgan9 = 0; int fCheckCounterOrgan10 = 0; int fCheckCounterOrgan11 = 0; int fCheckCounterOrgan12 = 0; int fCheckCounterOrgan13 = 0; int fCheckCounterOrgan14 = 0; int fCheckCounterOrgan15 = 0;
    int fCheckCounterKeyboard = 0; int fCheckCounterKeyboard1 = 0; int fCheckCounterKeyboard2 = 0; int fCheckCounterKeyboard3 = 0; int fCheckCounterKeyboard4 = 0; int fCheckCounterKeyboard5 = 0; int fCheckCounterKeyboard6 = 0; int fCheckCounterKeyboard7 = 0; int fCheckCounterKeyboard8 = 0; int fCheckCounterKeyboard9 = 0; int fCheckCounterKeyboard10 = 0; int fCheckCounterKeyboard11 = 0; int fCheckCounterKeyboard12 = 0; int fCheckCounterKeyboard13 = 0; int fCheckCounterKeyboard14 = 0; int fCheckCounterKeyboard15 = 0;
    int fCheckCounterDx7 = 0; int fCheckCounterDx71 = 0; int fCheckCounterDx72 = 0; int fCheckCounterDx73 = 0; int fCheckCounterDx74 = 0; int fCheckCounterDx75 = 0; int fCheckCounterDx76 = 0; int fCheckCounterDx77 = 0; int fCheckCounterDx78 = 0; int fCheckCounterDx79 = 0; int fCheckCounterDx710 = 0; int fCheckCounterDx711 = 0; int fCheckCounterDx712 = 0; int fCheckCounterDx713 = 0; int fCheckCounterDx714 = 0; int fCheckCounterDx715 = 0;
    int fCheckCounterCs80 = 0; int fCheckCounterCs801 = 0; int fCheckCounterCs802 = 0; int fCheckCounterCs803 = 0; int fCheckCounterCs804 = 0; int fCheckCounterCs805 = 0; int fCheckCounterCs806 = 0; int fCheckCounterCs807 = 0; int fCheckCounterCs808 = 0; int fCheckCounterCs809 = 0; int fCheckCounterCs8010 = 0; int fCheckCounterCs8011 = 0; int fCheckCounterCs8012 = 0; int fCheckCounterCs8013 = 0; int fCheckCounterCs8014 = 0; int fCheckCounterCs8015 = 0;

    int gCheckCounterGrandPiano = 0; int gCheckCounterGrandPiano1 = 0; int gCheckCounterGrandPiano2 = 0; int gCheckCounterGrandPiano3 = 0; int gCheckCounterGrandPiano4 = 0; int gCheckCounterGrandPiano5 = 0; int gCheckCounterGrandPiano6 = 0; int gCheckCounterGrandPiano7 = 0; int gCheckCounterGrandPiano8 = 0; int gCheckCounterGrandPiano9 = 0; int gCheckCounterGrandPiano10 = 0; int gCheckCounterGrandPiano11 = 0; int gCheckCounterGrandPiano12 = 0; int gCheckCounterGrandPiano13 = 0; int gCheckCounterGrandPiano14 = 0; int gCheckCounterGrandPiano15 = 0;
    int gCheckCounterHarpsichord = 0; int gCheckCounterHarpsichord1 = 0; int gCheckCounterHarpsichord2 = 0; int gCheckCounterHarpsichord3 = 0; int gCheckCounterHarpsichord4 = 0; int gCheckCounterHarpsichord5 = 0; int gCheckCounterHarpsichord6 = 0; int gCheckCounterHarpsichord7 = 0; int gCheckCounterHarpsichord8 = 0; int gCheckCounterHarpsichord9 = 0; int gCheckCounterHarpsichord10 = 0; int gCheckCounterHarpsichord11 = 0; int gCheckCounterHarpsichord12 = 0; int gCheckCounterHarpsichord13 = 0; int gCheckCounterHarpsichord14 = 0; int gCheckCounterHarpsichord15 = 0;
    int gCheckCounterOrgan = 0; int gCheckCounterOrgan1 = 0; int gCheckCounterOrgan2 = 0; int gCheckCounterOrgan3 = 0; int gCheckCounterOrgan4 = 0; int gCheckCounterOrgan5 = 0; int gCheckCounterOrgan6 = 0; int gCheckCounterOrgan7 = 0; int gCheckCounterOrgan8 = 0; int gCheckCounterOrgan9 = 0; int gCheckCounterOrgan10 = 0; int gCheckCounterOrgan11 = 0; int gCheckCounterOrgan12 = 0; int gCheckCounterOrgan13 = 0; int gCheckCounterOrgan14 = 0; int gCheckCounterOrgan15 = 0;
    int gCheckCounterKeyboard = 0; int gCheckCounterKeyboard1 = 0; int gCheckCounterKeyboard2 = 0; int gCheckCounterKeyboard3 = 0; int gCheckCounterKeyboard4 = 0; int gCheckCounterKeyboard5 = 0; int gCheckCounterKeyboard6 = 0; int gCheckCounterKeyboard7 = 0; int gCheckCounterKeyboard8 = 0; int gCheckCounterKeyboard9 = 0; int gCheckCounterKeyboard10 = 0; int gCheckCounterKeyboard11 = 0; int gCheckCounterKeyboard12 = 0; int gCheckCounterKeyboard13 = 0; int gCheckCounterKeyboard14 = 0; int gCheckCounterKeyboard15 = 0;
    int gCheckCounterDx7 = 0; int gCheckCounterDx71 = 0; int gCheckCounterDx72 = 0; int gCheckCounterDx73 = 0; int gCheckCounterDx74 = 0; int gCheckCounterDx75 = 0; int gCheckCounterDx76 = 0; int gCheckCounterDx77 = 0; int gCheckCounterDx78 = 0; int gCheckCounterDx79 = 0; int gCheckCounterDx710 = 0; int gCheckCounterDx711 = 0; int gCheckCounterDx712 = 0; int gCheckCounterDx713 = 0; int gCheckCounterDx714 = 0; int gCheckCounterDx715 = 0;
    int gCheckCounterCs80 = 0; int gCheckCounterCs801 = 0; int gCheckCounterCs802 = 0; int gCheckCounterCs803 = 0; int gCheckCounterCs804 = 0; int gCheckCounterCs805 = 0; int gCheckCounterCs806 = 0; int gCheckCounterCs807 = 0; int gCheckCounterCs808 = 0; int gCheckCounterCs809 = 0; int gCheckCounterCs8010 = 0; int gCheckCounterCs8011 = 0; int gCheckCounterCs8012 = 0; int gCheckCounterCs8013 = 0; int gCheckCounterCs8014 = 0; int gCheckCounterCs8015 = 0;

    int aCheckCounterGrandPiano = 0; int aCheckCounterGrandPiano1 = 0; int aCheckCounterGrandPiano2 = 0; int aCheckCounterGrandPiano3 = 0; int aCheckCounterGrandPiano4 = 0; int aCheckCounterGrandPiano5 = 0; int aCheckCounterGrandPiano6 = 0; int aCheckCounterGrandPiano7 = 0; int aCheckCounterGrandPiano8 = 0; int aCheckCounterGrandPiano9 = 0; int aCheckCounterGrandPiano10 = 0; int aCheckCounterGrandPiano11 = 0; int aCheckCounterGrandPiano12 = 0; int aCheckCounterGrandPiano13 = 0; int aCheckCounterGrandPiano14 = 0; int aCheckCounterGrandPiano15 = 0;
    int aCheckCounterHarpsichord = 0; int aCheckCounterHarpsichord1 = 0; int aCheckCounterHarpsichord2 = 0; int aCheckCounterHarpsichord3 = 0; int aCheckCounterHarpsichord4 = 0; int aCheckCounterHarpsichord5 = 0; int aCheckCounterHarpsichord6 = 0; int aCheckCounterHarpsichord7 = 0; int aCheckCounterHarpsichord8 = 0; int aCheckCounterHarpsichord9 = 0; int aCheckCounterHarpsichord10 = 0; int aCheckCounterHarpsichord11 = 0; int aCheckCounterHarpsichord12 = 0; int aCheckCounterHarpsichord13 = 0; int aCheckCounterHarpsichord14 = 0; int aCheckCounterHarpsichord15 = 0;
    int aCheckCounterOrgan = 0; int aCheckCounterOrgan1 = 0; int aCheckCounterOrgan2 = 0; int aCheckCounterOrgan3 = 0; int aCheckCounterOrgan4 = 0; int aCheckCounterOrgan5 = 0; int aCheckCounterOrgan6 = 0; int aCheckCounterOrgan7 = 0; int aCheckCounterOrgan8 = 0; int aCheckCounterOrgan9 = 0; int aCheckCounterOrgan10 = 0; int aCheckCounterOrgan11 = 0; int aCheckCounterOrgan12 = 0; int aCheckCounterOrgan13 = 0; int aCheckCounterOrgan14 = 0; int aCheckCounterOrgan15 = 0;
    int aCheckCounterKeyboard = 0; int aCheckCounterKeyboard1 = 0; int aCheckCounterKeyboard2 = 0; int aCheckCounterKeyboard3 = 0; int aCheckCounterKeyboard4 = 0; int aCheckCounterKeyboard5 = 0; int aCheckCounterKeyboard6 = 0; int aCheckCounterKeyboard7 = 0; int aCheckCounterKeyboard8 = 0; int aCheckCounterKeyboard9 = 0; int aCheckCounterKeyboard10 = 0; int aCheckCounterKeyboard11 = 0; int aCheckCounterKeyboard12 = 0; int aCheckCounterKeyboard13 = 0; int aCheckCounterKeyboard14 = 0; int aCheckCounterKeyboard15 = 0;
    int aCheckCounterDx7 = 0; int aCheckCounterDx71 = 0; int aCheckCounterDx72 = 0; int aCheckCounterDx73 = 0; int aCheckCounterDx74 = 0; int aCheckCounterDx75 = 0; int aCheckCounterDx76 = 0; int aCheckCounterDx77 = 0; int aCheckCounterDx78 = 0; int aCheckCounterDx79 = 0; int aCheckCounterDx710 = 0; int aCheckCounterDx711 = 0; int aCheckCounterDx712 = 0; int aCheckCounterDx713 = 0; int aCheckCounterDx714 = 0; int aCheckCounterDx715 = 0;
    int aCheckCounterCs80 = 0; int aCheckCounterCs801 = 0; int aCheckCounterCs802 = 0; int aCheckCounterCs803 = 0; int aCheckCounterCs804 = 0; int aCheckCounterCs805 = 0; int aCheckCounterCs806 = 0; int aCheckCounterCs807 = 0; int aCheckCounterCs808 = 0; int aCheckCounterCs809 = 0; int aCheckCounterCs8010 = 0; int aCheckCounterCs8011 = 0; int aCheckCounterCs8012 = 0; int aCheckCounterCs8013 = 0; int aCheckCounterCs8014 = 0; int aCheckCounterCs8015 = 0;

    int bCheckCounterGrandPiano = 0; int bCheckCounterGrandPiano1 = 0; int bCheckCounterGrandPiano2 = 0; int bCheckCounterGrandPiano3 = 0; int bCheckCounterGrandPiano4 = 0; int bCheckCounterGrandPiano5 = 0; int bCheckCounterGrandPiano6 = 0; int bCheckCounterGrandPiano7 = 0; int bCheckCounterGrandPiano8 = 0; int bCheckCounterGrandPiano9 = 0; int bCheckCounterGrandPiano10 = 0; int bCheckCounterGrandPiano11 = 0; int bCheckCounterGrandPiano12 = 0; int bCheckCounterGrandPiano13 = 0; int bCheckCounterGrandPiano14 = 0; int bCheckCounterGrandPiano15 = 0;
    int bCheckCounterHarpsichord = 0; int bCheckCounterHarpsichord1 = 0; int bCheckCounterHarpsichord2 = 0; int bCheckCounterHarpsichord3 = 0; int bCheckCounterHarpsichord4 = 0; int bCheckCounterHarpsichord5 = 0; int bCheckCounterHarpsichord6 = 0; int bCheckCounterHarpsichord7 = 0; int bCheckCounterHarpsichord8 = 0; int bCheckCounterHarpsichord9 = 0; int bCheckCounterHarpsichord10 = 0; int bCheckCounterHarpsichord11 = 0; int bCheckCounterHarpsichord12 = 0; int bCheckCounterHarpsichord13 = 0; int bCheckCounterHarpsichord14 = 0; int bCheckCounterHarpsichord15 = 0;
    int bCheckCounterOrgan = 0; int bCheckCounterOrgan1 = 0; int bCheckCounterOrgan2 = 0; int bCheckCounterOrgan3 = 0; int bCheckCounterOrgan4 = 0; int bCheckCounterOrgan5 = 0; int bCheckCounterOrgan6 = 0; int bCheckCounterOrgan7 = 0; int bCheckCounterOrgan8 = 0; int bCheckCounterOrgan9 = 0; int bCheckCounterOrgan10 = 0; int bCheckCounterOrgan11 = 0; int bCheckCounterOrgan12 = 0; int bCheckCounterOrgan13 = 0; int bCheckCounterOrgan14 = 0; int bCheckCounterOrgan15 = 0;
    int bCheckCounterKeyboard = 0; int bCheckCounterKeyboard1 = 0; int bCheckCounterKeyboard2 = 0; int bCheckCounterKeyboard3 = 0; int bCheckCounterKeyboard4 = 0; int bCheckCounterKeyboard5 = 0; int bCheckCounterKeyboard6 = 0; int bCheckCounterKeyboard7 = 0; int bCheckCounterKeyboard8 = 0; int bCheckCounterKeyboard9 = 0; int bCheckCounterKeyboard10 = 0; int bCheckCounterKeyboard11 = 0; int bCheckCounterKeyboard12 = 0; int bCheckCounterKeyboard13 = 0; int bCheckCounterKeyboard14 = 0; int bCheckCounterKeyboard15 = 0;
    int bCheckCounterDx7 = 0; int bCheckCounterDx71 = 0; int bCheckCounterDx72 = 0; int bCheckCounterDx73 = 0; int bCheckCounterDx74 = 0; int bCheckCounterDx75 = 0; int bCheckCounterDx76 = 0; int bCheckCounterDx77 = 0; int bCheckCounterDx78 = 0; int bCheckCounterDx79 = 0; int bCheckCounterDx710 = 0; int bCheckCounterDx711 = 0; int bCheckCounterDx712 = 0; int bCheckCounterDx713 = 0; int bCheckCounterDx714 = 0; int bCheckCounterDx715 = 0;
    int bCheckCounterCs80 = 0; int bCheckCounterCs801 = 0; int bCheckCounterCs802 = 0; int bCheckCounterCs803 = 0; int bCheckCounterCs804 = 0; int bCheckCounterCs805 = 0; int bCheckCounterCs806 = 0; int bCheckCounterCs807 = 0; int bCheckCounterCs808 = 0; int bCheckCounterCs809 = 0; int bCheckCounterCs8010 = 0; int bCheckCounterCs8011 = 0; int bCheckCounterCs8012 = 0; int bCheckCounterCs8013 = 0; int bCheckCounterCs8014 = 0; int bCheckCounterCs8015 = 0;

    int c2CheckCounterGrandPiano = 0; int c2CheckCounterGrandPiano1 = 0; int c2CheckCounterGrandPiano2 = 0; int c2CheckCounterGrandPiano3 = 0; int c2CheckCounterGrandPiano4 = 0; int c2CheckCounterGrandPiano5 = 0; int c2CheckCounterGrandPiano6 = 0; int c2CheckCounterGrandPiano7 = 0; int c2CheckCounterGrandPiano8 = 0; int c2CheckCounterGrandPiano9 = 0; int c2CheckCounterGrandPiano10 = 0; int c2CheckCounterGrandPiano11 = 0; int c2CheckCounterGrandPiano12 = 0; int c2CheckCounterGrandPiano13 = 0; int c2CheckCounterGrandPiano14 = 0; int c2CheckCounterGrandPiano15 = 0;
    int c2CheckCounterHarpsichord = 0; int c2CheckCounterHarpsichord1 = 0; int c2CheckCounterHarpsichord2 = 0; int c2CheckCounterHarpsichord3 = 0; int c2CheckCounterHarpsichord4 = 0; int c2CheckCounterHarpsichord5 = 0; int c2CheckCounterHarpsichord6 = 0; int c2CheckCounterHarpsichord7 = 0; int c2CheckCounterHarpsichord8 = 0; int c2CheckCounterHarpsichord9 = 0; int c2CheckCounterHarpsichord10 = 0; int c2CheckCounterHarpsichord11 = 0; int c2CheckCounterHarpsichord12 = 0; int c2CheckCounterHarpsichord13 = 0; int c2CheckCounterHarpsichord14 = 0; int c2CheckCounterHarpsichord15 = 0;
    int c2CheckCounterOrgan = 0; int c2CheckCounterOrgan1 = 0; int c2CheckCounterOrgan2 = 0; int c2CheckCounterOrgan3 = 0; int c2CheckCounterOrgan4 = 0; int c2CheckCounterOrgan5 = 0; int c2CheckCounterOrgan6 = 0; int c2CheckCounterOrgan7 = 0; int c2CheckCounterOrgan8 = 0; int c2CheckCounterOrgan9 = 0; int c2CheckCounterOrgan10 = 0; int c2CheckCounterOrgan11 = 0; int c2CheckCounterOrgan12 = 0; int c2CheckCounterOrgan13 = 0; int c2CheckCounterOrgan14 = 0; int c2CheckCounterOrgan15 = 0;
    int c2CheckCounterKeyboard = 0; int c2CheckCounterKeyboard1 = 0; int c2CheckCounterKeyboard2 = 0; int c2CheckCounterKeyboard3 = 0; int c2CheckCounterKeyboard4 = 0; int c2CheckCounterKeyboard5 = 0; int c2CheckCounterKeyboard6 = 0; int c2CheckCounterKeyboard7 = 0; int c2CheckCounterKeyboard8 = 0; int c2CheckCounterKeyboard9 = 0; int c2CheckCounterKeyboard10 = 0; int c2CheckCounterKeyboard11 = 0; int c2CheckCounterKeyboard12 = 0; int c2CheckCounterKeyboard13 = 0; int c2CheckCounterKeyboard14 = 0; int c2CheckCounterKeyboard15 = 0;
    int c2CheckCounterDx7 = 0; int c2CheckCounterDx71 = 0; int c2CheckCounterDx72 = 0; int c2CheckCounterDx73 = 0; int c2CheckCounterDx74 = 0; int c2CheckCounterDx75 = 0; int c2CheckCounterDx76 = 0; int c2CheckCounterDx77 = 0; int c2CheckCounterDx78 = 0; int c2CheckCounterDx79 = 0; int c2CheckCounterDx710 = 0; int c2CheckCounterDx711 = 0; int c2CheckCounterDx712 = 0; int c2CheckCounterDx713 = 0; int c2CheckCounterDx714 = 0; int c2CheckCounterDx715 = 0;
    int c2CheckCounterCs80 = 0; int c2CheckCounterCs801 = 0; int c2CheckCounterCs802 = 0; int c2CheckCounterCs803 = 0; int c2CheckCounterCs804 = 0; int c2CheckCounterCs805 = 0; int c2CheckCounterCs806 = 0; int c2CheckCounterCs807 = 0; int c2CheckCounterCs808 = 0; int c2CheckCounterCs809 = 0; int c2CheckCounterCs8010 = 0; int c2CheckCounterCs8011 = 0; int c2CheckCounterCs8012 = 0; int c2CheckCounterCs8013 = 0; int c2CheckCounterCs8014 = 0; int c2CheckCounterCs8015 = 0;

    int csCheckCounterGrandPiano = 0; int csCheckCounterGrandPiano1 = 0; int csCheckCounterGrandPiano2 = 0; int csCheckCounterGrandPiano3 = 0; int csCheckCounterGrandPiano4 = 0; int csCheckCounterGrandPiano5 = 0; int csCheckCounterGrandPiano6 = 0; int csCheckCounterGrandPiano7 = 0; int csCheckCounterGrandPiano8 = 0; int csCheckCounterGrandPiano9 = 0; int csCheckCounterGrandPiano10 = 0; int csCheckCounterGrandPiano11 = 0; int csCheckCounterGrandPiano12 = 0; int csCheckCounterGrandPiano13 = 0; int csCheckCounterGrandPiano14 = 0; int csCheckCounterGrandPiano15 = 0;
    int csCheckCounterHarpsichord = 0; int csCheckCounterHarpsichord1 = 0; int csCheckCounterHarpsichord2 = 0; int csCheckCounterHarpsichord3 = 0; int csCheckCounterHarpsichord4 = 0; int csCheckCounterHarpsichord5 = 0; int csCheckCounterHarpsichord6 = 0; int csCheckCounterHarpsichord7 = 0; int csCheckCounterHarpsichord8 = 0; int csCheckCounterHarpsichord9 = 0; int csCheckCounterHarpsichord10 = 0; int csCheckCounterHarpsichord11 = 0; int csCheckCounterHarpsichord12 = 0; int csCheckCounterHarpsichord13 = 0; int csCheckCounterHarpsichord14 = 0; int csCheckCounterHarpsichord15 = 0;
    int csCheckCounterOrgan = 0; int csCheckCounterOrgan1 = 0; int csCheckCounterOrgan2 = 0; int csCheckCounterOrgan3 = 0; int csCheckCounterOrgan4 = 0; int csCheckCounterOrgan5 = 0; int csCheckCounterOrgan6 = 0; int csCheckCounterOrgan7 = 0; int csCheckCounterOrgan8 = 0; int csCheckCounterOrgan9 = 0; int csCheckCounterOrgan10 = 0; int csCheckCounterOrgan11 = 0; int csCheckCounterOrgan12 = 0; int csCheckCounterOrgan13 = 0; int csCheckCounterOrgan14 = 0; int csCheckCounterOrgan15 = 0;
    int csCheckCounterKeyboard = 0; int csCheckCounterKeyboard1 = 0; int csCheckCounterKeyboard2 = 0; int csCheckCounterKeyboard3 = 0; int csCheckCounterKeyboard4 = 0; int csCheckCounterKeyboard5 = 0; int csCheckCounterKeyboard6 = 0; int csCheckCounterKeyboard7 = 0; int csCheckCounterKeyboard8 = 0; int csCheckCounterKeyboard9 = 0; int csCheckCounterKeyboard10 = 0; int csCheckCounterKeyboard11 = 0; int csCheckCounterKeyboard12 = 0; int csCheckCounterKeyboard13 = 0; int csCheckCounterKeyboard14 = 0; int csCheckCounterKeyboard15 = 0;
    int csCheckCounterDx7 = 0; int csCheckCounterDx71 = 0; int csCheckCounterDx72 = 0; int csCheckCounterDx73 = 0; int csCheckCounterDx74 = 0; int csCheckCounterDx75 = 0; int csCheckCounterDx76 = 0; int csCheckCounterDx77 = 0; int csCheckCounterDx78 = 0; int csCheckCounterDx79 = 0; int csCheckCounterDx710 = 0; int csCheckCounterDx711 = 0; int csCheckCounterDx712 = 0; int csCheckCounterDx713 = 0; int csCheckCounterDx714 = 0; int csCheckCounterDx715 = 0;
    int csCheckCounterCs80 = 0; int csCheckCounterCs801 = 0; int csCheckCounterCs802 = 0; int csCheckCounterCs803 = 0; int csCheckCounterCs804 = 0; int csCheckCounterCs805 = 0; int csCheckCounterCs806 = 0; int csCheckCounterCs807 = 0; int csCheckCounterCs808 = 0; int csCheckCounterCs809 = 0; int csCheckCounterCs8010 = 0; int csCheckCounterCs8011 = 0; int csCheckCounterCs8012 = 0; int csCheckCounterCs8013 = 0; int csCheckCounterCs8014 = 0; int csCheckCounterCs8015 = 0;

    int dsCheckCounterGrandPiano = 0; int dsCheckCounterGrandPiano1 = 0; int dsCheckCounterGrandPiano2 = 0; int dsCheckCounterGrandPiano3 = 0; int dsCheckCounterGrandPiano4 = 0; int dsCheckCounterGrandPiano5 = 0; int dsCheckCounterGrandPiano6 = 0; int dsCheckCounterGrandPiano7 = 0; int dsCheckCounterGrandPiano8 = 0; int dsCheckCounterGrandPiano9 = 0; int dsCheckCounterGrandPiano10 = 0; int dsCheckCounterGrandPiano11 = 0; int dsCheckCounterGrandPiano12 = 0; int dsCheckCounterGrandPiano13 = 0; int dsCheckCounterGrandPiano14 = 0; int dsCheckCounterGrandPiano15 = 0;
    int dsCheckCounterHarpsichord = 0; int dsCheckCounterHarpsichord1 = 0; int dsCheckCounterHarpsichord2 = 0; int dsCheckCounterHarpsichord3 = 0; int dsCheckCounterHarpsichord4 = 0; int dsCheckCounterHarpsichord5 = 0; int dsCheckCounterHarpsichord6 = 0; int dsCheckCounterHarpsichord7 = 0; int dsCheckCounterHarpsichord8 = 0; int dsCheckCounterHarpsichord9 = 0; int dsCheckCounterHarpsichord10 = 0; int dsCheckCounterHarpsichord11 = 0; int dsCheckCounterHarpsichord12 = 0; int dsCheckCounterHarpsichord13 = 0; int dsCheckCounterHarpsichord14 = 0; int dsCheckCounterHarpsichord15 = 0;
    int dsCheckCounterOrgan = 0; int dsCheckCounterOrgan1 = 0; int dsCheckCounterOrgan2 = 0; int dsCheckCounterOrgan3 = 0; int dsCheckCounterOrgan4 = 0; int dsCheckCounterOrgan5 = 0; int dsCheckCounterOrgan6 = 0; int dsCheckCounterOrgan7 = 0; int dsCheckCounterOrgan8 = 0; int dsCheckCounterOrgan9 = 0; int dsCheckCounterOrgan10 = 0; int dsCheckCounterOrgan11 = 0; int dsCheckCounterOrgan12 = 0; int dsCheckCounterOrgan13 = 0; int dsCheckCounterOrgan14 = 0; int dsCheckCounterOrgan15 = 0;
    int dsCheckCounterKeyboard = 0; int dsCheckCounterKeyboard1 = 0; int dsCheckCounterKeyboard2 = 0; int dsCheckCounterKeyboard3 = 0; int dsCheckCounterKeyboard4 = 0; int dsCheckCounterKeyboard5 = 0; int dsCheckCounterKeyboard6 = 0; int dsCheckCounterKeyboard7 = 0; int dsCheckCounterKeyboard8 = 0; int dsCheckCounterKeyboard9 = 0; int dsCheckCounterKeyboard10 = 0; int dsCheckCounterKeyboard11 = 0; int dsCheckCounterKeyboard12 = 0; int dsCheckCounterKeyboard13 = 0; int dsCheckCounterKeyboard14 = 0; int dsCheckCounterKeyboard15 = 0;
    int dsCheckCounterDx7 = 0; int dsCheckCounterDx71 = 0; int dsCheckCounterDx72 = 0; int dsCheckCounterDx73 = 0; int dsCheckCounterDx74 = 0; int dsCheckCounterDx75 = 0; int dsCheckCounterDx76 = 0; int dsCheckCounterDx77 = 0; int dsCheckCounterDx78 = 0; int dsCheckCounterDx79 = 0; int dsCheckCounterDx710 = 0; int dsCheckCounterDx711 = 0; int dsCheckCounterDx712 = 0; int dsCheckCounterDx713 = 0; int dsCheckCounterDx714 = 0; int dsCheckCounterDx715 = 0;
    int dsCheckCounterCs80 = 0; int dsCheckCounterCs801 = 0; int dsCheckCounterCs802 = 0; int dsCheckCounterCs803 = 0; int dsCheckCounterCs804 = 0; int dsCheckCounterCs805 = 0; int dsCheckCounterCs806 = 0; int dsCheckCounterCs807 = 0; int dsCheckCounterCs808 = 0; int dsCheckCounterCs809 = 0; int dsCheckCounterCs8010 = 0; int dsCheckCounterCs8011 = 0; int dsCheckCounterCs8012 = 0; int dsCheckCounterCs8013 = 0; int dsCheckCounterCs8014 = 0; int dsCheckCounterCs8015 = 0;

    int fsCheckCounterGrandPiano = 0; int fsCheckCounterGrandPiano1 = 0; int fsCheckCounterGrandPiano2 = 0; int fsCheckCounterGrandPiano3 = 0; int fsCheckCounterGrandPiano4 = 0; int fsCheckCounterGrandPiano5 = 0; int fsCheckCounterGrandPiano6 = 0; int fsCheckCounterGrandPiano7 = 0; int fsCheckCounterGrandPiano8 = 0; int fsCheckCounterGrandPiano9 = 0; int fsCheckCounterGrandPiano10 = 0; int fsCheckCounterGrandPiano11 = 0; int fsCheckCounterGrandPiano12 = 0; int fsCheckCounterGrandPiano13 = 0; int fsCheckCounterGrandPiano14 = 0; int fsCheckCounterGrandPiano15 = 0;
    int fsCheckCounterHarpsichord = 0; int fsCheckCounterHarpsichord1 = 0; int fsCheckCounterHarpsichord2 = 0; int fsCheckCounterHarpsichord3 = 0; int fsCheckCounterHarpsichord4 = 0; int fsCheckCounterHarpsichord5 = 0; int fsCheckCounterHarpsichord6 = 0; int fsCheckCounterHarpsichord7 = 0; int fsCheckCounterHarpsichord8 = 0; int fsCheckCounterHarpsichord9 = 0; int fsCheckCounterHarpsichord10 = 0; int fsCheckCounterHarpsichord11 = 0; int fsCheckCounterHarpsichord12 = 0; int fsCheckCounterHarpsichord13 = 0; int fsCheckCounterHarpsichord14 = 0; int fsCheckCounterHarpsichord15 = 0;
    int fsCheckCounterOrgan = 0; int fsCheckCounterOrgan1 = 0; int fsCheckCounterOrgan2 = 0; int fsCheckCounterOrgan3 = 0; int fsCheckCounterOrgan4 = 0; int fsCheckCounterOrgan5 = 0; int fsCheckCounterOrgan6 = 0; int fsCheckCounterOrgan7 = 0; int fsCheckCounterOrgan8 = 0; int fsCheckCounterOrgan9 = 0; int fsCheckCounterOrgan10 = 0; int fsCheckCounterOrgan11 = 0; int fsCheckCounterOrgan12 = 0; int fsCheckCounterOrgan13 = 0; int fsCheckCounterOrgan14 = 0; int fsCheckCounterOrgan15 = 0;
    int fsCheckCounterKeyboard = 0; int fsCheckCounterKeyboard1 = 0; int fsCheckCounterKeyboard2 = 0; int fsCheckCounterKeyboard3 = 0; int fsCheckCounterKeyboard4 = 0; int fsCheckCounterKeyboard5 = 0; int fsCheckCounterKeyboard6 = 0; int fsCheckCounterKeyboard7 = 0; int fsCheckCounterKeyboard8 = 0; int fsCheckCounterKeyboard9 = 0; int fsCheckCounterKeyboard10 = 0; int fsCheckCounterKeyboard11 = 0; int fsCheckCounterKeyboard12 = 0; int fsCheckCounterKeyboard13 = 0; int fsCheckCounterKeyboard14 = 0; int fsCheckCounterKeyboard15 = 0;
    int fsCheckCounterDx7 = 0; int fsCheckCounterDx71 = 0; int fsCheckCounterDx72 = 0; int fsCheckCounterDx73 = 0; int fsCheckCounterDx74 = 0; int fsCheckCounterDx75 = 0; int fsCheckCounterDx76 = 0; int fsCheckCounterDx77 = 0; int fsCheckCounterDx78 = 0; int fsCheckCounterDx79 = 0; int fsCheckCounterDx710 = 0; int fsCheckCounterDx711 = 0; int fsCheckCounterDx712 = 0; int fsCheckCounterDx713 = 0; int fsCheckCounterDx714 = 0; int fsCheckCounterDx715 = 0;
    int fsCheckCounterCs80 = 0; int fsCheckCounterCs801 = 0; int fsCheckCounterCs802 = 0; int fsCheckCounterCs803 = 0; int fsCheckCounterCs804 = 0; int fsCheckCounterCs805 = 0; int fsCheckCounterCs806 = 0; int fsCheckCounterCs807 = 0; int fsCheckCounterCs808 = 0; int fsCheckCounterCs809 = 0; int fsCheckCounterCs8010 = 0; int fsCheckCounterCs8011 = 0; int fsCheckCounterCs8012 = 0; int fsCheckCounterCs8013 = 0; int fsCheckCounterCs8014 = 0; int fsCheckCounterCs8015 = 0;

    int gsCheckCounterGrandPiano = 0; int gsCheckCounterGrandPiano1 = 0; int gsCheckCounterGrandPiano2 = 0; int gsCheckCounterGrandPiano3 = 0; int gsCheckCounterGrandPiano4 = 0; int gsCheckCounterGrandPiano5 = 0; int gsCheckCounterGrandPiano6 = 0; int gsCheckCounterGrandPiano7 = 0; int gsCheckCounterGrandPiano8 = 0; int gsCheckCounterGrandPiano9 = 0; int gsCheckCounterGrandPiano10 = 0; int gsCheckCounterGrandPiano11 = 0; int gsCheckCounterGrandPiano12 = 0; int gsCheckCounterGrandPiano13 = 0; int gsCheckCounterGrandPiano14 = 0; int gsCheckCounterGrandPiano15 = 0;
    int gsCheckCounterHarpsichord = 0; int gsCheckCounterHarpsichord1 = 0; int gsCheckCounterHarpsichord2 = 0; int gsCheckCounterHarpsichord3 = 0; int gsCheckCounterHarpsichord4 = 0; int gsCheckCounterHarpsichord5 = 0; int gsCheckCounterHarpsichord6 = 0; int gsCheckCounterHarpsichord7 = 0; int gsCheckCounterHarpsichord8 = 0; int gsCheckCounterHarpsichord9 = 0; int gsCheckCounterHarpsichord10 = 0; int gsCheckCounterHarpsichord11 = 0; int gsCheckCounterHarpsichord12 = 0; int gsCheckCounterHarpsichord13 = 0; int gsCheckCounterHarpsichord14 = 0; int gsCheckCounterHarpsichord15 = 0;
    int gsCheckCounterOrgan = 0; int gsCheckCounterOrgan1 = 0; int gsCheckCounterOrgan2 = 0; int gsCheckCounterOrgan3 = 0; int gsCheckCounterOrgan4 = 0; int gsCheckCounterOrgan5 = 0; int gsCheckCounterOrgan6 = 0; int gsCheckCounterOrgan7 = 0; int gsCheckCounterOrgan8 = 0; int gsCheckCounterOrgan9 = 0; int gsCheckCounterOrgan10 = 0; int gsCheckCounterOrgan11 = 0; int gsCheckCounterOrgan12 = 0; int gsCheckCounterOrgan13 = 0; int gsCheckCounterOrgan14 = 0; int gsCheckCounterOrgan15 = 0;
    int gsCheckCounterKeyboard = 0; int gsCheckCounterKeyboard1 = 0; int gsCheckCounterKeyboard2 = 0; int gsCheckCounterKeyboard3 = 0; int gsCheckCounterKeyboard4 = 0; int gsCheckCounterKeyboard5 = 0; int gsCheckCounterKeyboard6 = 0; int gsCheckCounterKeyboard7 = 0; int gsCheckCounterKeyboard8 = 0; int gsCheckCounterKeyboard9 = 0; int gsCheckCounterKeyboard10 = 0; int gsCheckCounterKeyboard11 = 0; int gsCheckCounterKeyboard12 = 0; int gsCheckCounterKeyboard13 = 0; int gsCheckCounterKeyboard14 = 0; int gsCheckCounterKeyboard15 = 0;
    int gsCheckCounterDx7 = 0; int gsCheckCounterDx71 = 0; int gsCheckCounterDx72 = 0; int gsCheckCounterDx73 = 0; int gsCheckCounterDx74 = 0; int gsCheckCounterDx75 = 0; int gsCheckCounterDx76 = 0; int gsCheckCounterDx77 = 0; int gsCheckCounterDx78 = 0; int gsCheckCounterDx79 = 0; int gsCheckCounterDx710 = 0; int gsCheckCounterDx711 = 0; int gsCheckCounterDx712 = 0; int gsCheckCounterDx713 = 0; int gsCheckCounterDx714 = 0; int gsCheckCounterDx715 = 0;
    int gsCheckCounterCs80 = 0; int gsCheckCounterCs801 = 0; int gsCheckCounterCs802 = 0; int gsCheckCounterCs803 = 0; int gsCheckCounterCs804 = 0; int gsCheckCounterCs805 = 0; int gsCheckCounterCs806 = 0; int gsCheckCounterCs807 = 0; int gsCheckCounterCs808 = 0; int gsCheckCounterCs809 = 0; int gsCheckCounterCs8010 = 0; int gsCheckCounterCs8011 = 0; int gsCheckCounterCs8012 = 0; int gsCheckCounterCs8013 = 0; int gsCheckCounterCs8014 = 0; int gsCheckCounterCs8015 = 0;

    int asCheckCounterGrandPiano = 0; int asCheckCounterGrandPiano1 = 0; int asCheckCounterGrandPiano2 = 0; int asCheckCounterGrandPiano3 = 0; int asCheckCounterGrandPiano4 = 0; int asCheckCounterGrandPiano5 = 0; int asCheckCounterGrandPiano6 = 0; int asCheckCounterGrandPiano7 = 0; int asCheckCounterGrandPiano8 = 0; int asCheckCounterGrandPiano9 = 0; int asCheckCounterGrandPiano10 = 0; int asCheckCounterGrandPiano11 = 0; int asCheckCounterGrandPiano12 = 0; int asCheckCounterGrandPiano13 = 0; int asCheckCounterGrandPiano14 = 0; int asCheckCounterGrandPiano15 = 0;
    int asCheckCounterHarpsichord = 0; int asCheckCounterHarpsichord1 = 0; int asCheckCounterHarpsichord2 = 0; int asCheckCounterHarpsichord3 = 0; int asCheckCounterHarpsichord4 = 0; int asCheckCounterHarpsichord5 = 0; int asCheckCounterHarpsichord6 = 0; int asCheckCounterHarpsichord7 = 0; int asCheckCounterHarpsichord8 = 0; int asCheckCounterHarpsichord9 = 0; int asCheckCounterHarpsichord10 = 0; int asCheckCounterHarpsichord11 = 0; int asCheckCounterHarpsichord12 = 0; int asCheckCounterHarpsichord13 = 0; int asCheckCounterHarpsichord14 = 0; int asCheckCounterHarpsichord15 = 0;
    int asCheckCounterOrgan = 0; int asCheckCounterOrgan1 = 0; int asCheckCounterOrgan2 = 0; int asCheckCounterOrgan3 = 0; int asCheckCounterOrgan4 = 0; int asCheckCounterOrgan5 = 0; int asCheckCounterOrgan6 = 0; int asCheckCounterOrgan7 = 0; int asCheckCounterOrgan8 = 0; int asCheckCounterOrgan9 = 0; int asCheckCounterOrgan10 = 0; int asCheckCounterOrgan11 = 0; int asCheckCounterOrgan12 = 0; int asCheckCounterOrgan13 = 0; int asCheckCounterOrgan14 = 0; int asCheckCounterOrgan15 = 0;
    int asCheckCounterKeyboard = 0; int asCheckCounterKeyboard1 = 0; int asCheckCounterKeyboard2 = 0; int asCheckCounterKeyboard3 = 0; int asCheckCounterKeyboard4 = 0; int asCheckCounterKeyboard5 = 0; int asCheckCounterKeyboard6 = 0; int asCheckCounterKeyboard7 = 0; int asCheckCounterKeyboard8 = 0; int asCheckCounterKeyboard9 = 0; int asCheckCounterKeyboard10 = 0; int asCheckCounterKeyboard11 = 0; int asCheckCounterKeyboard12 = 0; int asCheckCounterKeyboard13 = 0; int asCheckCounterKeyboard14 = 0; int asCheckCounterKeyboard15 = 0;
    int asCheckCounterDx7 = 0; int asCheckCounterDx71 = 0; int asCheckCounterDx72 = 0; int asCheckCounterDx73 = 0; int asCheckCounterDx74 = 0; int asCheckCounterDx75 = 0; int asCheckCounterDx76 = 0; int asCheckCounterDx77 = 0; int asCheckCounterDx78 = 0; int asCheckCounterDx79 = 0; int asCheckCounterDx710 = 0; int asCheckCounterDx711 = 0; int asCheckCounterDx712 = 0; int asCheckCounterDx713 = 0; int asCheckCounterDx714 = 0; int asCheckCounterDx715 = 0;
    int asCheckCounterCs80 = 0; int asCheckCounterCs801 = 0; int asCheckCounterCs802 = 0; int asCheckCounterCs803 = 0; int asCheckCounterCs804 = 0; int asCheckCounterCs805 = 0; int asCheckCounterCs806 = 0; int asCheckCounterCs807 = 0; int asCheckCounterCs808 = 0; int asCheckCounterCs809 = 0; int asCheckCounterCs8010 = 0; int asCheckCounterCs8011 = 0; int asCheckCounterCs8012 = 0; int asCheckCounterCs8013 = 0; int asCheckCounterCs8014 = 0; int asCheckCounterCs8015 = 0;

    int cs2CheckCounterGrandPiano = 0; int cs2CheckCounterGrandPiano1 = 0; int cs2CheckCounterGrandPiano2 = 0; int cs2CheckCounterGrandPiano3 = 0; int cs2CheckCounterGrandPiano4 = 0; int cs2CheckCounterGrandPiano5 = 0; int cs2CheckCounterGrandPiano6 = 0; int cs2CheckCounterGrandPiano7 = 0; int cs2CheckCounterGrandPiano8 = 0; int cs2CheckCounterGrandPiano9 = 0; int cs2CheckCounterGrandPiano10 = 0; int cs2CheckCounterGrandPiano11 = 0; int cs2CheckCounterGrandPiano12 = 0; int cs2CheckCounterGrandPiano13 = 0; int cs2CheckCounterGrandPiano14 = 0; int cs2CheckCounterGrandPiano15 = 0;
    int cs2CheckCounterHarpsichord = 0; int cs2CheckCounterHarpsichord1 = 0; int cs2CheckCounterHarpsichord2 = 0; int cs2CheckCounterHarpsichord3 = 0; int cs2CheckCounterHarpsichord4 = 0; int cs2CheckCounterHarpsichord5 = 0; int cs2CheckCounterHarpsichord6 = 0; int cs2CheckCounterHarpsichord7 = 0; int cs2CheckCounterHarpsichord8 = 0; int cs2CheckCounterHarpsichord9 = 0; int cs2CheckCounterHarpsichord10 = 0; int cs2CheckCounterHarpsichord11 = 0; int cs2CheckCounterHarpsichord12 = 0; int cs2CheckCounterHarpsichord13 = 0; int cs2CheckCounterHarpsichord14 = 0; int cs2CheckCounterHarpsichord15 = 0;
    int cs2CheckCounterOrgan = 0; int cs2CheckCounterOrgan1 = 0; int cs2CheckCounterOrgan2 = 0; int cs2CheckCounterOrgan3 = 0; int cs2CheckCounterOrgan4 = 0; int cs2CheckCounterOrgan5 = 0; int cs2CheckCounterOrgan6 = 0; int cs2CheckCounterOrgan7 = 0; int cs2CheckCounterOrgan8 = 0; int cs2CheckCounterOrgan9 = 0; int cs2CheckCounterOrgan10 = 0; int cs2CheckCounterOrgan11 = 0; int cs2CheckCounterOrgan12 = 0; int cs2CheckCounterOrgan13 = 0; int cs2CheckCounterOrgan14 = 0; int cs2CheckCounterOrgan15 = 0;
    int cs2CheckCounterKeyboard = 0; int cs2CheckCounterKeyboard1 = 0; int cs2CheckCounterKeyboard2 = 0; int cs2CheckCounterKeyboard3 = 0; int cs2CheckCounterKeyboard4 = 0; int cs2CheckCounterKeyboard5 = 0; int cs2CheckCounterKeyboard6 = 0; int cs2CheckCounterKeyboard7 = 0; int cs2CheckCounterKeyboard8 = 0; int cs2CheckCounterKeyboard9 = 0; int cs2CheckCounterKeyboard10 = 0; int cs2CheckCounterKeyboard11 = 0; int cs2CheckCounterKeyboard12 = 0; int cs2CheckCounterKeyboard13 = 0; int cs2CheckCounterKeyboard14 = 0; int cs2CheckCounterKeyboard15 = 0;
    int cs2CheckCounterDx7 = 0; int cs2CheckCounterDx71 = 0; int cs2CheckCounterDx72 = 0; int cs2CheckCounterDx73 = 0; int cs2CheckCounterDx74 = 0; int cs2CheckCounterDx75 = 0; int cs2CheckCounterDx76 = 0; int cs2CheckCounterDx77 = 0; int cs2CheckCounterDx78 = 0; int cs2CheckCounterDx79 = 0; int cs2CheckCounterDx710 = 0; int cs2CheckCounterDx711 = 0; int cs2CheckCounterDx712 = 0; int cs2CheckCounterDx713 = 0; int cs2CheckCounterDx714 = 0; int cs2CheckCounterDx715 = 0;
    int cs2CheckCounterCs80 = 0; int cs2CheckCounterCs801 = 0; int cs2CheckCounterCs802 = 0; int cs2CheckCounterCs803 = 0; int cs2CheckCounterCs804 = 0; int cs2CheckCounterCs805 = 0; int cs2CheckCounterCs806 = 0; int cs2CheckCounterCs807 = 0; int cs2CheckCounterCs808 = 0; int cs2CheckCounterCs809 = 0; int cs2CheckCounterCs8010 = 0; int cs2CheckCounterCs8011 = 0; int cs2CheckCounterCs8012 = 0; int cs2CheckCounterCs8013 = 0; int cs2CheckCounterCs8014 = 0; int cs2CheckCounterCs8015 = 0;

    final int APP2_REQUEST = 1; //used for intent, to swap between MainActivity.java and MainActivity2.java

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        mSoundPool = new SoundPool(100, AudioManager.STREAM_MUSIC,0);

        GrandPianocsound = mSoundPool.load(getApplicationContext(),R.raw.grandpianoc,1);
        GrandPianodsound = mSoundPool.load(getApplicationContext(),R.raw.grandpianod,1);
        GrandPianoesound = mSoundPool.load(getApplicationContext(),R.raw.grandpianoe,1);
        GrandPianofsound = mSoundPool.load(getApplicationContext(),R.raw.grandpianof,1);
        GrandPianogsound = mSoundPool.load(getApplicationContext(),R.raw.grandpianog,1);
        GrandPianoasound = mSoundPool.load(getApplicationContext(),R.raw.grandpianoa,1);
        GrandPianobsound = mSoundPool.load(getApplicationContext(),R.raw.grandpianob,1);
        GrandPianocssound = mSoundPool.load(getApplicationContext(),R.raw.grandpianocsharp,1);
        GrandPianocsssound = mSoundPool.load(getApplicationContext(),R.raw.grandpianocsharp2,1);
        GrandPianoccsound = mSoundPool.load(getApplicationContext(),R.raw.grandpianoc2,1);
        GrandPianoassound = mSoundPool.load(getApplicationContext(),R.raw.grandpianoasharp,1);
        GrandPianofssound = mSoundPool.load(getApplicationContext(),R.raw.grandpianofsharp,1);
        GrandPianogssound = mSoundPool.load(getApplicationContext(),R.raw.grandpianogsharp,1);
        GrandPianodssound = mSoundPool.load(getApplicationContext(),R.raw.grandpianodsharp,1);

        Keyboardcsound = mSoundPool.load(getApplicationContext(),R.raw.keyboardc,1);
        Keyboarddsound = mSoundPool.load(getApplicationContext(),R.raw.keyboardd,1);
        Keyboardesound = mSoundPool.load(getApplicationContext(),R.raw.keyboarde,1);
        Keyboardfsound = mSoundPool.load(getApplicationContext(),R.raw.keyboardf,1);
        Keyboardgsound = mSoundPool.load(getApplicationContext(),R.raw.keyboardg,1);
        Keyboardasound = mSoundPool.load(getApplicationContext(),R.raw.keyboarda,1);
        Keyboardbsound = mSoundPool.load(getApplicationContext(),R.raw.keyboardb,1);
        Keyboardcssound = mSoundPool.load(getApplicationContext(),R.raw.keyboardcsharp,1);
        Keyboardcsssound = mSoundPool.load(getApplicationContext(),R.raw.keyboardcsharp2,1);
        Keyboardccsound = mSoundPool.load(getApplicationContext(),R.raw.keyboardc2,1);
        Keyboardassound = mSoundPool.load(getApplicationContext(),R.raw.keyboardasharp,1);
        Keyboardfssound = mSoundPool.load(getApplicationContext(),R.raw.keyboardfsharp,1);
        Keyboardgssound = mSoundPool.load(getApplicationContext(),R.raw.keyboardgsharp,1);
        Keyboarddssound = mSoundPool.load(getApplicationContext(),R.raw.keyboarddsharp,1);

        Organcsound = mSoundPool.load(getApplicationContext(),R.raw.organc,1);
        Organdsound = mSoundPool.load(getApplicationContext(),R.raw.organd,1);
        Organesound = mSoundPool.load(getApplicationContext(),R.raw.organe,1);
        Organfsound = mSoundPool.load(getApplicationContext(),R.raw.organf,1);
        Organgsound = mSoundPool.load(getApplicationContext(),R.raw.organg,1);
        Organasound = mSoundPool.load(getApplicationContext(),R.raw.organa,1);
        Organbsound = mSoundPool.load(getApplicationContext(),R.raw.organb,1);
        Organcssound = mSoundPool.load(getApplicationContext(),R.raw.organcsharp,1);
        Organcsssound = mSoundPool.load(getApplicationContext(),R.raw.organcsharp2,1);
        Organccsound = mSoundPool.load(getApplicationContext(),R.raw.organc2,1);
        Organassound = mSoundPool.load(getApplicationContext(),R.raw.organasharp,1);
        Organfssound = mSoundPool.load(getApplicationContext(),R.raw.organfsharp,1);
        Organgssound = mSoundPool.load(getApplicationContext(),R.raw.organgsharp,1);
        Organdssound = mSoundPool.load(getApplicationContext(),R.raw.organdsharp,1);

        Harpsichordcsound = mSoundPool.load(getApplicationContext(),R.raw.harpsichordc,1);
        Harpsichorddsound = mSoundPool.load(getApplicationContext(),R.raw.harpsichordd,1);
        Harpsichordesound = mSoundPool.load(getApplicationContext(),R.raw.harpsichorde,1);
        Harpsichordfsound = mSoundPool.load(getApplicationContext(),R.raw.harpsichordf,1);
        Harpsichordgsound = mSoundPool.load(getApplicationContext(),R.raw.harpsichordg,1);
        Harpsichordasound = mSoundPool.load(getApplicationContext(),R.raw.harpsichorda,1);
        Harpsichordbsound = mSoundPool.load(getApplicationContext(),R.raw.harpsichordb,1);
        Harpsichordcssound = mSoundPool.load(getApplicationContext(),R.raw.harpsichordcsharp,1);
        Harpsichordcsssound = mSoundPool.load(getApplicationContext(),R.raw.harpsichordcsharp2,1);
        Harpsichordccsound = mSoundPool.load(getApplicationContext(),R.raw.harpsichordc2,1);
        Harpsichordassound = mSoundPool.load(getApplicationContext(),R.raw.harpsichordasharp,1);
        Harpsichordfssound = mSoundPool.load(getApplicationContext(),R.raw.harpsichordfsharp,1);
        Harpsichordgssound = mSoundPool.load(getApplicationContext(),R.raw.harpsichordgsharp,1);
        Harpsichorddssound = mSoundPool.load(getApplicationContext(),R.raw.harpsichorddsharp,1);

        Dx7csound = mSoundPool.load(getApplicationContext(),R.raw.dx7c,1);
        Dx7dsound = mSoundPool.load(getApplicationContext(),R.raw.dx7d,1);
        Dx7esound = mSoundPool.load(getApplicationContext(),R.raw.dx7e,1);
        Dx7fsound = mSoundPool.load(getApplicationContext(),R.raw.dx7f,1);
        Dx7gsound = mSoundPool.load(getApplicationContext(),R.raw.dx7g,1);
        Dx7asound = mSoundPool.load(getApplicationContext(),R.raw.dx7a,1);
        Dx7bsound = mSoundPool.load(getApplicationContext(),R.raw.dx7b,1);
        Dx7cssound = mSoundPool.load(getApplicationContext(),R.raw.dx7csharp,1);
        Dx7csssound = mSoundPool.load(getApplicationContext(),R.raw.dx7csharp2,1);
        Dx7ccsound = mSoundPool.load(getApplicationContext(),R.raw.dx7c2,1);
        Dx7assound = mSoundPool.load(getApplicationContext(),R.raw.dx7asharp,1);
        Dx7fssound = mSoundPool.load(getApplicationContext(),R.raw.dx7fsharp,1);
        Dx7gssound = mSoundPool.load(getApplicationContext(),R.raw.dx7gsharp,1);
        Dx7dssound = mSoundPool.load(getApplicationContext(),R.raw.dx7dsharp,1);

        Cs80csound = mSoundPool.load(getApplicationContext(),R.raw.cs80c,1);
        Cs80dsound = mSoundPool.load(getApplicationContext(),R.raw.cs80d,1);
        Cs80esound = mSoundPool.load(getApplicationContext(),R.raw.cs80e,1);
        Cs80fsound = mSoundPool.load(getApplicationContext(),R.raw.cs80f,1);
        Cs80gsound = mSoundPool.load(getApplicationContext(),R.raw.cs80g,1);
        Cs80asound = mSoundPool.load(getApplicationContext(),R.raw.cs80a,1);
        Cs80bsound = mSoundPool.load(getApplicationContext(),R.raw.cs80b,1);
        Cs80cssound = mSoundPool.load(getApplicationContext(),R.raw.cs80csharp,1);
        Cs80csssound = mSoundPool.load(getApplicationContext(),R.raw.cs80csharp2,1);
        Cs80ccsound = mSoundPool.load(getApplicationContext(),R.raw.cs80c2,1);
        Cs80assound = mSoundPool.load(getApplicationContext(),R.raw.cs80asharp,1);
        Cs80fssound = mSoundPool.load(getApplicationContext(),R.raw.cs80fsharp,1);
        Cs80gssound = mSoundPool.load(getApplicationContext(),R.raw.cs80gsharp,1);
        Cs80dssound = mSoundPool.load(getApplicationContext(),R.raw.cs80dsharp,1);

        GrandPianocsoundabove = mSoundPool.load(getApplicationContext(),R.raw.grandpianoc2,1);
        GrandPianodsoundabove = mSoundPool.load(getApplicationContext(),R.raw.grandpianodaboveoctave,1);
        GrandPianoesoundabove = mSoundPool.load(getApplicationContext(),R.raw.grandpianoeaboveoctave,1);
        GrandPianofsoundabove = mSoundPool.load(getApplicationContext(),R.raw.grandpianofaboveoctave,1);
        GrandPianogsoundabove = mSoundPool.load(getApplicationContext(),R.raw.grandpianogaboveoctave,1);
        GrandPianoasoundabove = mSoundPool.load(getApplicationContext(),R.raw.grandpianoaaboveoctave,1);
        GrandPianobsoundabove = mSoundPool.load(getApplicationContext(),R.raw.grandpianobaboveoctave,1);
        GrandPianocssoundabove = mSoundPool.load(getApplicationContext(),R.raw.grandpianocsharpaboveoctave,1);
        GrandPianocsssoundabove = mSoundPool.load(getApplicationContext(),R.raw.grandpianocsharp2aboveoctave,1);
        GrandPianoccsoundabove = mSoundPool.load(getApplicationContext(),R.raw.grandpianoc2aboveoctave,1);
        GrandPianoassoundabove = mSoundPool.load(getApplicationContext(),R.raw.grandpianoasharpaboveoctave,1);
        GrandPianofssoundabove = mSoundPool.load(getApplicationContext(),R.raw.grandpianofsharpaboveoctave,1);
        GrandPianogssoundabove = mSoundPool.load(getApplicationContext(),R.raw.grandpianogsharpaboveoctave,1);
        GrandPianodssoundabove = mSoundPool.load(getApplicationContext(),R.raw.grandpianodsharpaboveoctave,1);

        Keyboardcsoundabove = mSoundPool.load(getApplicationContext(),R.raw.keyboardc2,1);
        Keyboarddsoundabove = mSoundPool.load(getApplicationContext(),R.raw.keyboarddaboveoctave,1);
        Keyboardesoundabove = mSoundPool.load(getApplicationContext(),R.raw.keyboardeaboveoctave,1);
        Keyboardfsoundabove = mSoundPool.load(getApplicationContext(),R.raw.keyboardfaboveoctave,1);
        Keyboardgsoundabove = mSoundPool.load(getApplicationContext(),R.raw.keyboardgaboveoctave,1);
        Keyboardasoundabove = mSoundPool.load(getApplicationContext(),R.raw.keyboardaaboveoctave,1);
        Keyboardbsoundabove = mSoundPool.load(getApplicationContext(),R.raw.keyboardbaboveoctave,1);
        Keyboardcssoundabove = mSoundPool.load(getApplicationContext(),R.raw.keyboardcsharpaboveoctave,1);
        Keyboardcsssoundabove = mSoundPool.load(getApplicationContext(),R.raw.keyboardcsharp2aboveoctave,1);
        Keyboardccsoundabove = mSoundPool.load(getApplicationContext(),R.raw.keyboardc2aboveoctave,1);
        Keyboardassoundabove = mSoundPool.load(getApplicationContext(),R.raw.keyboardasharpaboveoctave,1);
        Keyboardfssoundabove = mSoundPool.load(getApplicationContext(),R.raw.keyboardfsharpaboveoctave,1);
        Keyboardgssoundabove = mSoundPool.load(getApplicationContext(),R.raw.keyboardgsharpaboveoctave,1);
        Keyboarddssoundabove = mSoundPool.load(getApplicationContext(),R.raw.keyboarddsharpaboveoctave,1);

        Organcsoundabove = mSoundPool.load(getApplicationContext(),R.raw.organc2,1);
        Organdsoundabove = mSoundPool.load(getApplicationContext(),R.raw.organdaboveoctave,1);
        Organesoundabove = mSoundPool.load(getApplicationContext(),R.raw.organeaboveoctave,1);
        Organfsoundabove = mSoundPool.load(getApplicationContext(),R.raw.organfaboveoctave,1);
        Organgsoundabove = mSoundPool.load(getApplicationContext(),R.raw.organgaboveoctave,1);
        Organasoundabove = mSoundPool.load(getApplicationContext(),R.raw.organaaboveoctave,1);
        Organbsoundabove = mSoundPool.load(getApplicationContext(),R.raw.organbaboveoctave,1);
        Organcssoundabove = mSoundPool.load(getApplicationContext(),R.raw.organcsharpaboveoctave,1);
        Organcsssoundabove = mSoundPool.load(getApplicationContext(),R.raw.organcsharp2aboveoctave,1);
        Organccsoundabove = mSoundPool.load(getApplicationContext(),R.raw.organc2aboveoctave,1);
        Organassoundabove = mSoundPool.load(getApplicationContext(),R.raw.organasharpaboveoctave,1);
        Organfssoundabove = mSoundPool.load(getApplicationContext(),R.raw.organfsharpaboveoctave,1);
        Organgssoundabove = mSoundPool.load(getApplicationContext(),R.raw.organgsharpaboveoctave,1);
        Organdssoundabove = mSoundPool.load(getApplicationContext(),R.raw.organdsharpaboveoctave,1);

        Harpsichordcsoundabove = mSoundPool.load(getApplicationContext(),R.raw.harpsichordc2,1);
        Harpsichorddsoundabove = mSoundPool.load(getApplicationContext(),R.raw.harpsichorddaboveoctave,1);
        Harpsichordesoundabove = mSoundPool.load(getApplicationContext(),R.raw.harpsichordeaboveoctave,1);
        Harpsichordfsoundabove = mSoundPool.load(getApplicationContext(),R.raw.harpsichordfaboveoctave,1);
        Harpsichordgsoundabove = mSoundPool.load(getApplicationContext(),R.raw.harpsichordgaboveoctave,1);
        Harpsichordasoundabove = mSoundPool.load(getApplicationContext(),R.raw.harpsichordaaboveoctave,1);
        Harpsichordbsoundabove = mSoundPool.load(getApplicationContext(),R.raw.harpsichordbaboveoctave,1);
        Harpsichordcssoundabove = mSoundPool.load(getApplicationContext(),R.raw.harpsichordcsharpaboveoctave,1);
        Harpsichordcsssoundabove = mSoundPool.load(getApplicationContext(),R.raw.harpsichordcsharp2aboveoctave,1);
        Harpsichordccsoundabove = mSoundPool.load(getApplicationContext(),R.raw.harpsichordc2aboveoctave,1);
        Harpsichordassoundabove = mSoundPool.load(getApplicationContext(),R.raw.harpsichordasharpaboveoctave,1);
        Harpsichordfssoundabove = mSoundPool.load(getApplicationContext(),R.raw.harpsichordfsharpaboveoctave,1);
        Harpsichordgssoundabove = mSoundPool.load(getApplicationContext(),R.raw.harpsichordgsharpaboveoctave,1);
        Harpsichorddssoundabove = mSoundPool.load(getApplicationContext(),R.raw.harpsichorddsharpaboveoctave,1);

        Dx7csoundabove = mSoundPool.load(getApplicationContext(),R.raw.dx7c2,1);
        Dx7dsoundabove = mSoundPool.load(getApplicationContext(),R.raw.dx7daboveoctave,1);
        Dx7esoundabove = mSoundPool.load(getApplicationContext(),R.raw.dx7eaboveoctave,1);
        Dx7fsoundabove = mSoundPool.load(getApplicationContext(),R.raw.dx7faboveoctave,1);
        Dx7gsoundabove = mSoundPool.load(getApplicationContext(),R.raw.dx7gaboveoctave,1);
        Dx7asoundabove = mSoundPool.load(getApplicationContext(),R.raw.dx7aaboveoctave,1);
        Dx7bsoundabove = mSoundPool.load(getApplicationContext(),R.raw.dx7baboveoctave,1);
        Dx7cssoundabove = mSoundPool.load(getApplicationContext(),R.raw.dx7csharpaboveoctave,1);
        Dx7csssoundabove = mSoundPool.load(getApplicationContext(),R.raw.dx7csharp2aboveoctave,1);
        Dx7ccsoundabove = mSoundPool.load(getApplicationContext(),R.raw.dx7c2aboveoctave,1);
        Dx7assoundabove = mSoundPool.load(getApplicationContext(),R.raw.dx7asharpaboveoctave,1);
        Dx7fssoundabove = mSoundPool.load(getApplicationContext(),R.raw.dx7fsharpaboveoctave,1);
        Dx7gssoundabove = mSoundPool.load(getApplicationContext(),R.raw.dx7gsharpaboveoctave,1);
        Dx7dssoundabove = mSoundPool.load(getApplicationContext(),R.raw.dx7dsharpaboveoctave,1);

        Cs80csoundabove = mSoundPool.load(getApplicationContext(),R.raw.cs80c2,1);
        Cs80dsoundabove = mSoundPool.load(getApplicationContext(),R.raw.cs80daboveoctave,1);
        Cs80esoundabove = mSoundPool.load(getApplicationContext(),R.raw.cs80eaboveoctave,1);
        Cs80fsoundabove = mSoundPool.load(getApplicationContext(),R.raw.cs80faboveoctave,1);
        Cs80gsoundabove = mSoundPool.load(getApplicationContext(),R.raw.cs80gaboveoctave,1);
        Cs80asoundabove = mSoundPool.load(getApplicationContext(),R.raw.cs80aaboveoctave,1);
        Cs80bsoundabove = mSoundPool.load(getApplicationContext(),R.raw.cs80baboveoctave,1);
        Cs80cssoundabove = mSoundPool.load(getApplicationContext(),R.raw.cs80csharpaboveoctave,1);
        Cs80csssoundabove = mSoundPool.load(getApplicationContext(),R.raw.cs80csharp2aboveoctave,1);
        Cs80ccsoundabove = mSoundPool.load(getApplicationContext(),R.raw.cs80c2aboveoctave,1);
        Cs80assoundabove = mSoundPool.load(getApplicationContext(),R.raw.cs80asharpaboveoctave,1);
        Cs80fssoundabove = mSoundPool.load(getApplicationContext(),R.raw.cs80fsharpaboveoctave,1);
        Cs80gssoundabove = mSoundPool.load(getApplicationContext(),R.raw.cs80gsharpaboveoctave,1);
        Cs80dssoundabove = mSoundPool.load(getApplicationContext(),R.raw.cs80dsharpaboveoctave,1);

        GrandPianocsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.grandpianocbelowoctave,1);
        GrandPianodsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.grandpianodbelowoctave,1);
        GrandPianoesoundbelow = mSoundPool.load(getApplicationContext(),R.raw.grandpianoebelowoctave,1);
        GrandPianofsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.grandpianofbelowoctave,1);
        GrandPianogsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.grandpianogbelowoctave,1);
        GrandPianoasoundbelow = mSoundPool.load(getApplicationContext(),R.raw.grandpianoabelowoctave,1);
        GrandPianobsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.grandpianobbelowoctave,1);
        GrandPianocssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.grandpianocsharpbelowoctave,1);
        GrandPianocsssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.grandpianocsharp,1);
        GrandPianoccsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.grandpianoc,1);
        GrandPianoassoundbelow = mSoundPool.load(getApplicationContext(),R.raw.grandpianoasharpbelowoctave,1);
        GrandPianofssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.grandpianofsharpbelowoctave,1);
        GrandPianogssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.grandpianogsharpbelowoctave,1);
        GrandPianodssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.grandpianodsharpbelowoctave,1);

        Keyboardcsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.keyboardcbelowoctave,1);
        Keyboarddsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.keyboarddbelowoctave,1);
        Keyboardesoundbelow = mSoundPool.load(getApplicationContext(),R.raw.keyboardebelowoctave,1);
        Keyboardfsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.keyboardfbelowoctave,1);
        Keyboardgsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.keyboardgbelowoctave,1);
        Keyboardasoundbelow = mSoundPool.load(getApplicationContext(),R.raw.keyboardabelowoctave,1);
        Keyboardbsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.keyboardbbelowoctave,1);
        Keyboardcssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.keyboardcsharpbelowoctave,1);
        Keyboardcsssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.keyboardcsharp,1);
        Keyboardccsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.keyboardc,1);
        Keyboardassoundbelow = mSoundPool.load(getApplicationContext(),R.raw.keyboardasharpbelowoctave,1);
        Keyboardfssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.keyboardfsharpbelowoctave,1);
        Keyboardgssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.keyboardgsharpbelowoctave,1);
        Keyboarddssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.keyboarddsharpbelowoctave,1);

        Organcsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.organcbelowoctave,1);
        Organdsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.organdbelowoctave,1);
        Organesoundbelow = mSoundPool.load(getApplicationContext(),R.raw.organebelowoctave,1);
        Organfsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.organfbelowoctave,1);
        Organgsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.organgbelowoctave,1);
        Organasoundbelow = mSoundPool.load(getApplicationContext(),R.raw.organabelowoctave,1);
        Organbsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.organbbelowoctave,1);
        Organcssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.organcsharpbelowoctave,1);
        Organcsssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.organcsharp,1);
        Organccsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.organc,1);
        Organassoundbelow = mSoundPool.load(getApplicationContext(),R.raw.organasharpbelowoctave,1);
        Organfssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.organfsharpbelowoctave,1);
        Organgssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.organgsharpbelowoctave,1);
        Organdssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.organdsharpbelowoctave,1);

        Harpsichordcsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.harpsichordcbelowoctave,1);
        Harpsichorddsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.harpsichorddbelowoctave,1);
        Harpsichordesoundbelow = mSoundPool.load(getApplicationContext(),R.raw.harpsichordebelowoctave,1);
        Harpsichordfsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.harpsichordfbelowoctave,1);
        Harpsichordgsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.harpsichordgbelowoctave,1);
        Harpsichordasoundbelow = mSoundPool.load(getApplicationContext(),R.raw.harpsichordabelowoctave,1);
        Harpsichordbsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.harpsichordbbelowoctave,1);
        Harpsichordcssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.harpsichordcsharpbelowoctave,1);
        Harpsichordcsssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.harpsichordcsharp,1);
        Harpsichordccsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.harpsichordc,1);
        Harpsichordassoundbelow = mSoundPool.load(getApplicationContext(),R.raw.harpsichordasharpbelowoctave,1);
        Harpsichordfssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.harpsichordfsharpbelowoctave,1);
        Harpsichordgssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.harpsichordgsharpbelowoctave,1);
        Harpsichorddssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.harpsichorddsharpbelowoctave,1);

        Dx7csoundbelow = mSoundPool.load(getApplicationContext(),R.raw.dx7cbelowoctave,1);
        Dx7dsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.dx7dbelowoctave,1);
        Dx7esoundbelow = mSoundPool.load(getApplicationContext(),R.raw.dx7ebelowoctave,1);
        Dx7fsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.dx7fbelowoctave,1);
        Dx7gsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.dx7gbelowoctave,1);
        Dx7asoundbelow = mSoundPool.load(getApplicationContext(),R.raw.dx7abelowoctave,1);
        Dx7bsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.dx7bbelowoctave,1);
        Dx7cssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.dx7csharpbelowoctave,1);
        Dx7csssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.dx7csharp,1);
        Dx7ccsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.dx7c,1);
        Dx7assoundbelow = mSoundPool.load(getApplicationContext(),R.raw.dx7asharpbelowoctave,1);
        Dx7fssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.dx7fsharpbelowoctave,1);
        Dx7gssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.dx7gsharpbelowoctave,1);
        Dx7dssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.dx7dsharpbelowoctave,1);

        Cs80csoundbelow = mSoundPool.load(getApplicationContext(),R.raw.cs80cbelowoctave,1);
        Cs80dsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.cs80dbelowoctave,1);
        Cs80esoundbelow = mSoundPool.load(getApplicationContext(),R.raw.cs80ebelowoctave,1);
        Cs80fsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.cs80fbelowoctave,1);
        Cs80gsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.cs80gbelowoctave,1);
        Cs80asoundbelow = mSoundPool.load(getApplicationContext(),R.raw.cs80abelowoctave,1);
        Cs80bsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.cs80bbelowoctave,1);
        Cs80cssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.cs80csharpbelowoctave,1);
        Cs80csssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.cs80csharp,1);
        Cs80ccsoundbelow = mSoundPool.load(getApplicationContext(),R.raw.cs80c,1);
        Cs80assoundbelow = mSoundPool.load(getApplicationContext(),R.raw.cs80asharpbelowoctave,1);
        Cs80fssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.cs80fsharpbelowoctave,1);
        Cs80gssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.cs80gsharpbelowoctave,1);
        Cs80dssoundbelow = mSoundPool.load(getApplicationContext(),R.raw.cs80dsharpbelowoctave,1);


        metronomeFirstBar = mSoundPool.load(getApplicationContext(), R.raw.metronomefirstbar, 1);
        metronomeSecondThirdFourthBar = mSoundPool.load(getApplicationContext(), R.raw.metronomesecondthirdfourthbar, 1);

        myImageButtonViewRefDrums = findViewById(R.id.imageButtonDrums);
        myImageButtonViewRefDrums.setOnClickListener(this);

        myImageButtonViewRefGuitar = findViewById(R.id.imageButtonGuitar);
        myImageButtonViewRefGuitar.setOnClickListener(this);

        myImageButtonViewRefPiano = findViewById(R.id.imageButtonPiano);
        myImageButtonViewRefPiano.setOnClickListener(this);

        myButtonViewRefGrandPiano = findViewById(R.id.GrandPiano);
        myButtonViewRefGrandPiano.setOnClickListener(this);

        myButtonViewRefKeyboard = findViewById(R.id.Keyboard);
        myButtonViewRefKeyboard.setOnClickListener(this);

        myButtonViewRefOrgan = findViewById(R.id.Organ);
        myButtonViewRefOrgan.setOnClickListener(this);

        myButtonViewRefHarpsichord = findViewById(R.id.Harpsichord);
        myButtonViewRefHarpsichord.setOnClickListener(this);

        myButtonViewRefDx7 = findViewById(R.id.DX7);
        myButtonViewRefDx7.setOnClickListener(this);

        myButtonViewRefCs80 = findViewById(R.id.CS80);
        myButtonViewRefCs80.setOnClickListener(this);

        myImageButtonViewRefSequencer4 = findViewById(R.id.imageButtonSequencer4);
        myImageButtonViewRefSequencer4.setOnClickListener(this);

        myImageButtonViewRefStop4 = findViewById(R.id.imageButtonStop4);
        myImageButtonViewRefStop4.setOnClickListener(this);

        myViewRefRedCircle4 = findViewById(R.id.theRedCircle4);
        myViewRefRedCircle4.setOnClickListener(this);

        buttonPianoC = findViewById(R.id.c);
        buttonPianoC.setOnTouchListener(this);

        buttonPianoD = findViewById(R.id.d);
        buttonPianoD.setOnTouchListener(this);

        buttonPianoE = findViewById(R.id.e);
        buttonPianoE.setOnTouchListener(this);

        buttonPianoF = findViewById(R.id.f);
        buttonPianoF.setOnTouchListener(this);

        buttonPianoG = findViewById(R.id.g);
        buttonPianoG.setOnTouchListener(this);

        buttonPianoA = findViewById(R.id.a);
        buttonPianoA.setOnTouchListener(this);

        buttonPianoB = findViewById(R.id.b);
        buttonPianoB.setOnTouchListener(this);

        buttonPianoC2 = findViewById(R.id.c2);
        buttonPianoC2.setOnTouchListener(this);

        buttonPianoCSharp = findViewById(R.id.cs);
        buttonPianoCSharp.setOnTouchListener(this);

        buttonPianoDSharp = findViewById(R.id.ds);
        buttonPianoDSharp.setOnTouchListener(this);

        buttonPianoFSharp = findViewById(R.id.fs);
        buttonPianoFSharp.setOnTouchListener(this);

        buttonPianoGSharp = findViewById(R.id.gs);
        buttonPianoGSharp.setOnTouchListener(this);

        buttonPianoASharp = findViewById(R.id.as);
        buttonPianoASharp.setOnTouchListener(this);

        buttonPianoC2Sharp = findViewById(R.id.css);
        buttonPianoC2Sharp.setOnTouchListener(this);

        myButtonViewRefVolumeControl = findViewById(R.id.buttonVolumePiano);
        myButtonViewRefVolumeControl.setOnClickListener(this);

        myButtonViewRefOctaveUp = findViewById(R.id.buttonUpOctavePiano);
        myButtonViewRefOctaveUp.setOnClickListener(this);

        myButtonViewRefOctaveDown = findViewById(R.id.buttonDownOctavePiano);
        myButtonViewRefOctaveDown.setOnClickListener(this);

        myButtonViewRefVolumeControl = findViewById(R.id.buttonDownOctavePiano);
        myButtonViewRefVolumeControl.setOnClickListener(this);

        switchChords = (Switch) findViewById(R.id.switchChords);

        seekBar = findViewById(R.id.seekBarPiano);
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
        maxvolume = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        currentvolume = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);
        seekBar.setMax(maxvolume);
        seekBar.setProgress(currentvolume);

        seekBarGrandPiano = findViewById(R.id.seekBarPianoGrandPiano);
        seekBarHarpsichord = findViewById(R.id.seekBarPianoHarpsichord);
        seekBarOrgan = findViewById(R.id.seekBarPianoOrgan);
        seekBarKeyboard = findViewById(R.id.seekBarPianoKeyboard);
        seekBarDx7 = findViewById(R.id.seekBarPianoDx7);
        seekBarCs80 = findViewById(R.id.seekBarPianoCs80);

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

        seekBarGrandPiano.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            //int progressChangedValue = 0;

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                //progressChangedValue = progress;
                //progressChangedValue = seekBar.getProgress();
                progressChangedValueGrandPiano = seekBarGrandPiano.getProgress();
                progressChangedValueGrandPiano = progressChangedValueGrandPiano /10;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity3.this, "Seek bar progress is :" + progressChangedValueGrandPiano,
                        Toast.LENGTH_SHORT).show();
            }
        });

        seekBarHarpsichord.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValueHarpsichord = seekBarHarpsichord.getProgress();
                progressChangedValueHarpsichord = progressChangedValueHarpsichord /10;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity3.this, "Seek bar progress is :" + progressChangedValueHarpsichord,
                        Toast.LENGTH_SHORT).show();
            }
        });

        seekBarOrgan.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValueOrgan = seekBarOrgan.getProgress();
                progressChangedValueOrgan = progressChangedValueOrgan /10;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity3.this, "Seek bar progress is :" + progressChangedValueOrgan,
                        Toast.LENGTH_SHORT).show();
            }
        });

        seekBarKeyboard.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValueKeyboard = seekBarKeyboard.getProgress();
                progressChangedValueKeyboard = progressChangedValueKeyboard /10;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity3.this, "Seek bar progress is :" + progressChangedValueKeyboard,
                        Toast.LENGTH_SHORT).show();
            }
        });

        seekBarDx7.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValueDx7 = seekBarDx7.getProgress();
                progressChangedValueDx7 = progressChangedValueDx7 /10;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity3.this, "Seek bar progress is :" + progressChangedValueDx7,
                        Toast.LENGTH_SHORT).show();
            }
        });

        seekBarCs80.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {

            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                progressChangedValueCs80 = seekBarCs80.getProgress();
                progressChangedValueCs80 = progressChangedValueCs80 /10;
            }

            public void onStartTrackingTouch(SeekBar seekBar) {
                // TODO Auto-generated method stub
            }

            public void onStopTrackingTouch(SeekBar seekBar) {
                Toast.makeText(MainActivity3.this, "Seek bar progress is :" + progressChangedValueCs80,
                        Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public void onClick(View view) {
        PopupMenu popupMenu = new PopupMenu(MainActivity3.this, myButtonViewRefVolumeControl);
        popupMenu.getMenuInflater().inflate(R.menu.popup_menu3, popupMenu.getMenu());

        switch (view.getId()) { //checks which button is pressed

            case R.id.imageButtonDrums: //if the nextPage button is pressed
            {
                Intent intent = new Intent(this, MainActivity.class); //creates a new intent
                startActivityForResult(intent, APP2_REQUEST); //starts activity, effectively transfers from MainActivity.java to MainActivity2.java
                break; //break statement
            }

            case R.id.imageButtonGuitar: //if the nextPage button is pressed
            {
                Intent intent = new Intent(this, MainActivity2.class); //creates a new intent
                startActivityForResult(intent, APP2_REQUEST); //starts activity, effectively transfers from MainActivity.java to MainActivity2.java
                break; //break statement
            }

            case R.id.imageButtonPiano: //if the nextPage button is pressed
            {
                Intent intent = new Intent(this, MainActivity3.class); //creates a new intent
                startActivityForResult(intent, APP2_REQUEST); //starts activity, effectively transfers from MainActivity.java to MainActivity2.java
                break; //break statement
            }

            case R.id.GrandPiano: //if the nextPage button is pressed
            {
                if (myButtonViewRefGrandPiano.isPressed() && grandPianoCounter == 1) {
                    myButtonViewRefGrandPiano.setBackgroundResource(R.drawable.grandpiano);
                    grandPianoCounter = 0;
                } else {
                    myButtonViewRefGrandPiano.setBackgroundResource(R.drawable.grandpiano2);
                    grandPianoCounter = 1;
                }

                break; //break statement

            }

            case R.id.Keyboard: //if the nextPage button is pressed
            {
                if (myButtonViewRefKeyboard.isPressed() && keyboardCounter == 1) {
                    myButtonViewRefKeyboard.setBackgroundResource(R.drawable.keyboard);
                    keyboardCounter = 0;
                } else {
                    myButtonViewRefKeyboard.setBackgroundResource(R.drawable.keyboard2);
                    keyboardCounter = 1;
                }

                break; //break statement

            }

            case R.id.Organ: //if the nextPage button is pressed
            {
                if (myButtonViewRefOrgan.isPressed() && organCounter == 1) {
                    myButtonViewRefOrgan.setBackgroundResource(R.drawable.organ);
                    organCounter = 0;
                } else {
                    myButtonViewRefOrgan.setBackgroundResource(R.drawable.organ2);
                    organCounter = 1;
                }

                break; //break statement

            }

            case R.id.Harpsichord: //if the nextPage button is pressed
            {
                if (myButtonViewRefHarpsichord.isPressed() && harpsichordCounter == 1) {
                    myButtonViewRefHarpsichord.setBackgroundResource(R.drawable.harpsichord);
                    harpsichordCounter = 0;
                } else {
                    myButtonViewRefHarpsichord.setBackgroundResource(R.drawable.harpsichord2);
                    harpsichordCounter = 1;
                }

                break; //break statement

            }

            case R.id.DX7: //if the nextPage button is pressed
            {
                if (myButtonViewRefDx7.isPressed() && dx7Counter == 1) {
                    myButtonViewRefDx7.setBackgroundResource(R.drawable.dx7);
                    dx7Counter = 0;
                } else {
                    myButtonViewRefDx7.setBackgroundResource(R.drawable.dx72);
                    dx7Counter = 1;
                }

                break; //break statement

            }

            case R.id.CS80: //if the nextPage button is pressed
            {
                if (myButtonViewRefCs80.isPressed() && cs80Counter == 1) {
                    myButtonViewRefCs80.setBackgroundResource(R.drawable.cs80);
                    cs80Counter = 0;
                } else {
                    myButtonViewRefCs80.setBackgroundResource(R.drawable.cs802);
                    cs80Counter = 1;
                }

                break; //break statement

            }

            case R.id.buttonUpOctavePiano: //if the nextPage button is pressed
            {
                if(myButtonViewRefOctaveUp.isPressed() && octaveCounterUp == 0 && octaveCounterDown == 0) {
                    octaveCounterUp = 1;
                }
                if(myButtonViewRefOctaveUp.isPressed() && octaveCounterUp == 0 && octaveCounterDown == 1) {
                    octaveCounterDown = 0;
                }
                break; //break statement
            }

            case R.id.buttonDownOctavePiano: //if the nextPage button is pressed
            {
                if(myButtonViewRefOctaveDown.isPressed() && octaveCounterUp == 0 && octaveCounterDown == 0) {
                    octaveCounterDown = 1;
                }
                if(myButtonViewRefOctaveDown.isPressed() && octaveCounterUp == 1 && octaveCounterDown == 0) {
                    octaveCounterUp = 0;
                }
                break; //break statement
            }

            case R.id.buttonVolumePiano: //if the nextPage button is pressed
            {
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        // Toast message on menu item clicked
                        Toast.makeText(MainActivity3.this, "Volume Control for " + menuItem.getTitle(), Toast.LENGTH_SHORT).show();
                        if(menuItem.getTitle().equals("Total Volume")) {
                            seekBar.setVisibility(View.VISIBLE);
                            seekBarGrandPiano.setVisibility(View.INVISIBLE);
                            seekBarHarpsichord.setVisibility(View.INVISIBLE);
                            seekBarOrgan.setVisibility(View.INVISIBLE);
                            seekBarKeyboard.setVisibility(View.INVISIBLE);
                            seekBarDx7.setVisibility(View.INVISIBLE);
                            seekBarCs80.setVisibility(View.INVISIBLE);
                        }
                        if(menuItem.getTitle().equals("Grand Piano")) {
                            seekBar.setVisibility(View.INVISIBLE);
                            seekBarGrandPiano.setVisibility(View.VISIBLE);
                            seekBarHarpsichord.setVisibility(View.INVISIBLE);
                            seekBarOrgan.setVisibility(View.INVISIBLE);
                            seekBarKeyboard.setVisibility(View.INVISIBLE);
                            seekBarDx7.setVisibility(View.INVISIBLE);
                            seekBarCs80.setVisibility(View.INVISIBLE);
                        }
                        if(menuItem.getTitle().equals("Harpsichord")) {
                            seekBar.setVisibility(View.INVISIBLE);
                            seekBarGrandPiano.setVisibility(View.INVISIBLE);
                            seekBarHarpsichord.setVisibility(View.VISIBLE);
                            seekBarOrgan.setVisibility(View.INVISIBLE);
                            seekBarKeyboard.setVisibility(View.INVISIBLE);
                            seekBarDx7.setVisibility(View.INVISIBLE);
                            seekBarCs80.setVisibility(View.INVISIBLE);
                        }
                        if(menuItem.getTitle().equals("Organ")) {
                            seekBar.setVisibility(View.INVISIBLE);
                            seekBarGrandPiano.setVisibility(View.INVISIBLE);
                            seekBarHarpsichord.setVisibility(View.INVISIBLE);
                            seekBarOrgan.setVisibility(View.VISIBLE);
                            seekBarKeyboard.setVisibility(View.INVISIBLE);
                            seekBarDx7.setVisibility(View.INVISIBLE);
                            seekBarCs80.setVisibility(View.INVISIBLE);
                        }
                        if(menuItem.getTitle().equals("Keyboard")) {
                            seekBar.setVisibility(View.INVISIBLE);
                            seekBarGrandPiano.setVisibility(View.INVISIBLE);
                            seekBarHarpsichord.setVisibility(View.INVISIBLE);
                            seekBarOrgan.setVisibility(View.INVISIBLE);
                            seekBarKeyboard.setVisibility(View.VISIBLE);
                            seekBarDx7.setVisibility(View.INVISIBLE);
                            seekBarCs80.setVisibility(View.INVISIBLE);
                        }
                        if(menuItem.getTitle().equals("DX7")) {
                            seekBar.setVisibility(View.INVISIBLE);
                            seekBarGrandPiano.setVisibility(View.INVISIBLE);
                            seekBarHarpsichord.setVisibility(View.INVISIBLE);
                            seekBarOrgan.setVisibility(View.INVISIBLE);
                            seekBarKeyboard.setVisibility(View.INVISIBLE);
                            seekBarDx7.setVisibility(View.VISIBLE);
                            seekBarCs80.setVisibility(View.INVISIBLE);
                        }
                        if(menuItem.getTitle().equals("CS-80")) {
                            seekBar.setVisibility(View.INVISIBLE);
                            seekBarGrandPiano.setVisibility(View.INVISIBLE);
                            seekBarHarpsichord.setVisibility(View.INVISIBLE);
                            seekBarOrgan.setVisibility(View.INVISIBLE);
                            seekBarKeyboard.setVisibility(View.INVISIBLE);
                            seekBarDx7.setVisibility(View.INVISIBLE);
                            seekBarCs80.setVisibility(View.VISIBLE);
                        }
                        return true;
                    }
                });
                popupMenu.show();
                break; //break statement
            }

            case R.id.imageButtonSequencer4: //if the nextPage button is pressed
            /*{
                if (myImageButtonViewRefSequencer4.isPressed() && sequencerCounter4==1) {
                    myViewRefRedCircle4.setVisibility(View.GONE);
                    sequencerCounter4 = 0;
                }
                else {
                    myViewRefRedCircle4.setVisibility(View.VISIBLE);
                    sequencerCounter4 = 1;
                }
                break;
            }*/

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

                if (myImageButtonViewRefSequencer4.isPressed() && sequencerCounter4 == 2) {
                    myViewRefRedCircle4.setVisibility(View.GONE);
                    sequencerCounter4 = 0;
                } else {
                    myViewRefRedCircle4.setVisibility(View.VISIBLE);
                    sequencerCounter4 = 1;
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
                            myViewRefRedCircle4.setVisibility(View.GONE);
                            sequencerCounter4 = 0;
                        }
                    }, 4000);


                }
                break;
            }

            case R.id.imageButtonStop4://if the nextPage button is pressed
            {
            /*{
                if(stopCounter4==1) {
                    mSoundPool.autoResume();
                    stopCounter4=0;
                }

                else{
                    mSoundPool.autoPause();
                    stopCounter4=1;
                }
                break;
            }*/

                //onTouchEvent(view, motionEvent);

                if (testVariable == 1) {
                    checkPresses = checkPresses - 1;
                    testVariable = 0;
                } else {
                    checkPresses = checkPresses + 1;
                    testVariable = 1;
                }

                final Handler handler = new Handler();

                if (sequencerCounter4 == 0 && checkPresses == 1) {
                    if (sequencerBoolean[0][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cCheckCounterGrandPiano == 1) { mSoundPool.play(GrandPianocsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cCheckCounterKeyboard == 1) { mSoundPool.play(Keyboardcsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cCheckCounterOrgan == 1) { mSoundPool.play(Organcsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cCheckCounterHarpsichord == 1) { mSoundPool.play(Harpsichordcsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cCheckCounterDx7 == 1) { mSoundPool.play(Dx7csound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cCheckCounterCs80 == 1) { mSoundPool.play(Cs80csound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cCheckCounterGrandPiano1 == 1) { mSoundPool.play(GrandPianocsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cCheckCounterKeyboard1 == 1) { mSoundPool.play(Keyboardcsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cCheckCounterOrgan1 == 1) { mSoundPool.play(Organcsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cCheckCounterHarpsichord1 == 1) { mSoundPool.play(Harpsichordcsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cCheckCounterDx71 == 1) { mSoundPool.play(Dx7csound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cCheckCounterCs801 == 1) { mSoundPool.play(Cs80csound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cCheckCounterGrandPiano2 == 1) { mSoundPool.play(GrandPianocsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cCheckCounterKeyboard2 == 1) { mSoundPool.play(Keyboardcsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cCheckCounterOrgan2 == 1) { mSoundPool.play(Organcsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cCheckCounterHarpsichord2 == 1) { mSoundPool.play(Harpsichordcsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cCheckCounterDx72 == 1) { mSoundPool.play(Dx7csound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cCheckCounterCs802 == 1) { mSoundPool.play(Cs80csound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cCheckCounterGrandPiano3 == 1) { mSoundPool.play(GrandPianocsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cCheckCounterKeyboard3 == 1) { mSoundPool.play(Keyboardcsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cCheckCounterOrgan3 == 1) { mSoundPool.play(Organcsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cCheckCounterHarpsichord3 == 1) { mSoundPool.play(Harpsichordcsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cCheckCounterDx73 == 1) { mSoundPool.play(Dx7csound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cCheckCounterCs803 == 1) { mSoundPool.play(Cs80csound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cCheckCounterGrandPiano4 == 1) { mSoundPool.play(GrandPianocsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cCheckCounterKeyboard4 == 1) { mSoundPool.play(Keyboardcsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cCheckCounterOrgan4 == 1) { mSoundPool.play(Organcsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cCheckCounterHarpsichord4 == 1) { mSoundPool.play(Harpsichordcsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cCheckCounterDx74 == 1) { mSoundPool.play(Dx7csound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cCheckCounterCs804 == 1) { mSoundPool.play(Cs80csound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cCheckCounterGrandPiano5 == 1) { mSoundPool.play(GrandPianocsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cCheckCounterKeyboard5 == 1) { mSoundPool.play(Keyboardcsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cCheckCounterOrgan5 == 1) { mSoundPool.play(Organcsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cCheckCounterHarpsichord5 == 1) { mSoundPool.play(Harpsichordcsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cCheckCounterDx75 == 1) { mSoundPool.play(Dx7csound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cCheckCounterCs805 == 1) { mSoundPool.play(Cs80csound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cCheckCounterGrandPiano6 == 1) { mSoundPool.play(GrandPianocsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cCheckCounterKeyboard6 == 1) { mSoundPool.play(Keyboardcsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cCheckCounterOrgan6 == 1) { mSoundPool.play(Organcsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cCheckCounterHarpsichord6 == 1) { mSoundPool.play(Harpsichordcsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cCheckCounterDx76 == 1) { mSoundPool.play(Dx7csound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cCheckCounterCs806 == 1) { mSoundPool.play(Cs80csound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cCheckCounterGrandPiano7 == 1) { mSoundPool.play(GrandPianocsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cCheckCounterKeyboard7 == 1) { mSoundPool.play(Keyboardcsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cCheckCounterOrgan7 == 1) { mSoundPool.play(Organcsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cCheckCounterHarpsichord7 == 1) { mSoundPool.play(Harpsichordcsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cCheckCounterDx77 == 1) { mSoundPool.play(Dx7csound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cCheckCounterCs807 == 1) { mSoundPool.play(Cs80csound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cCheckCounterGrandPiano8 == 1) { mSoundPool.play(GrandPianocsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cCheckCounterKeyboard8 == 1) { mSoundPool.play(Keyboardcsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cCheckCounterOrgan8 == 1) { mSoundPool.play(Organcsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cCheckCounterHarpsichord8 == 1) { mSoundPool.play(Harpsichordcsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cCheckCounterDx78 == 1) { mSoundPool.play(Dx7csound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cCheckCounterCs808 == 1) { mSoundPool.play(Cs80csound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cCheckCounterGrandPiano9 == 1) { mSoundPool.play(GrandPianocsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cCheckCounterKeyboard9 == 1) { mSoundPool.play(Keyboardcsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cCheckCounterOrgan9 == 1) { mSoundPool.play(Organcsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cCheckCounterHarpsichord9 == 1) { mSoundPool.play(Harpsichordcsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cCheckCounterDx79 == 1) { mSoundPool.play(Dx7csound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cCheckCounterCs809 == 1) { mSoundPool.play(Cs80csound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cCheckCounterGrandPiano10 == 1) { mSoundPool.play(GrandPianocsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cCheckCounterKeyboard10 == 1) { mSoundPool.play(Keyboardcsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cCheckCounterOrgan10 == 1) { mSoundPool.play(Organcsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cCheckCounterHarpsichord10 == 1) { mSoundPool.play(Harpsichordcsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cCheckCounterDx710 == 1) { mSoundPool.play(Dx7csound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cCheckCounterCs8010 == 1) { mSoundPool.play(Cs80csound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cCheckCounterGrandPiano11 == 1) { mSoundPool.play(GrandPianocsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cCheckCounterKeyboard11 == 1) { mSoundPool.play(Keyboardcsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cCheckCounterOrgan11 == 1) { mSoundPool.play(Organcsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cCheckCounterHarpsichord11 == 1) { mSoundPool.play(Harpsichordcsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cCheckCounterDx711 == 1) { mSoundPool.play(Dx7csound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cCheckCounterCs8011 == 1) { mSoundPool.play(Cs80csound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cCheckCounterGrandPiano12 == 1) { mSoundPool.play(GrandPianocsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cCheckCounterKeyboard12 == 1) { mSoundPool.play(Keyboardcsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cCheckCounterOrgan12 == 1) { mSoundPool.play(Organcsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cCheckCounterHarpsichord12 == 1) { mSoundPool.play(Harpsichordcsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cCheckCounterDx712 == 1) { mSoundPool.play(Dx7csound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cCheckCounterCs8012 == 1) { mSoundPool.play(Cs80csound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cCheckCounterGrandPiano13 == 1) { mSoundPool.play(GrandPianocsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cCheckCounterKeyboard13 == 1) { mSoundPool.play(Keyboardcsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cCheckCounterOrgan13 == 1) { mSoundPool.play(Organcsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cCheckCounterHarpsichord13 == 1) { mSoundPool.play(Harpsichordcsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cCheckCounterDx713 == 1) { mSoundPool.play(Dx7csound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cCheckCounterCs8013 == 1) { mSoundPool.play(Cs80csound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cCheckCounterGrandPiano14 == 1) { mSoundPool.play(GrandPianocsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cCheckCounterKeyboard14 == 1) { mSoundPool.play(Keyboardcsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cCheckCounterOrgan14 == 1) { mSoundPool.play(Organcsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cCheckCounterHarpsichord14 == 1) { mSoundPool.play(Harpsichordcsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cCheckCounterDx714 == 1) { mSoundPool.play(Dx7csound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cCheckCounterCs8014 == 1) { mSoundPool.play(Cs80csound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][1] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cCheckCounterGrandPiano15 == 1) { mSoundPool.play(GrandPianocsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cCheckCounterKeyboard15 == 1) { mSoundPool.play(Keyboardcsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cCheckCounterOrgan15 == 1) { mSoundPool.play(Organcsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cCheckCounterHarpsichord15 == 1) { mSoundPool.play(Harpsichordcsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cCheckCounterDx715 == 1) { mSoundPool.play(Dx7csound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cCheckCounterCs8015 == 1) { mSoundPool.play(Cs80csound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dCheckCounterGrandPiano == 1) { mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dCheckCounterKeyboard == 1) { mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dCheckCounterOrgan == 1) { mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dCheckCounterHarpsichord == 1) { mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dCheckCounterDx7 == 1) { mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dCheckCounterCs80 == 1) { mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dCheckCounterGrandPiano1 == 1) { mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dCheckCounterKeyboard1 == 1) { mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dCheckCounterOrgan1 == 1) { mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dCheckCounterHarpsichord1 == 1) { mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dCheckCounterDx71 == 1) { mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dCheckCounterCs801 == 1) { mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dCheckCounterGrandPiano2 == 1) { mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dCheckCounterKeyboard2 == 1) { mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dCheckCounterOrgan2 == 1) { mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dCheckCounterHarpsichord2 == 1) { mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dCheckCounterDx72 == 1) { mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dCheckCounterCs802 == 1) { mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dCheckCounterGrandPiano3 == 1) { mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dCheckCounterKeyboard3 == 1) { mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dCheckCounterOrgan3 == 1) { mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dCheckCounterHarpsichord3 == 1) { mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dCheckCounterDx73 == 1) { mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dCheckCounterCs803 == 1) { mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dCheckCounterGrandPiano4 == 1) { mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dCheckCounterKeyboard4 == 1) { mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dCheckCounterOrgan4 == 1) { mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dCheckCounterHarpsichord4 == 1) { mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dCheckCounterDx74 == 1) { mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dCheckCounterCs804 == 1) { mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dCheckCounterGrandPiano5 == 1) { mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dCheckCounterKeyboard5 == 1) { mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dCheckCounterOrgan5 == 1) { mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dCheckCounterHarpsichord5 == 1) { mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dCheckCounterDx75 == 1) { mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dCheckCounterCs805 == 1) { mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dCheckCounterGrandPiano6 == 1) { mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dCheckCounterKeyboard6 == 1) { mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dCheckCounterOrgan6 == 1) { mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dCheckCounterHarpsichord6 == 1) { mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dCheckCounterDx76 == 1) { mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dCheckCounterCs806 == 1) { mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dCheckCounterGrandPiano7 == 1) { mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dCheckCounterKeyboard7 == 1) { mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dCheckCounterOrgan7 == 1) { mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dCheckCounterHarpsichord7 == 1) { mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dCheckCounterDx77 == 1) { mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dCheckCounterCs807 == 1) { mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dCheckCounterGrandPiano8 == 1) { mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dCheckCounterKeyboard8 == 1) { mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dCheckCounterOrgan8 == 1) { mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dCheckCounterHarpsichord8 == 1) { mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dCheckCounterDx78 == 1) { mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dCheckCounterCs808 == 1) { mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dCheckCounterGrandPiano9 == 1) { mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dCheckCounterKeyboard9 == 1) { mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dCheckCounterOrgan9 == 1) { mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dCheckCounterHarpsichord9 == 1) { mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dCheckCounterDx79 == 1) { mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dCheckCounterCs809 == 1) { mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dCheckCounterGrandPiano10 == 1) { mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dCheckCounterKeyboard10 == 1) { mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dCheckCounterOrgan10 == 1) { mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dCheckCounterHarpsichord10 == 1) { mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dCheckCounterDx710 == 1) { mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dCheckCounterCs8010 == 1) { mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dCheckCounterGrandPiano11 == 1) { mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dCheckCounterKeyboard11 == 1) { mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dCheckCounterOrgan11 == 1) { mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dCheckCounterHarpsichord11 == 1) { mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dCheckCounterDx711 == 1) { mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dCheckCounterCs8011 == 1) { mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dCheckCounterGrandPiano12 == 1) { mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dCheckCounterKeyboard12 == 1) { mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dCheckCounterOrgan12 == 1) { mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dCheckCounterHarpsichord12 == 1) { mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dCheckCounterDx712 == 1) { mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dCheckCounterCs8012 == 1) { mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dCheckCounterGrandPiano13 == 1) { mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dCheckCounterKeyboard13 == 1) { mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dCheckCounterOrgan13 == 1) { mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dCheckCounterHarpsichord13 == 1) { mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dCheckCounterDx713 == 1) { mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dCheckCounterCs8013 == 1) { mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dCheckCounterGrandPiano14 == 1) { mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dCheckCounterKeyboard14 == 1) { mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dCheckCounterOrgan14 == 1) { mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dCheckCounterHarpsichord14 == 1) { mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dCheckCounterDx714 == 1) { mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dCheckCounterCs8014 == 1) { mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][2] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dCheckCounterGrandPiano15 == 1) { mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dCheckCounterKeyboard15 == 1) { mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dCheckCounterOrgan15 == 1) { mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dCheckCounterHarpsichord15 == 1) { mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dCheckCounterDx715 == 1) { mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dCheckCounterCs8015 == 1) { mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (eCheckCounterGrandPiano == 1) { mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (eCheckCounterKeyboard == 1) { mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (eCheckCounterOrgan == 1) { mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (eCheckCounterHarpsichord == 1) { mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (eCheckCounterDx7 == 1) { mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (eCheckCounterCs80 == 1) { mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (eCheckCounterGrandPiano1 == 1) { mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (eCheckCounterKeyboard1 == 1) { mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (eCheckCounterOrgan1 == 1) { mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (eCheckCounterHarpsichord1 == 1) { mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (eCheckCounterDx71 == 1) { mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (eCheckCounterCs801 == 1) { mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (eCheckCounterGrandPiano2 == 1) { mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (eCheckCounterKeyboard2 == 1) { mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (eCheckCounterOrgan2 == 1) { mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (eCheckCounterHarpsichord2 == 1) { mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (eCheckCounterDx72 == 1) { mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (eCheckCounterCs802 == 1) { mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (eCheckCounterGrandPiano3 == 1) { mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (eCheckCounterKeyboard3 == 1) { mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (eCheckCounterOrgan3 == 1) { mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (eCheckCounterHarpsichord3 == 1) { mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (eCheckCounterDx73 == 1) { mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (eCheckCounterCs803 == 1) { mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (eCheckCounterGrandPiano4 == 1) { mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (eCheckCounterKeyboard4 == 1) { mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (eCheckCounterOrgan4 == 1) { mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (eCheckCounterHarpsichord4 == 1) { mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (eCheckCounterDx74 == 1) { mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (eCheckCounterCs804 == 1) { mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (eCheckCounterGrandPiano5 == 1) { mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (eCheckCounterKeyboard5 == 1) { mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (eCheckCounterOrgan5 == 1) { mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (eCheckCounterHarpsichord5 == 1) { mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (eCheckCounterDx75 == 1) { mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (eCheckCounterCs805 == 1) { mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (eCheckCounterGrandPiano6 == 1) { mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (eCheckCounterKeyboard6 == 1) { mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (eCheckCounterOrgan6 == 1) { mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (eCheckCounterHarpsichord6 == 1) { mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (eCheckCounterDx76 == 1) { mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (eCheckCounterCs806 == 1) { mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (eCheckCounterGrandPiano7 == 1) { mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (eCheckCounterKeyboard7 == 1) { mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (eCheckCounterOrgan7 == 1) { mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (eCheckCounterHarpsichord7 == 1) { mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (eCheckCounterDx77 == 1) { mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (eCheckCounterCs807 == 1) { mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (eCheckCounterGrandPiano8 == 1) { mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (eCheckCounterKeyboard8 == 1) { mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (eCheckCounterOrgan8 == 1) { mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (eCheckCounterHarpsichord8 == 1) { mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (eCheckCounterDx78 == 1) { mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (eCheckCounterCs808 == 1) { mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (eCheckCounterGrandPiano9 == 1) { mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (eCheckCounterKeyboard9 == 1) { mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (eCheckCounterOrgan9 == 1) { mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (eCheckCounterHarpsichord9 == 1) { mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (eCheckCounterDx79 == 1) { mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (eCheckCounterCs809 == 1) { mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (eCheckCounterGrandPiano10 == 1) { mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (eCheckCounterKeyboard10 == 1) { mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (eCheckCounterOrgan10 == 1) { mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (eCheckCounterHarpsichord10 == 1) { mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (eCheckCounterDx710 == 1) { mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (eCheckCounterCs8010 == 1) { mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (eCheckCounterGrandPiano11 == 1) { mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (eCheckCounterKeyboard11 == 1) { mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (eCheckCounterOrgan11 == 1) { mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (eCheckCounterHarpsichord11 == 1) { mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (eCheckCounterDx711 == 1) { mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (eCheckCounterCs8011 == 1) { mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (eCheckCounterGrandPiano12 == 1) { mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (eCheckCounterKeyboard12 == 1) { mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (eCheckCounterOrgan12 == 1) { mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (eCheckCounterHarpsichord12 == 1) { mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (eCheckCounterDx712 == 1) { mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (eCheckCounterCs8012 == 1) { mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (eCheckCounterGrandPiano13 == 1) { mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (eCheckCounterKeyboard13 == 1) { mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (eCheckCounterOrgan13 == 1) { mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (eCheckCounterHarpsichord13 == 1) { mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (eCheckCounterDx713 == 1) { mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (eCheckCounterCs8013 == 1) { mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (eCheckCounterGrandPiano14 == 1) { mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (eCheckCounterKeyboard14 == 1) { mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (eCheckCounterOrgan14 == 1) { mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (eCheckCounterHarpsichord14 == 1) { mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (eCheckCounterDx714 == 1) { mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (eCheckCounterCs8014 == 1) { mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][3] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (eCheckCounterGrandPiano15 == 1) { mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (eCheckCounterKeyboard15 == 1) { mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (eCheckCounterOrgan15 == 1) { mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (eCheckCounterHarpsichord15 == 1) { mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (eCheckCounterDx715 == 1) { mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (eCheckCounterCs8015 == 1) { mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fCheckCounterGrandPiano == 1) { mSoundPool.play(GrandPianofsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fCheckCounterKeyboard == 1) { mSoundPool.play(Keyboardfsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fCheckCounterOrgan == 1) { mSoundPool.play(Organfsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fCheckCounterHarpsichord == 1) { mSoundPool.play(Harpsichordfsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fCheckCounterDx7 == 1) { mSoundPool.play(Dx7fsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fCheckCounterCs80 == 1) { mSoundPool.play(Cs80fsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fCheckCounterGrandPiano1 == 1) { mSoundPool.play(GrandPianofsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fCheckCounterKeyboard1 == 1) { mSoundPool.play(Keyboardfsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fCheckCounterOrgan1 == 1) { mSoundPool.play(Organfsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fCheckCounterHarpsichord1 == 1) { mSoundPool.play(Harpsichordfsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fCheckCounterDx71 == 1) { mSoundPool.play(Dx7fsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fCheckCounterCs801 == 1) { mSoundPool.play(Cs80fsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fCheckCounterGrandPiano2 == 1) { mSoundPool.play(GrandPianofsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fCheckCounterKeyboard2 == 1) { mSoundPool.play(Keyboardfsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fCheckCounterOrgan2 == 1) { mSoundPool.play(Organfsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fCheckCounterHarpsichord2 == 1) { mSoundPool.play(Harpsichordfsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fCheckCounterDx72 == 1) { mSoundPool.play(Dx7fsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fCheckCounterCs802 == 1) { mSoundPool.play(Cs80fsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fCheckCounterGrandPiano3 == 1) { mSoundPool.play(GrandPianofsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fCheckCounterKeyboard3 == 1) { mSoundPool.play(Keyboardfsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fCheckCounterOrgan3 == 1) { mSoundPool.play(Organfsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fCheckCounterHarpsichord3 == 1) { mSoundPool.play(Harpsichordfsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fCheckCounterDx73 == 1) { mSoundPool.play(Dx7fsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fCheckCounterCs803 == 1) { mSoundPool.play(Cs80fsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fCheckCounterGrandPiano4 == 1) { mSoundPool.play(GrandPianofsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fCheckCounterKeyboard4 == 1) { mSoundPool.play(Keyboardfsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fCheckCounterOrgan4 == 1) { mSoundPool.play(Organfsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fCheckCounterHarpsichord4 == 1) { mSoundPool.play(Harpsichordfsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fCheckCounterDx74 == 1) { mSoundPool.play(Dx7fsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fCheckCounterCs804 == 1) { mSoundPool.play(Cs80fsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fCheckCounterGrandPiano5 == 1) { mSoundPool.play(GrandPianofsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fCheckCounterKeyboard5 == 1) { mSoundPool.play(Keyboardfsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fCheckCounterOrgan5 == 1) { mSoundPool.play(Organfsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fCheckCounterHarpsichord5 == 1) { mSoundPool.play(Harpsichordfsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fCheckCounterDx75 == 1) { mSoundPool.play(Dx7fsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fCheckCounterCs805 == 1) { mSoundPool.play(Cs80fsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fCheckCounterGrandPiano6 == 1) { mSoundPool.play(GrandPianofsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fCheckCounterKeyboard6 == 1) { mSoundPool.play(Keyboardfsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fCheckCounterOrgan6 == 1) { mSoundPool.play(Organfsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fCheckCounterHarpsichord6 == 1) { mSoundPool.play(Harpsichordfsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fCheckCounterDx76 == 1) { mSoundPool.play(Dx7fsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fCheckCounterCs806 == 1) { mSoundPool.play(Cs80fsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fCheckCounterGrandPiano7 == 1) { mSoundPool.play(GrandPianofsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fCheckCounterKeyboard7 == 1) { mSoundPool.play(Keyboardfsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fCheckCounterOrgan7 == 1) { mSoundPool.play(Organfsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fCheckCounterHarpsichord7 == 1) { mSoundPool.play(Harpsichordfsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fCheckCounterDx77 == 1) { mSoundPool.play(Dx7fsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fCheckCounterCs807 == 1) { mSoundPool.play(Cs80fsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fCheckCounterGrandPiano8 == 1) { mSoundPool.play(GrandPianofsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fCheckCounterKeyboard8 == 1) { mSoundPool.play(Keyboardfsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fCheckCounterOrgan8 == 1) { mSoundPool.play(Organfsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fCheckCounterHarpsichord8 == 1) { mSoundPool.play(Harpsichordfsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fCheckCounterDx78 == 1) { mSoundPool.play(Dx7fsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fCheckCounterCs808 == 1) { mSoundPool.play(Cs80fsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fCheckCounterGrandPiano9 == 1) { mSoundPool.play(GrandPianofsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fCheckCounterKeyboard9 == 1) { mSoundPool.play(Keyboardfsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fCheckCounterOrgan9 == 1) { mSoundPool.play(Organfsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fCheckCounterHarpsichord9 == 1) { mSoundPool.play(Harpsichordfsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fCheckCounterDx79 == 1) { mSoundPool.play(Dx7fsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fCheckCounterCs809 == 1) { mSoundPool.play(Cs80fsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fCheckCounterGrandPiano10 == 1) { mSoundPool.play(GrandPianofsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fCheckCounterKeyboard10 == 1) { mSoundPool.play(Keyboardfsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fCheckCounterOrgan10 == 1) { mSoundPool.play(Organfsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fCheckCounterHarpsichord10 == 1) { mSoundPool.play(Harpsichordfsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fCheckCounterDx710 == 1) { mSoundPool.play(Dx7fsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fCheckCounterCs8010 == 1) { mSoundPool.play(Cs80fsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fCheckCounterGrandPiano11 == 1) { mSoundPool.play(GrandPianofsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fCheckCounterKeyboard11 == 1) { mSoundPool.play(Keyboardfsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fCheckCounterOrgan11 == 1) { mSoundPool.play(Organfsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fCheckCounterHarpsichord11 == 1) { mSoundPool.play(Harpsichordfsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fCheckCounterDx711 == 1) { mSoundPool.play(Dx7fsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fCheckCounterCs8011 == 1) { mSoundPool.play(Cs80fsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fCheckCounterGrandPiano12 == 1) { mSoundPool.play(GrandPianofsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fCheckCounterKeyboard12 == 1) { mSoundPool.play(Keyboardfsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fCheckCounterOrgan12 == 1) { mSoundPool.play(Organfsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fCheckCounterHarpsichord12 == 1) { mSoundPool.play(Harpsichordfsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fCheckCounterDx712 == 1) { mSoundPool.play(Dx7fsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fCheckCounterCs8012 == 1) { mSoundPool.play(Cs80fsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fCheckCounterGrandPiano13 == 1) { mSoundPool.play(GrandPianofsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fCheckCounterKeyboard13 == 1) { mSoundPool.play(Keyboardfsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fCheckCounterOrgan13 == 1) { mSoundPool.play(Organfsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fCheckCounterHarpsichord13 == 1) { mSoundPool.play(Harpsichordfsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fCheckCounterDx713 == 1) { mSoundPool.play(Dx7fsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fCheckCounterCs8013 == 1) { mSoundPool.play(Cs80fsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fCheckCounterGrandPiano14 == 1) { mSoundPool.play(GrandPianofsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fCheckCounterKeyboard14 == 1) { mSoundPool.play(Keyboardfsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fCheckCounterOrgan14 == 1) { mSoundPool.play(Organfsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fCheckCounterHarpsichord14 == 1) { mSoundPool.play(Harpsichordfsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fCheckCounterDx714 == 1) { mSoundPool.play(Dx7fsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fCheckCounterCs8014 == 1) { mSoundPool.play(Cs80fsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][4] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fCheckCounterGrandPiano15 == 1) { mSoundPool.play(GrandPianofsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fCheckCounterKeyboard15 == 1) { mSoundPool.play(Keyboardfsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fCheckCounterOrgan15 == 1) { mSoundPool.play(Organfsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fCheckCounterHarpsichord15 == 1) { mSoundPool.play(Harpsichordfsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fCheckCounterDx715 == 1) { mSoundPool.play(Dx7fsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fCheckCounterCs8015 == 1) { mSoundPool.play(Cs80fsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 4000);
                    }

                    if (sequencerBoolean[0][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gCheckCounterGrandPiano == 1) { mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gCheckCounterKeyboard == 1) { mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gCheckCounterOrgan == 1) { mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gCheckCounterHarpsichord == 1) { mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gCheckCounterDx7 == 1) { mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gCheckCounterCs80 == 1) { mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gCheckCounterGrandPiano1 == 1) { mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gCheckCounterKeyboard1 == 1) { mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gCheckCounterOrgan1 == 1) { mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gCheckCounterHarpsichord1 == 1) { mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gCheckCounterDx71 == 1) { mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gCheckCounterCs801 == 1) { mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gCheckCounterGrandPiano2 == 1) { mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gCheckCounterKeyboard2 == 1) { mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gCheckCounterOrgan2 == 1) { mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gCheckCounterHarpsichord2 == 1) { mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gCheckCounterDx72 == 1) { mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gCheckCounterCs802 == 1) { mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gCheckCounterGrandPiano3 == 1) { mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gCheckCounterKeyboard3 == 1) { mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gCheckCounterOrgan3 == 1) { mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gCheckCounterHarpsichord3 == 1) { mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gCheckCounterDx73 == 1) { mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gCheckCounterCs803 == 1) { mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gCheckCounterGrandPiano4 == 1) { mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gCheckCounterKeyboard4 == 1) { mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gCheckCounterOrgan4 == 1) { mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gCheckCounterHarpsichord4 == 1) { mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gCheckCounterDx74 == 1) { mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gCheckCounterCs804 == 1) { mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gCheckCounterGrandPiano5 == 1) { mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gCheckCounterKeyboard5 == 1) { mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gCheckCounterOrgan5 == 1) { mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gCheckCounterHarpsichord5 == 1) { mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gCheckCounterDx75 == 1) { mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gCheckCounterCs805 == 1) { mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gCheckCounterGrandPiano6 == 1) { mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gCheckCounterKeyboard6 == 1) { mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gCheckCounterOrgan6 == 1) { mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gCheckCounterHarpsichord6 == 1) { mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gCheckCounterDx76 == 1) { mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gCheckCounterCs806 == 1) { mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gCheckCounterGrandPiano7 == 1) { mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gCheckCounterKeyboard7 == 1) { mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gCheckCounterOrgan7 == 1) { mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gCheckCounterHarpsichord7 == 1) { mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gCheckCounterDx77 == 1) { mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gCheckCounterCs807 == 1) { mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gCheckCounterGrandPiano8 == 1) { mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gCheckCounterKeyboard8 == 1) { mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gCheckCounterOrgan8 == 1) { mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gCheckCounterHarpsichord8 == 1) { mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gCheckCounterDx78 == 1) { mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gCheckCounterCs808 == 1) { mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gCheckCounterGrandPiano9 == 1) { mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gCheckCounterKeyboard9 == 1) { mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gCheckCounterOrgan9 == 1) { mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gCheckCounterHarpsichord9 == 1) { mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gCheckCounterDx79 == 1) { mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gCheckCounterCs809 == 1) { mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gCheckCounterGrandPiano10 == 1) { mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gCheckCounterKeyboard10 == 1) { mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gCheckCounterOrgan10 == 1) { mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gCheckCounterHarpsichord10 == 1) { mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gCheckCounterDx710 == 1) { mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gCheckCounterCs8010 == 1) { mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gCheckCounterGrandPiano11 == 1) { mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gCheckCounterKeyboard11 == 1) { mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gCheckCounterOrgan11 == 1) { mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gCheckCounterHarpsichord11 == 1) { mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gCheckCounterDx711 == 1) { mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gCheckCounterCs8011 == 1) { mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gCheckCounterGrandPiano12 == 1) { mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gCheckCounterKeyboard12 == 1) { mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gCheckCounterOrgan12 == 1) { mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gCheckCounterHarpsichord12 == 1) { mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gCheckCounterDx712 == 1) { mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gCheckCounterCs8012 == 1) { mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gCheckCounterGrandPiano13 == 1) { mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gCheckCounterKeyboard13 == 1) { mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gCheckCounterOrgan13 == 1) { mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gCheckCounterHarpsichord13 == 1) { mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gCheckCounterDx713 == 1) { mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gCheckCounterCs8013 == 1) { mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gCheckCounterGrandPiano14 == 1) { mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gCheckCounterKeyboard14 == 1) { mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gCheckCounterOrgan14 == 1) { mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gCheckCounterHarpsichord14 == 1) { mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gCheckCounterDx714 == 1) { mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gCheckCounterCs8014 == 1) { mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][5] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gCheckCounterGrandPiano15 == 1) { mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gCheckCounterKeyboard15 == 1) { mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gCheckCounterOrgan15 == 1) { mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gCheckCounterHarpsichord15 == 1) { mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gCheckCounterDx715 == 1) { mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gCheckCounterCs8015 == 1) { mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (aCheckCounterGrandPiano == 1) { mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (aCheckCounterKeyboard == 1) { mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (aCheckCounterOrgan == 1) { mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (aCheckCounterHarpsichord == 1) { mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (aCheckCounterDx7 == 1) { mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (aCheckCounterCs80 == 1) { mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (aCheckCounterGrandPiano1 == 1) { mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (aCheckCounterKeyboard1 == 1) { mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (aCheckCounterOrgan1 == 1) { mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (aCheckCounterHarpsichord1 == 1) { mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (aCheckCounterDx71 == 1) { mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (aCheckCounterCs801 == 1) { mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (aCheckCounterGrandPiano2 == 1) { mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (aCheckCounterKeyboard2 == 1) { mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (aCheckCounterOrgan2 == 1) { mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (aCheckCounterHarpsichord2 == 1) { mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (aCheckCounterDx72 == 1) { mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (aCheckCounterCs802 == 1) { mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (aCheckCounterGrandPiano3 == 1) { mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (aCheckCounterKeyboard3 == 1) { mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (aCheckCounterOrgan3 == 1) { mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (aCheckCounterHarpsichord3 == 1) { mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (aCheckCounterDx73 == 1) { mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (aCheckCounterCs803 == 1) { mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (aCheckCounterGrandPiano4 == 1) { mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (aCheckCounterKeyboard4 == 1) { mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (aCheckCounterOrgan4 == 1) { mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (aCheckCounterHarpsichord4 == 1) { mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (aCheckCounterDx74 == 1) { mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (aCheckCounterCs804 == 1) { mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (aCheckCounterGrandPiano5 == 1) { mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (aCheckCounterKeyboard5 == 1) { mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (aCheckCounterOrgan5 == 1) { mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (aCheckCounterHarpsichord5 == 1) { mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (aCheckCounterDx75 == 1) { mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (aCheckCounterCs805 == 1) { mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (aCheckCounterGrandPiano6 == 1) { mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (aCheckCounterKeyboard6 == 1) { mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (aCheckCounterOrgan6 == 1) { mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (aCheckCounterHarpsichord6 == 1) { mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (aCheckCounterDx76 == 1) { mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (aCheckCounterCs806 == 1) { mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (aCheckCounterGrandPiano7 == 1) { mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (aCheckCounterKeyboard7 == 1) { mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (aCheckCounterOrgan7 == 1) { mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (aCheckCounterHarpsichord7 == 1) { mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (aCheckCounterDx77 == 1) { mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (aCheckCounterCs807 == 1) { mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (aCheckCounterGrandPiano8 == 1) { mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (aCheckCounterKeyboard8 == 1) { mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (aCheckCounterOrgan8 == 1) { mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (aCheckCounterHarpsichord8 == 1) { mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (aCheckCounterDx78 == 1) { mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (aCheckCounterCs808 == 1) { mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (aCheckCounterGrandPiano9 == 1) { mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (aCheckCounterKeyboard9 == 1) { mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (aCheckCounterOrgan9 == 1) { mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (aCheckCounterHarpsichord9 == 1) { mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (aCheckCounterDx79 == 1) { mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (aCheckCounterCs809 == 1) { mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (aCheckCounterGrandPiano10 == 1) { mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (aCheckCounterKeyboard10 == 1) { mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (aCheckCounterOrgan10 == 1) { mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (aCheckCounterHarpsichord10 == 1) { mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (aCheckCounterDx710 == 1) { mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (aCheckCounterCs8010 == 1) { mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (aCheckCounterGrandPiano11 == 1) { mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (aCheckCounterKeyboard11 == 1) { mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (aCheckCounterOrgan11 == 1) { mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (aCheckCounterHarpsichord11 == 1) { mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (aCheckCounterDx711 == 1) { mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (aCheckCounterCs8011 == 1) { mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (aCheckCounterGrandPiano12 == 1) { mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (aCheckCounterKeyboard12 == 1) { mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (aCheckCounterOrgan12 == 1) { mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (aCheckCounterHarpsichord12 == 1) { mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (aCheckCounterDx712 == 1) { mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (aCheckCounterCs8012 == 1) { mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (aCheckCounterGrandPiano13 == 1) { mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (aCheckCounterKeyboard13 == 1) { mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (aCheckCounterOrgan13 == 1) { mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (aCheckCounterHarpsichord13 == 1) { mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (aCheckCounterDx713 == 1) { mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (aCheckCounterCs8013 == 1) { mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (aCheckCounterGrandPiano14 == 1) { mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (aCheckCounterKeyboard14 == 1) { mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (aCheckCounterOrgan14 == 1) { mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (aCheckCounterHarpsichord14 == 1) { mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (aCheckCounterDx714 == 1) { mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (aCheckCounterCs8014 == 1) { mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][6] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (aCheckCounterGrandPiano15 == 1) { mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (aCheckCounterKeyboard15 == 1) { mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (aCheckCounterOrgan15 == 1) { mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (aCheckCounterHarpsichord15 == 1) { mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (aCheckCounterDx715 == 1) { mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (aCheckCounterCs8015 == 1) { mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (bCheckCounterGrandPiano == 1) { mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (bCheckCounterKeyboard == 1) { mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (bCheckCounterOrgan == 1) { mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (bCheckCounterHarpsichord == 1) { mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (bCheckCounterDx7 == 1) { mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (bCheckCounterCs80 == 1) { mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (bCheckCounterGrandPiano1 == 1) { mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (bCheckCounterKeyboard1 == 1) { mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (bCheckCounterOrgan1 == 1) { mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (bCheckCounterHarpsichord1 == 1) { mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (bCheckCounterDx71 == 1) { mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (bCheckCounterCs801 == 1) { mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (bCheckCounterGrandPiano2 == 1) { mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (bCheckCounterKeyboard2 == 1) { mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (bCheckCounterOrgan2 == 1) { mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (bCheckCounterHarpsichord2 == 1) { mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (bCheckCounterDx72 == 1) { mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (bCheckCounterCs802 == 1) { mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (bCheckCounterGrandPiano3 == 1) { mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (bCheckCounterKeyboard3 == 1) { mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (bCheckCounterOrgan3 == 1) { mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (bCheckCounterHarpsichord3 == 1) { mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (bCheckCounterDx73 == 1) { mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (bCheckCounterCs803 == 1) { mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (bCheckCounterGrandPiano4 == 1) { mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (bCheckCounterKeyboard4 == 1) { mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (bCheckCounterOrgan4 == 1) { mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (bCheckCounterHarpsichord4 == 1) { mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (bCheckCounterDx74 == 1) { mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (bCheckCounterCs804 == 1) { mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (bCheckCounterGrandPiano5 == 1) { mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (bCheckCounterKeyboard5 == 1) { mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (bCheckCounterOrgan5 == 1) { mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (bCheckCounterHarpsichord5 == 1) { mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (bCheckCounterDx75 == 1) { mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (bCheckCounterCs805 == 1) { mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (bCheckCounterGrandPiano6 == 1) { mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (bCheckCounterKeyboard6 == 1) { mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (bCheckCounterOrgan6 == 1) { mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (bCheckCounterHarpsichord6 == 1) { mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (bCheckCounterDx76 == 1) { mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (bCheckCounterCs806 == 1) { mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (bCheckCounterGrandPiano7 == 1) { mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (bCheckCounterKeyboard7 == 1) { mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (bCheckCounterOrgan7 == 1) { mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (bCheckCounterHarpsichord7 == 1) { mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (bCheckCounterDx77 == 1) { mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (bCheckCounterCs807 == 1) { mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (bCheckCounterGrandPiano8 == 1) { mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (bCheckCounterKeyboard8 == 1) { mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (bCheckCounterOrgan8 == 1) { mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (bCheckCounterHarpsichord8 == 1) { mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (bCheckCounterDx78 == 1) { mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (bCheckCounterCs808 == 1) { mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (bCheckCounterGrandPiano9 == 1) { mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (bCheckCounterKeyboard9 == 1) { mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (bCheckCounterOrgan9 == 1) { mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (bCheckCounterHarpsichord9 == 1) { mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (bCheckCounterDx79 == 1) { mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (bCheckCounterCs809 == 1) { mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (bCheckCounterGrandPiano10 == 1) { mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (bCheckCounterKeyboard10 == 1) { mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (bCheckCounterOrgan10 == 1) { mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (bCheckCounterHarpsichord10 == 1) { mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (bCheckCounterDx710 == 1) { mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (bCheckCounterCs8010 == 1) { mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (bCheckCounterGrandPiano11 == 1) { mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (bCheckCounterKeyboard11 == 1) { mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (bCheckCounterOrgan11 == 1) { mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (bCheckCounterHarpsichord11 == 1) { mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (bCheckCounterDx711 == 1) { mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (bCheckCounterCs8011 == 1) { mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (bCheckCounterGrandPiano12 == 1) { mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (bCheckCounterKeyboard12 == 1) { mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (bCheckCounterOrgan12 == 1) { mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (bCheckCounterHarpsichord12 == 1) { mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (bCheckCounterDx712 == 1) { mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (bCheckCounterCs8012 == 1) { mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (bCheckCounterGrandPiano13 == 1) { mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (bCheckCounterKeyboard13 == 1) { mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (bCheckCounterOrgan13 == 1) { mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (bCheckCounterHarpsichord13 == 1) { mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (bCheckCounterDx713 == 1) { mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (bCheckCounterCs8013 == 1) { mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (bCheckCounterGrandPiano14 == 1) { mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (bCheckCounterKeyboard14 == 1) { mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (bCheckCounterOrgan14 == 1) { mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (bCheckCounterHarpsichord14 == 1) { mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (bCheckCounterDx714 == 1) { mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (bCheckCounterCs8014 == 1) { mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][7] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (bCheckCounterGrandPiano15 == 1) { mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (bCheckCounterKeyboard15 == 1) { mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (bCheckCounterOrgan15 == 1) { mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (bCheckCounterHarpsichord15 == 1) { mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (bCheckCounterDx715 == 1) { mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (bCheckCounterCs8015 == 1) { mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (c2CheckCounterGrandPiano == 1) { mSoundPool.play(GrandPianoccsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (c2CheckCounterKeyboard == 1) { mSoundPool.play(Keyboardccsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (c2CheckCounterOrgan == 1) { mSoundPool.play(Organccsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (c2CheckCounterHarpsichord == 1) { mSoundPool.play(Harpsichordccsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (c2CheckCounterDx7 == 1) { mSoundPool.play(Dx7ccsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (c2CheckCounterCs80 == 1) { mSoundPool.play(Cs80ccsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (c2CheckCounterGrandPiano1 == 1) { mSoundPool.play(GrandPianoccsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (c2CheckCounterKeyboard1 == 1) { mSoundPool.play(Keyboardccsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (c2CheckCounterOrgan1 == 1) { mSoundPool.play(Organccsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (c2CheckCounterHarpsichord1 == 1) { mSoundPool.play(Harpsichordccsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (c2CheckCounterDx71 == 1) { mSoundPool.play(Dx7ccsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (c2CheckCounterCs801 == 1) { mSoundPool.play(Cs80ccsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (c2CheckCounterGrandPiano2 == 1) { mSoundPool.play(GrandPianoccsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (c2CheckCounterKeyboard2 == 1) { mSoundPool.play(Keyboardccsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (c2CheckCounterOrgan2 == 1) { mSoundPool.play(Organccsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (c2CheckCounterHarpsichord2 == 1) { mSoundPool.play(Harpsichordccsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (c2CheckCounterDx72 == 1) { mSoundPool.play(Dx7ccsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (c2CheckCounterCs802 == 1) { mSoundPool.play(Cs80ccsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (c2CheckCounterGrandPiano3 == 1) { mSoundPool.play(GrandPianoccsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (c2CheckCounterKeyboard3 == 1) { mSoundPool.play(Keyboardccsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (c2CheckCounterOrgan3 == 1) { mSoundPool.play(Organccsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (c2CheckCounterHarpsichord3 == 1) { mSoundPool.play(Harpsichordccsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (c2CheckCounterDx73 == 1) { mSoundPool.play(Dx7ccsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (c2CheckCounterCs803 == 1) { mSoundPool.play(Cs80ccsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (c2CheckCounterGrandPiano4 == 1) { mSoundPool.play(GrandPianoccsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (c2CheckCounterKeyboard4 == 1) { mSoundPool.play(Keyboardccsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (c2CheckCounterOrgan4 == 1) { mSoundPool.play(Organccsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (c2CheckCounterHarpsichord4 == 1) { mSoundPool.play(Harpsichordccsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (c2CheckCounterDx74 == 1) { mSoundPool.play(Dx7ccsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (c2CheckCounterCs804 == 1) { mSoundPool.play(Cs80ccsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (c2CheckCounterGrandPiano5 == 1) { mSoundPool.play(GrandPianoccsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (c2CheckCounterKeyboard5 == 1) { mSoundPool.play(Keyboardccsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (c2CheckCounterOrgan5 == 1) { mSoundPool.play(Organccsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (c2CheckCounterHarpsichord5 == 1) { mSoundPool.play(Harpsichordccsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (c2CheckCounterDx75 == 1) { mSoundPool.play(Dx7ccsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (c2CheckCounterCs805 == 1) { mSoundPool.play(Cs80ccsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (c2CheckCounterGrandPiano6 == 1) { mSoundPool.play(GrandPianoccsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (c2CheckCounterKeyboard6 == 1) { mSoundPool.play(Keyboardccsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (c2CheckCounterOrgan6 == 1) { mSoundPool.play(Organccsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (c2CheckCounterHarpsichord6 == 1) { mSoundPool.play(Harpsichordccsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (c2CheckCounterDx76 == 1) { mSoundPool.play(Dx7ccsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (c2CheckCounterCs806 == 1) { mSoundPool.play(Cs80ccsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (c2CheckCounterGrandPiano7 == 1) { mSoundPool.play(GrandPianoccsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (c2CheckCounterKeyboard7 == 1) { mSoundPool.play(Keyboardccsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (c2CheckCounterOrgan7 == 1) { mSoundPool.play(Organccsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (c2CheckCounterHarpsichord7 == 1) { mSoundPool.play(Harpsichordccsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (c2CheckCounterDx77 == 1) { mSoundPool.play(Dx7ccsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (c2CheckCounterCs807 == 1) { mSoundPool.play(Cs80ccsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (c2CheckCounterGrandPiano8 == 1) { mSoundPool.play(GrandPianoccsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (c2CheckCounterKeyboard8 == 1) { mSoundPool.play(Keyboardccsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (c2CheckCounterOrgan8 == 1) { mSoundPool.play(Organccsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (c2CheckCounterHarpsichord8 == 1) { mSoundPool.play(Harpsichordccsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (c2CheckCounterDx78 == 1) { mSoundPool.play(Dx7ccsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (c2CheckCounterCs808 == 1) { mSoundPool.play(Cs80ccsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (c2CheckCounterGrandPiano9 == 1) { mSoundPool.play(GrandPianoccsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (c2CheckCounterKeyboard9 == 1) { mSoundPool.play(Keyboardccsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (c2CheckCounterOrgan9 == 1) { mSoundPool.play(Organccsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (c2CheckCounterHarpsichord9 == 1) { mSoundPool.play(Harpsichordccsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (c2CheckCounterDx79 == 1) { mSoundPool.play(Dx7ccsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (c2CheckCounterCs809 == 1) { mSoundPool.play(Cs80ccsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (c2CheckCounterGrandPiano10 == 1) { mSoundPool.play(GrandPianoccsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (c2CheckCounterKeyboard10 == 1) { mSoundPool.play(Keyboardccsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (c2CheckCounterOrgan10 == 1) { mSoundPool.play(Organccsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (c2CheckCounterHarpsichord10 == 1) { mSoundPool.play(Harpsichordccsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (c2CheckCounterDx710 == 1) { mSoundPool.play(Dx7ccsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (c2CheckCounterCs8010 == 1) { mSoundPool.play(Cs80ccsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (c2CheckCounterGrandPiano11 == 1) { mSoundPool.play(GrandPianoccsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (c2CheckCounterKeyboard11 == 1) { mSoundPool.play(Keyboardccsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (c2CheckCounterOrgan11 == 1) { mSoundPool.play(Organccsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (c2CheckCounterHarpsichord11 == 1) { mSoundPool.play(Harpsichordccsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (c2CheckCounterDx711 == 1) { mSoundPool.play(Dx7ccsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (c2CheckCounterCs8011 == 1) { mSoundPool.play(Cs80ccsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (c2CheckCounterGrandPiano12 == 1) { mSoundPool.play(GrandPianoccsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (c2CheckCounterKeyboard12 == 1) { mSoundPool.play(Keyboardccsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (c2CheckCounterOrgan12 == 1) { mSoundPool.play(Organccsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (c2CheckCounterHarpsichord12 == 1) { mSoundPool.play(Harpsichordccsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (c2CheckCounterDx712 == 1) { mSoundPool.play(Dx7ccsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (c2CheckCounterCs8012 == 1) { mSoundPool.play(Cs80ccsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (c2CheckCounterGrandPiano13 == 1) { mSoundPool.play(GrandPianoccsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (c2CheckCounterKeyboard13 == 1) { mSoundPool.play(Keyboardccsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (c2CheckCounterOrgan13 == 1) { mSoundPool.play(Organccsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (c2CheckCounterHarpsichord13 == 1) { mSoundPool.play(Harpsichordccsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (c2CheckCounterDx713 == 1) { mSoundPool.play(Dx7ccsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (c2CheckCounterCs8013 == 1) { mSoundPool.play(Cs80ccsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (c2CheckCounterGrandPiano14 == 1) { mSoundPool.play(GrandPianoccsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (c2CheckCounterKeyboard14 == 1) { mSoundPool.play(Keyboardccsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (c2CheckCounterOrgan14 == 1) { mSoundPool.play(Organccsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (c2CheckCounterHarpsichord14 == 1) { mSoundPool.play(Harpsichordccsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (c2CheckCounterDx714 == 1) { mSoundPool.play(Dx7ccsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (c2CheckCounterCs8014 == 1) { mSoundPool.play(Cs80ccsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][8] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (c2CheckCounterGrandPiano15 == 1) { mSoundPool.play(GrandPianoccsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (c2CheckCounterKeyboard15 == 1) { mSoundPool.play(Keyboardccsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (c2CheckCounterOrgan15 == 1) { mSoundPool.play(Organccsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (c2CheckCounterHarpsichord15 == 1) { mSoundPool.play(Harpsichordccsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (c2CheckCounterDx715 == 1) { mSoundPool.play(Dx7ccsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (c2CheckCounterCs8015 == 1) { mSoundPool.play(Cs80ccsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (csCheckCounterGrandPiano == 1) { mSoundPool.play(GrandPianocssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (csCheckCounterKeyboard == 1) { mSoundPool.play(Keyboardcssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (csCheckCounterOrgan == 1) { mSoundPool.play(Organcssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (csCheckCounterHarpsichord == 1) { mSoundPool.play(Harpsichordcssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (csCheckCounterDx7 == 1) { mSoundPool.play(Dx7cssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (csCheckCounterCs80 == 1) { mSoundPool.play(Cs80cssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (csCheckCounterGrandPiano1 == 1) { mSoundPool.play(GrandPianocssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (csCheckCounterKeyboard1 == 1) { mSoundPool.play(Keyboardcssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (csCheckCounterOrgan1 == 1) { mSoundPool.play(Organcssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (csCheckCounterHarpsichord1 == 1) { mSoundPool.play(Harpsichordcssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (csCheckCounterDx71 == 1) { mSoundPool.play(Dx7cssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (csCheckCounterCs801 == 1) { mSoundPool.play(Cs80cssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (csCheckCounterGrandPiano2 == 1) { mSoundPool.play(GrandPianocssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (csCheckCounterKeyboard2 == 1) { mSoundPool.play(Keyboardcssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (csCheckCounterOrgan2 == 1) { mSoundPool.play(Organcssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (csCheckCounterHarpsichord2 == 1) { mSoundPool.play(Harpsichordcssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (csCheckCounterDx72 == 1) { mSoundPool.play(Dx7cssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (csCheckCounterCs802 == 1) { mSoundPool.play(Cs80cssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (csCheckCounterGrandPiano3 == 1) { mSoundPool.play(GrandPianocssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (csCheckCounterKeyboard3 == 1) { mSoundPool.play(Keyboardcssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (csCheckCounterOrgan3 == 1) { mSoundPool.play(Organcssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (csCheckCounterHarpsichord3 == 1) { mSoundPool.play(Harpsichordcssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (csCheckCounterDx73 == 1) { mSoundPool.play(Dx7cssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (csCheckCounterCs803 == 1) { mSoundPool.play(Cs80cssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (csCheckCounterGrandPiano4 == 1) { mSoundPool.play(GrandPianocssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (csCheckCounterKeyboard4 == 1) { mSoundPool.play(Keyboardcssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (csCheckCounterOrgan4 == 1) { mSoundPool.play(Organcssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (csCheckCounterHarpsichord4 == 1) { mSoundPool.play(Harpsichordcssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (csCheckCounterDx74 == 1) { mSoundPool.play(Dx7cssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (csCheckCounterCs804 == 1) { mSoundPool.play(Cs80cssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (csCheckCounterGrandPiano5 == 1) { mSoundPool.play(GrandPianocssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (csCheckCounterKeyboard5 == 1) { mSoundPool.play(Keyboardcssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (csCheckCounterOrgan5 == 1) { mSoundPool.play(Organcssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (csCheckCounterHarpsichord5 == 1) { mSoundPool.play(Harpsichordcssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (csCheckCounterDx75 == 1) { mSoundPool.play(Dx7cssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (csCheckCounterCs805 == 1) { mSoundPool.play(Cs80cssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (csCheckCounterGrandPiano6 == 1) { mSoundPool.play(GrandPianocssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (csCheckCounterKeyboard6 == 1) { mSoundPool.play(Keyboardcssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (csCheckCounterOrgan6 == 1) { mSoundPool.play(Organcssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (csCheckCounterHarpsichord6 == 1) { mSoundPool.play(Harpsichordcssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (csCheckCounterDx76 == 1) { mSoundPool.play(Dx7cssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (csCheckCounterCs806 == 1) { mSoundPool.play(Cs80cssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (csCheckCounterGrandPiano7 == 1) { mSoundPool.play(GrandPianocssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (csCheckCounterKeyboard7 == 1) { mSoundPool.play(Keyboardcssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (csCheckCounterOrgan7 == 1) { mSoundPool.play(Organcssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (csCheckCounterHarpsichord7 == 1) { mSoundPool.play(Harpsichordcssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (csCheckCounterDx77 == 1) { mSoundPool.play(Dx7cssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (csCheckCounterCs807 == 1) { mSoundPool.play(Cs80cssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (csCheckCounterGrandPiano8 == 1) { mSoundPool.play(GrandPianocssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (csCheckCounterKeyboard8 == 1) { mSoundPool.play(Keyboardcssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (csCheckCounterOrgan8 == 1) { mSoundPool.play(Organcssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (csCheckCounterHarpsichord8 == 1) { mSoundPool.play(Harpsichordcssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (csCheckCounterDx78 == 1) { mSoundPool.play(Dx7cssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (csCheckCounterCs808 == 1) { mSoundPool.play(Cs80cssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (csCheckCounterGrandPiano9 == 1) { mSoundPool.play(GrandPianocssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (csCheckCounterKeyboard9 == 1) { mSoundPool.play(Keyboardcssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (csCheckCounterOrgan9 == 1) { mSoundPool.play(Organcssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (csCheckCounterHarpsichord9 == 1) { mSoundPool.play(Harpsichordcssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (csCheckCounterDx79 == 1) { mSoundPool.play(Dx7cssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (csCheckCounterCs809 == 1) { mSoundPool.play(Cs80cssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (csCheckCounterGrandPiano10 == 1) { mSoundPool.play(GrandPianocssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (csCheckCounterKeyboard10 == 1) { mSoundPool.play(Keyboardcssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (csCheckCounterOrgan10 == 1) { mSoundPool.play(Organcssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (csCheckCounterHarpsichord10 == 1) { mSoundPool.play(Harpsichordcssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (csCheckCounterDx710 == 1) { mSoundPool.play(Dx7cssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (csCheckCounterCs8010 == 1) { mSoundPool.play(Cs80cssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (csCheckCounterGrandPiano11 == 1) { mSoundPool.play(GrandPianocssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (csCheckCounterKeyboard11 == 1) { mSoundPool.play(Keyboardcssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (csCheckCounterOrgan11 == 1) { mSoundPool.play(Organcssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (csCheckCounterHarpsichord11 == 1) { mSoundPool.play(Harpsichordcssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (csCheckCounterDx711 == 1) { mSoundPool.play(Dx7cssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (csCheckCounterCs8011 == 1) { mSoundPool.play(Cs80cssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (csCheckCounterGrandPiano12 == 1) { mSoundPool.play(GrandPianocssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (csCheckCounterKeyboard12 == 1) { mSoundPool.play(Keyboardcssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (csCheckCounterOrgan12 == 1) { mSoundPool.play(Organcssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (csCheckCounterHarpsichord12 == 1) { mSoundPool.play(Harpsichordcssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (csCheckCounterDx712 == 1) { mSoundPool.play(Dx7cssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (csCheckCounterCs8012 == 1) { mSoundPool.play(Cs80cssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (csCheckCounterGrandPiano13 == 1) { mSoundPool.play(GrandPianocssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (csCheckCounterKeyboard13 == 1) { mSoundPool.play(Keyboardcssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (csCheckCounterOrgan13 == 1) { mSoundPool.play(Organcssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (csCheckCounterHarpsichord13 == 1) { mSoundPool.play(Harpsichordcssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (csCheckCounterDx713 == 1) { mSoundPool.play(Dx7cssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (csCheckCounterCs8013 == 1) { mSoundPool.play(Cs80cssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (csCheckCounterGrandPiano14 == 1) { mSoundPool.play(GrandPianocssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (csCheckCounterKeyboard14 == 1) { mSoundPool.play(Keyboardcssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (csCheckCounterOrgan14 == 1) { mSoundPool.play(Organcssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (csCheckCounterHarpsichord14 == 1) { mSoundPool.play(Harpsichordcssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (csCheckCounterDx714 == 1) { mSoundPool.play(Dx7cssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (csCheckCounterCs8014 == 1) { mSoundPool.play(Cs80cssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][9] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (csCheckCounterGrandPiano15 == 1) { mSoundPool.play(GrandPianocssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (csCheckCounterKeyboard15 == 1) { mSoundPool.play(Keyboardcssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (csCheckCounterOrgan15 == 1) { mSoundPool.play(Organcssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (csCheckCounterHarpsichord15 == 1) { mSoundPool.play(Harpsichordcssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (csCheckCounterDx715 == 1) { mSoundPool.play(Dx7cssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (csCheckCounterCs8015 == 1) { mSoundPool.play(Cs80cssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dsCheckCounterGrandPiano == 1) { mSoundPool.play(GrandPianodssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dsCheckCounterKeyboard == 1) { mSoundPool.play(Keyboarddssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dsCheckCounterOrgan == 1) { mSoundPool.play(Organdssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dsCheckCounterHarpsichord == 1) { mSoundPool.play(Harpsichorddssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dsCheckCounterDx7 == 1) { mSoundPool.play(Dx7dssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dsCheckCounterCs80 == 1) { mSoundPool.play(Cs80dssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dsCheckCounterGrandPiano1 == 1) { mSoundPool.play(GrandPianodssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dsCheckCounterKeyboard1 == 1) { mSoundPool.play(Keyboarddssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dsCheckCounterOrgan1 == 1) { mSoundPool.play(Organdssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dsCheckCounterHarpsichord1 == 1) { mSoundPool.play(Harpsichorddssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dsCheckCounterDx71 == 1) { mSoundPool.play(Dx7dssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dsCheckCounterCs801 == 1) { mSoundPool.play(Cs80dssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dsCheckCounterGrandPiano2 == 1) { mSoundPool.play(GrandPianodssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dsCheckCounterKeyboard2 == 1) { mSoundPool.play(Keyboarddssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dsCheckCounterOrgan2 == 1) { mSoundPool.play(Organdssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dsCheckCounterHarpsichord2 == 1) { mSoundPool.play(Harpsichorddssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dsCheckCounterDx72 == 1) { mSoundPool.play(Dx7dssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dsCheckCounterCs802 == 1) { mSoundPool.play(Cs80dssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dsCheckCounterGrandPiano3 == 1) { mSoundPool.play(GrandPianodssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dsCheckCounterKeyboard3 == 1) { mSoundPool.play(Keyboarddssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dsCheckCounterOrgan3 == 1) { mSoundPool.play(Organdssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dsCheckCounterHarpsichord3 == 1) { mSoundPool.play(Harpsichorddssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dsCheckCounterDx73 == 1) { mSoundPool.play(Dx7dssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dsCheckCounterCs803 == 1) { mSoundPool.play(Cs80dssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dsCheckCounterGrandPiano4 == 1) { mSoundPool.play(GrandPianodssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dsCheckCounterKeyboard4 == 1) { mSoundPool.play(Keyboarddssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dsCheckCounterOrgan4 == 1) { mSoundPool.play(Organdssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dsCheckCounterHarpsichord4 == 1) { mSoundPool.play(Harpsichorddssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dsCheckCounterDx74 == 1) { mSoundPool.play(Dx7dssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dsCheckCounterCs804 == 1) { mSoundPool.play(Cs80dssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dsCheckCounterGrandPiano5 == 1) { mSoundPool.play(GrandPianodssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dsCheckCounterKeyboard5 == 1) { mSoundPool.play(Keyboarddssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dsCheckCounterOrgan5 == 1) { mSoundPool.play(Organdssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dsCheckCounterHarpsichord5 == 1) { mSoundPool.play(Harpsichorddssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dsCheckCounterDx75 == 1) { mSoundPool.play(Dx7dssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dsCheckCounterCs805 == 1) { mSoundPool.play(Cs80dssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dsCheckCounterGrandPiano6 == 1) { mSoundPool.play(GrandPianodssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dsCheckCounterKeyboard6 == 1) { mSoundPool.play(Keyboarddssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dsCheckCounterOrgan6 == 1) { mSoundPool.play(Organdssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dsCheckCounterHarpsichord6 == 1) { mSoundPool.play(Harpsichorddssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dsCheckCounterDx76 == 1) { mSoundPool.play(Dx7dssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dsCheckCounterCs806 == 1) { mSoundPool.play(Cs80dssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dsCheckCounterGrandPiano7 == 1) { mSoundPool.play(GrandPianodssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dsCheckCounterKeyboard7 == 1) { mSoundPool.play(Keyboarddssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dsCheckCounterOrgan7 == 1) { mSoundPool.play(Organdssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dsCheckCounterHarpsichord7 == 1) { mSoundPool.play(Harpsichorddssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dsCheckCounterDx77 == 1) { mSoundPool.play(Dx7dssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dsCheckCounterCs807 == 1) { mSoundPool.play(Cs80dssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dsCheckCounterGrandPiano8 == 1) { mSoundPool.play(GrandPianodssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dsCheckCounterKeyboard8 == 1) { mSoundPool.play(Keyboarddssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dsCheckCounterOrgan8 == 1) { mSoundPool.play(Organdssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dsCheckCounterHarpsichord8 == 1) { mSoundPool.play(Harpsichorddssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dsCheckCounterDx78 == 1) { mSoundPool.play(Dx7dssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dsCheckCounterCs808 == 1) { mSoundPool.play(Cs80dssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dsCheckCounterGrandPiano9 == 1) { mSoundPool.play(GrandPianodssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dsCheckCounterKeyboard9 == 1) { mSoundPool.play(Keyboarddssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dsCheckCounterOrgan9 == 1) { mSoundPool.play(Organdssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dsCheckCounterHarpsichord9 == 1) { mSoundPool.play(Harpsichorddssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dsCheckCounterDx79 == 1) { mSoundPool.play(Dx7dssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dsCheckCounterCs809 == 1) { mSoundPool.play(Cs80dssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dsCheckCounterGrandPiano10 == 1) { mSoundPool.play(GrandPianodssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dsCheckCounterKeyboard10 == 1) { mSoundPool.play(Keyboarddssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dsCheckCounterOrgan10 == 1) { mSoundPool.play(Organdssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dsCheckCounterHarpsichord10 == 1) { mSoundPool.play(Harpsichorddssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dsCheckCounterDx710 == 1) { mSoundPool.play(Dx7dssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dsCheckCounterCs8010 == 1) { mSoundPool.play(Cs80dssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dsCheckCounterGrandPiano11 == 1) { mSoundPool.play(GrandPianodssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dsCheckCounterKeyboard11 == 1) { mSoundPool.play(Keyboarddssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dsCheckCounterOrgan11 == 1) { mSoundPool.play(Organdssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dsCheckCounterHarpsichord11 == 1) { mSoundPool.play(Harpsichorddssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dsCheckCounterDx711 == 1) { mSoundPool.play(Dx7dssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dsCheckCounterCs8011 == 1) { mSoundPool.play(Cs80dssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dsCheckCounterGrandPiano12 == 1) { mSoundPool.play(GrandPianodssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dsCheckCounterKeyboard12 == 1) { mSoundPool.play(Keyboarddssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dsCheckCounterOrgan12 == 1) { mSoundPool.play(Organdssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dsCheckCounterHarpsichord12 == 1) { mSoundPool.play(Harpsichorddssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dsCheckCounterDx712 == 1) { mSoundPool.play(Dx7dssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dsCheckCounterCs8012 == 1) { mSoundPool.play(Cs80dssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dsCheckCounterGrandPiano13 == 1) { mSoundPool.play(GrandPianodssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dsCheckCounterKeyboard13 == 1) { mSoundPool.play(Keyboarddssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dsCheckCounterOrgan13 == 1) { mSoundPool.play(Organdssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dsCheckCounterHarpsichord13 == 1) { mSoundPool.play(Harpsichorddssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dsCheckCounterDx713 == 1) { mSoundPool.play(Dx7dssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dsCheckCounterCs8013 == 1) { mSoundPool.play(Cs80dssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dsCheckCounterGrandPiano14 == 1) { mSoundPool.play(GrandPianodssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dsCheckCounterKeyboard14 == 1) { mSoundPool.play(Keyboarddssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dsCheckCounterOrgan14 == 1) { mSoundPool.play(Organdssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dsCheckCounterHarpsichord14 == 1) { mSoundPool.play(Harpsichorddssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dsCheckCounterDx714 == 1) { mSoundPool.play(Dx7dssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dsCheckCounterCs8014 == 1) { mSoundPool.play(Cs80dssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][10] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (dsCheckCounterGrandPiano15 == 1) { mSoundPool.play(GrandPianodssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (dsCheckCounterKeyboard15 == 1) { mSoundPool.play(Keyboarddssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (dsCheckCounterOrgan15 == 1) { mSoundPool.play(Organdssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (dsCheckCounterHarpsichord15 == 1) { mSoundPool.play(Harpsichorddssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (dsCheckCounterDx715 == 1) { mSoundPool.play(Dx7dssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (dsCheckCounterCs8015 == 1) { mSoundPool.play(Cs80dssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fsCheckCounterGrandPiano == 1) { mSoundPool.play(GrandPianofssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fsCheckCounterKeyboard == 1) { mSoundPool.play(Keyboardfssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fsCheckCounterOrgan == 1) { mSoundPool.play(Organfssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fsCheckCounterHarpsichord == 1) { mSoundPool.play(Harpsichordfssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fsCheckCounterDx7 == 1) { mSoundPool.play(Dx7fssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fsCheckCounterCs80 == 1) { mSoundPool.play(Cs80fssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fsCheckCounterGrandPiano1 == 1) { mSoundPool.play(GrandPianofssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fsCheckCounterKeyboard1 == 1) { mSoundPool.play(Keyboardfssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fsCheckCounterOrgan1 == 1) { mSoundPool.play(Organfssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fsCheckCounterHarpsichord1 == 1) { mSoundPool.play(Harpsichordfssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fsCheckCounterDx71 == 1) { mSoundPool.play(Dx7fssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fsCheckCounterCs801 == 1) { mSoundPool.play(Cs80fssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fsCheckCounterGrandPiano2 == 1) { mSoundPool.play(GrandPianofssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fsCheckCounterKeyboard2 == 1) { mSoundPool.play(Keyboardfssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fsCheckCounterOrgan2 == 1) { mSoundPool.play(Organfssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fsCheckCounterHarpsichord2 == 1) { mSoundPool.play(Harpsichordfssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fsCheckCounterDx72 == 1) { mSoundPool.play(Dx7fssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fsCheckCounterCs802 == 1) { mSoundPool.play(Cs80fssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fsCheckCounterGrandPiano3 == 1) { mSoundPool.play(GrandPianofssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fsCheckCounterKeyboard3 == 1) { mSoundPool.play(Keyboardfssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fsCheckCounterOrgan3 == 1) { mSoundPool.play(Organfssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fsCheckCounterHarpsichord3 == 1) { mSoundPool.play(Harpsichordfssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fsCheckCounterDx73 == 1) { mSoundPool.play(Dx7fssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fsCheckCounterCs803 == 1) { mSoundPool.play(Cs80fssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fsCheckCounterGrandPiano4 == 1) { mSoundPool.play(GrandPianofssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fsCheckCounterKeyboard4 == 1) { mSoundPool.play(Keyboardfssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fsCheckCounterOrgan4 == 1) { mSoundPool.play(Organfssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fsCheckCounterHarpsichord4 == 1) { mSoundPool.play(Harpsichordfssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fsCheckCounterDx74 == 1) { mSoundPool.play(Dx7fssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fsCheckCounterCs804 == 1) { mSoundPool.play(Cs80fssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fsCheckCounterGrandPiano5 == 1) { mSoundPool.play(GrandPianofssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fsCheckCounterKeyboard5 == 1) { mSoundPool.play(Keyboardfssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fsCheckCounterOrgan5 == 1) { mSoundPool.play(Organfssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fsCheckCounterHarpsichord5 == 1) { mSoundPool.play(Harpsichordfssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fsCheckCounterDx75 == 1) { mSoundPool.play(Dx7fssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fsCheckCounterCs805 == 1) { mSoundPool.play(Cs80fssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fsCheckCounterGrandPiano6 == 1) { mSoundPool.play(GrandPianofssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fsCheckCounterKeyboard6 == 1) { mSoundPool.play(Keyboardfssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fsCheckCounterOrgan6 == 1) { mSoundPool.play(Organfssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fsCheckCounterHarpsichord6 == 1) { mSoundPool.play(Harpsichordfssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fsCheckCounterDx76 == 1) { mSoundPool.play(Dx7fssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fsCheckCounterCs806 == 1) { mSoundPool.play(Cs80fssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fsCheckCounterGrandPiano7 == 1) { mSoundPool.play(GrandPianofssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fsCheckCounterKeyboard7 == 1) { mSoundPool.play(Keyboardfssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fsCheckCounterOrgan7 == 1) { mSoundPool.play(Organfssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fsCheckCounterHarpsichord7 == 1) { mSoundPool.play(Harpsichordfssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fsCheckCounterDx77 == 1) { mSoundPool.play(Dx7fssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fsCheckCounterCs807 == 1) { mSoundPool.play(Cs80fssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fsCheckCounterGrandPiano8 == 1) { mSoundPool.play(GrandPianofssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fsCheckCounterKeyboard8 == 1) { mSoundPool.play(Keyboardfssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fsCheckCounterOrgan8 == 1) { mSoundPool.play(Organfssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fsCheckCounterHarpsichord8 == 1) { mSoundPool.play(Harpsichordfssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fsCheckCounterDx78 == 1) { mSoundPool.play(Dx7fssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fsCheckCounterCs808 == 1) { mSoundPool.play(Cs80fssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fsCheckCounterGrandPiano9 == 1) { mSoundPool.play(GrandPianofssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fsCheckCounterKeyboard9 == 1) { mSoundPool.play(Keyboardfssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fsCheckCounterOrgan9 == 1) { mSoundPool.play(Organfssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fsCheckCounterHarpsichord9 == 1) { mSoundPool.play(Harpsichordfssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fsCheckCounterDx79 == 1) { mSoundPool.play(Dx7fssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fsCheckCounterCs809 == 1) { mSoundPool.play(Cs80fssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fsCheckCounterGrandPiano10 == 1) { mSoundPool.play(GrandPianofssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fsCheckCounterKeyboard10 == 1) { mSoundPool.play(Keyboardfssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fsCheckCounterOrgan10 == 1) { mSoundPool.play(Organfssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fsCheckCounterHarpsichord10 == 1) { mSoundPool.play(Harpsichordfssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fsCheckCounterDx710 == 1) { mSoundPool.play(Dx7fssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fsCheckCounterCs8010 == 1) { mSoundPool.play(Cs80fssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fsCheckCounterGrandPiano11 == 1) { mSoundPool.play(GrandPianofssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fsCheckCounterKeyboard11 == 1) { mSoundPool.play(Keyboardfssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fsCheckCounterOrgan11 == 1) { mSoundPool.play(Organfssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fsCheckCounterHarpsichord11 == 1) { mSoundPool.play(Harpsichordfssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fsCheckCounterDx711 == 1) { mSoundPool.play(Dx7fssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fsCheckCounterCs8011 == 1) { mSoundPool.play(Cs80fssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fsCheckCounterGrandPiano12 == 1) { mSoundPool.play(GrandPianofssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fsCheckCounterKeyboard12 == 1) { mSoundPool.play(Keyboardfssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fsCheckCounterOrgan12 == 1) { mSoundPool.play(Organfssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fsCheckCounterHarpsichord12 == 1) { mSoundPool.play(Harpsichordfssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fsCheckCounterDx712 == 1) { mSoundPool.play(Dx7fssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fsCheckCounterCs8012 == 1) { mSoundPool.play(Cs80fssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fsCheckCounterGrandPiano13 == 1) { mSoundPool.play(GrandPianofssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fsCheckCounterKeyboard13 == 1) { mSoundPool.play(Keyboardfssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fsCheckCounterOrgan13 == 1) { mSoundPool.play(Organfssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fsCheckCounterHarpsichord13 == 1) { mSoundPool.play(Harpsichordfssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fsCheckCounterDx713 == 1) { mSoundPool.play(Dx7fssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fsCheckCounterCs8013 == 1) { mSoundPool.play(Cs80fssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fsCheckCounterGrandPiano14 == 1) { mSoundPool.play(GrandPianofssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fsCheckCounterKeyboard14 == 1) { mSoundPool.play(Keyboardfssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fsCheckCounterOrgan14 == 1) { mSoundPool.play(Organfssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fsCheckCounterHarpsichord14 == 1) { mSoundPool.play(Harpsichordfssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fsCheckCounterDx714 == 1) { mSoundPool.play(Dx7fssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fsCheckCounterCs8014 == 1) { mSoundPool.play(Cs80fssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][11] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (fsCheckCounterGrandPiano15 == 1) { mSoundPool.play(GrandPianofssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (fsCheckCounterKeyboard15 == 1) { mSoundPool.play(Keyboardfssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (fsCheckCounterOrgan15 == 1) { mSoundPool.play(Organfssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (fsCheckCounterHarpsichord15 == 1) { mSoundPool.play(Harpsichordfssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (fsCheckCounterDx715 == 1) { mSoundPool.play(Dx7fssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (fsCheckCounterCs8015 == 1) { mSoundPool.play(Cs80fssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gsCheckCounterGrandPiano == 1) { mSoundPool.play(GrandPianogssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gsCheckCounterKeyboard == 1) { mSoundPool.play(Keyboardgssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gsCheckCounterOrgan == 1) { mSoundPool.play(Organgssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gsCheckCounterHarpsichord == 1) { mSoundPool.play(Harpsichordgssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gsCheckCounterDx7 == 1) { mSoundPool.play(Dx7gssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gsCheckCounterCs80 == 1) { mSoundPool.play(Cs80gssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gsCheckCounterGrandPiano1 == 1) { mSoundPool.play(GrandPianogssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gsCheckCounterKeyboard1 == 1) { mSoundPool.play(Keyboardgssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gsCheckCounterOrgan1 == 1) { mSoundPool.play(Organgssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gsCheckCounterHarpsichord1 == 1) { mSoundPool.play(Harpsichordgssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gsCheckCounterDx71 == 1) { mSoundPool.play(Dx7gssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gsCheckCounterCs801 == 1) { mSoundPool.play(Cs80gssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gsCheckCounterGrandPiano2 == 1) { mSoundPool.play(GrandPianogssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gsCheckCounterKeyboard2 == 1) { mSoundPool.play(Keyboardgssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gsCheckCounterOrgan2 == 1) { mSoundPool.play(Organgssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gsCheckCounterHarpsichord2 == 1) { mSoundPool.play(Harpsichordgssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gsCheckCounterDx72 == 1) { mSoundPool.play(Dx7gssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gsCheckCounterCs802 == 1) { mSoundPool.play(Cs80gssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gsCheckCounterGrandPiano3 == 1) { mSoundPool.play(GrandPianogssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gsCheckCounterKeyboard3 == 1) { mSoundPool.play(Keyboardgssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gsCheckCounterOrgan3 == 1) { mSoundPool.play(Organgssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gsCheckCounterHarpsichord3 == 1) { mSoundPool.play(Harpsichordgssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gsCheckCounterDx73 == 1) { mSoundPool.play(Dx7gssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gsCheckCounterCs803 == 1) { mSoundPool.play(Cs80gssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gsCheckCounterGrandPiano4 == 1) { mSoundPool.play(GrandPianogssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gsCheckCounterKeyboard4 == 1) { mSoundPool.play(Keyboardgssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gsCheckCounterOrgan4 == 1) { mSoundPool.play(Organgssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gsCheckCounterHarpsichord4 == 1) { mSoundPool.play(Harpsichordgssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gsCheckCounterDx74 == 1) { mSoundPool.play(Dx7gssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gsCheckCounterCs804 == 1) { mSoundPool.play(Cs80gssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gsCheckCounterGrandPiano5 == 1) { mSoundPool.play(GrandPianogssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gsCheckCounterKeyboard5 == 1) { mSoundPool.play(Keyboardgssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gsCheckCounterOrgan5 == 1) { mSoundPool.play(Organgssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gsCheckCounterHarpsichord5 == 1) { mSoundPool.play(Harpsichordgssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gsCheckCounterDx75 == 1) { mSoundPool.play(Dx7gssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gsCheckCounterCs805 == 1) { mSoundPool.play(Cs80gssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gsCheckCounterGrandPiano6 == 1) { mSoundPool.play(GrandPianogssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gsCheckCounterKeyboard6 == 1) { mSoundPool.play(Keyboardgssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gsCheckCounterOrgan6 == 1) { mSoundPool.play(Organgssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gsCheckCounterHarpsichord6 == 1) { mSoundPool.play(Harpsichordgssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gsCheckCounterDx76 == 1) { mSoundPool.play(Dx7gssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gsCheckCounterCs806 == 1) { mSoundPool.play(Cs80gssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gsCheckCounterGrandPiano7 == 1) { mSoundPool.play(GrandPianogssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gsCheckCounterKeyboard7 == 1) { mSoundPool.play(Keyboardgssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gsCheckCounterOrgan7 == 1) { mSoundPool.play(Organgssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gsCheckCounterHarpsichord7 == 1) { mSoundPool.play(Harpsichordgssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gsCheckCounterDx77 == 1) { mSoundPool.play(Dx7gssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gsCheckCounterCs807 == 1) { mSoundPool.play(Cs80gssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gsCheckCounterGrandPiano8 == 1) { mSoundPool.play(GrandPianogssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gsCheckCounterKeyboard8 == 1) { mSoundPool.play(Keyboardgssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gsCheckCounterOrgan8 == 1) { mSoundPool.play(Organgssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gsCheckCounterHarpsichord8 == 1) { mSoundPool.play(Harpsichordgssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gsCheckCounterDx78 == 1) { mSoundPool.play(Dx7gssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gsCheckCounterCs808 == 1) { mSoundPool.play(Cs80gssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gsCheckCounterGrandPiano9 == 1) { mSoundPool.play(GrandPianogssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gsCheckCounterKeyboard9 == 1) { mSoundPool.play(Keyboardgssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gsCheckCounterOrgan9 == 1) { mSoundPool.play(Organgssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gsCheckCounterHarpsichord9 == 1) { mSoundPool.play(Harpsichordgssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gsCheckCounterDx79 == 1) { mSoundPool.play(Dx7gssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gsCheckCounterCs809 == 1) { mSoundPool.play(Cs80gssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gsCheckCounterGrandPiano10 == 1) { mSoundPool.play(GrandPianogssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gsCheckCounterKeyboard10 == 1) { mSoundPool.play(Keyboardgssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gsCheckCounterOrgan10 == 1) { mSoundPool.play(Organgssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gsCheckCounterHarpsichord10 == 1) { mSoundPool.play(Harpsichordgssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gsCheckCounterDx710 == 1) { mSoundPool.play(Dx7gssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gsCheckCounterCs8010 == 1) { mSoundPool.play(Cs80gssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gsCheckCounterGrandPiano11 == 1) { mSoundPool.play(GrandPianogssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gsCheckCounterKeyboard11 == 1) { mSoundPool.play(Keyboardgssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gsCheckCounterOrgan11 == 1) { mSoundPool.play(Organgssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gsCheckCounterHarpsichord11 == 1) { mSoundPool.play(Harpsichordgssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gsCheckCounterDx711 == 1) { mSoundPool.play(Dx7gssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gsCheckCounterCs8011 == 1) { mSoundPool.play(Cs80gssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gsCheckCounterGrandPiano12 == 1) { mSoundPool.play(GrandPianogssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gsCheckCounterKeyboard12 == 1) { mSoundPool.play(Keyboardgssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gsCheckCounterOrgan12 == 1) { mSoundPool.play(Organgssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gsCheckCounterHarpsichord12 == 1) { mSoundPool.play(Harpsichordgssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gsCheckCounterDx712 == 1) { mSoundPool.play(Dx7gssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gsCheckCounterCs8012 == 1) { mSoundPool.play(Cs80gssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gsCheckCounterGrandPiano13 == 1) { mSoundPool.play(GrandPianogssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gsCheckCounterKeyboard13 == 1) { mSoundPool.play(Keyboardgssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gsCheckCounterOrgan13 == 1) { mSoundPool.play(Organgssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gsCheckCounterHarpsichord13 == 1) { mSoundPool.play(Harpsichordgssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gsCheckCounterDx713 == 1) { mSoundPool.play(Dx7gssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gsCheckCounterCs8013 == 1) { mSoundPool.play(Cs80gssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gsCheckCounterGrandPiano14 == 1) { mSoundPool.play(GrandPianogssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gsCheckCounterKeyboard14 == 1) { mSoundPool.play(Keyboardgssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gsCheckCounterOrgan14 == 1) { mSoundPool.play(Organgssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gsCheckCounterHarpsichord14 == 1) { mSoundPool.play(Harpsichordgssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gsCheckCounterDx714 == 1) { mSoundPool.play(Dx7gssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gsCheckCounterCs8014 == 1) { mSoundPool.play(Cs80gssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][12] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (gsCheckCounterGrandPiano15 == 1) { mSoundPool.play(GrandPianogssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (gsCheckCounterKeyboard15 == 1) { mSoundPool.play(Keyboardgssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (gsCheckCounterOrgan15 == 1) { mSoundPool.play(Organgssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (gsCheckCounterHarpsichord15 == 1) { mSoundPool.play(Harpsichordgssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (gsCheckCounterDx715 == 1) { mSoundPool.play(Dx7gssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (gsCheckCounterCs8015 == 1) { mSoundPool.play(Cs80gssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (asCheckCounterGrandPiano == 1) { mSoundPool.play(GrandPianoassound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (asCheckCounterKeyboard == 1) { mSoundPool.play(Keyboardassound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (asCheckCounterOrgan == 1) { mSoundPool.play(Organassound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (asCheckCounterHarpsichord == 1) { mSoundPool.play(Harpsichordassound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (asCheckCounterDx7 == 1) { mSoundPool.play(Dx7assound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (asCheckCounterCs80 == 1) { mSoundPool.play(Cs80assound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (asCheckCounterGrandPiano1 == 1) { mSoundPool.play(GrandPianoassound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (asCheckCounterKeyboard1 == 1) { mSoundPool.play(Keyboardassound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (asCheckCounterOrgan1 == 1) { mSoundPool.play(Organassound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (asCheckCounterHarpsichord1 == 1) { mSoundPool.play(Harpsichordassound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (asCheckCounterDx71 == 1) { mSoundPool.play(Dx7assound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (asCheckCounterCs801 == 1) { mSoundPool.play(Cs80assound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (asCheckCounterGrandPiano2 == 1) { mSoundPool.play(GrandPianoassound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (asCheckCounterKeyboard2 == 1) { mSoundPool.play(Keyboardassound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (asCheckCounterOrgan2 == 1) { mSoundPool.play(Organassound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (asCheckCounterHarpsichord2 == 1) { mSoundPool.play(Harpsichordassound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (asCheckCounterDx72 == 1) { mSoundPool.play(Dx7assound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (asCheckCounterCs802 == 1) { mSoundPool.play(Cs80assound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (asCheckCounterGrandPiano3 == 1) { mSoundPool.play(GrandPianoassound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (asCheckCounterKeyboard3 == 1) { mSoundPool.play(Keyboardassound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (asCheckCounterOrgan3 == 1) { mSoundPool.play(Organassound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (asCheckCounterHarpsichord3 == 1) { mSoundPool.play(Harpsichordassound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (asCheckCounterDx73 == 1) { mSoundPool.play(Dx7assound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (asCheckCounterCs803 == 1) { mSoundPool.play(Cs80assound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (asCheckCounterGrandPiano4 == 1) { mSoundPool.play(GrandPianoassound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (asCheckCounterKeyboard4 == 1) { mSoundPool.play(Keyboardassound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (asCheckCounterOrgan4 == 1) { mSoundPool.play(Organassound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (asCheckCounterHarpsichord4 == 1) { mSoundPool.play(Harpsichordassound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (asCheckCounterDx74 == 1) { mSoundPool.play(Dx7assound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (asCheckCounterCs804 == 1) { mSoundPool.play(Cs80assound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (asCheckCounterGrandPiano5 == 1) { mSoundPool.play(GrandPianoassound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (asCheckCounterKeyboard5 == 1) { mSoundPool.play(Keyboardassound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (asCheckCounterOrgan5 == 1) { mSoundPool.play(Organassound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (asCheckCounterHarpsichord5 == 1) { mSoundPool.play(Harpsichordassound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (asCheckCounterDx75 == 1) { mSoundPool.play(Dx7assound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (asCheckCounterCs805 == 1) { mSoundPool.play(Cs80assound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (asCheckCounterGrandPiano6 == 1) { mSoundPool.play(GrandPianoassound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (asCheckCounterKeyboard6 == 1) { mSoundPool.play(Keyboardassound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (asCheckCounterOrgan6 == 1) { mSoundPool.play(Organassound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (asCheckCounterHarpsichord6 == 1) { mSoundPool.play(Harpsichordassound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (asCheckCounterDx76 == 1) { mSoundPool.play(Dx7assound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (asCheckCounterCs806 == 1) { mSoundPool.play(Cs80assound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (asCheckCounterGrandPiano7 == 1) { mSoundPool.play(GrandPianoassound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (asCheckCounterKeyboard7 == 1) { mSoundPool.play(Keyboardassound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (asCheckCounterOrgan7 == 1) { mSoundPool.play(Organassound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (asCheckCounterHarpsichord7 == 1) { mSoundPool.play(Harpsichordassound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (asCheckCounterDx77 == 1) { mSoundPool.play(Dx7assound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (asCheckCounterCs807 == 1) { mSoundPool.play(Cs80assound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (asCheckCounterGrandPiano8 == 1) { mSoundPool.play(GrandPianoassound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (asCheckCounterKeyboard8 == 1) { mSoundPool.play(Keyboardassound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (asCheckCounterOrgan8 == 1) { mSoundPool.play(Organassound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (asCheckCounterHarpsichord8 == 1) { mSoundPool.play(Harpsichordassound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (asCheckCounterDx78 == 1) { mSoundPool.play(Dx7assound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (asCheckCounterCs808 == 1) { mSoundPool.play(Cs80assound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (asCheckCounterGrandPiano9 == 1) { mSoundPool.play(GrandPianoassound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (asCheckCounterKeyboard9 == 1) { mSoundPool.play(Keyboardassound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (asCheckCounterOrgan9 == 1) { mSoundPool.play(Organassound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (asCheckCounterHarpsichord9 == 1) { mSoundPool.play(Harpsichordassound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (asCheckCounterDx79 == 1) { mSoundPool.play(Dx7assound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (asCheckCounterCs809 == 1) { mSoundPool.play(Cs80assound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (asCheckCounterGrandPiano10 == 1) { mSoundPool.play(GrandPianoassound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (asCheckCounterKeyboard10 == 1) { mSoundPool.play(Keyboardassound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (asCheckCounterOrgan10 == 1) { mSoundPool.play(Organassound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (asCheckCounterHarpsichord10 == 1) { mSoundPool.play(Harpsichordassound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (asCheckCounterDx710 == 1) { mSoundPool.play(Dx7assound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (asCheckCounterCs8010 == 1) { mSoundPool.play(Cs80assound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (asCheckCounterGrandPiano11 == 1) { mSoundPool.play(GrandPianoassound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (asCheckCounterKeyboard11 == 1) { mSoundPool.play(Keyboardassound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (asCheckCounterOrgan11 == 1) { mSoundPool.play(Organassound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (asCheckCounterHarpsichord11 == 1) { mSoundPool.play(Harpsichordassound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (asCheckCounterDx711 == 1) { mSoundPool.play(Dx7assound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (asCheckCounterCs8011 == 1) { mSoundPool.play(Cs80assound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (asCheckCounterGrandPiano12 == 1) { mSoundPool.play(GrandPianoassound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (asCheckCounterKeyboard12 == 1) { mSoundPool.play(Keyboardassound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (asCheckCounterOrgan12 == 1) { mSoundPool.play(Organassound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (asCheckCounterHarpsichord12 == 1) { mSoundPool.play(Harpsichordassound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (asCheckCounterDx712 == 1) { mSoundPool.play(Dx7assound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (asCheckCounterCs8012 == 1) { mSoundPool.play(Cs80assound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (asCheckCounterGrandPiano13 == 1) { mSoundPool.play(GrandPianoassound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (asCheckCounterKeyboard13 == 1) { mSoundPool.play(Keyboardassound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (asCheckCounterOrgan13 == 1) { mSoundPool.play(Organassound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (asCheckCounterHarpsichord13 == 1) { mSoundPool.play(Harpsichordassound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (asCheckCounterDx713 == 1) { mSoundPool.play(Dx7assound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (asCheckCounterCs8013 == 1) { mSoundPool.play(Cs80assound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (asCheckCounterGrandPiano14 == 1) { mSoundPool.play(GrandPianoassound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (asCheckCounterKeyboard14 == 1) { mSoundPool.play(Keyboardassound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (asCheckCounterOrgan14 == 1) { mSoundPool.play(Organassound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (asCheckCounterHarpsichord14 == 1) { mSoundPool.play(Harpsichordassound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (asCheckCounterDx714 == 1) { mSoundPool.play(Dx7assound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (asCheckCounterCs8014 == 1) { mSoundPool.play(Cs80assound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][13] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (asCheckCounterGrandPiano15 == 1) { mSoundPool.play(GrandPianoassound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (asCheckCounterKeyboard15 == 1) { mSoundPool.play(Keyboardassound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (asCheckCounterOrgan15 == 1) { mSoundPool.play(Organassound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (asCheckCounterHarpsichord15 == 1) { mSoundPool.play(Harpsichordassound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (asCheckCounterDx715 == 1) { mSoundPool.play(Dx7assound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (asCheckCounterCs8015 == 1) { mSoundPool.play(Cs80assound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 4000);
                    }
                    if (sequencerBoolean[0][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cs2CheckCounterGrandPiano == 1) { mSoundPool.play(GrandPianocsssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cs2CheckCounterKeyboard == 1) { mSoundPool.play(Keyboardcsssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cs2CheckCounterOrgan == 1) { mSoundPool.play(Organcsssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cs2CheckCounterHarpsichord == 1) { mSoundPool.play(Harpsichordcsssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cs2CheckCounterDx7 == 1) { mSoundPool.play(Dx7csssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cs2CheckCounterCs80 == 1) { mSoundPool.play(Cs80csssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 250);
                    }
                    if (sequencerBoolean[1][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cs2CheckCounterGrandPiano1 == 1) { mSoundPool.play(GrandPianocsssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cs2CheckCounterKeyboard1 == 1) { mSoundPool.play(Keyboardcsssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cs2CheckCounterOrgan1 == 1) { mSoundPool.play(Organcsssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cs2CheckCounterHarpsichord1 == 1) { mSoundPool.play(Harpsichordcsssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cs2CheckCounterDx71 == 1) { mSoundPool.play(Dx7csssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cs2CheckCounterCs801 == 1) { mSoundPool.play(Cs80csssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 500);
                    }
                    if (sequencerBoolean[2][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cs2CheckCounterGrandPiano2 == 1) { mSoundPool.play(GrandPianocsssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cs2CheckCounterKeyboard2 == 1) { mSoundPool.play(Keyboardcsssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cs2CheckCounterOrgan2 == 1) { mSoundPool.play(Organcsssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cs2CheckCounterHarpsichord2 == 1) { mSoundPool.play(Harpsichordcsssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cs2CheckCounterDx72 == 1) { mSoundPool.play(Dx7csssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cs2CheckCounterCs802 == 1) { mSoundPool.play(Cs80csssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 750);
                    }
                    if (sequencerBoolean[3][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cs2CheckCounterGrandPiano3 == 1) { mSoundPool.play(GrandPianocsssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cs2CheckCounterKeyboard3 == 1) { mSoundPool.play(Keyboardcsssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cs2CheckCounterOrgan3 == 1) { mSoundPool.play(Organcsssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cs2CheckCounterHarpsichord3 == 1) { mSoundPool.play(Harpsichordcsssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cs2CheckCounterDx73 == 1) { mSoundPool.play(Dx7csssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cs2CheckCounterCs803 == 1) { mSoundPool.play(Cs80csssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1000);
                    }
                    if (sequencerBoolean[4][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cs2CheckCounterGrandPiano4 == 1) { mSoundPool.play(GrandPianocsssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cs2CheckCounterKeyboard4 == 1) { mSoundPool.play(Keyboardcsssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cs2CheckCounterOrgan4 == 1) { mSoundPool.play(Organcsssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cs2CheckCounterHarpsichord4 == 1) { mSoundPool.play(Harpsichordcsssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cs2CheckCounterDx74 == 1) { mSoundPool.play(Dx7csssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cs2CheckCounterCs804 == 1) { mSoundPool.play(Cs80csssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1250);
                    }
                    if (sequencerBoolean[5][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cs2CheckCounterGrandPiano5 == 1) { mSoundPool.play(GrandPianocsssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cs2CheckCounterKeyboard5 == 1) { mSoundPool.play(Keyboardcsssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cs2CheckCounterOrgan5 == 1) { mSoundPool.play(Organcsssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cs2CheckCounterHarpsichord5 == 1) { mSoundPool.play(Harpsichordcsssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cs2CheckCounterDx75 == 1) { mSoundPool.play(Dx7csssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cs2CheckCounterCs805 == 1) { mSoundPool.play(Cs80csssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1500);
                    }
                    if (sequencerBoolean[6][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cs2CheckCounterGrandPiano6 == 1) { mSoundPool.play(GrandPianocsssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cs2CheckCounterKeyboard6 == 1) { mSoundPool.play(Keyboardcsssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cs2CheckCounterOrgan6 == 1) { mSoundPool.play(Organcsssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cs2CheckCounterHarpsichord6 == 1) { mSoundPool.play(Harpsichordcsssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cs2CheckCounterDx76 == 1) { mSoundPool.play(Dx7csssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cs2CheckCounterCs806 == 1) { mSoundPool.play(Cs80csssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 1750);
                    }
                    if (sequencerBoolean[7][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cs2CheckCounterGrandPiano7 == 1) { mSoundPool.play(GrandPianocsssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cs2CheckCounterKeyboard7 == 1) { mSoundPool.play(Keyboardcsssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cs2CheckCounterOrgan7 == 1) { mSoundPool.play(Organcsssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cs2CheckCounterHarpsichord7 == 1) { mSoundPool.play(Harpsichordcsssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cs2CheckCounterDx77 == 1) { mSoundPool.play(Dx7csssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cs2CheckCounterCs807 == 1) { mSoundPool.play(Cs80csssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2000);
                    }
                    if (sequencerBoolean[8][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cs2CheckCounterGrandPiano8 == 1) { mSoundPool.play(GrandPianocsssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cs2CheckCounterKeyboard8 == 1) { mSoundPool.play(Keyboardcsssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cs2CheckCounterOrgan8 == 1) { mSoundPool.play(Organcsssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cs2CheckCounterHarpsichord8 == 1) { mSoundPool.play(Harpsichordcsssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cs2CheckCounterDx78 == 1) { mSoundPool.play(Dx7csssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cs2CheckCounterCs808 == 1) { mSoundPool.play(Cs80csssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2250);
                    }
                    if (sequencerBoolean[9][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cs2CheckCounterGrandPiano9 == 1) { mSoundPool.play(GrandPianocsssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cs2CheckCounterKeyboard9 == 1) { mSoundPool.play(Keyboardcsssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cs2CheckCounterOrgan9 == 1) { mSoundPool.play(Organcsssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cs2CheckCounterHarpsichord9 == 1) { mSoundPool.play(Harpsichordcsssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cs2CheckCounterDx79 == 1) { mSoundPool.play(Dx7csssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cs2CheckCounterCs809 == 1) { mSoundPool.play(Cs80csssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2500);
                    }
                    if (sequencerBoolean[10][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cs2CheckCounterGrandPiano10 == 1) { mSoundPool.play(GrandPianocsssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cs2CheckCounterKeyboard10 == 1) { mSoundPool.play(Keyboardcsssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cs2CheckCounterOrgan10 == 1) { mSoundPool.play(Organcsssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cs2CheckCounterHarpsichord10 == 1) { mSoundPool.play(Harpsichordcsssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cs2CheckCounterDx710 == 1) { mSoundPool.play(Dx7csssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cs2CheckCounterCs8010 == 1) { mSoundPool.play(Cs80csssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 2750);
                    }
                    if (sequencerBoolean[11][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cs2CheckCounterGrandPiano11 == 1) { mSoundPool.play(GrandPianocsssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cs2CheckCounterKeyboard11 == 1) { mSoundPool.play(Keyboardcsssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cs2CheckCounterOrgan11 == 1) { mSoundPool.play(Organcsssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cs2CheckCounterHarpsichord11 == 1) { mSoundPool.play(Harpsichordcsssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cs2CheckCounterDx711 == 1) { mSoundPool.play(Dx7csssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cs2CheckCounterCs8011 == 1) { mSoundPool.play(Cs80csssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3000);
                    }
                    if (sequencerBoolean[12][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cs2CheckCounterGrandPiano12 == 1) { mSoundPool.play(GrandPianocsssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cs2CheckCounterKeyboard12 == 1) { mSoundPool.play(Keyboardcsssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cs2CheckCounterOrgan12 == 1) { mSoundPool.play(Organcsssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cs2CheckCounterHarpsichord12 == 1) { mSoundPool.play(Harpsichordcsssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cs2CheckCounterDx712 == 1) { mSoundPool.play(Dx7csssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cs2CheckCounterCs8012 == 1) { mSoundPool.play(Cs80csssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3250);
                    }
                    if (sequencerBoolean[13][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cs2CheckCounterGrandPiano13 == 1) { mSoundPool.play(GrandPianocsssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cs2CheckCounterKeyboard13 == 1) { mSoundPool.play(Keyboardcsssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cs2CheckCounterOrgan13 == 1) { mSoundPool.play(Organcsssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cs2CheckCounterHarpsichord13 == 1) { mSoundPool.play(Harpsichordcsssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cs2CheckCounterDx713 == 1) { mSoundPool.play(Dx7csssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cs2CheckCounterCs8013 == 1) { mSoundPool.play(Cs80csssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3500);
                    }
                    if (sequencerBoolean[14][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cs2CheckCounterGrandPiano14 == 1) { mSoundPool.play(GrandPianocsssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cs2CheckCounterKeyboard14 == 1) { mSoundPool.play(Keyboardcsssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cs2CheckCounterOrgan14 == 1) { mSoundPool.play(Organcsssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cs2CheckCounterHarpsichord14 == 1) { mSoundPool.play(Harpsichordcsssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cs2CheckCounterDx714 == 1) { mSoundPool.play(Dx7csssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cs2CheckCounterCs8014 == 1) { mSoundPool.play(Cs80csssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 3750);
                    }
                    if (sequencerBoolean[15][14] == true) {
                        handler.postDelayed(new Runnable() {
                            public void run() { //this is asynchronous which is why checkpresses is here and also in the larger if statement
                                if (checkPresses == 1) {
                                    if (cs2CheckCounterGrandPiano15 == 1) { mSoundPool.play(GrandPianocsssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                                    if (cs2CheckCounterKeyboard15 == 1) { mSoundPool.play(Keyboardcsssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                                    if (cs2CheckCounterOrgan15 == 1) { mSoundPool.play(Organcsssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                                    if (cs2CheckCounterHarpsichord15 == 1) { mSoundPool.play(Harpsichordcsssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                                    if (cs2CheckCounterDx715 == 1) { mSoundPool.play(Dx7csssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                                    if (cs2CheckCounterCs8015 == 1) { mSoundPool.play(Cs80csssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }
                                    if (countering == 0) { handler.postDelayed(this, 4000); }
                                    if (checkPresses == 0) { mSoundPool.autoPause(); }
                                }
                            }
                        }, 4000);
                    }

                }
                break;
            }
        }
    }

    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        onTouchEvent(view, motionEvent);
        onTouchEvent2(view, motionEvent);
        switch(view.getId()) {
            case R.id.c:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianocsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardcsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organcsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordcsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7csound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80csound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianocsoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardcsoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organcsoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordcsoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7csoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80csoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(GrandPianocsoundbelow, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Keyboardcsoundbelow, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Organcsoundbelow, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordcsoundbelow, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Dx7csoundbelow, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Cs80csoundbelow, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(GrandPianocsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianoccsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianoesoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Keyboardcsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardccsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardesoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Organcsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organccsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organesoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Harpsichordcsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordccsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordesoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Dx7csound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7ccsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7esoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Cs80csound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80ccsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80esoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f);}

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(GrandPianocsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true; cCheckCounterGrandPiano = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true; cCheckCounterGrandPiano1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true; cCheckCounterGrandPiano2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true; cCheckCounterGrandPiano3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true; cCheckCounterGrandPiano4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true; cCheckCounterGrandPiano5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true; cCheckCounterGrandPiano6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true; cCheckCounterGrandPiano7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true; cCheckCounterGrandPiano8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true; cCheckCounterGrandPiano9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true; cCheckCounterGrandPiano10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true; cCheckCounterGrandPiano11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true; cCheckCounterGrandPiano12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true; cCheckCounterGrandPiano13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true; cCheckCounterGrandPiano14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true; cCheckCounterGrandPiano15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Keyboardcsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true; cCheckCounterKeyboard = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true; cCheckCounterKeyboard1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true; cCheckCounterKeyboard2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true; cCheckCounterKeyboard3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true; cCheckCounterKeyboard4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true; cCheckCounterKeyboard5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true; cCheckCounterKeyboard6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true; cCheckCounterKeyboard7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true; cCheckCounterKeyboard8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true; cCheckCounterKeyboard9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true; cCheckCounterKeyboard10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true; cCheckCounterKeyboard11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true; cCheckCounterKeyboard12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true; cCheckCounterKeyboard13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true; cCheckCounterKeyboard14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true; cCheckCounterKeyboard15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Organcsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true; cCheckCounterOrgan = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true; cCheckCounterOrgan1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true; cCheckCounterOrgan2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true; cCheckCounterOrgan3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true; cCheckCounterOrgan4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true; cCheckCounterOrgan5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true; cCheckCounterOrgan6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true; cCheckCounterOrgan7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true; cCheckCounterOrgan8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true; cCheckCounterOrgan9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true; cCheckCounterOrgan10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true; cCheckCounterOrgan11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true; cCheckCounterOrgan12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true; cCheckCounterOrgan13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true; cCheckCounterOrgan14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true; cCheckCounterOrgan15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Harpsichordcsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true; cCheckCounterHarpsichord = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true; cCheckCounterHarpsichord1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true; cCheckCounterHarpsichord2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true; cCheckCounterHarpsichord3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true; cCheckCounterHarpsichord4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true; cCheckCounterHarpsichord5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true; cCheckCounterHarpsichord6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true; cCheckCounterHarpsichord7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true; cCheckCounterHarpsichord8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true; cCheckCounterHarpsichord9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true; cCheckCounterHarpsichord10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true; cCheckCounterHarpsichord11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true; cCheckCounterHarpsichord12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true; cCheckCounterHarpsichord13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true; cCheckCounterHarpsichord14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true; cCheckCounterHarpsichord15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Dx7csound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true; cCheckCounterDx7 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true; cCheckCounterDx71 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true; cCheckCounterDx72 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true; cCheckCounterDx73 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true; cCheckCounterDx74 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true; cCheckCounterDx75 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true; cCheckCounterDx76 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true; cCheckCounterDx77 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true; cCheckCounterDx78 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true; cCheckCounterDx79 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true; cCheckCounterDx710 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true; cCheckCounterDx711 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true; cCheckCounterDx712 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true; cCheckCounterDx713 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true; cCheckCounterDx714 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true; cCheckCounterDx715 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==1) {
                    mSoundPool.play(Cs80csound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][1] = true; cCheckCounterCs80 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][1] = true; cCheckCounterCs801 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][1] = true; cCheckCounterCs802 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][1] = true; cCheckCounterCs803 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][1] = true; cCheckCounterCs804 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][1] = true; cCheckCounterCs805 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][1] = true; cCheckCounterCs806 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][1] = true; cCheckCounterCs807 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][1] = true; cCheckCounterCs808 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][1] = true; cCheckCounterCs809 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][1] = true; cCheckCounterCs8010 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][1] = true; cCheckCounterCs8011 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][1] = true; cCheckCounterCs8012 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][1] = true; cCheckCounterCs8013 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][1] = true; cCheckCounterCs8014 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][1] = true; cCheckCounterCs8015 = 1; }
                }
                break;

            case R.id.d:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianodsoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboarddsoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organdsoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichorddsoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7dsoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80dsoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(GrandPianodsoundbelow, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Keyboarddsoundbelow, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Organdsoundbelow, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Harpsichorddsoundbelow, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Dx7dsoundbelow, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Cs80dsoundbelow, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianodsoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianofssoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboarddsoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardfssoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organdsoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organfssoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichorddsoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordfssoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7dsoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7fssoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80dsoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80fssoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f);}

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true; dCheckCounterGrandPiano = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true; dCheckCounterGrandPiano1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true; dCheckCounterGrandPiano2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true; dCheckCounterGrandPiano3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true; dCheckCounterGrandPiano4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true; dCheckCounterGrandPiano5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true; dCheckCounterGrandPiano6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true; dCheckCounterGrandPiano7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true; dCheckCounterGrandPiano8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true; dCheckCounterGrandPiano9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true; dCheckCounterGrandPiano10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true; dCheckCounterGrandPiano11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true; dCheckCounterGrandPiano12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true; dCheckCounterGrandPiano13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true; dCheckCounterGrandPiano14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true; dCheckCounterGrandPiano15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;dCheckCounterKeyboard = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;dCheckCounterKeyboard1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;dCheckCounterKeyboard2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;dCheckCounterKeyboard3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;dCheckCounterKeyboard4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;dCheckCounterKeyboard5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;dCheckCounterKeyboard6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;dCheckCounterKeyboard7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;dCheckCounterKeyboard8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;dCheckCounterKeyboard9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;dCheckCounterKeyboard10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;dCheckCounterKeyboard11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;dCheckCounterKeyboard12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;dCheckCounterKeyboard13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;dCheckCounterKeyboard14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;dCheckCounterKeyboard15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;dCheckCounterOrgan = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;dCheckCounterOrgan1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;dCheckCounterOrgan2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;dCheckCounterOrgan3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;dCheckCounterOrgan4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;dCheckCounterOrgan5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;dCheckCounterOrgan6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;dCheckCounterOrgan7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;dCheckCounterOrgan8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;dCheckCounterOrgan9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;dCheckCounterOrgan10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;dCheckCounterOrgan11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;dCheckCounterOrgan12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;dCheckCounterOrgan13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;dCheckCounterOrgan14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;dCheckCounterOrgan15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;dCheckCounterHarpsichord = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;dCheckCounterHarpsichord1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;dCheckCounterHarpsichord2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;dCheckCounterHarpsichord3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;dCheckCounterHarpsichord4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;dCheckCounterHarpsichord5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;dCheckCounterHarpsichord6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;dCheckCounterHarpsichord7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;dCheckCounterHarpsichord8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;dCheckCounterHarpsichord9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;dCheckCounterHarpsichord10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;dCheckCounterHarpsichord11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;dCheckCounterHarpsichord12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;dCheckCounterHarpsichord13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;dCheckCounterHarpsichord14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;dCheckCounterHarpsichord15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;dCheckCounterDx7 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;dCheckCounterDx71 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;dCheckCounterDx72 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;dCheckCounterDx73 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;dCheckCounterDx74 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;dCheckCounterDx75 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;dCheckCounterDx76 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;dCheckCounterDx77 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;dCheckCounterDx78 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;dCheckCounterDx79 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;dCheckCounterDx710 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;dCheckCounterDx711 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;dCheckCounterDx712 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;dCheckCounterDx713 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;dCheckCounterDx714 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;dCheckCounterDx715 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==1) {
                    mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][2] = true;dCheckCounterCs80 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][2] = true;dCheckCounterCs801 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][2] = true;dCheckCounterCs802 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][2] = true;dCheckCounterCs803 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][2] = true;dCheckCounterCs804 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][2] = true;dCheckCounterCs805 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][2] = true;dCheckCounterCs806 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][2] = true;dCheckCounterCs807 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][2] = true;dCheckCounterCs808 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][2] = true;dCheckCounterCs809 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][2] = true;dCheckCounterCs8010 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][2] = true;dCheckCounterCs8011 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][2] = true;dCheckCounterCs8012 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][2] = true;dCheckCounterCs8013 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][2] = true;dCheckCounterCs8014 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][2] = true;dCheckCounterCs8015 = 1; }
                }
                break;

            case R.id.e:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianoesoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardesoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organesoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordesoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7esoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80esoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(GrandPianoesoundbelow, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Keyboardesoundbelow, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Organesoundbelow, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordesoundbelow, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Dx7esoundbelow, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Cs80esoundbelow, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(GrandPianoesoundbelow, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianobsoundbelow, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianoesoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Keyboardesoundbelow, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardbsoundbelow, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardesoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Organesoundbelow, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organbsoundbelow, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organesoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Harpsichordesoundbelow, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordbsoundbelow, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordesoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Dx7esoundbelow, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7bsoundbelow, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7esoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Cs80esoundbelow, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80bsoundbelow, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80esoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f);}

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;eCheckCounterGrandPiano = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;eCheckCounterGrandPiano1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;eCheckCounterGrandPiano2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;eCheckCounterGrandPiano3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;eCheckCounterGrandPiano4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;eCheckCounterGrandPiano5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;eCheckCounterGrandPiano6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;eCheckCounterGrandPiano7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;eCheckCounterGrandPiano8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;eCheckCounterGrandPiano9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;eCheckCounterGrandPiano10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;eCheckCounterGrandPiano11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;eCheckCounterGrandPiano12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;eCheckCounterGrandPiano13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;eCheckCounterGrandPiano14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;eCheckCounterGrandPiano15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;eCheckCounterKeyboard = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;eCheckCounterKeyboard1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;eCheckCounterKeyboard2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;eCheckCounterKeyboard3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;eCheckCounterKeyboard4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;eCheckCounterKeyboard5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;eCheckCounterKeyboard6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;eCheckCounterKeyboard7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;eCheckCounterKeyboard8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;eCheckCounterKeyboard9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;eCheckCounterKeyboard10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;eCheckCounterKeyboard11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;eCheckCounterKeyboard12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;eCheckCounterKeyboard13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;eCheckCounterKeyboard14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;eCheckCounterKeyboard15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;eCheckCounterOrgan = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;eCheckCounterOrgan1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;eCheckCounterOrgan2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;eCheckCounterOrgan3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;eCheckCounterOrgan4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;eCheckCounterOrgan5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;eCheckCounterOrgan6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;eCheckCounterOrgan7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;eCheckCounterOrgan8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;eCheckCounterOrgan9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;eCheckCounterOrgan10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;eCheckCounterOrgan11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;eCheckCounterOrgan12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;eCheckCounterOrgan13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;eCheckCounterOrgan14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;eCheckCounterOrgan15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;eCheckCounterHarpsichord = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;eCheckCounterHarpsichord1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;eCheckCounterHarpsichord2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;eCheckCounterHarpsichord3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;eCheckCounterHarpsichord4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;eCheckCounterHarpsichord5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;eCheckCounterHarpsichord6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;eCheckCounterHarpsichord7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;eCheckCounterHarpsichord8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;eCheckCounterHarpsichord9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;eCheckCounterHarpsichord10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;eCheckCounterHarpsichord11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;eCheckCounterHarpsichord12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;eCheckCounterHarpsichord13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;eCheckCounterHarpsichord14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;eCheckCounterHarpsichord15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;eCheckCounterDx7 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;eCheckCounterDx71 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;eCheckCounterDx72 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;eCheckCounterDx73 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;eCheckCounterDx74 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;eCheckCounterDx75 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;eCheckCounterDx76 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;eCheckCounterDx77 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;eCheckCounterDx78 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;eCheckCounterDx79 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;eCheckCounterDx710 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;eCheckCounterDx711 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;eCheckCounterDx712 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;eCheckCounterDx713 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;eCheckCounterDx714 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;eCheckCounterDx715 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==1) {
                    mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][3] = true;eCheckCounterCs80 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][3] = true;eCheckCounterCs801 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][3] = true;eCheckCounterCs802 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][3] = true;eCheckCounterCs803 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][3] = true;eCheckCounterCs804 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][3] = true;eCheckCounterCs805 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][3] = true;eCheckCounterCs806 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][3] = true;eCheckCounterCs807 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][3] = true;eCheckCounterCs808 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][3] = true;eCheckCounterCs809 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][3] = true;eCheckCounterCs8010 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][3] = true;eCheckCounterCs8011 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][3] = true;eCheckCounterCs8012 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][3] = true;eCheckCounterCs8013 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][3] = true;eCheckCounterCs8014 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][3] = true;eCheckCounterCs8015 = 1; }
                }
                break;

            case R.id.f:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianofsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardfsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organfsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordfsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7fsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80fsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianofsoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardfsoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organfsoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordfsoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7fsoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80fsoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(GrandPianofsoundbelow, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Keyboardfsoundbelow, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Organfsoundbelow, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordfsoundbelow, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Dx7fsoundbelow, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Cs80fsoundbelow, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(GrandPianofsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;fCheckCounterGrandPiano = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;fCheckCounterGrandPiano1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;fCheckCounterGrandPiano2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;fCheckCounterGrandPiano3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;fCheckCounterGrandPiano4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;fCheckCounterGrandPiano5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;fCheckCounterGrandPiano6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;fCheckCounterGrandPiano7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;fCheckCounterGrandPiano8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;fCheckCounterGrandPiano9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;fCheckCounterGrandPiano10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;fCheckCounterGrandPiano11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;fCheckCounterGrandPiano12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;fCheckCounterGrandPiano13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;fCheckCounterGrandPiano14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;fCheckCounterGrandPiano15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Keyboardfsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;fCheckCounterKeyboard = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;fCheckCounterKeyboard1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;fCheckCounterKeyboard2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;fCheckCounterKeyboard3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;fCheckCounterKeyboard4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;fCheckCounterKeyboard5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;fCheckCounterKeyboard6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;fCheckCounterKeyboard7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;fCheckCounterKeyboard8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;fCheckCounterKeyboard9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;fCheckCounterKeyboard10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;fCheckCounterKeyboard11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;fCheckCounterKeyboard12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;fCheckCounterKeyboard13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;fCheckCounterKeyboard14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;fCheckCounterKeyboard15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Organfsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;fCheckCounterOrgan = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;fCheckCounterOrgan1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;fCheckCounterOrgan2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;fCheckCounterOrgan3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;fCheckCounterOrgan4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;fCheckCounterOrgan5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;fCheckCounterOrgan6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;fCheckCounterOrgan7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;fCheckCounterOrgan8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;fCheckCounterOrgan9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;fCheckCounterOrgan10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;fCheckCounterOrgan11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;fCheckCounterOrgan12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;fCheckCounterOrgan13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;fCheckCounterOrgan14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;fCheckCounterOrgan15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Harpsichordfsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;fCheckCounterHarpsichord = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;fCheckCounterHarpsichord1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;fCheckCounterHarpsichord2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;fCheckCounterHarpsichord3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;fCheckCounterHarpsichord4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;fCheckCounterHarpsichord5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;fCheckCounterHarpsichord6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;fCheckCounterHarpsichord7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;fCheckCounterHarpsichord8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;fCheckCounterHarpsichord9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;fCheckCounterHarpsichord10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;fCheckCounterHarpsichord11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;fCheckCounterHarpsichord12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;fCheckCounterHarpsichord13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;fCheckCounterHarpsichord14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;fCheckCounterHarpsichord15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Dx7fsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;fCheckCounterDx7 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;fCheckCounterDx71 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;fCheckCounterDx72 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;fCheckCounterDx73 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;fCheckCounterDx74 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;fCheckCounterDx75 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;fCheckCounterDx76 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;fCheckCounterDx77 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;fCheckCounterDx78 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;fCheckCounterDx79 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;fCheckCounterDx710 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;fCheckCounterDx711 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;fCheckCounterDx712 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;fCheckCounterDx713 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;fCheckCounterDx714 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;fCheckCounterDx715 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==1) {
                    mSoundPool.play(Cs80fsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][4] = true;fCheckCounterCs80 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][4] = true;fCheckCounterCs801 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][4] = true;fCheckCounterCs802 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][4] = true;fCheckCounterCs803 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][4] = true;fCheckCounterCs804 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][4] = true;fCheckCounterCs805 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][4] = true;fCheckCounterCs806 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][4] = true;fCheckCounterCs807 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][4] = true;fCheckCounterCs808 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][4] = true;fCheckCounterCs809 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][4] = true;fCheckCounterCs8010 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][4] = true;fCheckCounterCs8011 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][4] = true;fCheckCounterCs8012 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][4] = true;fCheckCounterCs8013 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][4] = true;fCheckCounterCs8014 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][4] = true;fCheckCounterCs8015 = 1; }
                }
                break;

            case R.id.g:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianogsoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardgsoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organgsoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordgsoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7gsoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80gsoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(GrandPianogsoundbelow, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Keyboardgsoundbelow, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Organgsoundbelow, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordgsoundbelow, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Dx7gsoundbelow, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Cs80gsoundbelow, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(GrandPianogsoundbelow, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianobsoundbelow, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianodsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianogsoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Keyboardgsoundbelow, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardbsoundbelow, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboarddsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardgsoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Organgsoundbelow, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organbsoundbelow, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organdsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organgsoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Harpsichordgsoundbelow, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordbsoundbelow, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichorddsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordgsoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Dx7gsoundbelow, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7bsoundbelow, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7dsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7gsoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Cs80gsoundbelow, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80bsoundbelow, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80dsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80gsoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f);}

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(GrandPianogsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;gCheckCounterGrandPiano = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;gCheckCounterGrandPiano1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;gCheckCounterGrandPiano2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;gCheckCounterGrandPiano3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;gCheckCounterGrandPiano4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;gCheckCounterGrandPiano5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;gCheckCounterGrandPiano6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;gCheckCounterGrandPiano7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;gCheckCounterGrandPiano8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;gCheckCounterGrandPiano9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;gCheckCounterGrandPiano10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;gCheckCounterGrandPiano11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;gCheckCounterGrandPiano12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;gCheckCounterGrandPiano13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;gCheckCounterGrandPiano14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;gCheckCounterGrandPiano15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Keyboardgsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;gCheckCounterKeyboard = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;gCheckCounterKeyboard1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;gCheckCounterKeyboard2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;gCheckCounterKeyboard3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;gCheckCounterKeyboard4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;gCheckCounterKeyboard5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;gCheckCounterKeyboard6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;gCheckCounterKeyboard7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;gCheckCounterKeyboard8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;gCheckCounterKeyboard9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;gCheckCounterKeyboard10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;gCheckCounterKeyboard11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;gCheckCounterKeyboard12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;gCheckCounterKeyboard13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;gCheckCounterKeyboard14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;gCheckCounterKeyboard15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Organgsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;gCheckCounterOrgan = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;gCheckCounterOrgan1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;gCheckCounterOrgan2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;gCheckCounterOrgan3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;gCheckCounterOrgan4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;gCheckCounterOrgan5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;gCheckCounterOrgan6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;gCheckCounterOrgan7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;gCheckCounterOrgan8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;gCheckCounterOrgan9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;gCheckCounterOrgan10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;gCheckCounterOrgan11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;gCheckCounterOrgan12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;gCheckCounterOrgan13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;gCheckCounterOrgan14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;gCheckCounterOrgan15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Harpsichordgsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;gCheckCounterHarpsichord = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;gCheckCounterHarpsichord1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;gCheckCounterHarpsichord2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;gCheckCounterHarpsichord3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;gCheckCounterHarpsichord4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;gCheckCounterHarpsichord5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;gCheckCounterHarpsichord6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;gCheckCounterHarpsichord7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;gCheckCounterHarpsichord8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;gCheckCounterHarpsichord9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;gCheckCounterHarpsichord10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;gCheckCounterHarpsichord11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;gCheckCounterHarpsichord12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;gCheckCounterHarpsichord13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;gCheckCounterHarpsichord14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;gCheckCounterHarpsichord15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Dx7gsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;gCheckCounterDx7 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;gCheckCounterDx71 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;gCheckCounterDx72 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;gCheckCounterDx73 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;gCheckCounterDx74 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;gCheckCounterDx75 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;gCheckCounterDx76 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;gCheckCounterDx77 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;gCheckCounterDx78 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;gCheckCounterDx79 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;gCheckCounterDx710 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;gCheckCounterDx711 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;gCheckCounterDx712 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;gCheckCounterDx713 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;gCheckCounterDx714 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;gCheckCounterDx715 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==1) {
                    mSoundPool.play(Cs80gsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][5] = true;gCheckCounterCs80 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][5] = true;gCheckCounterCs801 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][5] = true;gCheckCounterCs802 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][5] = true;gCheckCounterCs803 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][5] = true;gCheckCounterCs804 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][5] = true;gCheckCounterCs805 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][5] = true;gCheckCounterCs806 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][5] = true;gCheckCounterCs807 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][5] = true;gCheckCounterCs808 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][5] = true;gCheckCounterCs809 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][5] = true;gCheckCounterCs8010 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][5] = true;gCheckCounterCs8011 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][5] = true;gCheckCounterCs8012 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][5] = true;gCheckCounterCs8013 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][5] = true;gCheckCounterCs8014 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][5] = true;gCheckCounterCs8015 = 1; }
                }
                break;

            case R.id.a:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianoasoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardasoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organasoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordasoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7asoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80asoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(GrandPianoasoundbelow, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Keyboardasoundbelow, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Organasoundbelow, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordasoundbelow, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Dx7asoundbelow, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Cs80asoundbelow, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(GrandPianoasoundbelow, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianoesound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianocsssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianoesoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); mSoundPool.play(GrandPianogsoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Keyboardasoundbelow, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardesound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardcsssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardesoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); mSoundPool.play(Keyboardgsoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Organasoundbelow, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organesound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organcsssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organesoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); mSoundPool.play(Organgsoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Harpsichordasoundbelow, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordesound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordcsssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordesoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); mSoundPool.play(Harpsichordgsoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Dx7asoundbelow, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7esound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7csssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7esoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); mSoundPool.play(Dx7gsoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f);}
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && switchChords.isChecked()) { mSoundPool.play(Cs80asoundbelow, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80esound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80csssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80esoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); mSoundPool.play(Cs80gsoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f);}

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(GrandPianoasound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;aCheckCounterGrandPiano = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;aCheckCounterGrandPiano1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;aCheckCounterGrandPiano2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;aCheckCounterGrandPiano3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;aCheckCounterGrandPiano4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;aCheckCounterGrandPiano5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;aCheckCounterGrandPiano6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;aCheckCounterGrandPiano7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;aCheckCounterGrandPiano8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;aCheckCounterGrandPiano9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;aCheckCounterGrandPiano10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;aCheckCounterGrandPiano11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;aCheckCounterGrandPiano12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;aCheckCounterGrandPiano13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;aCheckCounterGrandPiano14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;aCheckCounterGrandPiano15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Keyboardasound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;aCheckCounterKeyboard = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;aCheckCounterKeyboard1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;aCheckCounterKeyboard2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;aCheckCounterKeyboard3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;aCheckCounterKeyboard4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;aCheckCounterKeyboard5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;aCheckCounterKeyboard6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;aCheckCounterKeyboard7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;aCheckCounterKeyboard8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;aCheckCounterKeyboard9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;aCheckCounterKeyboard10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;aCheckCounterKeyboard11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;aCheckCounterKeyboard12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;aCheckCounterKeyboard13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;aCheckCounterKeyboard14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;aCheckCounterKeyboard15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Organasound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;aCheckCounterOrgan = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;aCheckCounterOrgan1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;aCheckCounterOrgan2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;aCheckCounterOrgan3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;aCheckCounterOrgan4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;aCheckCounterOrgan5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;aCheckCounterOrgan6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;aCheckCounterOrgan7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;aCheckCounterOrgan8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;aCheckCounterOrgan9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;aCheckCounterOrgan10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;aCheckCounterOrgan11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;aCheckCounterOrgan12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;aCheckCounterOrgan13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;aCheckCounterOrgan14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;aCheckCounterOrgan15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Harpsichordasound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;aCheckCounterHarpsichord = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;aCheckCounterHarpsichord1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;aCheckCounterHarpsichord2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;aCheckCounterHarpsichord3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;aCheckCounterHarpsichord4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;aCheckCounterHarpsichord5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;aCheckCounterHarpsichord6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;aCheckCounterHarpsichord7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;aCheckCounterHarpsichord8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;aCheckCounterHarpsichord9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;aCheckCounterHarpsichord10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;aCheckCounterHarpsichord11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;aCheckCounterHarpsichord12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;aCheckCounterHarpsichord13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;aCheckCounterHarpsichord14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;aCheckCounterHarpsichord15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Dx7asound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;aCheckCounterDx7 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;aCheckCounterDx71 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;aCheckCounterDx72 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;aCheckCounterDx73 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;aCheckCounterDx74 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;aCheckCounterDx75 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;aCheckCounterDx76 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;aCheckCounterDx77 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;aCheckCounterDx78 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;aCheckCounterDx79 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;aCheckCounterDx710 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;aCheckCounterDx711 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;aCheckCounterDx712 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;aCheckCounterDx713 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;aCheckCounterDx714 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;aCheckCounterDx715 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==1) {
                    mSoundPool.play(Cs80asound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][6] = true;aCheckCounterCs80 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][6] = true;aCheckCounterCs801 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][6] = true;aCheckCounterCs802 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][6] = true;aCheckCounterCs803 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][6] = true;aCheckCounterCs804 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][6] = true;aCheckCounterCs805 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][6] = true;aCheckCounterCs806 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][6] = true;aCheckCounterCs807 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][6] = true;aCheckCounterCs808 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][6] = true;aCheckCounterCs809 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][6] = true;aCheckCounterCs8010 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][6] = true;aCheckCounterCs8011 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][6] = true;aCheckCounterCs8012 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][6] = true;aCheckCounterCs8013 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][6] = true;aCheckCounterCs8014 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][6] = true;aCheckCounterCs8015 = 1; }
                }
                break;

        }
        return false;
    }


    public boolean onTouchEvent(View view, MotionEvent motionEvent) {
        switch(view.getId()) {
            case R.id.b:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianobsoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardbsoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organbsoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordbsoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7bsoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80bsoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(GrandPianobsoundbelow, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Keyboardbsoundbelow, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Organbsoundbelow, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordbsoundbelow, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Dx7bsoundbelow, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Cs80bsoundbelow, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(GrandPianobsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;bCheckCounterGrandPiano = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;bCheckCounterGrandPiano1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;bCheckCounterGrandPiano2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;bCheckCounterGrandPiano3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;bCheckCounterGrandPiano4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;bCheckCounterGrandPiano5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;bCheckCounterGrandPiano6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;bCheckCounterGrandPiano7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;bCheckCounterGrandPiano8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;bCheckCounterGrandPiano9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;bCheckCounterGrandPiano10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;bCheckCounterGrandPiano11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;bCheckCounterGrandPiano12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;bCheckCounterGrandPiano13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;bCheckCounterGrandPiano14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;bCheckCounterGrandPiano15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Keyboardbsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;bCheckCounterKeyboard = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;bCheckCounterKeyboard1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;bCheckCounterKeyboard2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;bCheckCounterKeyboard3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;bCheckCounterKeyboard4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;bCheckCounterKeyboard5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;bCheckCounterKeyboard6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;bCheckCounterKeyboard7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;bCheckCounterKeyboard8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;bCheckCounterKeyboard9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;bCheckCounterKeyboard10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;bCheckCounterKeyboard11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;bCheckCounterKeyboard12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;bCheckCounterKeyboard13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;bCheckCounterKeyboard14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;bCheckCounterKeyboard15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Organbsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;bCheckCounterOrgan = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;bCheckCounterOrgan1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;bCheckCounterOrgan2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;bCheckCounterOrgan3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;bCheckCounterOrgan4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;bCheckCounterOrgan5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;bCheckCounterOrgan6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;bCheckCounterOrgan7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;bCheckCounterOrgan8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;bCheckCounterOrgan9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;bCheckCounterOrgan10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;bCheckCounterOrgan11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;bCheckCounterOrgan12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;bCheckCounterOrgan13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;bCheckCounterOrgan14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;bCheckCounterOrgan15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Harpsichordbsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;bCheckCounterHarpsichord = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;bCheckCounterHarpsichord1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;bCheckCounterHarpsichord2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;bCheckCounterHarpsichord3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;bCheckCounterHarpsichord4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;bCheckCounterHarpsichord5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;bCheckCounterHarpsichord6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;bCheckCounterHarpsichord7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;bCheckCounterHarpsichord8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;bCheckCounterHarpsichord9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;bCheckCounterHarpsichord10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;bCheckCounterHarpsichord11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;bCheckCounterHarpsichord12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;bCheckCounterHarpsichord13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;bCheckCounterHarpsichord14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;bCheckCounterHarpsichord15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Dx7bsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;bCheckCounterDx7 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;bCheckCounterDx71 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;bCheckCounterDx72 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;bCheckCounterDx73 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;bCheckCounterDx74 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;bCheckCounterDx75 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;bCheckCounterDx76 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;bCheckCounterDx77 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;bCheckCounterDx78 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;bCheckCounterDx79 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;bCheckCounterDx710 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;bCheckCounterDx711 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;bCheckCounterDx712 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;bCheckCounterDx713 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;bCheckCounterDx714 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;bCheckCounterDx715 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==1) {
                    mSoundPool.play(Cs80bsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][7] = true;bCheckCounterCs80 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][7] = true;bCheckCounterCs801 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][7] = true;bCheckCounterCs802 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][7] = true;bCheckCounterCs803 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][7] = true;bCheckCounterCs804 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][7] = true;bCheckCounterCs805 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][7] = true;bCheckCounterCs806 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][7] = true;bCheckCounterCs807 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][7] = true;bCheckCounterCs808 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][7] = true;bCheckCounterCs809 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][7] = true;bCheckCounterCs8010 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][7] = true;bCheckCounterCs8011 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][7] = true;bCheckCounterCs8012 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][7] = true;bCheckCounterCs8013 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][7] = true;bCheckCounterCs8014 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][7] = true;bCheckCounterCs8015 = 1; }
                }
                break;

            case R.id.c2:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianoccsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardccsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organccsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordccsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7ccsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80ccsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianoccsoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardccsoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organccsoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordccsoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7ccsoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80ccsoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(GrandPianoccsoundbelow, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Keyboardccsoundbelow, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Organccsoundbelow, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordccsoundbelow, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Dx7ccsoundbelow, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Cs80ccsoundbelow, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(GrandPianoccsound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;c2CheckCounterGrandPiano = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;c2CheckCounterGrandPiano1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;c2CheckCounterGrandPiano2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;c2CheckCounterGrandPiano3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;c2CheckCounterGrandPiano4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;c2CheckCounterGrandPiano5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;c2CheckCounterGrandPiano6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;c2CheckCounterGrandPiano7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;c2CheckCounterGrandPiano8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;c2CheckCounterGrandPiano9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;c2CheckCounterGrandPiano10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;c2CheckCounterGrandPiano11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;c2CheckCounterGrandPiano12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;c2CheckCounterGrandPiano13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;c2CheckCounterGrandPiano14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;c2CheckCounterGrandPiano15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Keyboardccsound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;c2CheckCounterKeyboard = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;c2CheckCounterKeyboard1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;c2CheckCounterKeyboard2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;c2CheckCounterKeyboard3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;c2CheckCounterKeyboard4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;c2CheckCounterKeyboard5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;c2CheckCounterKeyboard6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;c2CheckCounterKeyboard7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;c2CheckCounterKeyboard8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;c2CheckCounterKeyboard9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;c2CheckCounterKeyboard10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;c2CheckCounterKeyboard11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;c2CheckCounterKeyboard12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;c2CheckCounterKeyboard13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;c2CheckCounterKeyboard14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;c2CheckCounterKeyboard15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Organccsound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;c2CheckCounterOrgan = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;c2CheckCounterOrgan1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;c2CheckCounterOrgan2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;c2CheckCounterOrgan3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;c2CheckCounterOrgan4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;c2CheckCounterOrgan5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;c2CheckCounterOrgan6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;c2CheckCounterOrgan7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;c2CheckCounterOrgan8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;c2CheckCounterOrgan9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;c2CheckCounterOrgan10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;c2CheckCounterOrgan11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;c2CheckCounterOrgan12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;c2CheckCounterOrgan13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;c2CheckCounterOrgan14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;c2CheckCounterOrgan15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Harpsichordccsound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;c2CheckCounterHarpsichord = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;c2CheckCounterHarpsichord1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;c2CheckCounterHarpsichord2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;c2CheckCounterHarpsichord3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;c2CheckCounterHarpsichord4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;c2CheckCounterHarpsichord5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;c2CheckCounterHarpsichord6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;c2CheckCounterHarpsichord7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;c2CheckCounterHarpsichord8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;c2CheckCounterHarpsichord9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;c2CheckCounterHarpsichord10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;c2CheckCounterHarpsichord11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;c2CheckCounterHarpsichord12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;c2CheckCounterHarpsichord13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;c2CheckCounterHarpsichord14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;c2CheckCounterHarpsichord15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Dx7ccsound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;c2CheckCounterDx7 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;c2CheckCounterDx71 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;c2CheckCounterDx72 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;c2CheckCounterDx73 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;c2CheckCounterDx74 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;c2CheckCounterDx75 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;c2CheckCounterDx76 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;c2CheckCounterDx77 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;c2CheckCounterDx78 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;c2CheckCounterDx79 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;c2CheckCounterDx710 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;c2CheckCounterDx711 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;c2CheckCounterDx712 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;c2CheckCounterDx713 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;c2CheckCounterDx714 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;c2CheckCounterDx715 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==1) {
                    mSoundPool.play(Cs80ccsound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][8] = true;c2CheckCounterCs80 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][8] = true;c2CheckCounterCs801 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][8] = true;c2CheckCounterCs802 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][8] = true;c2CheckCounterCs803 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][8] = true;c2CheckCounterCs804 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][8] = true;c2CheckCounterCs805 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][8] = true;c2CheckCounterCs806 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][8] = true;c2CheckCounterCs807 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][8] = true;c2CheckCounterCs808 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][8] = true;c2CheckCounterCs809 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][8] = true;c2CheckCounterCs8010 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][8] = true;c2CheckCounterCs8011 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][8] = true;c2CheckCounterCs8012 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][8] = true;c2CheckCounterCs8013 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][8] = true;c2CheckCounterCs8014 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][8] = true;c2CheckCounterCs8015 = 1; }
                }
                break;

            case R.id.cs:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianocssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardcssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organcssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordcssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7cssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80cssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianocssoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardcssoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organcssoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordcssoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7cssoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80cssoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(GrandPianocssoundbelow, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Keyboardcssoundbelow, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Organcssoundbelow, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordcssoundbelow, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Dx7cssoundbelow, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Cs80cssoundbelow, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(GrandPianocssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;csCheckCounterGrandPiano = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;csCheckCounterGrandPiano1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;csCheckCounterGrandPiano2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;csCheckCounterGrandPiano3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;csCheckCounterGrandPiano4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;csCheckCounterGrandPiano5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;csCheckCounterGrandPiano6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;csCheckCounterGrandPiano7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;csCheckCounterGrandPiano8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;csCheckCounterGrandPiano9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;csCheckCounterGrandPiano10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;csCheckCounterGrandPiano11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;csCheckCounterGrandPiano12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;csCheckCounterGrandPiano13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;csCheckCounterGrandPiano14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;csCheckCounterGrandPiano15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Keyboardcssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;csCheckCounterKeyboard = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;csCheckCounterKeyboard1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;csCheckCounterKeyboard2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;csCheckCounterKeyboard3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;csCheckCounterKeyboard4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;csCheckCounterKeyboard5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;csCheckCounterKeyboard6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;csCheckCounterKeyboard7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;csCheckCounterKeyboard8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;csCheckCounterKeyboard9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;csCheckCounterKeyboard10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;csCheckCounterKeyboard11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;csCheckCounterKeyboard12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;csCheckCounterKeyboard13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;csCheckCounterKeyboard14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;csCheckCounterKeyboard15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Organcssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;csCheckCounterOrgan = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;csCheckCounterOrgan1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;csCheckCounterOrgan2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;csCheckCounterOrgan3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;csCheckCounterOrgan4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;csCheckCounterOrgan5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;csCheckCounterOrgan6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;csCheckCounterOrgan7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;csCheckCounterOrgan8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;csCheckCounterOrgan9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;csCheckCounterOrgan10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;csCheckCounterOrgan11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;csCheckCounterOrgan12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;csCheckCounterOrgan13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;csCheckCounterOrgan14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;csCheckCounterOrgan15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Harpsichordcssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;csCheckCounterHarpsichord = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;csCheckCounterHarpsichord1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;csCheckCounterHarpsichord2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;csCheckCounterHarpsichord3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;csCheckCounterHarpsichord4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;csCheckCounterHarpsichord5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;csCheckCounterHarpsichord6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;csCheckCounterHarpsichord7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;csCheckCounterHarpsichord8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;csCheckCounterHarpsichord9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;csCheckCounterHarpsichord10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;csCheckCounterHarpsichord11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;csCheckCounterHarpsichord12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;csCheckCounterHarpsichord13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;csCheckCounterHarpsichord14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;csCheckCounterHarpsichord15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Dx7cssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;csCheckCounterDx7 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;csCheckCounterDx71 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;csCheckCounterDx72 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;csCheckCounterDx73 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;csCheckCounterDx74 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;csCheckCounterDx75 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;csCheckCounterDx76 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;csCheckCounterDx77 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;csCheckCounterDx78 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;csCheckCounterDx79 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;csCheckCounterDx710 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;csCheckCounterDx711 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;csCheckCounterDx712 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;csCheckCounterDx713 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;csCheckCounterDx714 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;csCheckCounterDx715 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==1) {
                    mSoundPool.play(Cs80cssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][9] = true;csCheckCounterCs80 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][9] = true;csCheckCounterCs801 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][9] = true;csCheckCounterCs802 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][9] = true;csCheckCounterCs803 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][9] = true;csCheckCounterCs804 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][9] = true;csCheckCounterCs805 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][9] = true;csCheckCounterCs806 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][9] = true;csCheckCounterCs807 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][9] = true;csCheckCounterCs808 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][9] = true;csCheckCounterCs809 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][9] = true;csCheckCounterCs8010 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][9] = true;csCheckCounterCs8011 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][9] = true;csCheckCounterCs8012 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][9] = true;csCheckCounterCs8013 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][9] = true;csCheckCounterCs8014 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][9] = true;csCheckCounterCs8015 = 1; }
                }
                break;

            case R.id.ds:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianodssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboarddssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organdssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichorddssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7dssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80dssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianodssoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboarddssoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organdssoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichorddssoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7dssoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80dssoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(GrandPianodssoundbelow, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Keyboarddssoundbelow, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Organdssoundbelow, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Harpsichorddssoundbelow, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Dx7dssoundbelow, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Cs80dssoundbelow, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(GrandPianodssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;dsCheckCounterGrandPiano = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;dsCheckCounterGrandPiano1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;dsCheckCounterGrandPiano2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;dsCheckCounterGrandPiano3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;dsCheckCounterGrandPiano4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;dsCheckCounterGrandPiano5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;dsCheckCounterGrandPiano6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;dsCheckCounterGrandPiano7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;dsCheckCounterGrandPiano8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;dsCheckCounterGrandPiano9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;dsCheckCounterGrandPiano10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;dsCheckCounterGrandPiano11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;dsCheckCounterGrandPiano12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;dsCheckCounterGrandPiano13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;dsCheckCounterGrandPiano14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;dsCheckCounterGrandPiano15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Keyboarddssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;dsCheckCounterKeyboard = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;dsCheckCounterKeyboard1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;dsCheckCounterKeyboard2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;dsCheckCounterKeyboard3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;dsCheckCounterKeyboard4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;dsCheckCounterKeyboard5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;dsCheckCounterKeyboard6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;dsCheckCounterKeyboard7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;dsCheckCounterKeyboard8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;dsCheckCounterKeyboard9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;dsCheckCounterKeyboard10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;dsCheckCounterKeyboard11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;dsCheckCounterKeyboard12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;dsCheckCounterKeyboard13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;dsCheckCounterKeyboard14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;dsCheckCounterKeyboard15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Organdssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;dsCheckCounterOrgan = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;dsCheckCounterOrgan1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;dsCheckCounterOrgan2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;dsCheckCounterOrgan3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;dsCheckCounterOrgan4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;dsCheckCounterOrgan5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;dsCheckCounterOrgan6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;dsCheckCounterOrgan7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;dsCheckCounterOrgan8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;dsCheckCounterOrgan9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;dsCheckCounterOrgan10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;dsCheckCounterOrgan11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;dsCheckCounterOrgan12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;dsCheckCounterOrgan13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;dsCheckCounterOrgan14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;dsCheckCounterOrgan15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Harpsichorddssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;dsCheckCounterHarpsichord = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;dsCheckCounterHarpsichord1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;dsCheckCounterHarpsichord2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;dsCheckCounterHarpsichord3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;dsCheckCounterHarpsichord4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;dsCheckCounterHarpsichord5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;dsCheckCounterHarpsichord6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;dsCheckCounterHarpsichord7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;dsCheckCounterHarpsichord8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;dsCheckCounterHarpsichord9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;dsCheckCounterHarpsichord10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;dsCheckCounterHarpsichord11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;dsCheckCounterHarpsichord12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;dsCheckCounterHarpsichord13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;dsCheckCounterHarpsichord14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;dsCheckCounterHarpsichord15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Dx7dssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;dsCheckCounterDx7 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;dsCheckCounterDx71 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;dsCheckCounterDx72 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;dsCheckCounterDx73 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;dsCheckCounterDx74 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;dsCheckCounterDx75 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;dsCheckCounterDx76 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;dsCheckCounterDx77 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;dsCheckCounterDx78 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;dsCheckCounterDx79 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;dsCheckCounterDx710 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;dsCheckCounterDx711 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;dsCheckCounterDx712 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;dsCheckCounterDx713 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;dsCheckCounterDx714 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;dsCheckCounterDx715 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==1) {
                    mSoundPool.play(Cs80dssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][10] = true;dsCheckCounterCs80 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][10] = true;dsCheckCounterCs801 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][10] = true;dsCheckCounterCs802 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][10] = true;dsCheckCounterCs803 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][10] = true;dsCheckCounterCs804 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][10] = true;dsCheckCounterCs805 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][10] = true;dsCheckCounterCs806 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][10] = true;dsCheckCounterCs807 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][10] = true;dsCheckCounterCs808 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][10] = true;dsCheckCounterCs809 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][10] = true;dsCheckCounterCs8010 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][10] = true;dsCheckCounterCs8011 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][10] = true;dsCheckCounterCs8012 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][10] = true;dsCheckCounterCs8013 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][10] = true;dsCheckCounterCs8014 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][10] = true;dsCheckCounterCs8015 = 1; }
                }
                break;

            case R.id.fs:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianofssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardfssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organfssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordfssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7fssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80fssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianofssoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardfssoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organfssoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordfssoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7fssoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80fssoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(GrandPianofssoundbelow, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Keyboardfssoundbelow, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Organfssoundbelow, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordfssoundbelow, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Dx7fssoundbelow, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Cs80fssoundbelow, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(GrandPianofssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;fsCheckCounterGrandPiano = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;fsCheckCounterGrandPiano1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;fsCheckCounterGrandPiano2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;fsCheckCounterGrandPiano3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;fsCheckCounterGrandPiano4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;fsCheckCounterGrandPiano5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;fsCheckCounterGrandPiano6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;fsCheckCounterGrandPiano7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;fsCheckCounterGrandPiano8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;fsCheckCounterGrandPiano9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;fsCheckCounterGrandPiano10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;fsCheckCounterGrandPiano11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;fsCheckCounterGrandPiano12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;fsCheckCounterGrandPiano13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;fsCheckCounterGrandPiano14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;fsCheckCounterGrandPiano15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Keyboardfssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;fsCheckCounterKeyboard = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;fsCheckCounterKeyboard1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;fsCheckCounterKeyboard2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;fsCheckCounterKeyboard3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;fsCheckCounterKeyboard4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;fsCheckCounterKeyboard5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;fsCheckCounterKeyboard6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;fsCheckCounterKeyboard7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;fsCheckCounterKeyboard8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;fsCheckCounterKeyboard9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;fsCheckCounterKeyboard10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;fsCheckCounterKeyboard11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;fsCheckCounterKeyboard12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;fsCheckCounterKeyboard13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;fsCheckCounterKeyboard14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;fsCheckCounterKeyboard15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Organfssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;fsCheckCounterOrgan = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;fsCheckCounterOrgan1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;fsCheckCounterOrgan2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;fsCheckCounterOrgan3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;fsCheckCounterOrgan4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;fsCheckCounterOrgan5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;fsCheckCounterOrgan6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;fsCheckCounterOrgan7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;fsCheckCounterOrgan8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;fsCheckCounterOrgan9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;fsCheckCounterOrgan10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;fsCheckCounterOrgan11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;fsCheckCounterOrgan12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;fsCheckCounterOrgan13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;fsCheckCounterOrgan14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;fsCheckCounterOrgan15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Harpsichordfssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;fsCheckCounterHarpsichord = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;fsCheckCounterHarpsichord1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;fsCheckCounterHarpsichord2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;fsCheckCounterHarpsichord3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;fsCheckCounterHarpsichord4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;fsCheckCounterHarpsichord5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;fsCheckCounterHarpsichord6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;fsCheckCounterHarpsichord7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;fsCheckCounterHarpsichord8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;fsCheckCounterHarpsichord9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;fsCheckCounterHarpsichord10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;fsCheckCounterHarpsichord11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;fsCheckCounterHarpsichord12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;fsCheckCounterHarpsichord13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;fsCheckCounterHarpsichord14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;fsCheckCounterHarpsichord15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Dx7fssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;fsCheckCounterDx7 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;fsCheckCounterDx71 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;fsCheckCounterDx72 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;fsCheckCounterDx73 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;fsCheckCounterDx74 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;fsCheckCounterDx75 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;fsCheckCounterDx76 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;fsCheckCounterDx77 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;fsCheckCounterDx78 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;fsCheckCounterDx79 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;fsCheckCounterDx710 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;fsCheckCounterDx711 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;fsCheckCounterDx712 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;fsCheckCounterDx713 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;fsCheckCounterDx714 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;fsCheckCounterDx715 = 1; }

                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==1) {
                    mSoundPool.play(Cs80fssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][11] = true;fsCheckCounterCs80 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][11] = true;fsCheckCounterCs801 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][11] = true;fsCheckCounterCs802 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][11] = true;fsCheckCounterCs803 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][11] = true;fsCheckCounterCs804 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][11] = true;fsCheckCounterCs805 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][11] = true;fsCheckCounterCs806 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][11] = true;fsCheckCounterCs807 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][11] = true;fsCheckCounterCs808 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][11] = true;fsCheckCounterCs809 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][11] = true;fsCheckCounterCs8010 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][11] = true;fsCheckCounterCs8011 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][11] = true;fsCheckCounterCs8012 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][11] = true;fsCheckCounterCs8013 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][11] = true;fsCheckCounterCs8014 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][11] = true;fsCheckCounterCs8015 = 1; }
                }
                break;

            case R.id.gs:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianogssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardgssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organgssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordgssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7gssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80gssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianogssoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardgssoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organgssoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordgssoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7gssoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80gssoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(GrandPianogssoundbelow, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Keyboardgssoundbelow, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Organgssoundbelow, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordgssoundbelow, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Dx7gssoundbelow, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Cs80gssoundbelow, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(GrandPianogssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;gsCheckCounterGrandPiano = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;gsCheckCounterGrandPiano1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;gsCheckCounterGrandPiano2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;gsCheckCounterGrandPiano3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;gsCheckCounterGrandPiano4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;gsCheckCounterGrandPiano5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;gsCheckCounterGrandPiano6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;gsCheckCounterGrandPiano7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;gsCheckCounterGrandPiano8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;gsCheckCounterGrandPiano9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;gsCheckCounterGrandPiano10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;gsCheckCounterGrandPiano11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;gsCheckCounterGrandPiano12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;gsCheckCounterGrandPiano13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;gsCheckCounterGrandPiano14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;gsCheckCounterGrandPiano15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Keyboardgssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;gsCheckCounterKeyboard = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;gsCheckCounterKeyboard1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;gsCheckCounterKeyboard2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;gsCheckCounterKeyboard3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;gsCheckCounterKeyboard4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;gsCheckCounterKeyboard5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;gsCheckCounterKeyboard6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;gsCheckCounterKeyboard7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;gsCheckCounterKeyboard8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;gsCheckCounterKeyboard9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;gsCheckCounterKeyboard10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;gsCheckCounterKeyboard11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;gsCheckCounterKeyboard12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;gsCheckCounterKeyboard13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;gsCheckCounterKeyboard14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;gsCheckCounterKeyboard15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Organgssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;gsCheckCounterOrgan = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;gsCheckCounterOrgan1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;gsCheckCounterOrgan2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;gsCheckCounterOrgan3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;gsCheckCounterOrgan4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;gsCheckCounterOrgan5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;gsCheckCounterOrgan6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;gsCheckCounterOrgan7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;gsCheckCounterOrgan8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;gsCheckCounterOrgan9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;gsCheckCounterOrgan10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;gsCheckCounterOrgan11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;gsCheckCounterOrgan12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;gsCheckCounterOrgan13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;gsCheckCounterOrgan14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;gsCheckCounterOrgan15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Harpsichordgssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;gsCheckCounterHarpsichord = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;gsCheckCounterHarpsichord1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;gsCheckCounterHarpsichord2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;gsCheckCounterHarpsichord3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;gsCheckCounterHarpsichord4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;gsCheckCounterHarpsichord5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;gsCheckCounterHarpsichord6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;gsCheckCounterHarpsichord7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;gsCheckCounterHarpsichord8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;gsCheckCounterHarpsichord9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;gsCheckCounterHarpsichord10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;gsCheckCounterHarpsichord11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;gsCheckCounterHarpsichord12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;gsCheckCounterHarpsichord13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;gsCheckCounterHarpsichord14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;gsCheckCounterHarpsichord15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Dx7gssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;gsCheckCounterHarpsichord = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;gsCheckCounterHarpsichord1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;gsCheckCounterHarpsichord2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;gsCheckCounterHarpsichord3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;gsCheckCounterHarpsichord4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;gsCheckCounterHarpsichord5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;gsCheckCounterHarpsichord6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;gsCheckCounterHarpsichord7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;gsCheckCounterHarpsichord8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;gsCheckCounterHarpsichord9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;gsCheckCounterHarpsichord10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;gsCheckCounterHarpsichord11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;gsCheckCounterHarpsichord12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;gsCheckCounterHarpsichord13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;gsCheckCounterHarpsichord14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;gsCheckCounterHarpsichord15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==1) {
                    mSoundPool.play(Cs80gssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][12] = true;gsCheckCounterCs80 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][12] = true;gsCheckCounterCs801 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][12] = true;gsCheckCounterCs802 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][12] = true;gsCheckCounterCs803 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][12] = true;gsCheckCounterCs804 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][12] = true;gsCheckCounterCs805 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][12] = true;gsCheckCounterCs806 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][12] = true;gsCheckCounterCs807 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][12] = true;gsCheckCounterCs808 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][12] = true;gsCheckCounterCs809 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][12] = true;gsCheckCounterCs8010 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][12] = true;gsCheckCounterCs8011 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][12] = true;gsCheckCounterCs8012 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][12] = true;gsCheckCounterCs8013 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][12] = true;gsCheckCounterCs8014 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][12] = true;gsCheckCounterCs8015 = 1; }
                }
                break;




                //break;

        }return false;}

    public boolean onTouchEvent2(View view, MotionEvent motionEvent) {
        switch(view.getId()) {
            case R.id.as:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianoassound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardassound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organassound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordassound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7assound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80assound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianoassoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardassoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organassoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordassoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7assoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80assoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(GrandPianoassoundbelow, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Keyboardassoundbelow, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Organassoundbelow, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordassoundbelow, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Dx7assoundbelow, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Cs80assoundbelow, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(GrandPianoassound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;asCheckCounterGrandPiano = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;asCheckCounterGrandPiano1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;asCheckCounterGrandPiano2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;asCheckCounterGrandPiano3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;asCheckCounterGrandPiano4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;asCheckCounterGrandPiano5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;asCheckCounterGrandPiano6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;asCheckCounterGrandPiano7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;asCheckCounterGrandPiano8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;asCheckCounterGrandPiano9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;asCheckCounterGrandPiano10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;asCheckCounterGrandPiano11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;asCheckCounterGrandPiano12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;asCheckCounterGrandPiano13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;asCheckCounterGrandPiano14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;asCheckCounterGrandPiano15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Keyboardassound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;asCheckCounterKeyboard = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;asCheckCounterKeyboard1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;asCheckCounterKeyboard2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;asCheckCounterKeyboard3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;asCheckCounterKeyboard4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;asCheckCounterKeyboard5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;asCheckCounterKeyboard6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;asCheckCounterKeyboard7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;asCheckCounterKeyboard8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;asCheckCounterKeyboard9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;asCheckCounterKeyboard10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;asCheckCounterKeyboard11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;asCheckCounterKeyboard12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;asCheckCounterKeyboard13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;asCheckCounterKeyboard14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;asCheckCounterKeyboard15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Organassound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;asCheckCounterOrgan = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;asCheckCounterOrgan1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;asCheckCounterOrgan2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;asCheckCounterOrgan3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;asCheckCounterOrgan4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;asCheckCounterOrgan5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;asCheckCounterOrgan6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;asCheckCounterOrgan7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;asCheckCounterOrgan8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;asCheckCounterOrgan9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;asCheckCounterOrgan10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;asCheckCounterOrgan11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;asCheckCounterOrgan12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;asCheckCounterOrgan13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;asCheckCounterOrgan14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;asCheckCounterOrgan15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Harpsichordassound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;asCheckCounterHarpsichord = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;asCheckCounterHarpsichord1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;asCheckCounterHarpsichord2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;asCheckCounterHarpsichord3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;asCheckCounterHarpsichord4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;asCheckCounterHarpsichord5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;asCheckCounterHarpsichord6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;asCheckCounterHarpsichord7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;asCheckCounterHarpsichord8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;asCheckCounterHarpsichord9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;asCheckCounterHarpsichord10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;asCheckCounterHarpsichord11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;asCheckCounterHarpsichord12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;asCheckCounterHarpsichord13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;asCheckCounterHarpsichord14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;asCheckCounterHarpsichord15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Dx7assound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;asCheckCounterDx7 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;asCheckCounterDx71 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;asCheckCounterDx72 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;asCheckCounterDx73 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;asCheckCounterDx74 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;asCheckCounterDx75 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;asCheckCounterDx76 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;asCheckCounterDx77 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;asCheckCounterDx78 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;asCheckCounterDx79 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;asCheckCounterDx710 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;asCheckCounterDx711 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;asCheckCounterDx712 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;asCheckCounterDx713 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;asCheckCounterDx714 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;asCheckCounterDx715 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==1) {
                    mSoundPool.play(Cs80assound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][13] = true;asCheckCounterCs80 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][13] = true;asCheckCounterCs801 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][13] = true;asCheckCounterCs802 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][13] = true;asCheckCounterCs803 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][13] = true;asCheckCounterCs804 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][13] = true;asCheckCounterCs805 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][13] = true;asCheckCounterCs806 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][13] = true;asCheckCounterCs807 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][13] = true;asCheckCounterCs808 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][13] = true;asCheckCounterCs809 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][13] = true;asCheckCounterCs8010 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][13] = true;asCheckCounterCs8011 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][13] = true;asCheckCounterCs8012 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][13] = true;asCheckCounterCs8013 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][13] = true;asCheckCounterCs8014 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][13] = true;asCheckCounterCs8015 = 1; }
                }
                break;

            case R.id.css:
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianocsssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardcsssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organcsssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordcsssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7csssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80csssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(GrandPianocsssoundabove, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Keyboardcsssoundabove, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Organcsssoundabove, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordcsssoundabove, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Dx7csssoundabove, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==1 && octaveCounterDown==0 && !switchChords.isChecked()) { mSoundPool.play(Cs80csssoundabove, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(GrandPianocsssoundbelow, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Keyboardcsssoundbelow, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Organcsssoundbelow, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Harpsichordcsssoundbelow, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Dx7csssoundbelow, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f); }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==0 && octaveCounterUp==0 && octaveCounterDown==1 && !switchChords.isChecked()) { mSoundPool.play(Cs80csssoundbelow, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f); }

                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==1 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(GrandPianocsssound, progressChangedValueGrandPiano, progressChangedValueGrandPiano, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;cs2CheckCounterGrandPiano = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;cs2CheckCounterGrandPiano1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;cs2CheckCounterGrandPiano2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;cs2CheckCounterGrandPiano3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;cs2CheckCounterGrandPiano4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;cs2CheckCounterGrandPiano5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;cs2CheckCounterGrandPiano6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;cs2CheckCounterGrandPiano7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;cs2CheckCounterGrandPiano8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;cs2CheckCounterGrandPiano9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;cs2CheckCounterGrandPiano10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;cs2CheckCounterGrandPiano11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;cs2CheckCounterGrandPiano12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;cs2CheckCounterGrandPiano13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;cs2CheckCounterGrandPiano14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;cs2CheckCounterGrandPiano15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==1 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Keyboardcsssound, progressChangedValueKeyboard, progressChangedValueKeyboard, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;cs2CheckCounterKeyboard = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;cs2CheckCounterKeyboard1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;cs2CheckCounterKeyboard2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;cs2CheckCounterKeyboard3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;cs2CheckCounterKeyboard4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;cs2CheckCounterKeyboard5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;cs2CheckCounterKeyboard6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;cs2CheckCounterKeyboard7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;cs2CheckCounterKeyboard8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;cs2CheckCounterKeyboard9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;cs2CheckCounterKeyboard10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;cs2CheckCounterKeyboard11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;cs2CheckCounterKeyboard12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;cs2CheckCounterKeyboard13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;cs2CheckCounterKeyboard14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;cs2CheckCounterKeyboard15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==1 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Organcsssound, progressChangedValueOrgan, progressChangedValueOrgan, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;cs2CheckCounterOrgan = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;cs2CheckCounterOrgan1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;cs2CheckCounterOrgan2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;cs2CheckCounterOrgan3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;cs2CheckCounterOrgan4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;cs2CheckCounterOrgan5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;cs2CheckCounterOrgan6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;cs2CheckCounterOrgan7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;cs2CheckCounterOrgan8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;cs2CheckCounterOrgan9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;cs2CheckCounterOrgan10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;cs2CheckCounterOrgan11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;cs2CheckCounterOrgan12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;cs2CheckCounterOrgan13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;cs2CheckCounterOrgan14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;cs2CheckCounterOrgan15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==1 && dx7Counter==0 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Harpsichordcsssound, progressChangedValueHarpsichord, progressChangedValueHarpsichord, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;cs2CheckCounterHarpsichord = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;cs2CheckCounterHarpsichord1 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;cs2CheckCounterHarpsichord2 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;cs2CheckCounterHarpsichord3 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;cs2CheckCounterHarpsichord4 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;cs2CheckCounterHarpsichord5 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;cs2CheckCounterHarpsichord6 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;cs2CheckCounterHarpsichord7 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;cs2CheckCounterHarpsichord8 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;cs2CheckCounterHarpsichord9 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;cs2CheckCounterHarpsichord10 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;cs2CheckCounterHarpsichord11 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;cs2CheckCounterHarpsichord12 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;cs2CheckCounterHarpsichord13 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;cs2CheckCounterHarpsichord14 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;cs2CheckCounterHarpsichord15 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==1 && cs80Counter==0 && sequencerCounter4==1) {
                    mSoundPool.play(Dx7csssound, progressChangedValueDx7, progressChangedValueDx7, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;cs2CheckCounterDx7 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;cs2CheckCounterDx71 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;cs2CheckCounterDx72 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;cs2CheckCounterDx73 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;cs2CheckCounterDx74 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;cs2CheckCounterDx75 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;cs2CheckCounterDx76 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;cs2CheckCounterDx77 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;cs2CheckCounterDx78 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;cs2CheckCounterDx79 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;cs2CheckCounterDx710 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;cs2CheckCounterDx711 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;cs2CheckCounterDx712 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;cs2CheckCounterDx713 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;cs2CheckCounterDx714 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;cs2CheckCounterDx715 = 1; }
                }
                if(motionEvent.getAction() == MotionEvent.ACTION_DOWN && grandPianoCounter==0 && keyboardCounter==0 && organCounter==0 && harpsichordCounter==0 && dx7Counter==0 && cs80Counter==1 && sequencerCounter4==1) {
                    mSoundPool.play(Cs80csssound, progressChangedValueCs80, progressChangedValueCs80, 0, 0, 1.0f);
                    sequencerCheckTime = System.currentTimeMillis(); //1
                    sequencerCompareTime = (sequencerCheckTime - sequencerStartTime); //2
                    if (sequencerCompareTime >= 0 && sequencerCompareTime <= 250) { sequencerBoolean[0][14] = true;cs2CheckCounterCs80 = 1; }
                    if (sequencerCompareTime >= 251 && sequencerCompareTime <= 500) { sequencerBoolean[1][14] = true;cs2CheckCounterCs801 = 1; }
                    if (sequencerCompareTime >= 501 && sequencerCompareTime <= 750) { sequencerBoolean[2][14] = true;cs2CheckCounterCs802 = 1; }
                    if (sequencerCompareTime >= 751 && sequencerCompareTime <= 1000) { sequencerBoolean[3][14] = true;cs2CheckCounterCs803 = 1; }
                    if (sequencerCompareTime >= 1001 && sequencerCompareTime <= 1250) { sequencerBoolean[4][14] = true;cs2CheckCounterCs804 = 1; }
                    if (sequencerCompareTime >= 1251 && sequencerCompareTime <= 1500) { sequencerBoolean[5][14] = true;cs2CheckCounterCs805 = 1; }
                    if (sequencerCompareTime >= 1501 && sequencerCompareTime <= 1750) { sequencerBoolean[6][14] = true;cs2CheckCounterCs806 = 1; }
                    if (sequencerCompareTime >= 1751 && sequencerCompareTime <= 2000) { sequencerBoolean[7][14] = true;cs2CheckCounterCs807 = 1; }
                    if (sequencerCompareTime >= 2001 && sequencerCompareTime <= 2250) { sequencerBoolean[8][14] = true;cs2CheckCounterCs808 = 1; }
                    if (sequencerCompareTime >= 2251 && sequencerCompareTime <= 2500) { sequencerBoolean[9][14] = true;cs2CheckCounterCs809 = 1; }
                    if (sequencerCompareTime >= 2501 && sequencerCompareTime <= 2750) { sequencerBoolean[10][14] = true;cs2CheckCounterCs8010 = 1; }
                    if (sequencerCompareTime >= 2751 && sequencerCompareTime <= 3000) { sequencerBoolean[11][14] = true;cs2CheckCounterCs8011 = 1; }
                    if (sequencerCompareTime >= 3001 && sequencerCompareTime <= 3250) { sequencerBoolean[12][14] = true;cs2CheckCounterCs8012 = 1; }
                    if (sequencerCompareTime >= 3251 && sequencerCompareTime <= 3500) { sequencerBoolean[13][14] = true;cs2CheckCounterCs8013 = 1; }
                    if (sequencerCompareTime >= 3501 && sequencerCompareTime <= 3750) { sequencerBoolean[14][14] = true;cs2CheckCounterCs8014 = 1; }
                    if (sequencerCompareTime >= 3751 && sequencerCompareTime <= 4000) { sequencerBoolean[15][14] = true;cs2CheckCounterCs8015 = 1; }
                }
        break; }return false;}

}