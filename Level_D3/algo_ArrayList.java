package algo_D3;

import java.io.*;
import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.toList;

class Result {

    public static int diagonalDifference(List<List<Integer>> arr) {
    	int res=0, resA=0, resB=0, n=arr.size()-1;
    	
    	for(int i=0 ; i<arr.size() ; i++) {
    		resA = resA + arr.get(i).get(i);
    		resB = resB + arr.get(i).get(n);
    		n--;
    	}
    	res = resA - resB;
    	res = Math.abs(res);
    	
    	return res;
    }

}

class algo_test {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, n).forEach(i -> {
            try {
                arr.add(
                    Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        int result = Result.diagonalDifference(arr);

    	System.out.println(result);


        bufferedReader.close();
    }
}
