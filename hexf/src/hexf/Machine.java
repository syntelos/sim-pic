package hexf;

/**
 * Machine life cycle
 */
public interface Machine {
    /**
     * Initialize machine with hex code input.
     */
    public Machine machineInit(CodeStream code);
    /**
     * After init stage complete and before user input.
     */
    public Machine machineReady();
    /**
     * Process user input on a ready state.
     * @return Continue processing, otherwise transition immediately
     * to machine destroy.
     */
    public boolean machineRun(Command user);
    /**
     * Called on halt/exit (from any state from init to run,
     * inclusive).
     */
    public Machine machineDestroy();

}
