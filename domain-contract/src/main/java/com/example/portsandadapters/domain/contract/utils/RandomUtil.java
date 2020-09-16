package com.example.portsandadapters.domain.contract.utils;

import java.security.SecureRandom;
import java.util.Random;

public class RandomUtil {

  private static final Random RANDOM = new SecureRandom();

  private static final String ALPHABET =
      "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

  public static String generateRandomString(int length) {

    StringBuilder returnValue = new StringBuilder(length);
    for (int i = 0; i < length; i++) {
      returnValue.append(ALPHABET.charAt(RANDOM.nextInt(ALPHABET.length())));
    }

    return new String(returnValue);
  }
}
