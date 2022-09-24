package day34ClassAndObjectsIntro.Monitor;

public class Monitor {
    public static void main(String[] args) {
        MonitorClass monitorOne = new MonitorClass(51, " MSI ", " Black ", true, 1700, 'M');
        System.out.println(monitorOne);

        System.out.println(monitorOne.ColorPlusBrand());

        monitorOne.seria();
    }
}
