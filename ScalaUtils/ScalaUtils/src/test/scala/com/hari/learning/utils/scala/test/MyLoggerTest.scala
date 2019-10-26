package com.hari.learning.utils.scala.test

import com.hari.learning.utils.scala.MyLogger.{ logInfo, logSevere }
import org.testng.annotations.{ Test, BeforeTest }

class MyLoggerTest {

  var info: Option[String => Unit] = Some(logInfo(this.getClass.getCanonicalName))
  var severe: Option[String => Unit] = Some(logSevere(this.getClass.getCanonicalName))

  @Test
  def testInfo: Unit = {
    info.get.apply("Test info")
  }

  @Test
  def testSevere: Unit = {
    severe.get.apply("Test severe")
  }

}