package com.yigitozdemir.libgdxfsmsample.units.zombie;

import com.badlogic.gdx.ai.fsm.DefaultStateMachine;
import com.badlogic.gdx.ai.fsm.StateMachine;
import com.badlogic.gdx.ai.msg.Telegram;
import com.badlogic.gdx.ai.msg.Telegraph;

public class Zombie implements Telegraph {
	private StateMachine<Zombie, ZombieState> stateMachine;
	
	public Zombie() {
		System.out.println("zombie is awaking");
		stateMachine = new DefaultStateMachine<Zombie, ZombieState>(this, ZombieState.WALK);
	}
	
	@Override
	public boolean handleMessage(Telegram msg) {
		return stateMachine.handleMessage(msg);
	}
	public void update() {
		stateMachine.update();
	}
	
	/**
	 * Returns the state machine
	 * @return
	 */
	public StateMachine<Zombie, ZombieState> getStateMachine(){
		return stateMachine;
	}
}
