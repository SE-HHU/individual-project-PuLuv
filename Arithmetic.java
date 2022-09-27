package Arithmetic;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) throws IOException {
        Random random = new Random();
        Scanner scnr = new Scanner(System.in);
        int count = scnr.nextInt();
        int num = 1;
        BufferedWriter bwexercises = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Exercises.txt")));
        BufferedWriter bwanswers = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("Answers.txt")));
        List<String> list = new ArrayList<>();
        while (count > 0) {
            int rand = random.nextInt(1, 3);
            if (rand == 1) {
                int[] arr0 = new int[2];
                int operator = random.nextInt(1, 3);
                arr0[0] = random.nextInt(0, 100);
                arr0[1] = random.nextInt(0, 100);
                String[] arr = {Integer.toString(arr0[0]), Integer.toString(arr0[1])};
                switch (operator) {
                    case 1:
                        if (list.contains(arr[0] + "+" + arr[1])) {
                            count--;
                            break;
                        } else {
                            list.add(arr[0] + "+" + arr[1]);
                        }
                        bwexercises.write(num + ".");
                        bwanswers.write(num + ".");
                        num++;
                        bwexercises.write(arr[0]);
                        bwexercises.write('+');
                        bwexercises.write(arr[1]);
                        bwexercises.write("=\n");
                        bwanswers.write(arr[0]);
                        bwanswers.write('+');
                        bwanswers.write(arr[1]);
                        bwanswers.write("=");
                        bwanswers.write(arr0[0] + arr0[1] + "\n");
                        bwexercises.flush();
                        bwanswers.flush();
                        break;
                    case 2:
                        if (list.contains(arr[0] + "-" + arr[1])) {
                            count--;
                            break;
                        } else {
                            list.add(arr[0] + "-" + arr[1]);
                        }
                        bwexercises.write(num + ".");
                        bwanswers.write(num + ".");
                        num++;
                        bwexercises.write(arr[0]);
                        bwexercises.write('-');
                        bwexercises.write(arr[1]);
                        bwexercises.write("=\n");
                        bwanswers.write(arr[0]);
                        bwanswers.write('-');
                        bwanswers.write(arr[1]);
                        bwanswers.write("=");
                        bwanswers.write(arr0[0] - arr0[1] + "\n");
                        bwexercises.flush();
                        bwanswers.flush();
                        break;
                }
            } else {
                int[] arr0 = new int[3];
                int operator1 = random.nextInt(1, 3);
                int operator2 = random.nextInt(1, 3);
                arr0[0] = random.nextInt(0, 100);
                arr0[1] = random.nextInt(0, 100);
                arr0[2] = random.nextInt(0, 100);
                String[] arr = {Integer.toString(arr0[0]), Integer.toString(arr0[1]), Integer.toString(arr0[2])};
                switch (operator1) {
                    case 1:
                        if (operator2 == 1) {
                            String e = arr[0] + "+" + arr[1] + "+" + arr[2];
                            if (list.contains(e)) {
                                count--;
                                break;
                            } else {
                                list.add(e);
                            }
                            bwexercises.write(num + ".");
                            bwanswers.write(num + ".");
                            num++;
                            bwexercises.write(arr[0]);
                            bwexercises.write('+');
                            bwexercises.write(arr[1]);
                            bwexercises.write('+');
                            bwexercises.write(arr[2]);
                            bwexercises.write("=\n");
                            bwanswers.write(arr[0]);
                            bwanswers.write('+');
                            bwanswers.write(arr[1]);
                            bwanswers.write('+');
                            bwanswers.write(arr[2]);
                            bwanswers.write("=");
                            bwanswers.write(arr0[0] + arr0[1] + arr0[2] + "\n");
                            bwexercises.flush();
                            bwanswers.flush();
                            break;
                        } else {
                            String e = arr[0] + "+" + arr[1] + "-" + arr[2];
                            if (list.contains(e)) {
                                count--;
                                break;
                            } else {
                                list.add(e);
                            }
                            bwexercises.write(num + ".");
                            bwanswers.write(num + ".");
                            num++;
                            bwexercises.write(arr[0]);
                            bwexercises.write('+');
                            bwexercises.write(arr[1]);
                            bwexercises.write('-');
                            bwexercises.write(arr[2]);
                            bwexercises.write("=\n");
                            bwanswers.write(arr[0]);
                            bwanswers.write('+');
                            bwanswers.write(arr[1]);
                            bwanswers.write('-');
                            bwanswers.write(arr[2]);
                            bwanswers.write("=");
                            bwanswers.write(arr0[0] + arr0[1] - arr0[2] + "\n");
                            bwexercises.flush();
                            bwanswers.flush();
                            break;
                        }

                    case 2:
                        if (operator2 == 1) {
                            String e = arr[0] + "-" + arr[1] + "+" + arr[2];
                            if (list.contains(e)) {
                                count--;
                                break;
                            } else {
                                list.add(e);
                            }
                            bwexercises.write(num + ".");
                            bwanswers.write(num + ".");
                            num++;
                            bwexercises.write(arr[0]);
                            bwexercises.write('-');
                            bwexercises.write(arr[1]);
                            bwexercises.write('+');
                            bwexercises.write(arr[2]);
                            bwexercises.write("=\n");
                            bwanswers.write(arr[0]);
                            bwanswers.write('-');
                            bwanswers.write(arr[1]);
                            bwanswers.write('+');
                            bwanswers.write(arr[2]);
                            bwanswers.write("=");
                            bwanswers.write(arr0[0] - arr0[1] + arr0[2] + "\n");
                            bwexercises.flush();
                            bwanswers.flush();
                            break;
                        } else {
                            String e = arr[0] + "-" + arr[1] + "-" + arr[2];
                            if (list.contains(e)) {
                                count--;
                                break;
                            } else {
                                list.add(e);

                            }
                            bwexercises.write(num + ".");
                            bwanswers.write(num + ".");
                            num++;
                            bwexercises.write(arr[0]);
                            bwexercises.write('-');
                            bwexercises.write(arr[1]);
                            bwexercises.write('-');
                            bwexercises.write(arr[2]);
                            bwexercises.write("=\n");
                            bwanswers.write(arr[0]);
                            bwanswers.write('-');
                            bwanswers.write(arr[1]);
                            bwanswers.write('-');
                            bwanswers.write(arr[2]);
                            bwanswers.write("=");
                            bwanswers.write(arr0[0] - arr0[1] - arr0[2] + "\n");
                            bwexercises.flush();
                            bwanswers.flush();
                            break;
                        }
                }
            }
            count--;
        }
        bwexercises.close();
        bwanswers.close();
    }
}

