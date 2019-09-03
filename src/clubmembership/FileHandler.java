package clubmembership;

import java.util.LinkedList;
import java.io.*;


public class FileHandler {

    private Object SingleClubMembership;
    private Object MultiClubMembership;

    public LinkedList<Member> readFile() {
        LinkedList<Member> m = new LinkedList();
        String lineRead;
        String[] splitline;
        Member mem;

        try (BufferedReader reader = new BufferedReader(new FileReader("members.csv"))) {
            lineRead = reader.readLine();
            while (lineRead != null) {
                splitline = lineRead.split(", ");

                if (splitline[0].equals("S")) {
                    mem = new SingleClubMembership('S', Integer.parseInt(splitline[1]), splitline[2],
                            Double.parseDouble(splitline[3]), Integer.parseInt(splitline[4]));
                } else {
                    mem = new MultiClubMembership('M', Integer.parseInt(splitline[1]), splitline[2],
                            Double.parseDouble(splitline[3]), Integer.parseInt(splitline[4]));
                }
                m.add(mem);
                lineRead = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return m;
    }

    public void appendFile(String mem) {

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("members.csv", true))) {
            writer.write(mem + "\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public void overwriteFile(LinkedList<Member> m) {
        String s;
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("members.temp", false))) {
            for (int i = 0; i < m.size(); i++) {
                s = m.get(i).toString();
                writer.write(s + "\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try {
            File f = new File("members.csv");
            File tf = new File("members.temp");
            f.delete();
            tf.renameTo(f);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

