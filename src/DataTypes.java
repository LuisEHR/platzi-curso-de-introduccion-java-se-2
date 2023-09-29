public class DataTypes {
    public static void main(String[] args) {
        /*
        * byte (1 byte): -128 a 127
        * short (2 bytes): -32,768 a 32,767
        * int (4 bytes): -2,147,483,648 a 2,147,483,647
        * long (8 bytes): -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        * float (4 bytes): 3.4E +/- 38 (7 digits)
        * double (8 bytes): 1.7E +/- 308 (15 digits)
        * char (2 bytes): Rango Unicode
        * boolean (2 bytes): true, false
        * */
        byte nByte = 127;
        short nShort = 32767;
        int nInt = 1234567890;
        long nLong = 12345678901L;
        float nFloat = 123.1234567890F;
        double nDouble = 123.1234567890D;

        // Inferencia de datos (Java 10+)
        var salary = 1000;
        // Pension: 3%
        var pension = salary * 0.03;
        var totalSalary = salary - pension;
        var employeeName = "Luis Hernandez";
        System.out.println("salary = " + salary);
        System.out.println("pension = " + pension);
        System.out.println("totalSalary = " + totalSalary);
        System.out.println("employeeName = " + employeeName + ", salary = " + salary);
    }
}
