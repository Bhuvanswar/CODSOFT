import java.util.Scanner;

class Student {
    public int n, tot;
    public float avg;
    public int[] s;
    String grade;

    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of subjects: ");
        n = sc.nextInt();
        s = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Enter " + (i + 1) + "th marks: ");
            s[i] = sc.nextInt();
        }
        sc.close();
    }

    public void calculate() {
        tot = 0;
        for (int i = 0; i < n; i++) {
            tot += s[i];
        }
        avg = (float) tot / n;
        
        if(avg >9 && avg<=10){
          grade="A";
        }
        else if(avg >8 && avg<=9){
          grade="B";
        }
        else if (avg >7 && avg<=8){
          grade ="C";
        }
        else if (avg >6  && avg<=7){
          grade="D";
        }
        else if (avg>5 && avg<=6){
          grade="E";
        }
        else if (avg<5){
          grade="Fail";
        }
    }

    public void display() {
        System.out.println("Total Marks: " + tot);
        System.out.println("Average: " + avg);
        System.out.println("Grade:"+grade);
    }

    public static void main(String[] arg) {
      Scanner sc=new Scanner(System.in);
      boolean again = true;
      while(again){
        Student s = new Student();
        s.calculate();
        s.display();
        System.out.print("Do you want to calculate again? (yes/no): ");
        String Again = sc.nextLine();
        again = Again.equalsIgnoreCase("yes");
      }
      sc.close();
    }
}
