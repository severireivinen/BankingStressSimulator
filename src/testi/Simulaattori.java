package testi;

import simu.framework.*;
import simu.framework.Trace.Level;
import simu.model.OmaMoottori;

public class Simulaattori {

	public static void main(String[] args) {

		Trace.setTraceLevel(Level.ERR);
		Moottori m = new OmaMoottori();
		m.setSimulointiaika(5000);	//7000
		m.aja();

	}

}
