import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(Main.class.getName());
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-LLL-yyyy-HH:mm:ss", Locale.ENGLISH);
        LocalDateTime now = LocalDateTime.now();

        try {
            FileHandler fileHandler = new FileHandler("src/logs/" + dtf.format(now) + ".log", true);
            SimpleFormatter formatter = new SimpleFormatter();

            fileHandler.setFormatter(formatter);
            logger.addHandler(fileHandler);
        } catch (IOException exception) {
            logger.severe(exception.getMessage());
        }
        logger.info("AAAAAAAAAAAAAAAAAAAAAAA");

        /* ------------------ */

        Scanner scanner = new Scanner(System.in);

        List<String> listOne = new ArrayList<>();
        List<String> listTwo = new ArrayList<>();
        List<String> listThree = new LinkedList<>();

        try{
            listOne.add(StringChecker(scanner.nextLine()));
            listOne.add(StringChecker(scanner.nextLine()));
            listTwo.add(StringChecker(scanner.nextLine()));
            listTwo.add(StringChecker(scanner.nextLine()));
            listThree.add(StringChecker(scanner.nextLine()));
            listThree.add(StringChecker(scanner.nextLine()));
        }catch (NumberOnStringException exception){
            System.out.println(exception.getMessage() + " Caused by: " + exception.getTriggerNumber());
        }

    }

    public static String StringChecker(String text) throws NumberOnStringException {
        for(int i = 0; i < 10; i++){
            if(text.contains(Integer.toString(i))){
                throw new NumberOnStringException("Numbers are not allowed.", i);
            }
        }
        return text;
    }

}