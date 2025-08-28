package abstracao_encapsulamento;

import java.util.Scanner;
import java.util.logging.Logger;

public class App {
    public static final Scanner scanner = new Scanner(System.in);
    public static final PetMachine petMachine = new PetMachine();
    private static final Logger logger = Logger.getLogger(App.class.getName());

    public static void main(String[] args) {

        do {
            logger.info("Escolha uma opção:");
            logger.info("1 - Adicionar Pet na Máquina");
            logger.info("2 - Remover Pet da Máquina");
            logger.info("3 - Dar Banho");
            logger.info("4 - Adicionar Água");
            logger.info("5 - Adicionar Shampoo");
            logger.info("6 - Lavar Máquina");
            logger.info("7 - Verificar se tem Pet na Máquina");
            logger.info("8 - Verificar Água");
            logger.info("9 - Verificar Shampoo");
            logger.info("0 - Sair");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> setPetInMachine();
                case 2 -> petMachine.removePet();
                case 3 -> petMachine.takeShowerInPet();
                case 4 -> setWater();
                case 5 -> setShampoo();
                case 6 -> petMachine.washMachine();
                case 7 -> checkIfHasPetInMachine();
                case 8 -> verifyWater();
                case 9 -> verifyShampoo();
                case 0 -> {
                    logger.info("Saindo...");
                    System.exit(0);
                }
                default -> logger.info("Opção inválida!");
            }

        } while (true);
    }

    public static void setWater() {
        logger.info("Tentando adicionar agua...");
        petMachine.addWater();
    }

    public static void setShampoo() {
        logger.info("Tentando adicionar shampoo...");
        petMachine.addShampoo();
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        logger.info(String.format("Quantidade de shampoo: %d%n", amount));
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        logger.info(String.format("Quantidade de água: %d%n", amount));
    }

    public static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        logger.info(hasPet ? "A máquina contém um pet." : "A máquina não contém nenhum pet.");
    }

    public static void setPetInMachine() {
        logger.info("Informe o nome do pet: ");
        String name = scanner.next();
        while (name == null || name.isBlank()) {
            logger.info("Nome inválido! Informe um nome válido.");
            name = scanner.next();
        }
        Pet pet = new Pet(name);
        petMachine.setPet(pet);
        logger.info(String.format("Pet %s adicionado à máquina.%n", pet.getNome()));
    }

    public static void removePetFromMachine() {
        petMachine.removePet();
    }

}
