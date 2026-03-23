package ex_17_OOPs;

public class Lab109_Constructor {
    public static void main(String[] args) {
        Lab106_Animals dog = new Lab106_Animals();
        MySQL a = new MySQL();
        ReadExcelFile e = new ReadExcelFile();

    }

}

class MySQL {
    MySQL() {
        System.out.println("MySQL Connected!");
    }
}

class ReadExcelFile {
    ReadExcelFile() {
        System.out.println("ExcelFile is Loaded!");
    }
}
