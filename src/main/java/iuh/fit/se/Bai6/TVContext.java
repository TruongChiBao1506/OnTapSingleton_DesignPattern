package iuh.fit.se.Bai6;

public class TVContext implements State{
    private State tvState;

    public void setState(State tvState) {
        this.tvState = tvState;
    }
    public State getState() {
        return this.tvState;
    }

    @Override
    public void doAction() {
        this.tvState.doAction();
    }
}
