public class client {
    public static void main(String [] args ) throws IOException{
        String hostName ="localhost"; 
        int port = 12345; 

        try (Socket Socket =new Socket (hostName; port );
        BufferedReader in =new BufferedReader(
            new InpuStreamReader (socket.getInpuntStream()))) {
                String fromServer;
                while ((fromServer = in.readLine()) !=null) {
                    System.out.println("Server:" + fromServer);
                    break;
                }
            }
    }



}