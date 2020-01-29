package com.Jeyaram;

import com.Jeyaram.apie.Check;

public class EncapsulationCheck {

	public static void main(String[] args) {
		Check chk = new Check();
		//chk consists of only livein as default is only within a package, not across packages
		chk.livein();
	}
}
