package com.emrexps.scheduling.jobs;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Jobs {
	private static SimpleDateFormat simpleDateFormat=new SimpleDateFormat("HH:mm:ss");
	
	@Scheduled(fixedRate=5000)
	public void job1() {
		System.out.println(simpleDateFormat.format(new Date()));
	}
	
	@Scheduled(cron="0 0/30 15-17 * * *")
	public void job2() {
		System.out.println("this is works 15:00, 15:30, 16:00, 16:30, 17:00 and 17:30 every day ");
	}
	
}
