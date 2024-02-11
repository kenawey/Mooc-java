
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class LiteracyComparison {

    public static void main(String[] args) {

        try {
            Files.lines(Path.of("literacy.csv"))
                    .map(row -> row.split(","))
                    .map(row -> new Row(row[3].trim(),
                    row[2].split(" ")[1].trim(),
                    Integer.valueOf(row[4].trim()),
                    Double.valueOf(row[5].trim())))
                   .sorted((Row o1, Row o2) -> {

                if (o1.getRate() > o2.getRate()) {
                    return 1;
                }
                if (o1.getRate() < o2.getRate()) {
                    return -1;
                }
                return 0; //To change body of generated lambdas, choose Tools | Templates.
            })
                    .forEach(a -> System.out.println(a));
            //.collect(Collectors.toList());

            /*   allobject.stream()
                    .mapToDouble(d -> Double.valueOf(d.getRate()))
                    .sorted().forEach(a -> values.add(a));

            allobject.stream().forEach(a -> map.put(a.getRate(), a));
            for (Double b : map.keySet()) {
                
                    result.add(map.get(b));
                

            }
            result.stream().mapToDouble(a -> a.getRate())
                    .sorted()
                    .mapToObj(a -> map.get(a))
                    .forEach(a -> System.out.println(a));

            /*                Files.lines(Path.of("literacy.csv"))
//                    .map(row-> row.split(","))
//                    .mapToDouble(d->Double.valueOf(d[5]))
//                    .sorted().limit(5).forEach(a->values.add(a));
//               allobject.forEach(a->map.put(a.getRate(), a));
               
            //  result.forEach(a->System.out.println(a));
               
             */
        } catch (IOException ex) {

        }

    }

}
