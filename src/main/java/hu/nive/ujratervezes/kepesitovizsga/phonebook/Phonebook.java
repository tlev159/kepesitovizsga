package hu.nive.ujratervezes.kepesitovizsga.phonebook;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Map;

public class Phonebook {

  public void exportPhonebook(Map<String, String> contacts, String output) {
    if (contacts == null || output == null) {
      throw new IllegalArgumentException("Parameter must be not null!");
    }
    try (BufferedWriter writer = Files.newBufferedWriter(Path.of(output))) {
      for (Map.Entry<String, String> entry : contacts.entrySet()) {
        String name = entry.getKey();
        String phoneNumber = entry.getValue();
        if (name == null || phoneNumber == null) {
          throw new IllegalArgumentException("Name or phone number must be not null!");
        }
        writer.write(name + ": " + phoneNumber);
      }
    } catch (IOException ioe) {
      throw new IllegalArgumentException("Cannot write file!", ioe);
    }
  }
}
