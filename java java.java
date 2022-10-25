public class Employee {
    String name;
    double salary;
    int workHours, hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if(this.salary > 1000) {
            return this.salary * 0.03;
        }else {
            return 0;
        }
    }
    int bonus() {
        if(this.workHours > 40) {
            return 30 * (this.workHours - 40);
        }else {
            return 0;
        }
    }
    double raiseSalary() {
        if(2021 - this.hireYear < 10) {
            return this.salary * 0.05;
        }else if(2021 - this.hireYear > 9 && 2021 - this.hireYear < 20) {
            return this.salary * 0.1;
        } else {
            return this.salary * 0.15;
        }
    }

    public String toString() {
        System.out.println("Adi: "+ this.name);
        System.out.println("Maasi: "+this.salary);
        System.out.println("Calisma saati: " + this.workHours);
        System.out.println("Baslangic yili: "+this.hireYear);
        double vergi = this.tax();
        int bonus = this.bonus();
        double artis = this.raiseSalary();
        System.out.println("Vergi: "+ vergi);
        System.out.println("Bonus: "+ bonus);
        System.out.println("Maas artisi: " +artis);
        System.out.println("Vergi ve bonuslar ile maas: " +(this.salary+bonus-vergi));
        System.out.println("Son maas: " +(this.salary+artis+bonus-vergi));
        return "";
    }
}
