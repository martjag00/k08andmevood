import java.io.*;
import java.nio.file.*;
import java.util.*;
import java.util.stream.Collectors;

public class Andmevoog{
  public static void main(String[] args) throws Exception{
    PrintWriter pw = new PrintWriter(new FileWriter("otsus.txt"));

    Files.readAllLines(Paths.get("jalasuurused.txt")).stream().filter(s -> Double.parseDouble(s.split(",")[1]) >= 40.0).sorted(Comparator.comparing(s -> s.split(",")[1])).
      map(s -> "Korvpallur nimega " + s.split(",")[0] + ", kellel on jalanumber suurem või võrdne kui 40 ehk" + s.split(",")[1] + ", saab endale tasuta ketsipaari.").
      collect(Collectors.toList()).forEach(pw::println);
      pw.close();
  }
}

/*
Korvpallur nimega Igor, kellel on jalanumber suurem või võrdne kui 40 ehk 41.0, saab endale tasuta ketsipaari.
Korvpallur nimega Reinar, kellel on jalanumber suurem või võrdne kui 40 ehk 41.0, saab endale tasuta ketsipaari.
Korvpallur nimega Andres, kellel on jalanumber suurem või võrdne kui 40 ehk 43.5, saab endale tasuta ketsipaari.
Korvpallur nimega Urki, kellel on jalanumber suurem või võrdne kui 40 ehk 44.0, saab endale tasuta ketsipaari.
Korvpallur nimega Sergei, kellel on jalanumber suurem või võrdne kui 40 ehk 45.0, saab endale tasuta ketsipaari.
Korvpallur nimega Jaanus, kellel on jalanumber suurem või võrdne kui 40 ehk 46.5, saab endale tasuta ketsipaari.
Korvpallur nimega Martin, kellel on jalanumber suurem või võrdne kui 40 ehk 47.5, saab endale tasuta ketsipaari.
Korvpallur nimega Meelis, kellel on jalanumber suurem või võrdne kui 40 ehk 49.0, saab endale tasuta ketsipaari.
*/
