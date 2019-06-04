package jkind;

import jkind.realizability.JRealizabilitySolverOption;

public class JRealizabilitySettings extends Settings {
	public int n = 200;
	public int timeout = 100;
	public boolean excel = false;
	public boolean xml = false;
	public boolean extendCounterexample = false;
	public boolean reduce = false;
	public boolean scratch = false;
	public boolean synthesis = false;
	public boolean fixpoint = false;
    public boolean compact = false;
    public boolean allinclusive = false;
    public JRealizabilitySolverOption solver = JRealizabilitySolverOption.Z3;
    public boolean nondet = false;
}
