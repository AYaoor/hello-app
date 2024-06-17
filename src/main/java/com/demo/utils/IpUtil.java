package com.demo.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IpUtil {

	public static String getIpAddr() {
		String ip = null;
		try {
			ip = InetAddress.getLocalHost().getHostAddress();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		return ip;
	}
}
