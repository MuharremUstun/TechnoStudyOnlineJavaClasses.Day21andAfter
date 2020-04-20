package Day43;

public class JuniorTesterSalary extends TesterBaseSalary {

    @Override
    int getSalary(){
        return super.getSalary() - 50_000;
    }
}
