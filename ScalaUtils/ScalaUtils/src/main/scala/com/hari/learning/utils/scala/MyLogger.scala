package com.hari.learning.utils.scala

import java.util.logging.{ LogManager, Logger, Level }

object MyLogger {

  private val log: Logger => Level => String => Unit = logger => level => msg => logger.log(level, msg)

  val logger: String => Logger = name => LogManager.getLogManager.getLogger(name)

  // to log anything at INFO level.
  val logInfo: String => String => Unit = name => msg => logger.apply(name).info(msg)

  // to log anything at SEVERE level.
  val logSevere: String => String => Unit = name => msg => logger.apply(name).severe(msg)

  // to log anything at WARN level.
  val logWarn: String => String => Unit = name => msg => logger.apply(name).warning(msg)

}