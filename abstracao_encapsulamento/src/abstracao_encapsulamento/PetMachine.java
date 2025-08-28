package abstracao_encapsulamento;
public class PetMachine {

    private boolean clean = true;
    private int water = 30;
    private int shampoo = 10;
    private Pet pet;

    public void takeShowerInPet(){
        if (this.pet == null){
            System.out.println("Maquina vazia! Coloque um pet para iniciar o banho");
            return;
        }

        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.printf("O pet %s está limpo!", pet.getNome());
    }

    public void addWater(){
        if(water == 30){
            System.out.println("Tanque cheio!");
            return;
        }

        water += 2;
    }

    public void addShampoo(){
        if(shampoo == 30){
            System.out.println("Tanque cheio!");
            return;
        }

        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if (!this.clean){
            System.out.println("A maquina está suja! Limpe-a antes de adicionar um novo pet.");
            return;
        }

        if (hasPet()){
            System.out.printf("O pet %s foi adicionado à máquina de banho.\n", pet.getNome());
            return;
        }
        this.pet = pet;
    }

    public void removePet() {
        this.clean = this.pet.isClean();
        System.out.println("Pet removido da máquina de banho.");
        this.pet = null;
    }

    public void washMachine(){
        this.water -= 10;
        this.shampoo -= 2;
        this.clean = true;
        System.out.println("A máquina foi limpa com sucesso!");
    }

}