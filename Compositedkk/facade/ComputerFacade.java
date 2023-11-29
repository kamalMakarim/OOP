package Compositedkk.facade;

class ComputerFacade {
    private CPU cpu = new CPU();
    private Memory memory = new Memory();
    private HardDrive hardDrive = new HardDrive();

    void startComputer() {
        cpu.start();
        memory.load();
        hardDrive.readData();
    }
}
