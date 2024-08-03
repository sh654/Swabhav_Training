package com.techlabs.behavioural.state.model;

public interface IPacketState {

	void next(Packet packet);
	void previous(Packet Packet);
	void current(Packet Packet);
	
	
}
