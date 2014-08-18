package execute;

import calc.Calc;

public class Executor {
	
	public void execute() {
		System.out.println(new Calc().add(2.5, 4.3));
	}

	public static void main(String[] args) {
		new Executor().execute();
	}

}
