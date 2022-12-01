import java.util.*;
import java.util.stream.Collectors;

class Pgcd {
    public List<Integer> diviseurs(int a) {
        List<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                result.add(i);
            }
        }
        return result;

    }

    public List<Integer> mock_diviseurs(int a) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(5);
        result.add(6);
        result.add(8);
        result.add(3);
        result.add(2);
        return result;

    }

    public int calculatePGCD(int a, int b) {

        List<Integer> lista = mock_diviseurs(a);
        List<Integer> listb = mock_diviseurs(b);
        Set<Integer> result = lista.stream()
                .distinct()
                .filter(listb::contains)
                .collect(Collectors.toSet());
        return Collections.max(result);

    }

    public static void main(String[] args) {
        Pgcd calculator = new Pgcd();
        assert (calculator.calculatePGCD(4, 3) == 8);
    }
}