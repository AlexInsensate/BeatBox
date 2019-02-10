package android.bignerdranch.com.beatbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

public class SoundViewModel extends BaseObservable {
    private BeatBox mBeatBox;
    private Sound mSound;

    public SoundViewModel(BeatBox beatBox) {
        mBeatBox = beatBox;
    }
    @Bindable
    public String getTitle(){
        return mSound.getName();
    }

    public Sound getSound() {
        return mSound;
    }

    public void setSound(Sound sound) {
        mSound = sound;
        notifyChange();
    }
}
