package com.sdesimeur.android.mockgps;

/**
 * Created by sam on 29/07/15.
 */
public class Constants {
 public interface ACTION {
  public static String MAIN_ACTION = "com.sdesimeur.android.mockgps.action.main";
  public static String START_ACTION = "com.sdesimeur.android.mockgps.action.start";
  public static String STOP_ACTION = "com.sdesimeur.android.mockgps.action.stop";
  public static String STARTFOREGROUND_ACTION = "com.sdesimeur.android.mockgps.action.startforeground";
  public static String STOPFOREGROUND_ACTION = "com.sdesimeur.android.mockgps.action.stopforeground";
 }

 public interface NOTIFICATION_ID {
  public static int FOREGROUND_SERVICE = 101;
 }
}