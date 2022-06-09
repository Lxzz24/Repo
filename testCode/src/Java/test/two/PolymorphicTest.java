package Java.test.two;

public class PolymorphicTest {
    public static void main(String[] args) {
        // 给一个有工资收入和稿费收入的小伙伴算税:
        Income[] incomes = new Income[] {
                new Salary(8000),
                new RoyaltyIncome(2000)
        };

        Person p = new Person("Frank");
        p.setIncome(incomes);
        double totalTax = p.getTotalTax();
        System.out.printf("%s's total tax is: %.2f", p.getName(), p.getTotalTax());
    }

    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income: incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}

class Person {
    protected Income[] incomes;
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setIncome(Income... incomes) {
        this.incomes = incomes;
    }

    public double getTotalTax() {
        double totalTax = 0;

        for (Income income : this.incomes) {
            totalTax += income.getTax();
        }

        return totalTax;
    }
}

interface Income {
    double getTax();
}

class Salary implements Income {
    protected double income;

    public Salary(double income) {
        this.income = income;
    }

    @Override
    public double getTax() {
        if (income <= 5000) {
            return 0;
        }
        return (income - 5000) * 0.2;
    }
}

class RoyaltyIncome implements Income {
    protected double income;

    public RoyaltyIncome(double income) {
        this.income = income;
    }

    @Override
    public double getTax() {
        return income * 0.2;//稿费收入税率是20%
    }
}