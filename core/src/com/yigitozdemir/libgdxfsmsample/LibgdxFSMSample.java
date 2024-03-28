package com.yigitozdemir.libgdxfsmsample;

import com.badlogic.gdx.Game;

public class LibgdxFSMSample extends Game {

	@Override
	public void create() {
		SampleScreen sampleScreen = new SampleScreen(this);
		setScreen(sampleScreen);
	}

}
