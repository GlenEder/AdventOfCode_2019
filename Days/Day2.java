package Days;

import Utils.FileHandler;

import java.util.Arrays;

public class Day2 extends Day {

    public Day2(int day) {
        super(day);
    }

    @Override
    public void Compute() {
        int[] numbers = this.GetFileHandler().ReadlineToIntArray(",");

        int part1 = CalcValue(numbers.clone(), 12, 2);

        int noun = 0;
        int verb = 0;
        int part2 = 0;
        boolean notfound = true;

        for (noun = 0; noun < 100 && notfound; noun++) {
            for (verb = 0; verb < 100; verb++) {
                part2 = CalcValue(numbers.clone(), noun, verb);
                if (part2 == 19690720) {
                    notfound = false;
                    break;
                }
            }
        }

        //adjust noun down one because of for loop operation
        this.EndDay(part1, ((noun - 1) * 100) + verb);
    }

    private int CalcValue(int[] numbers, int noun, int verb) {

        int currPosition = 0;
        int opCode = 0;
        int value1Position = 0;
        int value2Position = 0;
        int storeLocation = 0;

        //set noun and verb
        numbers[1] = noun;
        numbers[2] = verb;

        do {
            opCode = numbers[currPosition];
            value1Position = numbers[currPosition + 1];
            value2Position = numbers[currPosition + 2];
            storeLocation = numbers[currPosition + 3];
            //Addition
            if (opCode == 1) {
                //add the numbers, store sum
                numbers[storeLocation] = numbers[value1Position] + numbers[value2Position];
            }
            //Multiplication
            else if (opCode == 2) {
                numbers[storeLocation] = numbers[value1Position] * numbers[value2Position];
            }
            //Oops!
            else {
                System.out.printf("ERROR: bad op code: %d\n", opCode);
                break;
            }

            //advance to next opcode
            currPosition += 4;
        } while (numbers[currPosition] != 99);

        return numbers[0];
    }
}
