package Day43;

public class SeniorTesterSalary extends TesterBaseSalary {

    int getSalary(){
        return super.getSalary() +100_000;
    }
}