package project;

import jade.core.Profile;
import jade.core.ProfileImpl;
import jade.wrapper.AgentController;
import jade.wrapper.ContainerController;
import jade.wrapper.StaleProxyException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Project {

    
    public static void main(String[] args) {
        
        jade.core.Runtime r = jade.core.Runtime.instance();
        Profile f = new ProfileImpl("localhost",1000, "Project");
        ContainerController main1 = r.createMainContainer(f);
        
        try {
            AgentController rmatest = main1.createNewAgent("new rma", "jade.tools.rma.rma", null);
            rmatest.start();
            
            AgentController center_agent = main1.createNewAgent("center_agent", "project.center_agent", null);
            center_agent.start();
            
            AgentController team1 = main1.createNewAgent("team1", "project.team1", null);
            team1.start();
            
            AgentController team2 = main1.createNewAgent("team2", "project.team2", null);
            team2.start();
            /*
            AgentController team3 = main1.createNewAgent("team3", "project.team3", null);
            team3.start();
            
            AgentController team4 = main1.createNewAgent("team4", "project.team4", null);
            team4.start();
            /*
            AgentController agent2 = main1.createNewAgent("agent2", "jadetest.agenttest2", null);
            agent2.start();*/
            
            
        } catch (StaleProxyException ex) {
            Logger.getLogger(Project.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
