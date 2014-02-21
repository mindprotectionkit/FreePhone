package com.mindprotectionkit.freephone.signaling;


public class RateLimitExceededException extends Throwable {
  public RateLimitExceededException(String s) {
    super(s);
  }
}
