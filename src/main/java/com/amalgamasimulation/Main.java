package com.amalgamasimulation;

import com.amalgamasimulation.engine.Engine;

public class Main {

  public static void main(String[] args) {
    Engine engine = new Engine();
    engine.scheduleAbsolute(5, () -> System.out.println("engine time is " + engine.time()));
    engine.scheduleStop(10, "Engine stop");
    engine.setFastMode(true);
    engine.run(true);
  }
}
