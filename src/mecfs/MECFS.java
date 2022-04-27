/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mecfs;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * @author gf211097
 */
public class MECFS {

    /**
     * @param args the command line arguments
     */
    //severity
    public static int soreness;
    public static int heavy;
    public static int mental;
    public static int physical;
    public static int drained;
    //severity

    //frequency
    public static int sorenessf;
    public static int heavyf;
    public static int mentalf;
    public static int physicalf;
    public static int drainedf;
    //frequency

    File file = new File("MECFS.txt");


    public static void main(String[] args) {
        person person = new person();
        person.name = Getinput("what is your name?");
        person.Date = Getinput("what is the date?");
        System.out.println("first we will measure your severity");
        person.severity = Getseverity();
        System.out.println("now we will measure the frequency of your symptoms");
        person.frequency = Getfrequency();
        person.cause = Getinput("what is the cause");

        System.out.println(person);

        do {

            boolean write = Getinput("would you like to write to file? (y/n)").equals("y");
            boolean specific = Getinput("would you like to add specific values? (y/n)").equals("y");
            if (write) {
                if (specific) {
                    try {
                        writeToFile("MECFS.txt", person.toString() + " { specifics: [ severity: { soreness: " + soreness + ", heavy: " + heavy + ", mental: " + mental + ", physical: " + physical + ", drained: " + drained + " }, frequency: { soreness: " + sorenessf + ", heavy: " + heavyf + ", mental: " + mentalf + ", physical: " + physicalf + ", drained: " + drainedf + " } ] }");
                    } catch (IOException e) {
                        System.out.println("error writing to file");
                    }
                } else {
                    try {
                        writeToFile("MECFS.txt", person.toString());
                    } catch (IOException e) {
                        System.out.println("error writing to file");
                    }
                }
            }

        } while (Getinput("would you like to continue? (y/n)").equals("y"));

    }

    public static String Getinput(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextLine();

    }

    public static int Getint(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.println(prompt);
        return sc.nextInt();

    }

    public static double Getseverity() throws InputMismatchException {
        System.out.println("for each symptom give a number between 0, and 4");
        System.out.println("0 = Symptom not present");
        System.out.println("1 = mild");
        System.out.println("2 = moderate");
        System.out.println("3 = severe");
        System.out.println("4 = very severe");
        while (true) {
            try {
                heavy = Getint("Dead, heavy feeling after exercise");
            } catch (InputMismatchException ex) {
                System.out.println("input must be an integer between 0 and 4");
            }
            if (0 < heavy && heavy < 5) {
                break;

            } else {
                System.out.println("must be an integer between 0 and 4");
            }
        }
        while (true) {
            try {
                soreness = Getint("Next day soreness or fatigue after non-strenuous, everyday activities");
            } catch (InputMismatchException ex) {
                System.out.println("input must be an integer between 0 and 4");
            }
            if (0 < soreness && soreness < 5) {
                break;

            } else {
                System.out.println("must be an integer between 0 and 4");
            }
        }
        while (true) {
            try {
                mental = Getint("Mentally tired after the slightest effort");
            } catch (InputMismatchException ex) {
                System.out.println("input must be an integer between 0 and 4");
            }
            if (0 < mental && mental < 5) {
                break;

            } else {
                System.out.println("must be an integer between 0 and 4");
            }
        }

        while (true) {
            try {
                physical = Getint("Minimum exercise makes you physically tired");
            } catch (InputMismatchException ex) {
                System.out.println("input must be an integer between 0 and 4");
            }
            if (0 < physical && physical < 5) {
                break;

            } else {
                System.out.println("must be an integer between 0 and 4");
            }
        }
        while (true) {
            try {
                drained = Getint("Physically drained or sick after mild activity");
            } catch (InputMismatchException ex) {
                System.out.println("input must be an integer between 0 and 4");
            }
            if (0 < drained && drained < 5) {
                break;

            } else {
                System.out.println("must be an integer between 0 and 4");
            }
        }

        return (drained + physical + mental + soreness + heavy) / 5;
    }

    public static double Getfrequency() {
        System.out.println("for each symptom give a number between 0, and 4");
        System.out.println("0 = none of the time");
        System.out.println("1 = a little of the time");
        System.out.println("2 = about half of the time");
        System.out.println("3 = most of the time");
        System.out.println("4 = all of the time");
        while (true) {
            try {
                heavyf = Getint("Dead, heavy feeling after exercise");
            } catch (InputMismatchException ex) {
                System.out.println("input must be an integer between 0 and 4");
            }
            if (0 < heavyf && heavyf < 5) {
                break;

            } else {
                System.out.println("must be an integer between 0 and 4");
            }
        }
        while (true) {
            try {
                sorenessf = Getint("Next day soreness or fatigue after non-strenuous, everyday activities");
            } catch (InputMismatchException ex) {
                System.out.println("input must be an integer between 0 and 4");
            }
            if (0 < sorenessf && sorenessf < 5) {
                break;

            } else {
                System.out.println("must be an integer between 0 and 4");
            }
        }
        while (true) {
            try {
                mentalf = Getint("Mentally tired after the slightest effort");
            } catch (InputMismatchException ex) {
                System.out.println("input must be an integer between 0 and 4");
            }
            if (0 < mentalf && mentalf < 5) {
                break;

            } else {
                System.out.println("must be an integer between 0 and 4");
            }
        }

        while (true) {
            try {
                physicalf = Getint("Minimum exercise makes you physically tired");
            } catch (InputMismatchException ex) {
                System.out.println("input must be an integer between 0 and 4");
            }
            if (0 < physicalf && physicalf < 5) {
                break;

            } else {
                System.out.println("must be an integer between 0 and 4");
            }
        }
        while (true) {
            try {
                drainedf = Getint("Physically drained or sick after mild activity");
            } catch (InputMismatchException ex) {
                System.out.println("input must be an integer between 0 and 4");
            }
            if (0 < drainedf && drainedf < 5) {
                break;

            } else {
                System.out.println("must be an integer between 0 and 4");
            }
        }

        return (drainedf + physicalf + mentalf + sorenessf + heavyf) / 5;

    }

    public static void writeToFile(String filename, String text) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename, true));
        //write on a new line each time
        writer.newLine();
        writer.write(text);
        writer.close();
    }
}
