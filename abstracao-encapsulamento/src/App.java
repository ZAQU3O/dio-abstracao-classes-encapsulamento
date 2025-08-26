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
            System.out.println("8 - Abastecer Água");
            System.out.println("9 - Abastecer Shampoo");
            System.out.println("0 - Sair");
            int option = scanner.nextInt();

            switch (option) {
                case 1 -> setPetInMachine(null);
                case 2 -> petMachine.removePet();
                case 3 -> petMachine.bathePet();
                case 4 -> petMachine.addWater();
                case 5 -> petMachine.addShampoo();
                case 6 -> petMachine.washMachine();
                case 7 -> petMachine.hasPet();
                case 8 -> petMachine.addWater();
                case 9 -> petMachine.addShampoo();
                case 0 -> System.out.println("Saindo...");
                default:
                    System.out.println("Opção inválida!");
            }
        } while (true);
    }

    public static void setPetInMachine(Pet pet) {
        var name = scanner.next();
        while (name.equals(null) || name.isBlank()) {
            System.out.println("Nome inválido! Informe um nome válido.");
            name = scanner.next();
            
        }
        System.out.println("Informe o nome do pet: ");
        var pet = new Pet(name);
        petMachine.setPet(pet);
        System.out.printf("Pet %s adicionado à máquina.", pet.getNome());
        // Adiciona o pet à máquina
    }

    public static void removePetFromMachine() {
        petMachine.removePet();
    }

}
