package org.example;

import java.security.Provider;
import java.security.Security;

/**
 * Hello world!
 */
public class App {

   public static void main(String[] args) {
      System.out.println("FIPS-tester");
      System.out.println();

      System.out.println("Security Providers:");
      Provider[] providers = Security.getProviders();
      for (int i = 0; i < providers.length; i++) {
         System.out.println("  " + providers[i].getName());
      }
   }
}
