package MiniProject;

public class EmployeesInformation {
    private int empNo[] = { 1001, 1002, 1003, 1004, 1005, 1006, 1007 };
    private String empName[] = { "Ashish", "Sushma", "Rahul", "Chahat", "Ranjan" };
    private String joinDate[] = { "01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "01/01/2000",
            "12/06.2006" };
    private char designation_Code[] = { 'e', 'c', 'k', 'r', 'm', 'e', 'c' };
    private String department[] = { "R&D", "PM", "Acct", "Front Desk", "Eng", "Manufacturing", "PM" };
    private int basic[] = { 20000, 30000, 10000, 12000, 50000, 23000, 29000 };
    private int hra[] = { 8000, 12000, 8000, 6000, 20000, 9000, 12000 };
    private int it[] = { 3000, 9000, 1000, 2000, 20000, 4400, 10000 };

    public int getDa(char c) {
        switch (c) {
            case 'e':
                return 20000;
            case 'c':
                return 32000;
            case 'k':
                return 12000;
            case 'r':
                return 14000;
            case 'm':
                return 40000;
            default:
                break;
        }
        return 0;
    }

    public String getDesignaString(char s) {
        switch (s) {
            case 'e':
                return "Engineer";
            case 'c':
                return "Consultant";
            case 'k':
                return "Clerk";
            case 'r':
                return "Receptionist";
            case 'm':
                return "Manager";

            default:
                break;
        }
        return "";
    }

    public int getId(int no) {
        int index = -1;
        for (int i = 0; i < empNo.length; i++) {
            if (empNo[i] == no) {
                index = i;
            }
        }
        return index;
    }

    public String getName(int no) {
        int id = getId(no);
        return empName[id];
    }

    public String getDepart(int no) {
        int Id = getId(no);
        return department[Id];
    }

    public String getDesign(int no) {
        int Id = getId(no);
        char degin_code = designation_Code[Id];
        String design = getDesignaString(degin_code);
        return design;
    }

    public int getSalary(int no) {
        int Id = getId(no);
        int b = basic[Id];
        int h = hra[Id];
        int i = it[Id];
        char degin_code = designation_Code[Id];
        int da = getDa(degin_code);

        return (b + h + da - i);
    }

    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please Enter Employee No!");
            return;
        }
        int no = Integer.parseInt(args[0]);
        EmployeesInformation emp = new EmployeesInformation();
        if (emp.getId(no) == -1) {
            System.out.println("There is no employee with " + no + " EmpNum");
        } else {
            System.out.println(
                    "EmpNo" + "\t\t" + "EmpName" + "\t\t" + "Department" + "\t" + "Desgination" + "\t" + "Salary");
            System.out.print(no + "\t\t");
            System.out.print(emp.getName(no) + "\t\t");
            System.out.print(emp.getDepart(no) + "\t\t");
            System.out.print(emp.getDesign(no) + "\t\t");
            System.out.print(emp.getSalary(no) + "\t\t");
        }

    }

}
