package com.techlabs.behavioural.state.model;

public class Delivered implements IPacketState {

    @Override
    public void next(Packet packet) {
        System.out.println("The packet is already delivered. It cannot move to the next state.");
    }

    @Override
    public void previous(Packet packet) {
        packet.setState(new Shipped());
    }

    @Override
    public void current(Packet packet) {
        System.out.println("The packet is currently in Delivered state.");
    }
}
