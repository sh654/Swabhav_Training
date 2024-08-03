package com.techlabs.behavioural.state.model;

public class Shipped implements IPacketState {

    @Override
    public void next(Packet packet) {
        packet.setState(new Delivered());
    }

    @Override
    public void previous(Packet packet) {
        packet.setState(new Ordered());
    }

    @Override
    public void current(Packet packet) {
        System.out.println("The packet is currently in Shipped state.");
    }
}
