package lesson;

public class Method {
    public static void main(String[] args) {
        String[][] data = {
                {"1","2","3","4" },
                {"1","2","3","4" },
                {"1","2","3","4" },
                {"1","2","3","4" }


        };
        System.out.println(analysis(data));
    }
    public static int analysis( String [][] arr){
        int sym = 0;
        if (arr.length != 4){
            throw new MyArraySizeException();
        }
        for (int i = 0; i < 4 ; i ++ ){
            if (arr[i].length !=4){
                throw new MyArraySizeException();
            }
            for ( int j = 0; j < 4; j++){
                try {
                    sym += Integer.parseInt(arr[i][j]);
                }catch (NumberFormatException e){
                    throw new MyArrayDataException(i);
                }

            }
        }
        return sym;
    }
}
