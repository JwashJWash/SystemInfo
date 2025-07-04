public class main{
    public static void main(String []args){

        System.out.println("System Information");
        try {
            String nameOS = System.getProperty("os.name");
            System.out.println("Operating System name -> " + nameOS);
            String osVER = System.getProperty("os.version");
            System.out.println("OS Version -> " + osVER);
            String archOS = System.getProperty("os.arch");
            System.out.println("OS architecture -> " + archOS);
            System.out.println(System.getenv("PROCESSOR_IDENTIFIER"));
            System.out.println(System.getenv("PROCESSOR_ARCHITECTURE"));
            System.out.println(System.getenv("NUMBER_OF_PROCESSORS"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}