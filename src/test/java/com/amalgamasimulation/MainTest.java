package com.amalgamasimulation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.amalgamasimulation.engine.Engine;
import java.util.concurrent.atomic.AtomicLong;
import org.junit.jupiter.api.Test;

class MainTest {

  @Test
  void engineTest() {
    Engine engine = new Engine();
    AtomicLong sum = new AtomicLong(0);
    for (int i = 0; i < 100; i++) {
      engine.scheduleAbsolute(i, () -> sum.addAndGet((long) engine.time()));
    }
    engine.scheduleStop(100, "Engine stop");
    engine.setFastMode(true);
    engine.run(true);
    assertEquals(4950, sum.get());
  }
}
