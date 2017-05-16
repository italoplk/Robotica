package org.lejos.pcsample.sensortest;
import lejos.nxt.LightSensor;
import lejos.nxt.SensorPort;
import lejos.nxt.SoundSensor;
import lejos.nxt.TouchSensor;
import lejos.nxt.UltrasonicSensor;
import lejos.nxt.ColorSensor;
/**
 * This is a test of remote reading of sensors from the PC
 * using the iCommand equivalent classes in pccomm.jar
 * 
 * @author Lawrie Griffiths
 *
 */
public class SensorTest {
	public static void main(String[] args) {
		ColorSensor light = new ColorSensor(SensorPort.S1);
		//SoundSensor sound = new SoundSensor(SensorPort.S2);
		//TouchSensor touch = new TouchSensor(SensorPort.S3);
		UltrasonicSensor sonic = new UltrasonicSensor(SensorPort.S2);
		
		while( 1 == 1) {		
			System.out.println("Color = " + light.getColorID());
			//System.out.println("sound = " + sound.readValue());
			//System.out.println("touch = " + touch.isPressed());
			System.out.println("distance = " + sonic.getDistance());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException ie) {}
		}
	}
}

