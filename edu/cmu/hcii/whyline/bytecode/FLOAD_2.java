package edu.cmu.hcii.whyline.bytecode;


import edu.cmu.hcii.whyline.trace.EventKind;

/**
 * @author Andrew J. Ko
 *
 */ 
public final class FLOAD_2 extends GetLocal {

	public FLOAD_2(CodeAttribute method) {
		super(method);
	}

	public int getLocalID() { return 2; }

	public final int getOpcode() { return 36; }
	public int byteLength() { return 1; }

	public EventKind getTypeProduced() { return EventKind.CONSTANT_FLOAT_PRODUCED; }

}
