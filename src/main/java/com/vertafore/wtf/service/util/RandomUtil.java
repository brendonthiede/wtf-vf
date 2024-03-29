package com.vertafore.wtf.service.util;

import org.apache.commons.lang.RandomStringUtils;

import java.security.SecureRandom;

/**
 * Utility class for generating random Strings.
 */
public final class RandomUtil {
   private static final SecureRandom SECURE_RANDOM = new SecureRandom();

    private static final int DEF_COUNT = 20;

    static {
        SECURE_RANDOM.nextBytes(new byte[64]);
    }

    private RandomUtil() {
    }

    private static String generateRandomAlphanumericString() {
        return RandomStringUtils.random(DEF_COUNT, 0, 0, true, true, null, SECURE_RANDOM);
    }

    /**
     * Generates a password.
     *
     * @return the generated password
     */
    public static String generatePassword() {
        return generateRandomAlphanumericString();
    }

    /**
     * Generates an activation key.
     *
     * @return the generated activation key
     */
    public static String generateActivationKey() {
        return generateRandomAlphanumericString();
    }

    /**
    * Generates a reset key.
    *
    * @return the generated reset key
    */
   public static String generateResetKey() {
       return generateRandomAlphanumericString();
   }
}
