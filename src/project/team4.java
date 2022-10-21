package project;

import jade.core.Agent;
import jade.core.behaviours.CyclicBehaviour;
import jade.lang.acl.ACLMessage;

public class team4 extends Agent {
    
    @Override
    protected void setup(){
        addBehaviour(new CyclicBehaviour(){
            @Override
            public void action() {
                ACLMessage acl4 = receive();
                if(acl4 !=null){
                    String con = acl4.getContent();
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