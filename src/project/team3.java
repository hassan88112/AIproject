package project;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class team3 extends Agent {
    
    @Override
    protected void setup(){
        addBehaviour(new CyclicBehaviour(){
            @Override
            public void action() {
                ACLMessage acl3 = receive();
                if(acl3 !=null){
                    String con = acl3.getContent();
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