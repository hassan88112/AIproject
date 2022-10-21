package project;

import jade.core.Agent;

public class team7 extends Agent {
    
    @Override
    protected void setup(){
        System.out.println("Agent Created");
    }
    
    @Override
    protected void takeDown(){
        System.out.println("Agent killed");
    }
    
}