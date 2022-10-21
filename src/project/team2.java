package project;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class team2 extends Agent {
    
    @Override
    protected void setup(){
        addBehaviour(new CyclicBehaviour(){
            @Override
            public void action() {
                ACLMessage acl2 = receive();
                if(acl2 !=null){
                    String con = acl2.getContent();
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