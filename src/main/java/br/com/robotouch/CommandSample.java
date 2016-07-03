package br.com.robotouch;

import java.io.File;
import java.util.List;

import se.vidstige.jadb.JadbConnection;
import se.vidstige.jadb.JadbDevice;
import se.vidstige.jadb.JadbException;

public class CommandSample {
	
	JadbConnection jadb;
	List<JadbDevice> devices;
	
	public CommandSample press(String x, String y) throws Exception, JadbException{
		
		jadb = new JadbConnection();
		devices = jadb.getDevices();
		
		String args = null;
		devices.get(0).executeShell("input tap "+x+" "+y+"", args);
		
		return null;
	}
	
	public CommandSample keyEvent(String event) throws Exception, JadbException{
		
		jadb = new JadbConnection();
		devices = jadb.getDevices();
		
		String args = null;
		devices.get(0).executeShell("input keyevent "+event+"", args);
		
		return null;
	}
	
	public CommandSample typeText(String text) throws Exception, JadbException{
		
		jadb = new JadbConnection();
		devices = jadb.getDevices();
		
		String args = null;
		devices.get(0).executeShell("input text "+text+"", args);
		
		return null;
	}

	public CommandSample swipe(String x1, String x2, String y1, String y2, String time) throws Exception, JadbException{
		
		jadb = new JadbConnection();
		devices = jadb.getDevices();
		
		String args = null;
		devices.get(0).executeShell("input swipe "+x1+" "+x2+" "+y1+" "+y2+" "+time+"", args);
		
		return null;
	}
	
	public CommandSample printText(String text) throws Exception, JadbException{
		
		jadb = new JadbConnection();
		devices = jadb.getDevices();
		
		String args = null;
		devices.get(0).executeShell("input echo "+text+"", args);
		
		return null;
	}
	
	public CommandSample installApp(File file) throws Exception, JadbException{
		
		jadb = new JadbConnection();
		devices = jadb.getDevices();
		
		String args = null;
		devices.get(0).executeShell("input install "+file+"", args);
		
		return null;
	}
	
}
