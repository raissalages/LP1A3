import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        final int ammountOfStrings = 2;

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
            for(int i = 0; i < ammountOfStrings; i++){
                System.out.print("Insert string: ");
                RedundantMethodThatAddsElementToAListForReasonsThatAreBeyondMyUnderstanding(listOne, StringChecker(scanner.nextLine()));
                System.out.print("Insert string: ");
                RedundantMethodThatAddsElementToAListForReasonsThatAreBeyondMyUnderstanding(listTwo, StringChecker(scanner.nextLine()));
                System.out.print("Insert string: ");
                RedundantMethodThatAddsElementToAListForReasonsThatAreBeyondMyUnderstanding(listThree, StringChecker(scanner.nextLine()));

            }
        }catch (NumberOnStringException exception){
            System.out.println(exception.getMessage() + " Caused by: " + exception.getTriggerNumber());
        }
        System.out.println();

        ConcatLists(listOne, listTwo, listThree);
        System.out.println("List 1 concatenada com listas 2 e 3: ");
        for(String string : listOne){
            System.out.println(string + ";");
        }
        System.out.println();

        if(AreSharingAnElement(listOne, listTwo)){
            System.out.println("Lista 2 possui elementos em 1.");
        }else{
            System.out.println("Lista 2 não possui elementos em 1.");
        }
        System.out.println();

        if(ShareAllElements(listOne, listThree)){
            System.out.println("Lista 1 contem todos os elementos da lista 3.");
        }else{
            System.out.println("Lista 1 não contem todos os elementos da lista 3.");
        }
        System.out.println();

        if(listOne.equals(listTwo)){
            System.out.println("Lista 1 e 2 são iguais.");
        }else{
            System.out.println("Lista 1 e 2 são diferentes.");
        }
        System.out.println();

        System.out.println("Segundo elemento de cada lista: ");
        System.out.println("Lista 1: " + listOne.get(1) + ";");
        System.out.println("Lista 2: " + listTwo.get(1) + ";");
        System.out.println("Lista 3: " + listThree.get(1) + ".");
        System.out.println();

        System.out.println("Removendo um elemento da lista 3...");
        listThree.remove(1);
        System.out.println();

        System.out.println("Removendo os elementos da lsita 1 que pertencem a 3...");
        for(String string : listThree){
            listOne.remove(string);
        }
        System.out.println();

        System.out.println("Tamanho da lista 1: " + listOne.size());
        System.out.println();

        System.out.println("Limpando a lsita 3...");
        listThree.clear();
        System.out.println();

        if(listThree.isEmpty()){
            System.out.println("Lsita 3 esta vazia.");
        }else{
            System.out.println("Lista 3 não está vazia.");
        }
        System.out.println();

        System.out.println("Elementos da lista 1: ");
        for(String string : listOne){
            System.out.println(string + ";");
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

    public static <T> void RedundantMethodThatAddsElementToAListForReasonsThatAreBeyondMyUnderstanding(List<T> list, T string){
        list.add(string);
    }

    @SafeVarargs
    public static <T> void ConcatLists(List<T> target, List<T>... tools){
        for(List<T> item : tools){
            target.addAll(item);
        }
    }

    public static <T> boolean AreSharingAnElement(List<T> firstList, List<T> secondList){
        for(T item : secondList){
            if(firstList.contains(item)){
                return true;
            }
        }
        return false;
    }

    public static <T> boolean ShareAllElements(List<T> firstList, List<T> secondList){
        for(T item : secondList){
            if(!firstList.contains(item)){
                return false;
            }
        }
        return true;
    }
}