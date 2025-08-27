import java.util.Scanner;

public class App {
    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    public static void main(String[] args) throws Exception {
        
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Adicionar Pet na Máquina");
            System.out.println("2 - Remover Pet da Máquina");
            System.out.println("3 - Dar Banho");
            System.out.println("4 - Adicionar Água");
            System.out.println("5 - Adicionar Shampoo");
            System.out.println("6 - Lavar Máquina");
            System.out.println("7 - Verificar se tem Pet na Máquina");
            System.out.println("8 - Verificar Água");
            System.out.println("9 - Verificar Shampoo");
            System.out.println("0 - Sair");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> setPetInMachine(null);
                case 2 -> petMachine.removePet();
                case 3 -> petMachine.takeShowerInPet();
                case 4 -> setWater();
                case 5 -> setShampoo();
                case 6 -> petMachine.washMachine();
                case 7 -> checkIfHasPetInMachine();
                case 8 -> verifyWater();
                case 9 -> verifyShampoo();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
            
        }while (true);
    }

    public static void setWater() {
        System.out.println("Tentando adicionar agua...");
        petMachine.addWater();
    }

    public static void setShampoo() {
        System.out.println("Tentando adicionar shampoo...");
        petMachine.addShampoo();
    }

    private static void verifyShampoo() {
        var amount = petMachine.getShampoo();
        System.out.printf("Quantidade de shampoo: %d\n", amount);
    }

    private static void verifyWater() {
        var amount = petMachine.getWater();
        System.out.printf("Quantidade de água: %d\n", amount);
    }

    public static void checkIfHasPetInMachine() {
        var hasPet = petMachine.hasPet();
        System.out.println(hasPet ? "A máquina contém um pet." : "A máquina não contém nenhum pet.");
    }

    public static void setPetInMachine(Pet pet) {
        var name = scanner.next();
        while (name.equals(null) || name.isBlank()) {
            System.out.println("Nome inválido! Informe um nome válido.");
            name = scanner.next();
            
        }
        System.out.println("Informe o nome do pet: ");
        pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.printf("Pet %s adicionado à máquina.", pet.getNome());
        // Adiciona o pet à máquina
    }

    public static void removePetFromMachine() {
        petMachine.removePet();
    }

}
