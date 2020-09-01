package com.Test;

public enum TrafficEnum {
	RED(1),
	GREEN(2),
	YELLOW(3);

	 private final int duration;

	 TrafficEnum(int duration) {
	this.duration = duration;
	}

	 public int getDuration() {
	return this.duration;
	}

	public static void main(String[] args)
	{
	for(TrafficEnum light: TrafficEnum.values())
	{
	System.out.println("The traffic light value is: " +light);
	System.out.println("The duration of that trafic light value is: " + light.getDuration());
	}
	}
	}