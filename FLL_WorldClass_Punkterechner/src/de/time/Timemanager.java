package de.time;

public class TimeManager extends Thread{
	public static int up_sec = 0;
	public static int up_min = 0;
	public static int down_sec = 30;
	public static int down_min = 2;
	public static boolean runTimer = false;
	public static boolean runTimerDown = false;
	
	public static void resetTimer(){
		up_sec = 0;
		up_min = 0;
		down_sec = 30;
		down_min = 2;
	}
	
	public static void updateTime(){
		if(!runTimerDown){
			if(up_sec<10){
				TimePanel.lbl_time.setText("0" + up_min + ":0" + up_sec);		// up_sec<10  ->  00:09
			}else{
				TimePanel.lbl_time.setText("0" + up_min + ":" + up_sec);		// up_sec>10  ->  00:11
			}
			TimePanel.lbl_time_rest.setText("02:30");
		}else{
			if(down_sec<10){
				TimePanel.lbl_time.setText("0" + down_min + ":0" + down_sec);		// up_sec<10  ->  00:09
			}else{
				TimePanel.lbl_time.setText("0" + down_min + ":" + down_sec);		// up_sec>10  ->  00:11
			}
			TimePanel.lbl_time_rest.setText("00:00");
		}
	}
	
	public void run(){
		while(true){
			while(runTimer){
				try {
					Thread.sleep(1000);} catch (Exception e) {e.printStackTrace();}
				up_sec++;
				down_sec--;
				
					if(up_sec==60){			// 00:58  -  00:59  -  01:00
						up_sec = 0;
						up_min++;
					}
					if(down_sec==-1){		// 02:01  -  02:00  -  01:59
						down_sec = 59;
						down_min--;
					}
				
					if(!runTimerDown){
						if(up_sec<10){
							TimePanel.lbl_time.setText("0" + up_min + ":0" + up_sec);		// up_sec<10  ->  00:09
						}else{
							TimePanel.lbl_time.setText("0" + up_min + ":" + up_sec);		// up_sec>10  ->  00:11
						}
						TimePanel.lbl_time_rest.setText("02:30");
					}else{
						if(down_sec<10){
							TimePanel.lbl_time.setText("0" + down_min + ":0" + down_sec);		// up_sec<10  ->  00:09
						}else{
							TimePanel.lbl_time.setText("0" + down_min + ":" + down_sec);		// up_sec>10  ->  00:11
						}
						TimePanel.lbl_time_rest.setText("00:00");
					}
					
					if(down_min == 0 && down_sec == 0){
						runTimer=false;
						TimePanel.btn_start.setSelected(false);
					}
				
			}
		}
		
	}
}
