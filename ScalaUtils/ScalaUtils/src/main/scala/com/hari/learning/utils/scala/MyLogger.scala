package com.hari.learning.utils.scala

import java.util.logging.{ LogManager, Logger, Level }

object MyLogger {

  private val log: Logger => Level => String => Unit = logger => level => msg => logger.log(level, msg)

  def logger: String => Logger = name => Logger.getLogger(name)

  // to log anything at INFO level.
  def logInfo: String => String => Unit = name => msg => logger.apply(name).info(msg)

  // to log anything at SEVERE level.
  def logSevere: String => String => Unit = name => msg => logger.apply(name).severe(msg)

  // to log anything at WARN level.
  def logWarn: String => String => Unit = name => msg => logger.apply(name).warning(msg)

}