package project;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class team1 extends Agent {
    
    @Override
    protected void setup(){
        addBehaviour(new CyclicBehaviour(){
            @Override
            public void action() {
                ACLMessage acl1 = receive();
                if(acl1 !=null){
                    String con = acl1.getContent();
                    System.out.println(con);
            }
            }
            
        });
    }
    
    @Override
    protected void takeDown(){
        System.out.println("Agent killed");
    }
    
}