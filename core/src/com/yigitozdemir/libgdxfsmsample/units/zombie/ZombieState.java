package com.yigitozdemir.libgdxfsmsample.units.zombie;

import com.badlogic.gdx.ai.fsm.State;
import com.badlogic.gdx.ai.msg.Telegram;

public enum ZombieState implements State<Zombie> {
	WALK(){
		@Override
		public void enter(Zombie entity) {
			System.out.println("Walk state starts");
		}
		@Override
		public void update(Zombie entity) {
			entity.getStateMachine().changeState(EAT);
		}
		@Override
		public void exit(Zombie entity) {
		}
		@Override
		public boolean onMessage(Zombie entity, Telegram telegram) {
			return false;
		}
	},
	
	EAT(){

		@Override
		public void enter(Zombie entity) {
			System.out.println("Eat state starts");
		}
		@Override
		public void update(Zombie entity) {
			entity.getStateMachine().changeState(WALK);
		}
		@Override
		public void exit(Zombie entity) {
		}
		@Override
		public boolean onMessage(Zombie entity, Telegram telegram) {
			return false;
		}
	}
}
