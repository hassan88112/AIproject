package project;

import jade.core.AID;
import jade.core.Agent;
import jade.lang.acl.ACLMessage;
import java.util.Random;

public class center_agent extends Agent {
    Random random = new Random();
    private center_gui gui ;
    
    @Override
    protected void setup(){
        gui = new center_gui(this) ;
        //gui.showgui();
        
        ACLMessage msg1 = new ACLMessage(ACLMessage.INFORM);
        msg1.addReceiver(new AID ("team1", false));
        msg1.setContent("Details For team1 :-\nOpponent Team : team2\nMatch Playground: Santiago Bernabeu \nMatch Time: 20:00\n\n    --------------------------\n"); 
        send(msg1);
        
        ACLMessage msg2 = new ACLMessage(ACLMessage.INFORM);
        msg2.addReceiver(new AID ("team2", false));
        msg2.setContent("Details For team2 :-\nOpponent Team : team1\nMatch Playground: Santiago Bernabeu \nMatch Time: 20:00\n\n    --------------------------\n"); 
        send(msg2);
        
        ACLMessage msg3 = new ACLMessage(ACLMessage.INFORM);
        msg3.addReceiver(new AID ("team3", false));
        msg3.setContent("Details For team3 :-\nOpponent Team : team4\nMatch Playground: Santiago Bernabeu \nMatch Time: 20:00\n\n    --------------------------\n"); 
        send(msg3);
        
        ACLMessage msg4 = new ACLMessage(ACLMessage.INFORM);
        msg4.addReceiver(new AID ("team4", false));
        msg4.setContent("Details For team4 :-\nOpponent Team : team3\nMatch Playground: Santiago Bernabeu \nMatch Time: 20:00\n\n    --------------------------\n"); 
        send(msg4);
        
        int s1 = random.nextInt(10);
        int s2 = random.nextInt(10);
        while(s1==s2){
            s2=random.nextInt(10);
        }
        String res1 ="";
        if (s1 > s2)
            res1 = "team1";
        else if (s2>s1)
            res1 = "team2";
        
        
        int s3 = random.nextInt();
        int s4 = random.nextInt();
        while(s3==s4){
            s4=random.nextInt(10);
        }
        String res2 ="";
        if (s3> s4)
            res2 = "team3";
        else if (s4>s3)
            res2 = "team4";
        
        ACLMessage msg17 = new ACLMessage(ACLMessage.INFORM);
        msg17.addReceiver(new AID (res1, false));
        msg17.setContent("Details For "+res1+" :-\nOpponent Team : "+res2+"\nMatch Playground: Santiago Bernabeu \nMatch Time: 22:00\n\n    --------------------------\n"); 
        send(msg17);
        
        ACLMessage msg18 = new ACLMessage(ACLMessage.INFORM);
        msg18.addReceiver(new AID (res2, false));
        msg18.setContent("Details For "+res2+" :-\nOpponent Team : "+res1+"\nMatch Playground: Santiago Bernabeu\nMatch Time: 22:00\n\n    --------------------------\n"); 
        send(msg18);
        
        
        
        
        
    }
    
    @Override
    protected void takeDown(){
        System.out.println("Agent killed");
    }
    
}
