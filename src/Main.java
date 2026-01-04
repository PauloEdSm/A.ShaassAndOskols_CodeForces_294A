import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int numberOfWires = scanner.nextInt();
        int [] wires = new int[numberOfWires];
        int shotPosition;
        int targetWire;
        for (int j = 0; j < numberOfWires ; j++) {
            wires[j] = scanner.nextInt();
        }
        int shots = scanner.nextInt();
        while (shots-->0) {
            targetWire = scanner.nextInt()-1;
            shotPosition = scanner.nextInt();
            int birds = wires[targetWire];
            if (targetWire > 0) {
                wires[targetWire - 1] += shotPosition - 1;
            }
            if (targetWire < numberOfWires - 1) {
                wires[targetWire + 1] += wires[targetWire] - shotPosition;
            }
                wires[targetWire] = 0;
            }
        Arrays.stream(wires).forEach(System.out::println);
        }
    }