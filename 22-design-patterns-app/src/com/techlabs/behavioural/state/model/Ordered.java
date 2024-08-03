package com.techlabs.behavioural.state.model;

public class Ordered implements IPacketState{

	@Override
	public void next(Packet packet) {
		// TODO Auto-generated method stub
		packet.setState(new Shipped ());
	}

	@Override
	public void previous(Packet Packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet is in Initial : "+this);
	}

	@Override
	public void current(Packet Packet) {
		// TODO Auto-generated method stub
		System.out.println("Packet is in Ordered State" +this);
	}

	
	
	

}
