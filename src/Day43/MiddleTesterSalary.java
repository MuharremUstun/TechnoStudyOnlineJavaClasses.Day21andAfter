package Day43;

public class MiddleTesterSalary extends TesterBaseSalary {

    @Override
    int getSalary() {
        return super.getSalary() + 10_000;
    }
}
