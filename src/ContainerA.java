import jade.core.ProfileImpl;
import jade.core.Runtime;
import jade.wrapper.AgentContainer;
import jade.wrapper.AgentController;

public class ContainerA {
    public static void main(String[] args) {
        try {
            Runtime runtime = Runtime.instance();
            ProfileImpl profile = new ProfileImpl(false);
            profile.setParameter(ProfileImpl.MAIN_HOST, "localhost");
            AgentContainer container = runtime.createAgentContainer(profile);
            AgentController controller = container.createNewAgent(
                    "AgentA",
                    "AgentA",
                    new Object[]{}
            );
            controller.start();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
