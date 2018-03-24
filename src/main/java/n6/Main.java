package n6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 * Task: Process file resources/n6/source in a special way and write result to the new file.
 * Source file contains data in following format:
 * username,password,email
 * <p>
 * You need to:
 * 1) remove duplicates by username
 * 2) make email lowercase
 * 3) remove records where password doesn't meet following conditions:
 * 3.1) password length must be at least 8 symbols
 * 3.2) password must contain at least one special character (#, @, -)
 * 3.3) password must contain exactly one uppercase character
 * <p>
 * All the rest records should be saved in new file in the same format.
 */
public class Main {

    static final String fileSource = "C:\\Users\\Администратор\\IdeaProjects\\test\\src\\main\\resources\\n6\\source";
    static final String fileWrite = "C:\\Users\\Администратор\\IdeaProjects\\test\\src\\main\\resources\\n6\\sorted";

    public static void main(String[] args) throws IOException {
        printToFile();
    }

    public static void printToFile() throws IOException {
        BufferedWriter out = new BufferedWriter(new FileWriter(fileWrite));
        for (Object o : usersData()) {
            out.write(String.valueOf(o));
            out.newLine();
        }
        out.close();
    }

    public static Set<User> usersData() throws IOException {
        Set<User> users = new HashSet<>();
        Scanner scanner = new Scanner(new File(fileSource));

        while (scanner.hasNextLine()) {
            User user = new User();
            String line = scanner.nextLine();
            List<String> userData = new ArrayList<>(Arrays.asList(line.split(",")));

            String username = userData.get(0);
            String password = userData.get(1);
            String email = userData.get(2).toLowerCase();

            user.setUsername(username);
            user.setPassword(password);
            user.setEmail(email);
            if (password.matches("^(?=.*[A-Z])(?=.*[@#$%^&+-=]).{8,}$")) {
                users.add(user);
            }
        }
        return users;
    }
}
