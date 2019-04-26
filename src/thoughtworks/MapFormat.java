package thoughtworks;

public class MapFormat {

    public static void show(int row, int col, String map){
        int start=0,end=0;
        for (int i= 0; i<row ; i++){
            start = i*col;
            if (i==0)start=0;
            end = (i+1)*col;
            if (i%2==0){

                System.out.println(map.substring(start, end));
            }else {
                StringBuffer str = new StringBuffer(map.substring(start, end));
                System.out.println(str.reverse());
            }
        }
    }
}
