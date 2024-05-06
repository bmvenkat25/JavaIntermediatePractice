package Day2;
import java.util.*;
import java.util.stream.Collectors;

public class StringTrim {
    public static void main(String[] args){
        List<String> input = Arrays.asList(" java  ", "servlet    ","   maven");
        input.stream().map(l -> l.trim()).forEach(n -> System.out.println(n));
    }
}
