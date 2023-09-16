public class Employee {
    String name;
    int salary;
    int workHours;
    int hireYear;

    Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public void tax() {
        if(this.salary >= 1000) {
            int temp = this.salary;
            System.out.println("Çalışanın Vergisi: " + (temp * 3 /100));
            temp -= (temp * 3 / 100);
            System.out.println("Vergi düşümü ile maaş: " + temp);
        }else{
            System.out.println("Çalışanın maaşı 1000 ₺ altında olduğundan vergi vermiyor.");
        }
    }

    public void bonus() {
        if(this.workHours > 40) {
            int temp = this.workHours;
            int total = 0;
            while (temp > 40) {
                total += 30;
                temp--;
            }
            System.out.println("Çalışanın Aldığı Bonus: " + total);
        }
    }

    public void raiseSalary() {
        int year = 2021;
        if(this.hireYear < year) {
            int temp = this.hireYear;
            int priority = year - temp;
            if (priority < 10 && priority > 0) {
                System.out.println("Kıdem zammı: " + (this.salary * 5 / 100));
                this.salary += (this.salary * 5 / 100);
                System.out.println("Kıdem zammı ile maaş: " + this.salary);
            }else if (priority > 9 && priority < 20) {
                System.out.println("Kıdem zammı: " + (this.salary * 10 / 100));
                this.salary += (this.salary * 10 / 100);
                System.out.println("Kıdem zammı ile maaş: " + this.salary);
            }else if (priority > 19){
                System.out.println("Kıdem zammı: " + (this.salary * 15 / 100));
                this.salary += (this.salary * 15 / 100);
                System.out.println("Kıdem zammı ile maaş: " + this.salary);
            }
        }
    }

    public void String() {
        System.out.println("Çalışanın İsmi: " + this.name);
        System.out.println("Çalışanın İşe Başlangıç Maaşı: " + this.salary);
        System.out.println("Çalışanın İşe Başlangıç Yılı: " + this.hireYear);
        System.out.println("Çalışanın Haftalık Toplam Çalışma Saati: " + this.workHours);
    }
}
