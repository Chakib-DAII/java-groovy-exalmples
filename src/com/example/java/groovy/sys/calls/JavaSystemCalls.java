package com.example.java.groovy.sys.calls;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaSystemCalls {
    public static void execute(){
      Process process = null;
      try {
        process = Runtime.getRuntime().exec(new String[]{"cmd", "/c","start C:\\Users\\cdaii\\AppData\\Roaming\\Spotify\\Spotify.exe"});
        process.waitFor();
        process = Runtime.getRuntime().exec(new String[]{"cmd", "/c","dir"}, new String[0], new File("C:\\Users\\cdaii\\"));
        process.waitFor();
        try(BufferedReader err = new BufferedReader(new InputStreamReader(process.getErrorStream()))){
          String next;
          while ((next = err.readLine()) != null)
            System.out.println(next);
        }
        try(BufferedReader in = new BufferedReader(new InputStreamReader(process.getInputStream()))){
          String next;
          while ((next = in.readLine()) != null)
            System.out.println(next);
        }
        /*try(OutputStream out = process.getOutputStream()){
          out.write("done".getBytes());
        }*/
      } catch (IOException | InterruptedException e) {
        if(process!=null)
        {
          process.destroy();
        }
        e.printStackTrace();
        System.exit(-1);
      }
    }
}
