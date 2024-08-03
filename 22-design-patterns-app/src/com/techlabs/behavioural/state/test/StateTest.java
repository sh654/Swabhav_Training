package com.techlabs.behavioural.state.test;

import com.techlabs.behavioural.state.model.*;

public class StateTest {

    public static void main(String[] args) {
        Packet packet = new Packet();
        
        packet.printCurrentStatus();
        packet.goToNextState();
        
        packet.printCurrentStatus();
        packet.goToNextState();
        
        packet.printCurrentStatus();
        packet.goToNextState();
        
        packet.goToPreviousState();
        packet.printCurrentStatus();
    }
}
