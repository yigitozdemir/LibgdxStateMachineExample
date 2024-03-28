package com.yigitozdemir.libgdxfsmsample;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.ai.GdxAI;
import com.badlogic.gdx.ai.msg.MessageManager;
import com.yigitozdemir.libgdxfsmsample.units.zombie.Zombie;

public class SampleScreen implements Screen {
	private LibgdxFSMSample libgdxFSMSample;
	
	private Zombie zombie;
	
	public SampleScreen(LibgdxFSMSample fsmSample) {
		this.libgdxFSMSample = fsmSample;
	
		zombie = new Zombie();
	}
	
	@Override
	public void show() {
	}

	@Override
	public void render(float delta) {
		GdxAI.getTimepiece().update(delta);
		MessageManager.getInstance().update();
		zombie.update();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void hide() {
	}

	@Override
	public void dispose() {
	}
}
