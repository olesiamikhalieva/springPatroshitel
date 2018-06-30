package quoters;

public class ProfilingController implements ProfilingControllerMBean{

    private boolean enabled;

   public boolean isEnabled(){
       return enabled=true;
   }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }
}
